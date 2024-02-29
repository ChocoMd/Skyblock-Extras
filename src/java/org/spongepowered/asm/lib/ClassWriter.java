/*     */ package org.spongepowered.asm.lib;public class ClassWriter extends ClassVisitor { boolean hasAsmInsns; private int compute; MethodWriter lastMethod; MethodWriter firstMethod; FieldWriter lastField; FieldWriter firstField; ByteVector bootstrapMethods; int bootstrapMethodsCount; private ByteVector innerClasses; private int innerClassesCount; private Attribute attrs; private AnnotationWriter itanns; private AnnotationWriter tanns; private AnnotationWriter ianns; private AnnotationWriter anns; private int enclosingMethod; private int enclosingMethodOwner; private ByteVector sourceDebug; private int sourceFile; private int[] interfaces; private int interfaceCount; private int superName; private int signature; String thisName; private int name; private int access; private short typeCount; Item[] typeTable;
/*     */   final Item key4;
/*     */   final Item key3;
/*     */   final Item key2;
/*     */   
/*     */   Item newInteger(int paramInt) {
/*   7 */     this.key.set(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 293 */     Item item = get(this.key);
/*     */     if (item == null) {
/*     */       this.pool.putByte(3).putInt(paramInt);
/*     */       item = new Item(this.index++, this.key);
/*     */       put(item);
/*     */     } 
/*     */     return item;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   final Item key = new Item();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   int threshold;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int newField(String paramString1, String paramString2, String paramString3) {
/*     */     return (newFieldItem(paramString1, paramString2, paramString3)).index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public byte[] toByteArray() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield index : I
/*     */     //   4: ldc 65535
/*     */     //   6: if_icmple -> 23
/*     */     //   9: new java/lang/RuntimeException
/*     */     //   12: dup
/*     */     //   13: ldc 'Class file too large!'
/*     */     //   15: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   18: athrow
/*     */     //   19: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   22: athrow
/*     */     //   23: bipush #24
/*     */     //   25: iconst_2
/*     */     //   26: aload_0
/*     */     //   27: getfield interfaceCount : I
/*     */     //   30: imul
/*     */     //   31: iadd
/*     */     //   32: istore_1
/*     */     //   33: iconst_0
/*     */     //   34: istore_2
/*     */     //   35: aload_0
/*     */     //   36: getfield firstField : Lorg/spongepowered/asm/lib/FieldWriter;
/*     */     //   39: astore_3
/*     */     //   40: aload_3
/*     */     //   41: ifnull -> 65
/*     */     //   44: iinc #2, 1
/*     */     //   47: iload_1
/*     */     //   48: aload_3
/*     */     //   49: invokevirtual getSize : ()I
/*     */     //   52: iadd
/*     */     //   53: istore_1
/*     */     //   54: aload_3
/*     */     //   55: getfield fv : Lorg/spongepowered/asm/lib/FieldVisitor;
/*     */     //   58: checkcast org/spongepowered/asm/lib/FieldWriter
/*     */     //   61: astore_3
/*     */     //   62: goto -> 40
/*     */     //   65: iconst_0
/*     */     //   66: istore #4
/*     */     //   68: aload_0
/*     */     //   69: getfield firstMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*     */     //   72: astore #5
/*     */     //   74: aload #5
/*     */     //   76: ifnull -> 103
/*     */     //   79: iinc #4, 1
/*     */     //   82: iload_1
/*     */     //   83: aload #5
/*     */     //   85: invokevirtual getSize : ()I
/*     */     //   88: iadd
/*     */     //   89: istore_1
/*     */     //   90: aload #5
/*     */     //   92: getfield mv : Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   95: checkcast org/spongepowered/asm/lib/MethodWriter
/*     */     //   98: astore #5
/*     */     //   100: goto -> 74
/*     */     //   103: iconst_0
/*     */     //   104: istore #6
/*     */     //   106: aload_0
/*     */     //   107: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   110: ifnull -> 136
/*     */     //   113: iinc #6, 1
/*     */     //   116: iload_1
/*     */     //   117: bipush #8
/*     */     //   119: aload_0
/*     */     //   120: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   123: getfield length : I
/*     */     //   126: iadd
/*     */     //   127: iadd
/*     */     //   128: istore_1
/*     */     //   129: aload_0
/*     */     //   130: ldc 'BootstrapMethods'
/*     */     //   132: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   135: pop
/*     */     //   136: aload_0
/*     */     //   137: getfield signature : I
/*     */     //   140: ifeq -> 163
/*     */     //   143: iinc #6, 1
/*     */     //   146: iinc #1, 8
/*     */     //   149: aload_0
/*     */     //   150: ldc 'Signature'
/*     */     //   152: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   155: pop
/*     */     //   156: goto -> 163
/*     */     //   159: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   162: athrow
/*     */     //   163: aload_0
/*     */     //   164: getfield sourceFile : I
/*     */     //   167: ifeq -> 190
/*     */     //   170: iinc #6, 1
/*     */     //   173: iinc #1, 8
/*     */     //   176: aload_0
/*     */     //   177: ldc 'SourceFile'
/*     */     //   179: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   182: pop
/*     */     //   183: goto -> 190
/*     */     //   186: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   189: athrow
/*     */     //   190: aload_0
/*     */     //   191: getfield sourceDebug : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   194: ifnull -> 220
/*     */     //   197: iinc #6, 1
/*     */     //   200: iload_1
/*     */     //   201: aload_0
/*     */     //   202: getfield sourceDebug : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   205: getfield length : I
/*     */     //   208: bipush #6
/*     */     //   210: iadd
/*     */     //   211: iadd
/*     */     //   212: istore_1
/*     */     //   213: aload_0
/*     */     //   214: ldc 'SourceDebugExtension'
/*     */     //   216: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   219: pop
/*     */     //   220: aload_0
/*     */     //   221: getfield enclosingMethodOwner : I
/*     */     //   224: ifeq -> 247
/*     */     //   227: iinc #6, 1
/*     */     //   230: iinc #1, 10
/*     */     //   233: aload_0
/*     */     //   234: ldc 'EnclosingMethod'
/*     */     //   236: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   239: pop
/*     */     //   240: goto -> 247
/*     */     //   243: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   246: athrow
/*     */     //   247: aload_0
/*     */     //   248: getfield access : I
/*     */     //   251: ldc 131072
/*     */     //   253: iand
/*     */     //   254: ifeq -> 277
/*     */     //   257: iinc #6, 1
/*     */     //   260: iinc #1, 6
/*     */     //   263: aload_0
/*     */     //   264: ldc 'Deprecated'
/*     */     //   266: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   269: pop
/*     */     //   270: goto -> 277
/*     */     //   273: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   276: athrow
/*     */     //   277: aload_0
/*     */     //   278: getfield access : I
/*     */     //   281: sipush #4096
/*     */     //   284: iand
/*     */     //   285: ifeq -> 344
/*     */     //   288: aload_0
/*     */     //   289: getfield version : I
/*     */     //   292: ldc 65535
/*     */     //   294: iand
/*     */     //   295: bipush #49
/*     */     //   297: if_icmplt -> 324
/*     */     //   300: goto -> 307
/*     */     //   303: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   306: athrow
/*     */     //   307: aload_0
/*     */     //   308: getfield access : I
/*     */     //   311: ldc 262144
/*     */     //   313: iand
/*     */     //   314: ifeq -> 344
/*     */     //   317: goto -> 324
/*     */     //   320: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   323: athrow
/*     */     //   324: iinc #6, 1
/*     */     //   327: iinc #1, 6
/*     */     //   330: aload_0
/*     */     //   331: ldc 'Synthetic'
/*     */     //   333: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   336: pop
/*     */     //   337: goto -> 344
/*     */     //   340: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   343: athrow
/*     */     //   344: aload_0
/*     */     //   345: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   348: ifnull -> 374
/*     */     //   351: iinc #6, 1
/*     */     //   354: iload_1
/*     */     //   355: bipush #8
/*     */     //   357: aload_0
/*     */     //   358: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   361: getfield length : I
/*     */     //   364: iadd
/*     */     //   365: iadd
/*     */     //   366: istore_1
/*     */     //   367: aload_0
/*     */     //   368: ldc 'InnerClasses'
/*     */     //   370: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   373: pop
/*     */     //   374: aload_0
/*     */     //   375: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   378: ifnull -> 404
/*     */     //   381: iinc #6, 1
/*     */     //   384: iload_1
/*     */     //   385: bipush #8
/*     */     //   387: aload_0
/*     */     //   388: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   391: invokevirtual getSize : ()I
/*     */     //   394: iadd
/*     */     //   395: iadd
/*     */     //   396: istore_1
/*     */     //   397: aload_0
/*     */     //   398: ldc 'RuntimeVisibleAnnotations'
/*     */     //   400: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   403: pop
/*     */     //   404: aload_0
/*     */     //   405: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   408: ifnull -> 434
/*     */     //   411: iinc #6, 1
/*     */     //   414: iload_1
/*     */     //   415: bipush #8
/*     */     //   417: aload_0
/*     */     //   418: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   421: invokevirtual getSize : ()I
/*     */     //   424: iadd
/*     */     //   425: iadd
/*     */     //   426: istore_1
/*     */     //   427: aload_0
/*     */     //   428: ldc 'RuntimeInvisibleAnnotations'
/*     */     //   430: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   433: pop
/*     */     //   434: aload_0
/*     */     //   435: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   438: ifnull -> 464
/*     */     //   441: iinc #6, 1
/*     */     //   444: iload_1
/*     */     //   445: bipush #8
/*     */     //   447: aload_0
/*     */     //   448: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   451: invokevirtual getSize : ()I
/*     */     //   454: iadd
/*     */     //   455: iadd
/*     */     //   456: istore_1
/*     */     //   457: aload_0
/*     */     //   458: ldc 'RuntimeVisibleTypeAnnotations'
/*     */     //   460: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   463: pop
/*     */     //   464: aload_0
/*     */     //   465: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   468: ifnull -> 494
/*     */     //   471: iinc #6, 1
/*     */     //   474: iload_1
/*     */     //   475: bipush #8
/*     */     //   477: aload_0
/*     */     //   478: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   481: invokevirtual getSize : ()I
/*     */     //   484: iadd
/*     */     //   485: iadd
/*     */     //   486: istore_1
/*     */     //   487: aload_0
/*     */     //   488: ldc 'RuntimeInvisibleTypeAnnotations'
/*     */     //   490: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   493: pop
/*     */     //   494: aload_0
/*     */     //   495: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   498: ifnull -> 528
/*     */     //   501: iload #6
/*     */     //   503: aload_0
/*     */     //   504: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   507: invokevirtual getCount : ()I
/*     */     //   510: iadd
/*     */     //   511: istore #6
/*     */     //   513: iload_1
/*     */     //   514: aload_0
/*     */     //   515: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   518: aload_0
/*     */     //   519: aconst_null
/*     */     //   520: iconst_0
/*     */     //   521: iconst_m1
/*     */     //   522: iconst_m1
/*     */     //   523: invokevirtual getSize : (Lorg/spongepowered/asm/lib/ClassWriter;[BIII)I
/*     */     //   526: iadd
/*     */     //   527: istore_1
/*     */     //   528: iload_1
/*     */     //   529: aload_0
/*     */     //   530: getfield pool : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   533: getfield length : I
/*     */     //   536: iadd
/*     */     //   537: istore_1
/*     */     //   538: new org/spongepowered/asm/lib/ByteVector
/*     */     //   541: dup
/*     */     //   542: iload_1
/*     */     //   543: invokespecial <init> : (I)V
/*     */     //   546: astore #7
/*     */     //   548: aload #7
/*     */     //   550: ldc -889275714
/*     */     //   552: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   555: aload_0
/*     */     //   556: getfield version : I
/*     */     //   559: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   562: pop
/*     */     //   563: aload #7
/*     */     //   565: aload_0
/*     */     //   566: getfield index : I
/*     */     //   569: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   572: aload_0
/*     */     //   573: getfield pool : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   576: getfield data : [B
/*     */     //   579: iconst_0
/*     */     //   580: aload_0
/*     */     //   581: getfield pool : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   584: getfield length : I
/*     */     //   587: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   590: pop
/*     */     //   591: ldc 393216
/*     */     //   593: aload_0
/*     */     //   594: getfield access : I
/*     */     //   597: ldc 262144
/*     */     //   599: iand
/*     */     //   600: bipush #64
/*     */     //   602: idiv
/*     */     //   603: ior
/*     */     //   604: istore #8
/*     */     //   606: aload #7
/*     */     //   608: aload_0
/*     */     //   609: getfield access : I
/*     */     //   612: iload #8
/*     */     //   614: iconst_m1
/*     */     //   615: ixor
/*     */     //   616: iand
/*     */     //   617: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   620: aload_0
/*     */     //   621: getfield name : I
/*     */     //   624: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   627: aload_0
/*     */     //   628: getfield superName : I
/*     */     //   631: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   634: pop
/*     */     //   635: aload #7
/*     */     //   637: aload_0
/*     */     //   638: getfield interfaceCount : I
/*     */     //   641: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   644: pop
/*     */     //   645: iconst_0
/*     */     //   646: istore #9
/*     */     //   648: iload #9
/*     */     //   650: aload_0
/*     */     //   651: getfield interfaceCount : I
/*     */     //   654: if_icmpge -> 680
/*     */     //   657: aload #7
/*     */     //   659: aload_0
/*     */     //   660: getfield interfaces : [I
/*     */     //   663: iload #9
/*     */     //   665: iaload
/*     */     //   666: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   669: pop
/*     */     //   670: iinc #9, 1
/*     */     //   673: goto -> 648
/*     */     //   676: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   679: athrow
/*     */     //   680: aload #7
/*     */     //   682: iload_2
/*     */     //   683: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   686: pop
/*     */     //   687: aload_0
/*     */     //   688: getfield firstField : Lorg/spongepowered/asm/lib/FieldWriter;
/*     */     //   691: astore_3
/*     */     //   692: aload_3
/*     */     //   693: ifnull -> 713
/*     */     //   696: aload_3
/*     */     //   697: aload #7
/*     */     //   699: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   702: aload_3
/*     */     //   703: getfield fv : Lorg/spongepowered/asm/lib/FieldVisitor;
/*     */     //   706: checkcast org/spongepowered/asm/lib/FieldWriter
/*     */     //   709: astore_3
/*     */     //   710: goto -> 692
/*     */     //   713: aload #7
/*     */     //   715: iload #4
/*     */     //   717: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   720: pop
/*     */     //   721: aload_0
/*     */     //   722: getfield firstMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*     */     //   725: astore #5
/*     */     //   727: aload #5
/*     */     //   729: ifnull -> 752
/*     */     //   732: aload #5
/*     */     //   734: aload #7
/*     */     //   736: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   739: aload #5
/*     */     //   741: getfield mv : Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   744: checkcast org/spongepowered/asm/lib/MethodWriter
/*     */     //   747: astore #5
/*     */     //   749: goto -> 727
/*     */     //   752: aload #7
/*     */     //   754: iload #6
/*     */     //   756: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   759: pop
/*     */     //   760: aload_0
/*     */     //   761: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   764: ifnull -> 829
/*     */     //   767: aload #7
/*     */     //   769: aload_0
/*     */     //   770: ldc 'BootstrapMethods'
/*     */     //   772: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   775: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   778: pop
/*     */     //   779: aload #7
/*     */     //   781: aload_0
/*     */     //   782: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   785: getfield length : I
/*     */     //   788: iconst_2
/*     */     //   789: iadd
/*     */     //   790: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   793: aload_0
/*     */     //   794: getfield bootstrapMethodsCount : I
/*     */     //   797: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   800: pop
/*     */     //   801: aload #7
/*     */     //   803: aload_0
/*     */     //   804: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   807: getfield data : [B
/*     */     //   810: iconst_0
/*     */     //   811: aload_0
/*     */     //   812: getfield bootstrapMethods : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   815: getfield length : I
/*     */     //   818: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   821: pop
/*     */     //   822: goto -> 829
/*     */     //   825: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   828: athrow
/*     */     //   829: aload_0
/*     */     //   830: getfield signature : I
/*     */     //   833: ifeq -> 866
/*     */     //   836: aload #7
/*     */     //   838: aload_0
/*     */     //   839: ldc 'Signature'
/*     */     //   841: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   844: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   847: iconst_2
/*     */     //   848: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   851: aload_0
/*     */     //   852: getfield signature : I
/*     */     //   855: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   858: pop
/*     */     //   859: goto -> 866
/*     */     //   862: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   865: athrow
/*     */     //   866: aload_0
/*     */     //   867: getfield sourceFile : I
/*     */     //   870: ifeq -> 903
/*     */     //   873: aload #7
/*     */     //   875: aload_0
/*     */     //   876: ldc 'SourceFile'
/*     */     //   878: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   881: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   884: iconst_2
/*     */     //   885: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   888: aload_0
/*     */     //   889: getfield sourceFile : I
/*     */     //   892: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   895: pop
/*     */     //   896: goto -> 903
/*     */     //   899: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   902: athrow
/*     */     //   903: aload_0
/*     */     //   904: getfield sourceDebug : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   907: ifnull -> 952
/*     */     //   910: aload_0
/*     */     //   911: getfield sourceDebug : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   914: getfield length : I
/*     */     //   917: istore #9
/*     */     //   919: aload #7
/*     */     //   921: aload_0
/*     */     //   922: ldc 'SourceDebugExtension'
/*     */     //   924: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   927: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   930: iload #9
/*     */     //   932: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   935: pop
/*     */     //   936: aload #7
/*     */     //   938: aload_0
/*     */     //   939: getfield sourceDebug : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   942: getfield data : [B
/*     */     //   945: iconst_0
/*     */     //   946: iload #9
/*     */     //   948: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   951: pop
/*     */     //   952: aload_0
/*     */     //   953: getfield enclosingMethodOwner : I
/*     */     //   956: ifeq -> 999
/*     */     //   959: aload #7
/*     */     //   961: aload_0
/*     */     //   962: ldc 'EnclosingMethod'
/*     */     //   964: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   967: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   970: iconst_4
/*     */     //   971: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   974: pop
/*     */     //   975: aload #7
/*     */     //   977: aload_0
/*     */     //   978: getfield enclosingMethodOwner : I
/*     */     //   981: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   984: aload_0
/*     */     //   985: getfield enclosingMethod : I
/*     */     //   988: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   991: pop
/*     */     //   992: goto -> 999
/*     */     //   995: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   998: athrow
/*     */     //   999: aload_0
/*     */     //   1000: getfield access : I
/*     */     //   1003: ldc 131072
/*     */     //   1005: iand
/*     */     //   1006: ifeq -> 1032
/*     */     //   1009: aload #7
/*     */     //   1011: aload_0
/*     */     //   1012: ldc 'Deprecated'
/*     */     //   1014: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1017: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1020: iconst_0
/*     */     //   1021: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1024: pop
/*     */     //   1025: goto -> 1032
/*     */     //   1028: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1031: athrow
/*     */     //   1032: aload_0
/*     */     //   1033: getfield access : I
/*     */     //   1036: sipush #4096
/*     */     //   1039: iand
/*     */     //   1040: ifeq -> 1102
/*     */     //   1043: aload_0
/*     */     //   1044: getfield version : I
/*     */     //   1047: ldc 65535
/*     */     //   1049: iand
/*     */     //   1050: bipush #49
/*     */     //   1052: if_icmplt -> 1079
/*     */     //   1055: goto -> 1062
/*     */     //   1058: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1061: athrow
/*     */     //   1062: aload_0
/*     */     //   1063: getfield access : I
/*     */     //   1066: ldc 262144
/*     */     //   1068: iand
/*     */     //   1069: ifeq -> 1102
/*     */     //   1072: goto -> 1079
/*     */     //   1075: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1078: athrow
/*     */     //   1079: aload #7
/*     */     //   1081: aload_0
/*     */     //   1082: ldc 'Synthetic'
/*     */     //   1084: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1087: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1090: iconst_0
/*     */     //   1091: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1094: pop
/*     */     //   1095: goto -> 1102
/*     */     //   1098: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1101: athrow
/*     */     //   1102: aload_0
/*     */     //   1103: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1106: ifnull -> 1171
/*     */     //   1109: aload #7
/*     */     //   1111: aload_0
/*     */     //   1112: ldc 'InnerClasses'
/*     */     //   1114: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1117: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1120: pop
/*     */     //   1121: aload #7
/*     */     //   1123: aload_0
/*     */     //   1124: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1127: getfield length : I
/*     */     //   1130: iconst_2
/*     */     //   1131: iadd
/*     */     //   1132: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1135: aload_0
/*     */     //   1136: getfield innerClassesCount : I
/*     */     //   1139: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1142: pop
/*     */     //   1143: aload #7
/*     */     //   1145: aload_0
/*     */     //   1146: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1149: getfield data : [B
/*     */     //   1152: iconst_0
/*     */     //   1153: aload_0
/*     */     //   1154: getfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1157: getfield length : I
/*     */     //   1160: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1163: pop
/*     */     //   1164: goto -> 1171
/*     */     //   1167: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1170: athrow
/*     */     //   1171: aload_0
/*     */     //   1172: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1175: ifnull -> 1206
/*     */     //   1178: aload #7
/*     */     //   1180: aload_0
/*     */     //   1181: ldc 'RuntimeVisibleAnnotations'
/*     */     //   1183: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1186: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1189: pop
/*     */     //   1190: aload_0
/*     */     //   1191: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1194: aload #7
/*     */     //   1196: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   1199: goto -> 1206
/*     */     //   1202: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1205: athrow
/*     */     //   1206: aload_0
/*     */     //   1207: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1210: ifnull -> 1241
/*     */     //   1213: aload #7
/*     */     //   1215: aload_0
/*     */     //   1216: ldc 'RuntimeInvisibleAnnotations'
/*     */     //   1218: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1221: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1224: pop
/*     */     //   1225: aload_0
/*     */     //   1226: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1229: aload #7
/*     */     //   1231: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   1234: goto -> 1241
/*     */     //   1237: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1240: athrow
/*     */     //   1241: aload_0
/*     */     //   1242: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1245: ifnull -> 1276
/*     */     //   1248: aload #7
/*     */     //   1250: aload_0
/*     */     //   1251: ldc 'RuntimeVisibleTypeAnnotations'
/*     */     //   1253: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1256: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1259: pop
/*     */     //   1260: aload_0
/*     */     //   1261: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1264: aload #7
/*     */     //   1266: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   1269: goto -> 1276
/*     */     //   1272: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1275: athrow
/*     */     //   1276: aload_0
/*     */     //   1277: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1280: ifnull -> 1311
/*     */     //   1283: aload #7
/*     */     //   1285: aload_0
/*     */     //   1286: ldc 'RuntimeInvisibleTypeAnnotations'
/*     */     //   1288: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*     */     //   1291: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1294: pop
/*     */     //   1295: aload_0
/*     */     //   1296: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1299: aload #7
/*     */     //   1301: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   1304: goto -> 1311
/*     */     //   1307: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1310: athrow
/*     */     //   1311: aload_0
/*     */     //   1312: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   1315: ifnull -> 1339
/*     */     //   1318: aload_0
/*     */     //   1319: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   1322: aload_0
/*     */     //   1323: aconst_null
/*     */     //   1324: iconst_0
/*     */     //   1325: iconst_m1
/*     */     //   1326: iconst_m1
/*     */     //   1327: aload #7
/*     */     //   1329: invokevirtual put : (Lorg/spongepowered/asm/lib/ClassWriter;[BIIILorg/spongepowered/asm/lib/ByteVector;)V
/*     */     //   1332: goto -> 1339
/*     */     //   1335: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1338: athrow
/*     */     //   1339: aload_0
/*     */     //   1340: getfield hasAsmInsns : Z
/*     */     //   1343: ifeq -> 1429
/*     */     //   1346: aload_0
/*     */     //   1347: aconst_null
/*     */     //   1348: putfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1351: aload_0
/*     */     //   1352: aconst_null
/*     */     //   1353: putfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*     */     //   1356: aload_0
/*     */     //   1357: aconst_null
/*     */     //   1358: putfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*     */     //   1361: aload_0
/*     */     //   1362: iconst_0
/*     */     //   1363: putfield innerClassesCount : I
/*     */     //   1366: aload_0
/*     */     //   1367: aconst_null
/*     */     //   1368: putfield innerClasses : Lorg/spongepowered/asm/lib/ByteVector;
/*     */     //   1371: aload_0
/*     */     //   1372: aconst_null
/*     */     //   1373: putfield firstField : Lorg/spongepowered/asm/lib/FieldWriter;
/*     */     //   1376: aload_0
/*     */     //   1377: aconst_null
/*     */     //   1378: putfield lastField : Lorg/spongepowered/asm/lib/FieldWriter;
/*     */     //   1381: aload_0
/*     */     //   1382: aconst_null
/*     */     //   1383: putfield firstMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*     */     //   1386: aload_0
/*     */     //   1387: aconst_null
/*     */     //   1388: putfield lastMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*     */     //   1391: aload_0
/*     */     //   1392: iconst_1
/*     */     //   1393: putfield compute : I
/*     */     //   1396: aload_0
/*     */     //   1397: iconst_0
/*     */     //   1398: putfield hasAsmInsns : Z
/*     */     //   1401: new org/spongepowered/asm/lib/ClassReader
/*     */     //   1404: dup
/*     */     //   1405: aload #7
/*     */     //   1407: getfield data : [B
/*     */     //   1410: invokespecial <init> : ([B)V
/*     */     //   1413: aload_0
/*     */     //   1414: sipush #264
/*     */     //   1417: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;I)V
/*     */     //   1420: aload_0
/*     */     //   1421: invokevirtual toByteArray : ()[B
/*     */     //   1424: areturn
/*     */     //   1425: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1428: athrow
/*     */     //   1429: aload #7
/*     */     //   1431: getfield data : [B
/*     */     //   1434: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #16	-> 0
/*     */     //   #376	-> 9
/*     */     //   #42	-> 23
/*     */     //   #99	-> 33
/*     */     //   #476	-> 35
/*     */     //   #109	-> 40
/*     */     //   #291	-> 44
/*     */     //   #368	-> 47
/*     */     //   #138	-> 54
/*     */     //   #471	-> 65
/*     */     //   #173	-> 68
/*     */     //   #118	-> 74
/*     */     //   #389	-> 79
/*     */     //   #40	-> 82
/*     */     //   #245	-> 90
/*     */     //   #116	-> 103
/*     */     //   #465	-> 106
/*     */     //   #3	-> 113
/*     */     //   #160	-> 116
/*     */     //   #438	-> 129
/*     */     //   #345	-> 136
/*     */     //   #407	-> 143
/*     */     //   #182	-> 146
/*     */     //   #391	-> 149
/*     */     //   #148	-> 163
/*     */     //   #75	-> 170
/*     */     //   #149	-> 173
/*     */     //   #27	-> 176
/*     */     //   #196	-> 190
/*     */     //   #6	-> 197
/*     */     //   #323	-> 200
/*     */     //   #425	-> 213
/*     */     //   #289	-> 220
/*     */     //   #93	-> 227
/*     */     //   #458	-> 230
/*     */     //   #202	-> 233
/*     */     //   #238	-> 247
/*     */     //   #273	-> 257
/*     */     //   #180	-> 260
/*     */     //   #14	-> 263
/*     */     //   #229	-> 277
/*     */     //   #285	-> 288
/*     */     //   #301	-> 324
/*     */     //   #77	-> 327
/*     */     //   #276	-> 330
/*     */     //   #388	-> 344
/*     */     //   #206	-> 351
/*     */     //   #26	-> 354
/*     */     //   #426	-> 367
/*     */     //   #331	-> 374
/*     */     //   #39	-> 381
/*     */     //   #400	-> 384
/*     */     //   #218	-> 397
/*     */     //   #473	-> 404
/*     */     //   #17	-> 411
/*     */     //   #482	-> 414
/*     */     //   #134	-> 427
/*     */     //   #335	-> 434
/*     */     //   #418	-> 441
/*     */     //   #212	-> 444
/*     */     //   #97	-> 457
/*     */     //   #358	-> 464
/*     */     //   #193	-> 471
/*     */     //   #375	-> 474
/*     */     //   #37	-> 487
/*     */     //   #191	-> 494
/*     */     //   #254	-> 501
/*     */     //   #346	-> 513
/*     */     //   #146	-> 528
/*     */     //   #278	-> 538
/*     */     //   #31	-> 548
/*     */     //   #1	-> 563
/*     */     //   #348	-> 591
/*     */     //   #147	-> 606
/*     */     //   #251	-> 635
/*     */     //   #187	-> 645
/*     */     //   #219	-> 657
/*     */     //   #263	-> 670
/*     */     //   #352	-> 680
/*     */     //   #437	-> 687
/*     */     //   #299	-> 692
/*     */     //   #451	-> 696
/*     */     //   #304	-> 702
/*     */     //   #117	-> 713
/*     */     //   #288	-> 721
/*     */     //   #203	-> 727
/*     */     //   #466	-> 732
/*     */     //   #82	-> 739
/*     */     //   #226	-> 752
/*     */     //   #280	-> 760
/*     */     //   #464	-> 767
/*     */     //   #423	-> 779
/*     */     //   #344	-> 801
/*     */     //   #413	-> 829
/*     */     //   #422	-> 836
/*     */     //   #52	-> 866
/*     */     //   #303	-> 873
/*     */     //   #176	-> 903
/*     */     //   #85	-> 910
/*     */     //   #70	-> 919
/*     */     //   #21	-> 936
/*     */     //   #35	-> 952
/*     */     //   #165	-> 959
/*     */     //   #394	-> 975
/*     */     //   #92	-> 999
/*     */     //   #343	-> 1009
/*     */     //   #316	-> 1032
/*     */     //   #112	-> 1043
/*     */     //   #174	-> 1079
/*     */     //   #64	-> 1102
/*     */     //   #467	-> 1109
/*     */     //   #378	-> 1121
/*     */     //   #230	-> 1143
/*     */     //   #272	-> 1171
/*     */     //   #90	-> 1178
/*     */     //   #296	-> 1190
/*     */     //   #106	-> 1206
/*     */     //   #15	-> 1213
/*     */     //   #222	-> 1225
/*     */     //   #58	-> 1241
/*     */     //   #302	-> 1248
/*     */     //   #362	-> 1260
/*     */     //   #130	-> 1276
/*     */     //   #460	-> 1283
/*     */     //   #135	-> 1295
/*     */     //   #292	-> 1311
/*     */     //   #360	-> 1318
/*     */     //   #189	-> 1339
/*     */     //   #470	-> 1346
/*     */     //   #215	-> 1351
/*     */     //   #450	-> 1356
/*     */     //   #448	-> 1361
/*     */     //   #244	-> 1366
/*     */     //   #330	-> 1371
/*     */     //   #122	-> 1376
/*     */     //   #361	-> 1381
/*     */     //   #34	-> 1386
/*     */     //   #309	-> 1391
/*     */     //   #142	-> 1396
/*     */     //   #124	-> 1401
/*     */     //   #161	-> 1420
/*     */     //   #48	-> 1429
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	19	19	java/lang/RuntimeException
/*     */     //   136	156	159	java/lang/RuntimeException
/*     */     //   163	183	186	java/lang/RuntimeException
/*     */     //   220	240	243	java/lang/RuntimeException
/*     */     //   247	270	273	java/lang/RuntimeException
/*     */     //   277	300	303	java/lang/RuntimeException
/*     */     //   288	317	320	java/lang/RuntimeException
/*     */     //   307	337	340	java/lang/RuntimeException
/*     */     //   648	676	676	java/lang/RuntimeException
/*     */     //   752	822	825	java/lang/RuntimeException
/*     */     //   829	859	862	java/lang/RuntimeException
/*     */     //   866	896	899	java/lang/RuntimeException
/*     */     //   952	992	995	java/lang/RuntimeException
/*     */     //   999	1025	1028	java/lang/RuntimeException
/*     */     //   1032	1055	1058	java/lang/RuntimeException
/*     */     //   1043	1072	1075	java/lang/RuntimeException
/*     */     //   1062	1095	1098	java/lang/RuntimeException
/*     */     //   1102	1164	1167	java/lang/RuntimeException
/*     */     //   1171	1199	1202	java/lang/RuntimeException
/*     */     //   1206	1234	1237	java/lang/RuntimeException
/*     */     //   1241	1269	1272	java/lang/RuntimeException
/*     */     //   1276	1304	1307	java/lang/RuntimeException
/*     */     //   1311	1332	1335	java/lang/RuntimeException
/*     */     //   1339	1425	1425	java/lang/RuntimeException
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int newConst(Object paramObject) {
/*     */     return (newConstItem(paramObject)).index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int newMethodType(String paramString) {
/*     */     return (newMethodTypeItem(paramString)).index;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void visitAttribute(Attribute paramAttribute) {
/*     */     paramAttribute.next = this.attrs;
/*     */     this.attrs = paramAttribute;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*     */     
/*     */     try { if (this.innerClasses == null)
/* 455 */         this.innerClasses = new ByteVector();  } catch (RuntimeException runtimeException) { throw b(null); }
/*     */      Item item = newClassItem(paramString1); try { if (item.intVal == 0) { try { this.innerClassesCount++; this.innerClasses.putShort(item.index); }
/*     */         catch (RuntimeException runtimeException) { throw b(null); }
/*     */          try { this.innerClasses.putShort((paramString2 == null) ? 0 : newClass(paramString2)); }
/*     */         catch (RuntimeException runtimeException) { throw b(null); }
/*     */          }
/*     */        }
/*     */     catch (RuntimeException runtimeException) { throw b(null); }
/*     */   
/*     */   } private void put(Item paramItem) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield index : I
/*     */     //   4: aload_0
/*     */     //   5: getfield typeCount : S
/*     */     //   8: iadd
/*     */     //   9: aload_0
/*     */     //   10: getfield threshold : I
/*     */     //   13: if_icmple -> 123
/*     */     //   16: aload_0
/*     */     //   17: getfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   20: arraylength
/*     */     //   21: istore_2
/*     */     //   22: iload_2
/*     */     //   23: iconst_2
/*     */     //   24: imul
/*     */     //   25: iconst_1
/*     */     //   26: iadd
/*     */     //   27: istore_3
/*     */     //   28: iload_3
/*     */     //   29: anewarray org/spongepowered/asm/lib/Item
/*     */     //   32: astore #4
/*     */     //   34: iload_2
/*     */     //   35: iconst_1
/*     */     //   36: isub
/*     */     //   37: istore #5
/*     */     //   39: iload #5
/*     */     //   41: iflt -> 106
/*     */     //   44: aload_0
/*     */     //   45: getfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   48: iload #5
/*     */     //   50: aaload
/*     */     //   51: astore #6
/*     */     //   53: aload #6
/*     */     //   55: ifnull -> 100
/*     */     //   58: aload #6
/*     */     //   60: getfield hashCode : I
/*     */     //   63: aload #4
/*     */     //   65: arraylength
/*     */     //   66: irem
/*     */     //   67: istore #7
/*     */     //   69: aload #6
/*     */     //   71: getfield next : Lorg/spongepowered/asm/lib/Item;
/*     */     //   74: astore #8
/*     */     //   76: aload #6
/*     */     //   78: aload #4
/*     */     //   80: iload #7
/*     */     //   82: aaload
/*     */     //   83: putfield next : Lorg/spongepowered/asm/lib/Item;
/*     */     //   86: aload #4
/*     */     //   88: iload #7
/*     */     //   90: aload #6
/*     */     //   92: aastore
/*     */     //   93: aload #8
/*     */     //   95: astore #6
/*     */     //   97: goto -> 53
/*     */     //   100: iinc #5, -1
/*     */     //   103: goto -> 39
/*     */     //   106: aload_0
/*     */     //   107: aload #4
/*     */     //   109: putfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   112: aload_0
/*     */     //   113: iload_3
/*     */     //   114: i2d
/*     */     //   115: ldc2_w 0.75
/*     */     //   118: dmul
/*     */     //   119: d2i
/*     */     //   120: putfield threshold : I
/*     */     //   123: aload_1
/*     */     //   124: getfield hashCode : I
/*     */     //   127: aload_0
/*     */     //   128: getfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   131: arraylength
/*     */     //   132: irem
/*     */     //   133: istore_2
/*     */     //   134: aload_1
/*     */     //   135: aload_0
/*     */     //   136: getfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   139: iload_2
/*     */     //   140: aaload
/*     */     //   141: putfield next : Lorg/spongepowered/asm/lib/Item;
/*     */     //   144: aload_0
/*     */     //   145: getfield items : [Lorg/spongepowered/asm/lib/Item;
/*     */     //   148: iload_2
/*     */     //   149: aload_1
/*     */     //   150: aastore
/*     */     //   151: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 0
/*     */     //   #434	-> 16
/*     */     //   #382	-> 22
/*     */     //   #63	-> 28
/*     */     //   #73	-> 34
/*     */     //   #154	-> 44
/*     */     //   #415	-> 53
/*     */     //   #153	-> 58
/*     */     //   #257	-> 69
/*     */     //   #45	-> 76
/*     */     //   #183	-> 86
/*     */     //   #170	-> 93
/*     */     //   #78	-> 97
/*     */     //   #483	-> 100
/*     */     //   #354	-> 106
/*     */     //   #367	-> 112
/*     */     //   #454	-> 123
/*     */     //   #297	-> 134
/*     */     //   #369	-> 144
/*     */     //   #241	-> 151 } public final AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { ByteVector byteVector = new ByteVector(); AnnotationWriter.putTarget(paramInt, paramTypePath, byteVector); byteVector.putShort(newUTF8(paramString)).putShort(0); AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, byteVector.length - 2); try { if (paramBoolean) { annotationWriter.next = this.tanns; this.tanns = annotationWriter; }
/*     */        }
/*     */     catch (RuntimeException runtimeException) { throw b(null); }
/*     */      annotationWriter.next = this.itanns; this.itanns = annotationWriter; return annotationWriter; } Item[] items = new Item[256]; final ByteVector pool; int index; int version; ClassReader cr; static final int BSM = 33; static final int TYPE_MERGED = 32; static final int TYPE_UNINIT = 31; static final int TYPE_NORMAL = 30; static final int HANDLE_BASE = 20; static final int INDY = 18; static final int HANDLE = 15; static final int MTYPE = 16; static final int UTF8 = 1; static final int NAME_TYPE = 12; static final int DOUBLE = 6; static final int LONG = 5; static final int FLOAT = 4; static final int INT = 3; static final int STR = 8; static final int IMETH = 11; static final int METH = 10; static final int FIELD = 9; static final int CLASS = 7; static final byte[] TYPE; static final int F_INSERT = 256; static final int ASM_LABEL_INSN = 18; static final int WIDE_INSN = 17; static final int MANA_INSN = 16; static final int LOOK_INSN = 15; static final int TABL_INSN = 14; static final int IINC_INSN = 13; static final int LDCW_INSN = 12; static final int LDC_INSN = 11; static final int LABELW_INSN = 10; static final int LABEL_INSN = 9; static final int INDYMETH_INSN = 8; static final int ITFMETH_INSN = 7; static final int FIELDORMETH_INSN = 6; static final int TYPE_INSN = 5; static final int IMPLVAR_INSN = 4; static final int VAR_INSN = 3; static final int SHORT_INSN = 2; static final int SBYTE_INSN = 1; static final int NOARG_INSN = 0; static final int TO_ACC_SYNTHETIC = 64; static final int ACC_SYNTHETIC_ATTRIBUTE = 262144; public static final int COMPUTE_FRAMES = 2; public static final int COMPUTE_MAXS = 1;
/* 468 */   int getMergedType(int paramInt1, int paramInt2) { this.key2.type = 32; this.key2.longVal = paramInt1 | paramInt2 << 32L; this.key2.hashCode = Integer.MAX_VALUE & 32 + paramInt1 + paramInt2; Item item = get(this.key2); if (item == null) { String str1 = (this.typeTable[paramInt1]).strVal1; String str2 = (this.typeTable[paramInt2]).strVal1; this.key2.intVal = addType(getCommonSuperClass(str1, str2)); item = new Item(0, this.key2); put(item); }  return item.intVal; } public final void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { try { this.version = paramInt1; this.access = paramInt2; this.name = newClass(paramString1); this.thisName = paramString1; if (paramString2 != null) this.signature = newUTF8(paramString2);  } catch (RuntimeException runtimeException) { throw b(null); }  try {  } catch (RuntimeException runtimeException) { throw b(null); }  try { this.superName = (paramString3 == null) ? 0 : newClass(paramString3); if (paramArrayOfString != null && paramArrayOfString.length > 0) { this.interfaceCount = paramArrayOfString.length; this.interfaces = new int[this.interfaceCount]; byte b = 0; try { while (b < this.interfaceCount) { this.interfaces[b] = newClass(paramArrayOfString[b]); b++; }  } catch (RuntimeException runtimeException) { throw b(null); }  }  } catch (RuntimeException runtimeException) { throw b(null); }  } public int newUTF8(String paramString) { this.key.set(1, paramString, null, null); Item item = get(this.key); if (item == null) { this.pool.putByte(1).putUTF8(paramString); item = new Item(this.index++, this.key); put(item); }  return item.index; }
/*     */   public ClassWriter(ClassReader paramClassReader, int paramInt) { this(paramInt); paramClassReader.copyPool(this); this.cr = paramClassReader; }
/*     */   int addUninitializedType(String paramString, int paramInt) { this.key.type = 31; this.key.intVal = paramInt; this.key.strVal1 = paramString; this.key.hashCode = Integer.MAX_VALUE & 31 + paramString.hashCode() + paramInt; Item item = get(this.key); if (item == null) item = addType(this.key);  return item.index; }
/*     */   public int newInvokeDynamic(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) { return (newInvokeDynamicItem(paramString1, paramString2, paramHandle, paramVarArgs)).index; }
/* 472 */   Item newConstItem(Object paramObject) { if (paramObject instanceof Integer) { int i = ((Integer)paramObject).intValue(); return newInteger(i); }  if (paramObject instanceof Byte) { int i = ((Byte)paramObject).intValue(); return newInteger(i); }  if (paramObject instanceof Character) { char c = ((Character)paramObject).charValue(); return newInteger(c); }  if (paramObject instanceof Short) { int i = ((Short)paramObject).intValue(); return newInteger(i); }  try { if (paramObject instanceof Boolean) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  boolean bool = ((Boolean)paramObject).booleanValue() ? true : false; return newInteger(bool); }  } catch (RuntimeException runtimeException) { throw b(null); }  if (paramObject instanceof Float) { float f = ((Float)paramObject).floatValue(); return newFloat(f); }  if (paramObject instanceof Long) { long l = ((Long)paramObject).longValue(); return newLong(l); }  if (paramObject instanceof Double) { double d = ((Double)paramObject).doubleValue(); return newDouble(d); }  try { if (paramObject instanceof String) return newString((String)paramObject);  } catch (RuntimeException runtimeException) { throw b(null); }  if (paramObject instanceof Type) { Type type = (Type)paramObject; int i = type.getSort(); }  if (paramObject instanceof Handle) { Handle handle = (Handle)paramObject; return newHandleItem(handle.tag, handle.owner, handle.name, handle.desc, handle.itf); }  throw new IllegalArgumentException("value " + paramObject); }
/*     */   Item newLong(long paramLong) { this.key.set(paramLong); Item item = get(this.key); if (item == null) { this.pool.putByte(5).putLong(paramLong); item = new Item(this.index, this.key); this.index += 2; put(item); }  return item; }
/*     */   public int newMethod(String paramString1, String paramString2, String paramString3, boolean paramBoolean) { return (newMethodItem(paramString1, paramString2, paramString3, paramBoolean)).index; }
/*     */   Item newNameTypeItem(String paramString1, String paramString2) { this.key2.set(12, paramString1, paramString2, null); Item item = get(this.key2); if (item == null) { put122(12, newUTF8(paramString1), newUTF8(paramString2)); item = new Item(this.index++, this.key2); put(item); }  return item; }
/*     */   int addType(String paramString) { this.key.set(30, paramString, null, null); Item item = get(this.key); if (item == null) item = addType(this.key);  return item.index; }
/*     */   protected String getCommonSuperClass(String paramString1, String paramString2) { Class<?> clazz1, clazz2; ClassLoader classLoader = getClass().getClassLoader(); try { clazz1 = Class.forName(paramString1.replace('/', '.'), false, classLoader); clazz2 = Class.forName(paramString2.replace('/', '.'), false, classLoader); } catch (Exception exception) { throw new RuntimeException(exception.toString()); }  try { if (clazz1.isAssignableFrom(clazz2)) return paramString1;  } catch (Exception exception) { throw b(null); }  try { if (clazz2.isAssignableFrom(clazz1)) return paramString2;  } catch (Exception exception) { throw b(null); }  try { if (!clazz1.isInterface()) try { if (!clazz2.isInterface()) while (true) { clazz1 = clazz1.getSuperclass(); if (clazz1.isAssignableFrom(clazz2)) return clazz1.getName().replace('.', '/');  }   return "java/lang/Object"; } catch (Exception exception) { throw b(null); }   } catch (Exception exception) { throw b(null); }  return "java/lang/Object"; }
/*     */   Item newMethodTypeItem(String paramString) { this.key2.set(16, paramString, null, null); Item item = get(this.key2); if (item == null) { this.pool.put12(16, newUTF8(paramString)); item = new Item(this.index++, this.key2); put(item); }  return item; }
/* 479 */   Item newHandleItem(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { this.key4.set(20 + paramInt, paramString1, paramString2, paramString3); Item item = get(this.key4); try { if (item == null) { try { if (paramInt <= 4) { put112(15, paramInt, newField(paramString1, paramString2, paramString3)); } else { put112(15, paramInt, newMethod(paramString1, paramString2, paramString3, paramBoolean)); }  } catch (RuntimeException runtimeException) { throw b(null); }  item = new Item(this.index++, this.key4); }  } catch (RuntimeException runtimeException) { throw b(null); }  return item; } @Deprecated public int newHandle(int paramInt, String paramString1, String paramString2, String paramString3) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return newHandle(paramInt, paramString1, paramString2, paramString3, (paramInt == 9)); } private void put112(int paramInt1, int paramInt2, int paramInt3) { this.pool.put11(paramInt1, paramInt2).putShort(paramInt3); } Item newFloat(float paramFloat) { this.key.set(paramFloat); Item item = get(this.key); if (item == null) { this.pool.putByte(4).putInt(this.key.intVal); item = new Item(this.index++, this.key); put(item); }  return item; }
/* 480 */   public ClassWriter(int paramInt) { super(327680); this.items = new Item[256]; this.threshold = (int)(0.75D * this.items.length); this.key = new Item(); this.key2 = new Item(); this.key3 = new Item(); this.key4 = new Item(); try {  } catch (RuntimeException runtimeException) { throw b(null); }  this.compute = ((paramInt & 0x2) != 0) ? 0 : (((paramInt & 0x1) != 0) ? 2 : 3); } static { byte[] arrayOfByte = new byte[220]; String str = "AAAAAAAAAAAAAAAABCLMMDDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAADDDDDEEEEEEEEEEEEEEEEEEEEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANAAAAAAAAAAAAAAAAAAAAJJJJJJJJJJJJJJJJDOPAAAAAAGGGGGGGHIFBFAAFFAARQJJKKSSSSSSSSSSSSSSSSSS"; byte b = 0; try { while (b < arrayOfByte.length) { arrayOfByte[b] = (byte)(str.charAt(b) - 65); b++; }  } catch (RuntimeException runtimeException) { throw b(null); }  TYPE = arrayOfByte; } Item newFieldItem(String paramString1, String paramString2, String paramString3) { this.key3.set(9, paramString1, paramString2, paramString3); Item item = get(this.key3); if (item == null) { put122(9, newClass(paramString1), newNameType(paramString2, paramString3)); item = new Item(this.index++, this.key3); put(item); }  return item; } public final void visitEnd() {} Item newMethodItem(String paramString1, String paramString2, String paramString3, boolean paramBoolean) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  byte b = paramBoolean ? 11 : 10; this.key3.set(b, paramString1, paramString2, paramString3); Item item = get(this.key3); if (item == null) { put122(b, newClass(paramString1), newNameType(paramString2, paramString3)); item = new Item(this.index++, this.key3); put(item); }  return item; } public final void visitOuterClass(String paramString1, String paramString2, String paramString3) { try { this.enclosingMethodOwner = newClass(paramString1); if (paramString2 != null) try { if (paramString3 != null) this.enclosingMethod = newNameType(paramString2, paramString3);  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  } private Item addType(Item paramItem) { this.typeCount = (short)(this.typeCount + 1); Item item = new Item(this.typeCount, this.key); try { put(item); if (this.typeTable == null) this.typeTable = new Item[16];  } catch (RuntimeException runtimeException) { throw b(null); }  if (this.typeCount == this.typeTable.length) { Item[] arrayOfItem = new Item[2 * this.typeTable.length]; System.arraycopy(this.typeTable, 0, arrayOfItem, 0, this.typeTable.length); this.typeTable = arrayOfItem; }  this.typeTable[this.typeCount] = item; return item; } public final FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) { return new FieldWriter(this, paramInt, paramString1, paramString2, paramString3, paramObject); } public int newNameType(String paramString1, String paramString2) { return (newNameTypeItem(paramString1, paramString2)).index; } public int newClass(String paramString) { return (newClassItem(paramString)).index; } private Item newString(String paramString) { this.key2.set(8, paramString, null, null); Item item = get(this.key2); if (item == null) { this.pool.put12(8, newUTF8(paramString)); item = new Item(this.index++, this.key2); put(item); }  return item; } Item newClassItem(String paramString) { this.key2.set(7, paramString, null, null); Item item = get(this.key2); if (item == null) { this.pool.put12(7, newUTF8(paramString)); item = new Item(this.index++, this.key2); put(item); }  return item; } public int newHandle(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { return (newHandleItem(paramInt, paramString1, paramString2, paramString3, paramBoolean)).index; } Item newDouble(double paramDouble) { this.key.set(paramDouble); Item item = get(this.key); if (item == null) { this.pool.putByte(6).putLong(this.key.longVal); item = new Item(this.index, this.key); this.index += 2; put(item); }  return item; } public final MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { return new MethodWriter(this, paramInt, paramString1, paramString2, paramString3, paramArrayOfString, this.compute); } private void put122(int paramInt1, int paramInt2, int paramInt3) { this.pool.put12(paramInt1, paramInt2).putShort(paramInt3); } public final AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { ByteVector byteVector = new ByteVector(); byteVector.putShort(newUTF8(paramString)).putShort(0); AnnotationWriter annotationWriter = new AnnotationWriter(this, true, byteVector, byteVector, 2); try { if (paramBoolean) { annotationWriter.next = this.anns; this.anns = annotationWriter; } else { annotationWriter.next = this.ianns; this.ianns = annotationWriter; }  } catch (RuntimeException runtimeException) { throw b(null); }  return annotationWriter; }
/* 481 */   Item newInvokeDynamicItem(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) { ByteVector byteVector = this.bootstrapMethods; if (byteVector == null) byteVector = this.bootstrapMethods = new ByteVector();  int i = byteVector.length; int j = paramHandle.hashCode(); byteVector.putShort(newHandle(paramHandle.tag, paramHandle.owner, paramHandle.name, paramHandle.desc, paramHandle.isInterface())); int k = paramVarArgs.length; byteVector.putShort(k); for (byte b = 0; b < k; ) { Object object = paramVarArgs[b]; j ^= object.hashCode(); byteVector.putShort(newConst(object)); b++; }  byte[] arrayOfByte = byteVector.data; int m = 2 + k << 1; j &= Integer.MAX_VALUE; Item item = this.items[j % this.items.length]; while (true) { try { if (item != null) { try { if (item.type != 33 || item.hashCode != j) { item = item.next; continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  int i1 = item.intVal; boolean bool = false; }  } catch (RuntimeException runtimeException) { throw b(null); }  break; }  if (item != null) { int i1 = item.index; byteVector.length = i; }  int n = this.bootstrapMethodsCount++; item = new Item(n); item.set(i, j); put(item); this.key3.set(paramString1, paramString2, n); item = get(this.key3); if (item == null) { put122(18, n, newNameType(paramString1, paramString2)); item = new Item(this.index++, this.key3); put(item); }  return item; }
/*     */ 
/*     */   
/*     */   private Item get(Item paramItem) {
/*     */     Item item = this.items[paramItem.hashCode % this.items.length];
/*     */     while (true) {
/*     */       try {
/*     */         if (item != null)
/*     */           try {
/*     */             if (item.type != paramItem.type || !paramItem.isEqualTo(item)) {
/*     */               item = item.next;
/*     */               continue;
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           }  
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     return item;
/*     */   }
/*     */   
/*     */   public final void visitSource(String paramString1, String paramString2) {
/*     */     try {
/*     */       if (paramString1 != null)
/*     */         this.sourceFile = newUTF8(paramString1); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramString2 != null)
/*     */         this.sourceDebug = (new ByteVector()).encodeUTF8(paramString2, 0, 2147483647); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\ClassWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */