/*    */ package org.spongepowered.asm.lib;public abstract class AnnotationVisitor { protected final int api;
/*    */   protected AnnotationVisitor av;
/*    */   
/*    */   public void visitEnd() {
/*    */     try {
/*  6 */       if (this.av != null)
/*    */         this.av.visitEnd(); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/* 12 */   public AnnotationVisitor(int paramInt, AnnotationVisitor paramAnnotationVisitor) { if (paramInt != 262144) try { if (paramInt != 327680)
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 22 */           throw new IllegalArgumentException(); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }   this.api = paramInt; this.av = paramAnnotationVisitor; } public AnnotationVisitor visitArray(String paramString) { try { if (this.av != null)
/* 23 */         return this.av.visitArray(paramString);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; }
/*    */ 
/*    */   
/*    */   public void visit(String paramString, Object paramObject) {
/*    */     try {
/*    */       if (this.av != null)
/*    */         this.av.visit(paramString, paramObject); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
/*    */     try {
/*    */       if (this.av != null)
/*    */         return this.av.visitAnnotation(paramString1, paramString2); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*    */     try {
/*    */       if (this.av != null)
/*    */         this.av.visitEnum(paramString1, paramString2, paramString3); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public AnnotationVisitor(int paramInt) {
/*    */     this(paramInt, null);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\AnnotationVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */