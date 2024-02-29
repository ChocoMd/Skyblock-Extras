/*    */ package org.spongepowered.asm.lib.commons;public class MethodRemapper extends MethodVisitor { protected final Remapper remapper;
/*    */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*  3 */     AnnotationVisitor annotationVisitor = super.visitAnnotation(this.remapper.mapDesc(paramString), paramBoolean);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/* 14 */     { throw b(null); }  return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public void visitMultiANewArrayInsn(String paramString, int paramInt)
/*    */   {
/* 19 */     super.visitMultiANewArrayInsn(this.remapper.mapDesc(paramString), paramInt);
/*    */   } @Deprecated public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) { try { if (this.api >= 327680) { super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3); return; }  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/*    */      try {  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/*    */      doVisitMethodInsn(paramInt, paramString1, paramString2, paramString3, (paramInt == 185)); } public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) { super.visitLocalVariable(paramString1, this.remapper.mapDesc(paramString2), this.remapper.mapSignature(paramString3, true), paramLabel1, paramLabel2, paramInt); }
/* 25 */   public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { AnnotationVisitor annotationVisitor = super.visitTryCatchAnnotation(paramInt, paramTypePath, this.remapper
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
/* 69 */         .mapDesc(paramString), paramBoolean); try {  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/*    */      return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper); }
/*    */   public AnnotationVisitor visitAnnotationDefault() { AnnotationVisitor annotationVisitor = super.visitAnnotationDefault(); try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     }  return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper); } public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { 
/*    */     try { if (this.api < 327680) {
/*    */         super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); return;
/*    */       }  }
/*    */     catch (RuntimeException runtimeException)
/* 81 */     { throw b(null); }  doVisitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); }
/*    */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) { super.visitFieldInsn(paramInt, this.remapper.mapType(paramString1), this.remapper.mapFieldName(paramString1, paramString2, paramString3), this.remapper.mapDesc(paramString3)); }
/*    */   private Object[] remapEntries(int paramInt, Object[] paramArrayOfObject) { byte b = 0; while (true) { try { if (b < paramInt) { if (paramArrayOfObject[b] instanceof String) { Object[] arrayOfObject = new Object[paramInt]; try { if (b > 0)
/*    */                 System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, b);  } catch (RuntimeException runtimeException) { throw b(null); }  }  b++; }  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */        break; }
/* 86 */      return paramArrayOfObject; } public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) { super.visitFrame(paramInt1, paramInt2, remapEntries(paramInt2, paramArrayOfObject1), paramInt3, remapEntries(paramInt3, paramArrayOfObject2)); } public MethodRemapper(MethodVisitor paramMethodVisitor, Remapper paramRemapper) { this(327680, paramMethodVisitor, paramRemapper); }
/*    */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) { try { if (paramString == null) {  } else {  }  } catch (RuntimeException runtimeException) { throw b(null); }  super.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, this.remapper.mapType(paramString)); }
/* 88 */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { AnnotationVisitor annotationVisitor = super.visitInsnAnnotation(paramInt, paramTypePath, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper); }
/*    */ 
/*    */   
/*    */   protected MethodRemapper(int paramInt, MethodVisitor paramMethodVisitor, Remapper paramRemapper) {
/*    */     super(paramInt, paramMethodVisitor);
/*    */     this.remapper = paramRemapper;
/*    */   }
/*    */   
/*    */   private void doVisitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*    */     try {
/*    */       if (this.mv != null)
/*    */         this.mv.visitMethodInsn(paramInt, this.remapper.mapType(paramString1), this.remapper.mapMethodName(paramString1, paramString2, paramString3), this.remapper.mapMethodDesc(paramString3), paramBoolean); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void visitTypeInsn(int paramInt, String paramString) {
/*    */     super.visitTypeInsn(paramInt, this.remapper.mapType(paramString));
/*    */   }
/*    */   
/*    */   public void visitLdcInsn(Object paramObject) {
/*    */     super.visitLdcInsn(this.remapper.mapValue(paramObject));
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = super.visitTypeAnnotation(paramInt, paramTypePath, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*    */     byte b = 0;
/*    */     try {
/*    */       for (; b < paramVarArgs.length; b++)
/*    */         paramVarArgs[b] = this.remapper.mapValue(paramVarArgs[b]); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     super.visitInvokeDynamicInsn(this.remapper.mapInvokeDynamicMethodName(paramString1, paramString2), this.remapper.mapMethodDesc(paramString2), (Handle)this.remapper.mapValue(paramHandle), paramVarArgs);
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = super.visitParameterAnnotation(paramInt, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = super.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? annotationVisitor : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\MethodRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */