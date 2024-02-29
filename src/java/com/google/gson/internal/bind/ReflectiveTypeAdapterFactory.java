/*    */ package com.google.gson.internal.bind;
/*    */ public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory { private final ConstructorConstructor constructorConstructor;
/*  3 */   private ReflectiveTypeAdapterFactory$BoundField createBoundField(Gson paramGson, Field paramField, String paramString, TypeToken<?> paramTypeToken, boolean paramBoolean1, boolean paramBoolean2) { boolean bool = Primitives.isPrimitive(paramTypeToken.getRawType());
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
/* 16 */     return new ReflectiveTypeAdapterFactory$1(this, paramString, paramBoolean1, paramBoolean2, paramGson, paramTypeToken, paramField, bool); }
/*    */   private final FieldNamingStrategy fieldNamingPolicy; private final Excluder excluder; public boolean excludeField(Field paramField, boolean paramBoolean) { try {
/*    */       if (!this.excluder.excludeClass(paramField.getType(), paramBoolean))
/*    */         try {
/*    */           if (!this.excluder.excludeField(paramField, paramBoolean));
/*    */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     }  return false; } public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { Class<?> clazz = paramTypeToken.getRawType(); 
/* 27 */     try { if (!Object.class.isAssignableFrom(clazz))
/* 28 */         return null;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  ObjectConstructor objectConstructor = this.constructorConstructor.get(paramTypeToken); return new ReflectiveTypeAdapterFactory$Adapter<T>(objectConstructor, getBoundFields(paramGson, paramTypeToken, clazz), null); } private String getFieldName(Field paramField) { SerializedName serializedName = paramField.<SerializedName>getAnnotation(SerializedName.class); try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (serializedName == null) ? this.fieldNamingPolicy.translateName(paramField) : serializedName.value(); } public ReflectiveTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, FieldNamingStrategy paramFieldNamingStrategy, Excluder paramExcluder) { this.constructorConstructor = paramConstructorConstructor;
/*    */     this.fieldNamingPolicy = paramFieldNamingStrategy;
/* 35 */     this.excluder = paramExcluder; }
/*    */ 
/*    */   
/*    */   private Map<String, ReflectiveTypeAdapterFactory$BoundField> getBoundFields(Gson paramGson, TypeToken<?> paramTypeToken, Class<?> paramClass) {
/*    */     // Byte code:
/*    */     //   0: new java/util/LinkedHashMap
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore #4
/*    */     //   9: aload_3
/*    */     //   10: invokevirtual isInterface : ()Z
/*    */     //   13: ifeq -> 23
/*    */     //   16: aload #4
/*    */     //   18: areturn
/*    */     //   19: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   22: athrow
/*    */     //   23: aload_2
/*    */     //   24: invokevirtual getType : ()Ljava/lang/reflect/Type;
/*    */     //   27: astore #5
/*    */     //   29: aload_3
/*    */     //   30: ldc java/lang/Object
/*    */     //   32: if_acmpeq -> 248
/*    */     //   35: aload_3
/*    */     //   36: invokevirtual getDeclaredFields : ()[Ljava/lang/reflect/Field;
/*    */     //   39: astore #6
/*    */     //   41: aload #6
/*    */     //   43: astore #7
/*    */     //   45: aload #7
/*    */     //   47: arraylength
/*    */     //   48: istore #8
/*    */     //   50: iconst_0
/*    */     //   51: istore #9
/*    */     //   53: iload #9
/*    */     //   55: iload #8
/*    */     //   57: if_icmpge -> 224
/*    */     //   60: aload #7
/*    */     //   62: iload #9
/*    */     //   64: aaload
/*    */     //   65: astore #10
/*    */     //   67: aload_0
/*    */     //   68: aload #10
/*    */     //   70: iconst_1
/*    */     //   71: invokevirtual excludeField : (Ljava/lang/reflect/Field;Z)Z
/*    */     //   74: istore #11
/*    */     //   76: aload_0
/*    */     //   77: aload #10
/*    */     //   79: iconst_0
/*    */     //   80: invokevirtual excludeField : (Ljava/lang/reflect/Field;Z)Z
/*    */     //   83: istore #12
/*    */     //   85: iload #11
/*    */     //   87: ifne -> 109
/*    */     //   90: iload #12
/*    */     //   92: ifne -> 109
/*    */     //   95: goto -> 102
/*    */     //   98: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   101: athrow
/*    */     //   102: goto -> 218
/*    */     //   105: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   108: athrow
/*    */     //   109: aload #10
/*    */     //   111: iconst_1
/*    */     //   112: invokevirtual setAccessible : (Z)V
/*    */     //   115: aload_2
/*    */     //   116: invokevirtual getType : ()Ljava/lang/reflect/Type;
/*    */     //   119: aload_3
/*    */     //   120: aload #10
/*    */     //   122: invokevirtual getGenericType : ()Ljava/lang/reflect/Type;
/*    */     //   125: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*    */     //   128: astore #13
/*    */     //   130: aload_0
/*    */     //   131: aload_1
/*    */     //   132: aload #10
/*    */     //   134: aload_0
/*    */     //   135: aload #10
/*    */     //   137: invokespecial getFieldName : (Ljava/lang/reflect/Field;)Ljava/lang/String;
/*    */     //   140: aload #13
/*    */     //   142: invokestatic get : (Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
/*    */     //   145: iload #11
/*    */     //   147: iload #12
/*    */     //   149: invokespecial createBoundField : (Lcom/google/gson/Gson;Ljava/lang/reflect/Field;Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;ZZ)Lcom/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField;
/*    */     //   152: astore #14
/*    */     //   154: aload #4
/*    */     //   156: aload #14
/*    */     //   158: getfield name : Ljava/lang/String;
/*    */     //   161: aload #14
/*    */     //   163: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   168: checkcast com/google/gson/internal/bind/ReflectiveTypeAdapterFactory$BoundField
/*    */     //   171: astore #15
/*    */     //   173: aload #15
/*    */     //   175: ifnull -> 218
/*    */     //   178: new java/lang/IllegalArgumentException
/*    */     //   181: dup
/*    */     //   182: new java/lang/StringBuilder
/*    */     //   185: dup
/*    */     //   186: invokespecial <init> : ()V
/*    */     //   189: aload #5
/*    */     //   191: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   194: ldc ' declares multiple JSON fields named '
/*    */     //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   199: aload #15
/*    */     //   201: getfield name : Ljava/lang/String;
/*    */     //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   207: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   210: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   213: athrow
/*    */     //   214: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   217: athrow
/*    */     //   218: iinc #9, 1
/*    */     //   221: goto -> 53
/*    */     //   224: aload_2
/*    */     //   225: invokevirtual getType : ()Ljava/lang/reflect/Type;
/*    */     //   228: aload_3
/*    */     //   229: aload_3
/*    */     //   230: invokevirtual getGenericSuperclass : ()Ljava/lang/reflect/Type;
/*    */     //   233: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*    */     //   236: invokestatic get : (Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
/*    */     //   239: astore_2
/*    */     //   240: aload_2
/*    */     //   241: invokevirtual getRawType : ()Ljava/lang/Class;
/*    */     //   244: astore_3
/*    */     //   245: goto -> 29
/*    */     //   248: aload #4
/*    */     //   250: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #36	-> 0
/*    */     //   #32	-> 9
/*    */     //   #14	-> 16
/*    */     //   #10	-> 23
/*    */     //   #20	-> 29
/*    */     //   #4	-> 35
/*    */     //   #13	-> 41
/*    */     //   #30	-> 67
/*    */     //   #34	-> 76
/*    */     //   #37	-> 85
/*    */     //   #22	-> 102
/*    */     //   #33	-> 109
/*    */     //   #1	-> 115
/*    */     //   #5	-> 130
/*    */     //   #12	-> 154
/*    */     //   #11	-> 173
/*    */     //   #2	-> 178
/*    */     //   #18	-> 218
/*    */     //   #29	-> 224
/*    */     //   #17	-> 240
/*    */     //   #25	-> 245
/*    */     //   #19	-> 248
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	19	19	java/lang/IllegalArgumentException
/*    */     //   85	95	98	java/lang/IllegalArgumentException
/*    */     //   90	105	105	java/lang/IllegalArgumentException
/*    */     //   173	214	214	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */