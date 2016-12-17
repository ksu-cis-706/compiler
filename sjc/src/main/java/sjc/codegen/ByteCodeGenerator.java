package sjc.codegen;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.NonNullElementsOnly;
import sjc.annotation.PossiblyNull;
import sjc.annotation.ReadOnly;
import sjc.annotation.ReadOnlyElements;
import sjc.symboltable.SymbolTable;
import sjc.type.ArrayType;
import sjc.type.BooleanType;
import sjc.type.ClassType;
import sjc.type.IntType;
import sjc.type.Type;
import sjc.type.VoidType;
import sjc.type.checker.TypeTable;
import sjc.util.Pair;

/**
 * This class is used to translate a StaticJava {@link CompilationUnit} to
 * {@link ClassByteCodes} that represent a Java 1.5 class files.
 *
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class ByteCodeGenerator {
  /**
   * This class is used to signal an error in the process of generating
   * bytecode. It contains the {@link ASTNode} that causes the error.
   *
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  public static class Error extends RuntimeException {
    private static final long serialVersionUID = 2821914074630252345L;

    /**
     * Holds the {@link ASTNode} that causes this error.
     */
    public final @NonNull @ReadOnly ASTNode node;

    /**
     * Constructs an error of bytecode generation.
     *
     * @param node
     *          The {@link ASTNode} that causes this error.
     * @param msg
     *          The message that indicates the cause of this error.
     */
    public Error(@NonNull final ASTNode node, @NonNull final String msg) {
      super(msg);
      assert (msg != null) && (node != null);
      this.node = node;
    }
  }

  /**
   * The visitor for {@link ASTNode} to generate bytecodes.
   *
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  protected static class Visitor extends ASTVisitor {
    protected @NonNull ClassWriter cw;

    protected @PossiblyNull FieldVisitor fv;

    protected @PossiblyNull MethodVisitor mv;

    public @PossiblyNull String mainClassName;

    public @PossiblyNull byte[] mainClassBytes;

    protected @NonNullElements @ReadOnlyElements Map<ASTNode, Object> symbolMap;

    protected @NonNullElements @ReadOnlyElements Map<ASTNode, Type> typeMap;

    protected @NonNullElements @ReadOnlyElements Map<Object, Pair<Type, List<Type>>> methodTypeMap;

    protected @NonNull @NonNullElementsOnly List<Pair<String, Type>> localNamesTypes = new ArrayList<>();

    protected @NonNull @NonNullElementsOnly Map<String, Integer> localIndexMap = new HashMap<>();

    protected Visitor(@NonNull final SymbolTable st, @NonNull final TypeTable tt) {
      assert (st != null) && (tt != null);
      this.symbolMap = st.symbolMap;
      this.typeMap = tt.typeMap;
      this.methodTypeMap = tt.methodTypeMap;
    }

    protected void buildLocalIndexTable(final MethodDeclaration md) {
      int i = 0;
      for (final Object o : md.parameters()) {
        final SingleVariableDeclaration svd = (SingleVariableDeclaration) o;
        final String paramName = svd.getName().getIdentifier();
        this.localNamesTypes.add(new Pair<>(paramName, this.typeMap
            .get(svd)));
        this.localIndexMap.put(paramName, i);
        i++;
      }
      for (final Object o : md.getBody().statements()) {
        if (!(o instanceof VariableDeclarationStatement)) {
          break;
        }
        final VariableDeclarationStatement vds = (VariableDeclarationStatement) o;
        final VariableDeclarationFragment vdf = (VariableDeclarationFragment) vds
            .fragments().get(0);
        final String localName = vdf.getName().getIdentifier();
        this.localNamesTypes.add(new Pair<>(localName, this.typeMap
            .get(vds)));
        this.localIndexMap.put(localName, i);
        i++;
      }
    }

    @SuppressWarnings("rawtypes")
    protected int convertModifiers(final ASTNode node, final List l) {
      int result = 0;
      for (final Object o : l) {
        if (o instanceof Modifier) {
          final ModifierKeyword mk = ((Modifier) o).getKeyword();
          if (mk == ModifierKeyword.PUBLIC_KEYWORD) {
            result += Opcodes.ACC_PUBLIC;
          } else if (mk == ModifierKeyword.STATIC_KEYWORD) {
            result += Opcodes.ACC_STATIC;
          } else {
            throw new Error(node, "Unexpected modifier \'" + o + "\' in \'"
                + node.getParent() + "\'");
          }
        }
      }
      return result;
    }

    protected String convertType(final Type t) {
      if (t instanceof VoidType) {
        return "V";
      } else if (t instanceof BooleanType) {
        return "Z";
      } else if (t instanceof IntType) {
        return "I";
      } else if (t instanceof ClassType) {
        return "L" + ((ClassType) t).name.replace('.', '/') + ";";
      } else {
        return "[" + convertType(((ArrayType) t).baseType);
      }
    }

    protected void dispose() {
      this.cw = null;
      this.symbolMap = null;
      this.typeMap = null;
      this.methodTypeMap = null;
      this.localNamesTypes = null;
      this.localIndexMap = null;
      this.mainClassName = null;
      this.mainClassBytes = null;
    }

    protected void generateConstructor(final String className) {
      this.mv = this.cw.visitMethod(
          Opcodes.ACC_PUBLIC,
          "<init>",
          "()V",
          null,
          null);
      this.mv.visitCode();
      final Label l0 = new Label();
      this.mv.visitLabel(l0);
      this.mv.visitVarInsn(Opcodes.ALOAD, 0);
      this.mv.visitMethodInsn(
          Opcodes.INVOKESPECIAL,
          "java/lang/Object",
          "<init>",
          "()V",
          false);
      this.mv.visitInsn(Opcodes.RETURN);
      final Label l1 = new Label();
      this.mv.visitLabel(l1);
      this.mv
      .visitLocalVariable("this", "L" + className + ";", null, l0, l1, 0);
      this.mv.visitMaxs(1, 1);
      this.mv.visitEnd();
    }

    protected void generateIntConst(final int i) {
      switch (i) {
        case -1:
          this.mv.visitInsn(Opcodes.ICONST_M1);
          break;
        case 0:
          this.mv.visitInsn(Opcodes.ICONST_0);
          break;
        case 1:
          this.mv.visitInsn(Opcodes.ICONST_1);
          break;
        case 2:
          this.mv.visitInsn(Opcodes.ICONST_2);
          break;
        case 3:
          this.mv.visitInsn(Opcodes.ICONST_3);
          break;
        case 4:
          this.mv.visitInsn(Opcodes.ICONST_4);
          break;
        case 5:
          this.mv.visitInsn(Opcodes.ICONST_5);
          break;
        default:
          if ((i >= Byte.MIN_VALUE) && (i <= Byte.MAX_VALUE)) {
            this.mv.visitIntInsn(Opcodes.BIPUSH, i);
          } else if ((i >= Short.MIN_VALUE) && (i <= Short.MAX_VALUE)) {
            this.mv.visitIntInsn(Opcodes.SIPUSH, i);
          } else {
            this.mv.visitLdcInsn(i);
          }
      }
    }

    protected void generateRelationalCode(final int opcode) {
      final Label thenLabel = new Label();
      final Label endLabel = new Label();
      this.mv.visitJumpInsn(opcode, thenLabel);
      this.mv.visitInsn(Opcodes.ICONST_0);
      this.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
      this.mv.visitLabel(thenLabel);
      this.mv.visitInsn(Opcodes.ICONST_1);
      this.mv.visitLabel(endLabel);
    }

    protected String getMethodDescriptor(final Type returnType,
        final List<Type> parameterTypes) {
      final StringBuilder sb = new StringBuilder();
      sb.append('(');
      for (final Type t : parameterTypes) {
        sb.append(convertType(t));
      }
      sb.append(')');
      sb.append(convertType(returnType));
      return sb.toString();
    }

    @Override
    public boolean visit(final Assignment node) {
      node.getRightHandSide().accept(this);
      final ASTNode lhsNode = node.getLeftHandSide();
      final String varName = ((SimpleName) lhsNode).getIdentifier();
      final Object lhsDecl = this.symbolMap.get(lhsNode);
      if (lhsDecl instanceof FieldDeclaration) {
        final FieldDeclaration fd = (FieldDeclaration) lhsDecl;
        final String className = ((TypeDeclaration) fd.getParent()).getName()
            .getIdentifier();
        this.mv.visitFieldInsn(
            Opcodes.PUTSTATIC,
            className,
            varName,
            convertType(this.typeMap.get(fd)));
      } else {
        this.mv.visitVarInsn(Opcodes.ISTORE, this.localIndexMap.get(varName));
      }
      return false;
    }

    @Override
    public boolean visit(final BooleanLiteral node) {
      if (node.booleanValue()) {
        this.mv.visitInsn(Opcodes.ICONST_1);
      } else {
        this.mv.visitInsn(Opcodes.ICONST_0);
      }
      return false;
    }

    @Override
    public boolean visit(final ExpressionStatement node) {
      final Expression e = node.getExpression();
      e.accept(this);
      final Type t = this.typeMap.get(e);
      if ((t == null) || (t instanceof VoidType)) {
        // skip
      } else {
        this.mv.visitInsn(Opcodes.POP);
      }
      return false;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
      final int modifiers = convertModifiers(node, node.modifiers());
      final VariableDeclarationFragment vdf = (VariableDeclarationFragment) node
          .fragments().get(0);
      this.cw.visitField(
          modifiers,
          vdf.getName().getIdentifier(),
          convertType(this.typeMap.get(node)),
          null,
          null).visitEnd();

      return false;
    }

    @Override
    public boolean visit(final IfStatement node) {
      final Label elseOrEndLabel = new Label();
      node.getExpression().accept(this);
      this.mv.visitJumpInsn(Opcodes.IFEQ, elseOrEndLabel);
      node.getThenStatement().accept(this);
      final Block elseBlock = (Block) node.getElseStatement();
      if (elseBlock == null) {
        this.mv.visitLabel(elseOrEndLabel);
      } else {
        final Label endLabel = new Label();
        this.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        this.mv.visitLabel(elseOrEndLabel);
        elseBlock.accept(this);
        this.mv.visitLabel(endLabel);
      }
      return false;
    }

    @Override
    public boolean visit(final InfixExpression node) {
      final InfixExpression.Operator op = node.getOperator();
      node.getLeftOperand().accept(this);
      if (op == InfixExpression.Operator.CONDITIONAL_AND) {
        this.mv.visitInsn(Opcodes.DUP);
        final Label falseLabel = new Label();
        this.mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
        this.mv.visitInsn(Opcodes.POP);
        node.getRightOperand().accept(this);
        this.mv.visitLabel(falseLabel);
      } else if (op == InfixExpression.Operator.CONDITIONAL_OR) {
        this.mv.visitInsn(Opcodes.DUP);
        final Label trueLabel = new Label();
        this.mv.visitJumpInsn(Opcodes.IFNE, trueLabel);
        this.mv.visitInsn(Opcodes.POP);
        node.getRightOperand().accept(this);
        this.mv.visitLabel(trueLabel);
      } else {
        node.getRightOperand().accept(this);
        if (op == InfixExpression.Operator.PLUS) {
          this.mv.visitInsn(Opcodes.IADD);
        } else if (op == InfixExpression.Operator.MINUS) {
          this.mv.visitInsn(Opcodes.ISUB);
        } else if (op == InfixExpression.Operator.TIMES) {
          this.mv.visitInsn(Opcodes.IMUL);
        } else if (op == InfixExpression.Operator.DIVIDE) {
          this.mv.visitInsn(Opcodes.IDIV);
        } else if (op == InfixExpression.Operator.REMAINDER) {
          this.mv.visitInsn(Opcodes.IREM);
        } else if (op == InfixExpression.Operator.GREATER) {
          generateRelationalCode(Opcodes.IF_ICMPGT);
        } else if (op == InfixExpression.Operator.GREATER_EQUALS) {
          generateRelationalCode(Opcodes.IF_ICMPGE);
        } else if (op == InfixExpression.Operator.EQUALS) {
          generateRelationalCode(Opcodes.IF_ICMPEQ);
        } else if (op == InfixExpression.Operator.NOT_EQUALS) {
          generateRelationalCode(Opcodes.IF_ICMPNE);
        } else if (op == InfixExpression.Operator.LESS) {
          generateRelationalCode(Opcodes.IF_ICMPLT);
        } else if (op == InfixExpression.Operator.LESS_EQUALS) {
          generateRelationalCode(Opcodes.IF_ICMPLE);
        }
      }
      return false;
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
      final String methodName = node.getName().getIdentifier();
      final int modifiers = convertModifiers(node, node.modifiers());
      final Pair<Type, List<Type>> methodType = this.methodTypeMap.get(node);
      final String methodDesc = getMethodDescriptor(
          methodType.first,
          methodType.second);
      this.mv = this.cw.visitMethod(
          modifiers,
          methodName,
          methodDesc,
          null,
          null);
      this.mv.visitCode();
      final Label initLabel = new Label();
      this.mv.visitLabel(initLabel);

      buildLocalIndexTable(node);

      Statement lastStatement = null;
      for (final Object o : node.getBody().statements()) {
        if (!(o instanceof VariableDeclarationStatement)) {
          ((ASTNode) o).accept(this);
        }
        lastStatement = (Statement) o;
      }

      // TODO: this is a hack, we need an analysis to see whether we need
      // a return statement or not.
      if (!(lastStatement instanceof ReturnStatement)) {
        if (methodType.first instanceof VoidType) {
          this.mv.visitInsn(Opcodes.RETURN);
        }
      }

      final Label endLabel = new Label();
      this.mv.visitLabel(endLabel);

      int i = 0;
      for (final Pair<String, Type> p : this.localNamesTypes) {
        this.mv.visitLocalVariable(
            p.first,
            convertType(p.second),
            null,
            initLabel,
            endLabel,
            i);
        i++;
      }

      this.mv.visitMaxs(0, 0);
      this.mv.visitEnd();

      this.localNamesTypes.clear();
      this.localIndexMap.clear();
      return false;
    }

    @Override
    public boolean visit(final MethodInvocation node) {
      for (final Object o : node.arguments()) {
        ((ASTNode) o).accept(this);
      }
      final Object o = this.symbolMap.get(node);
      if (o instanceof MethodDeclaration) {
        final MethodDeclaration md = (MethodDeclaration) o;
        final String className = ((TypeDeclaration) md.getParent()).getName()
            .getIdentifier();
        final String methodName = node.getName().getIdentifier();
        final Pair<Type, List<Type>> p = this.methodTypeMap.get(md);
        this.mv.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            className,
            methodName,
            getMethodDescriptor(p.first, p.second),
            false);
      } else if (o instanceof Method) {
        final Method m = (Method) o;
        final String className = m.getDeclaringClass().getName()
            .replace('.', '/');
        final String methodName = m.getName();
        final Pair<Type, List<Type>> p = this.methodTypeMap.get(m);
        this.mv.visitMethodInsn(
            Opcodes.INVOKESTATIC,
            className,
            methodName,
            getMethodDescriptor(p.first, p.second),
            false);
      }
      return false;
    }

    @Override
    public boolean visit(final NumberLiteral node) {
      generateIntConst(Integer.parseInt(node.getToken()));
      return false;
    }

    @Override
    public boolean visit(final PrefixExpression node) {
      node.getOperand().accept(this);
      final PrefixExpression.Operator op = node.getOperator();
      if (op == PrefixExpression.Operator.PLUS) {
        // do nothing
      } else if (op == PrefixExpression.Operator.MINUS) {
        this.mv.visitInsn(Opcodes.INEG);
      } else if (op == PrefixExpression.Operator.NOT) {
        final Label falseLabel = new Label();
        final Label endLabel = new Label();
        this.mv.visitJumpInsn(Opcodes.IFEQ, falseLabel);
        this.mv.visitInsn(Opcodes.ICONST_0);
        this.mv.visitJumpInsn(Opcodes.GOTO, endLabel);
        this.mv.visitLabel(falseLabel);
        this.mv.visitInsn(Opcodes.ICONST_1);
        this.mv.visitLabel(endLabel);
      }
      return false;
    }

    @Override
    public boolean visit(final ReturnStatement node) {
      final Expression e = node.getExpression();
      if (e == null) {
        this.mv.visitInsn(Opcodes.RETURN);
      } else {
        e.accept(this);
        this.mv.visitInsn(Opcodes.IRETURN);
      }
      return false;
    }

    @Override
    public boolean visit(final SimpleName node) {
      final ASTNode parent = node.getParent();
      if ((parent instanceof Expression) || (parent instanceof Statement)) {
        final String varName = node.getIdentifier();
        final Object decl = this.symbolMap.get(node);
        if (decl instanceof FieldDeclaration) {
          final FieldDeclaration fd = (FieldDeclaration) decl;
          final String className = ((TypeDeclaration) fd.getParent()).getName()
              .getIdentifier();
          this.mv.visitFieldInsn(
              Opcodes.GETSTATIC,
              className,
              varName,
              convertType(this.typeMap.get(fd)));
        } else {
          final Type t = this.typeMap.get(node);
          if ((t instanceof IntType) || (t instanceof BooleanType)) {
            this.mv.visitVarInsn(Opcodes.ILOAD, this.localIndexMap.get(varName));
          } else {
            this.mv.visitVarInsn(Opcodes.ALOAD, this.localIndexMap.get(varName));
          }
        }
      }
      return false;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
      this.mainClassName = node.getName().getIdentifier();
      this.cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES
          | ClassWriter.COMPUTE_MAXS);
      this.cw.visit(
          Opcodes.V1_5,
          Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
          this.mainClassName,
          null,
          "java/lang/Object",
          null);
      this.cw.visitSource(null, null);
      generateConstructor(this.mainClassName);
      for (final Object o : node.bodyDeclarations()) {
        ((ASTNode) o).accept(this);
      }
      this.cw.visitEnd();
      this.mainClassBytes = this.cw.toByteArray();
      this.cw = null;
      return false;
    }

    @Override
    public boolean visit(final WhileStatement node) {
      final Label loopLabel = new Label();
      final Label endLabel = new Label();
      this.mv.visitLabel(loopLabel);
      node.getExpression().accept(this);
      this.mv.visitJumpInsn(Opcodes.IFEQ, endLabel);
      node.getBody().accept(this);
      this.mv.visitJumpInsn(Opcodes.GOTO, loopLabel);
      this.mv.visitLabel(endLabel);
      return false;
    }
  }

  /**
   * Generates a {@link ClassByteCodes} that represents the class files for the
   * given StaticJava {@link CompilationUnit} with the given {@link SymbolTable}
   * and {@link TypeTable}.
   *
   * @param cu
   *          The StaticJava {@link CompilationUnit}.
   * @param st
   *          The {@link SymbolTable} of the {@link CompilationUnit}.
   * @param tt
   *          The {@link TypeTable} of the {@link CompilationUnit}.
   * @return The {@link ClassByteCodes} that represents the class files for the
   *         given StaticJava {@link CompilationUnit} with the given
   *         {@link SymbolTable} and {@link TypeTable}.
   * @throws ByteCodeGenerator.Error
   *           If the generator encounter unexpected error.
   */
  public static @NonNull ClassByteCodes generate(
      @NonNull final CompilationUnit cu, @NonNull final SymbolTable st,
      @NonNull final TypeTable tt) throws ByteCodeGenerator.Error {
    assert (cu != null) && (st != null) && (tt != null);

    final Visitor v = new Visitor(st, tt);
    cu.accept(v);
    final ClassByteCodes result = new ClassByteCodes(v.mainClassName,
        v.mainClassBytes);
    v.dispose();
    return result;
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected ByteCodeGenerator() {
  }
}
