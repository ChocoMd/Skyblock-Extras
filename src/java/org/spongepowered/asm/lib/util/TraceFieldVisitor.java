/*    */ package org.spongepowered.asm.lib.util;
/*  2 */ public final class TraceFieldVisitor extends FieldVisitor { public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { Printer printer = this.p.visitFieldAnnotation(paramString, paramBoolean);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/*  9 */     { throw b(null); }  AnnotationVisitor annotationVisitor = (this.fv == null) ? null : this.fv.visitAnnotation(paramString, paramBoolean);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     return new TraceAnnotationVisitor(annotationVisitor, printer); } public final Printer p; public void visitEnd() {
/* 15 */     this.p.visitFieldEnd();
/*    */     
/* 17 */     super.visitEnd();
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     Printer printer = this.p.visitFieldTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     AnnotationVisitor annotationVisitor = (this.fv == null) ? null : this.fv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*    */     return new TraceAnnotationVisitor(annotationVisitor, printer);
/*    */   }
/*    */   
/*    */   public void visitAttribute(Attribute paramAttribute) {
/*    */     this.p.visitFieldAttribute(paramAttribute);
/*    */     super.visitAttribute(paramAttribute);
/*    */   }
/*    */   
/*    */   public TraceFieldVisitor(Printer paramPrinter) {
/*    */     this(null, paramPrinter);
/*    */   }
/*    */   
/*    */   public TraceFieldVisitor(FieldVisitor paramFieldVisitor, Printer paramPrinter) {
/*    */     super(327680, paramFieldVisitor);
/*    */     this.p = paramPrinter;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\TraceFieldVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */