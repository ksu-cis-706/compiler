package sjc.type.checker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationStatement;
import org.eclipse.jdt.core.dom.WhileStatement;

import sjc.annotation.NonNull;
import sjc.annotation.NonNullElements;
import sjc.annotation.ReadOnly;
import sjc.symboltable.SymbolTable;
import sjc.type.ArrayType;
import sjc.type.BaseType;
import sjc.type.ClassType;
import sjc.type.Type;
import sjc.type.TypeFactory;
import sjc.util.Pair;

/**
 * This class is used to type check a StaticJava {@link CompilationUnit} with a
 * given {@link SymbolTable}.
 * 
 * @author <a href="mailto:robby@ksu.edu">Robby</a>
 */
public class TypeChecker {
  /**
   * This class is used to signal an error in the process of type checking. It
   * contains the {@link ASTNode} that causes the error.
   * 
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  public static class Error extends RuntimeException {
    private static final long serialVersionUID = 5322515711212690043L;
    
    /**
     * Holds the {@link ASTNode} that causes this error.
     */
    public final @NonNull
    @ReadOnly
    ASTNode node;

    /**
     * Constructs an error from a type checker.
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
   * The visitor for {@link ASTNode} to type check a StaticJava
   * {@link CompilationUnit}.
   * 
   * @author <a href="mailto:robby@ksu.edu">Robby</a>
   */
  protected static class Visitor extends ASTVisitor {
    /**
     * Holds the symbol map of the StaticJava {@link CompilationUnit}.
     */
    protected @NonNullElements
    Map<ASTNode, Object> symbolMap;

    /**
     * Holds a map of {@link ASTNode} to its {@link Type}.
     */
    public @NonNullElements
    Map<ASTNode, Type> resultTypeMap;

    /**
     * Holds a map of {@link MethodDeclaration} to its return {@link Type} and
     * its parameter {@link Type}s.
     */
    public @NonNullElements
    Map<Object, Pair<Type, List<Type>>> resultMethodTypeMap;

    /**
     * The {@link TypeFactory}.
     */
    protected @NonNull
    TypeFactory tf;

    /**
     * Holds the string {@link ArrayType}.
     */
    protected @NonNull
    ArrayType stringArrayType;

    /**
     * Holds the main class of this StaticJava {@link CompilationUnit}.
     */
    protected String className;

    /**
     * Holds a method's return {@link Type}.
     */
    protected Type methodReturnType = null;

    /**
     * Holds an expression's {@link Type}.
     */
    protected Type resultingType = null;

    /**
     * Constructs a visitor to type check a StaticJava {@link CompilationUnit}
     * with the given {@link SymbolTable} and the given {@link TypeFactory}.
     * 
     * @param tf
     *          The {@link TypeFactory}.
     * @param st
     *          The {@link SymbolTable} for the {@link CompilationUnit}.
     */
    protected Visitor(@NonNull final TypeFactory tf,
        @NonNull final SymbolTable st) {
      this.tf = tf;
      this.symbolMap = st.symbolMap;
      this.resultTypeMap = new HashMap<>();
      this.resultMethodTypeMap = new HashMap<>();
      this.stringArrayType = tf.getArrayType(tf
          .getClassType("java.lang.String"));
    }

    protected Type convertType(final ASTNode node,
        @SuppressWarnings("rawtypes") final Class c) {
      if (c == void.class) {
        return this.tf.Void;
      }
      if (c == boolean.class) {
        return this.tf.Boolean;
      } else if (c == int.class) {
        return this.tf.Int;
      } else if (c == String[].class) {
        return this.stringArrayType;
      } else if (c.isPrimitive()) {
        throw new Error(null, "Unexpected primitive type (Class): \'"
            + c.getName() + "\'");
      } else if (!c.isArray()) {
        return this.tf.getClassType(c.getName());
      } else {
        return this.tf.getArrayType((BaseType) convertType(
            node,
            c.getComponentType()));
      }
    }

    protected Type convertType(final ASTNode node,
        final org.eclipse.jdt.core.dom.Type t) {
      if (t instanceof PrimitiveType) {
        final PrimitiveType.Code ptc = ((PrimitiveType) t)
            .getPrimitiveTypeCode();
        if (ptc == PrimitiveType.BOOLEAN) {
          return this.tf.Boolean;
        } else if (ptc == PrimitiveType.INT) {
          return this.tf.Int;
        } else if (ptc == PrimitiveType.VOID) {
          return this.tf.Void;
        }
      } else if (t instanceof SimpleType) {
        final SimpleType st = (SimpleType) t;
        final String name = st.getName().getFullyQualifiedName();
        if ("String".equals(name)
            || "java.lang.String".equals(name)) {
          return this.stringArrayType.baseType;
        }
      } else if (t instanceof org.eclipse.jdt.core.dom.ArrayType) {
        final org.eclipse.jdt.core.dom.ArrayType at = (org.eclipse.jdt.core.dom.ArrayType) t;
        final BaseType bt = (BaseType) convertType(node, at.getElementType());
        return this.tf.getArrayType(bt);
      }
      throw new Error(null, "Unexpected Type: \'" + t + "\'");
    }

    @SuppressWarnings("rawtypes")
    protected Class convertType(final ASTNode node, final Type t) {
      if (t == this.tf.Void) {
        return void.class;
      } else if (t == this.tf.Boolean) {
        return boolean.class;
      } else if (t == this.tf.Int) {
        return int.class;
      } else if (t == this.stringArrayType) {
        return String[].class;
      } else if (t instanceof ClassType) {
        try {
          return Class.forName(((ClassType) t).name);
        } catch (final ClassNotFoundException e) {
          throw new Error(node, "Unresolvable Type: \'" + t + "\'");
        }
      } else if (t instanceof ArrayType) {
        final ArrayType at = (ArrayType) t;
        final BaseType bt = at.baseType;
        if (bt == this.tf.Boolean) {
          return boolean[].class;
        } else if (bt == this.tf.Int) {
          return int[].class;
        } else if (bt instanceof ClassType) {
          try {
            return Class.forName("[L" + ((ClassType) bt).name + ";");
          } catch (final ClassNotFoundException e) {
            throw new Error(node, "Unresolvable Type: \'" + t + "\'");
          }
        } else {
          throw new Error(node, "Unexpected BaseType: \'" + t + "\'");
        }
      } else {
        throw new Error(node, "Unexpected Type: \'" + t + "\'");
      }
    }

    protected void dispose() {
      this.symbolMap = null;
      this.resultTypeMap = null;
      this.tf = null;
      this.stringArrayType = null;
      this.className = null;
      this.methodReturnType = null;
      this.resultingType = null;
    }

    protected Type getResult() {
      final Type result = this.resultingType;
      this.resultingType = null;
      return result;
    }

    @SuppressWarnings("unchecked")
    protected Method resolveMethod(final MethodInvocation node,
        final String className, final String methodName, final Type[] argTypes) {
      try {
        final int numOfArgs = argTypes.length;
        @SuppressWarnings("rawtypes")
        final Class[] paramTypes = new Class[numOfArgs];
        for (int i = 0; i < numOfArgs; i++) {
          paramTypes[i] = convertType(node, argTypes[i]);
        }
        @SuppressWarnings("rawtypes")
        final Class c = Class.forName(className);
        final Method m = c.getMethod(methodName, paramTypes);
        this.symbolMap.put(node, m);
        return m;
      } catch (final ClassNotFoundException e) {
        throw new Error(node, "Unresolvable class \"" + className + "\"");
      } catch (final SecurityException | NoSuchMethodException e) {
        throw new Error(node, "Unresolvable method \"" + className + "."
            + methodName + "\"");
      }
    }

    protected void setResult(final Expression e, final Type t) {
      assert t != null;
      this.resultTypeMap.put(e, t);
      this.resultingType = t;
    }

    protected void typeCheckMethodInvocation(final MethodInvocation node,
        final String className, final String methodName, final Type[] argTypes,
        final Method m) {
      @SuppressWarnings("rawtypes")
      final Class[] paramTypeClasses = m.getParameterTypes();
      final int numOfParams = paramTypeClasses.length;
      if (argTypes.length != numOfParams) {
        throw new Error(node, "Wrong number of arguments to invoke method \""
            + methodName + "\" in \"" + node + "\"");
      }
      final List<Type> paramTypes = new ArrayList<>();
      for (int i = 0; i < numOfParams; i++) {
        final Type t = convertType(node, paramTypeClasses[i]);
        if (t != argTypes[i]) {
          throw new Error(node, "Type mismatch the " + i + " argument in \""
              + node + "\"");
        }
        paramTypes.add(t);
      }
      final Type returnType = convertType(node, m.getReturnType());
      if (!this.resultMethodTypeMap.containsKey(m)) {
        this.resultMethodTypeMap.put(m, new Pair<>(returnType,
            paramTypes));
      }
      setResult(node, returnType);
    }

    protected void typeCheckMethodInvocation(final MethodInvocation node,
        final String className, final String methodName, final Type[] argTypes,
        final MethodDeclaration md) {
      final int numOfParams = md.parameters().size();
      if (argTypes.length != numOfParams) {
        throw new Error(node, "Wrong number of arguments to invoke method \""
            + methodName + "\" in \"" + node + "\"");
      }
      for (int i = 0; i < numOfParams; i++) {
        final Type t = convertType(node, ((SingleVariableDeclaration) md
            .parameters().get(i)).getType());
        if (t != argTypes[i]) {
          throw new Error(node, "Type mismatch the " + i + " argument in \""
              + node + "\"");
        }
      }
      final Type returnType = convertType(node, md.getReturnType2());
      setResult(node, returnType);
    }

    @Override
    public boolean visit(final Assignment node) {
      node.getLeftHandSide().accept(this);
      final Type lhsType = getResult();
      node.getRightHandSide().accept(this);
      final Type rhsType = getResult();
      if (lhsType != rhsType) {
        throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
            + " = " + rhsType);
      }
      // no need to set the type result for assignments since
      // assignments in StaticJava are statements,
      // i.e., they are evaluated for their side-effects.
      return false;
    }

    @Override
    public boolean visit(final BooleanLiteral node) {
      setResult(node, this.tf.Boolean);
      return false;
    }

    @Override
    public boolean visit(final ExpressionStatement node) {
      final Expression e = node.getExpression();
      e.accept(this);
      if (e instanceof Assignment) {
        // assignment should not have a resulting type.
        assert getResult() == null;
      } else if (node.getExpression() instanceof MethodInvocation) {
        // method invocation's result can be any type (including void)
        // so we can ignore it.
        getResult();
      } else {
        throw new Error(node, "Unexpected SimpleName: \'" + node + "\'");
      }
      return false;
    }

    @Override
    public boolean visit(final FieldDeclaration node) {
      this.resultTypeMap.put(node, convertType(node, node.getType()));
      return false;
    }

    @Override
    public boolean visit(final IfStatement node) {
      node.getExpression().accept(this);
      if (getResult() != this.tf.Boolean) {
        throw new Error(node,
            "Expecting a boolean type expression as the condition of an if-statement: \""
                + node.getExpression() + "\"");
      }
      node.getThenStatement().accept(this);
      node.getElseStatement().accept(this);
      return false;
    }

    @Override
    public boolean visit(final InfixExpression node) {
      node.getLeftOperand().accept(this);
      final Type lhsType = getResult();
      node.getRightOperand().accept(this);
      final Type rhsType = getResult();
      final InfixExpression.Operator op = node.getOperator();
      if ((op == InfixExpression.Operator.TIMES)
          || (op == InfixExpression.Operator.DIVIDE)
          || (op == InfixExpression.Operator.REMAINDER)
          || (op == InfixExpression.Operator.PLUS)
          || (op == InfixExpression.Operator.MINUS)) {
        if (lhsType != this.tf.Int) {
          throw new Error(node,
              "Expecting an int type expression as the left-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        if (rhsType != this.tf.Int) {
          throw new Error(node,
              "Expecting an int type expression as the right-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Int);
      } else if ((op == InfixExpression.Operator.LESS)
          || (op == InfixExpression.Operator.GREATER)
          || (op == InfixExpression.Operator.LESS_EQUALS)
          || (op == InfixExpression.Operator.GREATER_EQUALS)) {
        if (lhsType != this.tf.Int) {
          throw new Error(node,
              "Expecting an int type expression as the left-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        if (rhsType != this.tf.Int) {
          throw new Error(node,
              "Expecting an int type expression as the right-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Boolean);
      } else if ((op == InfixExpression.Operator.CONDITIONAL_AND)
          || (op == InfixExpression.Operator.CONDITIONAL_OR)) {
        if (lhsType != this.tf.Boolean) {
          throw new Error(node,
              "Expecting a boolean type expression as the left-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        if (rhsType != this.tf.Boolean) {
          throw new Error(node,
              "Expecting a boolean type expression as the right-hand operand of \""
                  + op + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Boolean);
      } else if ((op == InfixExpression.Operator.EQUALS)
          || (op == InfixExpression.Operator.NOT_EQUALS)) {
        if (lhsType != rhsType) {
          throw new Error(node, "Type mismatch in \"" + node + "\": " + lhsType
              + " " + op + " " + rhsType);
        }
        setResult(node, this.tf.Boolean);
      } else {
        throw new Error(node, "Unexpected InfixExpression: \'" + node + "\'");
      }
      return false;
    }

    @Override
    public boolean visit(final MethodDeclaration node) {
      this.methodReturnType = convertType(node, node.getReturnType2());
      final List<Type> paramTypes = new ArrayList<>();
      for (final Object o : node.parameters()) {
        final SingleVariableDeclaration sdv = (SingleVariableDeclaration) o;
        final Type t = convertType(node, sdv.getType());
        paramTypes.add(t);
        this.resultTypeMap.put(sdv, t);
      }
      this.resultMethodTypeMap.put(node, new Pair<>(
          this.methodReturnType, paramTypes));
      node.getBody().accept(this);
      this.methodReturnType = null;
      return false;
    }

    @Override
    public boolean visit(final MethodInvocation node) {
      // note that we don't visit the MethodInvocation's simple name
      // because we want visit(SimpleName) to resolve variable references
      // instead of method names
      final String className = node.getExpression() == null ? this.className
          : ((SimpleName) node.getExpression()).getIdentifier();
      final String methodName = node.getName().getIdentifier();
      final int numOfArgs = node.arguments().size();
      final Type[] argTypes = new Type[numOfArgs];
      for (int i = 0; i < numOfArgs; i++) {
        ((Expression) node.arguments().get(i)).accept(this);
        argTypes[i] = getResult();
      }
      final Object o = this.symbolMap.get(node);
      if ((o == null) || (o instanceof Method)) {
        final Method m = o == null ? resolveMethod(
            node,
            className,
            methodName,
            argTypes) : (Method) o;
        typeCheckMethodInvocation(node, className, methodName, argTypes, m);
      } else {
        typeCheckMethodInvocation(
            node,
            className,
            methodName,
            argTypes,
            (MethodDeclaration) o);
      }
      return false;
    }

    @Override
    public boolean visit(final NumberLiteral node) {
      setResult(node, this.tf.Int);
      return false;
    }

    @Override
    public boolean visit(final ParenthesizedExpression node) {
      node.getExpression().accept(this);
      setResult(node, getResult());
      return false;
    }

    @Override
    public boolean visit(final PrefixExpression node) {
      node.getOperand().accept(this);
      final Type t = getResult();
      final PrefixExpression.Operator op = node.getOperator();
      if ((op == PrefixExpression.Operator.PLUS)
          || (op == PrefixExpression.Operator.MINUS)) {
        if (t != this.tf.Int) {
          throw new Error(node,
              "Expecting an int type expression as the operand of \"" + op
                  + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Int);
      } else if (op == PrefixExpression.Operator.NOT) {
        if (t != this.tf.Boolean) {
          throw new Error(node,
              "Expecting a boolean type expression as the operand of \"" + op
                  + "\" in \"" + node + "\"");
        }
        setResult(node, this.tf.Boolean);
      } else {
        throw new Error(node, "Unexpected PrefixExpression: \'" + node + "\'");
      }
      return false;
    }

    @Override
    public boolean visit(final ReturnStatement node) {
      final Expression e = node.getExpression();
      if ((this.methodReturnType == this.tf.Void) && (e != null)) {
        throw new Error(node, "Unexpected return's expression in \"" + node
            + "\"");
      } else if ((this.methodReturnType != this.tf.Void) && (e == null)) {
        throw new Error(node, "Expecting a return's expression in \"" + node
            + "\"");
      } else if ((this.methodReturnType != this.tf.Void) && (e != null)) {
        e.accept(this);
        final Type t = getResult();
        if (t != this.methodReturnType) {
          throw new Error(node, "Expecting " + this.methodReturnType.name
              + " return expression in \"" + node + "\"");
        }
      }
      return false;
    }

    @Override
    public boolean visit(final SimpleName node) {
      final ASTNode parent = node.getParent();
      if ((parent instanceof Expression) || (parent instanceof Statement)) {
        final Object o = this.symbolMap.get(node);
        if (o instanceof FieldDeclaration) {
          final FieldDeclaration fd = (FieldDeclaration) o;
          setResult(node, convertType(node, fd.getType()));
        } else if (o instanceof SingleVariableDeclaration) {
          final SingleVariableDeclaration svd = (SingleVariableDeclaration) o;
          setResult(node, convertType(node, svd.getType()));
        } else if (o instanceof VariableDeclarationStatement) {
          final VariableDeclarationStatement vds = (VariableDeclarationStatement) o;
          setResult(node, convertType(node, vds.getType()));
        } else {
          throw new Error(node, "Unexpected SimpleName: \'" + node + "\'");
        }
      }
      return false;
    }

    @Override
    public boolean visit(final TypeDeclaration node) {
      this.className = node.getName().getIdentifier();
      this.resultTypeMap.put(node, this.tf.getClassType(this.className));
      return super.visit(node);
    }

    @Override
    public boolean visit(final VariableDeclarationStatement node) {
      this.resultTypeMap.put(node, convertType(node, node.getType()));
      return false;
    }

    @Override
    public boolean visit(final WhileStatement node) {
      node.getExpression().accept(this);
      final Type t = getResult();
      if (t != this.tf.Boolean) {
        throw new Error(node,
            "Expecting a boolean type expression as the condition of a while-statement: \""
                + node.getExpression() + "\"");
      }
      node.getBody().accept(this);
      return false;
    }
  }

  /**
   * Type checks a StaticJava {@link CompilationUnit} with the given
   * {@link SymbolTable} and the given {@link TypeFactory}. It also resolves
   * {@link MethodInvocation} of library call (and put its mapping in the
   * {@link SymbolTable}).
   * 
   * @param tf
   *          The {@link TypeFactory}.
   * @param cu
   *          The StaticJava {@link CompilationUnit}.
   * @param symbolTable
   *          The {@link SymbolTable} of the {@link CompilationUnit}
   * @return The {@link TypeTable}.
   * @throws TypeChecker.Error
   *           If the type checker encounter type error in the
   *           {@link CompilationUnit}.
   */
  public static @NonNull
  TypeTable check(@NonNull final TypeFactory tf,
      @NonNull final CompilationUnit cu, @NonNull final SymbolTable symbolTable)
      throws TypeChecker.Error {
    assert (tf != null) && (cu != null) && (symbolTable != null);

    final Visitor v = new Visitor(tf, symbolTable);
    cu.accept(v);
    final TypeTable result = new TypeTable(v.resultTypeMap,
        v.resultMethodTypeMap);
    v.dispose();
    return result;
  }

  /**
   * Declared as protected to disallow creation of this object outside from the
   * methods of this class.
   */
  protected TypeChecker() {
  }
}
