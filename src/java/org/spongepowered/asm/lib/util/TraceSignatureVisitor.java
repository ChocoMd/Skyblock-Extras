/*   1 */ package org.spongepowered.asm.lib.util;public final class TraceSignatureVisitor extends SignatureVisitor { public SignatureVisitor visitArrayType() { startType();
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
/*  55 */     this.arrayStack |= 0x1;
/*     */     return this; }
/*     */ 
/*     */ 
/*     */   
/*     */   private final StringBuilder declaration;
/*     */   
/*     */   private boolean isInterface;
/*     */   
/*     */   private boolean seenFormalParameter;
/*     */   
/*     */   private boolean seenInterfaceBound;
/*     */   
/*     */   private boolean seenParameter;
/*     */   private boolean seenInterface;
/*     */   private StringBuilder returnType;
/*     */   private StringBuilder exceptions;
/*     */   private int argumentStack;
/*     */   private int arrayStack;
/*     */   private String separator;
/*     */   
/*     */   public void visitFormalTypeParameter(String paramString) {
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.declaration.append(this.seenFormalParameter ? ", " : "<").append(paramString);
/*     */     this.seenFormalParameter = true;
/*  84 */     this.seenInterfaceBound = false;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void visitEnd() {
/*     */     
/*     */     try { if (this.argumentStack % 2 != 0)
/* 112 */         this.declaration.append('>');  } catch (RuntimeException runtimeException) { throw b(null); }
/*     */     
/*     */     this.argumentStack /= 2;
/*     */     endType();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public TraceSignatureVisitor(int paramInt) {
/*     */     super(327680);
/*     */     this.separator = "";
/* 123 */     this.isInterface = ((paramInt & 0x200) != 0);
/*     */     this.declaration = new StringBuilder();
/*     */   }
/*     */   
/*     */   public void visitInnerClassType(String paramString) {
/*     */     try {
/*     */       if (this.argumentStack % 2 != 0)
/*     */         this.declaration.append('>'); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.argumentStack /= 2;
/*     */     this.declaration.append('.');
/*     */     this.declaration.append(this.separator).append(paramString.replace('/', '.'));
/*     */     this.separator = "";
/*     */     this.argumentStack *= 2;
/*     */   }
/*     */   
/*     */   public String getDeclaration() {
/*     */     return this.declaration.toString();
/*     */   }
/*     */   
/*     */   private void endFormals() {
/*     */     try {
/*     */       if (this.seenFormalParameter) {
/*     */         this.declaration.append('>');
/*     */         this.seenFormalParameter = false;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void startType() {
/*     */     this.arrayStack *= 2;
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitClassBound() {
/*     */     this.separator = " extends ";
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   public String getReturnType() {
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (this.returnType == null) ? null : this.returnType.toString();
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitInterfaceBound() {
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.separator = this.seenInterfaceBound ? ", " : " extends ";
/*     */     this.seenInterfaceBound = true;
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitSuperclass() {
/*     */     endFormals();
/*     */     this.separator = " extends ";
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   public void visitClassType(String paramString) {
/*     */     // Byte code:
/*     */     //   0: ldc 'java/lang/Object'
/*     */     //   2: aload_1
/*     */     //   3: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   6: ifeq -> 86
/*     */     //   9: aload_0
/*     */     //   10: getfield argumentStack : I
/*     */     //   13: iconst_2
/*     */     //   14: irem
/*     */     //   15: ifne -> 39
/*     */     //   18: goto -> 25
/*     */     //   21: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   24: athrow
/*     */     //   25: aload_0
/*     */     //   26: getfield seenParameter : Z
/*     */     //   29: ifeq -> 47
/*     */     //   32: goto -> 39
/*     */     //   35: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   38: athrow
/*     */     //   39: iconst_1
/*     */     //   40: goto -> 48
/*     */     //   43: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   46: athrow
/*     */     //   47: iconst_0
/*     */     //   48: istore_2
/*     */     //   49: iload_2
/*     */     //   50: ifeq -> 83
/*     */     //   53: aload_0
/*     */     //   54: getfield declaration : Ljava/lang/StringBuilder;
/*     */     //   57: aload_0
/*     */     //   58: getfield separator : Ljava/lang/String;
/*     */     //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   64: aload_1
/*     */     //   65: bipush #47
/*     */     //   67: bipush #46
/*     */     //   69: invokevirtual replace : (CC)Ljava/lang/String;
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   75: pop
/*     */     //   76: goto -> 83
/*     */     //   79: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   82: athrow
/*     */     //   83: goto -> 109
/*     */     //   86: aload_0
/*     */     //   87: getfield declaration : Ljava/lang/StringBuilder;
/*     */     //   90: aload_0
/*     */     //   91: getfield separator : Ljava/lang/String;
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   97: aload_1
/*     */     //   98: bipush #47
/*     */     //   100: bipush #46
/*     */     //   102: invokevirtual replace : (CC)Ljava/lang/String;
/*     */     //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   108: pop
/*     */     //   109: aload_0
/*     */     //   110: ldc ''
/*     */     //   112: putfield separator : Ljava/lang/String;
/*     */     //   115: aload_0
/*     */     //   116: dup
/*     */     //   117: getfield argumentStack : I
/*     */     //   120: iconst_2
/*     */     //   121: imul
/*     */     //   122: putfield argumentStack : I
/*     */     //   125: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 0
/*     */     //   #120	-> 9
/*     */     //   #124	-> 49
/*     */     //   #13	-> 53
/*     */     //   #11	-> 83
/*     */     //   #85	-> 86
/*     */     //   #113	-> 109
/*     */     //   #125	-> 115
/*     */     //   #107	-> 125
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	18	21	java/lang/RuntimeException
/*     */     //   9	32	35	java/lang/RuntimeException
/*     */     //   25	43	43	java/lang/RuntimeException
/*     */     //   49	76	79	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   public void visitBaseType(char paramChar) {
/*     */     try {
/*     */       switch (paramChar) {
/*     */         case 'V':
/*     */           this.declaration.append("void");
/*     */           break;
/*     */         case 'B':
/*     */           this.declaration.append("byte");
/*     */           break;
/*     */         case 'J':
/*     */           this.declaration.append("long");
/*     */           break;
/*     */         case 'Z':
/*     */           this.declaration.append("boolean");
/*     */           break;
/*     */         case 'I':
/*     */           this.declaration.append("int");
/*     */           break;
/*     */         case 'S':
/*     */           this.declaration.append("short");
/*     */           break;
/*     */         case 'C':
/*     */           this.declaration.append("char");
/*     */           break;
/*     */         case 'F':
/*     */           this.declaration.append("float");
/*     */           break;
/*     */         default:
/*     */           this.declaration.append("double");
/*     */           break;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     endType();
/*     */   }
/*     */   
/*     */   public void visitTypeVariable(String paramString) {
/*     */     this.declaration.append(paramString);
/*     */     endType();
/*     */   }
/*     */   
/*     */   public String getExceptions() {
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (this.exceptions == null) ? null : this.exceptions.toString();
/*     */   }
/*     */   
/*     */   private TraceSignatureVisitor(StringBuilder paramStringBuilder) {
/*     */     super(327680);
/*     */     this.separator = "";
/*     */     this.declaration = paramStringBuilder;
/*     */   }
/*     */   
/*     */   public void visitTypeArgument() {
/*     */     try {
/*     */       if (this.argumentStack % 2 == 0) {
/*     */         this.argumentStack++;
/*     */         this.declaration.append('<');
/*     */       } else {
/*     */         this.declaration.append(", ");
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.declaration.append('?');
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitParameterType() {
/*     */     try {
/*     */       endFormals();
/*     */       if (this.seenParameter) {
/*     */         this.declaration.append(", ");
/*     */       } else {
/*     */         this.seenParameter = true;
/*     */         this.declaration.append('(');
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   private void endType() {
/*     */     try {
/*     */       if (this.arrayStack % 2 == 0) {
/*     */         this.arrayStack /= 2;
/*     */       } else {
/*     */         try {
/*     */           for (; this.arrayStack % 2 != 0; this.declaration.append("[]"))
/*     */             this.arrayStack /= 2; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitTypeArgument(char paramChar) {
/*     */     try {
/*     */       if (this.argumentStack % 2 == 0) {
/*     */         this.argumentStack++;
/*     */         this.declaration.append('<');
/*     */       } else {
/*     */         this.declaration.append(", ");
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramChar == '+') {
/*     */         this.declaration.append("? extends ");
/*     */       } else {
/*     */         try {
/*     */           if (paramChar == '-')
/*     */             this.declaration.append("? super "); 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitExceptionType() {
/*     */     try {
/*     */       if (this.exceptions == null) {
/*     */         this.exceptions = new StringBuilder();
/*     */       } else {
/*     */         this.exceptions.append(", ");
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return new TraceSignatureVisitor(this.exceptions);
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitReturnType() {
/*     */     try {
/*     */       endFormals();
/*     */       if (this.seenParameter) {
/*     */         this.seenParameter = false;
/*     */       } else {
/*     */         this.declaration.append('(');
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.declaration.append(')');
/*     */     this.returnType = new StringBuilder();
/*     */     return new TraceSignatureVisitor(this.returnType);
/*     */   }
/*     */   
/*     */   public SignatureVisitor visitInterface() {
/*     */     try {
/*     */       try {
/*     */       
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.separator = this.seenInterface ? ", " : (this.isInterface ? " extends " : " implements ");
/*     */     this.seenInterface = true;
/*     */     startType();
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\TraceSignatureVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */