package ixs.obt;

import java.math.BigInteger;

public class d extends Thread {
  private static volatile Object[] b;
  
  private final int O;
  
  private static final BigInteger[] y = new BigInteger[1];
  
  d(int paramInt) {
    this.O = paramInt;
  }
  
  public void run() {
    g(this.O, (Object)null);
  }
  
  private static final void g(int paramInt, Object paramObject) {
    byte[] arrayOfByte3;
    int[] arrayOfInt3;
    byte[] arrayOfByte2;
    char[] arrayOfChar;
    int[] arrayOfInt2;
    byte[] arrayOfByte1;
    int[] arrayOfInt1;
    BigInteger[] arrayOfBigInteger;
    int[] arrayOfInt6;
    byte b2;
    int[] arrayOfInt5;
    byte[] arrayOfByte4;
    long l;
    byte b1;
    int[] arrayOfInt4;
    BigInteger bigInteger1;
    int[] arrayOfInt8;
    int j;
    int[] arrayOfInt7;
    byte b3;
    byte[] arrayOfByte6;
    int i;
    byte[] arrayOfByte5;
    BigInteger bigInteger2;
    int[] arrayOfInt9;
    byte b4;
    byte[] arrayOfByte7;
    int k;
    BigInteger bigInteger3;
    int[] arrayOfInt10;
    byte b5;
    BigInteger bigInteger4;
    int[] arrayOfInt11;
    int m;
    BigInteger bigInteger5;
    byte b6;
    switch (paramInt) {
      case 0:
        arrayOfByte3 = new byte[256];
        arrayOfInt6 = new int[256];
        arrayOfInt8 = new int[256];
        arrayOfInt9 = new int[256];
        arrayOfInt10 = new int[256];
        b = new Object[] { arrayOfByte3, arrayOfInt6, arrayOfInt8, arrayOfInt9, arrayOfInt10, null, null };
        break;
      case 1:
        arrayOfInt3 = new int[256];
        b2 = 0;
        j = 1;
        while (b2 < 'Ā') {
          arrayOfInt3[b2] = j;
          j ^= j << 1 ^ (j >>> 7) * 283;
          b2++;
        } 
        g(2, arrayOfInt3);
        break;
      case 2:
        arrayOfByte2 = (byte[])b[0];
        arrayOfByte2[0] = 99;
        arrayOfInt5 = (int[])paramObject;
        for (j = 0; j < 255; j++) {
          int n = arrayOfInt5[255 - j];
          n |= n << 8;
          n ^= n >> 4 ^ n >> 5 ^ n >> 6 ^ n >> 7;
          arrayOfByte2[arrayOfInt5[j]] = (byte)(n ^ 0x63);
        } 
        arrayOfInt7 = (int[])b[1];
        arrayOfInt9 = (int[])b[2];
        arrayOfInt10 = (int[])b[3];
        arrayOfInt11 = (int[])b[4];
        for (b6 = 0; b6 < 'Ā'; b6++) {
          int n = arrayOfByte2[b6] & 0xFF;
          int i1 = n << 1 ^ (n >>> 7) * 283;
          int i2 = (n ^ i1) << 24 ^ n << 16 ^ n << 8 ^ i1;
          i2 &= 0xFFFFFFFF;
          arrayOfInt7[b6] = i2;
          arrayOfInt9[b6] = i2 << 8 | i2 >>> -8;
          arrayOfInt10[b6] = i2 << 16 | i2 >>> -16;
          arrayOfInt11[b6] = i2 << 24 | i2 >>> -24;
        } 
        break;
      case 3:
        arrayOfChar = "ᜎ削䝖ᘡ퐎峱炇뎆ڳ薔븆㭻釺♛⠝ꩳ髧棊䆏㩰郎䝛ꆼ?㤊錄衟㝮쌑騹ط?ର뾥㝄Ⱶ寺鴽棑Ǚ뿕랴䈘飠錆㓕랸㲤ꅮ?捁耕⛲頧蟌䚁꽭㭥쏪ᘚ᧓ꍪ鷛慲껦ἢ?쇛㉚舀⊌菻痮徊ᘋṂ?ꕻ棴㨠蛉ᶹ憎騙怌๫麁ၔ댬﻽餔?㆔듾挣㕅罕䒪倿খষ磅Ṽ?팞뛏㧑币བ䀭툆䰺".toCharArray();
        arrayOfByte4 = new byte[arrayOfChar.length * 2];
        for (b3 = 0; b3 < arrayOfChar.length; b3++) {
          arrayOfByte4[b3 * 2] = (byte)(arrayOfChar[b3] & 0xFF);
          arrayOfByte4[b3 * 2 + 1] = (byte)((arrayOfChar[b3] & 0xFF00) >> 8);
        } 
        arrayOfChar = "㉥熩靽㔫莰墁볒꫷붢輶ṭ뵒䘳朔姪綽⇑Ʌ⬣禾㋧빏旉洡挻롵暏㺂◠晱㐆応㑞특搔㼹焿萃쵀슭抮㕙㪍ꆏ蘶㈮㷶倩椦ూ衄펷⮥㝦蝠窓킕禟Ẑଯ貯咵ࠖ?♿툹傿?톋킆豑ꈲዋ쏼၉㱪㰡贍ᬃ䓋仵악啇࠿袧耿쪔ᱥ蹞ꓗᤄ夔貴༥䩍쵂ﾸｻ頓㠏ꭆᙄ严?홤潏랟뷾蒗镦꣓∺?쀟↽㠬浏헇ᮕ".toCharArray();
        arrayOfByte6 = new byte[arrayOfChar.length * 2];
        for (b4 = 0; b4 < arrayOfChar.length; b4++) {
          arrayOfByte6[b4 * 2] = (byte)(arrayOfChar[b4] & 0xFF);
          arrayOfByte6[b4 * 2 + 1] = (byte)((arrayOfChar[b4] & 0xFF00) >> 8);
        } 
        arrayOfByte7 = new byte[16];
        try {
          arrayOfByte7[0] = arrayOfByte4[arrayOfByte6[246] & 0xFF];
          arrayOfByte7[1] = arrayOfByte4[arrayOfByte6[179] & 0xFF];
          arrayOfByte7[2] = arrayOfByte4[arrayOfByte6[160] & 0xFF];
          arrayOfByte7[3] = arrayOfByte4[arrayOfByte6[207] & 0xFF];
          arrayOfByte7[4] = arrayOfByte4[arrayOfByte6[250] & 0xFF];
          arrayOfByte7[5] = arrayOfByte4[arrayOfByte6[24] & 0xFF];
          arrayOfByte7[6] = arrayOfByte4[arrayOfByte6[28] & 0xFF];
          arrayOfByte7[7] = arrayOfByte4[arrayOfByte6[242] & 0xFF];
        } catch (Exception exception) {
        
        } finally {
          arrayOfByte7[8] = arrayOfByte4[arrayOfByte6[217] & 0xFF];
          arrayOfByte7[9] = arrayOfByte4[arrayOfByte6[123] & 0xFF];
          arrayOfByte7[10] = arrayOfByte4[arrayOfByte6[29] & 0xFF];
          arrayOfByte7[11] = arrayOfByte4[arrayOfByte6[255] & 0xFF];
          arrayOfByte7[12] = arrayOfByte4[arrayOfByte6[159] & 0xFF];
          arrayOfByte7[13] = arrayOfByte4[arrayOfByte6[155] & 0xFF];
          arrayOfByte7[14] = arrayOfByte4[arrayOfByte6[97] & 0xFF];
          arrayOfByte7[15] = arrayOfByte4[arrayOfByte6[83] & 0xFF];
        } 
        g(5, arrayOfByte7);
        break;
      case 4:
        arrayOfInt2 = new int[4];
        arrayOfInt2[0] = -2071461996;
        arrayOfInt2[1] = -507018848;
        arrayOfInt2[2] = -168372898;
        arrayOfInt2[3] = -1556237850;
        l = 0x0L ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63L & 0x1L;
        arrayOfInt2[2] = arrayOfInt2[2] ^ (int)l;
        b[6] = arrayOfInt2;
        break;
      case 5:
        arrayOfByte1 = (byte[])paramObject;
        b1 = 4;
        k = b1 + 6;
        arrayOfInt10 = new int[(k + 1) * 4];
        i = 0;
        m = 0;
        try {
          while (m < 16) {
            arrayOfInt10[(i >> 2) * 4 + i & 0x3] = arrayOfByte1[m] & 0xFF | (arrayOfByte1[m + 1] & 0xFF) << 8 | (arrayOfByte1[m + 2] & 0xFF) << 16 | arrayOfByte1[m + 3] << 24;
            m += 4;
            i++;
          } 
        } catch (Exception exception) {}
        b[5] = arrayOfInt10;
        g(6, (Object)null);
        break;
      case 6:
        arrayOfInt1 = new int[30];
        b1 = 0;
        i = 1;
        while (b1 < 30) {
          arrayOfInt1[b1] = i;
          i = i << 1 ^ (i >>> 7) * 283;
          b1++;
        } 
        arrayOfInt4 = (int[])b[5];
        arrayOfByte5 = (byte[])b[0];
        k = 44;
        for (b5 = 4; b5 < k; b5++) {
          m = arrayOfInt4[(b5 - 1 >> 2) * 4 + (b5 - 1 & 0x3)];
          if (b5 % 4 == 0)
            m = r(arrayOfByte5, L(m, 8)) ^ arrayOfInt1[b5 / 4 - 1]; 
          arrayOfInt4[(b5 >> 2) * 4 + (b5 & 0x3)] = arrayOfInt4[(b5 - 4 >> 2) * 4 + (b5 - 4 & 0x3)] ^ m;
        } 
        break;
      case 7:
        arrayOfBigInteger = y;
        bigInteger1 = new BigInteger("10001", 16);
        bigInteger2 = new BigInteger("1h3s36wux5srq", 36);
        bigInteger3 = new BigInteger("h28khfg4lsnr", 36);
        bigInteger4 = new BigInteger("11u8r9kqxpdjl", 36);
        bigInteger5 = new BigInteger("4mk4rvedbljy", 36);
        for (b6 = 0; b6 < 4; b6++) {
          for (byte b = 0; b < 8; b++)
            bigInteger5 = bigInteger5.add(bigInteger3).xor(bigInteger4).modPow(bigInteger1, bigInteger2); 
          synchronized (arrayOfBigInteger) {
            while (arrayOfBigInteger[0] == null)
              arrayOfBigInteger.wait(5000L); 
            bigInteger3 = bigInteger3.xor(arrayOfBigInteger[0]);
            arrayOfBigInteger[0] = null;
          } 
        } 
        ((int[])b[6])[0] = ((int[])b[6])[0] ^ bigInteger5.intValue();
        break;
      case 8:
        arrayOfBigInteger = y;
        bigInteger1 = new BigInteger("10001", 16);
        bigInteger2 = new BigInteger("14sg4fc4e6qm3", 36);
        bigInteger3 = new BigInteger("1pg5bmwv0wkz1", 36);
        bigInteger4 = new BigInteger("1c46sn007avhk", 36);
        bigInteger5 = new BigInteger("1cen4hkbq71aq", 36);
        b6 = 0;
        while (b6 < 4) {
          for (byte b = 0; b < 8; b++)
            bigInteger5 = bigInteger5.add(bigInteger3).xor(bigInteger4).modPow(bigInteger1, bigInteger2); 
          while (true) {
            Thread.yield();
            synchronized (arrayOfBigInteger) {
              if (arrayOfBigInteger[0] != null) {
                arrayOfBigInteger.notifyAll();
                continue;
              } 
              arrayOfBigInteger[0] = bigInteger5;
              arrayOfBigInteger.notifyAll();
            } 
            b6++;
          } 
        } 
        ((int[])b[6])[1] = ((int[])b[6])[1] ^ bigInteger5.intValue();
        break;
    } 
  }
  
  private static final int L(int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramInt1;
    int j = paramInt2;
    int k = j + i >> 24;
    bool = false;
  }
  
  private static final int r(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = false;
    int i = paramArrayOfbyte[10] << 16;
    bool = false;
  }
  
  private static final void A4916() {
    g(0, (Object)null);
    b();
    d d1 = new d(1);
    d1.start();
    d1.join();
    d d2 = new d(3);
    d2.start();
    d d3 = new d(4);
    d3.start();
    d2.join();
    d3.join();
    d d4 = new d(7);
    d d5 = new d(8);
    d4.start();
    d5.start();
    d4.join();
    d5.join();
  }
  
  private static final void b() {
    boolean bool1 = false;
    boolean bool2 = false;
    bool2 = false;
  }
  
  static final String n(Object paramObject) {
    boolean bool1 = false;
    boolean bool2 = false;
    if (b == null)
      A4916(); 
    StringBuilder stringBuilder = new StringBuilder();
    this();
    String str = Thread.currentThread().getStackTrace()[((Integer)b[7]).intValue()].getClassName();
    stringBuilder = stringBuilder.append(str);
    str = Thread.currentThread().getStackTrace()[((Integer)b[7]).intValue()].getMethodName();
    int i = stringBuilder.append(str).toString().hashCode();
    int[] arrayOfInt2 = (int[])b[6];
    int k = i ^ arrayOfInt2[0];
    int m = i ^ arrayOfInt2[1];
    int n = i ^ arrayOfInt2[2];
    int j = i ^ arrayOfInt2[3];
    int[] arrayOfInt1 = (int[])b[5];
    int[] arrayOfInt3 = (int[])b[1];
    int[] arrayOfInt4 = (int[])b[2];
    int[] arrayOfInt5 = (int[])b[3];
    int[] arrayOfInt6 = (int[])b[4];
    byte[] arrayOfByte = (byte[])b[0];
    paramObject = ((String)paramObject).toCharArray();
    bool2 = false;
  }
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\ixs\obt\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */