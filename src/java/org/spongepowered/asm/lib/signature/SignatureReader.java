/*    */ package org.spongepowered.asm.lib.signature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SignatureReader
/*    */ {
/*    */   private final String signature;
/*    */   
/*    */   public void acceptType(SignatureVisitor paramSignatureVisitor) {
/* 14 */     parseType(this.signature, 0, paramSignatureVisitor);
/*    */   }
/* 16 */   public void accept(SignatureVisitor paramSignatureVisitor) { String str = this.signature;
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
/* 47 */     int i = str.length();
/*    */     
/*    */     if (str.charAt(0) == '<') {
/* 50 */       int k = 2;
/*    */       while (true) {
/*    */         int m = str.indexOf(':', k);
/*    */         paramSignatureVisitor.visitFormalTypeParameter(str.substring(k - 1, m));
/*    */         k = m + 1;
/*    */         char c = str.charAt(k);
/*    */       } 
/*    */     } 
/*    */     int j = 0;
/*    */     
/*    */     try { if (str.charAt(j) == '(')
/*    */       { j++;
/*    */         while (str.charAt(j) != ')') {
/*    */           j = parseType(str, j, paramSignatureVisitor.visitParameterType());
/*    */         }
/* 65 */         j = parseType(str, j + 1, paramSignatureVisitor.visitReturnType()); while (j < i)
/*    */           j = parseType(str, j + 1, paramSignatureVisitor.visitExceptionType());  } else { j = parseType(str, j, paramSignatureVisitor.visitSuperclass()); while (j < i)
/*    */           j = parseType(str, j, paramSignatureVisitor.visitInterface());  }  } catch (RuntimeException runtimeException) { throw b(null); }  } private static int parseType(String paramString, int paramInt, SignatureVisitor paramSignatureVisitor) { char c; try { int j; switch (c = paramString.charAt(paramInt++)) { case 'B': case 'C': case 'D': case 'F': case 'I': case 'J': case 'S': case 'V': case 'Z':
/* 68 */           paramSignatureVisitor.visitBaseType(c); return paramInt;
/*    */         case '[': return parseType(paramString, paramInt, paramSignatureVisitor.visitArrayType());
/*    */         case 'T': j = paramString.indexOf(';', paramInt); paramSignatureVisitor.visitTypeVariable(paramString.substring(paramInt, j)); return j + 1; }  } catch (RuntimeException runtimeException) { throw b(null); }  int i = paramInt; boolean bool1 = false; boolean bool2 = false; label52: while (true) { String str; switch (c = paramString.charAt(paramInt++)) { case '.': case ';':
/* 71 */           if (!bool1) { String str1 = paramString.substring(i, paramInt - 1); try { if (bool2) { paramSignatureVisitor.visitInnerClassType(str1); } else { paramSignatureVisitor.visitClassType(str1); }  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */              }
/*    */           
/*    */           try {
/*    */             if (c == ';') {
/*    */               paramSignatureVisitor.visitEnd();
/*    */               return paramInt;
/*    */             } 
/*    */           } catch (RuntimeException runtimeException) {
/*    */             throw b(null);
/*    */           } 
/*    */           i = paramInt;
/*    */           bool1 = false;
/*    */           bool2 = true;
/*    */         case '<':
/*    */           str = paramString.substring(i, paramInt - 1);
/*    */           try {
/*    */             if (bool2) {
/*    */               paramSignatureVisitor.visitInnerClassType(str);
/*    */             } else {
/*    */               paramSignatureVisitor.visitClassType(str);
/*    */             } 
/*    */           } catch (RuntimeException runtimeException) {
/*    */             throw b(null);
/*    */           } 
/*    */           bool1 = true;
/*    */           for (;; paramInt = parseType(paramString, paramInt, paramSignatureVisitor.visitTypeArgument('='))) {
/*    */             switch (c = paramString.charAt(paramInt)) {
/*    */               case '>':
/*    */                 continue label52;
/*    */               case '*':
/*    */                 paramInt++;
/*    */                 paramSignatureVisitor.visitTypeArgument();
/*    */                 continue;
/*    */               case '+':
/*    */               case '-':
/*    */                 paramInt = parseType(paramString, paramInt + 1, paramSignatureVisitor.visitTypeArgument(c));
/*    */                 continue;
/*    */             } 
/*    */           } 
/*    */           break; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public SignatureReader(String paramString) {
/*    */     this.signature = paramString;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\signature\SignatureReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */