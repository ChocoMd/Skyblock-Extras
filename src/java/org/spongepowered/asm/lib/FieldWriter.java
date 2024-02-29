/*     */ package org.spongepowered.asm.lib;
/*     */ 
/*     */ final class FieldWriter extends FieldVisitor {
/*     */   private final ClassWriter cw;
/*     */   private final int access;
/*     */   private final int name;
/*     */   private final int desc;
/*     */   private int signature;
/*     */   private int value;
/*     */   private AnnotationWriter anns;
/*     */   private AnnotationWriter ianns;
/*     */   private AnnotationWriter tanns;
/*     */   private AnnotationWriter itanns;
/*     */   private Attribute attrs;
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*  17 */     paramAttribute.next = this.attrs;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  36 */     this.attrs = paramAttribute;
/*     */   }
/*     */   void put(ByteVector paramByteVector) {
/*     */     // Byte code:
/*     */     //   0: bipush #64
/*     */     //   2: istore_2
/*     */     //   3: ldc 393216
/*     */     //   5: aload_0
/*     */     //   6: getfield access : I
/*     */     //   9: ldc 262144
/*     */     //   11: iand
/*     */     //   12: bipush #64
/*     */     //   14: idiv
/*     */     //   15: ior
/*     */     //   16: istore_3
/*     */     //   17: aload_1
/*     */     //   18: aload_0
/*     */     //   19: getfield access : I
/*     */     //   22: iload_3
/*     */     //   23: iconst_m1
/*     */     //   24: ixor
/*     */     //   25: iand
/*     */     //   26: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   29: aload_0
/*     */     //   30: getfield name : I
/*     */     //   33: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   36: aload_0
/*     */     //   37: getfield desc : I
/*     */     //   40: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   43: pop
/*     */     //   44: iconst_0
/*     */     //   45: istore #4
/*     */     //   47: aload_0
/*     */     //   48: getfield value : I
/*     */     //   51: ifeq -> 64
/*     */     //   54: iinc #4, 1
/*     */     //   57: goto -> 64
/*     */     //   60: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   63: athrow
/*     */     //   64: aload_0
/*     */     //   65: getfield access : I
/*     */     //   68: sipush #4096
/*     */     //   71: iand
/*     */     //   72: ifeq -> 124
/*     */     //   75: aload_0
/*     */     //   76: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   79: getfield version : I
/*     */     //   82: ldc 65535
/*     */     //   84: iand
/*     */     //   85: bipush #49
/*     */     //   87: if_icmplt -> 114
/*     */     //   90: goto -> 97
/*     */     //   93: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   96: athrow
/*     */     //   97: aload_0
/*     */     //   98: getfield access : I
/*     */     //   101: ldc 262144
/*     */     //   103: iand
/*     */     //   104: ifeq -> 124
/*     */     //   107: goto -> 114
/*     */     //   110: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   113: athrow
/*     */     //   114: iinc #4, 1
/*     */     //   117: goto -> 124
/*     */     //   120: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   123: athrow
/*     */     //   124: aload_0
/*     */     //   125: getfield access : I
/*     */     //   128: ldc 131072
/*     */     //   130: iand
/*     */     //   131: ifeq -> 144
/*     */     //   134: iinc #4, 1
/*     */     //   137: goto -> 144
/*     */     //   140: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   143: athrow
/*     */     //   144: aload_0
/*     */     //   145: getfield signature : I
/*     */     //   148: ifeq -> 161
/*     */     //   151: iinc #4, 1
/*     */     //   154: goto -> 161
/*     */     //   157: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   160: athrow
/*     */     //   161: aload_0
/*     */     //   162: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   165: ifnull -> 178
/*     */     //   168: iinc #4, 1
/*     */     //   171: goto -> 178
/*     */     //   174: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   177: athrow
/*     */     //   178: aload_0
/*     */     //   179: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   182: ifnull -> 195
/*     */     //   185: iinc #4, 1
/*     */     //   188: goto -> 195
/*     */     //   191: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   194: athrow
/*     */     //   195: aload_0
/*     */     //   196: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   199: ifnull -> 212
/*     */     //   202: iinc #4, 1
/*     */     //   205: goto -> 212
/*     */     //   208: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   211: athrow
/*     */     //   212: aload_0
/*     */     //   213: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   216: ifnull -> 229
/*     */     //   219: iinc #4, 1
/*     */     //   222: goto -> 229
/*     */     //   225: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   228: athrow
/*     */     //   229: aload_0
/*     */     //   230: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   233: ifnull -> 248
/*     */     //   236: iload #4
/*     */     //   238: aload_0
/*     */     //   239: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   242: invokevirtual getCount : ()I
/*     */     //   245: iadd
/*     */     //   246: istore #4
/*     */     //   248: aload_1
/*     */     //   249: iload #4
/*     */     //   251: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   254: pop
/*     */     //   255: aload_0
/*     */     //   256: getfield value : I
/*     */     //   259: ifeq -> 296
/*     */     //   262: aload_1
/*     */     //   263: aload_0
/*     */     //   264: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   267: ldc 'ConstantValue'
/*     */     //   269: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   272: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   275: pop
/*     */     //   276: aload_1
/*     */     //   277: iconst_2
/*     */     //   278: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   281: aload_0
/*     */     //   282: getfield value : I
/*     */     //   285: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   288: pop
/*     */     //   289: goto -> 296
/*     */     //   292: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   295: athrow
/*     */     //   296: aload_0
/*     */     //   297: getfield access : I
/*     */     //   300: sipush #4096
/*     */     //   303: iand
/*     */     //   304: ifeq -> 371
/*     */     //   307: aload_0
/*     */     //   308: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   311: getfield version : I
/*     */     //   314: ldc 65535
/*     */     //   316: iand
/*     */     //   317: bipush #49
/*     */     //   319: if_icmplt -> 346
/*     */     //   322: goto -> 329
/*     */     //   325: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   328: athrow
/*     */     //   329: aload_0
/*     */     //   330: getfield access : I
/*     */     //   333: ldc 262144
/*     */     //   335: iand
/*     */     //   336: ifeq -> 371
/*     */     //   339: goto -> 346
/*     */     //   342: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   345: athrow
/*     */     //   346: aload_1
/*     */     //   347: aload_0
/*     */     //   348: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   351: ldc 'Synthetic'
/*     */     //   353: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   356: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   359: iconst_0
/*     */     //   360: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   363: pop
/*     */     //   364: goto -> 371
/*     */     //   367: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   370: athrow
/*     */     //   371: aload_0
/*     */     //   372: getfield access : I
/*     */     //   375: ldc 131072
/*     */     //   377: iand
/*     */     //   378: ifeq -> 406
/*     */     //   381: aload_1
/*     */     //   382: aload_0
/*     */     //   383: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   386: ldc 'Deprecated'
/*     */     //   388: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   391: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   394: iconst_0
/*     */     //   395: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   398: pop
/*     */     //   399: goto -> 406
/*     */     //   402: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   405: athrow
/*     */     //   406: aload_0
/*     */     //   407: getfield signature : I
/*     */     //   410: ifeq -> 447
/*     */     //   413: aload_1
/*     */     //   414: aload_0
/*     */     //   415: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   418: ldc 'Signature'
/*     */     //   420: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   423: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   426: pop
/*     */     //   427: aload_1
/*     */     //   428: iconst_2
/*     */     //   429: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   432: aload_0
/*     */     //   433: getfield signature : I
/*     */     //   436: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   439: pop
/*     */     //   440: goto -> 447
/*     */     //   443: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   446: athrow
/*     */     //   447: aload_0
/*     */     //   448: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   451: ifnull -> 483
/*     */     //   454: aload_1
/*     */     //   455: aload_0
/*     */     //   456: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   459: ldc 'RuntimeVisibleAnnotations'
/*     */     //   461: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   464: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   467: pop
/*     */     //   468: aload_0
/*     */     //   469: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   472: aload_1
/*     */     //   473: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   476: goto -> 483
/*     */     //   479: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   482: athrow
/*     */     //   483: aload_0
/*     */     //   484: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   487: ifnull -> 519
/*     */     //   490: aload_1
/*     */     //   491: aload_0
/*     */     //   492: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   495: ldc 'RuntimeInvisibleAnnotations'
/*     */     //   497: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   500: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   503: pop
/*     */     //   504: aload_0
/*     */     //   505: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   508: aload_1
/*     */     //   509: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   512: goto -> 519
/*     */     //   515: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   518: athrow
/*     */     //   519: aload_0
/*     */     //   520: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   523: ifnull -> 555
/*     */     //   526: aload_1
/*     */     //   527: aload_0
/*     */     //   528: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   531: ldc 'RuntimeVisibleTypeAnnotations'
/*     */     //   533: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   536: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   539: pop
/*     */     //   540: aload_0
/*     */     //   541: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   544: aload_1
/*     */     //   545: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   548: goto -> 555
/*     */     //   551: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   554: athrow
/*     */     //   555: aload_0
/*     */     //   556: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   559: ifnull -> 591
/*     */     //   562: aload_1
/*     */     //   563: aload_0
/*     */     //   564: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   567: ldc 'RuntimeInvisibleTypeAnnotations'
/*     */     //   569: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   572: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   575: pop
/*     */     //   576: aload_0
/*     */     //   577: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   580: aload_1
/*     */     //   581: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   584: goto -> 591
/*     */     //   587: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   590: athrow
/*     */     //   591: aload_0
/*     */     //   592: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   595: ifnull -> 621
/*     */     //   598: aload_0
/*     */     //   599: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   602: aload_0
/*     */     //   603: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   606: aconst_null
/*     */     //   607: iconst_0
/*     */     //   608: iconst_m1
/*     */     //   609: iconst_m1
/*     */     //   610: aload_1
/*     */     //   611: invokevirtual put : (Lorg/spongepowered/asm/lib/ClassWriter;[BIIILorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   614: goto -> 621
/*     */     //   617: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   620: athrow
/*     */     //   621: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #34	-> 0
/*     */     //   #31	-> 3
/*     */     //   #75	-> 17
/*     */     //   #100	-> 44
/*     */     //   #62	-> 47
/*     */     //   #78	-> 54
/*     */     //   #84	-> 64
/*     */     //   #40	-> 75
/*     */     //   #32	-> 114
/*     */     //   #115	-> 124
/*     */     //   #81	-> 134
/*     */     //   #89	-> 144
/*     */     //   #53	-> 151
/*     */     //   #72	-> 161
/*     */     //   #50	-> 168
/*     */     //   #45	-> 178
/*     */     //   #69	-> 185
/*     */     //   #98	-> 195
/*     */     //   #23	-> 202
/*     */     //   #109	-> 212
/*     */     //   #26	-> 219
/*     */     //   #90	-> 229
/*     */     //   #79	-> 236
/*     */     //   #92	-> 248
/*     */     //   #49	-> 255
/*     */     //   #28	-> 262
/*     */     //   #65	-> 276
/*     */     //   #58	-> 296
/*     */     //   #85	-> 307
/*     */     //   #35	-> 346
/*     */     //   #47	-> 371
/*     */     //   #70	-> 381
/*     */     //   #48	-> 406
/*     */     //   #1	-> 413
/*     */     //   #21	-> 427
/*     */     //   #95	-> 447
/*     */     //   #46	-> 454
/*     */     //   #30	-> 468
/*     */     //   #39	-> 483
/*     */     //   #4	-> 490
/*     */     //   #87	-> 504
/*     */     //   #60	-> 519
/*     */     //   #22	-> 526
/*     */     //   #9	-> 540
/*     */     //   #110	-> 555
/*     */     //   #93	-> 562
/*     */     //   #77	-> 576
/*     */     //   #10	-> 591
/*     */     //   #91	-> 598
/*     */     //   #112	-> 621
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   47	57	60	java/lang/RuntimeException
/*     */     //   64	90	93	java/lang/RuntimeException
/*     */     //   75	107	110	java/lang/RuntimeException
/*     */     //   97	117	120	java/lang/RuntimeException
/*     */     //   124	137	140	java/lang/RuntimeException
/*     */     //   144	154	157	java/lang/RuntimeException
/*     */     //   161	171	174	java/lang/RuntimeException
/*     */     //   178	188	191	java/lang/RuntimeException
/*     */     //   195	205	208	java/lang/RuntimeException
/*     */     //   212	222	225	java/lang/RuntimeException
/*     */     //   248	289	292	java/lang/RuntimeException
/*     */     //   296	322	325	java/lang/RuntimeException
/*     */     //   307	339	342	java/lang/RuntimeException
/*     */     //   329	364	367	java/lang/RuntimeException
/*     */     //   371	399	402	java/lang/RuntimeException
/*     */     //   406	440	443	java/lang/RuntimeException
/*     */     //   447	476	479	java/lang/RuntimeException
/*     */     //   483	512	515	java/lang/RuntimeException
/*     */     //   519	548	551	java/lang/RuntimeException
/*     */     //   555	584	587	java/lang/RuntimeException
/*     */     //   591	614	617	java/lang/RuntimeException
/*     */   }
/*     */   
/*  42 */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { ByteVector byteVector = new ByteVector();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnnotationWriter.putTarget(paramInt, paramTypePath, byteVector);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, byteVector.length - 2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try { if (paramBoolean)
/* 113 */       { annotationWriter.next = this.tanns; this.tanns = annotationWriter; } else { annotationWriter.next = this.itanns; this.itanns = annotationWriter; }  } catch (RuntimeException runtimeException) { throw b(null); }
/* 114 */      return annotationWriter; } FieldWriter(ClassWriter paramClassWriter, int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) { super(327680); if (paramClassWriter.firstField == null) { paramClassWriter.firstField = this; }
/*     */     else { paramClassWriter.lastField.fv = this; }
/* 116 */      try { paramClassWriter.lastField = this; this.cw = paramClassWriter; this.access = paramInt; this.name = paramClassWriter.newUTF8(paramString1); this.desc = paramClassWriter.newUTF8(paramString2);
/*     */       if (paramString3 != null)
/*     */         this.signature = paramClassWriter.newUTF8(paramString3);  }
/*     */     catch (RuntimeException runtimeException)
/*     */     { throw b(null); }
/*     */     
/*     */     try {
/*     */       if (paramObject != null)
/*     */         this.value = (paramClassWriter.newConstItem(paramObject)).index; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     }  }
/*     */ 
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*     */     ByteVector byteVector = new ByteVector();
/*     */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*     */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, 2);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         annotationWriter.next = this.anns;
/*     */         this.anns = annotationWriter;
/*     */       } else {
/*     */         annotationWriter.next = this.ianns;
/*     */         this.ianns = annotationWriter;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return annotationWriter;
/*     */   }
/*     */   
/*     */   public void visitEnd() {}
/*     */   
/*     */   int getSize() {
/*     */     // Byte code:
/*     */     //   0: bipush #8
/*     */     //   2: istore_1
/*     */     //   3: aload_0
/*     */     //   4: getfield value : I
/*     */     //   7: ifeq -> 30
/*     */     //   10: aload_0
/*     */     //   11: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   14: ldc 'ConstantValue'
/*     */     //   16: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   19: pop
/*     */     //   20: iinc #1, 8
/*     */     //   23: goto -> 30
/*     */     //   26: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   29: athrow
/*     */     //   30: aload_0
/*     */     //   31: getfield access : I
/*     */     //   34: sipush #4096
/*     */     //   37: iand
/*     */     //   38: ifeq -> 100
/*     */     //   41: aload_0
/*     */     //   42: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   45: getfield version : I
/*     */     //   48: ldc 65535
/*     */     //   50: iand
/*     */     //   51: bipush #49
/*     */     //   53: if_icmplt -> 80
/*     */     //   56: goto -> 63
/*     */     //   59: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   62: athrow
/*     */     //   63: aload_0
/*     */     //   64: getfield access : I
/*     */     //   67: ldc 262144
/*     */     //   69: iand
/*     */     //   70: ifeq -> 100
/*     */     //   73: goto -> 80
/*     */     //   76: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   79: athrow
/*     */     //   80: aload_0
/*     */     //   81: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   84: ldc 'Synthetic'
/*     */     //   86: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   89: pop
/*     */     //   90: iinc #1, 6
/*     */     //   93: goto -> 100
/*     */     //   96: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   99: athrow
/*     */     //   100: aload_0
/*     */     //   101: getfield access : I
/*     */     //   104: ldc 131072
/*     */     //   106: iand
/*     */     //   107: ifeq -> 130
/*     */     //   110: aload_0
/*     */     //   111: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   114: ldc 'Deprecated'
/*     */     //   116: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   119: pop
/*     */     //   120: iinc #1, 6
/*     */     //   123: goto -> 130
/*     */     //   126: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   129: athrow
/*     */     //   130: aload_0
/*     */     //   131: getfield signature : I
/*     */     //   134: ifeq -> 157
/*     */     //   137: aload_0
/*     */     //   138: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   141: ldc 'Signature'
/*     */     //   143: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   146: pop
/*     */     //   147: iinc #1, 8
/*     */     //   150: goto -> 157
/*     */     //   153: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   156: athrow
/*     */     //   157: aload_0
/*     */     //   158: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   161: ifnull -> 187
/*     */     //   164: aload_0
/*     */     //   165: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   168: ldc 'RuntimeVisibleAnnotations'
/*     */     //   170: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   173: pop
/*     */     //   174: iload_1
/*     */     //   175: bipush #8
/*     */     //   177: aload_0
/*     */     //   178: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   181: invokevirtual getSize : ()I
/*     */     //   184: iadd
/*     */     //   185: iadd
/*     */     //   186: istore_1
/*     */     //   187: aload_0
/*     */     //   188: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   191: ifnull -> 217
/*     */     //   194: aload_0
/*     */     //   195: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   198: ldc 'RuntimeInvisibleAnnotations'
/*     */     //   200: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   203: pop
/*     */     //   204: iload_1
/*     */     //   205: bipush #8
/*     */     //   207: aload_0
/*     */     //   208: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   211: invokevirtual getSize : ()I
/*     */     //   214: iadd
/*     */     //   215: iadd
/*     */     //   216: istore_1
/*     */     //   217: aload_0
/*     */     //   218: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   221: ifnull -> 247
/*     */     //   224: aload_0
/*     */     //   225: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   228: ldc 'RuntimeVisibleTypeAnnotations'
/*     */     //   230: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   233: pop
/*     */     //   234: iload_1
/*     */     //   235: bipush #8
/*     */     //   237: aload_0
/*     */     //   238: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   241: invokevirtual getSize : ()I
/*     */     //   244: iadd
/*     */     //   245: iadd
/*     */     //   246: istore_1
/*     */     //   247: aload_0
/*     */     //   248: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   251: ifnull -> 277
/*     */     //   254: aload_0
/*     */     //   255: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   258: ldc 'RuntimeInvisibleTypeAnnotations'
/*     */     //   260: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   263: pop
/*     */     //   264: iload_1
/*     */     //   265: bipush #8
/*     */     //   267: aload_0
/*     */     //   268: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   271: invokevirtual getSize : ()I
/*     */     //   274: iadd
/*     */     //   275: iadd
/*     */     //   276: istore_1
/*     */     //   277: aload_0
/*     */     //   278: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   281: ifnull -> 302
/*     */     //   284: iload_1
/*     */     //   285: aload_0
/*     */     //   286: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   289: aload_0
/*     */     //   290: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*     */     //   293: aconst_null
/*     */     //   294: iconst_0
/*     */     //   295: iconst_m1
/*     */     //   296: iconst_m1
/*     */     //   297: invokevirtual getSize : (Lorg/spongepowered/asm/lib/ClassWriter;[BIII)I
/*     */     //   300: iadd
/*     */     //   301: istore_1
/*     */     //   302: iload_1
/*     */     //   303: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 0
/*     */     //   #13	-> 3
/*     */     //   #3	-> 10
/*     */     //   #108	-> 20
/*     */     //   #107	-> 30
/*     */     //   #59	-> 41
/*     */     //   #61	-> 80
/*     */     //   #16	-> 90
/*     */     //   #102	-> 100
/*     */     //   #73	-> 110
/*     */     //   #41	-> 120
/*     */     //   #86	-> 130
/*     */     //   #18	-> 137
/*     */     //   #74	-> 147
/*     */     //   #71	-> 157
/*     */     //   #88	-> 164
/*     */     //   #80	-> 174
/*     */     //   #5	-> 187
/*     */     //   #55	-> 194
/*     */     //   #64	-> 204
/*     */     //   #11	-> 217
/*     */     //   #97	-> 224
/*     */     //   #8	-> 234
/*     */     //   #2	-> 247
/*     */     //   #111	-> 254
/*     */     //   #105	-> 264
/*     */     //   #25	-> 277
/*     */     //   #83	-> 284
/*     */     //   #44	-> 302
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	23	26	java/lang/RuntimeException
/*     */     //   30	56	59	java/lang/RuntimeException
/*     */     //   41	73	76	java/lang/RuntimeException
/*     */     //   63	93	96	java/lang/RuntimeException
/*     */     //   100	123	126	java/lang/RuntimeException
/*     */     //   130	150	153	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\FieldWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */