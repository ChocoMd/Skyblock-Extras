/*    */ package org.spongepowered.asm.lib.commons;
/*    */ public class SignatureRemapper extends SignatureVisitor {
/*    */   private final SignatureVisitor v;
/*    */   private final Remapper remapper;
/*    */   private Stack<String> classNames;
/*    */   
/*  7 */   protected SignatureRemapper(int paramInt, SignatureVisitor paramSignatureVisitor, Remapper paramRemapper) { super(paramInt);
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.classNames = new Stack<String>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     this.v = paramSignatureVisitor; this.remapper = paramRemapper; } public void visitInnerClassType(String paramString) { String str1 = this.classNames.pop(); String str2 = str1 + '$' + paramString;
/* 48 */     this.classNames.push(str2);
/*    */     String str3 = this.remapper.mapType(str1) + '$';
/*    */     String str4 = this.remapper.mapType(str2);
/*    */     try {
/*    */       if (str4.startsWith(str3));
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     int i = str4.lastIndexOf('$') + 1;
/*    */     this.v.visitInnerClassType(str4.substring(i)); }
/*    */ 
/*    */   
/*    */   public SignatureVisitor visitTypeArgument(char paramChar) {
/*    */     this.v.visitTypeArgument(paramChar);
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void visitTypeArgument() {
/*    */     this.v.visitTypeArgument();
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitSuperclass() {
/*    */     this.v.visitSuperclass();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureRemapper(SignatureVisitor paramSignatureVisitor, Remapper paramRemapper) {
/*    */     this(327680, paramSignatureVisitor, paramRemapper);
/*    */   }
/*    */   
/*    */   public void visitTypeVariable(String paramString) {
/*    */     this.v.visitTypeVariable(paramString);
/*    */   }
/*    */   
/*    */   public void visitClassType(String paramString) {
/*    */     this.classNames.push(paramString);
/*    */     this.v.visitClassType(this.remapper.mapType(paramString));
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitInterfaceBound() {
/*    */     this.v.visitInterfaceBound();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitClassBound() {
/*    */     this.v.visitClassBound();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void visitEnd() {
/*    */     this.v.visitEnd();
/*    */     this.classNames.pop();
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitExceptionType() {
/*    */     this.v.visitExceptionType();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitInterface() {
/*    */     this.v.visitInterface();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitParameterType() {
/*    */     this.v.visitParameterType();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitArrayType() {
/*    */     this.v.visitArrayType();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitReturnType() {
/*    */     this.v.visitReturnType();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void visitBaseType(char paramChar) {
/*    */     this.v.visitBaseType(paramChar);
/*    */   }
/*    */   
/*    */   public void visitFormalTypeParameter(String paramString) {
/*    */     this.v.visitFormalTypeParameter(paramString);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\SignatureRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */