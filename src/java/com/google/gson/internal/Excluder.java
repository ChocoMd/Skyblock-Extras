/*    */ package com.google.gson.internal;
/*    */ public final class Excluder implements TypeAdapterFactory, Cloneable {
/*  3 */   private double version = -1.0D;
/*    */ 
/*    */   
/*  6 */   private List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();
/*    */   
/*    */   private boolean isAnonymousOrLocal(Class<?> paramClass) {
/*    */     // Byte code:
/*    */     //   0: ldc java/lang/Enum
/*    */     //   2: aload_1
/*    */     //   3: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*    */     //   6: ifne -> 45
/*    */     //   9: aload_1
/*    */     //   10: invokevirtual isAnonymousClass : ()Z
/*    */     //   13: ifne -> 37
/*    */     //   16: goto -> 23
/*    */     //   19: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   22: athrow
/*    */     //   23: aload_1
/*    */     //   24: invokevirtual isLocalClass : ()Z
/*    */     //   27: ifeq -> 45
/*    */     //   30: goto -> 37
/*    */     //   33: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   36: athrow
/*    */     //   37: iconst_1
/*    */     //   38: goto -> 46
/*    */     //   41: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   44: athrow
/*    */     //   45: iconst_0
/*    */     //   46: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	16	19	java/lang/RuntimeException
/*    */     //   9	30	33	java/lang/RuntimeException
/*    */     //   23	41	41	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   private boolean isValidVersion(Since paramSince, Until paramUntil)
/*    */   {
/*    */     
/* 15 */     try { if (isValidSince(paramSince)) try { if (isValidUntil(paramUntil)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false;
/* 16 */   } public Excluder excludeFieldsWithoutExposeAnnotation() { Excluder excluder = clone(); excluder.requireExpose = true; return excluder; } private boolean isValidUntil(Until paramUntil) { if (paramUntil != null)
/*    */     
/*    */     { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 84 */       double d = paramUntil.value(); try { if (d <= this.version) return false;  } catch (RuntimeException runtimeException) { throw b(null); }  }  return true; }
/* 85 */   protected Excluder clone() { try { return (Excluder)super.clone(); } catch (CloneNotSupportedException cloneNotSupportedException) { throw new AssertionError(); }  } public Excluder() { this.serializeInnerClasses = true; this.serializationStrategies = Collections.emptyList(); this.deserializationStrategies = Collections.emptyList(); } public Excluder withModifiers(int... paramVarArgs) { Excluder excluder = clone(); excluder.modifiers = 0; int arrayOfInt[], i;
/*    */     byte b;
/* 87 */     for (arrayOfInt = paramVarArgs, i = arrayOfInt.length, b = 0; b < i; excluder.modifiers |= j) int j = arrayOfInt[b]; 
/*    */     return excluder; }
/*    */ 
/*    */   
/*    */   public boolean excludeClass(Class<?> paramClass, boolean paramBoolean) {
/*    */     try {
/*    */       if (this.version != -1.0D)
/*    */         try {
/*    */           if (!isValidVersion(paramClass.<Since>getAnnotation(Since.class), paramClass.<Until>getAnnotation(Until.class)))
/*    */             return true; 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (!this.serializeInnerClasses)
/*    */         try {
/*    */           if (isInnerClass(paramClass))
/*    */             return true; 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (isAnonymousOrLocal(paramClass))
/*    */         return true; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     List<ExclusionStrategy> list = paramBoolean ? this.serializationStrategies : this.deserializationStrategies;
/*    */     for (ExclusionStrategy exclusionStrategy : list) {
/*    */       try {
/*    */         if (exclusionStrategy.shouldSkipClass(paramClass))
/*    */           return true; 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public Excluder withVersion(double paramDouble) {
/*    */     Excluder excluder = clone();
/*    */     excluder.version = paramDouble;
/*    */     return excluder;
/*    */   }
/*    */   
/*    */   public static final Excluder DEFAULT = new Excluder();
/*    */   private static final double IGNORE_VERSIONS = -1.0D;
/*    */   private int modifiers;
/*    */   private boolean serializeInnerClasses;
/*    */   private boolean requireExpose;
/*    */   private List<ExclusionStrategy> serializationStrategies;
/*    */   
/*    */   private boolean isValidSince(Since paramSince) {
/*    */     if (paramSince != null) {
/*    */       double d = paramSince.value();
/*    */       try {
/*    */         if (d > this.version)
/*    */           return false; 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public Excluder disableInnerClassSerialization() {
/*    */     Excluder excluder = clone();
/*    */     excluder.serializeInnerClasses = false;
/*    */     return excluder;
/*    */   }
/*    */   
/*    */   public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) {
/*    */     Class<?> clazz = paramTypeToken.getRawType();
/*    */     boolean bool1 = excludeClass(clazz, true);
/*    */     boolean bool2 = excludeClass(clazz, false);
/*    */     try {
/*    */       if (!bool1)
/*    */         try {
/*    */           if (!bool2)
/*    */             return null; 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return new Excluder$1(this, bool2, bool1, paramGson, paramTypeToken);
/*    */   }
/*    */   
/*    */   public Excluder withExclusionStrategy(ExclusionStrategy paramExclusionStrategy, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     Excluder excluder = clone();
/*    */     try {
/*    */       if (paramBoolean1) {
/*    */         excluder.serializationStrategies = new ArrayList<ExclusionStrategy>(this.serializationStrategies);
/*    */         excluder.serializationStrategies.add(paramExclusionStrategy);
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramBoolean2) {
/*    */         excluder.deserializationStrategies = new ArrayList<ExclusionStrategy>(this.deserializationStrategies);
/*    */         excluder.deserializationStrategies.add(paramExclusionStrategy);
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return excluder;
/*    */   }
/*    */   
/*    */   private boolean isInnerClass(Class<?> paramClass) {
/*    */     try {
/*    */       if (paramClass.isMemberClass())
/*    */         try {
/*    */           if (!isStatic(paramClass));
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public boolean excludeField(Field paramField, boolean paramBoolean) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield modifiers : I
/*    */     //   4: aload_1
/*    */     //   5: invokevirtual getModifiers : ()I
/*    */     //   8: iand
/*    */     //   9: ifeq -> 18
/*    */     //   12: iconst_1
/*    */     //   13: ireturn
/*    */     //   14: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   17: athrow
/*    */     //   18: aload_0
/*    */     //   19: getfield version : D
/*    */     //   22: ldc2_w -1.0
/*    */     //   25: dcmpl
/*    */     //   26: ifeq -> 67
/*    */     //   29: aload_0
/*    */     //   30: aload_1
/*    */     //   31: ldc com/google/gson/annotations/Since
/*    */     //   33: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*    */     //   36: checkcast com/google/gson/annotations/Since
/*    */     //   39: aload_1
/*    */     //   40: ldc com/google/gson/annotations/Until
/*    */     //   42: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*    */     //   45: checkcast com/google/gson/annotations/Until
/*    */     //   48: invokespecial isValidVersion : (Lcom/google/gson/annotations/Since;Lcom/google/gson/annotations/Until;)Z
/*    */     //   51: ifne -> 67
/*    */     //   54: goto -> 61
/*    */     //   57: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   60: athrow
/*    */     //   61: iconst_1
/*    */     //   62: ireturn
/*    */     //   63: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   66: athrow
/*    */     //   67: aload_1
/*    */     //   68: invokevirtual isSynthetic : ()Z
/*    */     //   71: ifeq -> 80
/*    */     //   74: iconst_1
/*    */     //   75: ireturn
/*    */     //   76: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   79: athrow
/*    */     //   80: aload_0
/*    */     //   81: getfield requireExpose : Z
/*    */     //   84: ifeq -> 150
/*    */     //   87: aload_1
/*    */     //   88: ldc com/google/gson/annotations/Expose
/*    */     //   90: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
/*    */     //   93: checkcast com/google/gson/annotations/Expose
/*    */     //   96: astore_3
/*    */     //   97: aload_3
/*    */     //   98: ifnull -> 144
/*    */     //   101: iload_2
/*    */     //   102: ifeq -> 135
/*    */     //   105: goto -> 112
/*    */     //   108: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   111: athrow
/*    */     //   112: aload_3
/*    */     //   113: invokeinterface serialize : ()Z
/*    */     //   118: ifne -> 150
/*    */     //   121: goto -> 128
/*    */     //   124: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   127: athrow
/*    */     //   128: goto -> 144
/*    */     //   131: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   134: athrow
/*    */     //   135: aload_3
/*    */     //   136: invokeinterface deserialize : ()Z
/*    */     //   141: ifne -> 150
/*    */     //   144: iconst_1
/*    */     //   145: ireturn
/*    */     //   146: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   149: athrow
/*    */     //   150: aload_0
/*    */     //   151: getfield serializeInnerClasses : Z
/*    */     //   154: ifne -> 181
/*    */     //   157: aload_0
/*    */     //   158: aload_1
/*    */     //   159: invokevirtual getType : ()Ljava/lang/Class;
/*    */     //   162: invokespecial isInnerClass : (Ljava/lang/Class;)Z
/*    */     //   165: ifeq -> 181
/*    */     //   168: goto -> 175
/*    */     //   171: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   174: athrow
/*    */     //   175: iconst_1
/*    */     //   176: ireturn
/*    */     //   177: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   180: athrow
/*    */     //   181: aload_0
/*    */     //   182: aload_1
/*    */     //   183: invokevirtual getType : ()Ljava/lang/Class;
/*    */     //   186: invokespecial isAnonymousOrLocal : (Ljava/lang/Class;)Z
/*    */     //   189: ifeq -> 198
/*    */     //   192: iconst_1
/*    */     //   193: ireturn
/*    */     //   194: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   197: athrow
/*    */     //   198: iload_2
/*    */     //   199: ifeq -> 213
/*    */     //   202: aload_0
/*    */     //   203: getfield serializationStrategies : Ljava/util/List;
/*    */     //   206: goto -> 217
/*    */     //   209: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   212: athrow
/*    */     //   213: aload_0
/*    */     //   214: getfield deserializationStrategies : Ljava/util/List;
/*    */     //   217: astore_3
/*    */     //   218: aload_3
/*    */     //   219: invokeinterface isEmpty : ()Z
/*    */     //   224: ifne -> 288
/*    */     //   227: new com/google/gson/FieldAttributes
/*    */     //   230: dup
/*    */     //   231: aload_1
/*    */     //   232: invokespecial <init> : (Ljava/lang/reflect/Field;)V
/*    */     //   235: astore #4
/*    */     //   237: aload_3
/*    */     //   238: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   243: astore #5
/*    */     //   245: aload #5
/*    */     //   247: invokeinterface hasNext : ()Z
/*    */     //   252: ifeq -> 288
/*    */     //   255: aload #5
/*    */     //   257: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   262: checkcast com/google/gson/ExclusionStrategy
/*    */     //   265: astore #6
/*    */     //   267: aload #6
/*    */     //   269: aload #4
/*    */     //   271: invokeinterface shouldSkipField : (Lcom/google/gson/FieldAttributes;)Z
/*    */     //   276: ifeq -> 285
/*    */     //   279: iconst_1
/*    */     //   280: ireturn
/*    */     //   281: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   284: athrow
/*    */     //   285: goto -> 245
/*    */     //   288: iconst_0
/*    */     //   289: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #79	-> 0
/*    */     //   #10	-> 12
/*    */     //   #38	-> 18
/*    */     //   #68	-> 61
/*    */     //   #2	-> 67
/*    */     //   #88	-> 74
/*    */     //   #86	-> 80
/*    */     //   #25	-> 87
/*    */     //   #35	-> 97
/*    */     //   #44	-> 144
/*    */     //   #63	-> 150
/*    */     //   #59	-> 175
/*    */     //   #65	-> 181
/*    */     //   #57	-> 192
/*    */     //   #27	-> 198
/*    */     //   #41	-> 218
/*    */     //   #17	-> 227
/*    */     //   #73	-> 237
/*    */     //   #22	-> 267
/*    */     //   #80	-> 279
/*    */     //   #52	-> 285
/*    */     //   #71	-> 288
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	14	14	java/lang/RuntimeException
/*    */     //   18	54	57	java/lang/RuntimeException
/*    */     //   29	63	63	java/lang/RuntimeException
/*    */     //   67	76	76	java/lang/RuntimeException
/*    */     //   97	105	108	java/lang/RuntimeException
/*    */     //   101	121	124	java/lang/RuntimeException
/*    */     //   112	131	131	java/lang/RuntimeException
/*    */     //   135	146	146	java/lang/RuntimeException
/*    */     //   150	168	171	java/lang/RuntimeException
/*    */     //   157	177	177	java/lang/RuntimeException
/*    */     //   181	194	194	java/lang/RuntimeException
/*    */     //   198	209	209	java/lang/RuntimeException
/*    */     //   267	281	281	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   private boolean isStatic(Class<?> paramClass) {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return ((paramClass.getModifiers() & 0x8) != 0);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Excluder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */