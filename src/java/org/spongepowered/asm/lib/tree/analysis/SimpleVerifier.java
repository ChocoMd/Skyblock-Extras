/*     */ package org.spongepowered.asm.lib.tree.analysis;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SimpleVerifier
/*     */   extends BasicVerifier
/*     */ {
/*     */   private final Type currentClass;
/*     */   private final Type currentSuperClass;
/*     */   private final List<Type> currentClassInterfaces;
/*     */   private final boolean isInterface;
/*     */   private ClassLoader loader;
/*     */   
/*     */   protected BasicValue getElementValue(BasicValue paramBasicValue) throws AnalyzerException {
/*  35 */     Type type = paramBasicValue.getType();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 117 */       if (type != null) {
/*     */         try {
/*     */           if (type.getSort() == 9)
/*     */             return newValue(Type.getType(type.getDescriptor().substring(1))); 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw c(null);
/*     */         } 
/*     */         try {
/*     */           if ("Lnull;".equals(type.getDescriptor()))
/*     */             return paramBasicValue; 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw c(null);
/*     */         } 
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw c(null);
/*     */     } 
/*     */     throw new Error("Internal error");
/*     */   }
/*     */   
/*     */   protected boolean isSubTypeOf(BasicValue paramBasicValue1, BasicValue paramBasicValue2) {
/*     */     Type type1 = paramBasicValue2.getType();
/*     */     Type type2 = paramBasicValue1.getType();
/*     */     try {
/*     */       switch (type1.getSort()) {
/*     */         case 5:
/*     */         case 6:
/*     */         case 7:
/*     */         case 8:
/*     */           return type2.equals(type1);
/*     */         case 9:
/*     */         case 10:
/*     */           try {
/*     */             if ("Lnull;".equals(type2.getDescriptor()))
/*     */               return true; 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw c(null);
/*     */           } 
/*     */           try {
/*     */             if (type2.getSort() != 10)
/*     */               try {
/*     */                 if (type2.getSort() != 9)
/*     */                   return false; 
/*     */                 return isAssignableFrom(type1, type2);
/*     */               } catch (RuntimeException runtimeException) {
/*     */                 throw c(null);
/*     */               }  
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw c(null);
/*     */           } 
/*     */           return isAssignableFrom(type1, type2);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     throw new Error("Internal error");
/*     */   }
/*     */   
/*     */   public BasicValue newValue(Type paramType) {
/*     */     try {
/*     */       if (paramType == null)
/*     */         return BasicValue.UNINITIALIZED_VALUE; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     boolean bool = (paramType.getSort() == 9) ? true : false;
/*     */     try {
/*     */       if (bool)
/*     */         try {
/*     */           switch (paramType.getElementType().getSort()) {
/*     */             case 1:
/*     */             case 2:
/*     */             case 3:
/*     */             case 4:
/*     */               return new BasicValue(paramType);
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw c(null);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     BasicValue basicValue = super.newValue(paramType);
/*     */     try {
/*     */       if (BasicValue.REFERENCE_VALUE.equals(basicValue))
/*     */         if (bool) {
/*     */           basicValue = newValue(paramType.getElementType());
/*     */           String str = basicValue.getType().getDescriptor();
/*     */           for (byte b = 0; b < paramType.getDimensions(); b++)
/*     */             str = '[' + str; 
/*     */           basicValue = new BasicValue(Type.getType(str));
/*     */         } else {
/*     */           basicValue = new BasicValue(paramType);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return basicValue;
/*     */   }
/*     */   
/*     */   public SimpleVerifier(Type paramType1, Type paramType2, List<Type> paramList, boolean paramBoolean) {
/*     */     this(327680, paramType1, paramType2, paramList, paramBoolean);
/*     */   }
/*     */   
/*     */   protected boolean isInterface(Type paramType) {
/*     */     try {
/*     */       if (this.currentClass != null)
/*     */         try {
/*     */           if (paramType.equals(this.currentClass))
/*     */             return this.isInterface; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw c(null);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return getClass(paramType).isInterface();
/*     */   }
/*     */   
/*     */   public SimpleVerifier() {
/*     */     this(null, null, false);
/*     */   }
/*     */   
/*     */   protected Class<?> getClass(Type paramType) {
/*     */     try {
/*     */       try {
/*     */         if (paramType.getSort() == 9)
/*     */           return Class.forName(paramType.getDescriptor().replace('/', '.'), false, this.loader); 
/*     */         return Class.forName(paramType.getClassName(), false, this.loader);
/*     */       } catch (ClassNotFoundException classNotFoundException) {
/*     */         throw new RuntimeException(classNotFoundException.toString());
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected SimpleVerifier(int paramInt, Type paramType1, Type paramType2, List<Type> paramList, boolean paramBoolean) {
/*     */     super(paramInt);
/*     */     this.loader = getClass().getClassLoader();
/*     */     this.currentClass = paramType1;
/*     */     this.currentSuperClass = paramType2;
/*     */     this.currentClassInterfaces = paramList;
/*     */     this.isInterface = paramBoolean;
/*     */   }
/*     */   
/*     */   public void setClassLoader(ClassLoader paramClassLoader) {
/*     */     this.loader = paramClassLoader;
/*     */   }
/*     */   
/*     */   protected boolean isAssignableFrom(Type paramType1, Type paramType2) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   5: ifeq -> 14
/*     */     //   8: iconst_1
/*     */     //   9: ireturn
/*     */     //   10: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   13: athrow
/*     */     //   14: aload_0
/*     */     //   15: getfield currentClass : Lorg/spongepowered/asm/lib/Type;
/*     */     //   18: ifnull -> 120
/*     */     //   21: aload_1
/*     */     //   22: aload_0
/*     */     //   23: getfield currentClass : Lorg/spongepowered/asm/lib/Type;
/*     */     //   26: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 120
/*     */     //   32: goto -> 39
/*     */     //   35: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   38: athrow
/*     */     //   39: aload_0
/*     */     //   40: aload_2
/*     */     //   41: invokevirtual getSuperClass : (Lorg/spongepowered/asm/lib/Type;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   44: ifnonnull -> 60
/*     */     //   47: goto -> 54
/*     */     //   50: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   53: athrow
/*     */     //   54: iconst_0
/*     */     //   55: ireturn
/*     */     //   56: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   59: athrow
/*     */     //   60: aload_0
/*     */     //   61: getfield isInterface : Z
/*     */     //   64: ifeq -> 109
/*     */     //   67: aload_2
/*     */     //   68: invokevirtual getSort : ()I
/*     */     //   71: bipush #10
/*     */     //   73: if_icmpeq -> 99
/*     */     //   76: goto -> 83
/*     */     //   79: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: aload_2
/*     */     //   84: invokevirtual getSort : ()I
/*     */     //   87: bipush #9
/*     */     //   89: if_icmpne -> 107
/*     */     //   92: goto -> 99
/*     */     //   95: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   98: athrow
/*     */     //   99: iconst_1
/*     */     //   100: goto -> 108
/*     */     //   103: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: iconst_0
/*     */     //   108: ireturn
/*     */     //   109: aload_0
/*     */     //   110: aload_1
/*     */     //   111: aload_0
/*     */     //   112: aload_2
/*     */     //   113: invokevirtual getSuperClass : (Lorg/spongepowered/asm/lib/Type;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   116: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   119: ireturn
/*     */     //   120: aload_0
/*     */     //   121: getfield currentClass : Lorg/spongepowered/asm/lib/Type;
/*     */     //   124: ifnull -> 231
/*     */     //   127: aload_2
/*     */     //   128: aload_0
/*     */     //   129: getfield currentClass : Lorg/spongepowered/asm/lib/Type;
/*     */     //   132: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   135: ifeq -> 231
/*     */     //   138: goto -> 145
/*     */     //   141: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: aload_1
/*     */     //   147: aload_0
/*     */     //   148: getfield currentSuperClass : Lorg/spongepowered/asm/lib/Type;
/*     */     //   151: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   154: ifeq -> 170
/*     */     //   157: goto -> 164
/*     */     //   160: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   163: athrow
/*     */     //   164: iconst_1
/*     */     //   165: ireturn
/*     */     //   166: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   169: athrow
/*     */     //   170: aload_0
/*     */     //   171: getfield currentClassInterfaces : Ljava/util/List;
/*     */     //   174: ifnull -> 229
/*     */     //   177: iconst_0
/*     */     //   178: istore_3
/*     */     //   179: iload_3
/*     */     //   180: aload_0
/*     */     //   181: getfield currentClassInterfaces : Ljava/util/List;
/*     */     //   184: invokeinterface size : ()I
/*     */     //   189: if_icmpge -> 229
/*     */     //   192: aload_0
/*     */     //   193: getfield currentClassInterfaces : Ljava/util/List;
/*     */     //   196: iload_3
/*     */     //   197: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   202: checkcast org/spongepowered/asm/lib/Type
/*     */     //   205: astore #4
/*     */     //   207: aload_0
/*     */     //   208: aload_1
/*     */     //   209: aload #4
/*     */     //   211: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   214: ifeq -> 223
/*     */     //   217: iconst_1
/*     */     //   218: ireturn
/*     */     //   219: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   222: athrow
/*     */     //   223: iinc #3, 1
/*     */     //   226: goto -> 179
/*     */     //   229: iconst_0
/*     */     //   230: ireturn
/*     */     //   231: aload_0
/*     */     //   232: aload_1
/*     */     //   233: invokevirtual getClass : (Lorg/spongepowered/asm/lib/Type;)Ljava/lang/Class;
/*     */     //   236: astore_3
/*     */     //   237: aload_3
/*     */     //   238: invokevirtual isInterface : ()Z
/*     */     //   241: ifeq -> 247
/*     */     //   244: ldc java/lang/Object
/*     */     //   246: astore_3
/*     */     //   247: aload_3
/*     */     //   248: aload_0
/*     */     //   249: aload_2
/*     */     //   250: invokevirtual getClass : (Lorg/spongepowered/asm/lib/Type;)Ljava/lang/Class;
/*     */     //   253: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*     */     //   256: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 0
/*     */     //   #112	-> 8
/*     */     //   #29	-> 14
/*     */     //   #48	-> 39
/*     */     //   #60	-> 54
/*     */     //   #49	-> 60
/*     */     //   #85	-> 67
/*     */     //   #50	-> 84
/*     */     //   #92	-> 108
/*     */     //   #34	-> 109
/*     */     //   #27	-> 120
/*     */     //   #11	-> 145
/*     */     //   #15	-> 164
/*     */     //   #64	-> 170
/*     */     //   #109	-> 177
/*     */     //   #95	-> 192
/*     */     //   #56	-> 207
/*     */     //   #3	-> 217
/*     */     //   #113	-> 223
/*     */     //   #31	-> 229
/*     */     //   #114	-> 231
/*     */     //   #37	-> 237
/*     */     //   #67	-> 244
/*     */     //   #12	-> 247
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	10	10	java/lang/RuntimeException
/*     */     //   14	32	35	java/lang/RuntimeException
/*     */     //   21	47	50	java/lang/RuntimeException
/*     */     //   39	56	56	java/lang/RuntimeException
/*     */     //   60	76	79	java/lang/RuntimeException
/*     */     //   67	92	95	java/lang/RuntimeException
/*     */     //   83	103	103	java/lang/RuntimeException
/*     */     //   120	138	141	java/lang/RuntimeException
/*     */     //   127	157	160	java/lang/RuntimeException
/*     */     //   145	166	166	java/lang/RuntimeException
/*     */     //   207	219	219	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   public SimpleVerifier(Type paramType1, Type paramType2, boolean paramBoolean) {
/*     */     this(paramType1, paramType2, null, paramBoolean);
/*     */   }
/*     */   
/*     */   protected boolean isArrayValue(BasicValue paramBasicValue) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual getType : ()Lorg/spongepowered/asm/lib/Type;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: ifnull -> 52
/*     */     //   9: ldc 'Lnull;'
/*     */     //   11: aload_2
/*     */     //   12: invokevirtual getDescriptor : ()Ljava/lang/String;
/*     */     //   15: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   18: ifne -> 44
/*     */     //   21: goto -> 28
/*     */     //   24: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   27: athrow
/*     */     //   28: aload_2
/*     */     //   29: invokevirtual getSort : ()I
/*     */     //   32: bipush #9
/*     */     //   34: if_icmpne -> 52
/*     */     //   37: goto -> 44
/*     */     //   40: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   43: athrow
/*     */     //   44: iconst_1
/*     */     //   45: goto -> 53
/*     */     //   48: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   51: athrow
/*     */     //   52: iconst_0
/*     */     //   53: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #103	-> 0
/*     */     //   #5	-> 5
/*     */     //   #40	-> 12
/*     */     //   #43	-> 53
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   5	21	24	java/lang/RuntimeException
/*     */     //   9	37	40	java/lang/RuntimeException
/*     */     //   28	48	48	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   protected Type getSuperClass(Type paramType) {
/*     */     try {
/*     */       if (this.currentClass != null)
/*     */         try {
/*     */           if (paramType.equals(this.currentClass))
/*     */             return this.currentSuperClass; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw c(null);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     Class<?> clazz = getClass(paramType).getSuperclass();
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw c(null);
/*     */     } 
/*     */     return (clazz == null) ? null : Type.getType(clazz);
/*     */   }
/*     */   
/*     */   public BasicValue merge(BasicValue paramBasicValue1, BasicValue paramBasicValue2) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   5: ifne -> 223
/*     */     //   8: aload_1
/*     */     //   9: invokevirtual getType : ()Lorg/spongepowered/asm/lib/Type;
/*     */     //   12: astore_3
/*     */     //   13: aload_2
/*     */     //   14: invokevirtual getType : ()Lorg/spongepowered/asm/lib/Type;
/*     */     //   17: astore #4
/*     */     //   19: aload_3
/*     */     //   20: ifnull -> 219
/*     */     //   23: aload_3
/*     */     //   24: invokevirtual getSort : ()I
/*     */     //   27: bipush #10
/*     */     //   29: if_icmpeq -> 55
/*     */     //   32: goto -> 39
/*     */     //   35: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   38: athrow
/*     */     //   39: aload_3
/*     */     //   40: invokevirtual getSort : ()I
/*     */     //   43: bipush #9
/*     */     //   45: if_icmpne -> 219
/*     */     //   48: goto -> 55
/*     */     //   51: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   54: athrow
/*     */     //   55: aload #4
/*     */     //   57: ifnull -> 219
/*     */     //   60: goto -> 67
/*     */     //   63: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   66: athrow
/*     */     //   67: aload #4
/*     */     //   69: invokevirtual getSort : ()I
/*     */     //   72: bipush #10
/*     */     //   74: if_icmpeq -> 101
/*     */     //   77: goto -> 84
/*     */     //   80: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   83: athrow
/*     */     //   84: aload #4
/*     */     //   86: invokevirtual getSort : ()I
/*     */     //   89: bipush #9
/*     */     //   91: if_icmpne -> 219
/*     */     //   94: goto -> 101
/*     */     //   97: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   100: athrow
/*     */     //   101: ldc 'Lnull;'
/*     */     //   103: aload_3
/*     */     //   104: invokevirtual getDescriptor : ()Ljava/lang/String;
/*     */     //   107: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   110: ifeq -> 126
/*     */     //   113: goto -> 120
/*     */     //   116: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: aload_2
/*     */     //   121: areturn
/*     */     //   122: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   125: athrow
/*     */     //   126: ldc 'Lnull;'
/*     */     //   128: aload #4
/*     */     //   130: invokevirtual getDescriptor : ()Ljava/lang/String;
/*     */     //   133: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   136: ifeq -> 145
/*     */     //   139: aload_1
/*     */     //   140: areturn
/*     */     //   141: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   144: athrow
/*     */     //   145: aload_0
/*     */     //   146: aload_3
/*     */     //   147: aload #4
/*     */     //   149: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   152: ifeq -> 161
/*     */     //   155: aload_1
/*     */     //   156: areturn
/*     */     //   157: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   160: athrow
/*     */     //   161: aload_0
/*     */     //   162: aload #4
/*     */     //   164: aload_3
/*     */     //   165: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   168: ifeq -> 177
/*     */     //   171: aload_2
/*     */     //   172: areturn
/*     */     //   173: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   176: athrow
/*     */     //   177: aload_3
/*     */     //   178: ifnull -> 189
/*     */     //   181: aload_0
/*     */     //   182: aload_3
/*     */     //   183: invokevirtual isInterface : (Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   186: ifeq -> 197
/*     */     //   189: getstatic org/spongepowered/asm/lib/tree/analysis/BasicValue.REFERENCE_VALUE : Lorg/spongepowered/asm/lib/tree/analysis/BasicValue;
/*     */     //   192: areturn
/*     */     //   193: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   196: athrow
/*     */     //   197: aload_0
/*     */     //   198: aload_3
/*     */     //   199: invokevirtual getSuperClass : (Lorg/spongepowered/asm/lib/Type;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   202: astore_3
/*     */     //   203: aload_0
/*     */     //   204: aload_3
/*     */     //   205: aload #4
/*     */     //   207: invokevirtual isAssignableFrom : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;)Z
/*     */     //   210: ifeq -> 177
/*     */     //   213: aload_0
/*     */     //   214: aload_3
/*     */     //   215: invokevirtual newValue : (Lorg/spongepowered/asm/lib/Type;)Lorg/spongepowered/asm/lib/tree/analysis/BasicValue;
/*     */     //   218: areturn
/*     */     //   219: getstatic org/spongepowered/asm/lib/tree/analysis/BasicValue.UNINITIALIZED_VALUE : Lorg/spongepowered/asm/lib/tree/analysis/BasicValue;
/*     */     //   222: areturn
/*     */     //   223: aload_1
/*     */     //   224: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #108	-> 0
/*     */     //   #69	-> 8
/*     */     //   #89	-> 13
/*     */     //   #26	-> 19
/*     */     //   #25	-> 24
/*     */     //   #73	-> 55
/*     */     //   #58	-> 69
/*     */     //   #20	-> 101
/*     */     //   #63	-> 120
/*     */     //   #96	-> 126
/*     */     //   #45	-> 139
/*     */     //   #74	-> 145
/*     */     //   #86	-> 155
/*     */     //   #111	-> 161
/*     */     //   #93	-> 171
/*     */     //   #84	-> 177
/*     */     //   #22	-> 189
/*     */     //   #98	-> 197
/*     */     //   #65	-> 203
/*     */     //   #105	-> 213
/*     */     //   #54	-> 219
/*     */     //   #16	-> 223
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   19	32	35	java/lang/RuntimeException
/*     */     //   23	48	51	java/lang/RuntimeException
/*     */     //   39	60	63	java/lang/RuntimeException
/*     */     //   55	77	80	java/lang/RuntimeException
/*     */     //   67	94	97	java/lang/RuntimeException
/*     */     //   84	113	116	java/lang/RuntimeException
/*     */     //   101	122	122	java/lang/RuntimeException
/*     */     //   126	141	141	java/lang/RuntimeException
/*     */     //   145	157	157	java/lang/RuntimeException
/*     */     //   161	173	173	java/lang/RuntimeException
/*     */     //   181	193	193	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static Exception c(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\SimpleVerifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */