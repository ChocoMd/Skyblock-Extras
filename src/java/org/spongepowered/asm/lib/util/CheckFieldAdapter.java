/*    */ package org.spongepowered.asm.lib.util;public class CheckFieldAdapter extends FieldVisitor { public void visitEnd() {
/*  2 */     checkEnd();
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
/* 14 */     this.end = true;
/*    */     super.visitEnd();
/*    */   }
/*    */   private boolean end;
/*    */   
/*    */   public CheckFieldAdapter(FieldVisitor paramFieldVisitor) {
/*    */     this(327680, paramFieldVisitor);
/*    */     if (getClass() != CheckFieldAdapter.class)
/* 22 */       throw new IllegalStateException(); 
/*    */   } protected CheckFieldAdapter(int paramInt, FieldVisitor paramFieldVisitor) {
/*    */     super(paramInt, paramFieldVisitor);
/*    */   }
/*    */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*    */     checkEnd();
/*    */     CheckMethodAdapter.checkDesc(paramString, false);
/* 29 */     return new CheckAnnotationAdapter(super.visitAnnotation(paramString, paramBoolean));
/*    */   }
/*    */   
/*    */   private void checkEnd() {
/*    */     try {
/*    */       if (this.end)
/*    */         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called"); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     checkEnd();
/*    */     int i = paramInt >>> 24;
/*    */     try {
/*    */       if (i != 19)
/*    */         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     CheckClassAdapter.checkTypeRefAndPath(paramInt, paramTypePath);
/*    */     CheckMethodAdapter.checkDesc(paramString, false);
/*    */     return new CheckAnnotationAdapter(super.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean));
/*    */   }
/*    */   
/*    */   public void visitAttribute(Attribute paramAttribute) {
/*    */     try {
/*    */       checkEnd();
/*    */       if (paramAttribute == null)
/*    */         throw new IllegalArgumentException("Invalid attribute (must not be null)"); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     super.visitAttribute(paramAttribute);
/*    */   }
/*    */   
/*    */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckFieldAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */