/*     */ package org.spongepowered.asm.lib.tree;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.spongepowered.asm.lib.AnnotationVisitor;
/*     */ import org.spongepowered.asm.lib.Attribute;
/*     */ import org.spongepowered.asm.lib.ClassVisitor;
/*     */ import org.spongepowered.asm.lib.FieldVisitor;
/*     */ import org.spongepowered.asm.lib.TypePath;
/*     */ 
/*     */ public class ClassNode extends ClassVisitor {
/*  12 */   public ClassNode() { this(327680);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  17 */     if (getClass() != ClassNode.class)
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  81 */       throw new IllegalStateException(); }  } public List<InnerClassNode> innerClasses = new ArrayList<InnerClassNode>(); public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(paramInt, paramTypePath, paramString); 
/*     */     try { if (paramBoolean)
/*     */       { 
/*  84 */         try { if (this.visibleTypeAnnotations == null) this.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1);  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.visibleTypeAnnotations.add(typeAnnotationNode); } else { try { if (this.invisibleTypeAnnotations == null) this.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1);  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.invisibleTypeAnnotations.add(typeAnnotationNode); }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*     */     
/*     */     return typeAnnotationNode; }
/*     */    public void accept(ClassVisitor paramClassVisitor) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield interfaces : Ljava/util/List;
/*     */     //   4: invokeinterface size : ()I
/*     */     //   9: anewarray java/lang/String
/*     */     //   12: astore_2
/*     */     //   13: aload_0
/*     */     //   14: getfield interfaces : Ljava/util/List;
/*     */     //   17: aload_2
/*     */     //   18: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   23: pop
/*     */     //   24: aload_1
/*     */     //   25: aload_0
/*     */     //   26: getfield version : I
/*     */     //   29: aload_0
/*     */     //   30: getfield access : I
/*     */     //   33: aload_0
/*     */     //   34: getfield name : Ljava/lang/String;
/*     */     //   37: aload_0
/*     */     //   38: getfield signature : Ljava/lang/String;
/*     */     //   41: aload_0
/*     */     //   42: getfield superName : Ljava/lang/String;
/*     */     //   45: aload_2
/*     */     //   46: invokevirtual visit : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   49: aload_0
/*     */     //   50: getfield sourceFile : Ljava/lang/String;
/*     */     //   53: ifnonnull -> 70
/*     */     //   56: aload_0
/*     */     //   57: getfield sourceDebug : Ljava/lang/String;
/*     */     //   60: ifnull -> 89
/*     */     //   63: goto -> 70
/*     */     //   66: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   69: athrow
/*     */     //   70: aload_1
/*     */     //   71: aload_0
/*     */     //   72: getfield sourceFile : Ljava/lang/String;
/*     */     //   75: aload_0
/*     */     //   76: getfield sourceDebug : Ljava/lang/String;
/*     */     //   79: invokevirtual visitSource : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   82: goto -> 89
/*     */     //   85: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   88: athrow
/*     */     //   89: aload_0
/*     */     //   90: getfield outerClass : Ljava/lang/String;
/*     */     //   93: ifnull -> 119
/*     */     //   96: aload_1
/*     */     //   97: aload_0
/*     */     //   98: getfield outerClass : Ljava/lang/String;
/*     */     //   101: aload_0
/*     */     //   102: getfield outerMethod : Ljava/lang/String;
/*     */     //   105: aload_0
/*     */     //   106: getfield outerMethodDesc : Ljava/lang/String;
/*     */     //   109: invokevirtual visitOuterClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   112: goto -> 119
/*     */     //   115: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   118: athrow
/*     */     //   119: aload_0
/*     */     //   120: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   123: ifnonnull -> 134
/*     */     //   126: iconst_0
/*     */     //   127: goto -> 143
/*     */     //   130: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   133: athrow
/*     */     //   134: aload_0
/*     */     //   135: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   138: invokeinterface size : ()I
/*     */     //   143: istore_3
/*     */     //   144: iconst_0
/*     */     //   145: istore #4
/*     */     //   147: iload #4
/*     */     //   149: iload_3
/*     */     //   150: if_icmpge -> 190
/*     */     //   153: aload_0
/*     */     //   154: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   157: iload #4
/*     */     //   159: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   164: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   167: astore #5
/*     */     //   169: aload #5
/*     */     //   171: aload_1
/*     */     //   172: aload #5
/*     */     //   174: getfield desc : Ljava/lang/String;
/*     */     //   177: iconst_1
/*     */     //   178: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   181: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   184: iinc #4, 1
/*     */     //   187: goto -> 147
/*     */     //   190: aload_0
/*     */     //   191: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   194: ifnonnull -> 205
/*     */     //   197: iconst_0
/*     */     //   198: goto -> 214
/*     */     //   201: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   204: athrow
/*     */     //   205: aload_0
/*     */     //   206: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   209: invokeinterface size : ()I
/*     */     //   214: istore_3
/*     */     //   215: iconst_0
/*     */     //   216: istore #4
/*     */     //   218: iload #4
/*     */     //   220: iload_3
/*     */     //   221: if_icmpge -> 261
/*     */     //   224: aload_0
/*     */     //   225: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   228: iload #4
/*     */     //   230: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   235: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   238: astore #5
/*     */     //   240: aload #5
/*     */     //   242: aload_1
/*     */     //   243: aload #5
/*     */     //   245: getfield desc : Ljava/lang/String;
/*     */     //   248: iconst_0
/*     */     //   249: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   252: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   255: iinc #4, 1
/*     */     //   258: goto -> 218
/*     */     //   261: aload_0
/*     */     //   262: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   265: ifnonnull -> 276
/*     */     //   268: iconst_0
/*     */     //   269: goto -> 285
/*     */     //   272: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   275: athrow
/*     */     //   276: aload_0
/*     */     //   277: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   280: invokeinterface size : ()I
/*     */     //   285: istore_3
/*     */     //   286: iconst_0
/*     */     //   287: istore #4
/*     */     //   289: iload #4
/*     */     //   291: iload_3
/*     */     //   292: if_icmpge -> 342
/*     */     //   295: aload_0
/*     */     //   296: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   299: iload #4
/*     */     //   301: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   306: checkcast org/spongepowered/asm/lib/tree/TypeAnnotationNode
/*     */     //   309: astore #5
/*     */     //   311: aload #5
/*     */     //   313: aload_1
/*     */     //   314: aload #5
/*     */     //   316: getfield typeRef : I
/*     */     //   319: aload #5
/*     */     //   321: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*     */     //   324: aload #5
/*     */     //   326: getfield desc : Ljava/lang/String;
/*     */     //   329: iconst_1
/*     */     //   330: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   333: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   336: iinc #4, 1
/*     */     //   339: goto -> 289
/*     */     //   342: aload_0
/*     */     //   343: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   346: ifnonnull -> 357
/*     */     //   349: iconst_0
/*     */     //   350: goto -> 366
/*     */     //   353: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   356: athrow
/*     */     //   357: aload_0
/*     */     //   358: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   361: invokeinterface size : ()I
/*     */     //   366: istore_3
/*     */     //   367: iconst_0
/*     */     //   368: istore #4
/*     */     //   370: iload #4
/*     */     //   372: iload_3
/*     */     //   373: if_icmpge -> 423
/*     */     //   376: aload_0
/*     */     //   377: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   380: iload #4
/*     */     //   382: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   387: checkcast org/spongepowered/asm/lib/tree/TypeAnnotationNode
/*     */     //   390: astore #5
/*     */     //   392: aload #5
/*     */     //   394: aload_1
/*     */     //   395: aload #5
/*     */     //   397: getfield typeRef : I
/*     */     //   400: aload #5
/*     */     //   402: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*     */     //   405: aload #5
/*     */     //   407: getfield desc : Ljava/lang/String;
/*     */     //   410: iconst_0
/*     */     //   411: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   414: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   417: iinc #4, 1
/*     */     //   420: goto -> 370
/*     */     //   423: aload_0
/*     */     //   424: getfield attrs : Ljava/util/List;
/*     */     //   427: ifnonnull -> 438
/*     */     //   430: iconst_0
/*     */     //   431: goto -> 447
/*     */     //   434: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   437: athrow
/*     */     //   438: aload_0
/*     */     //   439: getfield attrs : Ljava/util/List;
/*     */     //   442: invokeinterface size : ()I
/*     */     //   447: istore_3
/*     */     //   448: iconst_0
/*     */     //   449: istore #4
/*     */     //   451: iload #4
/*     */     //   453: iload_3
/*     */     //   454: if_icmpge -> 485
/*     */     //   457: aload_1
/*     */     //   458: aload_0
/*     */     //   459: getfield attrs : Ljava/util/List;
/*     */     //   462: iload #4
/*     */     //   464: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   469: checkcast org/spongepowered/asm/lib/Attribute
/*     */     //   472: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*     */     //   475: iinc #4, 1
/*     */     //   478: goto -> 451
/*     */     //   481: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   484: athrow
/*     */     //   485: iconst_0
/*     */     //   486: istore #4
/*     */     //   488: iload #4
/*     */     //   490: aload_0
/*     */     //   491: getfield innerClasses : Ljava/util/List;
/*     */     //   494: invokeinterface size : ()I
/*     */     //   499: if_icmpge -> 530
/*     */     //   502: aload_0
/*     */     //   503: getfield innerClasses : Ljava/util/List;
/*     */     //   506: iload #4
/*     */     //   508: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   513: checkcast org/spongepowered/asm/lib/tree/InnerClassNode
/*     */     //   516: aload_1
/*     */     //   517: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;)V
/*     */     //   520: iinc #4, 1
/*     */     //   523: goto -> 488
/*     */     //   526: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   529: athrow
/*     */     //   530: iconst_0
/*     */     //   531: istore #4
/*     */     //   533: iload #4
/*     */     //   535: aload_0
/*     */     //   536: getfield fields : Ljava/util/List;
/*     */     //   539: invokeinterface size : ()I
/*     */     //   544: if_icmpge -> 575
/*     */     //   547: aload_0
/*     */     //   548: getfield fields : Ljava/util/List;
/*     */     //   551: iload #4
/*     */     //   553: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   558: checkcast org/spongepowered/asm/lib/tree/FieldNode
/*     */     //   561: aload_1
/*     */     //   562: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;)V
/*     */     //   565: iinc #4, 1
/*     */     //   568: goto -> 533
/*     */     //   571: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   574: athrow
/*     */     //   575: iconst_0
/*     */     //   576: istore #4
/*     */     //   578: iload #4
/*     */     //   580: aload_0
/*     */     //   581: getfield methods : Ljava/util/List;
/*     */     //   584: invokeinterface size : ()I
/*     */     //   589: if_icmpge -> 620
/*     */     //   592: aload_0
/*     */     //   593: getfield methods : Ljava/util/List;
/*     */     //   596: iload #4
/*     */     //   598: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   603: checkcast org/spongepowered/asm/lib/tree/MethodNode
/*     */     //   606: aload_1
/*     */     //   607: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;)V
/*     */     //   610: iinc #4, 1
/*     */     //   613: goto -> 578
/*     */     //   616: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   619: athrow
/*     */     //   620: aload_1
/*     */     //   621: invokevirtual visitEnd : ()V
/*     */     //   624: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #35	-> 0
/*     */     //   #42	-> 13
/*     */     //   #101	-> 24
/*     */     //   #19	-> 49
/*     */     //   #33	-> 70
/*     */     //   #4	-> 89
/*     */     //   #38	-> 96
/*     */     //   #94	-> 119
/*     */     //   #87	-> 144
/*     */     //   #30	-> 153
/*     */     //   #41	-> 169
/*     */     //   #85	-> 184
/*     */     //   #20	-> 190
/*     */     //   #52	-> 215
/*     */     //   #40	-> 224
/*     */     //   #110	-> 240
/*     */     //   #2	-> 255
/*     */     //   #34	-> 261
/*     */     //   #93	-> 286
/*     */     //   #62	-> 295
/*     */     //   #70	-> 311
/*     */     //   #13	-> 336
/*     */     //   #18	-> 342
/*     */     //   #92	-> 361
/*     */     //   #79	-> 367
/*     */     //   #99	-> 376
/*     */     //   #32	-> 392
/*     */     //   #59	-> 417
/*     */     //   #83	-> 423
/*     */     //   #23	-> 448
/*     */     //   #54	-> 457
/*     */     //   #45	-> 475
/*     */     //   #43	-> 485
/*     */     //   #67	-> 502
/*     */     //   #75	-> 520
/*     */     //   #58	-> 530
/*     */     //   #73	-> 547
/*     */     //   #108	-> 565
/*     */     //   #74	-> 575
/*     */     //   #111	-> 592
/*     */     //   #103	-> 610
/*     */     //   #60	-> 620
/*     */     //   #7	-> 624
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   13	63	66	java/lang/IllegalStateException
/*     */     //   56	82	85	java/lang/IllegalStateException
/*     */     //   89	112	115	java/lang/IllegalStateException
/*     */     //   119	130	130	java/lang/IllegalStateException
/*     */     //   190	201	201	java/lang/IllegalStateException
/*     */     //   261	272	272	java/lang/IllegalStateException
/*     */     //   342	353	353	java/lang/IllegalStateException
/*     */     //   423	434	434	java/lang/IllegalStateException
/*     */     //   451	481	481	java/lang/IllegalStateException
/*     */     //   488	526	526	java/lang/IllegalStateException
/*     */     //   533	571	571	java/lang/IllegalStateException
/*     */     //   578	616	616	java/lang/IllegalStateException
/*     */   } public void visitAttribute(Attribute paramAttribute) {
/*     */     try {
/*     */       if (this.attrs == null)
/*     */         this.attrs = new ArrayList<Attribute>(1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.attrs.add(paramAttribute);
/*     */   } public void visitOuterClass(String paramString1, String paramString2, String paramString3) {
/*     */     this.outerClass = paramString1;
/*     */     this.outerMethod = paramString2;
/*     */     this.outerMethodDesc = paramString3;
/*     */   }
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { AnnotationNode annotationNode = new AnnotationNode(paramString);
/*     */     
/* 104 */     try { if (paramBoolean) { try { if (this.visibleAnnotations == null) this.visibleAnnotations = new ArrayList<AnnotationNode>(1);  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.visibleAnnotations.add(annotationNode); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if (this.invisibleAnnotations == null) this.invisibleAnnotations = new ArrayList<AnnotationNode>(1);  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.invisibleAnnotations.add(annotationNode); return annotationNode; }
/* 105 */   public List<MethodNode> methods = new ArrayList<MethodNode>(); public void check(int paramInt) { try { if (paramInt == 262144) { try { if (this.visibleTypeAnnotations != null) try { if (this.visibleTypeAnnotations.size() > 0) throw new RuntimeException();  } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if (this.invisibleTypeAnnotations != null) try { if (this.invisibleTypeAnnotations.size() > 0) throw new RuntimeException();  } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  }  } catch (IllegalStateException illegalStateException) { throw b(null); }  } public List<String> interfaces = new ArrayList<String>(); public void visitSource(String paramString1, String paramString2) { this.sourceFile = paramString1; this.sourceDebug = paramString2; }
/* 106 */   public void visitEnd() {} public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) { FieldNode fieldNode = new FieldNode(paramInt, paramString1, paramString2, paramString3, paramObject); this.fields.add(fieldNode); return fieldNode; } public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { MethodNode methodNode = new MethodNode(paramInt, paramString1, paramString2, paramString3, paramArrayOfString); this.methods.add(methodNode); return methodNode; } public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) { InnerClassNode innerClassNode = new InnerClassNode(paramString1, paramString2, paramString3, paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     this.innerClasses.add(innerClassNode); } public List<FieldNode> fields = new ArrayList<FieldNode>(); public int version; public int access; public String name; public String signature; public String superName; public String sourceFile; public String sourceDebug; public String outerClass; public String outerMethod; public String outerMethodDesc; public List<AnnotationNode> visibleAnnotations; public List<AnnotationNode> invisibleAnnotations; public List<TypeAnnotationNode> visibleTypeAnnotations; public List<TypeAnnotationNode> invisibleTypeAnnotations; public List<Attribute> attrs; public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { try { this.version = paramInt1; this.access = paramInt2; this.name = paramString1; this.signature = paramString2; this.superName = paramString3; if (paramArrayOfString != null) this.interfaces.addAll(Arrays.asList(paramArrayOfString));  } catch (IllegalStateException illegalStateException) { throw b(null); }  }
/* 114 */   public ClassNode(int paramInt) { super(paramInt); }
/*     */ 
/*     */   
/*     */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*     */     return paramIllegalStateException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\ClassNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */