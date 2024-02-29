package ixs.obt;

import java.math.BigInteger;

public class xq extends Thread {
  private static volatile Object[] y;
  
  private final int d;
  
  private static final BigInteger[] Y = new BigInteger[1];
  
  xq(int paramInt) {
    this.d = paramInt;
  }
  
  public void run() {
    q(this.d, (Object)null);
  }
  
  private static final void q(int paramInt, Object paramObject) {
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
        y = new Object[] { arrayOfByte3, arrayOfInt6, arrayOfInt8, arrayOfInt9, arrayOfInt10, null, null };
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
        q(2, arrayOfInt3);
        break;
      case 2:
        arrayOfByte2 = (byte[])y[0];
        arrayOfByte2[0] = 99;
        arrayOfInt5 = (int[])paramObject;
        for (j = 0; j < 255; j++) {
          int n = arrayOfInt5[255 - j];
          n |= n << 8;
          n ^= n >> 4 ^ n >> 5 ^ n >> 6 ^ n >> 7;
          arrayOfByte2[arrayOfInt5[j]] = (byte)(n ^ 0x63);
        } 
        arrayOfInt7 = (int[])y[1];
        arrayOfInt9 = (int[])y[2];
        arrayOfInt10 = (int[])y[3];
        arrayOfInt11 = (int[])y[4];
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
        arrayOfChar = "藃삇햛蓬術同牢㆕鉔蕗쐴汄ㄥ튗䴕쟪뮡產植쉡⢤纞胕ㇷ溚埾급盃۴ꂖꕞ꯯䭩诌嫝ള큦ꦐ㮬卶૒㺬쑥⎾뼌'鱉뗃앱怣螰쥙Ċ㼞㜀蒕֯Ⓖ퐍䗥帵鍼ᕽ쯜䇪懪䅁㘰?鸅䆬ꌱ㯫ↁ塱䂉ꄬ㬵?꒮㐬陥军⁢暕Ⱨ틡൜팈䀺탦ㅤߠ끈⻫䶼⦊␼闬⏅᝺勩맜ඤ涳㠰⎧s䍢굡?岫潑뚌ᴧ즌".toCharArray();
        arrayOfByte4 = new byte[arrayOfChar.length * 2];
        for (b3 = 0; b3 < arrayOfChar.length; b3++) {
          arrayOfByte4[b3 * 2] = (byte)(arrayOfChar[b3] & 0xFF);
          arrayOfByte4[b3 * 2 + 1] = (byte)((arrayOfChar[b3] & 0xFF00) >> 8);
        } 
        arrayOfChar = "ờ㭣낺뺕?⢄醖㾓頌鐎፛䖚ﶋ歩愬㩼슣⒖ቇ猡׻ピ㨢駦툝??מ뱡錁굅輦֐तİ䌮ᷭꮜ쐥䮚㓻㊶㌥煗ꩉ巽ﹺ꽨毥꼙ፑ᪷⍣앙ಷᖔ唦ⷒ產纀砧鹬ø䇶ﱫ皙ᤈ뮤귎䝼驜釔?吋毴ᙎ苬⺢蓳橤鉎䡁ੲ๭棰쀗윪緽꫗㘻쏊?ࡦや욓ㇼ䢁⁔憎壑죇翌踓䏤ⱪ髏鳁㫽밷캘쌸졌벙뜏毬".toCharArray();
        arrayOfByte6 = new byte[arrayOfChar.length * 2];
        for (b4 = 0; b4 < arrayOfChar.length; b4++) {
          arrayOfByte6[b4 * 2] = (byte)(arrayOfChar[b4] & 0xFF);
          arrayOfByte6[b4 * 2 + 1] = (byte)((arrayOfChar[b4] & 0xFF00) >> 8);
        } 
        arrayOfByte7 = new byte[16];
        try {
          arrayOfByte7[0] = arrayOfByte4[arrayOfByte6[213] & 0xFF];
          arrayOfByte7[1] = arrayOfByte4[arrayOfByte6[33] & 0xFF];
          arrayOfByte7[2] = arrayOfByte4[arrayOfByte6[102] & 0xFF];
          arrayOfByte7[3] = arrayOfByte4[arrayOfByte6[143] & 0xFF];
          arrayOfByte7[4] = arrayOfByte4[arrayOfByte6[39] & 0xFF];
          arrayOfByte7[5] = arrayOfByte4[arrayOfByte6[215] & 0xFF];
          arrayOfByte7[6] = arrayOfByte4[arrayOfByte6[106] & 0xFF];
          arrayOfByte7[7] = arrayOfByte4[arrayOfByte6[192] & 0xFF];
        } catch (Exception exception) {
        
        } finally {
          arrayOfByte7[8] = arrayOfByte4[arrayOfByte6[15] & 0xFF];
          arrayOfByte7[9] = arrayOfByte4[arrayOfByte6[182] & 0xFF];
          arrayOfByte7[10] = arrayOfByte4[arrayOfByte6[76] & 0xFF];
          arrayOfByte7[11] = arrayOfByte4[arrayOfByte6[249] & 0xFF];
          arrayOfByte7[12] = arrayOfByte4[arrayOfByte6[89] & 0xFF];
          arrayOfByte7[13] = arrayOfByte4[arrayOfByte6[154] & 0xFF];
          arrayOfByte7[14] = arrayOfByte4[arrayOfByte6[169] & 0xFF];
          arrayOfByte7[15] = arrayOfByte4[arrayOfByte6[187] & 0xFF];
        } 
        q(5, arrayOfByte7);
        break;
      case 4:
        arrayOfInt2 = new int[4];
        arrayOfInt2[0] = 1945038419;
        arrayOfInt2[1] = -1630688384;
        arrayOfInt2[2] = 813358450;
        arrayOfInt2[3] = 1003347235;
        l = 0x0L ^ Long.MAX_VALUE - System.currentTimeMillis() >> 63L & 0x1L;
        arrayOfInt2[2] = arrayOfInt2[2] ^ (int)l;
        y[6] = arrayOfInt2;
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
        y[5] = arrayOfInt10;
        q(6, (Object)null);
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
        arrayOfInt4 = (int[])y[5];
        arrayOfByte5 = (byte[])y[0];
        k = 44;
        for (b5 = 4; b5 < k; b5++) {
          m = arrayOfInt4[(b5 - 1 >> 2) * 4 + (b5 - 1 & 0x3)];
          if (b5 % 4 == 0)
            m = o(arrayOfByte5, Z(m, 8)) ^ arrayOfInt1[b5 / 4 - 1]; 
          arrayOfInt4[(b5 >> 2) * 4 + (b5 & 0x3)] = arrayOfInt4[(b5 - 4 >> 2) * 4 + (b5 - 4 & 0x3)] ^ m;
        } 
        break;
      case 7:
        arrayOfBigInteger = Y;
        bigInteger1 = new BigInteger("10001", 16);
        bigInteger2 = new BigInteger("5qfflq21mk63", 36);
        bigInteger3 = new BigInteger("d1jy9ttlrff5", 36);
        bigInteger4 = new BigInteger("116q6pblrl3f8", 36);
        bigInteger5 = new BigInteger("1fhw6m611y98q", 36);
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
        ((int[])y[6])[0] = ((int[])y[6])[0] ^ bigInteger5.intValue();
        break;
      case 8:
        arrayOfBigInteger = Y;
        bigInteger1 = new BigInteger("10001", 16);
        bigInteger2 = new BigInteger("npv8ax3d48my", 36);
        bigInteger3 = new BigInteger("gaymucjrfrt", 36);
        bigInteger4 = new BigInteger("1hqi3i7lqm1k2", 36);
        bigInteger5 = new BigInteger("rbzjph6i8t65", 36);
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
        ((int[])y[6])[1] = ((int[])y[6])[1] ^ bigInteger5.intValue();
        break;
    } 
  }
  
  private static final int Z(int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramInt1;
    int j = paramInt2;
    int k = j + i >> 24;
    bool = false;
  }
  
  private static final int o(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = false;
    int i = paramArrayOfbyte[10] << 16;
    bool = false;
  }
  
  private static final void l4703() {
    q(0, (Object)null);
    Q();
    xq xq1 = new xq(1);
    xq1.start();
    xq1.join();
    xq xq2 = new xq(3);
    xq2.start();
    xq xq3 = new xq(4);
    xq3.start();
    xq2.join();
    xq3.join();
    xq xq4 = new xq(7);
    xq xq5 = new xq(8);
    xq4.start();
    xq5.start();
    xq4.join();
    xq5.join();
  }
  
  private static final void Q() {
    boolean bool1 = false;
    boolean bool2 = false;
    bool2 = false;
  }
  
  static final String V(Object paramObject) {
    boolean bool1 = false;
    boolean bool2 = false;
    if (y == null)
      l4703(); 
    StringBuilder stringBuilder = new StringBuilder();
    this();
    String str = Thread.currentThread().getStackTrace()[((Integer)y[7]).intValue()].getClassName();
    stringBuilder = stringBuilder.append(str);
    str = Thread.currentThread().getStackTrace()[((Integer)y[7]).intValue()].getMethodName();
    int i = stringBuilder.append(str).toString().hashCode();
    int[] arrayOfInt2 = (int[])y[6];
    int k = i ^ arrayOfInt2[0];
    int m = i ^ arrayOfInt2[1];
    int n = i ^ arrayOfInt2[2];
    int j = i ^ arrayOfInt2[3];
    int[] arrayOfInt1 = (int[])y[5];
    int[] arrayOfInt3 = (int[])y[1];
    int[] arrayOfInt4 = (int[])y[2];
    int[] arrayOfInt5 = (int[])y[3];
    int[] arrayOfInt6 = (int[])y[4];
    byte[] arrayOfByte = (byte[])y[0];
    paramObject = ((String)paramObject).toCharArray();
    bool2 = false;
  }
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\ixs\obt\xq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */