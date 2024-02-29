/*    */ package org.spongepowered.asm.lib;
/*    */ 
/*    */ 
/*    */ public abstract class FieldVisitor
/*    */ {
/*    */   protected final int api;
/*    */   protected FieldVisitor fv;
/*    */   
/*    */   public void visitAttribute(Attribute paramAttribute) {
/*    */     
/* 11 */     try { if (this.fv != null)
/* 12 */         this.fv.visitAttribute(paramAttribute);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { try { if (this.api < 327680)
/*    */       {
/*    */ 
/*    */         
/* 16 */         throw new RuntimeException(); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*    */      try { if (this.fv != null)
/* 18 */         return this.fv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*    */      return null; } public void visitEnd() { try { if (this.fv != null)
/* 20 */         this.fv.visitEnd();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*    */     try {
/*    */       if (this.fv != null)
/*    */         return this.fv.visitAnnotation(paramString, paramBoolean); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public FieldVisitor(int paramInt) {
/*    */     this(paramInt, null);
/*    */   }
/*    */   
/*    */   public FieldVisitor(int paramInt, FieldVisitor paramFieldVisitor) {
/*    */     if (paramInt != 262144)
/*    */       try {
/*    */         if (paramInt != 327680)
/*    */           throw new IllegalArgumentException(); 
/*    */       } catch (IllegalArgumentException illegalArgumentException) {
/*    */         throw b(null);
/*    */       }  
/*    */     this.api = paramInt;
/*    */     this.fv = paramFieldVisitor;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\FieldVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */