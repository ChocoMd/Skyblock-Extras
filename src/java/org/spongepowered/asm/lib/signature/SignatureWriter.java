/*    */ package org.spongepowered.asm.lib.signature;public class SignatureWriter extends SignatureVisitor { private final StringBuilder buf; private boolean hasFormals;
/*    */   private boolean hasParameters;
/*    */   private int argumentStack;
/*    */   
/*  5 */   public void visitEnd() { endArguments();
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     this.buf.append(';'); } public void visitInnerClassType(String paramString) { endArguments();
/* 42 */     this.buf.append('.'); this.buf.append(paramString); this.argumentStack *= 2; }
/*    */   public SignatureVisitor visitInterfaceBound() { this.buf.append(':'); return this; } public void visitFormalTypeParameter(String paramString) { try { if (!this.hasFormals) { this.hasFormals = true; this.buf.append('<'); }  } catch (RuntimeException runtimeException) { throw b(null); }
/* 44 */      this.buf.append(paramString); this.buf.append(':'); }
/*    */   public String toString() { return this.buf.toString(); }
/*    */   public SignatureVisitor visitExceptionType() { this.buf.append('^'); return this; } public void visitTypeArgument() { 
/*    */     try { if (this.argumentStack % 2 == 0)
/*    */       { this.argumentStack++;
/* 49 */         this.buf.append('<'); }  } catch (RuntimeException runtimeException) { throw b(null); }
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
/* 64 */     this.buf.append('*'); } public SignatureVisitor visitClassBound() { return this; }
/*    */   public SignatureWriter() { super(327680); this.buf = new StringBuilder(); }
/* 66 */   public SignatureVisitor visitReturnType() { try { endFormals(); if (!this.hasParameters) this.buf.append('(');  } catch (RuntimeException runtimeException) { throw b(null); }  this.buf.append(')');
/*    */     return this; }
/*    */ 
/*    */   
/*    */   private void endFormals() {
/*    */     try {
/*    */       if (this.hasFormals) {
/*    */         this.hasFormals = false;
/*    */         this.buf.append('>');
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitParameterType() {
/*    */     try {
/*    */       endFormals();
/*    */       if (!this.hasParameters) {
/*    */         this.hasParameters = true;
/*    */         this.buf.append('(');
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitInterface() {
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitTypeArgument(char paramChar) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield argumentStack : I
/*    */     //   4: iconst_2
/*    */     //   5: irem
/*    */     //   6: ifne -> 36
/*    */     //   9: aload_0
/*    */     //   10: dup
/*    */     //   11: getfield argumentStack : I
/*    */     //   14: iconst_1
/*    */     //   15: iadd
/*    */     //   16: putfield argumentStack : I
/*    */     //   19: aload_0
/*    */     //   20: getfield buf : Ljava/lang/StringBuilder;
/*    */     //   23: bipush #60
/*    */     //   25: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   28: pop
/*    */     //   29: goto -> 36
/*    */     //   32: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   35: athrow
/*    */     //   36: iload_1
/*    */     //   37: bipush #61
/*    */     //   39: if_icmpeq -> 58
/*    */     //   42: aload_0
/*    */     //   43: getfield buf : Ljava/lang/StringBuilder;
/*    */     //   46: iload_1
/*    */     //   47: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   50: pop
/*    */     //   51: goto -> 58
/*    */     //   54: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   57: athrow
/*    */     //   58: aload_0
/*    */     //   59: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 0
/*    */     //   #22	-> 9
/*    */     //   #10	-> 19
/*    */     //   #65	-> 36
/*    */     //   #6	-> 42
/*    */     //   #34	-> 58
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	29	32	java/lang/RuntimeException
/*    */     //   36	51	54	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   public void visitTypeVariable(String paramString) {
/*    */     this.buf.append('T');
/*    */     this.buf.append(paramString);
/*    */     this.buf.append(';');
/*    */   }
/*    */   
/*    */   private void endArguments() {
/*    */     try {
/*    */       if (this.argumentStack % 2 != 0)
/*    */         this.buf.append('>'); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     this.argumentStack /= 2;
/*    */   }
/*    */   
/*    */   public void visitBaseType(char paramChar) {
/*    */     this.buf.append(paramChar);
/*    */   }
/*    */   
/*    */   public void visitClassType(String paramString) {
/*    */     this.buf.append('L');
/*    */     this.buf.append(paramString);
/*    */     this.argumentStack *= 2;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitArrayType() {
/*    */     this.buf.append('[');
/*    */     return this;
/*    */   }
/*    */   
/*    */   public SignatureVisitor visitSuperclass() {
/*    */     endFormals();
/*    */     return this;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\signature\SignatureWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */