/*   1 */ package org.spongepowered.asm.lib.tree;public class AnnotationNode extends AnnotationVisitor { public String desc; public List<Object> values; public AnnotationNode(int paramInt, String paramString) { super(paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  43 */     this.desc = paramString; } public AnnotationVisitor visitArray(String paramString) { try { if (this.values == null) { try {  }
/*     */         catch (IllegalStateException illegalStateException)
/*  45 */         { throw b(null); }  this.values = new ArrayList((this.desc != null) ? 2 : 1); }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  78 */       if (this.desc != null) {
/*     */         this.values.add(paramString);
/*     */       }
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     ArrayList<Object> arrayList = new ArrayList();
/*     */     this.values.add(arrayList);
/*     */     return new AnnotationNode(arrayList); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void visitEnd() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void check(int paramInt) {}
/*     */ 
/*     */   
/*     */   public void visit(String paramString, Object paramObject) {
/*     */     
/*     */     try { if (this.values == null)
/*     */       { 
/*     */         try {  }
/*     */         catch (IllegalStateException illegalStateException)
/* 104 */         { throw b(null); }  this.values = new ArrayList((this.desc != null) ? 2 : 1); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if (this.desc != null)
/* 105 */         this.values.add(paramString);  } catch (IllegalStateException illegalStateException) { throw b(null); }  if (paramObject instanceof byte[]) { byte[] arrayOfByte1 = (byte[])paramObject; ArrayList<Byte> arrayList = new ArrayList(arrayOfByte1.length); byte[] arrayOfByte2; int i; byte b; for (arrayOfByte2 = arrayOfByte1, i = arrayOfByte2.length, b = 0; b < i; ) { byte b1 = arrayOfByte2[b]; arrayList.add(Byte.valueOf(b1)); b++; }
/*     */ 
/*     */       
/* 108 */       this.values.add(arrayList);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     else
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 122 */       if (paramObject instanceof boolean[]) {
/*     */         boolean[] arrayOfBoolean1 = (boolean[])paramObject;
/*     */         ArrayList arrayList = new ArrayList(arrayOfBoolean1.length);
/*     */         boolean[] arrayOfBoolean2 = arrayOfBoolean1;
/*     */         int i = arrayOfBoolean2.length;
/*     */         boolean bool = false;
/*     */       } 
/*     */       if (paramObject instanceof short[]) {
/*     */         short[] arrayOfShort1 = (short[])paramObject;
/*     */         ArrayList arrayList = new ArrayList(arrayOfShort1.length);
/*     */         short[] arrayOfShort2 = arrayOfShort1;
/*     */         int i = arrayOfShort2.length;
/*     */         boolean bool = false;
/*     */       }  }
/*     */   
/*     */   }
/*     */   
/*     */   AnnotationNode(List<Object> paramList) {
/*     */     super(327680);
/*     */     this.values = paramList;
/*     */   }
/*     */   
/*     */   public AnnotationNode(String paramString) {
/*     */     this(327680, paramString);
/*     */     if (getClass() != AnnotationNode.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public void accept(AnnotationVisitor paramAnnotationVisitor) {
/*     */     try {
/*     */       if (paramAnnotationVisitor != null) {
/*     */         if (this.values != null)
/*     */           for (byte b = 0; b < this.values.size(); object = this.values.get(b + 1)) {
/*     */             Object object;
/*     */             String str = (String)this.values.get(b);
/*     */           }  
/*     */         paramAnnotationVisitor.visitEnd();
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield values : Ljava/util/List;
/*     */     //   4: ifnonnull -> 41
/*     */     //   7: aload_0
/*     */     //   8: new java/util/ArrayList
/*     */     //   11: dup
/*     */     //   12: aload_0
/*     */     //   13: getfield desc : Ljava/lang/String;
/*     */     //   16: ifnull -> 34
/*     */     //   19: goto -> 26
/*     */     //   22: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   25: athrow
/*     */     //   26: iconst_2
/*     */     //   27: goto -> 35
/*     */     //   30: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   33: athrow
/*     */     //   34: iconst_1
/*     */     //   35: invokespecial <init> : (I)V
/*     */     //   38: putfield values : Ljava/util/List;
/*     */     //   41: aload_0
/*     */     //   42: getfield desc : Ljava/lang/String;
/*     */     //   45: ifnull -> 66
/*     */     //   48: aload_0
/*     */     //   49: getfield values : Ljava/util/List;
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   58: pop
/*     */     //   59: goto -> 66
/*     */     //   62: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   65: athrow
/*     */     //   66: aload_0
/*     */     //   67: getfield values : Ljava/util/List;
/*     */     //   70: iconst_2
/*     */     //   71: anewarray java/lang/String
/*     */     //   74: dup
/*     */     //   75: iconst_0
/*     */     //   76: aload_2
/*     */     //   77: aastore
/*     */     //   78: dup
/*     */     //   79: iconst_1
/*     */     //   80: aload_3
/*     */     //   81: aastore
/*     */     //   82: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   87: pop
/*     */     //   88: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #102	-> 0
/*     */     //   #15	-> 7
/*     */     //   #64	-> 41
/*     */     //   #14	-> 48
/*     */     //   #59	-> 66
/*     */     //   #117	-> 88
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	19	22	java/lang/IllegalStateException
/*     */     //   7	30	30	java/lang/IllegalStateException
/*     */     //   41	59	62	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield values : Ljava/util/List;
/*     */     //   4: ifnonnull -> 41
/*     */     //   7: aload_0
/*     */     //   8: new java/util/ArrayList
/*     */     //   11: dup
/*     */     //   12: aload_0
/*     */     //   13: getfield desc : Ljava/lang/String;
/*     */     //   16: ifnull -> 34
/*     */     //   19: goto -> 26
/*     */     //   22: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   25: athrow
/*     */     //   26: iconst_2
/*     */     //   27: goto -> 35
/*     */     //   30: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   33: athrow
/*     */     //   34: iconst_1
/*     */     //   35: invokespecial <init> : (I)V
/*     */     //   38: putfield values : Ljava/util/List;
/*     */     //   41: aload_0
/*     */     //   42: getfield desc : Ljava/lang/String;
/*     */     //   45: ifnull -> 66
/*     */     //   48: aload_0
/*     */     //   49: getfield values : Ljava/util/List;
/*     */     //   52: aload_1
/*     */     //   53: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   58: pop
/*     */     //   59: goto -> 66
/*     */     //   62: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   65: athrow
/*     */     //   66: new org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   69: dup
/*     */     //   70: aload_2
/*     */     //   71: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   74: astore_3
/*     */     //   75: aload_0
/*     */     //   76: getfield values : Ljava/util/List;
/*     */     //   79: aload_3
/*     */     //   80: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   85: pop
/*     */     //   86: aload_3
/*     */     //   87: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #110	-> 0
/*     */     //   #50	-> 7
/*     */     //   #95	-> 41
/*     */     //   #107	-> 48
/*     */     //   #34	-> 66
/*     */     //   #48	-> 75
/*     */     //   #94	-> 86
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	19	22	java/lang/IllegalStateException
/*     */     //   7	30	30	java/lang/IllegalStateException
/*     */     //   41	59	62	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   static void accept(AnnotationVisitor paramAnnotationVisitor, String paramString, Object paramObject) {
/*     */     try {
/*     */       if (paramAnnotationVisitor != null)
/*     */         if (paramObject instanceof String[]) {
/*     */           String[] arrayOfString = (String[])paramObject;
/*     */           paramAnnotationVisitor.visitEnum(paramString, arrayOfString[0], arrayOfString[1]);
/*     */         } else {
/*     */           if (paramObject instanceof AnnotationNode) {
/*     */             AnnotationNode annotationNode = (AnnotationNode)paramObject;
/*     */             annotationNode.accept(paramAnnotationVisitor.visitAnnotation(paramString, annotationNode.desc));
/*     */           } 
/*     */           if (paramObject instanceof List) {
/*     */             AnnotationVisitor annotationVisitor = paramAnnotationVisitor.visitArray(paramString);
/*     */             if (annotationVisitor != null) {
/*     */               List list = (List)paramObject;
/*     */               byte b = 0;
/*     */               try {
/*     */                 for (; b < list.size(); b++)
/*     */                   accept(annotationVisitor, null, list.get(b)); 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               annotationVisitor.visitEnd();
/*     */             } 
/*     */           } else {
/*     */             paramAnnotationVisitor.visit(paramString, paramObject);
/*     */           } 
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*     */     return paramIllegalStateException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\AnnotationNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */