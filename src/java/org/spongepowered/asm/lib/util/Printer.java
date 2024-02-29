/*    */ package org.spongepowered.asm.lib.util;public abstract class Printer { public List<Object> getText() {
/*  2 */     return this.text;
/*    */   }
/*    */ 
/*    */   
/*  6 */   public static final String[] OPCODES = new String[200];
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Printer visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/* 15 */     throw new RuntimeException("Must be overriden");
/* 16 */   } public Printer visitMethodTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { throw new RuntimeException("Must be overriden"); }
/* 17 */   static { i = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 69 */     b = 4; int j; while ((j = str.indexOf(',', i)) > 0) { TYPES[b++] = str.substring(i, j); i = j + 1; }
/*    */      str = "H_GETFIELD,H_GETSTATIC,H_PUTFIELD,H_PUTSTATIC,H_INVOKEVIRTUAL,H_INVOKESTATIC,H_INVOKESPECIAL,H_NEWINVOKESPECIAL,H_INVOKEINTERFACE,"; } @Deprecated public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) { try { if (this.api >= 327680) { try {  }
/*    */         catch (RuntimeException runtimeException) { throw b(null); }
/*    */          boolean bool = (paramInt == 185) ? true : false; visitMethodInsn(paramInt, paramString1, paramString2, paramString3, bool); return; }
/*    */        }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/* 75 */      throw new RuntimeException("Must be overriden"); }
/*    */   public Printer visitFieldTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { throw new RuntimeException("Must be overriden"); } static void printList(PrintWriter paramPrintWriter, List<?> paramList) { for (byte b = 0; b < paramList.size(); ) {
/*    */       Object object = paramList.get(b); 
/*    */       try { if (object instanceof List)
/* 79 */         { printList(paramPrintWriter, (List)object); } else { paramPrintWriter.print(object.toString()); }  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */     
/*    */     }  }
/*    */ 
/*    */   
/*    */   static {
/*    */     byte b = 0;
/*    */     int i = 0;
/*    */     while (true) {
/*    */       int k;
/*    */       try {
/*    */         if ((k = str.indexOf(',', i)) > 0) {
/*    */           try {
/*    */           
/*    */           } catch (RuntimeException runtimeException) {
/*    */             throw b(null);
/*    */           } 
/*    */           OPCODES[b++] = (i + 1 == k) ? null : str.substring(i, k);
/*    */           i = k + 1;
/*    */           continue;
/*    */         } 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     str = "T_BOOLEAN,T_CHAR,T_FLOAT,T_DOUBLE,T_BYTE,T_SHORT,T_INT,T_LONG,";
/*    */   }
/*    */   
/*    */   static {
/*    */     i = 0;
/*    */     b = 1;
/*    */     for (; (j = str.indexOf(',', i)) > 0; i = j + 1)
/*    */       HANDLE_TAG[b++] = str.substring(i, j); 
/*    */   }
/*    */   
/*    */   public Printer visitClassTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     throw new RuntimeException("Must be overriden");
/*    */   }
/*    */   
/*    */   public void print(PrintWriter paramPrintWriter) {
/*    */     printList(paramPrintWriter, this.text);
/*    */   }
/*    */   
/*    */   public static void appendString(StringBuffer paramStringBuffer, String paramString) {
/*    */     paramStringBuffer.append('"');
/*    */     for (byte b = 0; b < paramString.length();)
/*    */       c = paramString.charAt(b); 
/*    */     paramStringBuffer.append('"');
/*    */   }
/*    */   
/*    */   static {
/*    */     String str = "NOP,ACONST_NULL,ICONST_M1,ICONST_0,ICONST_1,ICONST_2,ICONST_3,ICONST_4,ICONST_5,LCONST_0,LCONST_1,FCONST_0,FCONST_1,FCONST_2,DCONST_0,DCONST_1,BIPUSH,SIPUSH,LDC,,,ILOAD,LLOAD,FLOAD,DLOAD,ALOAD,,,,,,,,,,,,,,,,,,,,,IALOAD,LALOAD,FALOAD,DALOAD,AALOAD,BALOAD,CALOAD,SALOAD,ISTORE,LSTORE,FSTORE,DSTORE,ASTORE,,,,,,,,,,,,,,,,,,,,,IASTORE,LASTORE,FASTORE,DASTORE,AASTORE,BASTORE,CASTORE,SASTORE,POP,POP2,DUP,DUP_X1,DUP_X2,DUP2,DUP2_X1,DUP2_X2,SWAP,IADD,LADD,FADD,DADD,ISUB,LSUB,FSUB,DSUB,IMUL,LMUL,FMUL,DMUL,IDIV,LDIV,FDIV,DDIV,IREM,LREM,FREM,DREM,INEG,LNEG,FNEG,DNEG,ISHL,LSHL,ISHR,LSHR,IUSHR,LUSHR,IAND,LAND,IOR,LOR,IXOR,LXOR,IINC,I2L,I2F,I2D,L2I,L2F,L2D,F2I,F2L,F2D,D2I,D2L,D2F,I2B,I2C,I2S,LCMP,FCMPL,FCMPG,DCMPL,DCMPG,IFEQ,IFNE,IFLT,IFGE,IFGT,IFLE,IF_ICMPEQ,IF_ICMPNE,IF_ICMPLT,IF_ICMPGE,IF_ICMPGT,IF_ICMPLE,IF_ACMPEQ,IF_ACMPNE,GOTO,JSR,RET,TABLESWITCH,LOOKUPSWITCH,IRETURN,LRETURN,FRETURN,DRETURN,ARETURN,RETURN,GETSTATIC,PUTSTATIC,GETFIELD,PUTFIELD,INVOKEVIRTUAL,INVOKESPECIAL,INVOKESTATIC,INVOKEINTERFACE,INVOKEDYNAMIC,NEW,NEWARRAY,ANEWARRAY,ARRAYLENGTH,ATHROW,CHECKCAST,INSTANCEOF,MONITORENTER,MONITOREXIT,,MULTIANEWARRAY,IFNULL,IFNONNULL,";
/*    */   }
/*    */   
/*    */   public static final String[] HANDLE_TAG = new String[10];
/*    */   
/*    */   public Printer visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*    */     throw new RuntimeException("Must be overriden");
/*    */   }
/*    */   
/*    */   public static final String[] TYPES = new String[12];
/*    */   protected final int api;
/*    */   protected final StringBuffer buf;
/*    */   public final List<Object> text;
/*    */   
/*    */   protected Printer(int paramInt) {
/*    */     this.api = paramInt;
/*    */     this.buf = new StringBuffer();
/*    */     this.text = new ArrayList();
/*    */   }
/*    */   
/*    */   public Printer visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     throw new RuntimeException("Must be overriden");
/*    */   }
/*    */   
/*    */   public void visitParameter(String paramString, int paramInt) {
/*    */     throw new RuntimeException("Must be overriden");
/*    */   }
/*    */   
/*    */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*    */     try {
/*    */       if (this.api < 327680) {
/*    */         try {
/*    */         
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         try {
/*    */           if (paramBoolean != ((paramInt == 185)))
/*    */             throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5"); 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     throw new RuntimeException("Must be overriden");
/*    */   }
/*    */   
/*    */   public abstract void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString);
/*    */   
/*    */   public abstract void visitSource(String paramString1, String paramString2);
/*    */   
/*    */   public abstract void visitOuterClass(String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract Printer visitClassAnnotation(String paramString, boolean paramBoolean);
/*    */   
/*    */   public abstract void visitClassAttribute(Attribute paramAttribute);
/*    */   
/*    */   public abstract void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt);
/*    */   
/*    */   public abstract Printer visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject);
/*    */   
/*    */   public abstract Printer visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString);
/*    */   
/*    */   public abstract void visitClassEnd();
/*    */   
/*    */   public abstract void visit(String paramString, Object paramObject);
/*    */   
/*    */   public abstract void visitEnum(String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract Printer visitAnnotation(String paramString1, String paramString2);
/*    */   
/*    */   public abstract Printer visitArray(String paramString);
/*    */   
/*    */   public abstract void visitAnnotationEnd();
/*    */   
/*    */   public abstract Printer visitFieldAnnotation(String paramString, boolean paramBoolean);
/*    */   
/*    */   public abstract void visitFieldAttribute(Attribute paramAttribute);
/*    */   
/*    */   public abstract void visitFieldEnd();
/*    */   
/*    */   public abstract Printer visitAnnotationDefault();
/*    */   
/*    */   public abstract Printer visitMethodAnnotation(String paramString, boolean paramBoolean);
/*    */   
/*    */   public abstract Printer visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean);
/*    */   
/*    */   public abstract void visitMethodAttribute(Attribute paramAttribute);
/*    */   
/*    */   public abstract void visitCode();
/*    */   
/*    */   public abstract void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2);
/*    */   
/*    */   public abstract void visitInsn(int paramInt);
/*    */   
/*    */   public abstract void visitIntInsn(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract void visitVarInsn(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract void visitTypeInsn(int paramInt, String paramString);
/*    */   
/*    */   public abstract void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3);
/*    */   
/*    */   public abstract void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs);
/*    */   
/*    */   public abstract void visitJumpInsn(int paramInt, Label paramLabel);
/*    */   
/*    */   public abstract void visitLabel(Label paramLabel);
/*    */   
/*    */   public abstract void visitLdcInsn(Object paramObject);
/*    */   
/*    */   public abstract void visitIincInsn(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs);
/*    */   
/*    */   public abstract void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel);
/*    */   
/*    */   public abstract void visitMultiANewArrayInsn(String paramString, int paramInt);
/*    */   
/*    */   public abstract void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString);
/*    */   
/*    */   public abstract void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt);
/*    */   
/*    */   public abstract void visitLineNumber(int paramInt, Label paramLabel);
/*    */   
/*    */   public abstract void visitMaxs(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract void visitMethodEnd();
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\Printer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */