/*    */ package org.spongepowered.asm.lib.util;public class CheckAnnotationAdapter extends AnnotationVisitor { private final boolean named;
/*    */   private boolean end;
/*    */   
/*    */   public CheckAnnotationAdapter(AnnotationVisitor paramAnnotationVisitor) {
/*  5 */     this(paramAnnotationVisitor, true);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public AnnotationVisitor visitArray(String paramString) {
/*    */     
/* 12 */     try { checkEnd();
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
/* 39 */       checkName(paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 44 */       if (this.av == null) {  } else {  }  } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }  return new CheckAnnotationAdapter(this.av.visitArray(paramString), false); } public void visit(String paramString, Object paramObject) { try { checkEnd(); checkName(paramString); if (!(paramObject instanceof Byte)) try { if (!(paramObject instanceof Boolean)) try { if (!(paramObject instanceof Character)) try { if (!(paramObject instanceof Short)) try { if (!(paramObject instanceof Integer)) try { if (!(paramObject instanceof Long)) try { if (!(paramObject instanceof Float)) try { if (!(paramObject instanceof Double)) try { if (!(paramObject instanceof String)) try { if (!(paramObject instanceof Type)) try { if (!(paramObject instanceof byte[])) try { if (!(paramObject instanceof boolean[])) try { if (!(paramObject instanceof char[])) try { if (!(paramObject instanceof short[])) try { if (!(paramObject instanceof int[])) try { if (!(paramObject instanceof long[])) try { if (!(paramObject instanceof float[])) try { if (!(paramObject instanceof double[])) throw new IllegalArgumentException("Invalid annotation value");  } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }  if (paramObject instanceof Type) { int i = ((Type)paramObject).getSort(); try { if (i == 11)
/*    */           throw new IllegalArgumentException("Invalid annotation value");  } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }  }  try { if (this.av != null)
/* 46 */         this.av.visit(paramString, paramObject);  } catch (IllegalArgumentException illegalArgumentException) { throw c(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   private void checkName(String paramString) {
/*    */     try {
/*    */       if (this.named)
/*    */         try {
/*    */           if (paramString == null)
/*    */             throw new IllegalArgumentException("Annotation value name must not be null"); 
/*    */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw c(null);
/*    */         }  
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   CheckAnnotationAdapter(AnnotationVisitor paramAnnotationVisitor, boolean paramBoolean) {
/*    */     super(327680, paramAnnotationVisitor);
/*    */     this.named = paramBoolean;
/*    */   }
/*    */   
/*    */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*    */     try {
/*    */       checkEnd();
/*    */       checkName(paramString1);
/*    */       CheckMethodAdapter.checkDesc(paramString2, false);
/*    */       if (paramString3 == null)
/*    */         throw new IllegalArgumentException("Invalid enum value"); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */     try {
/*    */       if (this.av != null)
/*    */         this.av.visitEnum(paramString1, paramString2, paramString3); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private void checkEnd() {
/*    */     try {
/*    */       if (this.end)
/*    */         throw new IllegalStateException("Cannot call a visit method after visitEnd has been called"); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
/*    */     try {
/*    */       checkEnd();
/*    */       checkName(paramString1);
/*    */       CheckMethodAdapter.checkDesc(paramString2, false);
/*    */       if (this.av == null) {
/*    */       
/*    */       } else {
/*    */       
/*    */       } 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return new CheckAnnotationAdapter(this.av.visitAnnotation(paramString1, paramString2));
/*    */   }
/*    */   
/*    */   public void visitEnd() {
/*    */     try {
/*    */       checkEnd();
/*    */       this.end = true;
/*    */       if (this.av != null)
/*    */         this.av.visitEnd(); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException c(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckAnnotationAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */