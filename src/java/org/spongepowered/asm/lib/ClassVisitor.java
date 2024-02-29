/*  1 */ package org.spongepowered.asm.lib;public abstract class ClassVisitor { protected final int api; protected ClassVisitor cv; public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { try { if (this.cv != null)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 12 */         return this.cv.visitAnnotation(paramString, paramBoolean); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*    */     
/*    */     return null; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ClassVisitor(int paramInt, ClassVisitor paramClassVisitor) {
/* 24 */     if (paramInt != 262144) try { if (paramInt != 327680) {
/*    */           throw new IllegalArgumentException();
/*    */         } }
/*    */       catch (IllegalArgumentException illegalArgumentException)
/*    */       { throw b(null); }
/*    */     
/*    */ 
/*    */     
/*    */     this.api = paramInt;
/* 33 */     this.cv = paramClassVisitor;
/*    */   } public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) { try { if (this.cv != null) this.cv.visitInnerClass(paramString1, paramString2, paramString3, paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public ClassVisitor(int paramInt) { this(paramInt, null); }
/*    */   public void visitSource(String paramString1, String paramString2) { try { if (this.cv != null) this.cv.visitSource(paramString1, paramString2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*    */   public void visitAttribute(Attribute paramAttribute) { try { if (this.cv != null) this.cv.visitAttribute(paramAttribute);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/* 37 */   public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { try { if (this.cv != null) return this.cv.visitMethod(paramInt, paramString1, paramString2, paramString3, paramArrayOfString);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; }
/* 38 */   public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) { try { if (this.cv != null) return this.cv.visitField(paramInt, paramString1, paramString2, paramString3, paramObject);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public void visitEnd() { try { if (this.cv != null) this.cv.visitEnd();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/* 39 */   public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { try { if (this.cv != null) this.cv.visit(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { try { if (this.api < 327680) throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.cv != null) return this.cv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public void visitOuterClass(String paramString1, String paramString2, String paramString3) { try { if (this.cv != null)
/*    */         this.cv.visitOuterClass(paramString1, paramString2, paramString3);  }
/*    */     catch (IllegalArgumentException illegalArgumentException)
/*    */     { throw b(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\ClassVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */