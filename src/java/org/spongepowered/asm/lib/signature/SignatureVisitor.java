/*  1 */ package org.spongepowered.asm.lib.signature;public abstract class SignatureVisitor { public static final char EXTENDS = '+'; public static final char SUPER = '-'; public SignatureVisitor visitInterface() { return this; }
/*    */    public static final char INSTANCEOF = '='; protected final int api; public void visitInnerClassType(String paramString) {}
/*    */   public SignatureVisitor visitReturnType() {
/*  4 */     return this;
/*    */   } public void visitBaseType(char paramChar) {} public SignatureVisitor visitParameterType() {
/*  6 */     return this;
/*    */   } public void visitFormalTypeParameter(String paramString) {}
/*    */   public void visitTypeArgument() {}
/*    */   public void visitEnd() {}
/*    */   public SignatureVisitor visitSuperclass() {
/* 11 */     return this;
/*    */   }
/*    */   public void visitTypeVariable(String paramString) {}
/* 14 */   public SignatureVisitor visitClassBound() { return this; }
/* 15 */   public SignatureVisitor visitArrayType() { return this; } public SignatureVisitor visitInterfaceBound() {
/* 16 */     return this;
/*    */   }
/* 18 */   public SignatureVisitor visitTypeArgument(char paramChar) { return this; } public SignatureVisitor visitExceptionType() {
/* 19 */     return this;
/*    */   }
/*    */   
/*    */   public void visitClassType(String paramString) {}
/*    */   
/*    */   public SignatureVisitor(int paramInt) {
/*    */     if (paramInt != 262144)
/*    */       try {
/*    */         if (paramInt != 327680)
/*    */           throw new IllegalArgumentException(); 
/*    */       } catch (IllegalArgumentException illegalArgumentException) {
/*    */         throw b(null);
/*    */       }  
/*    */     this.api = paramInt;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\signature\SignatureVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */