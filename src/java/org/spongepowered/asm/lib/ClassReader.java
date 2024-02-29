/*      */ package org.spongepowered.asm.lib;
/*      */ 
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class ClassReader
/*      */ {
/*      */   static final boolean SIGNATURES = true;
/*      */   static final boolean ANNOTATIONS = true;
/*      */   static final boolean FRAMES = true;
/*      */   static final boolean WRITER = true;
/*      */   static final boolean RESIZE = true;
/*      */   public static final int SKIP_CODE = 1;
/*      */   public static final int SKIP_DEBUG = 2;
/*      */   public static final int SKIP_FRAMES = 4;
/*      */   public static final int EXPAND_FRAMES = 8;
/*      */   static final int EXPAND_ASM_INSNS = 256;
/*      */   public final byte[] b;
/*      */   private final int[] items;
/*      */   private final String[] strings;
/*      */   private final int maxStringLength;
/*      */   public final int header;
/*      */   
/*      */   public void accept(ClassVisitor paramClassVisitor, Attribute[] paramArrayOfAttribute, int paramInt) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield header : I
/*      */     //   4: istore #4
/*      */     //   6: aload_0
/*      */     //   7: getfield maxStringLength : I
/*      */     //   10: newarray char
/*      */     //   12: astore #5
/*      */     //   14: new org/spongepowered/asm/lib/Context
/*      */     //   17: dup
/*      */     //   18: invokespecial <init> : ()V
/*      */     //   21: astore #6
/*      */     //   23: aload #6
/*      */     //   25: aload_2
/*      */     //   26: putfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   29: aload #6
/*      */     //   31: iload_3
/*      */     //   32: putfield flags : I
/*      */     //   35: aload #6
/*      */     //   37: aload #5
/*      */     //   39: putfield buffer : [C
/*      */     //   42: aload_0
/*      */     //   43: iload #4
/*      */     //   45: invokevirtual readUnsignedShort : (I)I
/*      */     //   48: istore #7
/*      */     //   50: aload_0
/*      */     //   51: iload #4
/*      */     //   53: iconst_2
/*      */     //   54: iadd
/*      */     //   55: aload #5
/*      */     //   57: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   60: astore #8
/*      */     //   62: aload_0
/*      */     //   63: iload #4
/*      */     //   65: iconst_4
/*      */     //   66: iadd
/*      */     //   67: aload #5
/*      */     //   69: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   72: astore #9
/*      */     //   74: aload_0
/*      */     //   75: iload #4
/*      */     //   77: bipush #6
/*      */     //   79: iadd
/*      */     //   80: invokevirtual readUnsignedShort : (I)I
/*      */     //   83: anewarray java/lang/String
/*      */     //   86: astore #10
/*      */     //   88: iinc #4, 8
/*      */     //   91: iconst_0
/*      */     //   92: istore #11
/*      */     //   94: iload #11
/*      */     //   96: aload #10
/*      */     //   98: arraylength
/*      */     //   99: if_icmpge -> 128
/*      */     //   102: aload #10
/*      */     //   104: iload #11
/*      */     //   106: aload_0
/*      */     //   107: iload #4
/*      */     //   109: aload #5
/*      */     //   111: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   114: aastore
/*      */     //   115: iinc #4, 2
/*      */     //   118: iinc #11, 1
/*      */     //   121: goto -> 94
/*      */     //   124: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   127: athrow
/*      */     //   128: aconst_null
/*      */     //   129: astore #11
/*      */     //   131: aconst_null
/*      */     //   132: astore #12
/*      */     //   134: aconst_null
/*      */     //   135: astore #13
/*      */     //   137: aconst_null
/*      */     //   138: astore #14
/*      */     //   140: aconst_null
/*      */     //   141: astore #15
/*      */     //   143: aconst_null
/*      */     //   144: astore #16
/*      */     //   146: iconst_0
/*      */     //   147: istore #17
/*      */     //   149: iconst_0
/*      */     //   150: istore #18
/*      */     //   152: iconst_0
/*      */     //   153: istore #19
/*      */     //   155: iconst_0
/*      */     //   156: istore #20
/*      */     //   158: iconst_0
/*      */     //   159: istore #21
/*      */     //   161: aconst_null
/*      */     //   162: astore #22
/*      */     //   164: aload_0
/*      */     //   165: invokespecial getAttributes : ()I
/*      */     //   168: istore #4
/*      */     //   170: aload_0
/*      */     //   171: iload #4
/*      */     //   173: invokevirtual readUnsignedShort : (I)I
/*      */     //   176: istore #23
/*      */     //   178: iload #23
/*      */     //   180: ifle -> 646
/*      */     //   183: aload_0
/*      */     //   184: iload #4
/*      */     //   186: iconst_2
/*      */     //   187: iadd
/*      */     //   188: aload #5
/*      */     //   190: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   193: astore #24
/*      */     //   195: ldc 'SourceFile'
/*      */     //   197: aload #24
/*      */     //   199: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   202: ifeq -> 221
/*      */     //   205: aload_0
/*      */     //   206: iload #4
/*      */     //   208: bipush #8
/*      */     //   210: iadd
/*      */     //   211: aload #5
/*      */     //   213: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   216: astore #12
/*      */     //   218: goto -> 624
/*      */     //   221: ldc 'InnerClasses'
/*      */     //   223: aload #24
/*      */     //   225: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   228: ifeq -> 241
/*      */     //   231: iload #4
/*      */     //   233: bipush #8
/*      */     //   235: iadd
/*      */     //   236: istore #21
/*      */     //   238: goto -> 624
/*      */     //   241: ldc 'EnclosingMethod'
/*      */     //   243: aload #24
/*      */     //   245: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   248: ifeq -> 315
/*      */     //   251: aload_0
/*      */     //   252: iload #4
/*      */     //   254: bipush #8
/*      */     //   256: iadd
/*      */     //   257: aload #5
/*      */     //   259: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   262: astore #14
/*      */     //   264: aload_0
/*      */     //   265: iload #4
/*      */     //   267: bipush #10
/*      */     //   269: iadd
/*      */     //   270: invokevirtual readUnsignedShort : (I)I
/*      */     //   273: istore #25
/*      */     //   275: iload #25
/*      */     //   277: ifeq -> 312
/*      */     //   280: aload_0
/*      */     //   281: aload_0
/*      */     //   282: getfield items : [I
/*      */     //   285: iload #25
/*      */     //   287: iaload
/*      */     //   288: aload #5
/*      */     //   290: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   293: astore #15
/*      */     //   295: aload_0
/*      */     //   296: aload_0
/*      */     //   297: getfield items : [I
/*      */     //   300: iload #25
/*      */     //   302: iaload
/*      */     //   303: iconst_2
/*      */     //   304: iadd
/*      */     //   305: aload #5
/*      */     //   307: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   310: astore #16
/*      */     //   312: goto -> 624
/*      */     //   315: ldc 'Signature'
/*      */     //   317: aload #24
/*      */     //   319: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   322: ifeq -> 341
/*      */     //   325: aload_0
/*      */     //   326: iload #4
/*      */     //   328: bipush #8
/*      */     //   330: iadd
/*      */     //   331: aload #5
/*      */     //   333: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   336: astore #11
/*      */     //   338: goto -> 624
/*      */     //   341: ldc 'RuntimeVisibleAnnotations'
/*      */     //   343: aload #24
/*      */     //   345: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   348: ifeq -> 361
/*      */     //   351: iload #4
/*      */     //   353: bipush #8
/*      */     //   355: iadd
/*      */     //   356: istore #17
/*      */     //   358: goto -> 624
/*      */     //   361: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   363: aload #24
/*      */     //   365: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   368: ifeq -> 381
/*      */     //   371: iload #4
/*      */     //   373: bipush #8
/*      */     //   375: iadd
/*      */     //   376: istore #19
/*      */     //   378: goto -> 624
/*      */     //   381: ldc 'Deprecated'
/*      */     //   383: aload #24
/*      */     //   385: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   388: ifeq -> 401
/*      */     //   391: iload #7
/*      */     //   393: ldc 131072
/*      */     //   395: ior
/*      */     //   396: istore #7
/*      */     //   398: goto -> 624
/*      */     //   401: ldc 'Synthetic'
/*      */     //   403: aload #24
/*      */     //   405: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   408: ifeq -> 421
/*      */     //   411: iload #7
/*      */     //   413: ldc 266240
/*      */     //   415: ior
/*      */     //   416: istore #7
/*      */     //   418: goto -> 624
/*      */     //   421: ldc 'SourceDebugExtension'
/*      */     //   423: aload #24
/*      */     //   425: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   428: ifeq -> 461
/*      */     //   431: aload_0
/*      */     //   432: iload #4
/*      */     //   434: iconst_4
/*      */     //   435: iadd
/*      */     //   436: invokevirtual readInt : (I)I
/*      */     //   439: istore #25
/*      */     //   441: aload_0
/*      */     //   442: iload #4
/*      */     //   444: bipush #8
/*      */     //   446: iadd
/*      */     //   447: iload #25
/*      */     //   449: iload #25
/*      */     //   451: newarray char
/*      */     //   453: invokespecial readUTF : (II[C)Ljava/lang/String;
/*      */     //   456: astore #13
/*      */     //   458: goto -> 624
/*      */     //   461: ldc 'RuntimeInvisibleAnnotations'
/*      */     //   463: aload #24
/*      */     //   465: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   468: ifeq -> 481
/*      */     //   471: iload #4
/*      */     //   473: bipush #8
/*      */     //   475: iadd
/*      */     //   476: istore #18
/*      */     //   478: goto -> 624
/*      */     //   481: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   483: aload #24
/*      */     //   485: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   488: ifeq -> 501
/*      */     //   491: iload #4
/*      */     //   493: bipush #8
/*      */     //   495: iadd
/*      */     //   496: istore #20
/*      */     //   498: goto -> 624
/*      */     //   501: ldc 'BootstrapMethods'
/*      */     //   503: aload #24
/*      */     //   505: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   508: ifeq -> 582
/*      */     //   511: aload_0
/*      */     //   512: iload #4
/*      */     //   514: bipush #8
/*      */     //   516: iadd
/*      */     //   517: invokevirtual readUnsignedShort : (I)I
/*      */     //   520: newarray int
/*      */     //   522: astore #25
/*      */     //   524: iconst_0
/*      */     //   525: istore #26
/*      */     //   527: iload #4
/*      */     //   529: bipush #10
/*      */     //   531: iadd
/*      */     //   532: istore #27
/*      */     //   534: iload #26
/*      */     //   536: aload #25
/*      */     //   538: arraylength
/*      */     //   539: if_icmpge -> 572
/*      */     //   542: aload #25
/*      */     //   544: iload #26
/*      */     //   546: iload #27
/*      */     //   548: iastore
/*      */     //   549: iload #27
/*      */     //   551: iconst_2
/*      */     //   552: aload_0
/*      */     //   553: iload #27
/*      */     //   555: iconst_2
/*      */     //   556: iadd
/*      */     //   557: invokevirtual readUnsignedShort : (I)I
/*      */     //   560: iadd
/*      */     //   561: iconst_1
/*      */     //   562: ishl
/*      */     //   563: iadd
/*      */     //   564: istore #27
/*      */     //   566: iinc #26, 1
/*      */     //   569: goto -> 534
/*      */     //   572: aload #6
/*      */     //   574: aload #25
/*      */     //   576: putfield bootstrapMethods : [I
/*      */     //   579: goto -> 624
/*      */     //   582: aload_0
/*      */     //   583: aload_2
/*      */     //   584: aload #24
/*      */     //   586: iload #4
/*      */     //   588: bipush #8
/*      */     //   590: iadd
/*      */     //   591: aload_0
/*      */     //   592: iload #4
/*      */     //   594: iconst_4
/*      */     //   595: iadd
/*      */     //   596: invokevirtual readInt : (I)I
/*      */     //   599: aload #5
/*      */     //   601: iconst_m1
/*      */     //   602: aconst_null
/*      */     //   603: invokespecial readAttribute : ([Lorg/spongepowered/asm/lib/Attribute;Ljava/lang/String;II[CI[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   606: astore #25
/*      */     //   608: aload #25
/*      */     //   610: ifnull -> 624
/*      */     //   613: aload #25
/*      */     //   615: aload #22
/*      */     //   617: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   620: aload #25
/*      */     //   622: astore #22
/*      */     //   624: iload #4
/*      */     //   626: bipush #6
/*      */     //   628: aload_0
/*      */     //   629: iload #4
/*      */     //   631: iconst_4
/*      */     //   632: iadd
/*      */     //   633: invokevirtual readInt : (I)I
/*      */     //   636: iadd
/*      */     //   637: iadd
/*      */     //   638: istore #4
/*      */     //   640: iinc #23, -1
/*      */     //   643: goto -> 178
/*      */     //   646: aload_1
/*      */     //   647: aload_0
/*      */     //   648: aload_0
/*      */     //   649: getfield items : [I
/*      */     //   652: iconst_1
/*      */     //   653: iaload
/*      */     //   654: bipush #7
/*      */     //   656: isub
/*      */     //   657: invokevirtual readInt : (I)I
/*      */     //   660: iload #7
/*      */     //   662: aload #8
/*      */     //   664: aload #11
/*      */     //   666: aload #9
/*      */     //   668: aload #10
/*      */     //   670: invokevirtual visit : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*      */     //   673: iload_3
/*      */     //   674: iconst_2
/*      */     //   675: iand
/*      */     //   676: ifne -> 718
/*      */     //   679: aload #12
/*      */     //   681: ifnonnull -> 703
/*      */     //   684: goto -> 691
/*      */     //   687: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   690: athrow
/*      */     //   691: aload #13
/*      */     //   693: ifnull -> 718
/*      */     //   696: goto -> 703
/*      */     //   699: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   702: athrow
/*      */     //   703: aload_1
/*      */     //   704: aload #12
/*      */     //   706: aload #13
/*      */     //   708: invokevirtual visitSource : (Ljava/lang/String;Ljava/lang/String;)V
/*      */     //   711: goto -> 718
/*      */     //   714: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   717: athrow
/*      */     //   718: aload #14
/*      */     //   720: ifnull -> 740
/*      */     //   723: aload_1
/*      */     //   724: aload #14
/*      */     //   726: aload #15
/*      */     //   728: aload #16
/*      */     //   730: invokevirtual visitOuterClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*      */     //   733: goto -> 740
/*      */     //   736: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   739: athrow
/*      */     //   740: iload #17
/*      */     //   742: ifeq -> 796
/*      */     //   745: aload_0
/*      */     //   746: iload #17
/*      */     //   748: invokevirtual readUnsignedShort : (I)I
/*      */     //   751: istore #23
/*      */     //   753: iload #17
/*      */     //   755: iconst_2
/*      */     //   756: iadd
/*      */     //   757: istore #24
/*      */     //   759: iload #23
/*      */     //   761: ifle -> 796
/*      */     //   764: aload_0
/*      */     //   765: iload #24
/*      */     //   767: iconst_2
/*      */     //   768: iadd
/*      */     //   769: aload #5
/*      */     //   771: iconst_1
/*      */     //   772: aload_1
/*      */     //   773: aload_0
/*      */     //   774: iload #24
/*      */     //   776: aload #5
/*      */     //   778: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   781: iconst_1
/*      */     //   782: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   785: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   788: istore #24
/*      */     //   790: iinc #23, -1
/*      */     //   793: goto -> 759
/*      */     //   796: iload #18
/*      */     //   798: ifeq -> 852
/*      */     //   801: aload_0
/*      */     //   802: iload #18
/*      */     //   804: invokevirtual readUnsignedShort : (I)I
/*      */     //   807: istore #23
/*      */     //   809: iload #18
/*      */     //   811: iconst_2
/*      */     //   812: iadd
/*      */     //   813: istore #24
/*      */     //   815: iload #23
/*      */     //   817: ifle -> 852
/*      */     //   820: aload_0
/*      */     //   821: iload #24
/*      */     //   823: iconst_2
/*      */     //   824: iadd
/*      */     //   825: aload #5
/*      */     //   827: iconst_1
/*      */     //   828: aload_1
/*      */     //   829: aload_0
/*      */     //   830: iload #24
/*      */     //   832: aload #5
/*      */     //   834: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   837: iconst_0
/*      */     //   838: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   841: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   844: istore #24
/*      */     //   846: iinc #23, -1
/*      */     //   849: goto -> 815
/*      */     //   852: iload #19
/*      */     //   854: ifeq -> 928
/*      */     //   857: aload_0
/*      */     //   858: iload #19
/*      */     //   860: invokevirtual readUnsignedShort : (I)I
/*      */     //   863: istore #23
/*      */     //   865: iload #19
/*      */     //   867: iconst_2
/*      */     //   868: iadd
/*      */     //   869: istore #24
/*      */     //   871: iload #23
/*      */     //   873: ifle -> 928
/*      */     //   876: aload_0
/*      */     //   877: aload #6
/*      */     //   879: iload #24
/*      */     //   881: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   884: istore #24
/*      */     //   886: aload_0
/*      */     //   887: iload #24
/*      */     //   889: iconst_2
/*      */     //   890: iadd
/*      */     //   891: aload #5
/*      */     //   893: iconst_1
/*      */     //   894: aload_1
/*      */     //   895: aload #6
/*      */     //   897: getfield typeRef : I
/*      */     //   900: aload #6
/*      */     //   902: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   905: aload_0
/*      */     //   906: iload #24
/*      */     //   908: aload #5
/*      */     //   910: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   913: iconst_1
/*      */     //   914: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   917: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   920: istore #24
/*      */     //   922: iinc #23, -1
/*      */     //   925: goto -> 871
/*      */     //   928: iload #20
/*      */     //   930: ifeq -> 1004
/*      */     //   933: aload_0
/*      */     //   934: iload #20
/*      */     //   936: invokevirtual readUnsignedShort : (I)I
/*      */     //   939: istore #23
/*      */     //   941: iload #20
/*      */     //   943: iconst_2
/*      */     //   944: iadd
/*      */     //   945: istore #24
/*      */     //   947: iload #23
/*      */     //   949: ifle -> 1004
/*      */     //   952: aload_0
/*      */     //   953: aload #6
/*      */     //   955: iload #24
/*      */     //   957: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   960: istore #24
/*      */     //   962: aload_0
/*      */     //   963: iload #24
/*      */     //   965: iconst_2
/*      */     //   966: iadd
/*      */     //   967: aload #5
/*      */     //   969: iconst_1
/*      */     //   970: aload_1
/*      */     //   971: aload #6
/*      */     //   973: getfield typeRef : I
/*      */     //   976: aload #6
/*      */     //   978: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   981: aload_0
/*      */     //   982: iload #24
/*      */     //   984: aload #5
/*      */     //   986: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   989: iconst_0
/*      */     //   990: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   993: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   996: istore #24
/*      */     //   998: iinc #23, -1
/*      */     //   1001: goto -> 947
/*      */     //   1004: aload #22
/*      */     //   1006: ifnull -> 1035
/*      */     //   1009: aload #22
/*      */     //   1011: getfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1014: astore #23
/*      */     //   1016: aload #22
/*      */     //   1018: aconst_null
/*      */     //   1019: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1022: aload_1
/*      */     //   1023: aload #22
/*      */     //   1025: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*      */     //   1028: aload #23
/*      */     //   1030: astore #22
/*      */     //   1032: goto -> 1004
/*      */     //   1035: iload #21
/*      */     //   1037: ifeq -> 1113
/*      */     //   1040: iload #21
/*      */     //   1042: iconst_2
/*      */     //   1043: iadd
/*      */     //   1044: istore #23
/*      */     //   1046: aload_0
/*      */     //   1047: iload #21
/*      */     //   1049: invokevirtual readUnsignedShort : (I)I
/*      */     //   1052: istore #24
/*      */     //   1054: iload #24
/*      */     //   1056: ifle -> 1113
/*      */     //   1059: aload_1
/*      */     //   1060: aload_0
/*      */     //   1061: iload #23
/*      */     //   1063: aload #5
/*      */     //   1065: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   1068: aload_0
/*      */     //   1069: iload #23
/*      */     //   1071: iconst_2
/*      */     //   1072: iadd
/*      */     //   1073: aload #5
/*      */     //   1075: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   1078: aload_0
/*      */     //   1079: iload #23
/*      */     //   1081: iconst_4
/*      */     //   1082: iadd
/*      */     //   1083: aload #5
/*      */     //   1085: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   1088: aload_0
/*      */     //   1089: iload #23
/*      */     //   1091: bipush #6
/*      */     //   1093: iadd
/*      */     //   1094: invokevirtual readUnsignedShort : (I)I
/*      */     //   1097: invokevirtual visitInnerClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
/*      */     //   1100: iinc #23, 8
/*      */     //   1103: iinc #24, -1
/*      */     //   1106: goto -> 1054
/*      */     //   1109: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1112: athrow
/*      */     //   1113: aload_0
/*      */     //   1114: getfield header : I
/*      */     //   1117: bipush #10
/*      */     //   1119: iadd
/*      */     //   1120: iconst_2
/*      */     //   1121: aload #10
/*      */     //   1123: arraylength
/*      */     //   1124: imul
/*      */     //   1125: iadd
/*      */     //   1126: istore #4
/*      */     //   1128: aload_0
/*      */     //   1129: iload #4
/*      */     //   1131: iconst_2
/*      */     //   1132: isub
/*      */     //   1133: invokevirtual readUnsignedShort : (I)I
/*      */     //   1136: istore #23
/*      */     //   1138: iload #23
/*      */     //   1140: ifle -> 1160
/*      */     //   1143: aload_0
/*      */     //   1144: aload_1
/*      */     //   1145: aload #6
/*      */     //   1147: iload #4
/*      */     //   1149: invokespecial readField : (Lorg/spongepowered/asm/lib/ClassVisitor;Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   1152: istore #4
/*      */     //   1154: iinc #23, -1
/*      */     //   1157: goto -> 1138
/*      */     //   1160: iinc #4, 2
/*      */     //   1163: aload_0
/*      */     //   1164: iload #4
/*      */     //   1166: iconst_2
/*      */     //   1167: isub
/*      */     //   1168: invokevirtual readUnsignedShort : (I)I
/*      */     //   1171: istore #23
/*      */     //   1173: iload #23
/*      */     //   1175: ifle -> 1195
/*      */     //   1178: aload_0
/*      */     //   1179: aload_1
/*      */     //   1180: aload #6
/*      */     //   1182: iload #4
/*      */     //   1184: invokespecial readMethod : (Lorg/spongepowered/asm/lib/ClassVisitor;Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   1187: istore #4
/*      */     //   1189: iinc #23, -1
/*      */     //   1192: goto -> 1173
/*      */     //   1195: aload_1
/*      */     //   1196: invokevirtual visitEnd : ()V
/*      */     //   1199: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #5	-> 0
/*      */     //   #89	-> 6
/*      */     //   #1239	-> 14
/*      */     //   #349	-> 23
/*      */     //   #180	-> 29
/*      */     //   #702	-> 35
/*      */     //   #42	-> 42
/*      */     //   #47	-> 50
/*      */     //   #36	-> 62
/*      */     //   #1076	-> 74
/*      */     //   #968	-> 88
/*      */     //   #329	-> 91
/*      */     //   #922	-> 102
/*      */     //   #87	-> 115
/*      */     //   #224	-> 118
/*      */     //   #558	-> 128
/*      */     //   #299	-> 131
/*      */     //   #317	-> 134
/*      */     //   #1215	-> 137
/*      */     //   #198	-> 140
/*      */     //   #804	-> 143
/*      */     //   #1073	-> 146
/*      */     //   #512	-> 149
/*      */     //   #823	-> 152
/*      */     //   #218	-> 155
/*      */     //   #1123	-> 158
/*      */     //   #924	-> 161
/*      */     //   #821	-> 164
/*      */     //   #676	-> 170
/*      */     //   #627	-> 183
/*      */     //   #808	-> 195
/*      */     //   #386	-> 205
/*      */     //   #1145	-> 221
/*      */     //   #375	-> 231
/*      */     //   #669	-> 241
/*      */     //   #965	-> 251
/*      */     //   #775	-> 264
/*      */     //   #64	-> 275
/*      */     //   #858	-> 280
/*      */     //   #903	-> 295
/*      */     //   #25	-> 312
/*      */     //   #1034	-> 325
/*      */     //   #266	-> 341
/*      */     //   #480	-> 345
/*      */     //   #14	-> 351
/*      */     //   #700	-> 361
/*      */     //   #392	-> 365
/*      */     //   #56	-> 371
/*      */     //   #515	-> 381
/*      */     //   #276	-> 391
/*      */     //   #947	-> 401
/*      */     //   #675	-> 411
/*      */     //   #693	-> 421
/*      */     //   #91	-> 431
/*      */     //   #486	-> 441
/*      */     //   #609	-> 458
/*      */     //   #222	-> 465
/*      */     //   #606	-> 471
/*      */     //   #1247	-> 481
/*      */     //   #260	-> 485
/*      */     //   #124	-> 491
/*      */     //   #1265	-> 501
/*      */     //   #644	-> 511
/*      */     //   #879	-> 524
/*      */     //   #465	-> 542
/*      */     //   #460	-> 549
/*      */     //   #447	-> 566
/*      */     //   #1092	-> 572
/*      */     //   #939	-> 579
/*      */     //   #502	-> 582
/*      */     //   #764	-> 596
/*      */     //   #1307	-> 603
/*      */     //   #772	-> 608
/*      */     //   #458	-> 613
/*      */     //   #230	-> 620
/*      */     //   #405	-> 624
/*      */     //   #743	-> 640
/*      */     //   #371	-> 646
/*      */     //   #275	-> 673
/*      */     //   #729	-> 703
/*      */     //   #966	-> 718
/*      */     //   #849	-> 723
/*      */     //   #284	-> 740
/*      */     //   #770	-> 745
/*      */     //   #1140	-> 764
/*      */     //   #842	-> 778
/*      */     //   #1268	-> 785
/*      */     //   #508	-> 790
/*      */     //   #60	-> 796
/*      */     //   #796	-> 801
/*      */     //   #337	-> 820
/*      */     //   #524	-> 834
/*      */     //   #865	-> 841
/*      */     //   #58	-> 846
/*      */     //   #286	-> 852
/*      */     //   #838	-> 857
/*      */     //   #870	-> 876
/*      */     //   #94	-> 886
/*      */     //   #948	-> 910
/*      */     //   #217	-> 914
/*      */     //   #240	-> 917
/*      */     //   #283	-> 922
/*      */     //   #621	-> 928
/*      */     //   #506	-> 933
/*      */     //   #1100	-> 952
/*      */     //   #631	-> 962
/*      */     //   #143	-> 986
/*      */     //   #1106	-> 990
/*      */     //   #762	-> 993
/*      */     //   #708	-> 998
/*      */     //   #582	-> 1004
/*      */     //   #345	-> 1009
/*      */     //   #1105	-> 1016
/*      */     //   #614	-> 1022
/*      */     //   #172	-> 1028
/*      */     //   #83	-> 1032
/*      */     //   #934	-> 1035
/*      */     //   #351	-> 1040
/*      */     //   #706	-> 1046
/*      */     //   #1159	-> 1059
/*      */     //   #1308	-> 1075
/*      */     //   #546	-> 1094
/*      */     //   #1018	-> 1097
/*      */     //   #760	-> 1100
/*      */     //   #396	-> 1103
/*      */     //   #1038	-> 1113
/*      */     //   #451	-> 1128
/*      */     //   #201	-> 1143
/*      */     //   #248	-> 1154
/*      */     //   #478	-> 1160
/*      */     //   #1127	-> 1163
/*      */     //   #622	-> 1178
/*      */     //   #759	-> 1189
/*      */     //   #452	-> 1195
/*      */     //   #552	-> 1199
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   94	124	124	java/lang/IllegalArgumentException
/*      */     //   646	684	687	java/lang/IllegalArgumentException
/*      */     //   679	696	699	java/lang/IllegalArgumentException
/*      */     //   691	711	714	java/lang/IllegalArgumentException
/*      */     //   718	733	736	java/lang/IllegalArgumentException
/*      */     //   1054	1109	1109	java/lang/IllegalArgumentException
/*      */   }
/*      */   
/*      */   public ClassReader(byte[] paramArrayOfbyte) {
/*   48 */     this(paramArrayOfbyte, 0, paramArrayOfbyte.length);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int getItemCount() {
/*   93 */     return this.items.length;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected Label readLabel(int paramInt, Label[] paramArrayOfLabel) {
/*      */     
/*  165 */     try { if (paramArrayOfLabel[paramInt] == null)
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  825 */         paramArrayOfLabel[paramInt] = new Label(); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*      */     
/*      */     return paramArrayOfLabel[paramInt];
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public ClassReader(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
/*      */     this.b = paramArrayOfbyte;
/*      */     if (readShort(paramInt1 + 6) > 52) {
/*      */       throw new IllegalArgumentException();
/*      */     }
/*      */     this.items = new int[readUnsignedShort(paramInt1 + 8)];
/* 1181 */     int i = this.items.length;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     this.strings = new String[i];
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int j = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int k = paramInt1 + 10;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     byte b = 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     while (true) {
/*      */       
/*      */       try { if (b < i)
/*      */         { int m;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           this.items[b] = k + 1;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1289 */           switch (paramArrayOfbyte[k]) { case 3: case 4: case 9: case 10: case 11: case 12: case 18: m = 5; break;case 5: case 6: m = 9; b++; break;case 1: m = 3 + readUnsignedShort(k + 1); if (m > j) j = m;  break;case 15: m = 4; break;default: m = 3; break; }  k += m; b++; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*      */       
/*      */       break;
/*      */     } 
/*      */     this.maxStringLength = j;
/*      */     this.header = k;
/*      */   }
/* 1296 */   public ClassReader(String paramString) throws IOException { this(readClass(ClassLoader.getSystemResourceAsStream(paramString.replace('.', '/') + ".class"), true)); }
/*      */   private int[] readTypeAnnotations(MethodVisitor paramMethodVisitor, Context paramContext, int paramInt, boolean paramBoolean) { char[] arrayOfChar = paramContext.buffer; int[] arrayOfInt = new int[readUnsignedShort(paramInt)]; paramInt += 2; for (byte b = 0; b < arrayOfInt.length; i = readInt(paramInt)) { int i; arrayOfInt[b] = paramInt; }  return arrayOfInt; }
/*      */   private void readCode(MethodVisitor paramMethodVisitor, Context paramContext, int paramInt) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield b : [B
/*      */     //   4: astore #4
/*      */     //   6: aload_2
/*      */     //   7: getfield buffer : [C
/*      */     //   10: astore #5
/*      */     //   12: aload_0
/*      */     //   13: iload_3
/*      */     //   14: invokevirtual readUnsignedShort : (I)I
/*      */     //   17: istore #6
/*      */     //   19: aload_0
/*      */     //   20: iload_3
/*      */     //   21: iconst_2
/*      */     //   22: iadd
/*      */     //   23: invokevirtual readUnsignedShort : (I)I
/*      */     //   26: istore #7
/*      */     //   28: aload_0
/*      */     //   29: iload_3
/*      */     //   30: iconst_4
/*      */     //   31: iadd
/*      */     //   32: invokevirtual readInt : (I)I
/*      */     //   35: istore #8
/*      */     //   37: iinc #3, 8
/*      */     //   40: iload_3
/*      */     //   41: istore #9
/*      */     //   43: iload_3
/*      */     //   44: iload #8
/*      */     //   46: iadd
/*      */     //   47: istore #10
/*      */     //   49: aload_2
/*      */     //   50: iload #8
/*      */     //   52: iconst_2
/*      */     //   53: iadd
/*      */     //   54: anewarray org/spongepowered/asm/lib/Label
/*      */     //   57: dup_x1
/*      */     //   58: putfield labels : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   61: astore #11
/*      */     //   63: aload_0
/*      */     //   64: iload #8
/*      */     //   66: iconst_1
/*      */     //   67: iadd
/*      */     //   68: aload #11
/*      */     //   70: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   73: pop
/*      */     //   74: iload_3
/*      */     //   75: iload #10
/*      */     //   77: if_icmpge -> 492
/*      */     //   80: iload_3
/*      */     //   81: iload #9
/*      */     //   83: isub
/*      */     //   84: istore #12
/*      */     //   86: aload #4
/*      */     //   88: iload_3
/*      */     //   89: baload
/*      */     //   90: sipush #255
/*      */     //   93: iand
/*      */     //   94: istore #13
/*      */     //   96: getstatic org/spongepowered/asm/lib/ClassWriter.TYPE : [B
/*      */     //   99: iload #13
/*      */     //   101: baload
/*      */     //   102: tableswitch default -> 486, 0 -> 192, 1 -> 468, 2 -> 474, 3 -> 468, 4 -> 192, 5 -> 474, 6 -> 474, 7 -> 480, 8 -> 480, 9 -> 202, 10 -> 248, 11 -> 468, 12 -> 474, 13 -> 474, 14 -> 307, 15 -> 393, 16 -> 486, 17 -> 271, 18 -> 225
/*      */     //   192: iinc #3, 1
/*      */     //   195: goto -> 489
/*      */     //   198: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   201: athrow
/*      */     //   202: aload_0
/*      */     //   203: iload #12
/*      */     //   205: aload_0
/*      */     //   206: iload_3
/*      */     //   207: iconst_1
/*      */     //   208: iadd
/*      */     //   209: invokevirtual readShort : (I)S
/*      */     //   212: iadd
/*      */     //   213: aload #11
/*      */     //   215: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   218: pop
/*      */     //   219: iinc #3, 3
/*      */     //   222: goto -> 489
/*      */     //   225: aload_0
/*      */     //   226: iload #12
/*      */     //   228: aload_0
/*      */     //   229: iload_3
/*      */     //   230: iconst_1
/*      */     //   231: iadd
/*      */     //   232: invokevirtual readUnsignedShort : (I)I
/*      */     //   235: iadd
/*      */     //   236: aload #11
/*      */     //   238: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   241: pop
/*      */     //   242: iinc #3, 3
/*      */     //   245: goto -> 489
/*      */     //   248: aload_0
/*      */     //   249: iload #12
/*      */     //   251: aload_0
/*      */     //   252: iload_3
/*      */     //   253: iconst_1
/*      */     //   254: iadd
/*      */     //   255: invokevirtual readInt : (I)I
/*      */     //   258: iadd
/*      */     //   259: aload #11
/*      */     //   261: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   264: pop
/*      */     //   265: iinc #3, 5
/*      */     //   268: goto -> 489
/*      */     //   271: aload #4
/*      */     //   273: iload_3
/*      */     //   274: iconst_1
/*      */     //   275: iadd
/*      */     //   276: baload
/*      */     //   277: sipush #255
/*      */     //   280: iand
/*      */     //   281: istore #13
/*      */     //   283: iload #13
/*      */     //   285: sipush #132
/*      */     //   288: if_icmpne -> 301
/*      */     //   291: iinc #3, 6
/*      */     //   294: goto -> 489
/*      */     //   297: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   300: athrow
/*      */     //   301: iinc #3, 4
/*      */     //   304: goto -> 489
/*      */     //   307: iload_3
/*      */     //   308: iconst_4
/*      */     //   309: iadd
/*      */     //   310: iload #12
/*      */     //   312: iconst_3
/*      */     //   313: iand
/*      */     //   314: isub
/*      */     //   315: istore_3
/*      */     //   316: aload_0
/*      */     //   317: iload #12
/*      */     //   319: aload_0
/*      */     //   320: iload_3
/*      */     //   321: invokevirtual readInt : (I)I
/*      */     //   324: iadd
/*      */     //   325: aload #11
/*      */     //   327: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   330: pop
/*      */     //   331: aload_0
/*      */     //   332: iload_3
/*      */     //   333: bipush #8
/*      */     //   335: iadd
/*      */     //   336: invokevirtual readInt : (I)I
/*      */     //   339: aload_0
/*      */     //   340: iload_3
/*      */     //   341: iconst_4
/*      */     //   342: iadd
/*      */     //   343: invokevirtual readInt : (I)I
/*      */     //   346: isub
/*      */     //   347: iconst_1
/*      */     //   348: iadd
/*      */     //   349: istore #14
/*      */     //   351: iload #14
/*      */     //   353: ifle -> 387
/*      */     //   356: aload_0
/*      */     //   357: iload #12
/*      */     //   359: aload_0
/*      */     //   360: iload_3
/*      */     //   361: bipush #12
/*      */     //   363: iadd
/*      */     //   364: invokevirtual readInt : (I)I
/*      */     //   367: iadd
/*      */     //   368: aload #11
/*      */     //   370: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   373: pop
/*      */     //   374: iinc #3, 4
/*      */     //   377: iinc #14, -1
/*      */     //   380: goto -> 351
/*      */     //   383: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   386: athrow
/*      */     //   387: iinc #3, 12
/*      */     //   390: goto -> 489
/*      */     //   393: iload_3
/*      */     //   394: iconst_4
/*      */     //   395: iadd
/*      */     //   396: iload #12
/*      */     //   398: iconst_3
/*      */     //   399: iand
/*      */     //   400: isub
/*      */     //   401: istore_3
/*      */     //   402: aload_0
/*      */     //   403: iload #12
/*      */     //   405: aload_0
/*      */     //   406: iload_3
/*      */     //   407: invokevirtual readInt : (I)I
/*      */     //   410: iadd
/*      */     //   411: aload #11
/*      */     //   413: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   416: pop
/*      */     //   417: aload_0
/*      */     //   418: iload_3
/*      */     //   419: iconst_4
/*      */     //   420: iadd
/*      */     //   421: invokevirtual readInt : (I)I
/*      */     //   424: istore #14
/*      */     //   426: iload #14
/*      */     //   428: ifle -> 462
/*      */     //   431: aload_0
/*      */     //   432: iload #12
/*      */     //   434: aload_0
/*      */     //   435: iload_3
/*      */     //   436: bipush #12
/*      */     //   438: iadd
/*      */     //   439: invokevirtual readInt : (I)I
/*      */     //   442: iadd
/*      */     //   443: aload #11
/*      */     //   445: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   448: pop
/*      */     //   449: iinc #3, 8
/*      */     //   452: iinc #14, -1
/*      */     //   455: goto -> 426
/*      */     //   458: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   461: athrow
/*      */     //   462: iinc #3, 8
/*      */     //   465: goto -> 489
/*      */     //   468: iinc #3, 2
/*      */     //   471: goto -> 489
/*      */     //   474: iinc #3, 3
/*      */     //   477: goto -> 489
/*      */     //   480: iinc #3, 5
/*      */     //   483: goto -> 489
/*      */     //   486: iinc #3, 4
/*      */     //   489: goto -> 74
/*      */     //   492: aload_0
/*      */     //   493: iload_3
/*      */     //   494: invokevirtual readUnsignedShort : (I)I
/*      */     //   497: istore #12
/*      */     //   499: iload #12
/*      */     //   501: ifle -> 592
/*      */     //   504: aload_0
/*      */     //   505: aload_0
/*      */     //   506: iload_3
/*      */     //   507: iconst_2
/*      */     //   508: iadd
/*      */     //   509: invokevirtual readUnsignedShort : (I)I
/*      */     //   512: aload #11
/*      */     //   514: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   517: astore #13
/*      */     //   519: aload_0
/*      */     //   520: aload_0
/*      */     //   521: iload_3
/*      */     //   522: iconst_4
/*      */     //   523: iadd
/*      */     //   524: invokevirtual readUnsignedShort : (I)I
/*      */     //   527: aload #11
/*      */     //   529: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   532: astore #14
/*      */     //   534: aload_0
/*      */     //   535: aload_0
/*      */     //   536: iload_3
/*      */     //   537: bipush #6
/*      */     //   539: iadd
/*      */     //   540: invokevirtual readUnsignedShort : (I)I
/*      */     //   543: aload #11
/*      */     //   545: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   548: astore #15
/*      */     //   550: aload_0
/*      */     //   551: aload_0
/*      */     //   552: getfield items : [I
/*      */     //   555: aload_0
/*      */     //   556: iload_3
/*      */     //   557: bipush #8
/*      */     //   559: iadd
/*      */     //   560: invokevirtual readUnsignedShort : (I)I
/*      */     //   563: iaload
/*      */     //   564: aload #5
/*      */     //   566: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   569: astore #16
/*      */     //   571: aload_1
/*      */     //   572: aload #13
/*      */     //   574: aload #14
/*      */     //   576: aload #15
/*      */     //   578: aload #16
/*      */     //   580: invokevirtual visitTryCatchBlock : (Lorg/spongepowered/asm/lib/Label;Lorg/spongepowered/asm/lib/Label;Lorg/spongepowered/asm/lib/Label;Ljava/lang/String;)V
/*      */     //   583: iinc #3, 8
/*      */     //   586: iinc #12, -1
/*      */     //   589: goto -> 499
/*      */     //   592: iinc #3, 2
/*      */     //   595: aconst_null
/*      */     //   596: astore #12
/*      */     //   598: aconst_null
/*      */     //   599: astore #13
/*      */     //   601: iconst_0
/*      */     //   602: istore #14
/*      */     //   604: iconst_0
/*      */     //   605: istore #15
/*      */     //   607: iconst_m1
/*      */     //   608: istore #16
/*      */     //   610: iconst_m1
/*      */     //   611: istore #17
/*      */     //   613: iconst_0
/*      */     //   614: istore #18
/*      */     //   616: iconst_0
/*      */     //   617: istore #19
/*      */     //   619: iconst_1
/*      */     //   620: istore #20
/*      */     //   622: aload_2
/*      */     //   623: getfield flags : I
/*      */     //   626: bipush #8
/*      */     //   628: iand
/*      */     //   629: ifeq -> 640
/*      */     //   632: iconst_1
/*      */     //   633: goto -> 641
/*      */     //   636: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   639: athrow
/*      */     //   640: iconst_0
/*      */     //   641: istore #21
/*      */     //   643: iconst_0
/*      */     //   644: istore #22
/*      */     //   646: iconst_0
/*      */     //   647: istore #23
/*      */     //   649: iconst_0
/*      */     //   650: istore #24
/*      */     //   652: aconst_null
/*      */     //   653: astore #25
/*      */     //   655: aconst_null
/*      */     //   656: astore #26
/*      */     //   658: aload_0
/*      */     //   659: iload_3
/*      */     //   660: invokevirtual readUnsignedShort : (I)I
/*      */     //   663: istore #27
/*      */     //   665: iload #27
/*      */     //   667: ifle -> 1390
/*      */     //   670: aload_0
/*      */     //   671: iload_3
/*      */     //   672: iconst_2
/*      */     //   673: iadd
/*      */     //   674: aload #5
/*      */     //   676: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   679: astore #28
/*      */     //   681: ldc 'LocalVariableTable'
/*      */     //   683: aload #28
/*      */     //   685: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   688: ifeq -> 832
/*      */     //   691: aload_2
/*      */     //   692: getfield flags : I
/*      */     //   695: iconst_2
/*      */     //   696: iand
/*      */     //   697: ifne -> 1371
/*      */     //   700: goto -> 707
/*      */     //   703: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   706: athrow
/*      */     //   707: iload_3
/*      */     //   708: bipush #8
/*      */     //   710: iadd
/*      */     //   711: istore #18
/*      */     //   713: aload_0
/*      */     //   714: iload_3
/*      */     //   715: bipush #8
/*      */     //   717: iadd
/*      */     //   718: invokevirtual readUnsignedShort : (I)I
/*      */     //   721: istore #29
/*      */     //   723: iload_3
/*      */     //   724: istore #30
/*      */     //   726: iload #29
/*      */     //   728: ifle -> 829
/*      */     //   731: aload_0
/*      */     //   732: iload #30
/*      */     //   734: bipush #10
/*      */     //   736: iadd
/*      */     //   737: invokevirtual readUnsignedShort : (I)I
/*      */     //   740: istore #31
/*      */     //   742: aload #11
/*      */     //   744: iload #31
/*      */     //   746: aaload
/*      */     //   747: ifnonnull -> 774
/*      */     //   750: aload_0
/*      */     //   751: iload #31
/*      */     //   753: aload #11
/*      */     //   755: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   758: dup
/*      */     //   759: getfield status : I
/*      */     //   762: iconst_1
/*      */     //   763: ior
/*      */     //   764: putfield status : I
/*      */     //   767: goto -> 774
/*      */     //   770: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   773: athrow
/*      */     //   774: iload #31
/*      */     //   776: aload_0
/*      */     //   777: iload #30
/*      */     //   779: bipush #12
/*      */     //   781: iadd
/*      */     //   782: invokevirtual readUnsignedShort : (I)I
/*      */     //   785: iadd
/*      */     //   786: istore #31
/*      */     //   788: aload #11
/*      */     //   790: iload #31
/*      */     //   792: aaload
/*      */     //   793: ifnonnull -> 820
/*      */     //   796: aload_0
/*      */     //   797: iload #31
/*      */     //   799: aload #11
/*      */     //   801: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   804: dup
/*      */     //   805: getfield status : I
/*      */     //   808: iconst_1
/*      */     //   809: ior
/*      */     //   810: putfield status : I
/*      */     //   813: goto -> 820
/*      */     //   816: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   819: athrow
/*      */     //   820: iinc #30, 10
/*      */     //   823: iinc #29, -1
/*      */     //   826: goto -> 726
/*      */     //   829: goto -> 1371
/*      */     //   832: ldc 'LocalVariableTypeTable'
/*      */     //   834: aload #28
/*      */     //   836: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   839: ifeq -> 851
/*      */     //   842: iload_3
/*      */     //   843: bipush #8
/*      */     //   845: iadd
/*      */     //   846: istore #19
/*      */     //   848: goto -> 1371
/*      */     //   851: ldc 'LineNumberTable'
/*      */     //   853: aload #28
/*      */     //   855: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   858: ifeq -> 1023
/*      */     //   861: aload_2
/*      */     //   862: getfield flags : I
/*      */     //   865: iconst_2
/*      */     //   866: iand
/*      */     //   867: ifne -> 1371
/*      */     //   870: goto -> 877
/*      */     //   873: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   876: athrow
/*      */     //   877: aload_0
/*      */     //   878: iload_3
/*      */     //   879: bipush #8
/*      */     //   881: iadd
/*      */     //   882: invokevirtual readUnsignedShort : (I)I
/*      */     //   885: istore #29
/*      */     //   887: iload_3
/*      */     //   888: istore #30
/*      */     //   890: iload #29
/*      */     //   892: ifle -> 1020
/*      */     //   895: aload_0
/*      */     //   896: iload #30
/*      */     //   898: bipush #10
/*      */     //   900: iadd
/*      */     //   901: invokevirtual readUnsignedShort : (I)I
/*      */     //   904: istore #31
/*      */     //   906: aload #11
/*      */     //   908: iload #31
/*      */     //   910: aaload
/*      */     //   911: ifnonnull -> 938
/*      */     //   914: aload_0
/*      */     //   915: iload #31
/*      */     //   917: aload #11
/*      */     //   919: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   922: dup
/*      */     //   923: getfield status : I
/*      */     //   926: iconst_1
/*      */     //   927: ior
/*      */     //   928: putfield status : I
/*      */     //   931: goto -> 938
/*      */     //   934: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   937: athrow
/*      */     //   938: aload #11
/*      */     //   940: iload #31
/*      */     //   942: aaload
/*      */     //   943: astore #32
/*      */     //   945: aload #32
/*      */     //   947: getfield line : I
/*      */     //   950: ifle -> 997
/*      */     //   953: aload #32
/*      */     //   955: getfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   958: ifnonnull -> 987
/*      */     //   961: goto -> 968
/*      */     //   964: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   967: athrow
/*      */     //   968: aload #32
/*      */     //   970: new org/spongepowered/asm/lib/Label
/*      */     //   973: dup
/*      */     //   974: invokespecial <init> : ()V
/*      */     //   977: putfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   980: goto -> 987
/*      */     //   983: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   986: athrow
/*      */     //   987: aload #32
/*      */     //   989: getfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   992: astore #32
/*      */     //   994: goto -> 945
/*      */     //   997: aload #32
/*      */     //   999: aload_0
/*      */     //   1000: iload #30
/*      */     //   1002: bipush #12
/*      */     //   1004: iadd
/*      */     //   1005: invokevirtual readUnsignedShort : (I)I
/*      */     //   1008: putfield line : I
/*      */     //   1011: iinc #30, 4
/*      */     //   1014: iinc #29, -1
/*      */     //   1017: goto -> 890
/*      */     //   1020: goto -> 1371
/*      */     //   1023: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   1025: aload #28
/*      */     //   1027: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1030: ifeq -> 1095
/*      */     //   1033: aload_0
/*      */     //   1034: aload_1
/*      */     //   1035: aload_2
/*      */     //   1036: iload_3
/*      */     //   1037: bipush #8
/*      */     //   1039: iadd
/*      */     //   1040: iconst_1
/*      */     //   1041: invokespecial readTypeAnnotations : (Lorg/spongepowered/asm/lib/MethodVisitor;Lorg/spongepowered/asm/lib/Context;IZ)[I
/*      */     //   1044: astore #12
/*      */     //   1046: aload #12
/*      */     //   1048: arraylength
/*      */     //   1049: ifeq -> 1072
/*      */     //   1052: aload_0
/*      */     //   1053: aload #12
/*      */     //   1055: iconst_0
/*      */     //   1056: iaload
/*      */     //   1057: invokevirtual readByte : (I)I
/*      */     //   1060: bipush #67
/*      */     //   1062: if_icmpge -> 1080
/*      */     //   1065: goto -> 1072
/*      */     //   1068: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1071: athrow
/*      */     //   1072: iconst_m1
/*      */     //   1073: goto -> 1090
/*      */     //   1076: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1079: athrow
/*      */     //   1080: aload_0
/*      */     //   1081: aload #12
/*      */     //   1083: iconst_0
/*      */     //   1084: iaload
/*      */     //   1085: iconst_1
/*      */     //   1086: iadd
/*      */     //   1087: invokevirtual readUnsignedShort : (I)I
/*      */     //   1090: istore #16
/*      */     //   1092: goto -> 1371
/*      */     //   1095: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   1097: aload #28
/*      */     //   1099: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1102: ifeq -> 1167
/*      */     //   1105: aload_0
/*      */     //   1106: aload_1
/*      */     //   1107: aload_2
/*      */     //   1108: iload_3
/*      */     //   1109: bipush #8
/*      */     //   1111: iadd
/*      */     //   1112: iconst_0
/*      */     //   1113: invokespecial readTypeAnnotations : (Lorg/spongepowered/asm/lib/MethodVisitor;Lorg/spongepowered/asm/lib/Context;IZ)[I
/*      */     //   1116: astore #13
/*      */     //   1118: aload #13
/*      */     //   1120: arraylength
/*      */     //   1121: ifeq -> 1144
/*      */     //   1124: aload_0
/*      */     //   1125: aload #13
/*      */     //   1127: iconst_0
/*      */     //   1128: iaload
/*      */     //   1129: invokevirtual readByte : (I)I
/*      */     //   1132: bipush #67
/*      */     //   1134: if_icmpge -> 1152
/*      */     //   1137: goto -> 1144
/*      */     //   1140: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1143: athrow
/*      */     //   1144: iconst_m1
/*      */     //   1145: goto -> 1162
/*      */     //   1148: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1151: athrow
/*      */     //   1152: aload_0
/*      */     //   1153: aload #13
/*      */     //   1155: iconst_0
/*      */     //   1156: iaload
/*      */     //   1157: iconst_1
/*      */     //   1158: iadd
/*      */     //   1159: invokevirtual readUnsignedShort : (I)I
/*      */     //   1162: istore #17
/*      */     //   1164: goto -> 1371
/*      */     //   1167: ldc 'StackMapTable'
/*      */     //   1169: aload #28
/*      */     //   1171: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1174: ifeq -> 1221
/*      */     //   1177: aload_2
/*      */     //   1178: getfield flags : I
/*      */     //   1181: iconst_4
/*      */     //   1182: iand
/*      */     //   1183: ifne -> 1371
/*      */     //   1186: goto -> 1193
/*      */     //   1189: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1192: athrow
/*      */     //   1193: iload_3
/*      */     //   1194: bipush #10
/*      */     //   1196: iadd
/*      */     //   1197: istore #22
/*      */     //   1199: aload_0
/*      */     //   1200: iload_3
/*      */     //   1201: iconst_4
/*      */     //   1202: iadd
/*      */     //   1203: invokevirtual readInt : (I)I
/*      */     //   1206: istore #23
/*      */     //   1208: aload_0
/*      */     //   1209: iload_3
/*      */     //   1210: bipush #8
/*      */     //   1212: iadd
/*      */     //   1213: invokevirtual readUnsignedShort : (I)I
/*      */     //   1216: istore #24
/*      */     //   1218: goto -> 1371
/*      */     //   1221: ldc 'StackMap'
/*      */     //   1223: aload #28
/*      */     //   1225: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1228: ifeq -> 1278
/*      */     //   1231: aload_2
/*      */     //   1232: getfield flags : I
/*      */     //   1235: iconst_4
/*      */     //   1236: iand
/*      */     //   1237: ifne -> 1371
/*      */     //   1240: goto -> 1247
/*      */     //   1243: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1246: athrow
/*      */     //   1247: iconst_0
/*      */     //   1248: istore #20
/*      */     //   1250: iload_3
/*      */     //   1251: bipush #10
/*      */     //   1253: iadd
/*      */     //   1254: istore #22
/*      */     //   1256: aload_0
/*      */     //   1257: iload_3
/*      */     //   1258: iconst_4
/*      */     //   1259: iadd
/*      */     //   1260: invokevirtual readInt : (I)I
/*      */     //   1263: istore #23
/*      */     //   1265: aload_0
/*      */     //   1266: iload_3
/*      */     //   1267: bipush #8
/*      */     //   1269: iadd
/*      */     //   1270: invokevirtual readUnsignedShort : (I)I
/*      */     //   1273: istore #24
/*      */     //   1275: goto -> 1371
/*      */     //   1278: iconst_0
/*      */     //   1279: istore #29
/*      */     //   1281: iload #29
/*      */     //   1283: aload_2
/*      */     //   1284: getfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1287: arraylength
/*      */     //   1288: if_icmpge -> 1371
/*      */     //   1291: aload_2
/*      */     //   1292: getfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1295: iload #29
/*      */     //   1297: aaload
/*      */     //   1298: getfield type : Ljava/lang/String;
/*      */     //   1301: aload #28
/*      */     //   1303: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   1306: ifeq -> 1365
/*      */     //   1309: goto -> 1316
/*      */     //   1312: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1315: athrow
/*      */     //   1316: aload_2
/*      */     //   1317: getfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1320: iload #29
/*      */     //   1322: aaload
/*      */     //   1323: aload_0
/*      */     //   1324: iload_3
/*      */     //   1325: bipush #8
/*      */     //   1327: iadd
/*      */     //   1328: aload_0
/*      */     //   1329: iload_3
/*      */     //   1330: iconst_4
/*      */     //   1331: iadd
/*      */     //   1332: invokevirtual readInt : (I)I
/*      */     //   1335: aload #5
/*      */     //   1337: iload #9
/*      */     //   1339: bipush #8
/*      */     //   1341: isub
/*      */     //   1342: aload #11
/*      */     //   1344: invokevirtual read : (Lorg/spongepowered/asm/lib/ClassReader;II[CI[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1347: astore #30
/*      */     //   1349: aload #30
/*      */     //   1351: ifnull -> 1365
/*      */     //   1354: aload #30
/*      */     //   1356: aload #26
/*      */     //   1358: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1361: aload #30
/*      */     //   1363: astore #26
/*      */     //   1365: iinc #29, 1
/*      */     //   1368: goto -> 1281
/*      */     //   1371: iload_3
/*      */     //   1372: bipush #6
/*      */     //   1374: aload_0
/*      */     //   1375: iload_3
/*      */     //   1376: iconst_4
/*      */     //   1377: iadd
/*      */     //   1378: invokevirtual readInt : (I)I
/*      */     //   1381: iadd
/*      */     //   1382: iadd
/*      */     //   1383: istore_3
/*      */     //   1384: iinc #27, -1
/*      */     //   1387: goto -> 665
/*      */     //   1390: iinc #3, 2
/*      */     //   1393: iload #22
/*      */     //   1395: ifeq -> 1577
/*      */     //   1398: aload_2
/*      */     //   1399: astore #25
/*      */     //   1401: aload #25
/*      */     //   1403: iconst_m1
/*      */     //   1404: putfield offset : I
/*      */     //   1407: aload #25
/*      */     //   1409: iconst_0
/*      */     //   1410: putfield mode : I
/*      */     //   1413: aload #25
/*      */     //   1415: iconst_0
/*      */     //   1416: putfield localCount : I
/*      */     //   1419: aload #25
/*      */     //   1421: iconst_0
/*      */     //   1422: putfield localDiff : I
/*      */     //   1425: aload #25
/*      */     //   1427: iconst_0
/*      */     //   1428: putfield stackCount : I
/*      */     //   1431: aload #25
/*      */     //   1433: iload #7
/*      */     //   1435: anewarray java/lang/Object
/*      */     //   1438: putfield local : [Ljava/lang/Object;
/*      */     //   1441: aload #25
/*      */     //   1443: iload #6
/*      */     //   1445: anewarray java/lang/Object
/*      */     //   1448: putfield stack : [Ljava/lang/Object;
/*      */     //   1451: iload #21
/*      */     //   1453: ifeq -> 1468
/*      */     //   1456: aload_0
/*      */     //   1457: aload_2
/*      */     //   1458: invokespecial getImplicitFrame : (Lorg/spongepowered/asm/lib/Context;)V
/*      */     //   1461: goto -> 1468
/*      */     //   1464: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1467: athrow
/*      */     //   1468: iload #22
/*      */     //   1470: istore #27
/*      */     //   1472: iload #27
/*      */     //   1474: iload #22
/*      */     //   1476: iload #23
/*      */     //   1478: iadd
/*      */     //   1479: iconst_2
/*      */     //   1480: isub
/*      */     //   1481: if_icmpge -> 1577
/*      */     //   1484: aload #4
/*      */     //   1486: iload #27
/*      */     //   1488: baload
/*      */     //   1489: bipush #8
/*      */     //   1491: if_icmpne -> 1571
/*      */     //   1494: goto -> 1501
/*      */     //   1497: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1500: athrow
/*      */     //   1501: aload_0
/*      */     //   1502: iload #27
/*      */     //   1504: iconst_1
/*      */     //   1505: iadd
/*      */     //   1506: invokevirtual readUnsignedShort : (I)I
/*      */     //   1509: istore #28
/*      */     //   1511: iload #28
/*      */     //   1513: iflt -> 1571
/*      */     //   1516: iload #28
/*      */     //   1518: iload #8
/*      */     //   1520: if_icmpge -> 1571
/*      */     //   1523: goto -> 1530
/*      */     //   1526: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1529: athrow
/*      */     //   1530: aload #4
/*      */     //   1532: iload #9
/*      */     //   1534: iload #28
/*      */     //   1536: iadd
/*      */     //   1537: baload
/*      */     //   1538: sipush #255
/*      */     //   1541: iand
/*      */     //   1542: sipush #187
/*      */     //   1545: if_icmpne -> 1571
/*      */     //   1548: goto -> 1555
/*      */     //   1551: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1554: athrow
/*      */     //   1555: aload_0
/*      */     //   1556: iload #28
/*      */     //   1558: aload #11
/*      */     //   1560: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   1563: pop
/*      */     //   1564: goto -> 1571
/*      */     //   1567: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1570: athrow
/*      */     //   1571: iinc #27, 1
/*      */     //   1574: goto -> 1472
/*      */     //   1577: aload_2
/*      */     //   1578: getfield flags : I
/*      */     //   1581: sipush #256
/*      */     //   1584: iand
/*      */     //   1585: ifeq -> 1605
/*      */     //   1588: aload_1
/*      */     //   1589: iconst_m1
/*      */     //   1590: iload #7
/*      */     //   1592: aconst_null
/*      */     //   1593: iconst_0
/*      */     //   1594: aconst_null
/*      */     //   1595: invokevirtual visitFrame : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
/*      */     //   1598: goto -> 1605
/*      */     //   1601: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1604: athrow
/*      */     //   1605: aload_2
/*      */     //   1606: getfield flags : I
/*      */     //   1609: sipush #256
/*      */     //   1612: iand
/*      */     //   1613: ifne -> 1625
/*      */     //   1616: bipush #-33
/*      */     //   1618: goto -> 1626
/*      */     //   1621: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1624: athrow
/*      */     //   1625: iconst_0
/*      */     //   1626: istore #27
/*      */     //   1628: iload #9
/*      */     //   1630: istore_3
/*      */     //   1631: iload_3
/*      */     //   1632: iload #10
/*      */     //   1634: if_icmpge -> 3428
/*      */     //   1637: iload_3
/*      */     //   1638: iload #9
/*      */     //   1640: isub
/*      */     //   1641: istore #28
/*      */     //   1643: aload #11
/*      */     //   1645: iload #28
/*      */     //   1647: aaload
/*      */     //   1648: astore #29
/*      */     //   1650: aload #29
/*      */     //   1652: ifnull -> 1742
/*      */     //   1655: aload #29
/*      */     //   1657: getfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   1660: astore #30
/*      */     //   1662: aload #29
/*      */     //   1664: aconst_null
/*      */     //   1665: putfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   1668: aload_1
/*      */     //   1669: aload #29
/*      */     //   1671: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   1674: aload_2
/*      */     //   1675: getfield flags : I
/*      */     //   1678: iconst_2
/*      */     //   1679: iand
/*      */     //   1680: ifne -> 1742
/*      */     //   1683: aload #29
/*      */     //   1685: getfield line : I
/*      */     //   1688: ifle -> 1742
/*      */     //   1691: goto -> 1698
/*      */     //   1694: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1697: athrow
/*      */     //   1698: aload_1
/*      */     //   1699: aload #29
/*      */     //   1701: getfield line : I
/*      */     //   1704: aload #29
/*      */     //   1706: invokevirtual visitLineNumber : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   1709: goto -> 1716
/*      */     //   1712: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1715: athrow
/*      */     //   1716: aload #30
/*      */     //   1718: ifnull -> 1742
/*      */     //   1721: aload_1
/*      */     //   1722: aload #30
/*      */     //   1724: getfield line : I
/*      */     //   1727: aload #29
/*      */     //   1729: invokevirtual visitLineNumber : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   1732: aload #30
/*      */     //   1734: getfield next : Lorg/spongepowered/asm/lib/Label;
/*      */     //   1737: astore #30
/*      */     //   1739: goto -> 1716
/*      */     //   1742: aload #25
/*      */     //   1744: ifnull -> 1912
/*      */     //   1747: aload #25
/*      */     //   1749: getfield offset : I
/*      */     //   1752: iload #28
/*      */     //   1754: if_icmpeq -> 1780
/*      */     //   1757: goto -> 1764
/*      */     //   1760: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1763: athrow
/*      */     //   1764: aload #25
/*      */     //   1766: getfield offset : I
/*      */     //   1769: iconst_m1
/*      */     //   1770: if_icmpne -> 1912
/*      */     //   1773: goto -> 1780
/*      */     //   1776: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1779: athrow
/*      */     //   1780: aload #25
/*      */     //   1782: getfield offset : I
/*      */     //   1785: iconst_m1
/*      */     //   1786: if_icmpeq -> 1881
/*      */     //   1789: goto -> 1796
/*      */     //   1792: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1795: athrow
/*      */     //   1796: iload #20
/*      */     //   1798: ifeq -> 1820
/*      */     //   1801: goto -> 1808
/*      */     //   1804: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1807: athrow
/*      */     //   1808: iload #21
/*      */     //   1810: ifeq -> 1852
/*      */     //   1813: goto -> 1820
/*      */     //   1816: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1819: athrow
/*      */     //   1820: aload_1
/*      */     //   1821: iconst_m1
/*      */     //   1822: aload #25
/*      */     //   1824: getfield localCount : I
/*      */     //   1827: aload #25
/*      */     //   1829: getfield local : [Ljava/lang/Object;
/*      */     //   1832: aload #25
/*      */     //   1834: getfield stackCount : I
/*      */     //   1837: aload #25
/*      */     //   1839: getfield stack : [Ljava/lang/Object;
/*      */     //   1842: invokevirtual visitFrame : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
/*      */     //   1845: goto -> 1881
/*      */     //   1848: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1851: athrow
/*      */     //   1852: aload_1
/*      */     //   1853: aload #25
/*      */     //   1855: getfield mode : I
/*      */     //   1858: aload #25
/*      */     //   1860: getfield localDiff : I
/*      */     //   1863: aload #25
/*      */     //   1865: getfield local : [Ljava/lang/Object;
/*      */     //   1868: aload #25
/*      */     //   1870: getfield stackCount : I
/*      */     //   1873: aload #25
/*      */     //   1875: getfield stack : [Ljava/lang/Object;
/*      */     //   1878: invokevirtual visitFrame : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
/*      */     //   1881: iload #24
/*      */     //   1883: ifle -> 1906
/*      */     //   1886: aload_0
/*      */     //   1887: iload #22
/*      */     //   1889: iload #20
/*      */     //   1891: iload #21
/*      */     //   1893: aload #25
/*      */     //   1895: invokespecial readFrame : (IZZLorg/spongepowered/asm/lib/Context;)I
/*      */     //   1898: istore #22
/*      */     //   1900: iinc #24, -1
/*      */     //   1903: goto -> 1742
/*      */     //   1906: aconst_null
/*      */     //   1907: astore #25
/*      */     //   1909: goto -> 1742
/*      */     //   1912: aload #4
/*      */     //   1914: iload_3
/*      */     //   1915: baload
/*      */     //   1916: sipush #255
/*      */     //   1919: iand
/*      */     //   1920: istore #30
/*      */     //   1922: getstatic org/spongepowered/asm/lib/ClassWriter.TYPE : [B
/*      */     //   1925: iload #30
/*      */     //   1927: baload
/*      */     //   1928: tableswitch default -> 3101, 0 -> 2020, 1 -> 2660, 2 -> 2678, 3 -> 2638, 4 -> 2036, 5 -> 3054, 6 -> 2746, 7 -> 2746, 8 -> 2895, 9 -> 2092, 10 -> 2117, 11 -> 2697, 12 -> 2723, 13 -> 3075, 14 -> 2416, 15 -> 2527, 16 -> 3101, 17 -> 2349, 18 -> 2145
/*      */     //   2020: aload_1
/*      */     //   2021: iload #30
/*      */     //   2023: invokevirtual visitInsn : (I)V
/*      */     //   2026: iinc #3, 1
/*      */     //   2029: goto -> 3127
/*      */     //   2032: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2035: athrow
/*      */     //   2036: iload #30
/*      */     //   2038: bipush #54
/*      */     //   2040: if_icmple -> 2068
/*      */     //   2043: iinc #30, -59
/*      */     //   2046: aload_1
/*      */     //   2047: bipush #54
/*      */     //   2049: iload #30
/*      */     //   2051: iconst_2
/*      */     //   2052: ishr
/*      */     //   2053: iadd
/*      */     //   2054: iload #30
/*      */     //   2056: iconst_3
/*      */     //   2057: iand
/*      */     //   2058: invokevirtual visitVarInsn : (II)V
/*      */     //   2061: goto -> 2086
/*      */     //   2064: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2067: athrow
/*      */     //   2068: iinc #30, -26
/*      */     //   2071: aload_1
/*      */     //   2072: bipush #21
/*      */     //   2074: iload #30
/*      */     //   2076: iconst_2
/*      */     //   2077: ishr
/*      */     //   2078: iadd
/*      */     //   2079: iload #30
/*      */     //   2081: iconst_3
/*      */     //   2082: iand
/*      */     //   2083: invokevirtual visitVarInsn : (II)V
/*      */     //   2086: iinc #3, 1
/*      */     //   2089: goto -> 3127
/*      */     //   2092: aload_1
/*      */     //   2093: iload #30
/*      */     //   2095: aload #11
/*      */     //   2097: iload #28
/*      */     //   2099: aload_0
/*      */     //   2100: iload_3
/*      */     //   2101: iconst_1
/*      */     //   2102: iadd
/*      */     //   2103: invokevirtual readShort : (I)S
/*      */     //   2106: iadd
/*      */     //   2107: aaload
/*      */     //   2108: invokevirtual visitJumpInsn : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   2111: iinc #3, 3
/*      */     //   2114: goto -> 3127
/*      */     //   2117: aload_1
/*      */     //   2118: iload #30
/*      */     //   2120: iload #27
/*      */     //   2122: iadd
/*      */     //   2123: aload #11
/*      */     //   2125: iload #28
/*      */     //   2127: aload_0
/*      */     //   2128: iload_3
/*      */     //   2129: iconst_1
/*      */     //   2130: iadd
/*      */     //   2131: invokevirtual readInt : (I)I
/*      */     //   2134: iadd
/*      */     //   2135: aaload
/*      */     //   2136: invokevirtual visitJumpInsn : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   2139: iinc #3, 5
/*      */     //   2142: goto -> 3127
/*      */     //   2145: iload #30
/*      */     //   2147: sipush #218
/*      */     //   2150: if_icmpge -> 2165
/*      */     //   2153: iload #30
/*      */     //   2155: bipush #49
/*      */     //   2157: isub
/*      */     //   2158: goto -> 2170
/*      */     //   2161: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2164: athrow
/*      */     //   2165: iload #30
/*      */     //   2167: bipush #20
/*      */     //   2169: isub
/*      */     //   2170: istore #30
/*      */     //   2172: aload #11
/*      */     //   2174: iload #28
/*      */     //   2176: aload_0
/*      */     //   2177: iload_3
/*      */     //   2178: iconst_1
/*      */     //   2179: iadd
/*      */     //   2180: invokevirtual readUnsignedShort : (I)I
/*      */     //   2183: iadd
/*      */     //   2184: aaload
/*      */     //   2185: astore #31
/*      */     //   2187: iload #30
/*      */     //   2189: sipush #167
/*      */     //   2192: if_icmpeq -> 2210
/*      */     //   2195: iload #30
/*      */     //   2197: sipush #168
/*      */     //   2200: if_icmpne -> 2228
/*      */     //   2203: goto -> 2210
/*      */     //   2206: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2209: athrow
/*      */     //   2210: aload_1
/*      */     //   2211: iload #30
/*      */     //   2213: bipush #33
/*      */     //   2215: iadd
/*      */     //   2216: aload #31
/*      */     //   2218: invokevirtual visitJumpInsn : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   2221: goto -> 2343
/*      */     //   2224: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2227: athrow
/*      */     //   2228: iload #30
/*      */     //   2230: sipush #166
/*      */     //   2233: if_icmpgt -> 2251
/*      */     //   2236: iload #30
/*      */     //   2238: iconst_1
/*      */     //   2239: iadd
/*      */     //   2240: iconst_1
/*      */     //   2241: ixor
/*      */     //   2242: iconst_1
/*      */     //   2243: isub
/*      */     //   2244: goto -> 2255
/*      */     //   2247: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2250: athrow
/*      */     //   2251: iload #30
/*      */     //   2253: iconst_1
/*      */     //   2254: ixor
/*      */     //   2255: istore #30
/*      */     //   2257: new org/spongepowered/asm/lib/Label
/*      */     //   2260: dup
/*      */     //   2261: invokespecial <init> : ()V
/*      */     //   2264: astore #32
/*      */     //   2266: aload_1
/*      */     //   2267: iload #30
/*      */     //   2269: aload #32
/*      */     //   2271: invokevirtual visitJumpInsn : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   2274: aload_1
/*      */     //   2275: sipush #200
/*      */     //   2278: aload #31
/*      */     //   2280: invokevirtual visitJumpInsn : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   2283: aload_1
/*      */     //   2284: aload #32
/*      */     //   2286: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   2289: iload #22
/*      */     //   2291: ifeq -> 2343
/*      */     //   2294: aload #25
/*      */     //   2296: ifnull -> 2325
/*      */     //   2299: goto -> 2306
/*      */     //   2302: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2305: athrow
/*      */     //   2306: aload #25
/*      */     //   2308: getfield offset : I
/*      */     //   2311: iload #28
/*      */     //   2313: iconst_3
/*      */     //   2314: iadd
/*      */     //   2315: if_icmpeq -> 2343
/*      */     //   2318: goto -> 2325
/*      */     //   2321: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2324: athrow
/*      */     //   2325: aload_1
/*      */     //   2326: sipush #256
/*      */     //   2329: iconst_0
/*      */     //   2330: aconst_null
/*      */     //   2331: iconst_0
/*      */     //   2332: aconst_null
/*      */     //   2333: invokevirtual visitFrame : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
/*      */     //   2336: goto -> 2343
/*      */     //   2339: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2342: athrow
/*      */     //   2343: iinc #3, 3
/*      */     //   2346: goto -> 3127
/*      */     //   2349: aload #4
/*      */     //   2351: iload_3
/*      */     //   2352: iconst_1
/*      */     //   2353: iadd
/*      */     //   2354: baload
/*      */     //   2355: sipush #255
/*      */     //   2358: iand
/*      */     //   2359: istore #30
/*      */     //   2361: iload #30
/*      */     //   2363: sipush #132
/*      */     //   2366: if_icmpne -> 2397
/*      */     //   2369: aload_1
/*      */     //   2370: aload_0
/*      */     //   2371: iload_3
/*      */     //   2372: iconst_2
/*      */     //   2373: iadd
/*      */     //   2374: invokevirtual readUnsignedShort : (I)I
/*      */     //   2377: aload_0
/*      */     //   2378: iload_3
/*      */     //   2379: iconst_4
/*      */     //   2380: iadd
/*      */     //   2381: invokevirtual readShort : (I)S
/*      */     //   2384: invokevirtual visitIincInsn : (II)V
/*      */     //   2387: iinc #3, 6
/*      */     //   2390: goto -> 3127
/*      */     //   2393: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2396: athrow
/*      */     //   2397: aload_1
/*      */     //   2398: iload #30
/*      */     //   2400: aload_0
/*      */     //   2401: iload_3
/*      */     //   2402: iconst_2
/*      */     //   2403: iadd
/*      */     //   2404: invokevirtual readUnsignedShort : (I)I
/*      */     //   2407: invokevirtual visitVarInsn : (II)V
/*      */     //   2410: iinc #3, 4
/*      */     //   2413: goto -> 3127
/*      */     //   2416: iload_3
/*      */     //   2417: iconst_4
/*      */     //   2418: iadd
/*      */     //   2419: iload #28
/*      */     //   2421: iconst_3
/*      */     //   2422: iand
/*      */     //   2423: isub
/*      */     //   2424: istore_3
/*      */     //   2425: iload #28
/*      */     //   2427: aload_0
/*      */     //   2428: iload_3
/*      */     //   2429: invokevirtual readInt : (I)I
/*      */     //   2432: iadd
/*      */     //   2433: istore #31
/*      */     //   2435: aload_0
/*      */     //   2436: iload_3
/*      */     //   2437: iconst_4
/*      */     //   2438: iadd
/*      */     //   2439: invokevirtual readInt : (I)I
/*      */     //   2442: istore #32
/*      */     //   2444: aload_0
/*      */     //   2445: iload_3
/*      */     //   2446: bipush #8
/*      */     //   2448: iadd
/*      */     //   2449: invokevirtual readInt : (I)I
/*      */     //   2452: istore #33
/*      */     //   2454: iload #33
/*      */     //   2456: iload #32
/*      */     //   2458: isub
/*      */     //   2459: iconst_1
/*      */     //   2460: iadd
/*      */     //   2461: anewarray org/spongepowered/asm/lib/Label
/*      */     //   2464: astore #34
/*      */     //   2466: iinc #3, 12
/*      */     //   2469: iconst_0
/*      */     //   2470: istore #35
/*      */     //   2472: iload #35
/*      */     //   2474: aload #34
/*      */     //   2476: arraylength
/*      */     //   2477: if_icmpge -> 2509
/*      */     //   2480: aload #34
/*      */     //   2482: iload #35
/*      */     //   2484: aload #11
/*      */     //   2486: iload #28
/*      */     //   2488: aload_0
/*      */     //   2489: iload_3
/*      */     //   2490: invokevirtual readInt : (I)I
/*      */     //   2493: iadd
/*      */     //   2494: aaload
/*      */     //   2495: aastore
/*      */     //   2496: iinc #3, 4
/*      */     //   2499: iinc #35, 1
/*      */     //   2502: goto -> 2472
/*      */     //   2505: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2508: athrow
/*      */     //   2509: aload_1
/*      */     //   2510: iload #32
/*      */     //   2512: iload #33
/*      */     //   2514: aload #11
/*      */     //   2516: iload #31
/*      */     //   2518: aaload
/*      */     //   2519: aload #34
/*      */     //   2521: invokevirtual visitTableSwitchInsn : (IILorg/spongepowered/asm/lib/Label;[Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   2524: goto -> 3127
/*      */     //   2527: iload_3
/*      */     //   2528: iconst_4
/*      */     //   2529: iadd
/*      */     //   2530: iload #28
/*      */     //   2532: iconst_3
/*      */     //   2533: iand
/*      */     //   2534: isub
/*      */     //   2535: istore_3
/*      */     //   2536: iload #28
/*      */     //   2538: aload_0
/*      */     //   2539: iload_3
/*      */     //   2540: invokevirtual readInt : (I)I
/*      */     //   2543: iadd
/*      */     //   2544: istore #31
/*      */     //   2546: aload_0
/*      */     //   2547: iload_3
/*      */     //   2548: iconst_4
/*      */     //   2549: iadd
/*      */     //   2550: invokevirtual readInt : (I)I
/*      */     //   2553: istore #32
/*      */     //   2555: iload #32
/*      */     //   2557: newarray int
/*      */     //   2559: astore #33
/*      */     //   2561: iload #32
/*      */     //   2563: anewarray org/spongepowered/asm/lib/Label
/*      */     //   2566: astore #34
/*      */     //   2568: iinc #3, 8
/*      */     //   2571: iconst_0
/*      */     //   2572: istore #35
/*      */     //   2574: iload #35
/*      */     //   2576: iload #32
/*      */     //   2578: if_icmpge -> 2622
/*      */     //   2581: aload #33
/*      */     //   2583: iload #35
/*      */     //   2585: aload_0
/*      */     //   2586: iload_3
/*      */     //   2587: invokevirtual readInt : (I)I
/*      */     //   2590: iastore
/*      */     //   2591: aload #34
/*      */     //   2593: iload #35
/*      */     //   2595: aload #11
/*      */     //   2597: iload #28
/*      */     //   2599: aload_0
/*      */     //   2600: iload_3
/*      */     //   2601: iconst_4
/*      */     //   2602: iadd
/*      */     //   2603: invokevirtual readInt : (I)I
/*      */     //   2606: iadd
/*      */     //   2607: aaload
/*      */     //   2608: aastore
/*      */     //   2609: iinc #3, 8
/*      */     //   2612: iinc #35, 1
/*      */     //   2615: goto -> 2574
/*      */     //   2618: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2621: athrow
/*      */     //   2622: aload_1
/*      */     //   2623: aload #11
/*      */     //   2625: iload #31
/*      */     //   2627: aaload
/*      */     //   2628: aload #33
/*      */     //   2630: aload #34
/*      */     //   2632: invokevirtual visitLookupSwitchInsn : (Lorg/spongepowered/asm/lib/Label;[I[Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   2635: goto -> 3127
/*      */     //   2638: aload_1
/*      */     //   2639: iload #30
/*      */     //   2641: aload #4
/*      */     //   2643: iload_3
/*      */     //   2644: iconst_1
/*      */     //   2645: iadd
/*      */     //   2646: baload
/*      */     //   2647: sipush #255
/*      */     //   2650: iand
/*      */     //   2651: invokevirtual visitVarInsn : (II)V
/*      */     //   2654: iinc #3, 2
/*      */     //   2657: goto -> 3127
/*      */     //   2660: aload_1
/*      */     //   2661: iload #30
/*      */     //   2663: aload #4
/*      */     //   2665: iload_3
/*      */     //   2666: iconst_1
/*      */     //   2667: iadd
/*      */     //   2668: baload
/*      */     //   2669: invokevirtual visitIntInsn : (II)V
/*      */     //   2672: iinc #3, 2
/*      */     //   2675: goto -> 3127
/*      */     //   2678: aload_1
/*      */     //   2679: iload #30
/*      */     //   2681: aload_0
/*      */     //   2682: iload_3
/*      */     //   2683: iconst_1
/*      */     //   2684: iadd
/*      */     //   2685: invokevirtual readShort : (I)S
/*      */     //   2688: invokevirtual visitIntInsn : (II)V
/*      */     //   2691: iinc #3, 3
/*      */     //   2694: goto -> 3127
/*      */     //   2697: aload_1
/*      */     //   2698: aload_0
/*      */     //   2699: aload #4
/*      */     //   2701: iload_3
/*      */     //   2702: iconst_1
/*      */     //   2703: iadd
/*      */     //   2704: baload
/*      */     //   2705: sipush #255
/*      */     //   2708: iand
/*      */     //   2709: aload #5
/*      */     //   2711: invokevirtual readConst : (I[C)Ljava/lang/Object;
/*      */     //   2714: invokevirtual visitLdcInsn : (Ljava/lang/Object;)V
/*      */     //   2717: iinc #3, 2
/*      */     //   2720: goto -> 3127
/*      */     //   2723: aload_1
/*      */     //   2724: aload_0
/*      */     //   2725: aload_0
/*      */     //   2726: iload_3
/*      */     //   2727: iconst_1
/*      */     //   2728: iadd
/*      */     //   2729: invokevirtual readUnsignedShort : (I)I
/*      */     //   2732: aload #5
/*      */     //   2734: invokevirtual readConst : (I[C)Ljava/lang/Object;
/*      */     //   2737: invokevirtual visitLdcInsn : (Ljava/lang/Object;)V
/*      */     //   2740: iinc #3, 3
/*      */     //   2743: goto -> 3127
/*      */     //   2746: aload_0
/*      */     //   2747: getfield items : [I
/*      */     //   2750: aload_0
/*      */     //   2751: iload_3
/*      */     //   2752: iconst_1
/*      */     //   2753: iadd
/*      */     //   2754: invokevirtual readUnsignedShort : (I)I
/*      */     //   2757: iaload
/*      */     //   2758: istore #31
/*      */     //   2760: aload #4
/*      */     //   2762: iload #31
/*      */     //   2764: iconst_1
/*      */     //   2765: isub
/*      */     //   2766: baload
/*      */     //   2767: bipush #11
/*      */     //   2769: if_icmpne -> 2780
/*      */     //   2772: iconst_1
/*      */     //   2773: goto -> 2781
/*      */     //   2776: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2779: athrow
/*      */     //   2780: iconst_0
/*      */     //   2781: istore #32
/*      */     //   2783: aload_0
/*      */     //   2784: iload #31
/*      */     //   2786: aload #5
/*      */     //   2788: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   2791: astore #33
/*      */     //   2793: aload_0
/*      */     //   2794: getfield items : [I
/*      */     //   2797: aload_0
/*      */     //   2798: iload #31
/*      */     //   2800: iconst_2
/*      */     //   2801: iadd
/*      */     //   2802: invokevirtual readUnsignedShort : (I)I
/*      */     //   2805: iaload
/*      */     //   2806: istore #31
/*      */     //   2808: aload_0
/*      */     //   2809: iload #31
/*      */     //   2811: aload #5
/*      */     //   2813: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   2816: astore #34
/*      */     //   2818: aload_0
/*      */     //   2819: iload #31
/*      */     //   2821: iconst_2
/*      */     //   2822: iadd
/*      */     //   2823: aload #5
/*      */     //   2825: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   2828: astore #35
/*      */     //   2830: iload #30
/*      */     //   2832: sipush #182
/*      */     //   2835: if_icmpge -> 2857
/*      */     //   2838: aload_1
/*      */     //   2839: iload #30
/*      */     //   2841: aload #33
/*      */     //   2843: aload #34
/*      */     //   2845: aload #35
/*      */     //   2847: invokevirtual visitFieldInsn : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*      */     //   2850: goto -> 2871
/*      */     //   2853: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2856: athrow
/*      */     //   2857: aload_1
/*      */     //   2858: iload #30
/*      */     //   2860: aload #33
/*      */     //   2862: aload #34
/*      */     //   2864: aload #35
/*      */     //   2866: iload #32
/*      */     //   2868: invokevirtual visitMethodInsn : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
/*      */     //   2871: iload #30
/*      */     //   2873: sipush #185
/*      */     //   2876: if_icmpne -> 2889
/*      */     //   2879: iinc #3, 5
/*      */     //   2882: goto -> 3127
/*      */     //   2885: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2888: athrow
/*      */     //   2889: iinc #3, 3
/*      */     //   2892: goto -> 3127
/*      */     //   2895: aload_0
/*      */     //   2896: getfield items : [I
/*      */     //   2899: aload_0
/*      */     //   2900: iload_3
/*      */     //   2901: iconst_1
/*      */     //   2902: iadd
/*      */     //   2903: invokevirtual readUnsignedShort : (I)I
/*      */     //   2906: iaload
/*      */     //   2907: istore #31
/*      */     //   2909: aload_2
/*      */     //   2910: getfield bootstrapMethods : [I
/*      */     //   2913: aload_0
/*      */     //   2914: iload #31
/*      */     //   2916: invokevirtual readUnsignedShort : (I)I
/*      */     //   2919: iaload
/*      */     //   2920: istore #32
/*      */     //   2922: aload_0
/*      */     //   2923: aload_0
/*      */     //   2924: iload #32
/*      */     //   2926: invokevirtual readUnsignedShort : (I)I
/*      */     //   2929: aload #5
/*      */     //   2931: invokevirtual readConst : (I[C)Ljava/lang/Object;
/*      */     //   2934: checkcast org/spongepowered/asm/lib/Handle
/*      */     //   2937: astore #33
/*      */     //   2939: aload_0
/*      */     //   2940: iload #32
/*      */     //   2942: iconst_2
/*      */     //   2943: iadd
/*      */     //   2944: invokevirtual readUnsignedShort : (I)I
/*      */     //   2947: istore #34
/*      */     //   2949: iload #34
/*      */     //   2951: anewarray java/lang/Object
/*      */     //   2954: astore #35
/*      */     //   2956: iinc #32, 4
/*      */     //   2959: iconst_0
/*      */     //   2960: istore #36
/*      */     //   2962: iload #36
/*      */     //   2964: iload #34
/*      */     //   2966: if_icmpge -> 2999
/*      */     //   2969: aload #35
/*      */     //   2971: iload #36
/*      */     //   2973: aload_0
/*      */     //   2974: aload_0
/*      */     //   2975: iload #32
/*      */     //   2977: invokevirtual readUnsignedShort : (I)I
/*      */     //   2980: aload #5
/*      */     //   2982: invokevirtual readConst : (I[C)Ljava/lang/Object;
/*      */     //   2985: aastore
/*      */     //   2986: iinc #32, 2
/*      */     //   2989: iinc #36, 1
/*      */     //   2992: goto -> 2962
/*      */     //   2995: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   2998: athrow
/*      */     //   2999: aload_0
/*      */     //   3000: getfield items : [I
/*      */     //   3003: aload_0
/*      */     //   3004: iload #31
/*      */     //   3006: iconst_2
/*      */     //   3007: iadd
/*      */     //   3008: invokevirtual readUnsignedShort : (I)I
/*      */     //   3011: iaload
/*      */     //   3012: istore #31
/*      */     //   3014: aload_0
/*      */     //   3015: iload #31
/*      */     //   3017: aload #5
/*      */     //   3019: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3022: astore #36
/*      */     //   3024: aload_0
/*      */     //   3025: iload #31
/*      */     //   3027: iconst_2
/*      */     //   3028: iadd
/*      */     //   3029: aload #5
/*      */     //   3031: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3034: astore #37
/*      */     //   3036: aload_1
/*      */     //   3037: aload #36
/*      */     //   3039: aload #37
/*      */     //   3041: aload #33
/*      */     //   3043: aload #35
/*      */     //   3045: invokevirtual visitInvokeDynamicInsn : (Ljava/lang/String;Ljava/lang/String;Lorg/spongepowered/asm/lib/Handle;[Ljava/lang/Object;)V
/*      */     //   3048: iinc #3, 5
/*      */     //   3051: goto -> 3127
/*      */     //   3054: aload_1
/*      */     //   3055: iload #30
/*      */     //   3057: aload_0
/*      */     //   3058: iload_3
/*      */     //   3059: iconst_1
/*      */     //   3060: iadd
/*      */     //   3061: aload #5
/*      */     //   3063: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   3066: invokevirtual visitTypeInsn : (ILjava/lang/String;)V
/*      */     //   3069: iinc #3, 3
/*      */     //   3072: goto -> 3127
/*      */     //   3075: aload_1
/*      */     //   3076: aload #4
/*      */     //   3078: iload_3
/*      */     //   3079: iconst_1
/*      */     //   3080: iadd
/*      */     //   3081: baload
/*      */     //   3082: sipush #255
/*      */     //   3085: iand
/*      */     //   3086: aload #4
/*      */     //   3088: iload_3
/*      */     //   3089: iconst_2
/*      */     //   3090: iadd
/*      */     //   3091: baload
/*      */     //   3092: invokevirtual visitIincInsn : (II)V
/*      */     //   3095: iinc #3, 3
/*      */     //   3098: goto -> 3127
/*      */     //   3101: aload_1
/*      */     //   3102: aload_0
/*      */     //   3103: iload_3
/*      */     //   3104: iconst_1
/*      */     //   3105: iadd
/*      */     //   3106: aload #5
/*      */     //   3108: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   3111: aload #4
/*      */     //   3113: iload_3
/*      */     //   3114: iconst_3
/*      */     //   3115: iadd
/*      */     //   3116: baload
/*      */     //   3117: sipush #255
/*      */     //   3120: iand
/*      */     //   3121: invokevirtual visitMultiANewArrayInsn : (Ljava/lang/String;I)V
/*      */     //   3124: iinc #3, 4
/*      */     //   3127: aload #12
/*      */     //   3129: ifnull -> 3276
/*      */     //   3132: iload #14
/*      */     //   3134: aload #12
/*      */     //   3136: arraylength
/*      */     //   3137: if_icmpge -> 3276
/*      */     //   3140: goto -> 3147
/*      */     //   3143: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3146: athrow
/*      */     //   3147: iload #16
/*      */     //   3149: iload #28
/*      */     //   3151: if_icmpgt -> 3276
/*      */     //   3154: goto -> 3161
/*      */     //   3157: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3160: athrow
/*      */     //   3161: iload #16
/*      */     //   3163: iload #28
/*      */     //   3165: if_icmpne -> 3220
/*      */     //   3168: goto -> 3175
/*      */     //   3171: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3174: athrow
/*      */     //   3175: aload_0
/*      */     //   3176: aload_2
/*      */     //   3177: aload #12
/*      */     //   3179: iload #14
/*      */     //   3181: iaload
/*      */     //   3182: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   3185: istore #31
/*      */     //   3187: aload_0
/*      */     //   3188: iload #31
/*      */     //   3190: iconst_2
/*      */     //   3191: iadd
/*      */     //   3192: aload #5
/*      */     //   3194: iconst_1
/*      */     //   3195: aload_1
/*      */     //   3196: aload_2
/*      */     //   3197: getfield typeRef : I
/*      */     //   3200: aload_2
/*      */     //   3201: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   3204: aload_0
/*      */     //   3205: iload #31
/*      */     //   3207: aload #5
/*      */     //   3209: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3212: iconst_1
/*      */     //   3213: invokevirtual visitInsnAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   3216: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   3219: pop
/*      */     //   3220: iinc #14, 1
/*      */     //   3223: iload #14
/*      */     //   3225: aload #12
/*      */     //   3227: arraylength
/*      */     //   3228: if_icmpge -> 3252
/*      */     //   3231: aload_0
/*      */     //   3232: aload #12
/*      */     //   3234: iload #14
/*      */     //   3236: iaload
/*      */     //   3237: invokevirtual readByte : (I)I
/*      */     //   3240: bipush #67
/*      */     //   3242: if_icmpge -> 3260
/*      */     //   3245: goto -> 3252
/*      */     //   3248: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3251: athrow
/*      */     //   3252: iconst_m1
/*      */     //   3253: goto -> 3271
/*      */     //   3256: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3259: athrow
/*      */     //   3260: aload_0
/*      */     //   3261: aload #12
/*      */     //   3263: iload #14
/*      */     //   3265: iaload
/*      */     //   3266: iconst_1
/*      */     //   3267: iadd
/*      */     //   3268: invokevirtual readUnsignedShort : (I)I
/*      */     //   3271: istore #16
/*      */     //   3273: goto -> 3127
/*      */     //   3276: aload #13
/*      */     //   3278: ifnull -> 3425
/*      */     //   3281: iload #15
/*      */     //   3283: aload #13
/*      */     //   3285: arraylength
/*      */     //   3286: if_icmpge -> 3425
/*      */     //   3289: goto -> 3296
/*      */     //   3292: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3295: athrow
/*      */     //   3296: iload #17
/*      */     //   3298: iload #28
/*      */     //   3300: if_icmpgt -> 3425
/*      */     //   3303: goto -> 3310
/*      */     //   3306: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3309: athrow
/*      */     //   3310: iload #17
/*      */     //   3312: iload #28
/*      */     //   3314: if_icmpne -> 3369
/*      */     //   3317: goto -> 3324
/*      */     //   3320: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3323: athrow
/*      */     //   3324: aload_0
/*      */     //   3325: aload_2
/*      */     //   3326: aload #13
/*      */     //   3328: iload #15
/*      */     //   3330: iaload
/*      */     //   3331: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   3334: istore #31
/*      */     //   3336: aload_0
/*      */     //   3337: iload #31
/*      */     //   3339: iconst_2
/*      */     //   3340: iadd
/*      */     //   3341: aload #5
/*      */     //   3343: iconst_1
/*      */     //   3344: aload_1
/*      */     //   3345: aload_2
/*      */     //   3346: getfield typeRef : I
/*      */     //   3349: aload_2
/*      */     //   3350: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   3353: aload_0
/*      */     //   3354: iload #31
/*      */     //   3356: aload #5
/*      */     //   3358: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3361: iconst_0
/*      */     //   3362: invokevirtual visitInsnAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   3365: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   3368: pop
/*      */     //   3369: iinc #15, 1
/*      */     //   3372: iload #15
/*      */     //   3374: aload #13
/*      */     //   3376: arraylength
/*      */     //   3377: if_icmpge -> 3401
/*      */     //   3380: aload_0
/*      */     //   3381: aload #13
/*      */     //   3383: iload #15
/*      */     //   3385: iaload
/*      */     //   3386: invokevirtual readByte : (I)I
/*      */     //   3389: bipush #67
/*      */     //   3391: if_icmpge -> 3409
/*      */     //   3394: goto -> 3401
/*      */     //   3397: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3400: athrow
/*      */     //   3401: iconst_m1
/*      */     //   3402: goto -> 3420
/*      */     //   3405: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3408: athrow
/*      */     //   3409: aload_0
/*      */     //   3410: aload #13
/*      */     //   3412: iload #15
/*      */     //   3414: iaload
/*      */     //   3415: iconst_1
/*      */     //   3416: iadd
/*      */     //   3417: invokevirtual readUnsignedShort : (I)I
/*      */     //   3420: istore #17
/*      */     //   3422: goto -> 3276
/*      */     //   3425: goto -> 1631
/*      */     //   3428: aload #11
/*      */     //   3430: iload #8
/*      */     //   3432: aaload
/*      */     //   3433: ifnull -> 3452
/*      */     //   3436: aload_1
/*      */     //   3437: aload #11
/*      */     //   3439: iload #8
/*      */     //   3441: aaload
/*      */     //   3442: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   3445: goto -> 3452
/*      */     //   3448: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3451: athrow
/*      */     //   3452: aload_2
/*      */     //   3453: getfield flags : I
/*      */     //   3456: iconst_2
/*      */     //   3457: iand
/*      */     //   3458: ifne -> 3731
/*      */     //   3461: iload #18
/*      */     //   3463: ifeq -> 3731
/*      */     //   3466: goto -> 3473
/*      */     //   3469: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3472: athrow
/*      */     //   3473: aconst_null
/*      */     //   3474: astore #28
/*      */     //   3476: iload #19
/*      */     //   3478: ifeq -> 3559
/*      */     //   3481: iload #19
/*      */     //   3483: iconst_2
/*      */     //   3484: iadd
/*      */     //   3485: istore_3
/*      */     //   3486: aload_0
/*      */     //   3487: iload #19
/*      */     //   3489: invokevirtual readUnsignedShort : (I)I
/*      */     //   3492: iconst_3
/*      */     //   3493: imul
/*      */     //   3494: newarray int
/*      */     //   3496: astore #28
/*      */     //   3498: aload #28
/*      */     //   3500: arraylength
/*      */     //   3501: istore #29
/*      */     //   3503: iload #29
/*      */     //   3505: ifle -> 3559
/*      */     //   3508: aload #28
/*      */     //   3510: iinc #29, -1
/*      */     //   3513: iload #29
/*      */     //   3515: iload_3
/*      */     //   3516: bipush #6
/*      */     //   3518: iadd
/*      */     //   3519: iastore
/*      */     //   3520: aload #28
/*      */     //   3522: iinc #29, -1
/*      */     //   3525: iload #29
/*      */     //   3527: aload_0
/*      */     //   3528: iload_3
/*      */     //   3529: bipush #8
/*      */     //   3531: iadd
/*      */     //   3532: invokevirtual readUnsignedShort : (I)I
/*      */     //   3535: iastore
/*      */     //   3536: aload #28
/*      */     //   3538: iinc #29, -1
/*      */     //   3541: iload #29
/*      */     //   3543: aload_0
/*      */     //   3544: iload_3
/*      */     //   3545: invokevirtual readUnsignedShort : (I)I
/*      */     //   3548: iastore
/*      */     //   3549: iinc #3, 10
/*      */     //   3552: goto -> 3503
/*      */     //   3555: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3558: athrow
/*      */     //   3559: iload #18
/*      */     //   3561: iconst_2
/*      */     //   3562: iadd
/*      */     //   3563: istore_3
/*      */     //   3564: aload_0
/*      */     //   3565: iload #18
/*      */     //   3567: invokevirtual readUnsignedShort : (I)I
/*      */     //   3570: istore #29
/*      */     //   3572: iload #29
/*      */     //   3574: ifle -> 3731
/*      */     //   3577: aload_0
/*      */     //   3578: iload_3
/*      */     //   3579: invokevirtual readUnsignedShort : (I)I
/*      */     //   3582: istore #30
/*      */     //   3584: aload_0
/*      */     //   3585: iload_3
/*      */     //   3586: iconst_2
/*      */     //   3587: iadd
/*      */     //   3588: invokevirtual readUnsignedShort : (I)I
/*      */     //   3591: istore #31
/*      */     //   3593: aload_0
/*      */     //   3594: iload_3
/*      */     //   3595: bipush #8
/*      */     //   3597: iadd
/*      */     //   3598: invokevirtual readUnsignedShort : (I)I
/*      */     //   3601: istore #32
/*      */     //   3603: aconst_null
/*      */     //   3604: astore #33
/*      */     //   3606: aload #28
/*      */     //   3608: ifnull -> 3682
/*      */     //   3611: iconst_0
/*      */     //   3612: istore #34
/*      */     //   3614: iload #34
/*      */     //   3616: aload #28
/*      */     //   3618: arraylength
/*      */     //   3619: if_icmpge -> 3682
/*      */     //   3622: aload #28
/*      */     //   3624: iload #34
/*      */     //   3626: iaload
/*      */     //   3627: iload #30
/*      */     //   3629: if_icmpne -> 3676
/*      */     //   3632: goto -> 3639
/*      */     //   3635: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3638: athrow
/*      */     //   3639: aload #28
/*      */     //   3641: iload #34
/*      */     //   3643: iconst_1
/*      */     //   3644: iadd
/*      */     //   3645: iaload
/*      */     //   3646: iload #32
/*      */     //   3648: if_icmpne -> 3676
/*      */     //   3651: goto -> 3658
/*      */     //   3654: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3657: athrow
/*      */     //   3658: aload_0
/*      */     //   3659: aload #28
/*      */     //   3661: iload #34
/*      */     //   3663: iconst_2
/*      */     //   3664: iadd
/*      */     //   3665: iaload
/*      */     //   3666: aload #5
/*      */     //   3668: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3671: astore #33
/*      */     //   3673: goto -> 3682
/*      */     //   3676: iinc #34, 3
/*      */     //   3679: goto -> 3614
/*      */     //   3682: aload_1
/*      */     //   3683: aload_0
/*      */     //   3684: iload_3
/*      */     //   3685: iconst_4
/*      */     //   3686: iadd
/*      */     //   3687: aload #5
/*      */     //   3689: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3692: aload_0
/*      */     //   3693: iload_3
/*      */     //   3694: bipush #6
/*      */     //   3696: iadd
/*      */     //   3697: aload #5
/*      */     //   3699: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3702: aload #33
/*      */     //   3704: aload #11
/*      */     //   3706: iload #30
/*      */     //   3708: aaload
/*      */     //   3709: aload #11
/*      */     //   3711: iload #30
/*      */     //   3713: iload #31
/*      */     //   3715: iadd
/*      */     //   3716: aaload
/*      */     //   3717: iload #32
/*      */     //   3719: invokevirtual visitLocalVariable : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/spongepowered/asm/lib/Label;Lorg/spongepowered/asm/lib/Label;I)V
/*      */     //   3722: iinc #3, 10
/*      */     //   3725: iinc #29, -1
/*      */     //   3728: goto -> 3572
/*      */     //   3731: aload #12
/*      */     //   3733: ifnull -> 3834
/*      */     //   3736: iconst_0
/*      */     //   3737: istore #28
/*      */     //   3739: iload #28
/*      */     //   3741: aload #12
/*      */     //   3743: arraylength
/*      */     //   3744: if_icmpge -> 3834
/*      */     //   3747: aload_0
/*      */     //   3748: aload #12
/*      */     //   3750: iload #28
/*      */     //   3752: iaload
/*      */     //   3753: invokevirtual readByte : (I)I
/*      */     //   3756: iconst_1
/*      */     //   3757: ishr
/*      */     //   3758: bipush #32
/*      */     //   3760: if_icmpne -> 3828
/*      */     //   3763: goto -> 3770
/*      */     //   3766: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3769: athrow
/*      */     //   3770: aload_0
/*      */     //   3771: aload_2
/*      */     //   3772: aload #12
/*      */     //   3774: iload #28
/*      */     //   3776: iaload
/*      */     //   3777: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   3780: istore #29
/*      */     //   3782: aload_0
/*      */     //   3783: iload #29
/*      */     //   3785: iconst_2
/*      */     //   3786: iadd
/*      */     //   3787: aload #5
/*      */     //   3789: iconst_1
/*      */     //   3790: aload_1
/*      */     //   3791: aload_2
/*      */     //   3792: getfield typeRef : I
/*      */     //   3795: aload_2
/*      */     //   3796: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   3799: aload_2
/*      */     //   3800: getfield start : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   3803: aload_2
/*      */     //   3804: getfield end : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   3807: aload_2
/*      */     //   3808: getfield index : [I
/*      */     //   3811: aload_0
/*      */     //   3812: iload #29
/*      */     //   3814: aload #5
/*      */     //   3816: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3819: iconst_1
/*      */     //   3820: invokevirtual visitLocalVariableAnnotation : (ILorg/spongepowered/asm/lib/TypePath;[Lorg/spongepowered/asm/lib/Label;[Lorg/spongepowered/asm/lib/Label;[ILjava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   3823: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   3826: istore #29
/*      */     //   3828: iinc #28, 1
/*      */     //   3831: goto -> 3739
/*      */     //   3834: aload #13
/*      */     //   3836: ifnull -> 3937
/*      */     //   3839: iconst_0
/*      */     //   3840: istore #28
/*      */     //   3842: iload #28
/*      */     //   3844: aload #13
/*      */     //   3846: arraylength
/*      */     //   3847: if_icmpge -> 3937
/*      */     //   3850: aload_0
/*      */     //   3851: aload #13
/*      */     //   3853: iload #28
/*      */     //   3855: iaload
/*      */     //   3856: invokevirtual readByte : (I)I
/*      */     //   3859: iconst_1
/*      */     //   3860: ishr
/*      */     //   3861: bipush #32
/*      */     //   3863: if_icmpne -> 3931
/*      */     //   3866: goto -> 3873
/*      */     //   3869: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   3872: athrow
/*      */     //   3873: aload_0
/*      */     //   3874: aload_2
/*      */     //   3875: aload #13
/*      */     //   3877: iload #28
/*      */     //   3879: iaload
/*      */     //   3880: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   3883: istore #29
/*      */     //   3885: aload_0
/*      */     //   3886: iload #29
/*      */     //   3888: iconst_2
/*      */     //   3889: iadd
/*      */     //   3890: aload #5
/*      */     //   3892: iconst_1
/*      */     //   3893: aload_1
/*      */     //   3894: aload_2
/*      */     //   3895: getfield typeRef : I
/*      */     //   3898: aload_2
/*      */     //   3899: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   3902: aload_2
/*      */     //   3903: getfield start : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   3906: aload_2
/*      */     //   3907: getfield end : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   3910: aload_2
/*      */     //   3911: getfield index : [I
/*      */     //   3914: aload_0
/*      */     //   3915: iload #29
/*      */     //   3917: aload #5
/*      */     //   3919: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   3922: iconst_0
/*      */     //   3923: invokevirtual visitLocalVariableAnnotation : (ILorg/spongepowered/asm/lib/TypePath;[Lorg/spongepowered/asm/lib/Label;[Lorg/spongepowered/asm/lib/Label;[ILjava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   3926: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   3929: istore #29
/*      */     //   3931: iinc #28, 1
/*      */     //   3934: goto -> 3842
/*      */     //   3937: aload #26
/*      */     //   3939: ifnull -> 3968
/*      */     //   3942: aload #26
/*      */     //   3944: getfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   3947: astore #28
/*      */     //   3949: aload #26
/*      */     //   3951: aconst_null
/*      */     //   3952: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   3955: aload_1
/*      */     //   3956: aload #26
/*      */     //   3958: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*      */     //   3961: aload #28
/*      */     //   3963: astore #26
/*      */     //   3965: goto -> 3937
/*      */     //   3968: aload_1
/*      */     //   3969: iload #6
/*      */     //   3971: iload #7
/*      */     //   3973: invokevirtual visitMaxs : (II)V
/*      */     //   3976: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #305	-> 0
/*      */     //   #318	-> 6
/*      */     //   #781	-> 12
/*      */     //   #259	-> 19
/*      */     //   #382	-> 28
/*      */     //   #175	-> 37
/*      */     //   #1124	-> 40
/*      */     //   #980	-> 43
/*      */     //   #488	-> 49
/*      */     //   #389	-> 63
/*      */     //   #814	-> 74
/*      */     //   #730	-> 80
/*      */     //   #174	-> 86
/*      */     //   #570	-> 96
/*      */     //   #226	-> 192
/*      */     //   #320	-> 195
/*      */     //   #1054	-> 202
/*      */     //   #132	-> 219
/*      */     //   #910	-> 222
/*      */     //   #666	-> 225
/*      */     //   #300	-> 242
/*      */     //   #334	-> 245
/*      */     //   #374	-> 248
/*      */     //   #347	-> 265
/*      */     //   #33	-> 268
/*      */     //   #803	-> 271
/*      */     //   #576	-> 283
/*      */     //   #303	-> 291
/*      */     //   #985	-> 301
/*      */     //   #1046	-> 304
/*      */     //   #495	-> 307
/*      */     //   #467	-> 316
/*      */     //   #586	-> 331
/*      */     //   #1003	-> 356
/*      */     //   #537	-> 374
/*      */     //   #280	-> 377
/*      */     //   #787	-> 387
/*      */     //   #463	-> 390
/*      */     //   #690	-> 393
/*      */     //   #12	-> 402
/*      */     //   #252	-> 417
/*      */     //   #163	-> 431
/*      */     //   #1171	-> 449
/*      */     //   #18	-> 452
/*      */     //   #1203	-> 462
/*      */     //   #818	-> 465
/*      */     //   #423	-> 468
/*      */     //   #636	-> 471
/*      */     //   #154	-> 474
/*      */     //   #665	-> 477
/*      */     //   #373	-> 480
/*      */     //   #336	-> 483
/*      */     //   #407	-> 486
/*      */     //   #86	-> 489
/*      */     //   #92	-> 492
/*      */     //   #780	-> 504
/*      */     //   #720	-> 519
/*      */     //   #594	-> 534
/*      */     //   #359	-> 550
/*      */     //   #435	-> 571
/*      */     //   #597	-> 583
/*      */     //   #453	-> 586
/*      */     //   #728	-> 592
/*      */     //   #957	-> 595
/*      */     //   #1235	-> 598
/*      */     //   #604	-> 601
/*      */     //   #113	-> 604
/*      */     //   #271	-> 607
/*      */     //   #367	-> 610
/*      */     //   #26	-> 613
/*      */     //   #119	-> 616
/*      */     //   #1120	-> 619
/*      */     //   #1272	-> 622
/*      */     //   #205	-> 643
/*      */     //   #1169	-> 646
/*      */     //   #1028	-> 649
/*      */     //   #41	-> 652
/*      */     //   #1071	-> 655
/*      */     //   #335	-> 658
/*      */     //   #427	-> 670
/*      */     //   #1290	-> 681
/*      */     //   #1033	-> 691
/*      */     //   #1149	-> 707
/*      */     //   #418	-> 713
/*      */     //   #993	-> 731
/*      */     //   #600	-> 742
/*      */     //   #615	-> 750
/*      */     //   #559	-> 774
/*      */     //   #900	-> 788
/*      */     //   #1252	-> 796
/*      */     //   #866	-> 820
/*      */     //   #19	-> 823
/*      */     //   #1043	-> 832
/*      */     //   #991	-> 842
/*      */     //   #1220	-> 851
/*      */     //   #228	-> 861
/*      */     //   #1107	-> 877
/*      */     //   #689	-> 895
/*      */     //   #575	-> 906
/*      */     //   #694	-> 914
/*      */     //   #987	-> 938
/*      */     //   #1150	-> 945
/*      */     //   #545	-> 953
/*      */     //   #892	-> 968
/*      */     //   #1166	-> 987
/*      */     //   #984	-> 997
/*      */     //   #1311	-> 1011
/*      */     //   #1175	-> 1014
/*      */     //   #227	-> 1023
/*      */     //   #429	-> 1027
/*      */     //   #860	-> 1033
/*      */     //   #413	-> 1046
/*      */     //   #251	-> 1087
/*      */     //   #894	-> 1095
/*      */     //   #470	-> 1099
/*      */     //   #1017	-> 1105
/*      */     //   #876	-> 1118
/*      */     //   #476	-> 1159
/*      */     //   #387	-> 1167
/*      */     //   #1162	-> 1177
/*      */     //   #914	-> 1193
/*      */     //   #179	-> 1199
/*      */     //   #169	-> 1208
/*      */     //   #503	-> 1221
/*      */     //   #76	-> 1231
/*      */     //   #714	-> 1247
/*      */     //   #1232	-> 1250
/*      */     //   #592	-> 1256
/*      */     //   #234	-> 1265
/*      */     //   #212	-> 1278
/*      */     //   #662	-> 1291
/*      */     //   #1136	-> 1316
/*      */     //   #507	-> 1332
/*      */     //   #616	-> 1344
/*      */     //   #106	-> 1349
/*      */     //   #225	-> 1354
/*      */     //   #618	-> 1361
/*      */     //   #183	-> 1365
/*      */     //   #161	-> 1371
/*      */     //   #1094	-> 1384
/*      */     //   #1052	-> 1390
/*      */     //   #8	-> 1393
/*      */     //   #667	-> 1398
/*      */     //   #794	-> 1401
/*      */     //   #1251	-> 1407
/*      */     //   #1184	-> 1413
/*      */     //   #1091	-> 1419
/*      */     //   #54	-> 1425
/*      */     //   #782	-> 1431
/*      */     //   #799	-> 1441
/*      */     //   #1053	-> 1451
/*      */     //   #687	-> 1456
/*      */     //   #596	-> 1468
/*      */     //   #521	-> 1484
/*      */     //   #664	-> 1501
/*      */     //   #1090	-> 1511
/*      */     //   #1295	-> 1530
/*      */     //   #4	-> 1555
/*      */     //   #685	-> 1571
/*      */     //   #426	-> 1577
/*      */     //   #73	-> 1588
/*      */     //   #1277	-> 1605
/*      */     //   #718	-> 1628
/*      */     //   #846	-> 1631
/*      */     //   #881	-> 1637
/*      */     //   #102	-> 1643
/*      */     //   #155	-> 1650
/*      */     //   #31	-> 1655
/*      */     //   #981	-> 1662
/*      */     //   #443	-> 1668
/*      */     //   #442	-> 1674
/*      */     //   #629	-> 1698
/*      */     //   #681	-> 1716
/*      */     //   #158	-> 1721
/*      */     //   #29	-> 1732
/*      */     //   #717	-> 1742
/*      */     //   #1253	-> 1780
/*      */     //   #45	-> 1796
/*      */     //   #110	-> 1820
/*      */     //   #400	-> 1852
/*      */     //   #626	-> 1881
/*      */     //   #679	-> 1886
/*      */     //   #1173	-> 1900
/*      */     //   #66	-> 1906
/*      */     //   #1143	-> 1912
/*      */     //   #485	-> 1922
/*      */     //   #1068	-> 2020
/*      */     //   #1287	-> 2026
/*      */     //   #811	-> 2029
/*      */     //   #755	-> 2036
/*      */     //   #554	-> 2043
/*      */     //   #601	-> 2046
/*      */     //   #1231	-> 2068
/*      */     //   #1204	-> 2071
/*      */     //   #1185	-> 2086
/*      */     //   #181	-> 2089
/*      */     //   #608	-> 2092
/*      */     //   #203	-> 2111
/*      */     //   #62	-> 2114
/*      */     //   #973	-> 2117
/*      */     //   #135	-> 2131
/*      */     //   #1190	-> 2136
/*      */     //   #841	-> 2139
/*      */     //   #698	-> 2142
/*      */     //   #490	-> 2145
/*      */     //   #617	-> 2172
/*      */     //   #862	-> 2187
/*      */     //   #1041	-> 2210
/*      */     //   #798	-> 2228
/*      */     //   #355	-> 2257
/*      */     //   #1122	-> 2266
/*      */     //   #571	-> 2274
/*      */     //   #253	-> 2283
/*      */     //   #309	-> 2289
/*      */     //   #937	-> 2325
/*      */     //   #1070	-> 2343
/*      */     //   #719	-> 2346
/*      */     //   #1217	-> 2349
/*      */     //   #71	-> 2361
/*      */     //   #885	-> 2369
/*      */     //   #932	-> 2387
/*      */     //   #433	-> 2397
/*      */     //   #1164	-> 2410
/*      */     //   #737	-> 2413
/*      */     //   #369	-> 2416
/*      */     //   #912	-> 2425
/*      */     //   #501	-> 2435
/*      */     //   #494	-> 2444
/*      */     //   #520	-> 2454
/*      */     //   #1060	-> 2466
/*      */     //   #769	-> 2469
/*      */     //   #673	-> 2480
/*      */     //   #847	-> 2496
/*      */     //   #339	-> 2499
/*      */     //   #603	-> 2509
/*      */     //   #211	-> 2524
/*      */     //   #425	-> 2527
/*      */     //   #746	-> 2536
/*      */     //   #654	-> 2546
/*      */     //   #402	-> 2555
/*      */     //   #1135	-> 2561
/*      */     //   #2	-> 2568
/*      */     //   #40	-> 2571
/*      */     //   #231	-> 2581
/*      */     //   #992	-> 2591
/*      */     //   #542	-> 2609
/*      */     //   #578	-> 2612
/*      */     //   #526	-> 2622
/*      */     //   #588	-> 2635
/*      */     //   #711	-> 2638
/*      */     //   #403	-> 2654
/*      */     //   #642	-> 2657
/*      */     //   #264	-> 2660
/*      */     //   #1276	-> 2672
/*      */     //   #553	-> 2675
/*      */     //   #1284	-> 2678
/*      */     //   #428	-> 2691
/*      */     //   #126	-> 2694
/*      */     //   #649	-> 2697
/*      */     //   #140	-> 2717
/*      */     //   #493	-> 2720
/*      */     //   #1133	-> 2723
/*      */     //   #751	-> 2740
/*      */     //   #75	-> 2743
/*      */     //   #223	-> 2746
/*      */     //   #938	-> 2760
/*      */     //   #279	-> 2783
/*      */     //   #177	-> 2793
/*      */     //   #1286	-> 2808
/*      */     //   #81	-> 2818
/*      */     //   #565	-> 2830
/*      */     //   #388	-> 2838
/*      */     //   #801	-> 2857
/*      */     //   #1114	-> 2871
/*      */     //   #613	-> 2879
/*      */     //   #557	-> 2889
/*      */     //   #1224	-> 2892
/*      */     //   #1266	-> 2895
/*      */     //   #13	-> 2909
/*      */     //   #810	-> 2922
/*      */     //   #464	-> 2939
/*      */     //   #173	-> 2949
/*      */     //   #593	-> 2956
/*      */     //   #420	-> 2959
/*      */     //   #1269	-> 2969
/*      */     //   #1216	-> 2986
/*      */     //   #943	-> 2989
/*      */     //   #1081	-> 2999
/*      */     //   #1288	-> 3014
/*      */     //   #949	-> 3024
/*      */     //   #108	-> 3036
/*      */     //   #256	-> 3048
/*      */     //   #1118	-> 3051
/*      */     //   #241	-> 3054
/*      */     //   #7	-> 3069
/*      */     //   #619	-> 3072
/*      */     //   #863	-> 3075
/*      */     //   #872	-> 3095
/*      */     //   #845	-> 3098
/*      */     //   #928	-> 3101
/*      */     //   #1144	-> 3124
/*      */     //   #137	-> 3127
/*      */     //   #1300	-> 3161
/*      */     //   #1128	-> 3175
/*      */     //   #311	-> 3187
/*      */     //   #1026	-> 3209
/*      */     //   #963	-> 3213
/*      */     //   #254	-> 3216
/*      */     //   #927	-> 3220
/*      */     //   #1111	-> 3268
/*      */     //   #1309	-> 3276
/*      */     //   #350	-> 3310
/*      */     //   #408	-> 3324
/*      */     //   #634	-> 3336
/*      */     //   #16	-> 3358
/*      */     //   #1029	-> 3362
/*      */     //   #549	-> 3365
/*      */     //   #691	-> 3369
/*      */     //   #1211	-> 3386
/*      */     //   #753	-> 3417
/*      */     //   #399	-> 3425
/*      */     //   #1260	-> 3428
/*      */     //   #99	-> 3436
/*      */     //   #215	-> 3452
/*      */     //   #328	-> 3473
/*      */     //   #72	-> 3476
/*      */     //   #1006	-> 3481
/*      */     //   #999	-> 3486
/*      */     //   #1056	-> 3498
/*      */     //   #1152	-> 3508
/*      */     //   #573	-> 3520
/*      */     //   #771	-> 3536
/*      */     //   #1083	-> 3549
/*      */     //   #383	-> 3559
/*      */     //   #919	-> 3564
/*      */     //   #294	-> 3577
/*      */     //   #697	-> 3584
/*      */     //   #1080	-> 3593
/*      */     //   #895	-> 3603
/*      */     //   #884	-> 3606
/*      */     //   #144	-> 3611
/*      */     //   #1161	-> 3622
/*      */     //   #188	-> 3658
/*      */     //   #831	-> 3673
/*      */     //   #733	-> 3676
/*      */     //   #584	-> 3682
/*      */     //   #716	-> 3722
/*      */     //   #964	-> 3725
/*      */     //   #574	-> 3731
/*      */     //   #1061	-> 3736
/*      */     //   #890	-> 3747
/*      */     //   #446	-> 3770
/*      */     //   #151	-> 3782
/*      */     //   #1022	-> 3816
/*      */     //   #214	-> 3820
/*      */     //   #68	-> 3823
/*      */     //   #397	-> 3828
/*      */     //   #232	-> 3834
/*      */     //   #1093	-> 3839
/*      */     //   #209	-> 3850
/*      */     //   #437	-> 3873
/*      */     //   #274	-> 3885
/*      */     //   #233	-> 3919
/*      */     //   #908	-> 3923
/*      */     //   #763	-> 3926
/*      */     //   #1129	-> 3931
/*      */     //   #1155	-> 3937
/*      */     //   #668	-> 3942
/*      */     //   #301	-> 3949
/*      */     //   #871	-> 3955
/*      */     //   #404	-> 3961
/*      */     //   #785	-> 3965
/*      */     //   #1012	-> 3968
/*      */     //   #1016	-> 3976
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   96	198	198	java/lang/IllegalArgumentException
/*      */     //   283	297	297	java/lang/IllegalArgumentException
/*      */     //   351	383	383	java/lang/IllegalArgumentException
/*      */     //   426	458	458	java/lang/IllegalArgumentException
/*      */     //   622	636	636	java/lang/IllegalArgumentException
/*      */     //   681	700	703	java/lang/IllegalArgumentException
/*      */     //   742	767	770	java/lang/IllegalArgumentException
/*      */     //   788	813	816	java/lang/IllegalArgumentException
/*      */     //   851	870	873	java/lang/IllegalArgumentException
/*      */     //   906	931	934	java/lang/IllegalArgumentException
/*      */     //   945	961	964	java/lang/IllegalArgumentException
/*      */     //   953	980	983	java/lang/IllegalArgumentException
/*      */     //   1046	1065	1068	java/lang/IllegalArgumentException
/*      */     //   1052	1076	1076	java/lang/IllegalArgumentException
/*      */     //   1118	1137	1140	java/lang/IllegalArgumentException
/*      */     //   1124	1148	1148	java/lang/IllegalArgumentException
/*      */     //   1167	1186	1189	java/lang/IllegalArgumentException
/*      */     //   1221	1240	1243	java/lang/IllegalArgumentException
/*      */     //   1281	1309	1312	java/lang/IllegalArgumentException
/*      */     //   1401	1461	1464	java/lang/IllegalArgumentException
/*      */     //   1472	1494	1497	java/lang/IllegalArgumentException
/*      */     //   1511	1523	1526	java/lang/IllegalArgumentException
/*      */     //   1516	1548	1551	java/lang/IllegalArgumentException
/*      */     //   1530	1564	1567	java/lang/IllegalArgumentException
/*      */     //   1577	1598	1601	java/lang/IllegalArgumentException
/*      */     //   1605	1621	1621	java/lang/IllegalArgumentException
/*      */     //   1662	1691	1694	java/lang/IllegalArgumentException
/*      */     //   1683	1709	1712	java/lang/IllegalArgumentException
/*      */     //   1742	1757	1760	java/lang/IllegalArgumentException
/*      */     //   1747	1773	1776	java/lang/IllegalArgumentException
/*      */     //   1764	1789	1792	java/lang/IllegalArgumentException
/*      */     //   1780	1801	1804	java/lang/IllegalArgumentException
/*      */     //   1796	1813	1816	java/lang/IllegalArgumentException
/*      */     //   1808	1848	1848	java/lang/IllegalArgumentException
/*      */     //   1922	2032	2032	java/lang/IllegalArgumentException
/*      */     //   2036	2064	2064	java/lang/IllegalArgumentException
/*      */     //   2145	2161	2161	java/lang/IllegalArgumentException
/*      */     //   2187	2203	2206	java/lang/IllegalArgumentException
/*      */     //   2195	2224	2224	java/lang/IllegalArgumentException
/*      */     //   2228	2247	2247	java/lang/IllegalArgumentException
/*      */     //   2266	2299	2302	java/lang/IllegalArgumentException
/*      */     //   2294	2318	2321	java/lang/IllegalArgumentException
/*      */     //   2306	2336	2339	java/lang/IllegalArgumentException
/*      */     //   2361	2393	2393	java/lang/IllegalArgumentException
/*      */     //   2472	2505	2505	java/lang/IllegalArgumentException
/*      */     //   2574	2618	2618	java/lang/IllegalArgumentException
/*      */     //   2760	2776	2776	java/lang/IllegalArgumentException
/*      */     //   2830	2853	2853	java/lang/IllegalArgumentException
/*      */     //   2871	2885	2885	java/lang/IllegalArgumentException
/*      */     //   2962	2995	2995	java/lang/IllegalArgumentException
/*      */     //   3127	3140	3143	java/lang/IllegalArgumentException
/*      */     //   3132	3154	3157	java/lang/IllegalArgumentException
/*      */     //   3147	3168	3171	java/lang/IllegalArgumentException
/*      */     //   3220	3245	3248	java/lang/IllegalArgumentException
/*      */     //   3231	3256	3256	java/lang/IllegalArgumentException
/*      */     //   3276	3289	3292	java/lang/IllegalArgumentException
/*      */     //   3281	3303	3306	java/lang/IllegalArgumentException
/*      */     //   3296	3317	3320	java/lang/IllegalArgumentException
/*      */     //   3369	3394	3397	java/lang/IllegalArgumentException
/*      */     //   3380	3405	3405	java/lang/IllegalArgumentException
/*      */     //   3428	3445	3448	java/lang/IllegalArgumentException
/*      */     //   3452	3466	3469	java/lang/IllegalArgumentException
/*      */     //   3503	3555	3555	java/lang/IllegalArgumentException
/*      */     //   3614	3632	3635	java/lang/IllegalArgumentException
/*      */     //   3622	3651	3654	java/lang/IllegalArgumentException
/*      */     //   3739	3763	3766	java/lang/IllegalArgumentException
/*      */     //   3842	3866	3869	java/lang/IllegalArgumentException }
/*      */   private void copyBootstrapMethods(ClassWriter paramClassWriter, Item[] paramArrayOfItem, char[] paramArrayOfchar) { int i = getAttributes(); boolean bool = false; int j; for (j = readUnsignedShort(i); j > 0; ) { String str = readUTF8(i + 2, paramArrayOfchar); if ("BootstrapMethods".equals(str)) { bool = true; break; }  }  try { if (!bool) return;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  j = readUnsignedShort(i + 8); int k, m; for (k = 0, m = i + 10; k < j; i1 = readConst(readUnsignedShort(m), paramArrayOfchar).hashCode(), i2 = readUnsignedShort(m + 2)) int i1, i2, n = m - i - 10;  k = readInt(i + 4); ByteVector byteVector = new ByteVector(k + 62); byteVector.putByteArray(this.b, i + 10, k - 2); paramClassWriter.bootstrapMethodsCount = j; paramClassWriter.bootstrapMethods = byteVector; }
/*      */   private String readUTF(int paramInt1, int paramInt2, char[] paramArrayOfchar) { int i = paramInt1 + paramInt2; byte[] arrayOfByte = this.b; byte b1 = 0; byte b2 = 0; char c = Character.MIN_VALUE; while (paramInt1 < i) { int j; byte b = arrayOfByte[paramInt1++]; switch (b2) { case false: j = b & 0xFF; try { if (j < 128) { paramArrayOfchar[b1++] = (char)j; continue; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (j < 224 && j > 191) { c = (char)(j & 0x1F); b2 = 1; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  c = (char)(j & 0xF); b2 = 2;case true: paramArrayOfchar[b1++] = (char)(c << 6 | j & 0x3F); b2 = 0;case true: c = (char)(c << 6 | j & 0x3F); b2 = 1; }  }  return new String(paramArrayOfchar, 0, b1); }
/*      */   private int readField(ClassVisitor paramClassVisitor, Context paramContext, int paramInt) { // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: getfield buffer : [C
/*      */     //   4: astore #4
/*      */     //   6: aload_0
/*      */     //   7: iload_3
/*      */     //   8: invokevirtual readUnsignedShort : (I)I
/*      */     //   11: istore #5
/*      */     //   13: aload_0
/*      */     //   14: iload_3
/*      */     //   15: iconst_2
/*      */     //   16: iadd
/*      */     //   17: aload #4
/*      */     //   19: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   22: astore #6
/*      */     //   24: aload_0
/*      */     //   25: iload_3
/*      */     //   26: iconst_4
/*      */     //   27: iadd
/*      */     //   28: aload #4
/*      */     //   30: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   33: astore #7
/*      */     //   35: iinc #3, 6
/*      */     //   38: aconst_null
/*      */     //   39: astore #8
/*      */     //   41: iconst_0
/*      */     //   42: istore #9
/*      */     //   44: iconst_0
/*      */     //   45: istore #10
/*      */     //   47: iconst_0
/*      */     //   48: istore #11
/*      */     //   50: iconst_0
/*      */     //   51: istore #12
/*      */     //   53: aconst_null
/*      */     //   54: astore #13
/*      */     //   56: aconst_null
/*      */     //   57: astore #14
/*      */     //   59: aload_0
/*      */     //   60: iload_3
/*      */     //   61: invokevirtual readUnsignedShort : (I)I
/*      */     //   64: istore #15
/*      */     //   66: iload #15
/*      */     //   68: ifle -> 331
/*      */     //   71: aload_0
/*      */     //   72: iload_3
/*      */     //   73: iconst_2
/*      */     //   74: iadd
/*      */     //   75: aload #4
/*      */     //   77: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   80: astore #16
/*      */     //   82: ldc 'ConstantValue'
/*      */     //   84: aload #16
/*      */     //   86: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   89: ifeq -> 128
/*      */     //   92: aload_0
/*      */     //   93: iload_3
/*      */     //   94: bipush #8
/*      */     //   96: iadd
/*      */     //   97: invokevirtual readUnsignedShort : (I)I
/*      */     //   100: istore #17
/*      */     //   102: iload #17
/*      */     //   104: ifne -> 115
/*      */     //   107: aconst_null
/*      */     //   108: goto -> 123
/*      */     //   111: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   114: athrow
/*      */     //   115: aload_0
/*      */     //   116: iload #17
/*      */     //   118: aload #4
/*      */     //   120: invokevirtual readConst : (I[C)Ljava/lang/Object;
/*      */     //   123: astore #13
/*      */     //   125: goto -> 312
/*      */     //   128: ldc 'Signature'
/*      */     //   130: aload #16
/*      */     //   132: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   135: ifeq -> 153
/*      */     //   138: aload_0
/*      */     //   139: iload_3
/*      */     //   140: bipush #8
/*      */     //   142: iadd
/*      */     //   143: aload #4
/*      */     //   145: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   148: astore #8
/*      */     //   150: goto -> 312
/*      */     //   153: ldc 'Deprecated'
/*      */     //   155: aload #16
/*      */     //   157: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   160: ifeq -> 173
/*      */     //   163: iload #5
/*      */     //   165: ldc 131072
/*      */     //   167: ior
/*      */     //   168: istore #5
/*      */     //   170: goto -> 312
/*      */     //   173: ldc 'Synthetic'
/*      */     //   175: aload #16
/*      */     //   177: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   180: ifeq -> 193
/*      */     //   183: iload #5
/*      */     //   185: ldc 266240
/*      */     //   187: ior
/*      */     //   188: istore #5
/*      */     //   190: goto -> 312
/*      */     //   193: ldc 'RuntimeVisibleAnnotations'
/*      */     //   195: aload #16
/*      */     //   197: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   200: ifeq -> 212
/*      */     //   203: iload_3
/*      */     //   204: bipush #8
/*      */     //   206: iadd
/*      */     //   207: istore #9
/*      */     //   209: goto -> 312
/*      */     //   212: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   214: aload #16
/*      */     //   216: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   219: ifeq -> 231
/*      */     //   222: iload_3
/*      */     //   223: bipush #8
/*      */     //   225: iadd
/*      */     //   226: istore #11
/*      */     //   228: goto -> 312
/*      */     //   231: ldc 'RuntimeInvisibleAnnotations'
/*      */     //   233: aload #16
/*      */     //   235: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   238: ifeq -> 250
/*      */     //   241: iload_3
/*      */     //   242: bipush #8
/*      */     //   244: iadd
/*      */     //   245: istore #10
/*      */     //   247: goto -> 312
/*      */     //   250: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   252: aload #16
/*      */     //   254: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   257: ifeq -> 269
/*      */     //   260: iload_3
/*      */     //   261: bipush #8
/*      */     //   263: iadd
/*      */     //   264: istore #12
/*      */     //   266: goto -> 312
/*      */     //   269: aload_0
/*      */     //   270: aload_2
/*      */     //   271: getfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   274: aload #16
/*      */     //   276: iload_3
/*      */     //   277: bipush #8
/*      */     //   279: iadd
/*      */     //   280: aload_0
/*      */     //   281: iload_3
/*      */     //   282: iconst_4
/*      */     //   283: iadd
/*      */     //   284: invokevirtual readInt : (I)I
/*      */     //   287: aload #4
/*      */     //   289: iconst_m1
/*      */     //   290: aconst_null
/*      */     //   291: invokespecial readAttribute : ([Lorg/spongepowered/asm/lib/Attribute;Ljava/lang/String;II[CI[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   294: astore #17
/*      */     //   296: aload #17
/*      */     //   298: ifnull -> 312
/*      */     //   301: aload #17
/*      */     //   303: aload #14
/*      */     //   305: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   308: aload #17
/*      */     //   310: astore #14
/*      */     //   312: iload_3
/*      */     //   313: bipush #6
/*      */     //   315: aload_0
/*      */     //   316: iload_3
/*      */     //   317: iconst_4
/*      */     //   318: iadd
/*      */     //   319: invokevirtual readInt : (I)I
/*      */     //   322: iadd
/*      */     //   323: iadd
/*      */     //   324: istore_3
/*      */     //   325: iinc #15, -1
/*      */     //   328: goto -> 66
/*      */     //   331: iinc #3, 2
/*      */     //   334: aload_1
/*      */     //   335: iload #5
/*      */     //   337: aload #6
/*      */     //   339: aload #7
/*      */     //   341: aload #8
/*      */     //   343: aload #13
/*      */     //   345: invokevirtual visitField : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/lib/FieldVisitor;
/*      */     //   348: astore #15
/*      */     //   350: aload #15
/*      */     //   352: ifnonnull -> 361
/*      */     //   355: iload_3
/*      */     //   356: ireturn
/*      */     //   357: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   360: athrow
/*      */     //   361: iload #9
/*      */     //   363: ifeq -> 418
/*      */     //   366: aload_0
/*      */     //   367: iload #9
/*      */     //   369: invokevirtual readUnsignedShort : (I)I
/*      */     //   372: istore #16
/*      */     //   374: iload #9
/*      */     //   376: iconst_2
/*      */     //   377: iadd
/*      */     //   378: istore #17
/*      */     //   380: iload #16
/*      */     //   382: ifle -> 418
/*      */     //   385: aload_0
/*      */     //   386: iload #17
/*      */     //   388: iconst_2
/*      */     //   389: iadd
/*      */     //   390: aload #4
/*      */     //   392: iconst_1
/*      */     //   393: aload #15
/*      */     //   395: aload_0
/*      */     //   396: iload #17
/*      */     //   398: aload #4
/*      */     //   400: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   403: iconst_1
/*      */     //   404: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   407: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   410: istore #17
/*      */     //   412: iinc #16, -1
/*      */     //   415: goto -> 380
/*      */     //   418: iload #10
/*      */     //   420: ifeq -> 475
/*      */     //   423: aload_0
/*      */     //   424: iload #10
/*      */     //   426: invokevirtual readUnsignedShort : (I)I
/*      */     //   429: istore #16
/*      */     //   431: iload #10
/*      */     //   433: iconst_2
/*      */     //   434: iadd
/*      */     //   435: istore #17
/*      */     //   437: iload #16
/*      */     //   439: ifle -> 475
/*      */     //   442: aload_0
/*      */     //   443: iload #17
/*      */     //   445: iconst_2
/*      */     //   446: iadd
/*      */     //   447: aload #4
/*      */     //   449: iconst_1
/*      */     //   450: aload #15
/*      */     //   452: aload_0
/*      */     //   453: iload #17
/*      */     //   455: aload #4
/*      */     //   457: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   460: iconst_0
/*      */     //   461: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   464: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   467: istore #17
/*      */     //   469: iinc #16, -1
/*      */     //   472: goto -> 437
/*      */     //   475: iload #11
/*      */     //   477: ifeq -> 549
/*      */     //   480: aload_0
/*      */     //   481: iload #11
/*      */     //   483: invokevirtual readUnsignedShort : (I)I
/*      */     //   486: istore #16
/*      */     //   488: iload #11
/*      */     //   490: iconst_2
/*      */     //   491: iadd
/*      */     //   492: istore #17
/*      */     //   494: iload #16
/*      */     //   496: ifle -> 549
/*      */     //   499: aload_0
/*      */     //   500: aload_2
/*      */     //   501: iload #17
/*      */     //   503: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   506: istore #17
/*      */     //   508: aload_0
/*      */     //   509: iload #17
/*      */     //   511: iconst_2
/*      */     //   512: iadd
/*      */     //   513: aload #4
/*      */     //   515: iconst_1
/*      */     //   516: aload #15
/*      */     //   518: aload_2
/*      */     //   519: getfield typeRef : I
/*      */     //   522: aload_2
/*      */     //   523: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   526: aload_0
/*      */     //   527: iload #17
/*      */     //   529: aload #4
/*      */     //   531: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   534: iconst_1
/*      */     //   535: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   538: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   541: istore #17
/*      */     //   543: iinc #16, -1
/*      */     //   546: goto -> 494
/*      */     //   549: iload #12
/*      */     //   551: ifeq -> 623
/*      */     //   554: aload_0
/*      */     //   555: iload #12
/*      */     //   557: invokevirtual readUnsignedShort : (I)I
/*      */     //   560: istore #16
/*      */     //   562: iload #12
/*      */     //   564: iconst_2
/*      */     //   565: iadd
/*      */     //   566: istore #17
/*      */     //   568: iload #16
/*      */     //   570: ifle -> 623
/*      */     //   573: aload_0
/*      */     //   574: aload_2
/*      */     //   575: iload #17
/*      */     //   577: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   580: istore #17
/*      */     //   582: aload_0
/*      */     //   583: iload #17
/*      */     //   585: iconst_2
/*      */     //   586: iadd
/*      */     //   587: aload #4
/*      */     //   589: iconst_1
/*      */     //   590: aload #15
/*      */     //   592: aload_2
/*      */     //   593: getfield typeRef : I
/*      */     //   596: aload_2
/*      */     //   597: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   600: aload_0
/*      */     //   601: iload #17
/*      */     //   603: aload #4
/*      */     //   605: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   608: iconst_0
/*      */     //   609: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   612: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   615: istore #17
/*      */     //   617: iinc #16, -1
/*      */     //   620: goto -> 568
/*      */     //   623: aload #14
/*      */     //   625: ifnull -> 655
/*      */     //   628: aload #14
/*      */     //   630: getfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   633: astore #16
/*      */     //   635: aload #14
/*      */     //   637: aconst_null
/*      */     //   638: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   641: aload #15
/*      */     //   643: aload #14
/*      */     //   645: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*      */     //   648: aload #16
/*      */     //   650: astore #14
/*      */     //   652: goto -> 623
/*      */     //   655: aload #15
/*      */     //   657: invokevirtual visitEnd : ()V
/*      */     //   660: iload_3
/*      */     //   661: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #409	-> 0
/*      */     //   #917	-> 6
/*      */     //   #497	-> 13
/*      */     //   #330	-> 24
/*      */     //   #156	-> 35
/*      */     //   #1191	-> 38
/*      */     //   #1072	-> 41
/*      */     //   #313	-> 44
/*      */     //   #153	-> 47
/*      */     //   #1183	-> 50
/*      */     //   #377	-> 53
/*      */     //   #207	-> 56
/*      */     //   #656	-> 59
/*      */     //   #1087	-> 71
/*      */     //   #96	-> 82
/*      */     //   #1141	-> 92
/*      */     //   #363	-> 102
/*      */     //   #193	-> 125
/*      */     //   #1049	-> 138
/*      */     //   #269	-> 153
/*      */     //   #918	-> 163
/*      */     //   #1063	-> 173
/*      */     //   #43	-> 183
/*      */     //   #776	-> 193
/*      */     //   #527	-> 197
/*      */     //   #983	-> 203
/*      */     //   #610	-> 212
/*      */     //   #827	-> 216
/*      */     //   #220	-> 222
/*      */     //   #196	-> 231
/*      */     //   #1009	-> 235
/*      */     //   #647	-> 241
/*      */     //   #738	-> 250
/*      */     //   #146	-> 254
/*      */     //   #85	-> 260
/*      */     //   #200	-> 269
/*      */     //   #17	-> 284
/*      */     //   #754	-> 291
/*      */     //   #1047	-> 296
/*      */     //   #11	-> 301
/*      */     //   #896	-> 308
/*      */     //   #826	-> 312
/*      */     //   #1045	-> 325
/*      */     //   #670	-> 331
/*      */     //   #1008	-> 334
/*      */     //   #120	-> 350
/*      */     //   #381	-> 355
/*      */     //   #298	-> 361
/*      */     //   #166	-> 366
/*      */     //   #297	-> 385
/*      */     //   #187	-> 400
/*      */     //   #32	-> 407
/*      */     //   #1021	-> 412
/*      */     //   #376	-> 418
/*      */     //   #1242	-> 423
/*      */     //   #955	-> 442
/*      */     //   #35	-> 457
/*      */     //   #795	-> 464
/*      */     //   #997	-> 469
/*      */     //   #142	-> 475
/*      */     //   #20	-> 480
/*      */     //   #1270	-> 499
/*      */     //   #560	-> 508
/*      */     //   #555	-> 531
/*      */     //   #828	-> 535
/*      */     //   #969	-> 538
/*      */     //   #936	-> 543
/*      */     //   #1187	-> 549
/*      */     //   #1117	-> 554
/*      */     //   #637	-> 573
/*      */     //   #1186	-> 582
/*      */     //   #887	-> 605
/*      */     //   #450	-> 609
/*      */     //   #1096	-> 612
/*      */     //   #587	-> 617
/*      */     //   #199	-> 623
/*      */     //   #1115	-> 628
/*      */     //   #95	-> 635
/*      */     //   #1310	-> 641
/*      */     //   #1020	-> 648
/*      */     //   #489	-> 652
/*      */     //   #356	-> 655
/*      */     //   #789	-> 660
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   102	111	111	java/lang/IllegalArgumentException
/*      */     //   350	357	357	java/lang/IllegalArgumentException } public int readInt(int paramInt) { byte[] arrayOfByte = this.b; return (arrayOfByte[paramInt] & 0xFF) << 24 | (arrayOfByte[paramInt + 1] & 0xFF) << 16 | (arrayOfByte[paramInt + 2] & 0xFF) << 8 | arrayOfByte[paramInt + 3] & 0xFF; } public String readClass(int paramInt, char[] paramArrayOfchar) { return readUTF8(this.items[readUnsignedShort(paramInt)], paramArrayOfchar); } public String readUTF8(int paramInt, char[] paramArrayOfchar) { int i = readUnsignedShort(paramInt); try { if (paramInt != 0) try { if (i != 0) { String str = this.strings[i]; try { if (str != null) return str;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramInt = this.items[i]; this.strings[i] = readUTF(paramInt + 2, readUnsignedShort(paramInt), paramArrayOfchar); return readUTF(paramInt + 2, readUnsignedShort(paramInt), paramArrayOfchar); }  return null; } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return null; } private int readFrame(int paramInt, boolean paramBoolean1, boolean paramBoolean2, Context paramContext) { // Byte code:
/*      */     //   0: aload #4
/*      */     //   2: getfield buffer : [C
/*      */     //   5: astore #5
/*      */     //   7: aload #4
/*      */     //   9: getfield labels : [Lorg/spongepowered/asm/lib/Label;
/*      */     //   12: astore #6
/*      */     //   14: iload_2
/*      */     //   15: ifeq -> 36
/*      */     //   18: aload_0
/*      */     //   19: getfield b : [B
/*      */     //   22: iload_1
/*      */     //   23: iinc #1, 1
/*      */     //   26: baload
/*      */     //   27: sipush #255
/*      */     //   30: iand
/*      */     //   31: istore #7
/*      */     //   33: goto -> 47
/*      */     //   36: sipush #255
/*      */     //   39: istore #7
/*      */     //   41: aload #4
/*      */     //   43: iconst_m1
/*      */     //   44: putfield offset : I
/*      */     //   47: aload #4
/*      */     //   49: iconst_0
/*      */     //   50: putfield localDiff : I
/*      */     //   53: iload #7
/*      */     //   55: bipush #64
/*      */     //   57: if_icmpge -> 79
/*      */     //   60: iload #7
/*      */     //   62: istore #8
/*      */     //   64: aload #4
/*      */     //   66: iconst_3
/*      */     //   67: putfield mode : I
/*      */     //   70: aload #4
/*      */     //   72: iconst_0
/*      */     //   73: putfield stackCount : I
/*      */     //   76: goto -> 498
/*      */     //   79: iload #7
/*      */     //   81: sipush #128
/*      */     //   84: if_icmpge -> 125
/*      */     //   87: iload #7
/*      */     //   89: bipush #64
/*      */     //   91: isub
/*      */     //   92: istore #8
/*      */     //   94: aload_0
/*      */     //   95: aload #4
/*      */     //   97: getfield stack : [Ljava/lang/Object;
/*      */     //   100: iconst_0
/*      */     //   101: iload_1
/*      */     //   102: aload #5
/*      */     //   104: aload #6
/*      */     //   106: invokespecial readFrameType : ([Ljava/lang/Object;II[C[Lorg/spongepowered/asm/lib/Label;)I
/*      */     //   109: istore_1
/*      */     //   110: aload #4
/*      */     //   112: iconst_4
/*      */     //   113: putfield mode : I
/*      */     //   116: aload #4
/*      */     //   118: iconst_1
/*      */     //   119: putfield stackCount : I
/*      */     //   122: goto -> 498
/*      */     //   125: aload_0
/*      */     //   126: iload_1
/*      */     //   127: invokevirtual readUnsignedShort : (I)I
/*      */     //   130: istore #8
/*      */     //   132: iinc #1, 2
/*      */     //   135: iload #7
/*      */     //   137: sipush #247
/*      */     //   140: if_icmpne -> 174
/*      */     //   143: aload_0
/*      */     //   144: aload #4
/*      */     //   146: getfield stack : [Ljava/lang/Object;
/*      */     //   149: iconst_0
/*      */     //   150: iload_1
/*      */     //   151: aload #5
/*      */     //   153: aload #6
/*      */     //   155: invokespecial readFrameType : ([Ljava/lang/Object;II[C[Lorg/spongepowered/asm/lib/Label;)I
/*      */     //   158: istore_1
/*      */     //   159: aload #4
/*      */     //   161: iconst_4
/*      */     //   162: putfield mode : I
/*      */     //   165: aload #4
/*      */     //   167: iconst_1
/*      */     //   168: putfield stackCount : I
/*      */     //   171: goto -> 498
/*      */     //   174: iload #7
/*      */     //   176: sipush #248
/*      */     //   179: if_icmplt -> 242
/*      */     //   182: iload #7
/*      */     //   184: sipush #251
/*      */     //   187: if_icmpge -> 242
/*      */     //   190: goto -> 197
/*      */     //   193: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   196: athrow
/*      */     //   197: aload #4
/*      */     //   199: iconst_2
/*      */     //   200: putfield mode : I
/*      */     //   203: aload #4
/*      */     //   205: sipush #251
/*      */     //   208: iload #7
/*      */     //   210: isub
/*      */     //   211: putfield localDiff : I
/*      */     //   214: aload #4
/*      */     //   216: dup
/*      */     //   217: getfield localCount : I
/*      */     //   220: aload #4
/*      */     //   222: getfield localDiff : I
/*      */     //   225: isub
/*      */     //   226: putfield localCount : I
/*      */     //   229: aload #4
/*      */     //   231: iconst_0
/*      */     //   232: putfield stackCount : I
/*      */     //   235: goto -> 498
/*      */     //   238: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   241: athrow
/*      */     //   242: iload #7
/*      */     //   244: sipush #251
/*      */     //   247: if_icmpne -> 269
/*      */     //   250: aload #4
/*      */     //   252: iconst_3
/*      */     //   253: putfield mode : I
/*      */     //   256: aload #4
/*      */     //   258: iconst_0
/*      */     //   259: putfield stackCount : I
/*      */     //   262: goto -> 498
/*      */     //   265: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   268: athrow
/*      */     //   269: iload #7
/*      */     //   271: sipush #255
/*      */     //   274: if_icmpge -> 383
/*      */     //   277: iload_3
/*      */     //   278: ifeq -> 300
/*      */     //   281: goto -> 288
/*      */     //   284: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   287: athrow
/*      */     //   288: aload #4
/*      */     //   290: getfield localCount : I
/*      */     //   293: goto -> 301
/*      */     //   296: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   299: athrow
/*      */     //   300: iconst_0
/*      */     //   301: istore #9
/*      */     //   303: iload #7
/*      */     //   305: sipush #251
/*      */     //   308: isub
/*      */     //   309: istore #10
/*      */     //   311: iload #10
/*      */     //   313: ifle -> 342
/*      */     //   316: aload_0
/*      */     //   317: aload #4
/*      */     //   319: getfield local : [Ljava/lang/Object;
/*      */     //   322: iload #9
/*      */     //   324: iinc #9, 1
/*      */     //   327: iload_1
/*      */     //   328: aload #5
/*      */     //   330: aload #6
/*      */     //   332: invokespecial readFrameType : ([Ljava/lang/Object;II[C[Lorg/spongepowered/asm/lib/Label;)I
/*      */     //   335: istore_1
/*      */     //   336: iinc #10, -1
/*      */     //   339: goto -> 311
/*      */     //   342: aload #4
/*      */     //   344: iconst_1
/*      */     //   345: putfield mode : I
/*      */     //   348: aload #4
/*      */     //   350: iload #7
/*      */     //   352: sipush #251
/*      */     //   355: isub
/*      */     //   356: putfield localDiff : I
/*      */     //   359: aload #4
/*      */     //   361: dup
/*      */     //   362: getfield localCount : I
/*      */     //   365: aload #4
/*      */     //   367: getfield localDiff : I
/*      */     //   370: iadd
/*      */     //   371: putfield localCount : I
/*      */     //   374: aload #4
/*      */     //   376: iconst_0
/*      */     //   377: putfield stackCount : I
/*      */     //   380: goto -> 498
/*      */     //   383: aload #4
/*      */     //   385: iconst_0
/*      */     //   386: putfield mode : I
/*      */     //   389: aload_0
/*      */     //   390: iload_1
/*      */     //   391: invokevirtual readUnsignedShort : (I)I
/*      */     //   394: istore #9
/*      */     //   396: iinc #1, 2
/*      */     //   399: aload #4
/*      */     //   401: iload #9
/*      */     //   403: putfield localDiff : I
/*      */     //   406: aload #4
/*      */     //   408: iload #9
/*      */     //   410: putfield localCount : I
/*      */     //   413: iconst_0
/*      */     //   414: istore #10
/*      */     //   416: iload #9
/*      */     //   418: ifle -> 447
/*      */     //   421: aload_0
/*      */     //   422: aload #4
/*      */     //   424: getfield local : [Ljava/lang/Object;
/*      */     //   427: iload #10
/*      */     //   429: iinc #10, 1
/*      */     //   432: iload_1
/*      */     //   433: aload #5
/*      */     //   435: aload #6
/*      */     //   437: invokespecial readFrameType : ([Ljava/lang/Object;II[C[Lorg/spongepowered/asm/lib/Label;)I
/*      */     //   440: istore_1
/*      */     //   441: iinc #9, -1
/*      */     //   444: goto -> 416
/*      */     //   447: aload_0
/*      */     //   448: iload_1
/*      */     //   449: invokevirtual readUnsignedShort : (I)I
/*      */     //   452: istore #9
/*      */     //   454: iinc #1, 2
/*      */     //   457: aload #4
/*      */     //   459: iload #9
/*      */     //   461: putfield stackCount : I
/*      */     //   464: iconst_0
/*      */     //   465: istore #10
/*      */     //   467: iload #9
/*      */     //   469: ifle -> 498
/*      */     //   472: aload_0
/*      */     //   473: aload #4
/*      */     //   475: getfield stack : [Ljava/lang/Object;
/*      */     //   478: iload #10
/*      */     //   480: iinc #10, 1
/*      */     //   483: iload_1
/*      */     //   484: aload #5
/*      */     //   486: aload #6
/*      */     //   488: invokespecial readFrameType : ([Ljava/lang/Object;II[C[Lorg/spongepowered/asm/lib/Label;)I
/*      */     //   491: istore_1
/*      */     //   492: iinc #9, -1
/*      */     //   495: goto -> 467
/*      */     //   498: aload #4
/*      */     //   500: dup
/*      */     //   501: getfield offset : I
/*      */     //   504: iload #8
/*      */     //   506: iconst_1
/*      */     //   507: iadd
/*      */     //   508: iadd
/*      */     //   509: putfield offset : I
/*      */     //   512: aload_0
/*      */     //   513: aload #4
/*      */     //   515: getfield offset : I
/*      */     //   518: aload #6
/*      */     //   520: invokevirtual readLabel : (I[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Label;
/*      */     //   523: pop
/*      */     //   524: iload_1
/*      */     //   525: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #459	-> 0
/*      */     //   #125	-> 7
/*      */     //   #505	-> 14
/*      */     //   #1013	-> 18
/*      */     //   #1305	-> 36
/*      */     //   #302	-> 41
/*      */     //   #346	-> 47
/*      */     //   #159	-> 53
/*      */     //   #1	-> 60
/*      */     //   #422	-> 64
/*      */     //   #812	-> 70
/*      */     //   #28	-> 79
/*      */     //   #157	-> 87
/*      */     //   #261	-> 94
/*      */     //   #1110	-> 110
/*      */     //   #941	-> 116
/*      */     //   #398	-> 125
/*      */     //   #1306	-> 132
/*      */     //   #145	-> 135
/*      */     //   #147	-> 143
/*      */     //   #829	-> 159
/*      */     //   #348	-> 165
/*      */     //   #902	-> 174
/*      */     //   #112	-> 197
/*      */     //   #366	-> 203
/*      */     //   #360	-> 214
/*      */     //   #1258	-> 229
/*      */     //   #1040	-> 242
/*      */     //   #289	-> 250
/*      */     //   #15	-> 256
/*      */     //   #971	-> 269
/*      */     //   #1109	-> 277
/*      */     //   #213	-> 303
/*      */     //   #1172	-> 316
/*      */     //   #990	-> 336
/*      */     //   #322	-> 342
/*      */     //   #915	-> 348
/*      */     //   #491	-> 359
/*      */     //   #663	-> 374
/*      */     //   #516	-> 380
/*      */     //   #822	-> 383
/*      */     //   #1085	-> 389
/*      */     //   #109	-> 396
/*      */     //   #49	-> 399
/*      */     //   #1170	-> 406
/*      */     //   #105	-> 413
/*      */     //   #704	-> 421
/*      */     //   #517	-> 441
/*      */     //   #572	-> 447
/*      */     //   #988	-> 454
/*      */     //   #510	-> 457
/*      */     //   #250	-> 464
/*      */     //   #139	-> 472
/*      */     //   #21	-> 492
/*      */     //   #1255	-> 498
/*      */     //   #995	-> 512
/*      */     //   #1102	-> 524
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   174	190	193	java/lang/IllegalArgumentException
/*      */     //   182	238	238	java/lang/IllegalArgumentException
/*      */     //   242	265	265	java/lang/IllegalArgumentException
/*      */     //   269	281	284	java/lang/IllegalArgumentException
/* 1301 */     //   277	296	296	java/lang/IllegalArgumentException } public Object readConst(int paramInt, char[] paramArrayOfchar) { int i = this.items[paramInt]; try { switch (this.b[i - 1]) { case 3: return Integer.valueOf(readInt(i));case 4: return Float.valueOf(Float.intBitsToFloat(readInt(i)));case 5: return Long.valueOf(readLong(i));case 6: return Double.valueOf(Double.longBitsToDouble(readLong(i)));case 7: return Type.getObjectType(readUTF8(i, paramArrayOfchar));case 8: return readUTF8(i, paramArrayOfchar);case 16: return Type.getMethodType(readUTF8(i, paramArrayOfchar)); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  int j = readByte(i); int[] arrayOfInt = this.items; int k = arrayOfInt[readUnsignedShort(i + 1)]; try {  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  boolean bool = (this.b[k - 1] == 11) ? true : false; String str1 = readClass(k, paramArrayOfchar); k = arrayOfInt[readUnsignedShort(k + 2)]; String str2 = readUTF8(k, paramArrayOfchar); String str3 = readUTF8(k + 2, paramArrayOfchar); return new Handle(j, str1, str2, str3, bool); } private int readAnnotationValue(int paramInt, char[] paramArrayOfchar, String paramString, AnnotationVisitor paramAnnotationVisitor) { try { if (paramAnnotationVisitor == null) { try { switch (this.b[paramInt] & 0xFF) { case 101: return paramInt + 5;case 64: return readAnnotationValues(paramInt + 3, paramArrayOfchar, true, null);case 91: return readAnnotationValues(paramInt + 1, paramArrayOfchar, false, null); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return paramInt + 3; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { int i; byte[] arrayOfByte; byte b; boolean[] arrayOfBoolean; short[] arrayOfShort; char[] arrayOfChar; int[] arrayOfInt; long[] arrayOfLong; float[] arrayOfFloat; double[] arrayOfDouble; switch (this.b[paramInt++] & 0xFF) { case 68: case 70: case 73: case 74: paramAnnotationVisitor.visit(paramString, readConst(readUnsignedShort(paramInt), paramArrayOfchar)); paramInt += 2; break;case 66: paramAnnotationVisitor.visit(paramString, Byte.valueOf((byte)readInt(this.items[readUnsignedShort(paramInt)]))); paramInt += 2; break;case 90: try {  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, (readInt(this.items[readUnsignedShort(paramInt)]) == 0) ? Boolean.FALSE : Boolean.TRUE); paramInt += 2; break;case 83: paramAnnotationVisitor.visit(paramString, Short.valueOf((short)readInt(this.items[readUnsignedShort(paramInt)]))); paramInt += 2; break;case 67: paramAnnotationVisitor.visit(paramString, Character.valueOf((char)readInt(this.items[readUnsignedShort(paramInt)]))); paramInt += 2; break;case 115: paramAnnotationVisitor.visit(paramString, readUTF8(paramInt, paramArrayOfchar)); paramInt += 2; break;case 101: paramAnnotationVisitor.visitEnum(paramString, readUTF8(paramInt, paramArrayOfchar), readUTF8(paramInt + 2, paramArrayOfchar)); paramInt += 4; break;case 99: paramAnnotationVisitor.visit(paramString, Type.getType(readUTF8(paramInt, paramArrayOfchar))); paramInt += 2; break;case 64: paramInt = readAnnotationValues(paramInt + 2, paramArrayOfchar, true, paramAnnotationVisitor.visitAnnotation(paramString, readUTF8(paramInt, paramArrayOfchar))); break;case 91: i = readUnsignedShort(paramInt); try { paramInt += 2; if (i == 0) return readAnnotationValues(paramInt - 2, paramArrayOfchar, false, paramAnnotationVisitor.visitArray(paramString));  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  switch (this.b[paramInt++] & 0xFF) { case 66: arrayOfByte = new byte[i]; b = 0; try { for (; b < i; b++) { arrayOfByte[b] = (byte)readInt(this.items[readUnsignedShort(paramInt)]); paramInt += 3; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfByte); paramInt--; break;case 90: arrayOfBoolean = new boolean[i]; b = 0; while (true) { try { if (b < i) { try {  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  arrayOfBoolean[b] = (readInt(this.items[readUnsignedShort(paramInt)]) != 0); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  break; }  paramAnnotationVisitor.visit(paramString, arrayOfBoolean); paramInt--; break;case 83: arrayOfShort = new short[i]; b = 0; try { while (b < i) { arrayOfShort[b] = (short)readInt(this.items[readUnsignedShort(paramInt)]); paramInt += 3; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfShort); paramInt--; break;case 67: arrayOfChar = new char[i]; b = 0; try { while (b < i) { arrayOfChar[b] = (char)readInt(this.items[readUnsignedShort(paramInt)]); paramInt += 3; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfChar); paramInt--; break;case 73: arrayOfInt = new int[i]; b = 0; try { for (; b < i; paramInt += 3, b++) arrayOfInt[b] = readInt(this.items[readUnsignedShort(paramInt)]);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfInt); paramInt--; break;case 74: arrayOfLong = new long[i]; b = 0; try { for (; b < i; paramInt += 3, b++) arrayOfLong[b] = readLong(this.items[readUnsignedShort(paramInt)]);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfLong); paramInt--; break;case 70: arrayOfFloat = new float[i]; b = 0; try { while (b < i) { arrayOfFloat[b] = Float.intBitsToFloat(readInt(this.items[readUnsignedShort(paramInt)])); paramInt += 3; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfFloat); paramInt--; break;case 68: arrayOfDouble = new double[i]; b = 0; try { while (b < i) { arrayOfDouble[b] = Double.longBitsToDouble(readLong(this.items[readUnsignedShort(paramInt)])); paramInt += 3; b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramAnnotationVisitor.visit(paramString, arrayOfDouble); paramInt--; break; }  paramInt = readAnnotationValues(paramInt - 3, paramArrayOfchar, false, paramAnnotationVisitor.visitArray(paramString)); break; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return paramInt; }
/* 1302 */   public long readLong(int paramInt) { long l1 = readInt(paramInt); long l2 = readInt(paramInt + 4) & 0xFFFFFFFFL; return l1 << 32L | l2; } public int getMaxStringLength() { return this.maxStringLength; } public int getItem(int paramInt) { return this.items[paramInt]; } private int getAttributes() { int i = this.header + 8 + readUnsignedShort(this.header + 6) * 2; int j; for (j = readUnsignedShort(i); j > 0; i += 8, j--) { for (int k = readUnsignedShort(i + 8); k > 0; ) { i += 6 + readInt(i + 12); k--; }  }  i += 2; for (j = readUnsignedShort(i); j > 0; ) { for (int k = readUnsignedShort(i + 8); k > 0; ) { i += 6 + readInt(i + 12); k--; }  i += 8; j--; }  return i + 2; } private int readAnnotationValues(int paramInt, char[] paramArrayOfchar, boolean paramBoolean, AnnotationVisitor paramAnnotationVisitor) { int i = readUnsignedShort(paramInt); try { paramInt += 2; if (paramBoolean) { while (i > 0) { paramInt = readAnnotationValue(paramInt + 2, paramArrayOfchar, readUTF8(paramInt, paramArrayOfchar), paramAnnotationVisitor); i--; }  } else { for (; i > 0; i--) paramInt = readAnnotationValue(paramInt, paramArrayOfchar, null, paramAnnotationVisitor);  }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (paramAnnotationVisitor != null) paramAnnotationVisitor.visitEnd();  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return paramInt; } public int getAccess() { return readUnsignedShort(this.header); } private int readFrameType(Object[] paramArrayOfObject, int paramInt1, int paramInt2, char[] paramArrayOfchar, Label[] paramArrayOfLabel) { int i = this.b[paramInt2++] & 0xFF; try { switch (i) { case 0: paramArrayOfObject[paramInt1] = Opcodes.TOP; return paramInt2;case 1: paramArrayOfObject[paramInt1] = Opcodes.INTEGER; return paramInt2;case 2: paramArrayOfObject[paramInt1] = Opcodes.FLOAT; return paramInt2;case 3: paramArrayOfObject[paramInt1] = Opcodes.DOUBLE; return paramInt2;case 4: paramArrayOfObject[paramInt1] = Opcodes.LONG; return paramInt2;case 5: paramArrayOfObject[paramInt1] = Opcodes.NULL; return paramInt2;case 6: paramArrayOfObject[paramInt1] = Opcodes.UNINITIALIZED_THIS; return paramInt2;case 7: paramArrayOfObject[paramInt1] = readClass(paramInt2, paramArrayOfchar); paramInt2 += 2; return paramInt2; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  paramArrayOfObject[paramInt1] = readLabel(readUnsignedShort(paramInt2), paramArrayOfLabel); paramInt2 += 2; return paramInt2; } private Attribute readAttribute(Attribute[] paramArrayOfAttribute, String paramString, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3, Label[] paramArrayOfLabel) { byte b = 0; while (true) { try { if (b < paramArrayOfAttribute.length) { try { if ((paramArrayOfAttribute[b]).type.equals(paramString)) return paramArrayOfAttribute[b].read(this, paramInt1, paramInt2, paramArrayOfchar, paramInt3, paramArrayOfLabel);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  b++; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return (new Attribute(paramString)).read(this, paramInt1, paramInt2, null, -1, null); }  } private void getImplicitFrame(Context paramContext) { String str = paramContext.desc; Object[] arrayOfObject = paramContext.local; byte b1 = 0; try { if ((paramContext.access & 0x8) == 0) try { if ("<init>".equals(paramContext.name)) { arrayOfObject[b1++] = Opcodes.UNINITIALIZED_THIS; } else { arrayOfObject[b1++] = readClass(this.header + 2, paramContext.buffer); }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }   } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  byte b2 = 1; while (true) { byte b = b2; switch (str.charAt(b2++)) { case 'B': case 'C': case 'I': case 'S': case 'Z': arrayOfObject[b1++] = Opcodes.INTEGER; continue;case 'F': arrayOfObject[b1++] = Opcodes.FLOAT; continue;case 'J': arrayOfObject[b1++] = Opcodes.LONG; continue;case 'D': arrayOfObject[b1++] = Opcodes.DOUBLE; continue;case '[': try { while (str.charAt(b2) == '[') b2++;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  try { if (str.charAt(b2) == 'L') { b2++; try { while (str.charAt(b2) != ';') b2++;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  arrayOfObject[b1++] = str.substring(b, ++b2); continue;case 'L': try { while (str.charAt(b2) != ';') b2++;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  arrayOfObject[b1++] = str.substring(b + 1, b2++); continue; }  paramContext.localCount = b1; return; }  } public void accept(ClassVisitor paramClassVisitor, int paramInt) { accept(paramClassVisitor, new Attribute[0], paramInt); } public int readUnsignedShort(int paramInt) { byte[] arrayOfByte = this.b; return (arrayOfByte[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF; }
/* 1303 */   void copyPool(ClassWriter paramClassWriter) { char[] arrayOfChar = new char[this.maxStringLength]; int i = this.items.length; Item[] arrayOfItem = new Item[i]; int j; for (j = 1; j < i; ) { int m; String str; int n, k = this.items[j]; byte b = this.b[k - 1]; Item item = new Item(j); switch (b) { case 9: case 10: case 11: m = this.items[readUnsignedShort(k + 2)]; item.set(b, readClass(k, arrayOfChar), readUTF8(m, arrayOfChar), readUTF8(m + 2, arrayOfChar)); break;case 3: item.set(readInt(k)); break;case 4: item.set(Float.intBitsToFloat(readInt(k))); break;case 12: item.set(b, readUTF8(k, arrayOfChar), readUTF8(k + 2, arrayOfChar), null); break;case 5: item.set(readLong(k)); j++; break;case 6: item.set(Double.longBitsToDouble(readLong(k))); j++; break;case 1: str = this.strings[j]; if (str == null) { k = this.items[j]; str = this.strings[j] = readUTF(k + 2, readUnsignedShort(k), arrayOfChar); }  item.set(b, str, null, null); break;case 15: n = this.items[readUnsignedShort(k + 1)]; m = this.items[readUnsignedShort(n + 2)]; item.set(20 + readByte(k), readClass(n, arrayOfChar), readUTF8(m, arrayOfChar), readUTF8(m + 2, arrayOfChar)); break;case 18: try { if (paramClassWriter.bootstrapMethods == null) copyBootstrapMethods(paramClassWriter, arrayOfItem, arrayOfChar);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  m = this.items[readUnsignedShort(k + 2)]; item.set(readUTF8(m, arrayOfChar), readUTF8(m + 2, arrayOfChar), readUnsignedShort(k)); break;default: item.set(b, readUTF8(k, arrayOfChar), null, null); break; }  }  j = this.items[1] - 1; paramClassWriter.pool.putByteArray(this.b, j, this.header - j); paramClassWriter.items = arrayOfItem; paramClassWriter.threshold = (int)(0.75D * i);
/*      */     paramClassWriter.index = i; }
/*      */ 
/*      */   
/*      */   private void readParameterAnnotations(MethodVisitor paramMethodVisitor, Context paramContext, int paramInt, boolean paramBoolean) {
/*      */     int i = this.b[paramInt++] & 0xFF;
/*      */     int j = (Type.getArgumentTypes(paramContext.desc)).length - i;
/*      */     byte b;
/*      */     for (b = 0; b < j; ) {
/*      */       AnnotationVisitor annotationVisitor = paramMethodVisitor.visitParameterAnnotation(b, "Ljava/lang/Synthetic;", false);
/*      */       try {
/*      */         if (annotationVisitor != null)
/*      */           annotationVisitor.visitEnd(); 
/*      */       } catch (IllegalArgumentException illegalArgumentException) {
/*      */         throw b(null);
/*      */       } 
/*      */       b++;
/*      */     } 
/*      */     char[] arrayOfChar = paramContext.buffer;
/*      */     while (b < i + j) {
/*      */       int k = readUnsignedShort(paramInt);
/*      */       paramInt += 2;
/*      */       for (; k > 0; paramInt = readAnnotationValues(paramInt + 2, arrayOfChar, true, annotationVisitor), k--)
/*      */         AnnotationVisitor annotationVisitor = paramMethodVisitor.visitParameterAnnotation(b, readUTF8(paramInt, arrayOfChar), paramBoolean); 
/*      */     } 
/*      */   }
/*      */   
/*      */   public String[] getInterfaces() {
/*      */     int i = this.header + 6;
/*      */     int j = readUnsignedShort(i);
/*      */     String[] arrayOfString = new String[j];
/*      */     if (j > 0) {
/*      */       char[] arrayOfChar = new char[this.maxStringLength];
/*      */       byte b = 0;
/*      */       try {
/*      */         while (b < j) {
/*      */           i += 2;
/*      */           arrayOfString[b] = readClass(i, arrayOfChar);
/*      */           b++;
/*      */         } 
/*      */       } catch (IllegalArgumentException illegalArgumentException) {
/*      */         throw b(null);
/*      */       } 
/*      */     } 
/*      */     return arrayOfString;
/*      */   }
/*      */   
/*      */   public String getClassName() {
/*      */     return readClass(this.header + 2, new char[this.maxStringLength]);
/*      */   }
/*      */   
/*      */   public short readShort(int paramInt) {
/*      */     byte[] arrayOfByte = this.b;
/*      */     return (short)((arrayOfByte[paramInt] & 0xFF) << 8 | arrayOfByte[paramInt + 1] & 0xFF);
/*      */   }
/*      */   
/*      */   public int readByte(int paramInt) {
/*      */     return this.b[paramInt] & 0xFF;
/*      */   }
/*      */   
/*      */   public String getSuperName() {
/*      */     return readClass(this.header + 4, new char[this.maxStringLength]);
/*      */   }
/*      */   
/*      */   public ClassReader(InputStream paramInputStream) throws IOException {
/*      */     this(readClass(paramInputStream, false));
/*      */   }
/*      */   
/*      */   private static byte[] readClass(InputStream paramInputStream, boolean paramBoolean) throws IOException {
/*      */     try {
/*      */       if (paramInputStream == null)
/*      */         throw new IOException("Class not found"); 
/*      */     } catch (IOException iOException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       byte[] arrayOfByte = new byte[paramInputStream.available()];
/*      */       int i = 0;
/*      */       while (true) {
/*      */         int j = paramInputStream.read(arrayOfByte, i, arrayOfByte.length - i);
/*      */         try {
/*      */           if (j == -1) {
/*      */             if (i < arrayOfByte.length) {
/*      */               byte[] arrayOfByte2 = new byte[i];
/*      */               System.arraycopy(arrayOfByte, 0, arrayOfByte2, 0, i);
/*      */               arrayOfByte = arrayOfByte2;
/*      */             } 
/*      */             byte[] arrayOfByte1 = arrayOfByte;
/*      */           } 
/*      */         } catch (IOException iOException) {
/*      */           throw b(null);
/*      */         } 
/*      */         i += j;
/*      */         if (i == arrayOfByte.length) {
/*      */           int k = paramInputStream.read();
/*      */           if (k < 0)
/*      */             return arrayOfByte; 
/*      */         } 
/*      */       } 
/*      */     } finally {
/*      */       try {
/*      */         if (paramBoolean)
/*      */           paramInputStream.close(); 
/*      */       } catch (IOException iOException) {
/*      */         throw b(null);
/*      */       } 
/*      */     } 
/*      */   }
/*      */   
/*      */   private int readMethod(ClassVisitor paramClassVisitor, Context paramContext, int paramInt) {
/*      */     // Byte code:
/*      */     //   0: aload_2
/*      */     //   1: getfield buffer : [C
/*      */     //   4: astore #4
/*      */     //   6: aload_2
/*      */     //   7: aload_0
/*      */     //   8: iload_3
/*      */     //   9: invokevirtual readUnsignedShort : (I)I
/*      */     //   12: putfield access : I
/*      */     //   15: aload_2
/*      */     //   16: aload_0
/*      */     //   17: iload_3
/*      */     //   18: iconst_2
/*      */     //   19: iadd
/*      */     //   20: aload #4
/*      */     //   22: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   25: putfield name : Ljava/lang/String;
/*      */     //   28: aload_2
/*      */     //   29: aload_0
/*      */     //   30: iload_3
/*      */     //   31: iconst_4
/*      */     //   32: iadd
/*      */     //   33: aload #4
/*      */     //   35: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   38: putfield desc : Ljava/lang/String;
/*      */     //   41: iinc #3, 6
/*      */     //   44: iconst_0
/*      */     //   45: istore #5
/*      */     //   47: iconst_0
/*      */     //   48: istore #6
/*      */     //   50: aconst_null
/*      */     //   51: astore #7
/*      */     //   53: aconst_null
/*      */     //   54: astore #8
/*      */     //   56: iconst_0
/*      */     //   57: istore #9
/*      */     //   59: iconst_0
/*      */     //   60: istore #10
/*      */     //   62: iconst_0
/*      */     //   63: istore #11
/*      */     //   65: iconst_0
/*      */     //   66: istore #12
/*      */     //   68: iconst_0
/*      */     //   69: istore #13
/*      */     //   71: iconst_0
/*      */     //   72: istore #14
/*      */     //   74: iconst_0
/*      */     //   75: istore #15
/*      */     //   77: iconst_0
/*      */     //   78: istore #16
/*      */     //   80: iload_3
/*      */     //   81: istore #17
/*      */     //   83: aconst_null
/*      */     //   84: astore #18
/*      */     //   86: aload_0
/*      */     //   87: iload_3
/*      */     //   88: invokevirtual readUnsignedShort : (I)I
/*      */     //   91: istore #19
/*      */     //   93: iload #19
/*      */     //   95: ifle -> 508
/*      */     //   98: aload_0
/*      */     //   99: iload_3
/*      */     //   100: iconst_2
/*      */     //   101: iadd
/*      */     //   102: aload #4
/*      */     //   104: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   107: astore #20
/*      */     //   109: ldc 'Code'
/*      */     //   111: aload #20
/*      */     //   113: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   116: ifeq -> 144
/*      */     //   119: aload_2
/*      */     //   120: getfield flags : I
/*      */     //   123: iconst_1
/*      */     //   124: iand
/*      */     //   125: ifne -> 489
/*      */     //   128: goto -> 135
/*      */     //   131: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   134: athrow
/*      */     //   135: iload_3
/*      */     //   136: bipush #8
/*      */     //   138: iadd
/*      */     //   139: istore #5
/*      */     //   141: goto -> 489
/*      */     //   144: ldc 'Exceptions'
/*      */     //   146: aload #20
/*      */     //   148: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   151: ifeq -> 213
/*      */     //   154: aload_0
/*      */     //   155: iload_3
/*      */     //   156: bipush #8
/*      */     //   158: iadd
/*      */     //   159: invokevirtual readUnsignedShort : (I)I
/*      */     //   162: anewarray java/lang/String
/*      */     //   165: astore #7
/*      */     //   167: iload_3
/*      */     //   168: bipush #10
/*      */     //   170: iadd
/*      */     //   171: istore #6
/*      */     //   173: iconst_0
/*      */     //   174: istore #21
/*      */     //   176: iload #21
/*      */     //   178: aload #7
/*      */     //   180: arraylength
/*      */     //   181: if_icmpge -> 210
/*      */     //   184: aload #7
/*      */     //   186: iload #21
/*      */     //   188: aload_0
/*      */     //   189: iload #6
/*      */     //   191: aload #4
/*      */     //   193: invokevirtual readClass : (I[C)Ljava/lang/String;
/*      */     //   196: aastore
/*      */     //   197: iinc #6, 2
/*      */     //   200: iinc #21, 1
/*      */     //   203: goto -> 176
/*      */     //   206: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   209: athrow
/*      */     //   210: goto -> 489
/*      */     //   213: ldc 'Signature'
/*      */     //   215: aload #20
/*      */     //   217: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   220: ifeq -> 238
/*      */     //   223: aload_0
/*      */     //   224: iload_3
/*      */     //   225: bipush #8
/*      */     //   227: iadd
/*      */     //   228: aload #4
/*      */     //   230: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   233: astore #8
/*      */     //   235: goto -> 489
/*      */     //   238: ldc 'Deprecated'
/*      */     //   240: aload #20
/*      */     //   242: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   245: ifeq -> 266
/*      */     //   248: aload_2
/*      */     //   249: dup
/*      */     //   250: getfield access : I
/*      */     //   253: ldc 131072
/*      */     //   255: ior
/*      */     //   256: putfield access : I
/*      */     //   259: goto -> 489
/*      */     //   262: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   265: athrow
/*      */     //   266: ldc 'RuntimeVisibleAnnotations'
/*      */     //   268: aload #20
/*      */     //   270: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   273: ifeq -> 285
/*      */     //   276: iload_3
/*      */     //   277: bipush #8
/*      */     //   279: iadd
/*      */     //   280: istore #10
/*      */     //   282: goto -> 489
/*      */     //   285: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   287: aload #20
/*      */     //   289: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   292: ifeq -> 304
/*      */     //   295: iload_3
/*      */     //   296: bipush #8
/*      */     //   298: iadd
/*      */     //   299: istore #12
/*      */     //   301: goto -> 489
/*      */     //   304: ldc 'AnnotationDefault'
/*      */     //   306: aload #20
/*      */     //   308: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   311: ifeq -> 323
/*      */     //   314: iload_3
/*      */     //   315: bipush #8
/*      */     //   317: iadd
/*      */     //   318: istore #14
/*      */     //   320: goto -> 489
/*      */     //   323: ldc 'Synthetic'
/*      */     //   325: aload #20
/*      */     //   327: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   330: ifeq -> 351
/*      */     //   333: aload_2
/*      */     //   334: dup
/*      */     //   335: getfield access : I
/*      */     //   338: ldc 266240
/*      */     //   340: ior
/*      */     //   341: putfield access : I
/*      */     //   344: goto -> 489
/*      */     //   347: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   350: athrow
/*      */     //   351: ldc 'RuntimeInvisibleAnnotations'
/*      */     //   353: aload #20
/*      */     //   355: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   358: ifeq -> 370
/*      */     //   361: iload_3
/*      */     //   362: bipush #8
/*      */     //   364: iadd
/*      */     //   365: istore #11
/*      */     //   367: goto -> 489
/*      */     //   370: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   372: aload #20
/*      */     //   374: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   377: ifeq -> 389
/*      */     //   380: iload_3
/*      */     //   381: bipush #8
/*      */     //   383: iadd
/*      */     //   384: istore #13
/*      */     //   386: goto -> 489
/*      */     //   389: ldc 'RuntimeVisibleParameterAnnotations'
/*      */     //   391: aload #20
/*      */     //   393: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   396: ifeq -> 408
/*      */     //   399: iload_3
/*      */     //   400: bipush #8
/*      */     //   402: iadd
/*      */     //   403: istore #15
/*      */     //   405: goto -> 489
/*      */     //   408: ldc 'RuntimeInvisibleParameterAnnotations'
/*      */     //   410: aload #20
/*      */     //   412: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   415: ifeq -> 427
/*      */     //   418: iload_3
/*      */     //   419: bipush #8
/*      */     //   421: iadd
/*      */     //   422: istore #16
/*      */     //   424: goto -> 489
/*      */     //   427: ldc 'MethodParameters'
/*      */     //   429: aload #20
/*      */     //   431: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   434: ifeq -> 446
/*      */     //   437: iload_3
/*      */     //   438: bipush #8
/*      */     //   440: iadd
/*      */     //   441: istore #9
/*      */     //   443: goto -> 489
/*      */     //   446: aload_0
/*      */     //   447: aload_2
/*      */     //   448: getfield attrs : [Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   451: aload #20
/*      */     //   453: iload_3
/*      */     //   454: bipush #8
/*      */     //   456: iadd
/*      */     //   457: aload_0
/*      */     //   458: iload_3
/*      */     //   459: iconst_4
/*      */     //   460: iadd
/*      */     //   461: invokevirtual readInt : (I)I
/*      */     //   464: aload #4
/*      */     //   466: iconst_m1
/*      */     //   467: aconst_null
/*      */     //   468: invokespecial readAttribute : ([Lorg/spongepowered/asm/lib/Attribute;Ljava/lang/String;II[CI[Lorg/spongepowered/asm/lib/Label;)Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   471: astore #21
/*      */     //   473: aload #21
/*      */     //   475: ifnull -> 489
/*      */     //   478: aload #21
/*      */     //   480: aload #18
/*      */     //   482: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   485: aload #21
/*      */     //   487: astore #18
/*      */     //   489: iload_3
/*      */     //   490: bipush #6
/*      */     //   492: aload_0
/*      */     //   493: iload_3
/*      */     //   494: iconst_4
/*      */     //   495: iadd
/*      */     //   496: invokevirtual readInt : (I)I
/*      */     //   499: iadd
/*      */     //   500: iadd
/*      */     //   501: istore_3
/*      */     //   502: iinc #19, -1
/*      */     //   505: goto -> 93
/*      */     //   508: iinc #3, 2
/*      */     //   511: aload_1
/*      */     //   512: aload_2
/*      */     //   513: getfield access : I
/*      */     //   516: aload_2
/*      */     //   517: getfield name : Ljava/lang/String;
/*      */     //   520: aload_2
/*      */     //   521: getfield desc : Ljava/lang/String;
/*      */     //   524: aload #8
/*      */     //   526: aload #7
/*      */     //   528: invokevirtual visitMethod : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/spongepowered/asm/lib/MethodVisitor;
/*      */     //   531: astore #19
/*      */     //   533: aload #19
/*      */     //   535: ifnonnull -> 544
/*      */     //   538: iload_3
/*      */     //   539: ireturn
/*      */     //   540: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   543: athrow
/*      */     //   544: aload #19
/*      */     //   546: instanceof org/spongepowered/asm/lib/MethodWriter
/*      */     //   549: ifeq -> 717
/*      */     //   552: aload #19
/*      */     //   554: checkcast org/spongepowered/asm/lib/MethodWriter
/*      */     //   557: astore #20
/*      */     //   559: aload #20
/*      */     //   561: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   564: getfield cr : Lorg/spongepowered/asm/lib/ClassReader;
/*      */     //   567: aload_0
/*      */     //   568: if_acmpne -> 717
/*      */     //   571: aload #8
/*      */     //   573: aload #20
/*      */     //   575: getfield signature : Ljava/lang/String;
/*      */     //   578: if_acmpne -> 717
/*      */     //   581: goto -> 588
/*      */     //   584: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   587: athrow
/*      */     //   588: iconst_0
/*      */     //   589: istore #21
/*      */     //   591: aload #7
/*      */     //   593: ifnonnull -> 625
/*      */     //   596: aload #20
/*      */     //   598: getfield exceptionCount : I
/*      */     //   601: ifne -> 619
/*      */     //   604: goto -> 611
/*      */     //   607: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   610: athrow
/*      */     //   611: iconst_1
/*      */     //   612: goto -> 620
/*      */     //   615: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   618: athrow
/*      */     //   619: iconst_0
/*      */     //   620: istore #21
/*      */     //   622: goto -> 690
/*      */     //   625: aload #7
/*      */     //   627: arraylength
/*      */     //   628: aload #20
/*      */     //   630: getfield exceptionCount : I
/*      */     //   633: if_icmpne -> 690
/*      */     //   636: iconst_1
/*      */     //   637: istore #21
/*      */     //   639: aload #7
/*      */     //   641: arraylength
/*      */     //   642: iconst_1
/*      */     //   643: isub
/*      */     //   644: istore #22
/*      */     //   646: iload #22
/*      */     //   648: iflt -> 690
/*      */     //   651: iinc #6, -2
/*      */     //   654: aload #20
/*      */     //   656: getfield exceptions : [I
/*      */     //   659: iload #22
/*      */     //   661: iaload
/*      */     //   662: aload_0
/*      */     //   663: iload #6
/*      */     //   665: invokevirtual readUnsignedShort : (I)I
/*      */     //   668: if_icmpeq -> 684
/*      */     //   671: goto -> 678
/*      */     //   674: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   677: athrow
/*      */     //   678: iconst_0
/*      */     //   679: istore #21
/*      */     //   681: goto -> 690
/*      */     //   684: iinc #22, -1
/*      */     //   687: goto -> 646
/*      */     //   690: iload #21
/*      */     //   692: ifeq -> 717
/*      */     //   695: aload #20
/*      */     //   697: iload #17
/*      */     //   699: putfield classReaderOffset : I
/*      */     //   702: aload #20
/*      */     //   704: iload_3
/*      */     //   705: iload #17
/*      */     //   707: isub
/*      */     //   708: putfield classReaderLength : I
/*      */     //   711: iload_3
/*      */     //   712: ireturn
/*      */     //   713: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   716: athrow
/*      */     //   717: iload #9
/*      */     //   719: ifeq -> 779
/*      */     //   722: aload_0
/*      */     //   723: getfield b : [B
/*      */     //   726: iload #9
/*      */     //   728: baload
/*      */     //   729: sipush #255
/*      */     //   732: iand
/*      */     //   733: istore #20
/*      */     //   735: iload #9
/*      */     //   737: iconst_1
/*      */     //   738: iadd
/*      */     //   739: istore #21
/*      */     //   741: iload #20
/*      */     //   743: ifle -> 779
/*      */     //   746: aload #19
/*      */     //   748: aload_0
/*      */     //   749: iload #21
/*      */     //   751: aload #4
/*      */     //   753: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   756: aload_0
/*      */     //   757: iload #21
/*      */     //   759: iconst_2
/*      */     //   760: iadd
/*      */     //   761: invokevirtual readUnsignedShort : (I)I
/*      */     //   764: invokevirtual visitParameter : (Ljava/lang/String;I)V
/*      */     //   767: iinc #20, -1
/*      */     //   770: iload #21
/*      */     //   772: iconst_4
/*      */     //   773: iadd
/*      */     //   774: istore #21
/*      */     //   776: goto -> 741
/*      */     //   779: iload #14
/*      */     //   781: ifeq -> 820
/*      */     //   784: aload #19
/*      */     //   786: invokevirtual visitAnnotationDefault : ()Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   789: astore #20
/*      */     //   791: aload_0
/*      */     //   792: iload #14
/*      */     //   794: aload #4
/*      */     //   796: aconst_null
/*      */     //   797: aload #20
/*      */     //   799: invokespecial readAnnotationValue : (I[CLjava/lang/String;Lorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   802: pop
/*      */     //   803: aload #20
/*      */     //   805: ifnull -> 820
/*      */     //   808: aload #20
/*      */     //   810: invokevirtual visitEnd : ()V
/*      */     //   813: goto -> 820
/*      */     //   816: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   819: athrow
/*      */     //   820: iload #10
/*      */     //   822: ifeq -> 877
/*      */     //   825: aload_0
/*      */     //   826: iload #10
/*      */     //   828: invokevirtual readUnsignedShort : (I)I
/*      */     //   831: istore #20
/*      */     //   833: iload #10
/*      */     //   835: iconst_2
/*      */     //   836: iadd
/*      */     //   837: istore #21
/*      */     //   839: iload #20
/*      */     //   841: ifle -> 877
/*      */     //   844: aload_0
/*      */     //   845: iload #21
/*      */     //   847: iconst_2
/*      */     //   848: iadd
/*      */     //   849: aload #4
/*      */     //   851: iconst_1
/*      */     //   852: aload #19
/*      */     //   854: aload_0
/*      */     //   855: iload #21
/*      */     //   857: aload #4
/*      */     //   859: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   862: iconst_1
/*      */     //   863: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   866: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   869: istore #21
/*      */     //   871: iinc #20, -1
/*      */     //   874: goto -> 839
/*      */     //   877: iload #11
/*      */     //   879: ifeq -> 934
/*      */     //   882: aload_0
/*      */     //   883: iload #11
/*      */     //   885: invokevirtual readUnsignedShort : (I)I
/*      */     //   888: istore #20
/*      */     //   890: iload #11
/*      */     //   892: iconst_2
/*      */     //   893: iadd
/*      */     //   894: istore #21
/*      */     //   896: iload #20
/*      */     //   898: ifle -> 934
/*      */     //   901: aload_0
/*      */     //   902: iload #21
/*      */     //   904: iconst_2
/*      */     //   905: iadd
/*      */     //   906: aload #4
/*      */     //   908: iconst_1
/*      */     //   909: aload #19
/*      */     //   911: aload_0
/*      */     //   912: iload #21
/*      */     //   914: aload #4
/*      */     //   916: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   919: iconst_0
/*      */     //   920: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   923: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   926: istore #21
/*      */     //   928: iinc #20, -1
/*      */     //   931: goto -> 896
/*      */     //   934: iload #12
/*      */     //   936: ifeq -> 1008
/*      */     //   939: aload_0
/*      */     //   940: iload #12
/*      */     //   942: invokevirtual readUnsignedShort : (I)I
/*      */     //   945: istore #20
/*      */     //   947: iload #12
/*      */     //   949: iconst_2
/*      */     //   950: iadd
/*      */     //   951: istore #21
/*      */     //   953: iload #20
/*      */     //   955: ifle -> 1008
/*      */     //   958: aload_0
/*      */     //   959: aload_2
/*      */     //   960: iload #21
/*      */     //   962: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   965: istore #21
/*      */     //   967: aload_0
/*      */     //   968: iload #21
/*      */     //   970: iconst_2
/*      */     //   971: iadd
/*      */     //   972: aload #4
/*      */     //   974: iconst_1
/*      */     //   975: aload #19
/*      */     //   977: aload_2
/*      */     //   978: getfield typeRef : I
/*      */     //   981: aload_2
/*      */     //   982: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   985: aload_0
/*      */     //   986: iload #21
/*      */     //   988: aload #4
/*      */     //   990: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   993: iconst_1
/*      */     //   994: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   997: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   1000: istore #21
/*      */     //   1002: iinc #20, -1
/*      */     //   1005: goto -> 953
/*      */     //   1008: iload #13
/*      */     //   1010: ifeq -> 1082
/*      */     //   1013: aload_0
/*      */     //   1014: iload #13
/*      */     //   1016: invokevirtual readUnsignedShort : (I)I
/*      */     //   1019: istore #20
/*      */     //   1021: iload #13
/*      */     //   1023: iconst_2
/*      */     //   1024: iadd
/*      */     //   1025: istore #21
/*      */     //   1027: iload #20
/*      */     //   1029: ifle -> 1082
/*      */     //   1032: aload_0
/*      */     //   1033: aload_2
/*      */     //   1034: iload #21
/*      */     //   1036: invokespecial readAnnotationTarget : (Lorg/spongepowered/asm/lib/Context;I)I
/*      */     //   1039: istore #21
/*      */     //   1041: aload_0
/*      */     //   1042: iload #21
/*      */     //   1044: iconst_2
/*      */     //   1045: iadd
/*      */     //   1046: aload #4
/*      */     //   1048: iconst_1
/*      */     //   1049: aload #19
/*      */     //   1051: aload_2
/*      */     //   1052: getfield typeRef : I
/*      */     //   1055: aload_2
/*      */     //   1056: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*      */     //   1059: aload_0
/*      */     //   1060: iload #21
/*      */     //   1062: aload #4
/*      */     //   1064: invokevirtual readUTF8 : (I[C)Ljava/lang/String;
/*      */     //   1067: iconst_0
/*      */     //   1068: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*      */     //   1071: invokespecial readAnnotationValues : (I[CZLorg/spongepowered/asm/lib/AnnotationVisitor;)I
/*      */     //   1074: istore #21
/*      */     //   1076: iinc #20, -1
/*      */     //   1079: goto -> 1027
/*      */     //   1082: iload #15
/*      */     //   1084: ifeq -> 1104
/*      */     //   1087: aload_0
/*      */     //   1088: aload #19
/*      */     //   1090: aload_2
/*      */     //   1091: iload #15
/*      */     //   1093: iconst_1
/*      */     //   1094: invokespecial readParameterAnnotations : (Lorg/spongepowered/asm/lib/MethodVisitor;Lorg/spongepowered/asm/lib/Context;IZ)V
/*      */     //   1097: goto -> 1104
/*      */     //   1100: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1103: athrow
/*      */     //   1104: iload #16
/*      */     //   1106: ifeq -> 1126
/*      */     //   1109: aload_0
/*      */     //   1110: aload #19
/*      */     //   1112: aload_2
/*      */     //   1113: iload #16
/*      */     //   1115: iconst_0
/*      */     //   1116: invokespecial readParameterAnnotations : (Lorg/spongepowered/asm/lib/MethodVisitor;Lorg/spongepowered/asm/lib/Context;IZ)V
/*      */     //   1119: goto -> 1126
/*      */     //   1122: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1125: athrow
/*      */     //   1126: aload #18
/*      */     //   1128: ifnull -> 1158
/*      */     //   1131: aload #18
/*      */     //   1133: getfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1136: astore #20
/*      */     //   1138: aload #18
/*      */     //   1140: aconst_null
/*      */     //   1141: putfield next : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1144: aload #19
/*      */     //   1146: aload #18
/*      */     //   1148: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*      */     //   1151: aload #20
/*      */     //   1153: astore #18
/*      */     //   1155: goto -> 1126
/*      */     //   1158: iload #5
/*      */     //   1160: ifeq -> 1184
/*      */     //   1163: aload #19
/*      */     //   1165: invokevirtual visitCode : ()V
/*      */     //   1168: aload_0
/*      */     //   1169: aload #19
/*      */     //   1171: aload_2
/*      */     //   1172: iload #5
/*      */     //   1174: invokespecial readCode : (Lorg/spongepowered/asm/lib/MethodVisitor;Lorg/spongepowered/asm/lib/Context;I)V
/*      */     //   1177: goto -> 1184
/*      */     //   1180: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*      */     //   1183: athrow
/*      */     //   1184: aload #19
/*      */     //   1186: invokevirtual visitEnd : ()V
/*      */     //   1189: iload_3
/*      */     //   1190: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1219	-> 0
/*      */     //   #416	-> 6
/*      */     //   #431	-> 15
/*      */     //   #1146	-> 28
/*      */     //   #998	-> 41
/*      */     //   #80	-> 44
/*      */     //   #598	-> 47
/*      */     //   #674	-> 50
/*      */     //   #893	-> 53
/*      */     //   #272	-> 56
/*      */     //   #410	-> 59
/*      */     //   #671	-> 62
/*      */     //   #368	-> 65
/*      */     //   #1292	-> 68
/*      */     //   #1250	-> 71
/*      */     //   #1082	-> 74
/*      */     //   #1142	-> 77
/*      */     //   #104	-> 80
/*      */     //   #219	-> 83
/*      */     //   #530	-> 86
/*      */     //   #265	-> 98
/*      */     //   #809	-> 109
/*      */     //   #1048	-> 119
/*      */     //   #522	-> 135
/*      */     //   #295	-> 144
/*      */     //   #9	-> 154
/*      */     //   #886	-> 167
/*      */     //   #837	-> 173
/*      */     //   #859	-> 184
/*      */     //   #406	-> 197
/*      */     //   #797	-> 200
/*      */     //   #262	-> 213
/*      */     //   #979	-> 223
/*      */     //   #1039	-> 238
/*      */     //   #267	-> 248
/*      */     //   #788	-> 266
/*      */     //   #52	-> 270
/*      */     //   #854	-> 276
/*      */     //   #540	-> 285
/*      */     //   #395	-> 289
/*      */     //   #514	-> 295
/*      */     //   #567	-> 304
/*      */     //   #705	-> 314
/*      */     //   #182	-> 323
/*      */     //   #834	-> 333
/*      */     //   #835	-> 351
/*      */     //   #1035	-> 355
/*      */     //   #1180	-> 361
/*      */     //   #1233	-> 370
/*      */     //   #1228	-> 374
/*      */     //   #547	-> 380
/*      */     //   #639	-> 389
/*      */     //   #1279	-> 393
/*      */     //   #1259	-> 399
/*      */     //   #579	-> 408
/*      */     //   #833	-> 412
/*      */     //   #184	-> 418
/*      */     //   #940	-> 427
/*      */     //   #1221	-> 437
/*      */     //   #496	-> 446
/*      */     //   #63	-> 461
/*      */     //   #1023	-> 468
/*      */     //   #816	-> 473
/*      */     //   #561	-> 478
/*      */     //   #1062	-> 485
/*      */     //   #121	-> 489
/*      */     //   #277	-> 502
/*      */     //   #216	-> 508
/*      */     //   #323	-> 511
/*      */     //   #761	-> 533
/*      */     //   #1174	-> 538
/*      */     //   #525	-> 544
/*      */     //   #1099	-> 552
/*      */     //   #149	-> 559
/*      */     //   #304	-> 588
/*      */     //   #255	-> 591
/*      */     //   #544	-> 596
/*      */     //   #273	-> 625
/*      */     //   #354	-> 636
/*      */     //   #362	-> 639
/*      */     //   #133	-> 651
/*      */     //   #498	-> 654
/*      */     //   #344	-> 678
/*      */     //   #868	-> 681
/*      */     //   #115	-> 684
/*      */     //   #100	-> 690
/*      */     //   #1064	-> 695
/*      */     //   #967	-> 702
/*      */     //   #1014	-> 711
/*      */     //   #630	-> 717
/*      */     //   #748	-> 722
/*      */     //   #258	-> 746
/*      */     //   #150	-> 767
/*      */     //   #541	-> 779
/*      */     //   #1074	-> 784
/*      */     //   #953	-> 791
/*      */     //   #519	-> 803
/*      */     //   #1283	-> 808
/*      */     //   #1249	-> 820
/*      */     //   #439	-> 825
/*      */     //   #1015	-> 844
/*      */     //   #436	-> 859
/*      */     //   #1202	-> 866
/*      */     //   #682	-> 871
/*      */     //   #324	-> 877
/*      */     //   #333	-> 882
/*      */     //   #529	-> 901
/*      */     //   #504	-> 916
/*      */     //   #331	-> 923
/*      */     //   #204	-> 928
/*      */     //   #590	-> 934
/*      */     //   #1274	-> 939
/*      */     //   #583	-> 958
/*      */     //   #1167	-> 967
/*      */     //   #786	-> 990
/*      */     //   #580	-> 994
/*      */     //   #877	-> 997
/*      */     //   #784	-> 1002
/*      */     //   #1132	-> 1008
/*      */     //   #90	-> 1013
/*      */     //   #1261	-> 1032
/*      */     //   #901	-> 1041
/*      */     //   #749	-> 1064
/*      */     //   #935	-> 1068
/*      */     //   #384	-> 1071
/*      */     //   #57	-> 1076
/*      */     //   #411	-> 1082
/*      */     //   #817	-> 1087
/*      */     //   #765	-> 1104
/*      */     //   #1103	-> 1109
/*      */     //   #235	-> 1126
/*      */     //   #1297	-> 1131
/*      */     //   #55	-> 1138
/*      */     //   #237	-> 1144
/*      */     //   #1147	-> 1151
/*      */     //   #1010	-> 1155
/*      */     //   #1158	-> 1158
/*      */     //   #645	-> 1163
/*      */     //   #536	-> 1168
/*      */     //   #853	-> 1184
/*      */     //   #192	-> 1189
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   109	128	131	java/lang/IllegalArgumentException
/*      */     //   176	206	206	java/lang/IllegalArgumentException
/*      */     //   238	262	262	java/lang/IllegalArgumentException
/*      */     //   323	347	347	java/lang/IllegalArgumentException
/*      */     //   533	540	540	java/lang/IllegalArgumentException
/*      */     //   559	581	584	java/lang/IllegalArgumentException
/*      */     //   591	604	607	java/lang/IllegalArgumentException
/*      */     //   596	615	615	java/lang/IllegalArgumentException
/*      */     //   646	671	674	java/lang/IllegalArgumentException
/*      */     //   690	713	713	java/lang/IllegalArgumentException
/*      */     //   791	813	816	java/lang/IllegalArgumentException
/*      */     //   1082	1097	1100	java/lang/IllegalArgumentException
/*      */     //   1104	1119	1122	java/lang/IllegalArgumentException
/*      */     //   1158	1177	1180	java/lang/IllegalArgumentException
/*      */   }
/*      */   
/*      */   private int readAnnotationTarget(Context paramContext, int paramInt) {
/*      */     byte b;
/*      */     int i = readInt(paramInt);
/*      */     switch (i >>> 24) {
/*      */       case 0:
/*      */       case 1:
/*      */       case 22:
/*      */         i &= 0xFFFF0000;
/*      */         paramInt += 2;
/*      */         break;
/*      */       case 19:
/*      */       case 20:
/*      */       case 21:
/*      */         i &= 0xFF000000;
/*      */         paramInt++;
/*      */         break;
/*      */       case 64:
/*      */       case 65:
/*      */         i &= 0xFF000000;
/*      */         j = readUnsignedShort(paramInt + 1);
/*      */         paramContext.start = new Label[j];
/*      */         paramContext.end = new Label[j];
/*      */         paramContext.index = new int[j];
/*      */         paramInt += 3;
/*      */         for (b = 0; b < j; ) {
/*      */           int k = readUnsignedShort(paramInt);
/*      */           int m = readUnsignedShort(paramInt + 2);
/*      */           paramContext.start[b] = readLabel(k, paramContext.labels);
/*      */           paramContext.end[b] = readLabel(k + m, paramContext.labels);
/*      */           paramContext.index[b] = readUnsignedShort(paramInt + 4);
/*      */           paramInt += 6;
/*      */           b++;
/*      */         } 
/*      */         break;
/*      */       case 71:
/*      */       case 72:
/*      */       case 73:
/*      */       case 74:
/*      */       case 75:
/*      */         i &= 0xFF0000FF;
/*      */         paramInt += 4;
/*      */         break;
/*      */       default:
/*      */         try {
/*      */         
/*      */         } catch (IllegalArgumentException illegalArgumentException) {
/*      */           throw b(null);
/*      */         } 
/*      */         i &= (i >>> 24 < 67) ? -256 : -16777216;
/*      */         paramInt += 3;
/*      */         break;
/*      */     } 
/*      */     int j = readByte(paramInt);
/*      */     try {
/*      */       paramContext.typeRef = i;
/*      */     } catch (IllegalArgumentException illegalArgumentException) {
/*      */       throw b(null);
/*      */     } 
/*      */     paramContext.typePath = (j == 0) ? null : new TypePath(this.b, paramInt);
/*      */     return paramInt + 1 + 2 * j;
/*      */   }
/*      */   
/*      */   private static Exception b(Exception paramException) {
/*      */     return paramException;
/*      */   }
/*      */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\ClassReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */