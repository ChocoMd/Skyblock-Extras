/*  1 */ package org.spongepowered.asm.lib.commons;public class ClassRemapper extends ClassVisitor { protected final Remapper remapper; protected String className; public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { String str = this.remapper.mapMethodDesc(paramString2);
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
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/* 31 */       throw b(null);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     MethodVisitor methodVisitor = super.visitMethod(paramInt, this.remapper.mapMethodName(this.className, paramString1, paramString2), str, this.remapper.mapSignature(paramString3, false), (paramArrayOfString == null) ? null : this.remapper.mapTypes(paramArrayOfString)); try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (methodVisitor == null) ? null : createMethodRemapper(methodVisitor); } public void visitOuterClass(String paramString1, String paramString2, String paramString3) { try {  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/* 41 */      try { if (paramString3 == null) {  } else {  }  } catch (RuntimeException runtimeException) { throw b(null); }  super.visitOuterClass(this.remapper.mapType(paramString1), (paramString2 == null) ? null : this.remapper.mapMethodName(paramString1, paramString2, paramString3), this.remapper.mapMethodDesc(paramString3)); }
/*    */ 
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = super.visitTypeAnnotation(paramInt, paramTypePath, this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? null : createAnnotationRemapper(annotationVisitor);
/*    */   }
/*    */   
/*    */   protected AnnotationVisitor createAnnotationRemapper(AnnotationVisitor paramAnnotationVisitor) {
/*    */     return new AnnotationRemapper(paramAnnotationVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*    */     try {
/*    */       this.className = paramString1;
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     super.visit(paramInt1, paramInt2, this.remapper.mapType(paramString1), this.remapper.mapSignature(paramString2, false), this.remapper.mapType(paramString3), (paramArrayOfString == null) ? null : this.remapper.mapTypes(paramArrayOfString));
/*    */   }
/*    */   
/*    */   protected ClassRemapper(int paramInt, ClassVisitor paramClassVisitor, Remapper paramRemapper) {
/*    */     super(paramInt, paramClassVisitor);
/*    */     this.remapper = paramRemapper;
/*    */   }
/*    */   
/*    */   protected MethodVisitor createMethodRemapper(MethodVisitor paramMethodVisitor) {
/*    */     return new MethodRemapper(paramMethodVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     super.visitInnerClass(this.remapper.mapType(paramString1), (paramString2 == null) ? null : this.remapper.mapType(paramString2), paramString3, paramInt);
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*    */     AnnotationVisitor annotationVisitor = super.visitAnnotation(this.remapper.mapDesc(paramString), paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (annotationVisitor == null) ? null : createAnnotationRemapper(annotationVisitor);
/*    */   }
/*    */   
/*    */   public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*    */     FieldVisitor fieldVisitor = super.visitField(paramInt, this.remapper.mapFieldName(this.className, paramString1, paramString2), this.remapper.mapDesc(paramString2), this.remapper.mapSignature(paramString3, true), this.remapper.mapValue(paramObject));
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (fieldVisitor == null) ? null : createFieldRemapper(fieldVisitor);
/*    */   }
/*    */   
/*    */   protected FieldVisitor createFieldRemapper(FieldVisitor paramFieldVisitor) {
/*    */     return new FieldRemapper(paramFieldVisitor, this.remapper);
/*    */   }
/*    */   
/*    */   public ClassRemapper(ClassVisitor paramClassVisitor, Remapper paramRemapper) {
/*    */     this(327680, paramClassVisitor, paramRemapper);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\ClassRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */