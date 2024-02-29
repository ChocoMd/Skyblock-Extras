/*  1 */ package org.spongepowered.asm.lib.commons;public class AnnotationRemapper extends AnnotationVisitor { protected final Remapper remapper; public AnnotationVisitor visitArray(String paramString) { AnnotationVisitor annotationVisitor = this.av.visitArray(paramString);
/*    */ 
/*    */     
/*    */     try { 
/*    */       try {  }
/*    */       catch (RuntimeException runtimeException)
/*  7 */       { throw b(null); }  } catch (RuntimeException runtimeException) { throw b(null); }  return (annotationVisitor == null) ? null : ((annotationVisitor == this.av) ? this : new AnnotationRemapper(annotationVisitor, this.remapper)); }
/*    */   public void visit(String paramString, Object paramObject) { this.av.visit(paramString, this.remapper.mapValue(paramObject)); }
/*  9 */   public void visitEnum(String paramString1, String paramString2, String paramString3) { this.av.visitEnum(paramString1, this.remapper.mapDesc(paramString2), paramString3); } protected AnnotationRemapper(int paramInt, AnnotationVisitor paramAnnotationVisitor, Remapper paramRemapper) { super(paramInt, paramAnnotationVisitor);
/* 10 */     this.remapper = paramRemapper; } public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) { AnnotationVisitor annotationVisitor = this.av.visitAnnotation(paramString1, this.remapper.mapDesc(paramString2)); try { try {  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */        }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/* 13 */      return (annotationVisitor == null) ? null : ((annotationVisitor == this.av) ? this : new AnnotationRemapper(annotationVisitor, this.remapper)); } public AnnotationRemapper(AnnotationVisitor paramAnnotationVisitor, Remapper paramRemapper) { this(327680, paramAnnotationVisitor, paramRemapper); }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\AnnotationRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */