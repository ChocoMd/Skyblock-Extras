/*     */ package org.spongepowered.asm.lib;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class Frame
/*     */ {
/*     */   static final int DIM = -268435456;
/*     */   static final int ARRAY_OF = 268435456;
/*     */   static final int ELEMENT_OF = -268435456;
/*     */   static final int KIND = 251658240;
/*     */   static final int TOP_IF_LONG_OR_DOUBLE = 8388608;
/*     */   static final int VALUE = 8388607;
/*     */   static final int BASE_KIND = 267386880;
/*     */   static final int BASE_VALUE = 1048575;
/*     */   static final int BASE = 16777216;
/*     */   static final int OBJECT = 24117248;
/*     */   static final int UNINITIALIZED = 25165824;
/*     */   private static final int LOCAL = 33554432;
/*     */   private static final int STACK = 50331648;
/*     */   static final int TOP = 16777216;
/*     */   static final int BOOLEAN = 16777225;
/*     */   static final int BYTE = 16777226;
/*     */   
/*     */   private int init(ClassWriter paramClassWriter, int paramInt) {
/*     */     int i;
/*  27 */     if (paramInt == 16777222) {
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
/* 295 */       i = 0x1700000 | paramClassWriter.addType(paramClassWriter.thisName);
/*     */     } else if ((paramInt & 0xFFF00000) == 25165824) {
/*     */       String str = (paramClassWriter.typeTable[paramInt & 0xFFFFF]).strVal1;
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
/*     */       i = 0x1700000 | paramClassWriter.addType(str);
/*     */     } else {
/* 485 */       return paramInt;
/*     */     } 
/*     */     for (byte b = 0; b < this.initializationCount; ) {
/*     */       int j = this.initializations[b];
/*     */       int k = j & 0xF0000000;
/*     */       int m = j & 0xF000000;
/*     */       if (m == 33554432) {
/*     */         j = k + this.inputLocals[j & 0x7FFFFF];
/*     */       } else if (m == 50331648) {
/*     */         j = k + this.inputStack[this.inputStack.length - (j & 0x7FFFFF)];
/*     */       } 
/*     */       try {
/*     */         if (paramInt == j)
/*     */           return i; 
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */       b++;
/*     */     } 
/*     */     return paramInt;
/*     */   }
/*     */   
/*     */   static final int CHAR = 16777227;
/*     */   static final int SHORT = 16777228;
/*     */   static final int INTEGER = 16777217;
/*     */   static final int FLOAT = 16777218;
/*     */   static final int DOUBLE = 16777219;
/*     */   static final int LONG = 16777220;
/*     */   static final int NULL = 16777221;
/*     */   static final int UNINITIALIZED_THIS = 16777222;
/*     */   static final int[] SIZE;
/*     */   Label owner;
/*     */   int[] inputLocals;
/*     */   int[] inputStack;
/*     */   private int[] outputLocals;
/*     */   private int[] outputStack;
/*     */   int outputStackTop;
/*     */   private int initializationCount;
/*     */   private int[] initializations;
/*     */   
/*     */   private void push(ClassWriter paramClassWriter, String paramString) {
/*     */     int i = type(paramClassWriter, paramString);
/*     */     try {
/*     */       if (i != 0) {
/*     */         try {
/*     */           push(i);
/*     */           if (i != 16777220) {
/*     */             try {
/*     */               if (i == 16777219) {
/*     */                 push(16777216);
/*     */                 return;
/*     */               } 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */             return;
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } else {
/*     */         return;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     push(16777216);
/*     */   }
/*     */   
/*     */   private void pop(String paramString) {
/*     */     char c = paramString.charAt(0);
/*     */     try {
/*     */       if (c == '(') {
/*     */         pop((Type.getArgumentsAndReturnSizes(paramString) >> 2) - 1);
/*     */       } else {
/*     */         try {
/*     */           if (c != 'J') {
/*     */             try {
/*     */               if (c == 'D')
/*     */                 pop(2); 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */             pop(1);
/*     */             return;
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */         pop(2);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   final boolean merge(ClassWriter paramClassWriter, Frame paramFrame, int paramInt) {
/*     */     boolean bool = false;
/*     */     int i = this.inputLocals.length;
/*     */     int j = this.inputStack.length;
/*     */     if (paramFrame.inputLocals == null) {
/*     */       paramFrame.inputLocals = new int[i];
/*     */       bool = true;
/*     */     } 
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < i) {
/*     */           try {
/*     */             if (this.outputLocals != null && b < this.outputLocals.length) {
/*     */               int m = this.outputLocals[b];
/*     */               if (m == 0) {
/*     */                 int n = this.inputLocals[b];
/*     */               } else {
/*     */                 int n = m & 0xF0000000;
/*     */                 int i1 = m & 0xF000000;
/*     */               } 
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           int k = this.inputLocals[b];
/*     */         } 
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } 
/*     */     throw b(paramInt > 0);
/*     */   }
/*     */   
/*     */   static {
/*     */     int[] arrayOfInt = new int[202];
/*     */     String str = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE";
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < arrayOfInt.length) {
/*     */         arrayOfInt[b] = str.charAt(b) - 69;
/*     */         b++;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     SIZE = arrayOfInt;
/*     */   }
/*     */   
/*     */   private void set(int paramInt1, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield outputLocals : [I
/*     */     //   4: ifnonnull -> 22
/*     */     //   7: aload_0
/*     */     //   8: bipush #10
/*     */     //   10: newarray int
/*     */     //   12: putfield outputLocals : [I
/*     */     //   15: goto -> 22
/*     */     //   18: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   21: athrow
/*     */     //   22: aload_0
/*     */     //   23: getfield outputLocals : [I
/*     */     //   26: arraylength
/*     */     //   27: istore_3
/*     */     //   28: iload_1
/*     */     //   29: iload_3
/*     */     //   30: if_icmplt -> 64
/*     */     //   33: iload_1
/*     */     //   34: iconst_1
/*     */     //   35: iadd
/*     */     //   36: iconst_2
/*     */     //   37: iload_3
/*     */     //   38: imul
/*     */     //   39: invokestatic max : (II)I
/*     */     //   42: newarray int
/*     */     //   44: astore #4
/*     */     //   46: aload_0
/*     */     //   47: getfield outputLocals : [I
/*     */     //   50: iconst_0
/*     */     //   51: aload #4
/*     */     //   53: iconst_0
/*     */     //   54: iload_3
/*     */     //   55: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   58: aload_0
/*     */     //   59: aload #4
/*     */     //   61: putfield outputLocals : [I
/*     */     //   64: aload_0
/*     */     //   65: getfield outputLocals : [I
/*     */     //   68: iload_1
/*     */     //   69: iload_2
/*     */     //   70: iastore
/*     */     //   71: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 0
/*     */     //   #358	-> 7
/*     */     //   #261	-> 22
/*     */     //   #329	-> 28
/*     */     //   #320	-> 33
/*     */     //   #306	-> 46
/*     */     //   #184	-> 58
/*     */     //   #399	-> 64
/*     */     //   #154	-> 71
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	15	18	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private int pop() {
/*     */     try {
/*     */       if (this.outputStackTop > 0)
/*     */         return this.outputStack[--this.outputStackTop]; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return 0x3000000 | ---this.owner.inputStackTop;
/*     */   }
/*     */   
/*     */   private void init(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield initializations : [I
/*     */     //   4: ifnonnull -> 21
/*     */     //   7: aload_0
/*     */     //   8: iconst_2
/*     */     //   9: newarray int
/*     */     //   11: putfield initializations : [I
/*     */     //   14: goto -> 21
/*     */     //   17: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   20: athrow
/*     */     //   21: aload_0
/*     */     //   22: getfield initializations : [I
/*     */     //   25: arraylength
/*     */     //   26: istore_2
/*     */     //   27: aload_0
/*     */     //   28: getfield initializationCount : I
/*     */     //   31: iload_2
/*     */     //   32: if_icmplt -> 66
/*     */     //   35: aload_0
/*     */     //   36: getfield initializationCount : I
/*     */     //   39: iconst_1
/*     */     //   40: iadd
/*     */     //   41: iconst_2
/*     */     //   42: iload_2
/*     */     //   43: imul
/*     */     //   44: invokestatic max : (II)I
/*     */     //   47: newarray int
/*     */     //   49: astore_3
/*     */     //   50: aload_0
/*     */     //   51: getfield initializations : [I
/*     */     //   54: iconst_0
/*     */     //   55: aload_3
/*     */     //   56: iconst_0
/*     */     //   57: iload_2
/*     */     //   58: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   61: aload_0
/*     */     //   62: aload_3
/*     */     //   63: putfield initializations : [I
/*     */     //   66: aload_0
/*     */     //   67: getfield initializations : [I
/*     */     //   70: aload_0
/*     */     //   71: dup
/*     */     //   72: getfield initializationCount : I
/*     */     //   75: dup_x1
/*     */     //   76: iconst_1
/*     */     //   77: iadd
/*     */     //   78: putfield initializationCount : I
/*     */     //   81: iload_1
/*     */     //   82: iastore
/*     */     //   83: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 0
/*     */     //   #361	-> 7
/*     */     //   #145	-> 21
/*     */     //   #353	-> 27
/*     */     //   #126	-> 35
/*     */     //   #272	-> 50
/*     */     //   #66	-> 61
/*     */     //   #389	-> 66
/*     */     //   #230	-> 83
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	14	17	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private void pop(int paramInt) {
/*     */     try {
/*     */       if (this.outputStackTop >= paramInt) {
/*     */         this.outputStackTop -= paramInt;
/*     */       } else {
/*     */         this.owner.inputStackTop -= paramInt - this.outputStackTop;
/*     */         this.outputStackTop = 0;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   final void set(ClassWriter paramClassWriter, int paramInt1, Object[] paramArrayOfObject1, int paramInt2, Object[] paramArrayOfObject2) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: iload_2
/*     */     //   2: aload_3
/*     */     //   3: aload_0
/*     */     //   4: getfield inputLocals : [I
/*     */     //   7: invokestatic convert : (Lorg/spongepowered/asm/lib/ClassWriter;I[Ljava/lang/Object;[I)I
/*     */     //   10: istore #6
/*     */     //   12: iload #6
/*     */     //   14: aload_3
/*     */     //   15: arraylength
/*     */     //   16: if_icmpge -> 38
/*     */     //   19: aload_0
/*     */     //   20: getfield inputLocals : [I
/*     */     //   23: iload #6
/*     */     //   25: iinc #6, 1
/*     */     //   28: ldc 16777216
/*     */     //   30: iastore
/*     */     //   31: goto -> 12
/*     */     //   34: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   37: athrow
/*     */     //   38: iconst_0
/*     */     //   39: istore #7
/*     */     //   41: iconst_0
/*     */     //   42: istore #8
/*     */     //   44: iload #8
/*     */     //   46: iload #4
/*     */     //   48: if_icmpge -> 103
/*     */     //   51: aload #5
/*     */     //   53: iload #8
/*     */     //   55: aaload
/*     */     //   56: getstatic org/spongepowered/asm/lib/Opcodes.LONG : Ljava/lang/Integer;
/*     */     //   59: if_acmpeq -> 87
/*     */     //   62: goto -> 69
/*     */     //   65: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   68: athrow
/*     */     //   69: aload #5
/*     */     //   71: iload #8
/*     */     //   73: aaload
/*     */     //   74: getstatic org/spongepowered/asm/lib/Opcodes.DOUBLE : Ljava/lang/Integer;
/*     */     //   77: if_acmpne -> 97
/*     */     //   80: goto -> 87
/*     */     //   83: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   86: athrow
/*     */     //   87: iinc #7, 1
/*     */     //   90: goto -> 97
/*     */     //   93: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   96: athrow
/*     */     //   97: iinc #8, 1
/*     */     //   100: goto -> 44
/*     */     //   103: aload_0
/*     */     //   104: iload #4
/*     */     //   106: iload #7
/*     */     //   108: iadd
/*     */     //   109: newarray int
/*     */     //   111: putfield inputStack : [I
/*     */     //   114: aload_1
/*     */     //   115: iload #4
/*     */     //   117: aload #5
/*     */     //   119: aload_0
/*     */     //   120: getfield inputStack : [I
/*     */     //   123: invokestatic convert : (Lorg/spongepowered/asm/lib/ClassWriter;I[Ljava/lang/Object;[I)I
/*     */     //   126: pop
/*     */     //   127: aload_0
/*     */     //   128: iconst_0
/*     */     //   129: putfield outputStackTop : I
/*     */     //   132: aload_0
/*     */     //   133: iconst_0
/*     */     //   134: putfield initializationCount : I
/*     */     //   137: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #213	-> 0
/*     */     //   #396	-> 12
/*     */     //   #35	-> 19
/*     */     //   #257	-> 38
/*     */     //   #81	-> 41
/*     */     //   #373	-> 51
/*     */     //   #376	-> 87
/*     */     //   #5	-> 97
/*     */     //   #48	-> 103
/*     */     //   #109	-> 114
/*     */     //   #38	-> 127
/*     */     //   #477	-> 132
/*     */     //   #227	-> 137
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	34	34	java/lang/RuntimeException
/*     */     //   44	62	65	java/lang/RuntimeException
/*     */     //   51	80	83	java/lang/RuntimeException
/*     */     //   69	90	93	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   final void initInputFrame(ClassWriter paramClassWriter, int paramInt1, Type[] paramArrayOfType, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload #4
/*     */     //   3: newarray int
/*     */     //   5: putfield inputLocals : [I
/*     */     //   8: aload_0
/*     */     //   9: iconst_0
/*     */     //   10: newarray int
/*     */     //   12: putfield inputStack : [I
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: iload_2
/*     */     //   19: bipush #8
/*     */     //   21: iand
/*     */     //   22: ifne -> 79
/*     */     //   25: iload_2
/*     */     //   26: ldc 524288
/*     */     //   28: iand
/*     */     //   29: ifne -> 67
/*     */     //   32: goto -> 39
/*     */     //   35: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   38: athrow
/*     */     //   39: aload_0
/*     */     //   40: getfield inputLocals : [I
/*     */     //   43: iload #5
/*     */     //   45: iinc #5, 1
/*     */     //   48: ldc 24117248
/*     */     //   50: aload_1
/*     */     //   51: aload_1
/*     */     //   52: getfield thisName : Ljava/lang/String;
/*     */     //   55: invokevirtual addType : (Ljava/lang/String;)I
/*     */     //   58: ior
/*     */     //   59: iastore
/*     */     //   60: goto -> 79
/*     */     //   63: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   66: athrow
/*     */     //   67: aload_0
/*     */     //   68: getfield inputLocals : [I
/*     */     //   71: iload #5
/*     */     //   73: iinc #5, 1
/*     */     //   76: ldc 16777222
/*     */     //   78: iastore
/*     */     //   79: iconst_0
/*     */     //   80: istore #6
/*     */     //   82: iload #6
/*     */     //   84: aload_3
/*     */     //   85: arraylength
/*     */     //   86: if_icmpge -> 160
/*     */     //   89: aload_1
/*     */     //   90: aload_3
/*     */     //   91: iload #6
/*     */     //   93: aaload
/*     */     //   94: invokevirtual getDescriptor : ()Ljava/lang/String;
/*     */     //   97: invokestatic type : (Lorg/spongepowered/asm/lib/ClassWriter;Ljava/lang/String;)I
/*     */     //   100: istore #7
/*     */     //   102: aload_0
/*     */     //   103: getfield inputLocals : [I
/*     */     //   106: iload #5
/*     */     //   108: iinc #5, 1
/*     */     //   111: iload #7
/*     */     //   113: iastore
/*     */     //   114: iload #7
/*     */     //   116: ldc 16777220
/*     */     //   118: if_icmpeq -> 135
/*     */     //   121: iload #7
/*     */     //   123: ldc 16777219
/*     */     //   125: if_icmpne -> 154
/*     */     //   128: goto -> 135
/*     */     //   131: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   134: athrow
/*     */     //   135: aload_0
/*     */     //   136: getfield inputLocals : [I
/*     */     //   139: iload #5
/*     */     //   141: iinc #5, 1
/*     */     //   144: ldc 16777216
/*     */     //   146: iastore
/*     */     //   147: goto -> 154
/*     */     //   150: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   153: athrow
/*     */     //   154: iinc #6, 1
/*     */     //   157: goto -> 82
/*     */     //   160: iload #5
/*     */     //   162: iload #4
/*     */     //   164: if_icmpge -> 186
/*     */     //   167: aload_0
/*     */     //   168: getfield inputLocals : [I
/*     */     //   171: iload #5
/*     */     //   173: iinc #5, 1
/*     */     //   176: ldc 16777216
/*     */     //   178: iastore
/*     */     //   179: goto -> 160
/*     */     //   182: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   185: athrow
/*     */     //   186: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #215	-> 0
/*     */     //   #252	-> 8
/*     */     //   #457	-> 15
/*     */     //   #18	-> 18
/*     */     //   #183	-> 25
/*     */     //   #105	-> 39
/*     */     //   #127	-> 67
/*     */     //   #1	-> 79
/*     */     //   #54	-> 89
/*     */     //   #79	-> 102
/*     */     //   #415	-> 114
/*     */     //   #432	-> 135
/*     */     //   #235	-> 154
/*     */     //   #423	-> 160
/*     */     //   #171	-> 167
/*     */     //   #114	-> 186
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   18	32	35	java/lang/RuntimeException
/*     */     //   25	63	63	java/lang/RuntimeException
/*     */     //   102	128	131	java/lang/RuntimeException
/*     */     //   121	147	150	java/lang/RuntimeException
/*     */     //   160	182	182	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   void execute(int paramInt1, int paramInt2, ClassWriter paramClassWriter, Item paramItem) {
/*     */     try {
/*     */       int i;
/*     */       int j;
/*     */       int k;
/*     */       int m;
/*     */       String str;
/*     */       switch (paramInt1) {
/*     */         case 0:
/*     */         case 116:
/*     */         case 117:
/*     */         case 118:
/*     */         case 119:
/*     */         case 145:
/*     */         case 146:
/*     */         case 147:
/*     */         case 167:
/*     */         case 177:
/*     */           return;
/*     */         case 1:
/*     */           push(16777221);
/*     */         case 2:
/*     */         case 3:
/*     */         case 4:
/*     */         case 5:
/*     */         case 6:
/*     */         case 7:
/*     */         case 8:
/*     */         case 16:
/*     */         case 17:
/*     */         case 21:
/*     */           push(16777217);
/*     */         case 9:
/*     */         case 10:
/*     */         case 22:
/*     */           push(16777220);
/*     */           push(16777216);
/*     */         case 11:
/*     */         case 12:
/*     */         case 13:
/*     */         case 23:
/*     */           push(16777218);
/*     */         case 14:
/*     */         case 15:
/*     */         case 24:
/*     */           push(16777219);
/*     */           push(16777216);
/*     */         case 18:
/*     */           try {
/*     */             switch (paramItem.type) {
/*     */               case 3:
/*     */                 push(16777217);
/*     */               case 5:
/*     */                 push(16777220);
/*     */                 push(16777216);
/*     */               case 4:
/*     */                 push(16777218);
/*     */               case 6:
/*     */                 push(16777219);
/*     */                 push(16777216);
/*     */               case 7:
/*     */                 push(0x1700000 | paramClassWriter.addType("java/lang/Class"));
/*     */               case 8:
/*     */                 push(0x1700000 | paramClassWriter.addType("java/lang/String"));
/*     */               case 16:
/*     */                 push(0x1700000 | paramClassWriter.addType("java/lang/invoke/MethodType"));
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(0x1700000 | paramClassWriter.addType("java/lang/invoke/MethodHandle"));
/*     */         case 25:
/*     */           push(get(paramInt2));
/*     */         case 46:
/*     */         case 51:
/*     */         case 52:
/*     */         case 53:
/*     */           pop(2);
/*     */           push(16777217);
/*     */         case 47:
/*     */         case 143:
/*     */           pop(2);
/*     */           push(16777220);
/*     */           push(16777216);
/*     */         case 48:
/*     */           pop(2);
/*     */           push(16777218);
/*     */         case 49:
/*     */         case 138:
/*     */           pop(2);
/*     */           push(16777219);
/*     */           push(16777216);
/*     */         case 50:
/*     */           pop(1);
/*     */           i = pop();
/*     */           push(-268435456 + i);
/*     */         case 54:
/*     */         case 56:
/*     */         case 58:
/*     */           i = pop();
/*     */           set(paramInt2, i);
/*     */           if (paramInt2 > 0) {
/*     */             int n = get(paramInt2 - 1);
/*     */             try {
/*     */               if (n != 16777220) {
/*     */                 try {
/*     */                   if (n == 16777219)
/*     */                     set(paramInt2 - 1, 16777216); 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 try {
/*     */                   if ((n & 0xF000000) != 16777216)
/*     */                     set(paramInt2 - 1, n | 0x800000); 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         case 55:
/*     */         case 57:
/*     */           pop(1);
/*     */           i = pop();
/*     */           set(paramInt2, i);
/*     */           set(paramInt2 + 1, 16777216);
/*     */           if (paramInt2 > 0) {
/*     */             int n = get(paramInt2 - 1);
/*     */             try {
/*     */               if (n != 16777220) {
/*     */                 try {
/*     */                   if (n == 16777219)
/*     */                     set(paramInt2 - 1, 16777216); 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 try {
/*     */                   if ((n & 0xF000000) != 16777216)
/*     */                     set(paramInt2 - 1, n | 0x800000); 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         case 79:
/*     */         case 81:
/*     */         case 83:
/*     */         case 84:
/*     */         case 85:
/*     */         case 86:
/*     */           pop(3);
/*     */         case 80:
/*     */         case 82:
/*     */           pop(4);
/*     */         case 87:
/*     */         case 153:
/*     */         case 154:
/*     */         case 155:
/*     */         case 156:
/*     */         case 157:
/*     */         case 158:
/*     */         case 170:
/*     */         case 171:
/*     */         case 172:
/*     */         case 174:
/*     */         case 176:
/*     */         case 191:
/*     */         case 194:
/*     */         case 195:
/*     */         case 198:
/*     */         case 199:
/*     */           pop(1);
/*     */         case 88:
/*     */         case 159:
/*     */         case 160:
/*     */         case 161:
/*     */         case 162:
/*     */         case 163:
/*     */         case 164:
/*     */         case 165:
/*     */         case 166:
/*     */         case 173:
/*     */         case 175:
/*     */           pop(2);
/*     */         case 89:
/*     */           i = pop();
/*     */           push(i);
/*     */           push(i);
/*     */         case 90:
/*     */           i = pop();
/*     */           j = pop();
/*     */           push(i);
/*     */           push(j);
/*     */           push(i);
/*     */         case 91:
/*     */           i = pop();
/*     */           j = pop();
/*     */           k = pop();
/*     */           push(i);
/*     */           push(k);
/*     */           push(j);
/*     */           push(i);
/*     */         case 92:
/*     */           i = pop();
/*     */           j = pop();
/*     */           push(j);
/*     */           push(i);
/*     */           push(j);
/*     */           push(i);
/*     */         case 93:
/*     */           i = pop();
/*     */           j = pop();
/*     */           k = pop();
/*     */           push(j);
/*     */           push(i);
/*     */           push(k);
/*     */           push(j);
/*     */           push(i);
/*     */         case 94:
/*     */           i = pop();
/*     */           j = pop();
/*     */           k = pop();
/*     */           m = pop();
/*     */           push(j);
/*     */           push(i);
/*     */           push(m);
/*     */           push(k);
/*     */           push(j);
/*     */           push(i);
/*     */         case 95:
/*     */           i = pop();
/*     */           j = pop();
/*     */           push(i);
/*     */           push(j);
/*     */         case 96:
/*     */         case 100:
/*     */         case 104:
/*     */         case 108:
/*     */         case 112:
/*     */         case 120:
/*     */         case 122:
/*     */         case 124:
/*     */         case 126:
/*     */         case 128:
/*     */         case 130:
/*     */         case 136:
/*     */         case 142:
/*     */         case 149:
/*     */         case 150:
/*     */           pop(2);
/*     */           push(16777217);
/*     */         case 97:
/*     */         case 101:
/*     */         case 105:
/*     */         case 109:
/*     */         case 113:
/*     */         case 127:
/*     */         case 129:
/*     */         case 131:
/*     */           pop(4);
/*     */           push(16777220);
/*     */           push(16777216);
/*     */         case 98:
/*     */         case 102:
/*     */         case 106:
/*     */         case 110:
/*     */         case 114:
/*     */         case 137:
/*     */         case 144:
/*     */           pop(2);
/*     */           push(16777218);
/*     */         case 99:
/*     */         case 103:
/*     */         case 107:
/*     */         case 111:
/*     */         case 115:
/*     */           pop(4);
/*     */           push(16777219);
/*     */           push(16777216);
/*     */         case 121:
/*     */         case 123:
/*     */         case 125:
/*     */           pop(3);
/*     */           push(16777220);
/*     */           push(16777216);
/*     */         case 132:
/*     */           set(paramInt2, 16777217);
/*     */         case 133:
/*     */         case 140:
/*     */           pop(1);
/*     */           push(16777220);
/*     */           push(16777216);
/*     */         case 134:
/*     */           pop(1);
/*     */           push(16777218);
/*     */         case 135:
/*     */         case 141:
/*     */           pop(1);
/*     */           push(16777219);
/*     */           push(16777216);
/*     */         case 139:
/*     */         case 190:
/*     */         case 193:
/*     */           pop(1);
/*     */           push(16777217);
/*     */         case 148:
/*     */         case 151:
/*     */         case 152:
/*     */           pop(4);
/*     */           push(16777217);
/*     */         case 168:
/*     */         case 169:
/*     */           throw new RuntimeException("JSR/RET are not supported with computeFrames option");
/*     */         case 178:
/*     */           push(paramClassWriter, paramItem.strVal3);
/*     */         case 179:
/*     */           pop(paramItem.strVal3);
/*     */         case 180:
/*     */           pop(1);
/*     */           push(paramClassWriter, paramItem.strVal3);
/*     */         case 181:
/*     */           pop(paramItem.strVal3);
/*     */           pop();
/*     */         case 182:
/*     */         case 183:
/*     */         case 184:
/*     */         case 185:
/*     */           pop(paramItem.strVal3);
/*     */           if (paramInt1 != 184) {
/*     */             i = pop();
/*     */             try {
/*     */               if (paramInt1 == 183)
/*     */                 try {
/*     */                   if (paramItem.strVal2.charAt(0) == '<')
/*     */                     init(i); 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */           push(paramClassWriter, paramItem.strVal3);
/*     */         case 186:
/*     */           pop(paramItem.strVal2);
/*     */           push(paramClassWriter, paramItem.strVal2);
/*     */         case 187:
/*     */           push(0x1800000 | paramClassWriter.addUninitializedType(paramItem.strVal1, paramInt2));
/*     */         case 188:
/*     */           try {
/*     */             pop();
/*     */             switch (paramInt2) {
/*     */               case 4:
/*     */                 push(285212681);
/*     */               case 5:
/*     */                 push(285212683);
/*     */               case 8:
/*     */                 push(285212682);
/*     */               case 9:
/*     */                 push(285212684);
/*     */               case 10:
/*     */                 push(285212673);
/*     */               case 6:
/*     */                 push(285212674);
/*     */               case 7:
/*     */                 push(285212675);
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(285212676);
/*     */         case 189:
/*     */           str = paramItem.strVal1;
/*     */           try {
/*     */             pop();
/*     */             if (str.charAt(0) == '[') {
/*     */               push(paramClassWriter, '[' + str);
/*     */             } else {
/*     */               push(0x11700000 | paramClassWriter.addType(str));
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 192:
/*     */           str = paramItem.strVal1;
/*     */           try {
/*     */             pop();
/*     */             if (str.charAt(0) == '[') {
/*     */               push(paramClassWriter, str);
/*     */             } else {
/*     */               push(0x1700000 | paramClassWriter.addType(str));
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     pop(paramInt2);
/*     */     push(paramClassWriter, paramItem.strVal1);
/*     */   }
/*     */   
/*     */   private void push(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield outputStack : [I
/*     */     //   4: ifnonnull -> 22
/*     */     //   7: aload_0
/*     */     //   8: bipush #10
/*     */     //   10: newarray int
/*     */     //   12: putfield outputStack : [I
/*     */     //   15: goto -> 22
/*     */     //   18: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   21: athrow
/*     */     //   22: aload_0
/*     */     //   23: getfield outputStack : [I
/*     */     //   26: arraylength
/*     */     //   27: istore_2
/*     */     //   28: aload_0
/*     */     //   29: getfield outputStackTop : I
/*     */     //   32: iload_2
/*     */     //   33: if_icmplt -> 67
/*     */     //   36: aload_0
/*     */     //   37: getfield outputStackTop : I
/*     */     //   40: iconst_1
/*     */     //   41: iadd
/*     */     //   42: iconst_2
/*     */     //   43: iload_2
/*     */     //   44: imul
/*     */     //   45: invokestatic max : (II)I
/*     */     //   48: newarray int
/*     */     //   50: astore_3
/*     */     //   51: aload_0
/*     */     //   52: getfield outputStack : [I
/*     */     //   55: iconst_0
/*     */     //   56: aload_3
/*     */     //   57: iconst_0
/*     */     //   58: iload_2
/*     */     //   59: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   62: aload_0
/*     */     //   63: aload_3
/*     */     //   64: putfield outputStack : [I
/*     */     //   67: aload_0
/*     */     //   68: getfield outputStack : [I
/*     */     //   71: aload_0
/*     */     //   72: dup
/*     */     //   73: getfield outputStackTop : I
/*     */     //   76: dup_x1
/*     */     //   77: iconst_1
/*     */     //   78: iadd
/*     */     //   79: putfield outputStackTop : I
/*     */     //   82: iload_1
/*     */     //   83: iastore
/*     */     //   84: aload_0
/*     */     //   85: getfield owner : Lorg/spongepowered/asm/lib/Label;
/*     */     //   88: getfield inputStackTop : I
/*     */     //   91: aload_0
/*     */     //   92: getfield outputStackTop : I
/*     */     //   95: iadd
/*     */     //   96: istore_3
/*     */     //   97: iload_3
/*     */     //   98: aload_0
/*     */     //   99: getfield owner : Lorg/spongepowered/asm/lib/Label;
/*     */     //   102: getfield outputStackMax : I
/*     */     //   105: if_icmple -> 123
/*     */     //   108: aload_0
/*     */     //   109: getfield owner : Lorg/spongepowered/asm/lib/Label;
/*     */     //   112: iload_3
/*     */     //   113: putfield outputStackMax : I
/*     */     //   116: goto -> 123
/*     */     //   119: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   122: athrow
/*     */     //   123: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #281	-> 0
/*     */     //   #51	-> 7
/*     */     //   #163	-> 22
/*     */     //   #314	-> 28
/*     */     //   #478	-> 36
/*     */     //   #138	-> 51
/*     */     //   #229	-> 62
/*     */     //   #167	-> 67
/*     */     //   #69	-> 84
/*     */     //   #354	-> 97
/*     */     //   #151	-> 108
/*     */     //   #374	-> 123
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	15	18	java/lang/RuntimeException
/*     */     //   97	116	119	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static int type(ClassWriter paramClassWriter, String paramString) {
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b = (paramString.charAt(0) == '(') ? (paramString.indexOf(')') + 1) : 0;
/*     */     try {
/*     */       String str1;
/*     */       switch (paramString.charAt(b)) {
/*     */         case 'V':
/*     */           return 0;
/*     */         case 'B':
/*     */         case 'C':
/*     */         case 'I':
/*     */         case 'S':
/*     */         case 'Z':
/*     */           return 16777217;
/*     */         case 'F':
/*     */           return 16777218;
/*     */         case 'J':
/*     */           return 16777220;
/*     */         case 'D':
/*     */           return 16777219;
/*     */         case 'L':
/*     */           str1 = paramString.substring(b + 1, paramString.length() - 1);
/*     */           return 0x1700000 | paramClassWriter.addType(str1);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     int i = b + 1;
/*     */     try {
/*     */       while (paramString.charAt(i) == '[')
/*     */         i++; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     switch (paramString.charAt(i)) {
/*     */       case 'Z':
/*     */         j = 16777225;
/*     */         return i - b << 28 | j;
/*     */       case 'C':
/*     */         j = 16777227;
/*     */         return i - b << 28 | j;
/*     */       case 'B':
/*     */         j = 16777226;
/*     */         return i - b << 28 | j;
/*     */       case 'S':
/*     */         j = 16777228;
/*     */         return i - b << 28 | j;
/*     */       case 'I':
/*     */         j = 16777217;
/*     */         return i - b << 28 | j;
/*     */       case 'F':
/*     */         j = 16777218;
/*     */         return i - b << 28 | j;
/*     */       case 'J':
/*     */         j = 16777220;
/*     */         return i - b << 28 | j;
/*     */       case 'D':
/*     */         j = 16777219;
/*     */         return i - b << 28 | j;
/*     */     } 
/*     */     String str = paramString.substring(i + 1, paramString.length() - 1);
/*     */     int j = 0x1700000 | paramClassWriter.addType(str);
/*     */     return i - b << 28 | j;
/*     */   }
/*     */   
/*     */   final void set(Frame paramFrame) {
/*     */     this.inputLocals = paramFrame.inputLocals;
/*     */     this.inputStack = paramFrame.inputStack;
/*     */     this.outputLocals = paramFrame.outputLocals;
/*     */     this.outputStack = paramFrame.outputStack;
/*     */     this.outputStackTop = paramFrame.outputStackTop;
/*     */     this.initializationCount = paramFrame.initializationCount;
/*     */     this.initializations = paramFrame.initializations;
/*     */   }
/*     */   
/*     */   private static boolean merge(ClassWriter paramClassWriter, int paramInt1, int[] paramArrayOfint, int paramInt2) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: iload_3
/*     */     //   2: iaload
/*     */     //   3: istore #4
/*     */     //   5: iload #4
/*     */     //   7: iload_1
/*     */     //   8: if_icmpne -> 17
/*     */     //   11: iconst_0
/*     */     //   12: ireturn
/*     */     //   13: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   16: athrow
/*     */     //   17: iload_1
/*     */     //   18: ldc 268435455
/*     */     //   20: iand
/*     */     //   21: ldc 16777221
/*     */     //   23: if_icmpne -> 49
/*     */     //   26: iload #4
/*     */     //   28: ldc 16777221
/*     */     //   30: if_icmpne -> 46
/*     */     //   33: goto -> 40
/*     */     //   36: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   39: athrow
/*     */     //   40: iconst_0
/*     */     //   41: ireturn
/*     */     //   42: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   45: athrow
/*     */     //   46: ldc 16777221
/*     */     //   48: istore_1
/*     */     //   49: iload #4
/*     */     //   51: ifne -> 64
/*     */     //   54: aload_2
/*     */     //   55: iload_3
/*     */     //   56: iload_1
/*     */     //   57: iastore
/*     */     //   58: iconst_1
/*     */     //   59: ireturn
/*     */     //   60: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   63: athrow
/*     */     //   64: iload #4
/*     */     //   66: ldc 267386880
/*     */     //   68: iand
/*     */     //   69: ldc 24117248
/*     */     //   71: if_icmpeq -> 89
/*     */     //   74: iload #4
/*     */     //   76: ldc -268435456
/*     */     //   78: iand
/*     */     //   79: ifeq -> 332
/*     */     //   82: goto -> 89
/*     */     //   85: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   88: athrow
/*     */     //   89: iload_1
/*     */     //   90: ldc 16777221
/*     */     //   92: if_icmpne -> 108
/*     */     //   95: goto -> 102
/*     */     //   98: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   101: athrow
/*     */     //   102: iconst_0
/*     */     //   103: ireturn
/*     */     //   104: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   107: athrow
/*     */     //   108: iload_1
/*     */     //   109: ldc -1048576
/*     */     //   111: iand
/*     */     //   112: iload #4
/*     */     //   114: ldc -1048576
/*     */     //   116: iand
/*     */     //   117: if_icmpne -> 190
/*     */     //   120: iload #4
/*     */     //   122: ldc 267386880
/*     */     //   124: iand
/*     */     //   125: ldc 24117248
/*     */     //   127: if_icmpne -> 163
/*     */     //   130: goto -> 137
/*     */     //   133: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   136: athrow
/*     */     //   137: iload_1
/*     */     //   138: ldc -268435456
/*     */     //   140: iand
/*     */     //   141: ldc 24117248
/*     */     //   143: ior
/*     */     //   144: aload_0
/*     */     //   145: iload_1
/*     */     //   146: ldc 1048575
/*     */     //   148: iand
/*     */     //   149: iload #4
/*     */     //   151: ldc 1048575
/*     */     //   153: iand
/*     */     //   154: invokevirtual getMergedType : (II)I
/*     */     //   157: ior
/*     */     //   158: istore #5
/*     */     //   160: goto -> 388
/*     */     //   163: ldc -268435456
/*     */     //   165: iload #4
/*     */     //   167: ldc -268435456
/*     */     //   169: iand
/*     */     //   170: iadd
/*     */     //   171: istore #6
/*     */     //   173: iload #6
/*     */     //   175: ldc 24117248
/*     */     //   177: ior
/*     */     //   178: aload_0
/*     */     //   179: ldc 'java/lang/Object'
/*     */     //   181: invokevirtual addType : (Ljava/lang/String;)I
/*     */     //   184: ior
/*     */     //   185: istore #5
/*     */     //   187: goto -> 388
/*     */     //   190: iload_1
/*     */     //   191: ldc 267386880
/*     */     //   193: iand
/*     */     //   194: ldc 24117248
/*     */     //   196: if_icmpeq -> 213
/*     */     //   199: iload_1
/*     */     //   200: ldc -268435456
/*     */     //   202: iand
/*     */     //   203: ifeq -> 325
/*     */     //   206: goto -> 213
/*     */     //   209: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   212: athrow
/*     */     //   213: iload_1
/*     */     //   214: ldc -268435456
/*     */     //   216: iand
/*     */     //   217: ifeq -> 243
/*     */     //   220: goto -> 227
/*     */     //   223: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   226: athrow
/*     */     //   227: iload_1
/*     */     //   228: ldc 267386880
/*     */     //   230: iand
/*     */     //   231: ldc 24117248
/*     */     //   233: if_icmpne -> 251
/*     */     //   236: goto -> 243
/*     */     //   239: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   242: athrow
/*     */     //   243: iconst_0
/*     */     //   244: goto -> 253
/*     */     //   247: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   250: athrow
/*     */     //   251: ldc -268435456
/*     */     //   253: iload_1
/*     */     //   254: ldc -268435456
/*     */     //   256: iand
/*     */     //   257: iadd
/*     */     //   258: istore #6
/*     */     //   260: iload #4
/*     */     //   262: ldc -268435456
/*     */     //   264: iand
/*     */     //   265: ifeq -> 285
/*     */     //   268: iload #4
/*     */     //   270: ldc 267386880
/*     */     //   272: iand
/*     */     //   273: ldc 24117248
/*     */     //   275: if_icmpne -> 293
/*     */     //   278: goto -> 285
/*     */     //   281: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   284: athrow
/*     */     //   285: iconst_0
/*     */     //   286: goto -> 295
/*     */     //   289: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   292: athrow
/*     */     //   293: ldc -268435456
/*     */     //   295: iload #4
/*     */     //   297: ldc -268435456
/*     */     //   299: iand
/*     */     //   300: iadd
/*     */     //   301: istore #7
/*     */     //   303: iload #6
/*     */     //   305: iload #7
/*     */     //   307: invokestatic min : (II)I
/*     */     //   310: ldc 24117248
/*     */     //   312: ior
/*     */     //   313: aload_0
/*     */     //   314: ldc 'java/lang/Object'
/*     */     //   316: invokevirtual addType : (Ljava/lang/String;)I
/*     */     //   319: ior
/*     */     //   320: istore #5
/*     */     //   322: goto -> 388
/*     */     //   325: ldc 16777216
/*     */     //   327: istore #5
/*     */     //   329: goto -> 388
/*     */     //   332: iload #4
/*     */     //   334: ldc 16777221
/*     */     //   336: if_icmpne -> 384
/*     */     //   339: iload_1
/*     */     //   340: ldc 267386880
/*     */     //   342: iand
/*     */     //   343: ldc 24117248
/*     */     //   345: if_icmpeq -> 369
/*     */     //   348: goto -> 355
/*     */     //   351: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   354: athrow
/*     */     //   355: iload_1
/*     */     //   356: ldc -268435456
/*     */     //   358: iand
/*     */     //   359: ifeq -> 377
/*     */     //   362: goto -> 369
/*     */     //   365: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   368: athrow
/*     */     //   369: iload_1
/*     */     //   370: goto -> 379
/*     */     //   373: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   376: athrow
/*     */     //   377: ldc 16777216
/*     */     //   379: istore #5
/*     */     //   381: goto -> 388
/*     */     //   384: ldc 16777216
/*     */     //   386: istore #5
/*     */     //   388: iload #4
/*     */     //   390: iload #5
/*     */     //   392: if_icmpeq -> 406
/*     */     //   395: aload_2
/*     */     //   396: iload_3
/*     */     //   397: iload #5
/*     */     //   399: iastore
/*     */     //   400: iconst_1
/*     */     //   401: ireturn
/*     */     //   402: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   405: athrow
/*     */     //   406: iconst_0
/*     */     //   407: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #448	-> 0
/*     */     //   #137	-> 5
/*     */     //   #370	-> 11
/*     */     //   #85	-> 17
/*     */     //   #271	-> 26
/*     */     //   #165	-> 40
/*     */     //   #366	-> 46
/*     */     //   #449	-> 49
/*     */     //   #11	-> 54
/*     */     //   #60	-> 58
/*     */     //   #119	-> 64
/*     */     //   #292	-> 89
/*     */     //   #186	-> 102
/*     */     //   #335	-> 108
/*     */     //   #128	-> 120
/*     */     //   #188	-> 137
/*     */     //   #383	-> 154
/*     */     //   #190	-> 163
/*     */     //   #255	-> 173
/*     */     //   #280	-> 187
/*     */     //   #72	-> 190
/*     */     //   #91	-> 213
/*     */     //   #352	-> 260
/*     */     //   #321	-> 303
/*     */     //   #324	-> 316
/*     */     //   #371	-> 322
/*     */     //   #480	-> 325
/*     */     //   #158	-> 332
/*     */     //   #308	-> 339
/*     */     //   #149	-> 384
/*     */     //   #26	-> 388
/*     */     //   #405	-> 395
/*     */     //   #303	-> 400
/*     */     //   #216	-> 406
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	13	13	java/lang/RuntimeException
/*     */     //   17	33	36	java/lang/RuntimeException
/*     */     //   26	42	42	java/lang/RuntimeException
/*     */     //   49	60	60	java/lang/RuntimeException
/*     */     //   64	82	85	java/lang/RuntimeException
/*     */     //   74	95	98	java/lang/RuntimeException
/*     */     //   89	104	104	java/lang/RuntimeException
/*     */     //   108	130	133	java/lang/RuntimeException
/*     */     //   190	206	209	java/lang/RuntimeException
/*     */     //   199	220	223	java/lang/RuntimeException
/*     */     //   213	236	239	java/lang/RuntimeException
/*     */     //   227	247	247	java/lang/RuntimeException
/*     */     //   260	278	281	java/lang/RuntimeException
/*     */     //   268	289	289	java/lang/RuntimeException
/*     */     //   332	348	351	java/lang/RuntimeException
/*     */     //   339	362	365	java/lang/RuntimeException
/*     */     //   355	373	373	java/lang/RuntimeException
/*     */     //   388	402	402	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static int convert(ClassWriter paramClassWriter, int paramInt, Object[] paramArrayOfObject, int[] paramArrayOfint) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore #4
/*     */     //   3: iconst_0
/*     */     //   4: istore #5
/*     */     //   6: iload #5
/*     */     //   8: iload_1
/*     */     //   9: if_icmpge -> 172
/*     */     //   12: aload_2
/*     */     //   13: iload #5
/*     */     //   15: aaload
/*     */     //   16: instanceof java/lang/Integer
/*     */     //   19: ifeq -> 99
/*     */     //   22: goto -> 29
/*     */     //   25: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   28: athrow
/*     */     //   29: aload_3
/*     */     //   30: iload #4
/*     */     //   32: iinc #4, 1
/*     */     //   35: ldc 16777216
/*     */     //   37: aload_2
/*     */     //   38: iload #5
/*     */     //   40: aaload
/*     */     //   41: checkcast java/lang/Integer
/*     */     //   44: invokevirtual intValue : ()I
/*     */     //   47: ior
/*     */     //   48: iastore
/*     */     //   49: aload_2
/*     */     //   50: iload #5
/*     */     //   52: aaload
/*     */     //   53: getstatic org/spongepowered/asm/lib/Opcodes.LONG : Ljava/lang/Integer;
/*     */     //   56: if_acmpeq -> 83
/*     */     //   59: goto -> 66
/*     */     //   62: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   65: athrow
/*     */     //   66: aload_2
/*     */     //   67: iload #5
/*     */     //   69: aaload
/*     */     //   70: getstatic org/spongepowered/asm/lib/Opcodes.DOUBLE : Ljava/lang/Integer;
/*     */     //   73: if_acmpne -> 166
/*     */     //   76: goto -> 83
/*     */     //   79: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   82: athrow
/*     */     //   83: aload_3
/*     */     //   84: iload #4
/*     */     //   86: iinc #4, 1
/*     */     //   89: ldc 16777216
/*     */     //   91: iastore
/*     */     //   92: goto -> 166
/*     */     //   95: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   98: athrow
/*     */     //   99: aload_2
/*     */     //   100: iload #5
/*     */     //   102: aaload
/*     */     //   103: instanceof java/lang/String
/*     */     //   106: ifeq -> 140
/*     */     //   109: aload_3
/*     */     //   110: iload #4
/*     */     //   112: iinc #4, 1
/*     */     //   115: aload_0
/*     */     //   116: aload_2
/*     */     //   117: iload #5
/*     */     //   119: aaload
/*     */     //   120: checkcast java/lang/String
/*     */     //   123: invokestatic getObjectType : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   126: invokevirtual getDescriptor : ()Ljava/lang/String;
/*     */     //   129: invokestatic type : (Lorg/spongepowered/asm/lib/ClassWriter;Ljava/lang/String;)I
/*     */     //   132: iastore
/*     */     //   133: goto -> 166
/*     */     //   136: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   139: athrow
/*     */     //   140: aload_3
/*     */     //   141: iload #4
/*     */     //   143: iinc #4, 1
/*     */     //   146: ldc 25165824
/*     */     //   148: aload_0
/*     */     //   149: ldc ''
/*     */     //   151: aload_2
/*     */     //   152: iload #5
/*     */     //   154: aaload
/*     */     //   155: checkcast org/spongepowered/asm/lib/Label
/*     */     //   158: getfield position : I
/*     */     //   161: invokevirtual addUninitializedType : (Ljava/lang/String;I)I
/*     */     //   164: ior
/*     */     //   165: iastore
/*     */     //   166: iinc #5, 1
/*     */     //   169: goto -> 6
/*     */     //   172: iload #4
/*     */     //   174: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #463	-> 0
/*     */     //   #205	-> 3
/*     */     //   #267	-> 12
/*     */     //   #465	-> 29
/*     */     //   #349	-> 49
/*     */     //   #474	-> 83
/*     */     //   #337	-> 99
/*     */     //   #365	-> 109
/*     */     //   #100	-> 126
/*     */     //   #268	-> 129
/*     */     //   #238	-> 140
/*     */     //   #462	-> 161
/*     */     //   #61	-> 166
/*     */     //   #247	-> 172
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	22	25	java/lang/RuntimeException
/*     */     //   12	59	62	java/lang/RuntimeException
/*     */     //   29	76	79	java/lang/RuntimeException
/*     */     //   66	95	95	java/lang/RuntimeException
/*     */     //   99	136	136	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private int get(int paramInt) {
/*     */     try {
/*     */       if (this.outputLocals != null)
/*     */         try {
/*     */           if (paramInt < this.outputLocals.length) {
/*     */             int i = this.outputLocals[paramInt];
/*     */             if (i == 0)
/*     */               i = this.outputLocals[paramInt] = 0x2000000 | paramInt; 
/*     */             return i;
/*     */           } 
/*     */           return 0x2000000 | paramInt;
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return 0x2000000 | paramInt;
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Frame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */