/*     */ package org.spongepowered.asm.lib.util;public class CheckSignatureAdapter extends SignatureVisitor { public static final int CLASS_SIGNATURE = 0; public static final int METHOD_SIGNATURE = 1; public static final int TYPE_SIGNATURE = 2; private static final int EMPTY = 1; private static final int FORMAL = 2; private static final int BOUND = 4; private static final int SUPER = 8; private static final int PARAM = 16; private static final int RETURN = 32; private static final int SIMPLE_TYPE = 64; private static final int CLASS_TYPE = 128; private static final int END = 256; private final int type; private int state;
/*     */   private boolean canBeVoid;
/*     */   private final SignatureVisitor sv;
/*     */   
/*     */   public void visitClassType(String paramString) { try {
/*   6 */       if (this.type == 2) try { if (this.state == 1) {
/*     */ 
/*     */             
/*     */             try {
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
/*  55 */               CheckMethodAdapter.checkInternalName(paramString, "class name"); this.state = 128; if (this.sv != null)
/*     */                 this.sv.visitClassType(paramString); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  return;
/*     */           }  throw new IllegalStateException(); }
/*     */         catch (IllegalStateException illegalStateException)
/*     */         { throw b(null); }
/*     */          
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     }  throw new IllegalStateException(); } public SignatureVisitor visitClassBound() { try {
/*     */       if (this.state != 2)
/*     */         throw new IllegalStateException(); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     }  
/*     */     try { this.state = 4; }
/*     */     catch (IllegalStateException illegalStateException)
/*  74 */     { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitClassBound();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     return new CheckSignatureAdapter(2, signatureVisitor); }
/*     */   public void visitEnd() { try { if (this.state != 128)
/*     */         throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { this.state = 256; if (this.sv != null)
/*     */         this.sv.visitEnd();  } catch (IllegalStateException illegalStateException) { throw b(null); }  }
/*     */   public SignatureVisitor visitTypeArgument(char paramChar) { try { if (this.state != 128)
/*     */         throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if ("+-=".indexOf(paramChar) == -1)
/*     */         throw new IllegalArgumentException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitTypeArgument(paramChar); return new CheckSignatureAdapter(2, signatureVisitor); }
/*     */   public SignatureVisitor visitInterface() { try { if (this.state != 8)
/*     */         throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitInterface(); return new CheckSignatureAdapter(2, signatureVisitor); }
/*     */   public SignatureVisitor visitSuperclass() { try { if (this.type == 0)
/*     */         try { if ((this.state & 0x7) != 0) { try { this.state = 8; } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitSuperclass(); return new CheckSignatureAdapter(2, signatureVisitor); }  throw new IllegalArgumentException(); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalArgumentException(); } public void visitInnerClassType(String paramString) { try { if (this.state != 128)
/*     */         throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { CheckMethodAdapter.checkIdentifier(paramString, "inner class name"); if (this.sv != null)
/*  96 */         this.sv.visitInnerClassType(paramString);  } catch (IllegalStateException illegalStateException) { throw b(null); }  }
/*  97 */   public SignatureVisitor visitArrayType() { try { if (this.type == 2) try { if (this.state == 1) { try { this.state = 64; } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitArrayType(); return new CheckSignatureAdapter(2, signatureVisitor); }  throw new IllegalStateException(); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalStateException(); } public void visitTypeArgument() { try { if (this.state != 128) throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if (this.sv != null) this.sv.visitTypeArgument();  } catch (IllegalStateException illegalStateException) { throw b(null); }  } public void visitBaseType(char paramChar) { try { if (this.type == 2) try { if (this.state == 1) { try { if (paramChar == 'V') { try { if (!this.canBeVoid) throw new IllegalArgumentException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  } else { try { if ("ZCBSIFJD".indexOf(paramChar) == -1) throw new IllegalArgumentException();  } catch (IllegalStateException illegalStateException) { throw b(null); }  }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { this.state = 64; if (this.sv != null) this.sv.visitBaseType(paramChar);  } catch (IllegalStateException illegalStateException) { throw b(null); }  return; }  throw new IllegalStateException(); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalStateException(); } public CheckSignatureAdapter(int paramInt, SignatureVisitor paramSignatureVisitor) { this(327680, paramInt, paramSignatureVisitor); } public SignatureVisitor visitInterfaceBound() { try { if (this.state != 2) try { if (this.state != 4) throw new IllegalArgumentException();  } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitInterfaceBound(); return new CheckSignatureAdapter(2, signatureVisitor); } public SignatureVisitor visitReturnType() { try { if (this.type == 1) try { if ((this.state & 0x17) != 0) { try { this.state = 32; } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitReturnType(); CheckSignatureAdapter checkSignatureAdapter = new CheckSignatureAdapter(2, signatureVisitor); checkSignatureAdapter.canBeVoid = true; return checkSignatureAdapter; }  throw new IllegalArgumentException(); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalArgumentException(); }
/*     */   protected CheckSignatureAdapter(int paramInt1, int paramInt2, SignatureVisitor paramSignatureVisitor) { super(paramInt1); this.type = paramInt2; this.state = 1; this.sv = paramSignatureVisitor; }
/*  99 */   public SignatureVisitor visitParameterType() { try { if (this.type == 1) try { if ((this.state & 0x17) != 0) { try { this.state = 16; } catch (IllegalStateException illegalStateException) { throw b(null); }  SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitParameterType(); return new CheckSignatureAdapter(2, signatureVisitor); }  throw new IllegalArgumentException(); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalArgumentException(); } public void visitFormalTypeParameter(String paramString) { try { if (this.type != 2) { try { if (this.state != 1) try { if (this.state != 2) try { if (this.state != 4) throw new IllegalStateException();  } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  } else { throw new IllegalStateException(); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { CheckMethodAdapter.checkIdentifier(paramString, "formal type parameter"); this.state = 2; if (this.sv != null) this.sv.visitFormalTypeParameter(paramString);  } catch (IllegalStateException illegalStateException) { throw b(null); }  }
/*     */   public void visitTypeVariable(String paramString) { try { if (this.type == 2)
/* 101 */         try { if (this.state == 1) { try { CheckMethodAdapter.checkIdentifier(paramString, "type variable"); this.state = 64;
/*     */               if (this.sv != null)
/*     */                 this.sv.visitTypeVariable(paramString);  }
/*     */             catch (IllegalStateException illegalStateException)
/*     */             { throw b(null); }
/*     */             
/*     */             return; }
/*     */           
/*     */           throw new IllegalStateException(); }
/*     */         catch (IllegalStateException illegalStateException)
/*     */         { throw b(null); }
/*     */           }
/*     */     catch (IllegalStateException illegalStateException)
/*     */     { throw b(null); }
/*     */     
/*     */     throw new IllegalStateException(); }
/*     */ 
/*     */   
/*     */   public SignatureVisitor visitExceptionType() {
/*     */     try {
/*     */       if (this.state != 32)
/*     */         throw new IllegalStateException(); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     SignatureVisitor signatureVisitor = (this.sv == null) ? null : this.sv.visitExceptionType();
/*     */     return new CheckSignatureAdapter(2, signatureVisitor);
/*     */   }
/*     */   
/*     */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*     */     return paramIllegalStateException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckSignatureAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */