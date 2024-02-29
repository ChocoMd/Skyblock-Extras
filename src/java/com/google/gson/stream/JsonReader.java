/*     */ package com.google.gson.stream;
/*     */ 
/*     */ import com.google.gson.internal.JsonReaderInternalAccess;
/*     */ import java.io.Closeable;
/*     */ import java.io.EOFException;
/*     */ import java.io.IOException;
/*     */ import java.io.Reader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class JsonReader
/*     */   implements Closeable
/*     */ {
/*     */   private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
/*     */   private static final int PEEKED_NONE = 0;
/*     */   private static final int PEEKED_BEGIN_OBJECT = 1;
/*     */   private static final int PEEKED_END_OBJECT = 2;
/*     */   private static final int PEEKED_BEGIN_ARRAY = 3;
/*     */   private static final int PEEKED_END_ARRAY = 4;
/*     */   private static final int PEEKED_TRUE = 5;
/*     */   private static final int PEEKED_FALSE = 6;
/*     */   private static final int PEEKED_NULL = 7;
/*     */   private static final int PEEKED_SINGLE_QUOTED = 8;
/*  29 */   private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray(); private static final int PEEKED_DOUBLE_QUOTED = 9; private static final int PEEKED_UNQUOTED = 10; private static final int PEEKED_BUFFERED = 11; private static final int PEEKED_SINGLE_QUOTED_NAME = 12; private static final int PEEKED_DOUBLE_QUOTED_NAME = 13; private static final int PEEKED_UNQUOTED_NAME = 14; private static final int PEEKED_LONG = 15; private static final int PEEKED_NUMBER = 16;
/*     */   private static final int PEEKED_EOF = 17;
/*     */   private static final int NUMBER_CHAR_NONE = 0;
/*     */   
/*     */   private IOException syntaxError(String paramString) throws IOException {
/*  34 */     throw new MalformedJsonException(paramString + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_SIGN = 1;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_DIGIT = 2;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_DECIMAL = 3;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_EXP_E = 5;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_EXP_SIGN = 6;
/*     */ 
/*     */   
/*     */   private static final int NUMBER_CHAR_EXP_DIGIT = 7;
/*     */ 
/*     */   
/*     */   private final Reader in;
/*     */ 
/*     */   
/*     */   private boolean lenient;
/*     */ 
/*     */   
/*     */   private final char[] buffer;
/*     */ 
/*     */   
/*     */   private int pos;
/*     */ 
/*     */   
/*     */   private int limit;
/*     */ 
/*     */   
/*     */   private int lineNumber;
/*     */ 
/*     */   
/*     */   private int lineStart;
/*     */ 
/*     */   
/*     */   private int peeked;
/*     */ 
/*     */   
/*     */   private long peekedLong;
/*     */ 
/*     */   
/*     */   private int peekedNumberLength;
/*     */ 
/*     */   
/*     */   private String peekedString;
/*     */ 
/*     */   
/*     */   private int[] stack;
/*     */ 
/*     */   
/*     */   private int stackSize;
/*     */ 
/*     */   
/*     */   private int peekNumber() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buffer : [C
/*     */     //   4: astore_1
/*     */     //   5: aload_0
/*     */     //   6: getfield pos : I
/*     */     //   9: istore_2
/*     */     //   10: aload_0
/*     */     //   11: getfield limit : I
/*     */     //   14: istore_3
/*     */     //   15: lconst_0
/*     */     //   16: lstore #4
/*     */     //   18: iconst_0
/*     */     //   19: istore #6
/*     */     //   21: iconst_1
/*     */     //   22: istore #7
/*     */     //   24: iconst_0
/*     */     //   25: istore #8
/*     */     //   27: iconst_0
/*     */     //   28: istore #9
/*     */     //   30: iload_2
/*     */     //   31: iload #9
/*     */     //   33: iadd
/*     */     //   34: iload_3
/*     */     //   35: if_icmpne -> 86
/*     */     //   38: iload #9
/*     */     //   40: aload_1
/*     */     //   41: arraylength
/*     */     //   42: if_icmpne -> 58
/*     */     //   45: goto -> 52
/*     */     //   48: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   51: athrow
/*     */     //   52: iconst_0
/*     */     //   53: ireturn
/*     */     //   54: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   57: athrow
/*     */     //   58: aload_0
/*     */     //   59: iload #9
/*     */     //   61: iconst_1
/*     */     //   62: iadd
/*     */     //   63: invokespecial fillBuffer : (I)Z
/*     */     //   66: ifne -> 76
/*     */     //   69: goto -> 463
/*     */     //   72: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   75: athrow
/*     */     //   76: aload_0
/*     */     //   77: getfield pos : I
/*     */     //   80: istore_2
/*     */     //   81: aload_0
/*     */     //   82: getfield limit : I
/*     */     //   85: istore_3
/*     */     //   86: aload_1
/*     */     //   87: iload_2
/*     */     //   88: iload #9
/*     */     //   90: iadd
/*     */     //   91: caload
/*     */     //   92: istore #10
/*     */     //   94: iload #10
/*     */     //   96: lookupswitch default -> 240, 43 -> 184, 45 -> 148, 46 -> 226, 69 -> 199, 101 -> 199
/*     */     //   148: iload #8
/*     */     //   150: ifne -> 169
/*     */     //   153: goto -> 160
/*     */     //   156: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   159: athrow
/*     */     //   160: iconst_1
/*     */     //   161: istore #6
/*     */     //   163: iconst_1
/*     */     //   164: istore #8
/*     */     //   166: goto -> 457
/*     */     //   169: iload #8
/*     */     //   171: iconst_5
/*     */     //   172: if_icmpne -> 182
/*     */     //   175: bipush #6
/*     */     //   177: istore #8
/*     */     //   179: goto -> 457
/*     */     //   182: iconst_0
/*     */     //   183: ireturn
/*     */     //   184: iload #8
/*     */     //   186: iconst_5
/*     */     //   187: if_icmpne -> 197
/*     */     //   190: bipush #6
/*     */     //   192: istore #8
/*     */     //   194: goto -> 457
/*     */     //   197: iconst_0
/*     */     //   198: ireturn
/*     */     //   199: iload #8
/*     */     //   201: iconst_2
/*     */     //   202: if_icmpeq -> 218
/*     */     //   205: iload #8
/*     */     //   207: iconst_4
/*     */     //   208: if_icmpne -> 224
/*     */     //   211: goto -> 218
/*     */     //   214: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   217: athrow
/*     */     //   218: iconst_5
/*     */     //   219: istore #8
/*     */     //   221: goto -> 457
/*     */     //   224: iconst_0
/*     */     //   225: ireturn
/*     */     //   226: iload #8
/*     */     //   228: iconst_2
/*     */     //   229: if_icmpne -> 238
/*     */     //   232: iconst_3
/*     */     //   233: istore #8
/*     */     //   235: goto -> 457
/*     */     //   238: iconst_0
/*     */     //   239: ireturn
/*     */     //   240: iload #10
/*     */     //   242: bipush #48
/*     */     //   244: if_icmplt -> 261
/*     */     //   247: iload #10
/*     */     //   249: bipush #57
/*     */     //   251: if_icmple -> 286
/*     */     //   254: goto -> 261
/*     */     //   257: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   260: athrow
/*     */     //   261: aload_0
/*     */     //   262: iload #10
/*     */     //   264: invokespecial isLiteral : (C)Z
/*     */     //   267: ifne -> 284
/*     */     //   270: goto -> 277
/*     */     //   273: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   276: athrow
/*     */     //   277: goto -> 463
/*     */     //   280: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   283: athrow
/*     */     //   284: iconst_0
/*     */     //   285: ireturn
/*     */     //   286: iload #8
/*     */     //   288: iconst_1
/*     */     //   289: if_icmpeq -> 304
/*     */     //   292: iload #8
/*     */     //   294: ifne -> 319
/*     */     //   297: goto -> 304
/*     */     //   300: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   303: athrow
/*     */     //   304: iload #10
/*     */     //   306: bipush #48
/*     */     //   308: isub
/*     */     //   309: ineg
/*     */     //   310: i2l
/*     */     //   311: lstore #4
/*     */     //   313: iconst_2
/*     */     //   314: istore #8
/*     */     //   316: goto -> 457
/*     */     //   319: iload #8
/*     */     //   321: iconst_2
/*     */     //   322: if_icmpne -> 421
/*     */     //   325: lload #4
/*     */     //   327: lconst_0
/*     */     //   328: lcmp
/*     */     //   329: ifne -> 345
/*     */     //   332: goto -> 339
/*     */     //   335: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   338: athrow
/*     */     //   339: iconst_0
/*     */     //   340: ireturn
/*     */     //   341: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   344: athrow
/*     */     //   345: lload #4
/*     */     //   347: ldc2_w 10
/*     */     //   350: lmul
/*     */     //   351: iload #10
/*     */     //   353: bipush #48
/*     */     //   355: isub
/*     */     //   356: i2l
/*     */     //   357: lsub
/*     */     //   358: lstore #11
/*     */     //   360: iload #7
/*     */     //   362: lload #4
/*     */     //   364: ldc2_w -922337203685477580
/*     */     //   367: lcmp
/*     */     //   368: ifgt -> 402
/*     */     //   371: lload #4
/*     */     //   373: ldc2_w -922337203685477580
/*     */     //   376: lcmp
/*     */     //   377: ifne -> 410
/*     */     //   380: goto -> 387
/*     */     //   383: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   386: athrow
/*     */     //   387: lload #11
/*     */     //   389: lload #4
/*     */     //   391: lcmp
/*     */     //   392: ifge -> 410
/*     */     //   395: goto -> 402
/*     */     //   398: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   401: athrow
/*     */     //   402: iconst_1
/*     */     //   403: goto -> 411
/*     */     //   406: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   409: athrow
/*     */     //   410: iconst_0
/*     */     //   411: iand
/*     */     //   412: istore #7
/*     */     //   414: lload #11
/*     */     //   416: lstore #4
/*     */     //   418: goto -> 457
/*     */     //   421: iload #8
/*     */     //   423: iconst_3
/*     */     //   424: if_icmpne -> 433
/*     */     //   427: iconst_4
/*     */     //   428: istore #8
/*     */     //   430: goto -> 457
/*     */     //   433: iload #8
/*     */     //   435: iconst_5
/*     */     //   436: if_icmpeq -> 453
/*     */     //   439: iload #8
/*     */     //   441: bipush #6
/*     */     //   443: if_icmpne -> 457
/*     */     //   446: goto -> 453
/*     */     //   449: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   452: athrow
/*     */     //   453: bipush #7
/*     */     //   455: istore #8
/*     */     //   457: iinc #9, 1
/*     */     //   460: goto -> 30
/*     */     //   463: iload #8
/*     */     //   465: iconst_2
/*     */     //   466: if_icmpne -> 556
/*     */     //   469: iload #7
/*     */     //   471: ifeq -> 556
/*     */     //   474: goto -> 481
/*     */     //   477: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   480: athrow
/*     */     //   481: lload #4
/*     */     //   483: ldc2_w -9223372036854775808
/*     */     //   486: lcmp
/*     */     //   487: ifne -> 509
/*     */     //   490: goto -> 497
/*     */     //   493: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   496: athrow
/*     */     //   497: iload #6
/*     */     //   499: ifeq -> 556
/*     */     //   502: goto -> 509
/*     */     //   505: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   508: athrow
/*     */     //   509: aload_0
/*     */     //   510: iload #6
/*     */     //   512: ifeq -> 531
/*     */     //   515: goto -> 522
/*     */     //   518: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   521: athrow
/*     */     //   522: lload #4
/*     */     //   524: goto -> 534
/*     */     //   527: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   530: athrow
/*     */     //   531: lload #4
/*     */     //   533: lneg
/*     */     //   534: putfield peekedLong : J
/*     */     //   537: aload_0
/*     */     //   538: dup
/*     */     //   539: getfield pos : I
/*     */     //   542: iload #9
/*     */     //   544: iadd
/*     */     //   545: putfield pos : I
/*     */     //   548: aload_0
/*     */     //   549: bipush #15
/*     */     //   551: dup_x1
/*     */     //   552: putfield peeked : I
/*     */     //   555: ireturn
/*     */     //   556: iload #8
/*     */     //   558: iconst_2
/*     */     //   559: if_icmpeq -> 589
/*     */     //   562: iload #8
/*     */     //   564: iconst_4
/*     */     //   565: if_icmpeq -> 589
/*     */     //   568: goto -> 575
/*     */     //   571: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   574: athrow
/*     */     //   575: iload #8
/*     */     //   577: bipush #7
/*     */     //   579: if_icmpne -> 607
/*     */     //   582: goto -> 589
/*     */     //   585: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   588: athrow
/*     */     //   589: aload_0
/*     */     //   590: iload #9
/*     */     //   592: putfield peekedNumberLength : I
/*     */     //   595: aload_0
/*     */     //   596: bipush #16
/*     */     //   598: dup_x1
/*     */     //   599: putfield peeked : I
/*     */     //   602: ireturn
/*     */     //   603: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   606: athrow
/*     */     //   607: iconst_0
/*     */     //   608: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #66	-> 0
/*     */     //   #177	-> 5
/*     */     //   #296	-> 10
/*     */     //   #209	-> 15
/*     */     //   #134	-> 18
/*     */     //   #221	-> 21
/*     */     //   #151	-> 24
/*     */     //   #54	-> 27
/*     */     //   #391	-> 30
/*     */     //   #456	-> 38
/*     */     //   #65	-> 52
/*     */     //   #378	-> 58
/*     */     //   #179	-> 69
/*     */     //   #534	-> 76
/*     */     //   #286	-> 81
/*     */     //   #165	-> 86
/*     */     //   #485	-> 94
/*     */     //   #30	-> 148
/*     */     //   #274	-> 160
/*     */     //   #52	-> 163
/*     */     //   #14	-> 166
/*     */     //   #220	-> 169
/*     */     //   #9	-> 175
/*     */     //   #289	-> 179
/*     */     //   #88	-> 182
/*     */     //   #435	-> 184
/*     */     //   #227	-> 190
/*     */     //   #459	-> 194
/*     */     //   #445	-> 197
/*     */     //   #422	-> 199
/*     */     //   #375	-> 218
/*     */     //   #302	-> 221
/*     */     //   #591	-> 224
/*     */     //   #279	-> 226
/*     */     //   #442	-> 232
/*     */     //   #338	-> 235
/*     */     //   #207	-> 238
/*     */     //   #565	-> 240
/*     */     //   #509	-> 261
/*     */     //   #342	-> 277
/*     */     //   #93	-> 284
/*     */     //   #240	-> 286
/*     */     //   #189	-> 304
/*     */     //   #173	-> 313
/*     */     //   #252	-> 319
/*     */     //   #212	-> 325
/*     */     //   #523	-> 339
/*     */     //   #214	-> 345
/*     */     //   #609	-> 360
/*     */     //   #174	-> 414
/*     */     //   #437	-> 418
/*     */     //   #575	-> 427
/*     */     //   #6	-> 433
/*     */     //   #42	-> 453
/*     */     //   #40	-> 457
/*     */     //   #149	-> 463
/*     */     //   #245	-> 509
/*     */     //   #501	-> 537
/*     */     //   #185	-> 548
/*     */     //   #158	-> 556
/*     */     //   #60	-> 589
/*     */     //   #235	-> 595
/*     */     //   #522	-> 607
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   30	45	48	java/io/IOException
/*     */     //   38	54	54	java/io/IOException
/*     */     //   58	72	72	java/io/IOException
/*     */     //   94	153	156	java/io/IOException
/*     */     //   199	211	214	java/io/IOException
/*     */     //   240	254	257	java/io/IOException
/*     */     //   247	270	273	java/io/IOException
/*     */     //   261	280	280	java/io/IOException
/*     */     //   286	297	300	java/io/IOException
/*     */     //   319	332	335	java/io/IOException
/*     */     //   325	341	341	java/io/IOException
/*     */     //   360	380	383	java/io/IOException
/*     */     //   371	395	398	java/io/IOException
/*     */     //   387	406	406	java/io/IOException
/*     */     //   433	446	449	java/io/IOException
/*     */     //   463	474	477	java/io/IOException
/*     */     //   469	490	493	java/io/IOException
/*     */     //   481	502	505	java/io/IOException
/*     */     //   497	515	518	java/io/IOException
/*     */     //   509	527	527	java/io/IOException
/*     */     //   556	568	571	java/io/IOException
/*     */     //   562	582	585	java/io/IOException
/*     */     //   575	603	603	java/io/IOException
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean skipTo(String paramString) throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield pos : I
/*     */     //   4: aload_1
/*     */     //   5: invokevirtual length : ()I
/*     */     //   8: iadd
/*     */     //   9: aload_0
/*     */     //   10: getfield limit : I
/*     */     //   13: if_icmple -> 34
/*     */     //   16: aload_0
/*     */     //   17: aload_1
/*     */     //   18: invokevirtual length : ()I
/*     */     //   21: invokespecial fillBuffer : (I)Z
/*     */     //   24: ifeq -> 146
/*     */     //   27: goto -> 34
/*     */     //   30: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   33: athrow
/*     */     //   34: aload_0
/*     */     //   35: getfield buffer : [C
/*     */     //   38: aload_0
/*     */     //   39: getfield pos : I
/*     */     //   42: caload
/*     */     //   43: bipush #10
/*     */     //   45: if_icmpne -> 82
/*     */     //   48: goto -> 55
/*     */     //   51: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: aload_0
/*     */     //   56: dup
/*     */     //   57: getfield lineNumber : I
/*     */     //   60: iconst_1
/*     */     //   61: iadd
/*     */     //   62: putfield lineNumber : I
/*     */     //   65: aload_0
/*     */     //   66: aload_0
/*     */     //   67: getfield pos : I
/*     */     //   70: iconst_1
/*     */     //   71: iadd
/*     */     //   72: putfield lineStart : I
/*     */     //   75: goto -> 133
/*     */     //   78: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   81: athrow
/*     */     //   82: iconst_0
/*     */     //   83: istore_2
/*     */     //   84: iload_2
/*     */     //   85: aload_1
/*     */     //   86: invokevirtual length : ()I
/*     */     //   89: if_icmpge -> 131
/*     */     //   92: aload_0
/*     */     //   93: getfield buffer : [C
/*     */     //   96: aload_0
/*     */     //   97: getfield pos : I
/*     */     //   100: iload_2
/*     */     //   101: iadd
/*     */     //   102: caload
/*     */     //   103: aload_1
/*     */     //   104: iload_2
/*     */     //   105: invokevirtual charAt : (I)C
/*     */     //   108: if_icmpeq -> 125
/*     */     //   111: goto -> 118
/*     */     //   114: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   117: athrow
/*     */     //   118: goto -> 133
/*     */     //   121: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   124: athrow
/*     */     //   125: iinc #2, 1
/*     */     //   128: goto -> 84
/*     */     //   131: iconst_1
/*     */     //   132: ireturn
/*     */     //   133: aload_0
/*     */     //   134: dup
/*     */     //   135: getfield pos : I
/*     */     //   138: iconst_1
/*     */     //   139: iadd
/*     */     //   140: putfield pos : I
/*     */     //   143: goto -> 0
/*     */     //   146: iconst_0
/*     */     //   147: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #83	-> 0
/*     */     //   #400	-> 34
/*     */     //   #147	-> 55
/*     */     //   #381	-> 65
/*     */     //   #610	-> 75
/*     */     //   #319	-> 82
/*     */     //   #363	-> 92
/*     */     //   #628	-> 118
/*     */     //   #48	-> 125
/*     */     //   #239	-> 131
/*     */     //   #423	-> 133
/*     */     //   #290	-> 146
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	27	30	java/io/IOException
/*     */     //   16	48	51	java/io/IOException
/*     */     //   34	78	78	java/io/IOException
/*     */     //   84	111	114	java/io/IOException
/*     */     //   92	121	121	java/io/IOException
/*     */   }
/*     */ 
/*     */   
/*     */   public JsonReader(Reader paramReader)
/*     */   {
/* 111 */     this.lenient = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 511 */     this.buffer = new char[1024];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.pos = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.limit = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.lineNumber = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 584 */     this.lineStart = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.peeked = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.stack = new int[32];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.stackSize = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     this.stack[this.stackSize++] = 6;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     if (paramReader == null)
/* 614 */       throw new NullPointerException("in == null");  this.in = paramReader; } private String nextQuotedValue(char paramChar) throws IOException { char[] arrayOfChar = this.buffer; StringBuilder stringBuilder = new StringBuilder(); while (true)
/*     */     { int i = this.pos; int j = this.limit; int k = i; while (i < j)
/*     */       { char c = arrayOfChar[i++]; try {
/*     */           if (c == paramChar) {
/*     */             this.pos = i; stringBuilder.append(arrayOfChar, k, i - k - 1); return stringBuilder.toString();
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  if (c == '\\')
/*     */         { this.pos = i; stringBuilder.append(arrayOfChar, k, i - k - 1);
/*     */           stringBuilder.append(readEscapeCharacter());
/*     */           i = this.pos;
/* 626 */           j = this.limit; }  }  try { stringBuilder.append(arrayOfChar, k, i - k); this.pos = i; if (!fillBuffer(1)) throw syntaxError("Unterminated string");  } catch (IOException iOException) { throw b(null); }  }  } public void skipValue() throws IOException { boolean bool = false; while (true)
/* 627 */       int i = this.peeked;  }
/*     */ 
/*     */   
/*     */   public long nextLong() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield peeked : I
/*     */     //   4: istore_1
/*     */     //   5: iload_1
/*     */     //   6: ifne -> 14
/*     */     //   9: aload_0
/*     */     //   10: invokespecial doPeek : ()I
/*     */     //   13: istore_1
/*     */     //   14: iload_1
/*     */     //   15: bipush #15
/*     */     //   17: if_icmpne -> 34
/*     */     //   20: aload_0
/*     */     //   21: iconst_0
/*     */     //   22: putfield peeked : I
/*     */     //   25: aload_0
/*     */     //   26: getfield peekedLong : J
/*     */     //   29: lreturn
/*     */     //   30: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   33: athrow
/*     */     //   34: iload_1
/*     */     //   35: bipush #16
/*     */     //   37: if_icmpne -> 83
/*     */     //   40: aload_0
/*     */     //   41: new java/lang/String
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: getfield buffer : [C
/*     */     //   49: aload_0
/*     */     //   50: getfield pos : I
/*     */     //   53: aload_0
/*     */     //   54: getfield peekedNumberLength : I
/*     */     //   57: invokespecial <init> : ([CII)V
/*     */     //   60: putfield peekedString : Ljava/lang/String;
/*     */     //   63: aload_0
/*     */     //   64: dup
/*     */     //   65: getfield pos : I
/*     */     //   68: aload_0
/*     */     //   69: getfield peekedNumberLength : I
/*     */     //   72: iadd
/*     */     //   73: putfield pos : I
/*     */     //   76: goto -> 207
/*     */     //   79: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: iload_1
/*     */     //   84: bipush #8
/*     */     //   86: if_icmpeq -> 102
/*     */     //   89: iload_1
/*     */     //   90: bipush #9
/*     */     //   92: if_icmpne -> 153
/*     */     //   95: goto -> 102
/*     */     //   98: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   101: athrow
/*     */     //   102: aload_0
/*     */     //   103: aload_0
/*     */     //   104: iload_1
/*     */     //   105: bipush #8
/*     */     //   107: if_icmpne -> 126
/*     */     //   110: goto -> 117
/*     */     //   113: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   116: athrow
/*     */     //   117: bipush #39
/*     */     //   119: goto -> 128
/*     */     //   122: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   125: athrow
/*     */     //   126: bipush #34
/*     */     //   128: invokespecial nextQuotedValue : (C)Ljava/lang/String;
/*     */     //   131: putfield peekedString : Ljava/lang/String;
/*     */     //   134: aload_0
/*     */     //   135: getfield peekedString : Ljava/lang/String;
/*     */     //   138: invokestatic parseLong : (Ljava/lang/String;)J
/*     */     //   141: lstore_2
/*     */     //   142: aload_0
/*     */     //   143: iconst_0
/*     */     //   144: putfield peeked : I
/*     */     //   147: lload_2
/*     */     //   148: lreturn
/*     */     //   149: astore_2
/*     */     //   150: goto -> 207
/*     */     //   153: new java/lang/IllegalStateException
/*     */     //   156: dup
/*     */     //   157: new java/lang/StringBuilder
/*     */     //   160: dup
/*     */     //   161: invokespecial <init> : ()V
/*     */     //   164: ldc 'Expected a long but was '
/*     */     //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   169: aload_0
/*     */     //   170: invokevirtual peek : ()Lcom/google/gson/stream/JsonToken;
/*     */     //   173: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   176: ldc ' at line '
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: aload_0
/*     */     //   182: invokespecial getLineNumber : ()I
/*     */     //   185: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   188: ldc ' column '
/*     */     //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   193: aload_0
/*     */     //   194: invokespecial getColumnNumber : ()I
/*     */     //   197: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   200: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   203: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   206: athrow
/*     */     //   207: aload_0
/*     */     //   208: bipush #11
/*     */     //   210: putfield peeked : I
/*     */     //   213: aload_0
/*     */     //   214: getfield peekedString : Ljava/lang/String;
/*     */     //   217: invokestatic parseDouble : (Ljava/lang/String;)D
/*     */     //   220: dstore_2
/*     */     //   221: dload_2
/*     */     //   222: d2l
/*     */     //   223: lstore #4
/*     */     //   225: lload #4
/*     */     //   227: l2d
/*     */     //   228: dload_2
/*     */     //   229: dcmpl
/*     */     //   230: ifeq -> 291
/*     */     //   233: new java/lang/NumberFormatException
/*     */     //   236: dup
/*     */     //   237: new java/lang/StringBuilder
/*     */     //   240: dup
/*     */     //   241: invokespecial <init> : ()V
/*     */     //   244: ldc 'Expected a long but was '
/*     */     //   246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   249: aload_0
/*     */     //   250: getfield peekedString : Ljava/lang/String;
/*     */     //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   256: ldc ' at line '
/*     */     //   258: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   261: aload_0
/*     */     //   262: invokespecial getLineNumber : ()I
/*     */     //   265: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   268: ldc ' column '
/*     */     //   270: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   273: aload_0
/*     */     //   274: invokespecial getColumnNumber : ()I
/*     */     //   277: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   280: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   283: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   286: athrow
/*     */     //   287: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   290: athrow
/*     */     //   291: aload_0
/*     */     //   292: aconst_null
/*     */     //   293: putfield peekedString : Ljava/lang/String;
/*     */     //   296: aload_0
/*     */     //   297: iconst_0
/*     */     //   298: putfield peeked : I
/*     */     //   301: lload #4
/*     */     //   303: lreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #104	-> 0
/*     */     //   #373	-> 5
/*     */     //   #138	-> 9
/*     */     //   #497	-> 14
/*     */     //   #532	-> 20
/*     */     //   #411	-> 25
/*     */     //   #247	-> 34
/*     */     //   #472	-> 40
/*     */     //   #469	-> 63
/*     */     //   #17	-> 83
/*     */     //   #268	-> 102
/*     */     //   #520	-> 134
/*     */     //   #572	-> 142
/*     */     //   #366	-> 147
/*     */     //   #324	-> 149
/*     */     //   #70	-> 150
/*     */     //   #64	-> 153
/*     */     //   #116	-> 207
/*     */     //   #406	-> 213
/*     */     //   #616	-> 221
/*     */     //   #359	-> 225
/*     */     //   #80	-> 233
/*     */     //   #231	-> 291
/*     */     //   #518	-> 296
/*     */     //   #28	-> 301
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	30	30	java/lang/NumberFormatException
/*     */     //   34	79	79	java/lang/NumberFormatException
/*     */     //   83	95	98	java/lang/NumberFormatException
/*     */     //   89	110	113	java/lang/NumberFormatException
/*     */     //   102	122	122	java/lang/NumberFormatException
/*     */     //   134	148	149	java/lang/NumberFormatException
/*     */     //   225	287	287	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   private void checkLenient() throws IOException {
/*     */     try {
/*     */       if (!this.lenient)
/*     */         throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON"); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String nextUnquotedValue() throws IOException {
/*     */     String str;
/*     */     StringBuilder stringBuilder = null;
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (this.pos + b < this.limit) {
/*     */           try {
/*     */             switch (this.buffer[this.pos + b]) {
/*     */               case '#':
/*     */               case '/':
/*     */               case ';':
/*     */               case '=':
/*     */               case '\\':
/*     */                 checkLenient();
/*     */                 break;
/*     */               case '\t':
/*     */               case '\n':
/*     */               case '\f':
/*     */               case '\r':
/*     */               case ' ':
/*     */               case ',':
/*     */               case ':':
/*     */               case '[':
/*     */               case ']':
/*     */               case '{':
/*     */               case '}':
/*     */                 break;
/*     */             } 
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */           b++;
/*     */         } 
/*     */       } catch (IOException iOException) {
/*     */         throw b(null);
/*     */       } 
/*     */       try {
/*     */         if (b < this.buffer.length) {
/*     */           try {
/*     */             if (fillBuffer(b + 1))
/*     */               continue; 
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */           break;
/*     */         } 
/*     */       } catch (IOException iOException) {
/*     */         throw b(null);
/*     */       } 
/*     */       if (stringBuilder == null)
/*     */         stringBuilder = new StringBuilder(); 
/*     */       stringBuilder.append(this.buffer, this.pos, b);
/*     */       this.pos += b;
/*     */       b = 0;
/*     */       if (!fillBuffer(1))
/*     */         break; 
/*     */     } 
/*     */     if (stringBuilder == null) {
/*     */       str = new String(this.buffer, this.pos, b);
/*     */     } else {
/*     */       stringBuilder.append(this.buffer, this.pos, b);
/*     */       str = stringBuilder.toString();
/*     */     } 
/*     */     this.pos += b;
/*     */     return str;
/*     */   }
/*     */   
/*     */   private boolean fillBuffer(int paramInt) throws IOException {
/*     */     char[] arrayOfChar = this.buffer;
/*     */     try {
/*     */       this.lineStart -= this.pos;
/*     */       if (this.limit != this.pos) {
/*     */         this.limit -= this.pos;
/*     */         System.arraycopy(arrayOfChar, this.pos, arrayOfChar, 0, this.limit);
/*     */       } else {
/*     */         this.limit = 0;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.pos = 0;
/*     */     int i;
/*     */     while ((i = this.in.read(arrayOfChar, this.limit, arrayOfChar.length - this.limit)) != -1) {
/*     */       try {
/*     */         this.limit += i;
/*     */         if (this.lineNumber == 0)
/*     */           try {
/*     */             if (this.lineStart == 0)
/*     */               try {
/*     */                 if (this.limit > 0)
/*     */                   try {
/*     */                     if (arrayOfChar[0] == '﻿') {
/*     */                       this.pos++;
/*     */                       this.lineStart++;
/*     */                       paramInt++;
/*     */                     } 
/*     */                   } catch (IOException iOException) {
/*     */                     throw b(null);
/*     */                   }  
/*     */               } catch (IOException iOException) {
/*     */                 throw b(null);
/*     */               }  
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           }  
/*     */       } catch (IOException iOException) {
/*     */         throw b(null);
/*     */       } 
/*     */       if (this.limit >= paramInt)
/*     */         return true; 
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public void close() throws IOException {
/*     */     this.peeked = 0;
/*     */     this.stack[0] = 8;
/*     */     this.stackSize = 1;
/*     */     this.in.close();
/*     */   }
/*     */   
/*     */   private void skipToEndOfLine() throws IOException {
/*     */     while (true) {
/*     */       try {
/*     */         if (this.pos < this.limit || fillBuffer(1)) {
/*     */           char c = this.buffer[this.pos++];
/*     */           try {
/*     */             if (c == '\n') {
/*     */               this.lineNumber++;
/*     */               this.lineStart = this.pos;
/*     */               break;
/*     */             } 
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */         } 
/*     */       } catch (IOException iOException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean isLenient() {
/*     */     return this.lenient;
/*     */   }
/*     */   
/*     */   private void consumeNonExecutePrefix() throws IOException {
/*     */     try {
/*     */       nextNonWhitespace(true);
/*     */       this.pos--;
/*     */       if (this.pos + NON_EXECUTE_PREFIX.length > this.limit)
/*     */         try {
/*     */           if (!fillBuffer(NON_EXECUTE_PREFIX.length))
/*     */             return; 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < NON_EXECUTE_PREFIX.length) {
/*     */           try {
/*     */             if (this.buffer[this.pos + b] != NON_EXECUTE_PREFIX[b])
/*     */               return; 
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */           b++;
/*     */         } 
/*     */       } catch (IOException iOException) {
/*     */         throw b(null);
/*     */       } 
/*     */       this.pos += NON_EXECUTE_PREFIX.length;
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean isLiteral(char paramChar) throws IOException {
/*     */     try {
/*     */       switch (paramChar) {
/*     */         case '#':
/*     */         case '/':
/*     */         case ';':
/*     */         case '=':
/*     */         case '\\':
/*     */           checkLenient();
/*     */         case '\t':
/*     */         case '\n':
/*     */         case '\f':
/*     */         case '\r':
/*     */         case ' ':
/*     */         case ',':
/*     */         case ':':
/*     */         case '[':
/*     */         case ']':
/*     */         case '{':
/*     */         case '}':
/*     */           return false;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public boolean nextBoolean() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 5) {
/*     */         this.peeked = 0;
/*     */         return true;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (i == 6) {
/*     */         this.peeked = 0;
/*     */         return false;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Expected a boolean but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */   }
/*     */   
/*     */   private void push(int paramInt) {
/*     */     if (this.stackSize == this.stack.length) {
/*     */       int[] arrayOfInt = new int[this.stackSize * 2];
/*     */       System.arraycopy(this.stack, 0, arrayOfInt, 0, this.stackSize);
/*     */       this.stack = arrayOfInt;
/*     */     } 
/*     */     this.stack[this.stackSize++] = paramInt;
/*     */   }
/*     */   
/*     */   public void endArray() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 4) {
/*     */         this.stackSize--;
/*     */         this.peeked = 0;
/*     */       } else {
/*     */         throw new IllegalStateException("Expected END_ARRAY but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String nextName() throws IOException {
/*     */     String str;
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     if (i == 14) {
/*     */       str = nextUnquotedValue();
/*     */     } else if (i == 12) {
/*     */       str = nextQuotedValue('\'');
/*     */     } else if (i == 13) {
/*     */       str = nextQuotedValue('"');
/*     */     } else {
/*     */       throw new IllegalStateException("Expected a name but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */     } 
/*     */     this.peeked = 0;
/*     */     return str;
/*     */   }
/*     */   
/*     */   private int getColumnNumber() {
/*     */     return this.pos - this.lineStart + 1;
/*     */   }
/*     */   
/*     */   private int nextNonWhitespace(boolean paramBoolean) throws IOException {
/*     */     char[] arrayOfChar = this.buffer;
/*     */     int i = this.pos;
/*     */     int j = this.limit;
/*     */     while (true) {
/*     */       while (true) {
/*     */         try {
/*     */           if (SYNTHETIC_LOCAL_VARIABLE_5 == 10) {
/*     */             this.lineNumber++;
/*     */             this.lineStart = i;
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */         break;
/*     */       } 
/*     */       if (SYNTHETIC_LOCAL_VARIABLE_5 != 32 && SYNTHETIC_LOCAL_VARIABLE_5 != 13) {
/*     */         try {
/*     */           if (SYNTHETIC_LOCAL_VARIABLE_5 == 9)
/*     */             continue; 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */         try {
/*     */           if (SYNTHETIC_LOCAL_VARIABLE_5 == 47) {
/*     */             this.pos = i;
/*     */             if (i == j) {
/*     */               this.pos--;
/*     */               boolean bool = fillBuffer(2);
/*     */               try {
/*     */                 this.pos++;
/*     */                 if (!bool)
/*     */                   return SYNTHETIC_LOCAL_VARIABLE_5; 
/*     */               } catch (IOException iOException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } 
/*     */             checkLenient();
/*     */             char c = arrayOfChar[this.pos];
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */         if (SYNTHETIC_LOCAL_VARIABLE_5 == 35) {
/*     */           this.pos = i;
/*     */           checkLenient();
/*     */           skipToEndOfLine();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     try {
/*     */       if (paramBoolean)
/*     */         throw new EOFException("End of input at line " + getLineNumber() + " column " + getColumnNumber()); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   private int doPeek() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield stack : [I
/*     */     //   4: aload_0
/*     */     //   5: getfield stackSize : I
/*     */     //   8: iconst_1
/*     */     //   9: isub
/*     */     //   10: iaload
/*     */     //   11: istore_1
/*     */     //   12: iload_1
/*     */     //   13: iconst_1
/*     */     //   14: if_icmpne -> 36
/*     */     //   17: aload_0
/*     */     //   18: getfield stack : [I
/*     */     //   21: aload_0
/*     */     //   22: getfield stackSize : I
/*     */     //   25: iconst_1
/*     */     //   26: isub
/*     */     //   27: iconst_2
/*     */     //   28: iastore
/*     */     //   29: goto -> 602
/*     */     //   32: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   35: athrow
/*     */     //   36: iload_1
/*     */     //   37: iconst_2
/*     */     //   38: if_icmpne -> 112
/*     */     //   41: aload_0
/*     */     //   42: iconst_1
/*     */     //   43: invokespecial nextNonWhitespace : (Z)I
/*     */     //   46: istore_2
/*     */     //   47: iload_2
/*     */     //   48: lookupswitch default -> 102, 44 -> 99, 59 -> 95, 93 -> 84
/*     */     //   84: aload_0
/*     */     //   85: iconst_4
/*     */     //   86: dup_x1
/*     */     //   87: putfield peeked : I
/*     */     //   90: ireturn
/*     */     //   91: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   94: athrow
/*     */     //   95: aload_0
/*     */     //   96: invokespecial checkLenient : ()V
/*     */     //   99: goto -> 109
/*     */     //   102: aload_0
/*     */     //   103: ldc 'Unterminated array'
/*     */     //   105: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   108: athrow
/*     */     //   109: goto -> 602
/*     */     //   112: iload_1
/*     */     //   113: iconst_3
/*     */     //   114: if_icmpeq -> 129
/*     */     //   117: iload_1
/*     */     //   118: iconst_5
/*     */     //   119: if_icmpne -> 353
/*     */     //   122: goto -> 129
/*     */     //   125: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   128: athrow
/*     */     //   129: aload_0
/*     */     //   130: getfield stack : [I
/*     */     //   133: aload_0
/*     */     //   134: getfield stackSize : I
/*     */     //   137: iconst_1
/*     */     //   138: isub
/*     */     //   139: iconst_4
/*     */     //   140: iastore
/*     */     //   141: iload_1
/*     */     //   142: iconst_5
/*     */     //   143: if_icmpne -> 221
/*     */     //   146: goto -> 153
/*     */     //   149: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   152: athrow
/*     */     //   153: aload_0
/*     */     //   154: iconst_1
/*     */     //   155: invokespecial nextNonWhitespace : (Z)I
/*     */     //   158: istore_2
/*     */     //   159: iload_2
/*     */     //   160: lookupswitch default -> 214, 44 -> 211, 59 -> 207, 125 -> 196
/*     */     //   196: aload_0
/*     */     //   197: iconst_2
/*     */     //   198: dup_x1
/*     */     //   199: putfield peeked : I
/*     */     //   202: ireturn
/*     */     //   203: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   206: athrow
/*     */     //   207: aload_0
/*     */     //   208: invokespecial checkLenient : ()V
/*     */     //   211: goto -> 221
/*     */     //   214: aload_0
/*     */     //   215: ldc 'Unterminated object'
/*     */     //   217: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   220: athrow
/*     */     //   221: aload_0
/*     */     //   222: iconst_1
/*     */     //   223: invokespecial nextNonWhitespace : (Z)I
/*     */     //   226: istore_2
/*     */     //   227: iload_2
/*     */     //   228: lookupswitch default -> 311, 34 -> 264, 39 -> 276, 125 -> 288
/*     */     //   264: aload_0
/*     */     //   265: bipush #13
/*     */     //   267: dup_x1
/*     */     //   268: putfield peeked : I
/*     */     //   271: ireturn
/*     */     //   272: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   275: athrow
/*     */     //   276: aload_0
/*     */     //   277: invokespecial checkLenient : ()V
/*     */     //   280: aload_0
/*     */     //   281: bipush #12
/*     */     //   283: dup_x1
/*     */     //   284: putfield peeked : I
/*     */     //   287: ireturn
/*     */     //   288: iload_1
/*     */     //   289: iconst_5
/*     */     //   290: if_icmpeq -> 304
/*     */     //   293: aload_0
/*     */     //   294: iconst_2
/*     */     //   295: dup_x1
/*     */     //   296: putfield peeked : I
/*     */     //   299: ireturn
/*     */     //   300: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   303: athrow
/*     */     //   304: aload_0
/*     */     //   305: ldc 'Expected name'
/*     */     //   307: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   310: athrow
/*     */     //   311: aload_0
/*     */     //   312: invokespecial checkLenient : ()V
/*     */     //   315: aload_0
/*     */     //   316: dup
/*     */     //   317: getfield pos : I
/*     */     //   320: iconst_1
/*     */     //   321: isub
/*     */     //   322: putfield pos : I
/*     */     //   325: aload_0
/*     */     //   326: iload_2
/*     */     //   327: i2c
/*     */     //   328: invokespecial isLiteral : (C)Z
/*     */     //   331: ifeq -> 346
/*     */     //   334: aload_0
/*     */     //   335: bipush #14
/*     */     //   337: dup_x1
/*     */     //   338: putfield peeked : I
/*     */     //   341: ireturn
/*     */     //   342: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   345: athrow
/*     */     //   346: aload_0
/*     */     //   347: ldc 'Expected name'
/*     */     //   349: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   352: athrow
/*     */     //   353: iload_1
/*     */     //   354: iconst_4
/*     */     //   355: if_icmpne -> 489
/*     */     //   358: aload_0
/*     */     //   359: getfield stack : [I
/*     */     //   362: aload_0
/*     */     //   363: getfield stackSize : I
/*     */     //   366: iconst_1
/*     */     //   367: isub
/*     */     //   368: iconst_5
/*     */     //   369: iastore
/*     */     //   370: aload_0
/*     */     //   371: iconst_1
/*     */     //   372: invokespecial nextNonWhitespace : (Z)I
/*     */     //   375: istore_2
/*     */     //   376: iload_2
/*     */     //   377: lookupswitch default -> 479, 58 -> 404, 61 -> 411
/*     */     //   404: goto -> 486
/*     */     //   407: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   410: athrow
/*     */     //   411: aload_0
/*     */     //   412: invokespecial checkLenient : ()V
/*     */     //   415: aload_0
/*     */     //   416: getfield pos : I
/*     */     //   419: aload_0
/*     */     //   420: getfield limit : I
/*     */     //   423: if_icmplt -> 441
/*     */     //   426: aload_0
/*     */     //   427: iconst_1
/*     */     //   428: invokespecial fillBuffer : (I)Z
/*     */     //   431: ifeq -> 486
/*     */     //   434: goto -> 441
/*     */     //   437: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   440: athrow
/*     */     //   441: aload_0
/*     */     //   442: getfield buffer : [C
/*     */     //   445: aload_0
/*     */     //   446: getfield pos : I
/*     */     //   449: caload
/*     */     //   450: bipush #62
/*     */     //   452: if_icmpne -> 486
/*     */     //   455: goto -> 462
/*     */     //   458: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   461: athrow
/*     */     //   462: aload_0
/*     */     //   463: dup
/*     */     //   464: getfield pos : I
/*     */     //   467: iconst_1
/*     */     //   468: iadd
/*     */     //   469: putfield pos : I
/*     */     //   472: goto -> 486
/*     */     //   475: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   478: athrow
/*     */     //   479: aload_0
/*     */     //   480: ldc 'Expected ':''
/*     */     //   482: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   485: athrow
/*     */     //   486: goto -> 602
/*     */     //   489: iload_1
/*     */     //   490: bipush #6
/*     */     //   492: if_icmpne -> 536
/*     */     //   495: aload_0
/*     */     //   496: getfield lenient : Z
/*     */     //   499: ifeq -> 520
/*     */     //   502: goto -> 509
/*     */     //   505: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   508: athrow
/*     */     //   509: aload_0
/*     */     //   510: invokespecial consumeNonExecutePrefix : ()V
/*     */     //   513: goto -> 520
/*     */     //   516: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   519: athrow
/*     */     //   520: aload_0
/*     */     //   521: getfield stack : [I
/*     */     //   524: aload_0
/*     */     //   525: getfield stackSize : I
/*     */     //   528: iconst_1
/*     */     //   529: isub
/*     */     //   530: bipush #7
/*     */     //   532: iastore
/*     */     //   533: goto -> 602
/*     */     //   536: iload_1
/*     */     //   537: bipush #7
/*     */     //   539: if_icmpne -> 582
/*     */     //   542: aload_0
/*     */     //   543: iconst_0
/*     */     //   544: invokespecial nextNonWhitespace : (Z)I
/*     */     //   547: istore_2
/*     */     //   548: iload_2
/*     */     //   549: iconst_m1
/*     */     //   550: if_icmpne -> 565
/*     */     //   553: aload_0
/*     */     //   554: bipush #17
/*     */     //   556: dup_x1
/*     */     //   557: putfield peeked : I
/*     */     //   560: ireturn
/*     */     //   561: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   564: athrow
/*     */     //   565: aload_0
/*     */     //   566: invokespecial checkLenient : ()V
/*     */     //   569: aload_0
/*     */     //   570: dup
/*     */     //   571: getfield pos : I
/*     */     //   574: iconst_1
/*     */     //   575: isub
/*     */     //   576: putfield pos : I
/*     */     //   579: goto -> 602
/*     */     //   582: iload_1
/*     */     //   583: bipush #8
/*     */     //   585: if_icmpne -> 602
/*     */     //   588: new java/lang/IllegalStateException
/*     */     //   591: dup
/*     */     //   592: ldc 'JsonReader is closed'
/*     */     //   594: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   597: athrow
/*     */     //   598: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   601: athrow
/*     */     //   602: aload_0
/*     */     //   603: iconst_1
/*     */     //   604: invokespecial nextNonWhitespace : (Z)I
/*     */     //   607: istore_2
/*     */     //   608: iload_2
/*     */     //   609: lookupswitch default -> 802, 34 -> 761, 39 -> 749, 44 -> 699, 59 -> 699, 91 -> 788, 93 -> 676, 123 -> 795
/*     */     //   676: iload_1
/*     */     //   677: iconst_1
/*     */     //   678: if_icmpne -> 699
/*     */     //   681: goto -> 688
/*     */     //   684: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   687: athrow
/*     */     //   688: aload_0
/*     */     //   689: iconst_4
/*     */     //   690: dup_x1
/*     */     //   691: putfield peeked : I
/*     */     //   694: ireturn
/*     */     //   695: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   698: athrow
/*     */     //   699: iload_1
/*     */     //   700: iconst_1
/*     */     //   701: if_icmpeq -> 716
/*     */     //   704: iload_1
/*     */     //   705: iconst_2
/*     */     //   706: if_icmpne -> 742
/*     */     //   709: goto -> 716
/*     */     //   712: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   715: athrow
/*     */     //   716: aload_0
/*     */     //   717: invokespecial checkLenient : ()V
/*     */     //   720: aload_0
/*     */     //   721: dup
/*     */     //   722: getfield pos : I
/*     */     //   725: iconst_1
/*     */     //   726: isub
/*     */     //   727: putfield pos : I
/*     */     //   730: aload_0
/*     */     //   731: bipush #7
/*     */     //   733: dup_x1
/*     */     //   734: putfield peeked : I
/*     */     //   737: ireturn
/*     */     //   738: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   741: athrow
/*     */     //   742: aload_0
/*     */     //   743: ldc 'Unexpected value'
/*     */     //   745: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   748: athrow
/*     */     //   749: aload_0
/*     */     //   750: invokespecial checkLenient : ()V
/*     */     //   753: aload_0
/*     */     //   754: bipush #8
/*     */     //   756: dup_x1
/*     */     //   757: putfield peeked : I
/*     */     //   760: ireturn
/*     */     //   761: aload_0
/*     */     //   762: getfield stackSize : I
/*     */     //   765: iconst_1
/*     */     //   766: if_icmpne -> 780
/*     */     //   769: aload_0
/*     */     //   770: invokespecial checkLenient : ()V
/*     */     //   773: goto -> 780
/*     */     //   776: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   779: athrow
/*     */     //   780: aload_0
/*     */     //   781: bipush #9
/*     */     //   783: dup_x1
/*     */     //   784: putfield peeked : I
/*     */     //   787: ireturn
/*     */     //   788: aload_0
/*     */     //   789: iconst_3
/*     */     //   790: dup_x1
/*     */     //   791: putfield peeked : I
/*     */     //   794: ireturn
/*     */     //   795: aload_0
/*     */     //   796: iconst_1
/*     */     //   797: dup_x1
/*     */     //   798: putfield peeked : I
/*     */     //   801: ireturn
/*     */     //   802: aload_0
/*     */     //   803: dup
/*     */     //   804: getfield pos : I
/*     */     //   807: iconst_1
/*     */     //   808: isub
/*     */     //   809: putfield pos : I
/*     */     //   812: aload_0
/*     */     //   813: getfield stackSize : I
/*     */     //   816: iconst_1
/*     */     //   817: if_icmpne -> 831
/*     */     //   820: aload_0
/*     */     //   821: invokespecial checkLenient : ()V
/*     */     //   824: goto -> 831
/*     */     //   827: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   830: athrow
/*     */     //   831: aload_0
/*     */     //   832: invokespecial peekKeyword : ()I
/*     */     //   835: istore_3
/*     */     //   836: iload_3
/*     */     //   837: ifeq -> 846
/*     */     //   840: iload_3
/*     */     //   841: ireturn
/*     */     //   842: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   845: athrow
/*     */     //   846: aload_0
/*     */     //   847: invokespecial peekNumber : ()I
/*     */     //   850: istore_3
/*     */     //   851: iload_3
/*     */     //   852: ifeq -> 861
/*     */     //   855: iload_3
/*     */     //   856: ireturn
/*     */     //   857: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   860: athrow
/*     */     //   861: aload_0
/*     */     //   862: aload_0
/*     */     //   863: getfield buffer : [C
/*     */     //   866: aload_0
/*     */     //   867: getfield pos : I
/*     */     //   870: caload
/*     */     //   871: invokespecial isLiteral : (C)Z
/*     */     //   874: ifne -> 888
/*     */     //   877: aload_0
/*     */     //   878: ldc 'Expected value'
/*     */     //   880: invokespecial syntaxError : (Ljava/lang/String;)Ljava/io/IOException;
/*     */     //   883: athrow
/*     */     //   884: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   887: athrow
/*     */     //   888: aload_0
/*     */     //   889: invokespecial checkLenient : ()V
/*     */     //   892: aload_0
/*     */     //   893: bipush #10
/*     */     //   895: dup_x1
/*     */     //   896: putfield peeked : I
/*     */     //   899: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #335	-> 0
/*     */     //   #427	-> 12
/*     */     //   #340	-> 17
/*     */     //   #369	-> 36
/*     */     //   #387	-> 41
/*     */     //   #623	-> 47
/*     */     //   #447	-> 84
/*     */     //   #331	-> 95
/*     */     //   #258	-> 99
/*     */     //   #46	-> 102
/*     */     //   #217	-> 109
/*     */     //   #425	-> 129
/*     */     //   #327	-> 141
/*     */     //   #132	-> 153
/*     */     //   #273	-> 159
/*     */     //   #4	-> 196
/*     */     //   #563	-> 207
/*     */     //   #564	-> 211
/*     */     //   #25	-> 214
/*     */     //   #262	-> 221
/*     */     //   #75	-> 227
/*     */     //   #222	-> 264
/*     */     //   #57	-> 276
/*     */     //   #570	-> 280
/*     */     //   #68	-> 288
/*     */     //   #133	-> 293
/*     */     //   #303	-> 304
/*     */     //   #176	-> 311
/*     */     //   #605	-> 315
/*     */     //   #376	-> 325
/*     */     //   #309	-> 334
/*     */     //   #237	-> 346
/*     */     //   #542	-> 353
/*     */     //   #184	-> 358
/*     */     //   #457	-> 370
/*     */     //   #155	-> 376
/*     */     //   #444	-> 404
/*     */     //   #394	-> 411
/*     */     //   #512	-> 415
/*     */     //   #487	-> 462
/*     */     //   #127	-> 479
/*     */     //   #322	-> 486
/*     */     //   #299	-> 495
/*     */     //   #446	-> 509
/*     */     //   #357	-> 520
/*     */     //   #507	-> 536
/*     */     //   #602	-> 542
/*     */     //   #135	-> 548
/*     */     //   #18	-> 553
/*     */     //   #316	-> 565
/*     */     //   #413	-> 569
/*     */     //   #377	-> 579
/*     */     //   #621	-> 588
/*     */     //   #499	-> 602
/*     */     //   #579	-> 608
/*     */     //   #424	-> 676
/*     */     //   #539	-> 688
/*     */     //   #371	-> 699
/*     */     //   #119	-> 716
/*     */     //   #45	-> 720
/*     */     //   #589	-> 730
/*     */     //   #244	-> 742
/*     */     //   #315	-> 749
/*     */     //   #619	-> 753
/*     */     //   #263	-> 761
/*     */     //   #105	-> 769
/*     */     //   #594	-> 780
/*     */     //   #69	-> 788
/*     */     //   #586	-> 795
/*     */     //   #199	-> 802
/*     */     //   #561	-> 812
/*     */     //   #540	-> 820
/*     */     //   #224	-> 831
/*     */     //   #365	-> 836
/*     */     //   #492	-> 840
/*     */     //   #343	-> 846
/*     */     //   #576	-> 851
/*     */     //   #298	-> 855
/*     */     //   #225	-> 861
/*     */     //   #525	-> 877
/*     */     //   #250	-> 888
/*     */     //   #216	-> 892
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	32	32	java/io/IOException
/*     */     //   47	91	91	java/io/IOException
/*     */     //   112	122	125	java/io/IOException
/*     */     //   117	146	149	java/io/IOException
/*     */     //   159	203	203	java/io/IOException
/*     */     //   227	272	272	java/io/IOException
/*     */     //   288	300	300	java/io/IOException
/*     */     //   311	342	342	java/io/IOException
/*     */     //   376	407	407	java/io/IOException
/*     */     //   411	434	437	java/io/IOException
/*     */     //   426	455	458	java/io/IOException
/*     */     //   441	475	475	java/io/IOException
/*     */     //   489	502	505	java/io/IOException
/*     */     //   495	513	516	java/io/IOException
/*     */     //   548	561	561	java/io/IOException
/*     */     //   582	598	598	java/io/IOException
/*     */     //   608	681	684	java/io/IOException
/*     */     //   676	695	695	java/io/IOException
/*     */     //   699	709	712	java/io/IOException
/*     */     //   704	738	738	java/io/IOException
/*     */     //   761	773	776	java/io/IOException
/*     */     //   802	824	827	java/io/IOException
/*     */     //   836	842	842	java/io/IOException
/*     */     //   851	857	857	java/io/IOException
/*     */     //   861	884	884	java/io/IOException
/*     */   }
/*     */   
/*     */   public void beginObject() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 1) {
/*     */         push(3);
/*     */         this.peeked = 0;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */   }
/*     */   
/*     */   public JsonToken peek() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       switch (i) {
/*     */         case 1:
/*     */           return JsonToken.BEGIN_OBJECT;
/*     */         case 2:
/*     */           return JsonToken.END_OBJECT;
/*     */         case 3:
/*     */           return JsonToken.BEGIN_ARRAY;
/*     */         case 4:
/*     */           return JsonToken.END_ARRAY;
/*     */         case 12:
/*     */         case 13:
/*     */         case 14:
/*     */           return JsonToken.NAME;
/*     */         case 5:
/*     */         case 6:
/*     */           return JsonToken.BOOLEAN;
/*     */         case 7:
/*     */           return JsonToken.NULL;
/*     */         case 8:
/*     */         case 9:
/*     */         case 10:
/*     */         case 11:
/*     */           return JsonToken.STRING;
/*     */         case 15:
/*     */         case 16:
/*     */           return JsonToken.NUMBER;
/*     */         case 17:
/*     */           return JsonToken.END_DOCUMENT;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new AssertionError();
/*     */   }
/*     */   
/*     */   private int peekKeyword() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buffer : [C
/*     */     //   4: aload_0
/*     */     //   5: getfield pos : I
/*     */     //   8: caload
/*     */     //   9: istore_1
/*     */     //   10: iload_1
/*     */     //   11: bipush #116
/*     */     //   13: if_icmpeq -> 29
/*     */     //   16: iload_1
/*     */     //   17: bipush #84
/*     */     //   19: if_icmpne -> 41
/*     */     //   22: goto -> 29
/*     */     //   25: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   28: athrow
/*     */     //   29: ldc 'true'
/*     */     //   31: astore_2
/*     */     //   32: ldc 'TRUE'
/*     */     //   34: astore_3
/*     */     //   35: iconst_5
/*     */     //   36: istore #4
/*     */     //   38: goto -> 107
/*     */     //   41: iload_1
/*     */     //   42: bipush #102
/*     */     //   44: if_icmpeq -> 60
/*     */     //   47: iload_1
/*     */     //   48: bipush #70
/*     */     //   50: if_icmpne -> 73
/*     */     //   53: goto -> 60
/*     */     //   56: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   59: athrow
/*     */     //   60: ldc 'false'
/*     */     //   62: astore_2
/*     */     //   63: ldc 'FALSE'
/*     */     //   65: astore_3
/*     */     //   66: bipush #6
/*     */     //   68: istore #4
/*     */     //   70: goto -> 107
/*     */     //   73: iload_1
/*     */     //   74: bipush #110
/*     */     //   76: if_icmpeq -> 92
/*     */     //   79: iload_1
/*     */     //   80: bipush #78
/*     */     //   82: if_icmpne -> 105
/*     */     //   85: goto -> 92
/*     */     //   88: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   91: athrow
/*     */     //   92: ldc 'null'
/*     */     //   94: astore_2
/*     */     //   95: ldc 'NULL'
/*     */     //   97: astore_3
/*     */     //   98: bipush #7
/*     */     //   100: istore #4
/*     */     //   102: goto -> 107
/*     */     //   105: iconst_0
/*     */     //   106: ireturn
/*     */     //   107: aload_2
/*     */     //   108: invokevirtual length : ()I
/*     */     //   111: istore #5
/*     */     //   113: iconst_1
/*     */     //   114: istore #6
/*     */     //   116: iload #6
/*     */     //   118: iload #5
/*     */     //   120: if_icmpge -> 220
/*     */     //   123: aload_0
/*     */     //   124: getfield pos : I
/*     */     //   127: iload #6
/*     */     //   129: iadd
/*     */     //   130: aload_0
/*     */     //   131: getfield limit : I
/*     */     //   134: if_icmplt -> 168
/*     */     //   137: goto -> 144
/*     */     //   140: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: aload_0
/*     */     //   145: iload #6
/*     */     //   147: iconst_1
/*     */     //   148: iadd
/*     */     //   149: invokespecial fillBuffer : (I)Z
/*     */     //   152: ifne -> 168
/*     */     //   155: goto -> 162
/*     */     //   158: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   161: athrow
/*     */     //   162: iconst_0
/*     */     //   163: ireturn
/*     */     //   164: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: aload_0
/*     */     //   169: getfield buffer : [C
/*     */     //   172: aload_0
/*     */     //   173: getfield pos : I
/*     */     //   176: iload #6
/*     */     //   178: iadd
/*     */     //   179: caload
/*     */     //   180: istore_1
/*     */     //   181: iload_1
/*     */     //   182: aload_2
/*     */     //   183: iload #6
/*     */     //   185: invokevirtual charAt : (I)C
/*     */     //   188: if_icmpeq -> 214
/*     */     //   191: iload_1
/*     */     //   192: aload_3
/*     */     //   193: iload #6
/*     */     //   195: invokevirtual charAt : (I)C
/*     */     //   198: if_icmpeq -> 214
/*     */     //   201: goto -> 208
/*     */     //   204: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   207: athrow
/*     */     //   208: iconst_0
/*     */     //   209: ireturn
/*     */     //   210: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   213: athrow
/*     */     //   214: iinc #6, 1
/*     */     //   217: goto -> 116
/*     */     //   220: aload_0
/*     */     //   221: getfield pos : I
/*     */     //   224: iload #5
/*     */     //   226: iadd
/*     */     //   227: aload_0
/*     */     //   228: getfield limit : I
/*     */     //   231: if_icmplt -> 252
/*     */     //   234: aload_0
/*     */     //   235: iload #5
/*     */     //   237: iconst_1
/*     */     //   238: iadd
/*     */     //   239: invokespecial fillBuffer : (I)Z
/*     */     //   242: ifeq -> 284
/*     */     //   245: goto -> 252
/*     */     //   248: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   251: athrow
/*     */     //   252: aload_0
/*     */     //   253: aload_0
/*     */     //   254: getfield buffer : [C
/*     */     //   257: aload_0
/*     */     //   258: getfield pos : I
/*     */     //   261: iload #5
/*     */     //   263: iadd
/*     */     //   264: caload
/*     */     //   265: invokespecial isLiteral : (C)Z
/*     */     //   268: ifeq -> 284
/*     */     //   271: goto -> 278
/*     */     //   274: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   277: athrow
/*     */     //   278: iconst_0
/*     */     //   279: ireturn
/*     */     //   280: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   283: athrow
/*     */     //   284: aload_0
/*     */     //   285: dup
/*     */     //   286: getfield pos : I
/*     */     //   289: iload #5
/*     */     //   291: iadd
/*     */     //   292: putfield pos : I
/*     */     //   295: aload_0
/*     */     //   296: iload #4
/*     */     //   298: dup_x1
/*     */     //   299: putfield peeked : I
/*     */     //   302: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #389	-> 0
/*     */     //   #131	-> 10
/*     */     //   #600	-> 29
/*     */     //   #595	-> 32
/*     */     //   #232	-> 35
/*     */     //   #404	-> 41
/*     */     //   #106	-> 60
/*     */     //   #311	-> 63
/*     */     //   #129	-> 66
/*     */     //   #186	-> 73
/*     */     //   #567	-> 92
/*     */     //   #206	-> 95
/*     */     //   #415	-> 98
/*     */     //   #163	-> 105
/*     */     //   #528	-> 107
/*     */     //   #498	-> 113
/*     */     //   #439	-> 123
/*     */     //   #403	-> 162
/*     */     //   #541	-> 168
/*     */     //   #143	-> 181
/*     */     //   #547	-> 208
/*     */     //   #84	-> 214
/*     */     //   #36	-> 220
/*     */     //   #92	-> 278
/*     */     //   #72	-> 284
/*     */     //   #137	-> 295
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	22	25	java/io/IOException
/*     */     //   41	53	56	java/io/IOException
/*     */     //   73	85	88	java/io/IOException
/*     */     //   116	137	140	java/io/IOException
/*     */     //   123	155	158	java/io/IOException
/*     */     //   144	164	164	java/io/IOException
/*     */     //   181	201	204	java/io/IOException
/*     */     //   191	210	210	java/io/IOException
/*     */     //   220	245	248	java/io/IOException
/*     */     //   234	271	274	java/io/IOException
/*     */     //   252	280	280	java/io/IOException
/*     */   }
/*     */   
/*     */   public String nextString() throws IOException {
/*     */     String str;
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     if (i == 10) {
/*     */       str = nextUnquotedValue();
/*     */     } else if (i == 8) {
/*     */       str = nextQuotedValue('\'');
/*     */     } else if (i == 9) {
/*     */       str = nextQuotedValue('"');
/*     */     } else {
/*     */       if (i == 11) {
/*     */         str = this.peekedString;
/*     */         this.peekedString = null;
/*     */       } 
/*     */       if (i == 15) {
/*     */         str = Long.toString(this.peekedLong);
/*     */       } else {
/*     */         if (i == 16) {
/*     */           str = new String(this.buffer, this.pos, this.peekedNumberLength);
/*     */           this.pos += this.peekedNumberLength;
/*     */         } 
/*     */         throw new IllegalStateException("Expected a string but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */       } 
/*     */     } 
/*     */     this.peeked = 0;
/*     */     return str;
/*     */   }
/*     */   
/*     */   public void beginArray() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 3) {
/*     */         push(1);
/*     */         this.peeked = 0;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */   }
/*     */   
/*     */   public double nextDouble() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield peeked : I
/*     */     //   4: istore_1
/*     */     //   5: iload_1
/*     */     //   6: ifne -> 14
/*     */     //   9: aload_0
/*     */     //   10: invokespecial doPeek : ()I
/*     */     //   13: istore_1
/*     */     //   14: iload_1
/*     */     //   15: bipush #15
/*     */     //   17: if_icmpne -> 35
/*     */     //   20: aload_0
/*     */     //   21: iconst_0
/*     */     //   22: putfield peeked : I
/*     */     //   25: aload_0
/*     */     //   26: getfield peekedLong : J
/*     */     //   29: l2d
/*     */     //   30: dreturn
/*     */     //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   34: athrow
/*     */     //   35: iload_1
/*     */     //   36: bipush #16
/*     */     //   38: if_icmpne -> 84
/*     */     //   41: aload_0
/*     */     //   42: new java/lang/String
/*     */     //   45: dup
/*     */     //   46: aload_0
/*     */     //   47: getfield buffer : [C
/*     */     //   50: aload_0
/*     */     //   51: getfield pos : I
/*     */     //   54: aload_0
/*     */     //   55: getfield peekedNumberLength : I
/*     */     //   58: invokespecial <init> : ([CII)V
/*     */     //   61: putfield peekedString : Ljava/lang/String;
/*     */     //   64: aload_0
/*     */     //   65: dup
/*     */     //   66: getfield pos : I
/*     */     //   69: aload_0
/*     */     //   70: getfield peekedNumberLength : I
/*     */     //   73: iadd
/*     */     //   74: putfield pos : I
/*     */     //   77: goto -> 223
/*     */     //   80: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   83: athrow
/*     */     //   84: iload_1
/*     */     //   85: bipush #8
/*     */     //   87: if_icmpeq -> 103
/*     */     //   90: iload_1
/*     */     //   91: bipush #9
/*     */     //   93: if_icmpne -> 138
/*     */     //   96: goto -> 103
/*     */     //   99: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   102: athrow
/*     */     //   103: aload_0
/*     */     //   104: aload_0
/*     */     //   105: iload_1
/*     */     //   106: bipush #8
/*     */     //   108: if_icmpne -> 127
/*     */     //   111: goto -> 118
/*     */     //   114: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   117: athrow
/*     */     //   118: bipush #39
/*     */     //   120: goto -> 129
/*     */     //   123: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   126: athrow
/*     */     //   127: bipush #34
/*     */     //   129: invokespecial nextQuotedValue : (C)Ljava/lang/String;
/*     */     //   132: putfield peekedString : Ljava/lang/String;
/*     */     //   135: goto -> 223
/*     */     //   138: iload_1
/*     */     //   139: bipush #10
/*     */     //   141: if_icmpne -> 159
/*     */     //   144: aload_0
/*     */     //   145: aload_0
/*     */     //   146: invokespecial nextUnquotedValue : ()Ljava/lang/String;
/*     */     //   149: putfield peekedString : Ljava/lang/String;
/*     */     //   152: goto -> 223
/*     */     //   155: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   158: athrow
/*     */     //   159: iload_1
/*     */     //   160: bipush #11
/*     */     //   162: if_icmpeq -> 223
/*     */     //   165: new java/lang/IllegalStateException
/*     */     //   168: dup
/*     */     //   169: new java/lang/StringBuilder
/*     */     //   172: dup
/*     */     //   173: invokespecial <init> : ()V
/*     */     //   176: ldc 'Expected a double but was '
/*     */     //   178: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   181: aload_0
/*     */     //   182: invokevirtual peek : ()Lcom/google/gson/stream/JsonToken;
/*     */     //   185: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   188: ldc ' at line '
/*     */     //   190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   193: aload_0
/*     */     //   194: invokespecial getLineNumber : ()I
/*     */     //   197: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   200: ldc ' column '
/*     */     //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   205: aload_0
/*     */     //   206: invokespecial getColumnNumber : ()I
/*     */     //   209: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   212: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   215: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   218: athrow
/*     */     //   219: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   222: athrow
/*     */     //   223: aload_0
/*     */     //   224: bipush #11
/*     */     //   226: putfield peeked : I
/*     */     //   229: aload_0
/*     */     //   230: getfield peekedString : Ljava/lang/String;
/*     */     //   233: invokestatic parseDouble : (Ljava/lang/String;)D
/*     */     //   236: dstore_2
/*     */     //   237: aload_0
/*     */     //   238: getfield lenient : Z
/*     */     //   241: ifne -> 327
/*     */     //   244: dload_2
/*     */     //   245: invokestatic isNaN : (D)Z
/*     */     //   248: ifne -> 272
/*     */     //   251: goto -> 258
/*     */     //   254: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   257: athrow
/*     */     //   258: dload_2
/*     */     //   259: invokestatic isInfinite : (D)Z
/*     */     //   262: ifeq -> 327
/*     */     //   265: goto -> 272
/*     */     //   268: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   271: athrow
/*     */     //   272: new com/google/gson/stream/MalformedJsonException
/*     */     //   275: dup
/*     */     //   276: new java/lang/StringBuilder
/*     */     //   279: dup
/*     */     //   280: invokespecial <init> : ()V
/*     */     //   283: ldc 'JSON forbids NaN and infinities: '
/*     */     //   285: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   288: dload_2
/*     */     //   289: invokevirtual append : (D)Ljava/lang/StringBuilder;
/*     */     //   292: ldc ' at line '
/*     */     //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   297: aload_0
/*     */     //   298: invokespecial getLineNumber : ()I
/*     */     //   301: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   304: ldc ' column '
/*     */     //   306: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   309: aload_0
/*     */     //   310: invokespecial getColumnNumber : ()I
/*     */     //   313: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   316: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   319: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   322: athrow
/*     */     //   323: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   326: athrow
/*     */     //   327: aload_0
/*     */     //   328: aconst_null
/*     */     //   329: putfield peekedString : Ljava/lang/String;
/*     */     //   332: aload_0
/*     */     //   333: iconst_0
/*     */     //   334: putfield peeked : I
/*     */     //   337: dload_2
/*     */     //   338: dreturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #436	-> 0
/*     */     //   #128	-> 5
/*     */     //   #26	-> 9
/*     */     //   #282	-> 14
/*     */     //   #526	-> 20
/*     */     //   #530	-> 25
/*     */     //   #141	-> 35
/*     */     //   #175	-> 41
/*     */     //   #306	-> 64
/*     */     //   #197	-> 84
/*     */     //   #49	-> 103
/*     */     //   #283	-> 138
/*     */     //   #622	-> 144
/*     */     //   #253	-> 159
/*     */     //   #293	-> 165
/*     */     //   #383	-> 223
/*     */     //   #144	-> 229
/*     */     //   #573	-> 237
/*     */     //   #3	-> 272
/*     */     //   #2	-> 327
/*     */     //   #384	-> 332
/*     */     //   #278	-> 337
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	31	31	java/io/IOException
/*     */     //   35	80	80	java/io/IOException
/*     */     //   84	96	99	java/io/IOException
/*     */     //   90	111	114	java/io/IOException
/*     */     //   103	123	123	java/io/IOException
/*     */     //   138	155	155	java/io/IOException
/*     */     //   159	219	219	java/io/IOException
/*     */     //   237	251	254	java/io/IOException
/*     */     //   244	265	268	java/io/IOException
/*     */     //   258	323	323	java/io/IOException
/*     */   }
/*     */   
/*     */   public boolean hasNext() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i != 2)
/*     */         try {
/*     */           if (i != 4);
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   public final void setLenient(boolean paramBoolean) {
/*     */     this.lenient = paramBoolean;
/*     */   }
/*     */   
/*     */   private void skipUnquotedValue() throws IOException {
/*     */     do {
/*     */       byte b = 0;
/*     */       while (true) {
/*     */         try {
/*     */           if (this.pos + b < this.limit) {
/*     */             try {
/*     */               switch (this.buffer[this.pos + b]) {
/*     */                 case '#':
/*     */                 case '/':
/*     */                 case ';':
/*     */                 case '=':
/*     */                 case '\\':
/*     */                   checkLenient();
/*     */                 case '\t':
/*     */                 case '\n':
/*     */                 case '\f':
/*     */                 case '\r':
/*     */                 case ' ':
/*     */                 case ',':
/*     */                 case ':':
/*     */                 case '[':
/*     */                 case ']':
/*     */                 case '{':
/*     */                 case '}':
/*     */                   this.pos += b;
/*     */                   return;
/*     */               } 
/*     */             } catch (IOException iOException) {
/*     */               throw b(null);
/*     */             } 
/*     */             b++;
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */         this.pos += b;
/*     */         break;
/*     */       } 
/*     */     } while (fillBuffer(1));
/*     */   }
/*     */   
/*     */   public void nextNull() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 7) {
/*     */         this.peeked = 0;
/*     */       } else {
/*     */         throw new IllegalStateException("Expected null but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static {
/*     */     JsonReaderInternalAccess.INSTANCE = new JsonReader$1();
/*     */   }
/*     */   
/*     */   public int nextInt() throws IOException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield peeked : I
/*     */     //   4: istore_1
/*     */     //   5: iload_1
/*     */     //   6: ifne -> 14
/*     */     //   9: aload_0
/*     */     //   10: invokespecial doPeek : ()I
/*     */     //   13: istore_1
/*     */     //   14: iload_1
/*     */     //   15: bipush #15
/*     */     //   17: if_icmpne -> 101
/*     */     //   20: aload_0
/*     */     //   21: getfield peekedLong : J
/*     */     //   24: l2i
/*     */     //   25: istore_2
/*     */     //   26: aload_0
/*     */     //   27: getfield peekedLong : J
/*     */     //   30: iload_2
/*     */     //   31: i2l
/*     */     //   32: lcmp
/*     */     //   33: ifeq -> 94
/*     */     //   36: new java/lang/NumberFormatException
/*     */     //   39: dup
/*     */     //   40: new java/lang/StringBuilder
/*     */     //   43: dup
/*     */     //   44: invokespecial <init> : ()V
/*     */     //   47: ldc 'Expected an int but was '
/*     */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   52: aload_0
/*     */     //   53: getfield peekedLong : J
/*     */     //   56: invokevirtual append : (J)Ljava/lang/StringBuilder;
/*     */     //   59: ldc ' at line '
/*     */     //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   64: aload_0
/*     */     //   65: invokespecial getLineNumber : ()I
/*     */     //   68: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   71: ldc ' column '
/*     */     //   73: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   76: aload_0
/*     */     //   77: invokespecial getColumnNumber : ()I
/*     */     //   80: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   86: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   89: athrow
/*     */     //   90: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   93: athrow
/*     */     //   94: aload_0
/*     */     //   95: iconst_0
/*     */     //   96: putfield peeked : I
/*     */     //   99: iload_2
/*     */     //   100: ireturn
/*     */     //   101: iload_1
/*     */     //   102: bipush #16
/*     */     //   104: if_icmpne -> 150
/*     */     //   107: aload_0
/*     */     //   108: new java/lang/String
/*     */     //   111: dup
/*     */     //   112: aload_0
/*     */     //   113: getfield buffer : [C
/*     */     //   116: aload_0
/*     */     //   117: getfield pos : I
/*     */     //   120: aload_0
/*     */     //   121: getfield peekedNumberLength : I
/*     */     //   124: invokespecial <init> : ([CII)V
/*     */     //   127: putfield peekedString : Ljava/lang/String;
/*     */     //   130: aload_0
/*     */     //   131: dup
/*     */     //   132: getfield pos : I
/*     */     //   135: aload_0
/*     */     //   136: getfield peekedNumberLength : I
/*     */     //   139: iadd
/*     */     //   140: putfield pos : I
/*     */     //   143: goto -> 274
/*     */     //   146: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   149: athrow
/*     */     //   150: iload_1
/*     */     //   151: bipush #8
/*     */     //   153: if_icmpeq -> 169
/*     */     //   156: iload_1
/*     */     //   157: bipush #9
/*     */     //   159: if_icmpne -> 220
/*     */     //   162: goto -> 169
/*     */     //   165: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   168: athrow
/*     */     //   169: aload_0
/*     */     //   170: aload_0
/*     */     //   171: iload_1
/*     */     //   172: bipush #8
/*     */     //   174: if_icmpne -> 193
/*     */     //   177: goto -> 184
/*     */     //   180: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   183: athrow
/*     */     //   184: bipush #39
/*     */     //   186: goto -> 195
/*     */     //   189: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   192: athrow
/*     */     //   193: bipush #34
/*     */     //   195: invokespecial nextQuotedValue : (C)Ljava/lang/String;
/*     */     //   198: putfield peekedString : Ljava/lang/String;
/*     */     //   201: aload_0
/*     */     //   202: getfield peekedString : Ljava/lang/String;
/*     */     //   205: invokestatic parseInt : (Ljava/lang/String;)I
/*     */     //   208: istore_2
/*     */     //   209: aload_0
/*     */     //   210: iconst_0
/*     */     //   211: putfield peeked : I
/*     */     //   214: iload_2
/*     */     //   215: ireturn
/*     */     //   216: astore_3
/*     */     //   217: goto -> 274
/*     */     //   220: new java/lang/IllegalStateException
/*     */     //   223: dup
/*     */     //   224: new java/lang/StringBuilder
/*     */     //   227: dup
/*     */     //   228: invokespecial <init> : ()V
/*     */     //   231: ldc 'Expected an int but was '
/*     */     //   233: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   236: aload_0
/*     */     //   237: invokevirtual peek : ()Lcom/google/gson/stream/JsonToken;
/*     */     //   240: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   243: ldc ' at line '
/*     */     //   245: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   248: aload_0
/*     */     //   249: invokespecial getLineNumber : ()I
/*     */     //   252: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   255: ldc ' column '
/*     */     //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   260: aload_0
/*     */     //   261: invokespecial getColumnNumber : ()I
/*     */     //   264: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   267: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   270: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   273: athrow
/*     */     //   274: aload_0
/*     */     //   275: bipush #11
/*     */     //   277: putfield peeked : I
/*     */     //   280: aload_0
/*     */     //   281: getfield peekedString : Ljava/lang/String;
/*     */     //   284: invokestatic parseDouble : (Ljava/lang/String;)D
/*     */     //   287: dstore_3
/*     */     //   288: dload_3
/*     */     //   289: d2i
/*     */     //   290: istore_2
/*     */     //   291: iload_2
/*     */     //   292: i2d
/*     */     //   293: dload_3
/*     */     //   294: dcmpl
/*     */     //   295: ifeq -> 356
/*     */     //   298: new java/lang/NumberFormatException
/*     */     //   301: dup
/*     */     //   302: new java/lang/StringBuilder
/*     */     //   305: dup
/*     */     //   306: invokespecial <init> : ()V
/*     */     //   309: ldc 'Expected an int but was '
/*     */     //   311: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   314: aload_0
/*     */     //   315: getfield peekedString : Ljava/lang/String;
/*     */     //   318: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   321: ldc ' at line '
/*     */     //   323: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   326: aload_0
/*     */     //   327: invokespecial getLineNumber : ()I
/*     */     //   330: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   333: ldc ' column '
/*     */     //   335: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   338: aload_0
/*     */     //   339: invokespecial getColumnNumber : ()I
/*     */     //   342: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   345: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   348: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   351: athrow
/*     */     //   352: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   355: athrow
/*     */     //   356: aload_0
/*     */     //   357: aconst_null
/*     */     //   358: putfield peekedString : Ljava/lang/String;
/*     */     //   361: aload_0
/*     */     //   362: iconst_0
/*     */     //   363: putfield peeked : I
/*     */     //   366: iload_2
/*     */     //   367: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #505	-> 0
/*     */     //   #79	-> 5
/*     */     //   #320	-> 9
/*     */     //   #582	-> 14
/*     */     //   #318	-> 20
/*     */     //   #620	-> 26
/*     */     //   #183	-> 36
/*     */     //   #21	-> 94
/*     */     //   #458	-> 99
/*     */     //   #398	-> 101
/*     */     //   #255	-> 107
/*     */     //   #358	-> 130
/*     */     //   #395	-> 150
/*     */     //   #266	-> 169
/*     */     //   #178	-> 201
/*     */     //   #162	-> 209
/*     */     //   #587	-> 214
/*     */     //   #419	-> 216
/*     */     //   #546	-> 217
/*     */     //   #43	-> 220
/*     */     //   #181	-> 274
/*     */     //   #241	-> 280
/*     */     //   #114	-> 288
/*     */     //   #484	-> 291
/*     */     //   #198	-> 298
/*     */     //   #90	-> 356
/*     */     //   #560	-> 361
/*     */     //   #307	-> 366
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   26	90	90	java/lang/NumberFormatException
/*     */     //   101	146	146	java/lang/NumberFormatException
/*     */     //   150	162	165	java/lang/NumberFormatException
/*     */     //   156	177	180	java/lang/NumberFormatException
/*     */     //   169	189	189	java/lang/NumberFormatException
/*     */     //   201	215	216	java/lang/NumberFormatException
/*     */     //   291	352	352	java/lang/NumberFormatException
/*     */   }
/*     */   
/*     */   private char readEscapeCharacter() throws IOException {
/*     */     try {
/*     */       if (this.pos == this.limit)
/*     */         try {
/*     */           if (!fillBuffer(1))
/*     */             throw syntaxError("Unterminated escape sequence"); 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     char c = this.buffer[this.pos++];
/*     */     try {
/*     */       char c1;
/*     */       int i;
/*     */       int j;
/*     */       switch (c) {
/*     */         case 'u':
/*     */           try {
/*     */             if (this.pos + 4 > this.limit)
/*     */               try {
/*     */                 if (!fillBuffer(4))
/*     */                   throw syntaxError("Unterminated escape sequence"); 
/*     */               } catch (IOException iOException) {
/*     */                 throw b(null);
/*     */               }  
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */           c1 = Character.MIN_VALUE;
/*     */           for (i = this.pos, j = i + 4; i < j; i++) {
/*     */             char c2 = this.buffer[i];
/*     */             c1 = (char)(c1 << 4);
/*     */             try {
/*     */               if (c2 >= '0' && c2 <= '9') {
/*     */                 c1 = (char)(c1 + c2 - 48);
/*     */               } else {
/*     */                 try {
/*     */                   if (c2 >= 'a' && c2 <= 'f') {
/*     */                     c1 = (char)(c1 + c2 - 97 + 10);
/*     */                   } else {
/*     */                     try {
/*     */                       if (c2 >= 'A' && c2 <= 'F') {
/*     */                         c1 = (char)(c1 + c2 - 65 + 10);
/*     */                       } else {
/*     */                         throw new NumberFormatException("\\u" + new String(this.buffer, this.pos, 4));
/*     */                       } 
/*     */                     } catch (IOException iOException) {
/*     */                       throw b(null);
/*     */                     } 
/*     */                   } 
/*     */                 } catch (IOException iOException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */             } catch (IOException iOException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */           this.pos += 4;
/*     */           return c1;
/*     */         case 't':
/*     */           return '\t';
/*     */         case 'b':
/*     */           return '\b';
/*     */         case 'n':
/*     */           return '\n';
/*     */         case 'r':
/*     */           return '\r';
/*     */         case 'f':
/*     */           return '\f';
/*     */         case '\n':
/*     */           this.lineNumber++;
/*     */           this.lineStart = this.pos;
/*     */           break;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return c;
/*     */   }
/*     */   
/*     */   private int getLineNumber() {
/*     */     return this.lineNumber + 1;
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return getClass().getSimpleName() + " at line " + getLineNumber() + " column " + getColumnNumber();
/*     */   }
/*     */   
/*     */   private void skipQuotedValue(char paramChar) throws IOException {
/*     */     char[] arrayOfChar = this.buffer;
/*     */     while (true) {
/*     */       int i = this.pos;
/*     */       int j = this.limit;
/*     */       while (i < j) {
/*     */         char c = arrayOfChar[i++];
/*     */         try {
/*     */           if (c == paramChar) {
/*     */             this.pos = i;
/*     */             return;
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */         if (c == '\\') {
/*     */           this.pos = i;
/*     */           readEscapeCharacter();
/*     */           i = this.pos;
/*     */           j = this.limit;
/*     */         } 
/*     */         try {
/*     */           if (c == '\n') {
/*     */             this.lineNumber++;
/*     */             this.lineStart = i;
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */       this.pos = i;
/*     */       if (!fillBuffer(1))
/*     */         throw syntaxError("Unterminated string"); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void endObject() throws IOException {
/*     */     int i = this.peeked;
/*     */     if (i == 0)
/*     */       i = doPeek(); 
/*     */     try {
/*     */       if (i == 2) {
/*     */         this.stackSize--;
/*     */         this.peeked = 0;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Expected END_OBJECT but was " + peek() + " at line " + getLineNumber() + " column " + getColumnNumber());
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\stream\JsonReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */