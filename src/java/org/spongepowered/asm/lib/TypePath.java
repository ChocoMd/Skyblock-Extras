/*    */ package org.spongepowered.asm.lib;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TypePath
/*    */ {
/*    */   public static final int ARRAY_ELEMENT = 0;
/*    */   public static final int INNER_TYPE = 1;
/*    */   public static final int WILDCARD_BOUND = 2;
/*    */   public static final int TYPE_ARGUMENT = 3;
/*    */   byte[] b;
/*    */   int offset;
/*    */   
/*    */   TypePath(byte[] paramArrayOfbyte, int paramInt) {
/* 20 */     this.b = paramArrayOfbyte;
/*    */     this.offset = paramInt;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String toString() {
/*    */     int i = getLength();
/* 29 */     StringBuilder stringBuilder = new StringBuilder(i * 2);
/*    */ 
/*    */     
/*    */     byte b = 0;
/*    */     
/*    */     while (true)
/*    */     { 
/*    */       try { if (b < i)
/*    */         { 
/* 38 */           try { switch (getStep(b))
/*    */             
/*    */             { 
/*    */ 
/*    */               
/*    */               case 0:
/* 44 */                 stringBuilder.append('['); break;case 1: stringBuilder.append('.'); break;case 2: stringBuilder.append('*'); break;case 3: stringBuilder.append(getStepArgument(b)).append(';'); break;
/*    */               default: stringBuilder.append('_'); break; }  } catch (RuntimeException runtimeException) { throw b(null); }  b++; continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  break; }  return stringBuilder.toString(); } public static TypePath fromString(String paramString) { try { if (paramString != null)
/* 46 */         try { if (paramString.length() != 0) { int i = paramString.length(); ByteVector byteVector = new ByteVector(i); byteVector.putByte(0); for (byte b = 0; b < i; ) { char c = paramString.charAt(b++); try { if (c == '[') { byteVector.put11(0, 0); continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (c == '.') { byteVector.put11(1, 0); continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (c == '*') { byteVector.put11(2, 0); continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (c >= '0' && c <= '9') { int j = c - 48; while (b < i) { try { if ((c = paramString.charAt(b)) >= '0' && c <= '9') { j = j * 10 + c - 48; b++; }
/*    */                        }
/*    */                     catch (RuntimeException runtimeException)
/*    */                     { throw b(null); }
/*    */                      }
/*    */                    }
/*    */                  }
/*    */               catch (RuntimeException runtimeException)
/*    */               { throw b(null); }
/*    */                }
/*    */             
/*    */             byteVector.data[0] = (byte)(byteVector.length / 2);
/*    */             return new TypePath(byteVector.data, 0); }
/*    */           
/*    */           return null; }
/*    */         catch (RuntimeException runtimeException)
/*    */         { throw b(null); }
/*    */           }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*    */     
/*    */     return null; }
/*    */ 
/*    */   
/*    */   public int getLength() {
/*    */     return this.b[this.offset];
/*    */   }
/*    */   
/*    */   public int getStep(int paramInt) {
/*    */     return this.b[this.offset + 2 * paramInt + 1];
/*    */   }
/*    */   
/*    */   public int getStepArgument(int paramInt) {
/*    */     return this.b[this.offset + 2 * paramInt + 2];
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\TypePath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */