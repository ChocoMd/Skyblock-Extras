/*     */ package org.spongepowered.asm.lib.util;public final class TraceMethodVisitor extends MethodVisitor { public final Printer p; public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*   2 */     this.p.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  22 */     super.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*     */     this.p.visitIincInsn(paramInt1, paramInt2);
/*  31 */     super.visitIincInsn(paramInt1, paramInt2);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     Printer printer = this.p.visitMethodTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */     
/*     */     try {  }
/*     */     catch (RuntimeException runtimeException)
/*  89 */     { throw b(null); }  AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); return new TraceAnnotationVisitor(annotationVisitor, printer);
/*     */   }
/*     */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) { this.p.visitInvokeDynamicInsn(paramString1, paramString2, paramHandle, paramVarArgs); super.visitInvokeDynamicInsn(paramString1, paramString2, paramHandle, paramVarArgs); }
/*     */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) { this.p.visitLookupSwitchInsn(paramLabel, paramArrayOfint, paramArrayOfLabel); super.visitLookupSwitchInsn(paramLabel, paramArrayOfint, paramArrayOfLabel); }
/*  93 */   public void visitMultiANewArrayInsn(String paramString, int paramInt) { this.p.visitMultiANewArrayInsn(paramString, paramInt); super.visitMultiANewArrayInsn(paramString, paramInt); } public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) { Printer printer = this.p.visitParameterAnnotation(paramInt, paramString, paramBoolean); try {  } catch (RuntimeException runtimeException) { throw b(null); }  AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitParameterAnnotation(paramInt, paramString, paramBoolean); return new TraceAnnotationVisitor(annotationVisitor, printer); } public void visitParameter(String paramString, int paramInt) { this.p.visitParameter(paramString, paramInt); super.visitParameter(paramString, paramInt); } public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { Printer printer = this.p.visitMethodAnnotation(paramString, paramBoolean); try {  } catch (RuntimeException runtimeException) { throw b(null); }  AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitAnnotation(paramString, paramBoolean); return new TraceAnnotationVisitor(annotationVisitor, printer); }
/*     */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) { this.p.visitLocalVariable(paramString1, paramString2, paramString3, paramLabel1, paramLabel2, paramInt); super.visitLocalVariable(paramString1, paramString2, paramString3, paramLabel1, paramLabel2, paramInt); }
/*     */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) { this.p.visitFieldInsn(paramInt, paramString1, paramString2, paramString3); super.visitFieldInsn(paramInt, paramString1, paramString2, paramString3); }
/*     */   public AnnotationVisitor visitAnnotationDefault() { Printer printer = this.p.visitAnnotationDefault(); try {  } catch (RuntimeException runtimeException) { throw b(null); }  AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitAnnotationDefault(); return new TraceAnnotationVisitor(annotationVisitor, printer); }
/*     */   public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { Printer printer = this.p.visitTryCatchAnnotation(paramInt, paramTypePath, paramString, paramBoolean); try {  } catch (RuntimeException runtimeException) { throw b(null); }  AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitTryCatchAnnotation(paramInt, paramTypePath, paramString, paramBoolean); return new TraceAnnotationVisitor(annotationVisitor, printer); } public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { try { if (this.api < 327680) { super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); return; }  }
/*     */     catch (RuntimeException runtimeException) { throw b(null); }
/*  99 */      try { this.p.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); if (this.mv != null) this.mv.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean);  } catch (RuntimeException runtimeException) { throw b(null); }  } public void visitLdcInsn(Object paramObject) { this.p.visitLdcInsn(paramObject); super.visitLdcInsn(paramObject); } public void visitVarInsn(int paramInt1, int paramInt2) { this.p.visitVarInsn(paramInt1, paramInt2); super.visitVarInsn(paramInt1, paramInt2); } public void visitCode() { this.p.visitCode(); super.visitCode(); } public void visitMaxs(int paramInt1, int paramInt2) { this.p.visitMaxs(paramInt1, paramInt2); super.visitMaxs(paramInt1, paramInt2); }
/* 100 */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) { this.p.visitTableSwitchInsn(paramInt1, paramInt2, paramLabel, paramVarArgs); super.visitTableSwitchInsn(paramInt1, paramInt2, paramLabel, paramVarArgs); }
/*     */ 
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
/*     */     try {
/*     */       if (this.api >= 327680) {
/* 108 */         super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3);
/*     */         return;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.p.visitMethodInsn(paramInt, paramString1, paramString2, paramString3);
/*     */       if (this.mv != null)
/*     */         this.mv.visitMethodInsn(paramInt, paramString1, paramString2, paramString3); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLabel(Label paramLabel) {
/*     */     this.p.visitLabel(paramLabel);
/*     */     super.visitLabel(paramLabel);
/*     */   }
/*     */   
/*     */   public TraceMethodVisitor(MethodVisitor paramMethodVisitor, Printer paramPrinter) {
/*     */     super(327680, paramMethodVisitor);
/*     */     this.p = paramPrinter;
/*     */   }
/*     */   
/*     */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*     */     this.p.visitIntInsn(paramInt1, paramInt2);
/*     */     super.visitIntInsn(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*     */     this.p.visitLineNumber(paramInt, paramLabel);
/*     */     super.visitLineNumber(paramInt, paramLabel);
/*     */   }
/*     */   
/*     */   public void visitTypeInsn(int paramInt, String paramString) {
/*     */     this.p.visitTypeInsn(paramInt, paramString);
/*     */     super.visitTypeInsn(paramInt, paramString);
/*     */   }
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*     */     this.p.visitMethodAttribute(paramAttribute);
/*     */     super.visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   public void visitEnd() {
/*     */     this.p.visitMethodEnd();
/*     */     super.visitEnd();
/*     */   }
/*     */   
/*     */   public TraceMethodVisitor(Printer paramPrinter) {
/*     */     this((MethodVisitor)null, paramPrinter);
/*     */   }
/*     */   
/*     */   public void visitInsn(int paramInt) {
/*     */     this.p.visitInsn(paramInt);
/*     */     super.visitInsn(paramInt);
/*     */   }
/*     */   
/*     */   public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*     */     this.p.visitFrame(paramInt1, paramInt2, paramArrayOfObject1, paramInt3, paramArrayOfObject2);
/*     */     super.visitFrame(paramInt1, paramInt2, paramArrayOfObject1, paramInt3, paramArrayOfObject2);
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*     */     Printer printer = this.p.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, paramString, paramBoolean);
/*     */     try {
/*     */       if (this.mv == null) {
/*     */       
/*     */       } else {
/*     */       
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     AnnotationVisitor annotationVisitor = this.mv.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, paramString, paramBoolean);
/*     */     return new TraceAnnotationVisitor(annotationVisitor, printer);
/*     */   }
/*     */   
/*     */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*     */     this.p.visitJumpInsn(paramInt, paramLabel);
/*     */     super.visitJumpInsn(paramInt, paramLabel);
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     Printer printer = this.p.visitInsnAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     AnnotationVisitor annotationVisitor = (this.mv == null) ? null : this.mv.visitInsnAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */     return new TraceAnnotationVisitor(annotationVisitor, printer);
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\TraceMethodVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */