/*     */ package org.spongepowered.asm.lib;
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
/*     */ public class ByteVector
/*     */ {
/*     */   byte[] data;
/*     */   int length;
/*     */   
/*     */   public ByteVector(int paramInt) {
/* 107 */     this.data = new byte[paramInt];
/*     */   } private void enlarge(int paramInt) { int i = 2 * this.data.length; int j = this.length + paramInt; try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     }  byte[] arrayOfByte = new byte[(i > j) ? i : j]; System.arraycopy(this.data, 0, arrayOfByte, 0, this.length); this.data = arrayOfByte; } ByteVector encodeUTF8(String paramString, int paramInt1, int paramInt2) { int i = paramString.length(); int j = paramInt1;
/*     */     int k;
/*     */     for (k = paramInt1; k < i; ) {
/*     */       continue;
/*     */       c = paramString.charAt(k);
/*     */     } 
/*     */     
/* 119 */     try { if (j > paramInt2)
/*     */         throw new IllegalArgumentException();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  k = this.length - paramInt1 - 2; try { if (k >= 0) { this.data[k] = (byte)(j >>> 8); this.data[k + 1] = (byte)j; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (this.length + j - paramInt1 > this.data.length)
/*     */         enlarge(j - paramInt1);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  int m = this.length; for (int n = paramInt1; n < i; ) { continue; c = paramString.charAt(n); }  this.length = m; return this; } public ByteVector putInt(int paramInt) { int i = this.length; try { if (i + 4 > this.data.length)
/*     */         enlarge(4);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/* 123 */      byte[] arrayOfByte = this.data; arrayOfByte[i++] = (byte)(paramInt >>> 24); arrayOfByte[i++] = (byte)(paramInt >>> 16); arrayOfByte[i++] = (byte)(paramInt >>> 8); arrayOfByte[i++] = (byte)paramInt; this.length = i; return this; }
/*     */   ByteVector put11(int paramInt1, int paramInt2) { int i = this.length; try { if (i + 2 > this.data.length) enlarge(2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  byte[] arrayOfByte = this.data; arrayOfByte[i++] = (byte)paramInt1; arrayOfByte[i++] = (byte)paramInt2; this.length = i; return this; } public ByteVector putShort(int paramInt) { int i = this.length; try { if (i + 2 > this.data.length)
/* 125 */         enlarge(2);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  byte[] arrayOfByte = this.data; arrayOfByte[i++] = (byte)(paramInt >>> 8);
/*     */     arrayOfByte[i++] = (byte)paramInt;
/*     */     this.length = i;
/*     */     return this; }
/*     */ 
/*     */   
/*     */   public ByteVector() {
/*     */     this.data = new byte[64];
/*     */   }
/*     */   
/*     */   public ByteVector putUTF8(String paramString) {
/*     */     int i = paramString.length();
/*     */     try {
/*     */       if (i > 65535)
/*     */         throw new IllegalArgumentException(); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     int j = this.length;
/*     */     try {
/*     */       if (j + 2 + i > this.data.length)
/*     */         enlarge(2 + i); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte[] arrayOfByte = this.data;
/*     */     arrayOfByte[j++] = (byte)(i >>> 8);
/*     */     arrayOfByte[j++] = (byte)i;
/*     */     for (byte b = 0; b < i; ) {
/*     */       continue;
/*     */       c = paramString.charAt(b);
/*     */     } 
/*     */     this.length = j;
/*     */     return this;
/*     */   }
/*     */   
/*     */   public ByteVector putLong(long paramLong) {
/*     */     int i = this.length;
/*     */     try {
/*     */       if (i + 8 > this.data.length)
/*     */         enlarge(8); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte[] arrayOfByte = this.data;
/*     */     int j = (int)(paramLong >>> 32L);
/*     */     arrayOfByte[i++] = (byte)(j >>> 24);
/*     */     arrayOfByte[i++] = (byte)(j >>> 16);
/*     */     arrayOfByte[i++] = (byte)(j >>> 8);
/*     */     arrayOfByte[i++] = (byte)j;
/*     */     j = (int)paramLong;
/*     */     arrayOfByte[i++] = (byte)(j >>> 24);
/*     */     arrayOfByte[i++] = (byte)(j >>> 16);
/*     */     arrayOfByte[i++] = (byte)(j >>> 8);
/*     */     arrayOfByte[i++] = (byte)j;
/*     */     this.length = i;
/*     */     return this;
/*     */   }
/*     */   
/*     */   public ByteVector putByte(int paramInt) {
/*     */     int i = this.length;
/*     */     try {
/*     */       if (i + 1 > this.data.length)
/*     */         enlarge(1); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.data[i++] = (byte)paramInt;
/*     */     this.length = i;
/*     */     return this;
/*     */   }
/*     */   
/*     */   public ByteVector putByteArray(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*     */     try {
/*     */       if (this.length + paramInt2 > this.data.length)
/*     */         enlarge(paramInt2); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramArrayOfbyte != null)
/*     */         System.arraycopy(paramArrayOfbyte, paramInt1, this.data, this.length, paramInt2); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.length += paramInt2;
/*     */     return this;
/*     */   }
/*     */   
/*     */   ByteVector put12(int paramInt1, int paramInt2) {
/*     */     int i = this.length;
/*     */     try {
/*     */       if (i + 3 > this.data.length)
/*     */         enlarge(3); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte[] arrayOfByte = this.data;
/*     */     arrayOfByte[i++] = (byte)paramInt1;
/*     */     arrayOfByte[i++] = (byte)(paramInt2 >>> 8);
/*     */     arrayOfByte[i++] = (byte)paramInt2;
/*     */     this.length = i;
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\ByteVector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */