/*     */ package org.spongepowered.asm.lib;public abstract class MethodVisitor { protected final int api; protected MethodVisitor mv; public void visitTypeInsn(int paramInt, String paramString) { 
/*   2 */     try { if (this.mv != null)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  33 */         this.mv.visitTypeInsn(paramInt, paramString); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       if (this.mv != null) {
/*     */         this.mv.visitVarInsn(paramInt1, paramInt2);
/*     */       }
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public MethodVisitor(int paramInt, MethodVisitor paramMethodVisitor) {
/*  86 */     if (paramInt != 262144) try { if (paramInt != 327680) {
/*     */           throw new IllegalArgumentException();
/*     */         } }
/*     */       catch (IllegalArgumentException illegalArgumentException)
/*     */       { throw b(null); }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.api = paramInt;
/*     */ 
/*     */     
/*  99 */     this.mv = paramMethodVisitor;
/*     */   } public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) { try { if (this.mv != null)
/*     */         this.mv.visitLookupSwitchInsn(paramLabel, paramArrayOfint, paramArrayOfLabel);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) { try { if (this.mv != null)
/*     */         this.mv.visitInvokeDynamicInsn(paramString1, paramString2, paramHandle, paramVarArgs);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public MethodVisitor(int paramInt) { this(paramInt, null); }
/*     */   public void visitParameter(String paramString, int paramInt) { try { if (this.api < 327680)
/*     */         throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null)
/*     */         this.mv.visitParameter(paramString, paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { try { if (this.mv != null)
/*     */         return this.mv.visitAnnotation(paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; }
/*     */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) { try { if (this.mv != null)
/*     */         this.mv.visitFieldInsn(paramInt, paramString1, paramString2, paramString3);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { try { if (this.api < 327680)
/* 112 */         throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) return this.mv.visitInsnAnnotation(paramInt, paramTypePath, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) { try { if (this.api < 327680) throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) return this.mv.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) { try { if (this.mv != null) return this.mv.visitParameterAnnotation(paramInt, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) { try { if (this.mv != null) this.mv.visitFrame(paramInt1, paramInt2, paramArrayOfObject1, paramInt3, paramArrayOfObject2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitLineNumber(int paramInt, Label paramLabel) { try { if (this.mv != null) this.mv.visitLineNumber(paramInt, paramLabel);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitAttribute(Attribute paramAttribute) { try { if (this.mv != null) this.mv.visitAttribute(paramAttribute);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public void visitLdcInsn(Object paramObject) { try { if (this.mv != null) this.mv.visitLdcInsn(paramObject);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/* 114 */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { try { if (this.api < 327680) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (paramBoolean != ((paramInt == 185))) throw new IllegalArgumentException("INVOKESPECIAL/STATIC on interfaces require ASM 5");  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) this.mv.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public void visitLabel(Label paramLabel) { try { if (this.mv != null) this.mv.visitLabel(paramLabel);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/* 116 */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { try { if (this.api < 327680) throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) return this.mv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public void visitIincInsn(int paramInt1, int paramInt2) { try { if (this.mv != null) this.mv.visitIincInsn(paramInt1, paramInt2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitCode() { try { if (this.mv != null) this.mv.visitCode();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) { try { if (this.mv != null) this.mv.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, paramString);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/*     */   public void visitEnd() { try { if (this.mv != null) this.mv.visitEnd();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }
/* 118 */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) { try { if (this.mv != null) this.mv.visitTableSwitchInsn(paramInt1, paramInt2, paramLabel, paramVarArgs);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitMaxs(int paramInt1, int paramInt2) { try { if (this.mv != null) this.mv.visitMaxs(paramInt1, paramInt2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } @Deprecated public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) { try { if (this.api >= 327680) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  boolean bool = (paramInt == 185) ? true : false; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) this.mv.visitMethodInsn(paramInt, paramString1, paramString2, paramString3);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitJumpInsn(int paramInt, Label paramLabel) { try { if (this.mv != null) this.mv.visitJumpInsn(paramInt, paramLabel);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { try { if (this.api < 327680) throw new RuntimeException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.mv != null) return this.mv.visitTryCatchAnnotation(paramInt, paramTypePath, paramString, paramBoolean);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } public void visitMultiANewArrayInsn(String paramString, int paramInt) { try { if (this.mv != null) this.mv.visitMultiANewArrayInsn(paramString, paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) { try { if (this.mv != null) this.mv.visitLocalVariable(paramString1, paramString2, paramString3, paramLabel1, paramLabel2, paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitIntInsn(int paramInt1, int paramInt2) { try { if (this.mv != null)
/* 119 */         this.mv.visitIntInsn(paramInt1, paramInt2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public void visitInsn(int paramInt) { try { if (this.mv != null)
/* 120 */         this.mv.visitInsn(paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  } public AnnotationVisitor visitAnnotationDefault() { try { if (this.mv != null)
/*     */         return this.mv.visitAnnotationDefault();  }
/*     */     catch (IllegalArgumentException illegalArgumentException)
/*     */     { throw b(null); }
/*     */     
/*     */     return null; }
/*     */ 
/*     */   
/*     */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\MethodVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */