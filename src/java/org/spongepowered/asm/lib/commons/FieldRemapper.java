/*    */ package org.spongepowered.asm.lib.commons;
/*    */ 
/*    */ public class FieldRemapper extends FieldVisitor {
/*  4 */   public FieldRemapper(FieldVisitor paramFieldVisitor, Remapper paramRemapper) { this(327680, paramFieldVisitor, paramRemapper); } private final Remapper remapper; protected FieldRemapper(int paramInt, FieldVisitor paramFieldVisitor, Remapper paramRemapper) {
/*  5 */     super(paramInt, paramFieldVisitor);
/*  6 */     this.remapper = paramRemapper;
/*    */   }
/*    */ 
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/* 11 */     AnnotationVisitor annotationVisitor = super.visitTypeAnnotation(paramInt, paramTypePath, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? null : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = this.fv.visitAnnotation(this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? null : new AnnotationRemapper(annotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\FieldRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */