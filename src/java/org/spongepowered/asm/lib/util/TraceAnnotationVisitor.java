/*    */ package org.spongepowered.asm.lib.util;public final class TraceAnnotationVisitor extends AnnotationVisitor {
/*    */   public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
/*  3 */     Printer printer = this.p.visitAnnotation(paramString1, paramString2); try {  }
/*    */     catch (RuntimeException runtimeException)
/*  5 */     { throw b(null); }
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
/* 22 */     AnnotationVisitor annotationVisitor = (this.av == null) ? null : this.av.visitAnnotation(paramString1, paramString2);
/*    */     return new TraceAnnotationVisitor(annotationVisitor, printer);
/*    */   }
/*    */   
/*    */   private final Printer p;
/*    */   
/*    */   public TraceAnnotationVisitor(Printer paramPrinter) {
/*    */     this(null, paramPrinter);
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitArray(String paramString) {
/*    */     Printer printer = this.p.visitArray(paramString);
/*    */     try {
/*    */       if (this.av == null) {
/*    */       
/*    */       } else {
/*    */       
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     AnnotationVisitor annotationVisitor = this.av.visitArray(paramString);
/*    */     return new TraceAnnotationVisitor(annotationVisitor, printer);
/*    */   }
/*    */   
/*    */   public void visit(String paramString, Object paramObject) {
/*    */     this.p.visit(paramString, paramObject);
/*    */     super.visit(paramString, paramObject);
/*    */   }
/*    */   
/*    */   public TraceAnnotationVisitor(AnnotationVisitor paramAnnotationVisitor, Printer paramPrinter) {
/*    */     super(327680, paramAnnotationVisitor);
/*    */     this.p = paramPrinter;
/*    */   }
/*    */   
/*    */   public void visitEnd() {
/*    */     this.p.visitAnnotationEnd();
/*    */     super.visitEnd();
/*    */   }
/*    */   
/*    */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*    */     this.p.visitEnum(paramString1, paramString2, paramString3);
/*    */     super.visitEnum(paramString1, paramString2, paramString3);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\TraceAnnotationVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */