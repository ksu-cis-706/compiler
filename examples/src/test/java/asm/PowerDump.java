package asm;

import java.io.PrintWriter;

import org.junit.Test;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.util.TraceClassVisitor;

public class PowerDump
implements Opcodes {
  public static byte[] dump() throws Exception {
    final ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
    MethodVisitor mv;

    cw.visit(
        Opcodes.V1_5,
        Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
        "Power",
        null,
        "java/lang/Object",
        null);

    cw.visitSource("Power.java", null);

    {
      mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
      mv.visitCode();
      final Label l0 = new Label();
      mv.visitLabel(l0);
      mv.visitLineNumber(1, l0);
      mv.visitVarInsn(Opcodes.ALOAD, 0);
      mv.visitMethodInsn(
          Opcodes.INVOKESPECIAL,
          "java/lang/Object",
          "<init>",
          "()V",
          false);
      mv.visitInsn(Opcodes.RETURN);
      final Label l1 = new Label();
      mv.visitLabel(l1);
      mv.visitLocalVariable("this", "LPower;", null, l0, l1, 0);
      mv.visitMaxs(1, 1);
      mv.visitEnd();
    }
    {
      mv = cw.visitMethod(
          Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
          "main",
          "([Ljava/lang/String;)V",
          null,
          null);
      mv.visitCode();
      final Label l0 = new Label();
      mv.visitLabel(l0);
      mv.visitLineNumber(5, l0);
      mv.visitVarInsn(Opcodes.ALOAD, 0);
      mv.visitInsn(Opcodes.ICONST_0);
      mv.visitMethodInsn(
          Opcodes.INVOKESTATIC,
          "StaticJavaLib",
          "getIntArgument",
          "([Ljava/lang/String;I)I",
          false);
      final Label l1 = new Label();
      mv.visitLabel(l1);
      mv.visitLineNumber(6, l1);
      mv.visitVarInsn(Opcodes.ALOAD, 0);
      mv.visitInsn(Opcodes.ICONST_1);
      mv.visitMethodInsn(
          Opcodes.INVOKESTATIC,
          "StaticJavaLib",
          "getIntArgument",
          "([Ljava/lang/String;I)I",
          false);
      final Label l2 = new Label();
      mv.visitLabel(l2);
      mv.visitLineNumber(5, l2);
      mv.visitMethodInsn(Opcodes.INVOKESTATIC, "Power", "power", "(II)I", false);
      mv.visitMethodInsn(
          Opcodes.INVOKESTATIC,
          "StaticJavaLib",
          "println",
          "(I)V",
          false);
      final Label l3 = new Label();
      mv.visitLabel(l3);
      mv.visitLineNumber(7, l3);
      mv.visitInsn(Opcodes.RETURN);
      final Label l4 = new Label();
      mv.visitLabel(l4);
      mv.visitLocalVariable("args", "[Ljava/lang/String;", null, l0, l4, 0);
      mv.visitMaxs(3, 1);
      mv.visitEnd();
    }
    {
      mv = cw.visitMethod(Opcodes.ACC_STATIC, "power", "(II)I", null, null);
      mv.visitCode();
      final Label l0 = new Label();
      mv.visitLabel(l0);
      mv.visitLineNumber(14, l0);
      mv.visitVarInsn(Opcodes.ILOAD, 1);
      mv.visitInsn(Opcodes.ICONST_1);
      final Label l1 = new Label();
      mv.visitJumpInsn(Opcodes.IF_ICMPLT, l1);
      mv.visitInsn(Opcodes.ICONST_1);
      final Label l2 = new Label();
      mv.visitJumpInsn(Opcodes.GOTO, l2);
      mv.visitLabel(l1);
      mv.visitInsn(Opcodes.ICONST_0);
      mv.visitLabel(l2);
      mv.visitMethodInsn(
          Opcodes.INVOKESTATIC,
          "StaticJavaLib",
          "assertTrue",
          "(Z)V",
          false);
      final Label l3 = new Label();
      mv.visitLabel(l3);
      mv.visitLineNumber(15, l3);
      mv.visitInsn(Opcodes.ICONST_1);
      mv.visitVarInsn(Opcodes.ISTORE, 2);
      final Label l4 = new Label();
      mv.visitLabel(l4);
      mv.visitLineNumber(16, l4);
      mv.visitInsn(Opcodes.ICONST_0);
      mv.visitVarInsn(Opcodes.ISTORE, 3);
      final Label l5 = new Label();
      mv.visitLabel(l5);
      mv.visitLineNumber(17, l5);
      final Label l6 = new Label();
      mv.visitJumpInsn(Opcodes.GOTO, l6);
      final Label l7 = new Label();
      mv.visitLabel(l7);
      mv.visitLineNumber(19, l7);
      mv.visitVarInsn(Opcodes.ILOAD, 2);
      mv.visitVarInsn(Opcodes.ILOAD, 0);
      mv.visitInsn(Opcodes.IMUL);
      mv.visitVarInsn(Opcodes.ISTORE, 2);
      final Label l8 = new Label();
      mv.visitLabel(l8);
      mv.visitLineNumber(20, l8);
      mv.visitIincInsn(3, 1);
      mv.visitLabel(l6);
      mv.visitLineNumber(17, l6);
      mv.visitVarInsn(Opcodes.ILOAD, 3);
      mv.visitVarInsn(Opcodes.ILOAD, 1);
      mv.visitJumpInsn(Opcodes.IF_ICMPLT, l7);
      final Label l9 = new Label();
      mv.visitLabel(l9);
      mv.visitLineNumber(23, l9);
      mv.visitVarInsn(Opcodes.ILOAD, 2);
      mv.visitInsn(Opcodes.IRETURN);
      final Label l10 = new Label();
      mv.visitLabel(l10);
      mv.visitLocalVariable("m", "I", null, l0, l10, 0);
      mv.visitLocalVariable("n", "I", null, l0, l10, 1);
      mv.visitLocalVariable("result", "I", null, l4, l10, 2);
      mv.visitLocalVariable("i", "I", null, l5, l10, 3);
      mv.visitMaxs(2, 4);
      mv.visitEnd();
    }
    cw.visitEnd();

    return cw.toByteArray();
  }

  @Test
  public void dumpPower() throws Exception {
    final byte[] factorialClass = PowerDump.dump();
    final ClassReader cr = new ClassReader(factorialClass);
    final TraceClassVisitor tcv = new TraceClassVisitor(new PrintWriter(
        System.out));
    cr.accept(tcv, 0);
    System.out.flush();
  }
}
