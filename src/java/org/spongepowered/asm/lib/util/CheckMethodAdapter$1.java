/*  1 */ package org.spongepowered.asm.lib.util;class CheckMethodAdapter$1 extends MethodNode { CheckMethodAdapter$1(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { super(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   final MethodVisitor val$cmv;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void visitEnd() {
/* 16 */     Analyzer<BasicValue> analyzer = new Analyzer((Interpreter)new BasicVerifier());
/*    */     try {
/*    */       analyzer.analyze("dummy", this);
/*    */     } catch (Exception exception) {
/*    */       try {
/*    */         if (exception instanceof IndexOutOfBoundsException)
/*    */           try {
/*    */             if (this.maxLocals == 0)
/*    */               try {
/*    */                 if (this.maxStack == 0)
/*    */                   throw new RuntimeException("Data flow checking option requires valid, non zero maxLocals and maxStack values."); 
/*    */               } catch (Exception exception1) {
/*    */                 throw b(null);
/*    */               }  
/*    */           } catch (Exception exception1) {
/*    */             throw b(null);
/*    */           }  
/*    */       } catch (Exception exception1) {
/*    */         throw b(null);
/*    */       } 
/*    */       exception.printStackTrace();
/*    */       StringWriter stringWriter = new StringWriter();
/*    */       PrintWriter printWriter = new PrintWriter(stringWriter, true);
/*    */       CheckClassAdapter.printAnalyzerResult(this, analyzer, printWriter);
/*    */       printWriter.close();
/*    */       throw new RuntimeException(exception.getMessage() + ' ' + stringWriter.toString());
/*    */     } 
/*    */     accept(cmv);
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckMethodAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */