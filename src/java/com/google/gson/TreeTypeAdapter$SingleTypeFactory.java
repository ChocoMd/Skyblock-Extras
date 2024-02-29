/*   */ package com.google.gson;
/*   */ 
/*   */ import com.google.gson.reflect.TypeToken;
/*   */ 
/*   */ class TreeTypeAdapter$SingleTypeFactory implements TypeAdapterFactory {
/*   */   TreeTypeAdapter$SingleTypeFactory(Object paramObject, TypeToken<?> paramTypeToken, boolean paramBoolean, Class<?> paramClass, TreeTypeAdapter$1 paramTreeTypeAdapter$1) {
/* 7 */     this(paramObject, paramTypeToken, paramBoolean, paramClass);
/*   */   }
/*   */   
/*   */   private final TypeToken<?> exactType;
/*   */   private final boolean matchRawType;
/*   */   private final Class<?> hierarchyType;
/*   */   private final JsonSerializer<?> serializer;
/*   */   private final JsonDeserializer<?> deserializer;
/*   */   
/*   */   private TreeTypeAdapter$SingleTypeFactory(Object paramObject, TypeToken<?> paramTypeToken, boolean paramBoolean, Class<?> paramClass) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokespecial <init> : ()V
/*   */     //   4: aload_0
/*   */     //   5: aload_1
/*   */     //   6: instanceof com/google/gson/JsonSerializer
/*   */     //   9: ifeq -> 19
/*   */     //   12: aload_1
/*   */     //   13: checkcast com/google/gson/JsonSerializer
/*   */     //   16: goto -> 20
/*   */     //   19: aconst_null
/*   */     //   20: putfield serializer : Lcom/google/gson/JsonSerializer;
/*   */     //   23: aload_0
/*   */     //   24: aload_1
/*   */     //   25: instanceof com/google/gson/JsonDeserializer
/*   */     //   28: ifeq -> 42
/*   */     //   31: aload_1
/*   */     //   32: checkcast com/google/gson/JsonDeserializer
/*   */     //   35: goto -> 43
/*   */     //   38: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   41: athrow
/*   */     //   42: aconst_null
/*   */     //   43: putfield deserializer : Lcom/google/gson/JsonDeserializer;
/*   */     //   46: aload_0
/*   */     //   47: getfield serializer : Lcom/google/gson/JsonSerializer;
/*   */     //   50: ifnonnull -> 67
/*   */     //   53: aload_0
/*   */     //   54: getfield deserializer : Lcom/google/gson/JsonDeserializer;
/*   */     //   57: ifnull -> 75
/*   */     //   60: goto -> 67
/*   */     //   63: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   66: athrow
/*   */     //   67: iconst_1
/*   */     //   68: goto -> 76
/*   */     //   71: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   74: athrow
/*   */     //   75: iconst_0
/*   */     //   76: invokestatic checkArgument : (Z)V
/*   */     //   79: aload_0
/*   */     //   80: aload_2
/*   */     //   81: putfield exactType : Lcom/google/gson/reflect/TypeToken;
/*   */     //   84: aload_0
/*   */     //   85: iload_3
/*   */     //   86: putfield matchRawType : Z
/*   */     //   89: aload_0
/*   */     //   90: aload #4
/*   */     //   92: putfield hierarchyType : Ljava/lang/Class;
/*   */     //   95: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 0
/*   */     //   #10	-> 4
/*   */     //   #2	-> 23
/*   */     //   #11	-> 46
/*   */     //   #4	-> 79
/*   */     //   #3	-> 84
/*   */     //   #6	-> 89
/*   */     //   #9	-> 95
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   20	38	38	java/lang/RuntimeException
/*   */     //   43	60	63	java/lang/RuntimeException
/*   */     //   53	71	71	java/lang/RuntimeException
/*   */   }
/*   */   
/*   */   public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield exactType : Lcom/google/gson/reflect/TypeToken;
/*   */     //   4: ifnull -> 72
/*   */     //   7: aload_0
/*   */     //   8: getfield exactType : Lcom/google/gson/reflect/TypeToken;
/*   */     //   11: aload_2
/*   */     //   12: invokevirtual equals : (Ljava/lang/Object;)Z
/*   */     //   15: ifne -> 60
/*   */     //   18: goto -> 25
/*   */     //   21: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   24: athrow
/*   */     //   25: aload_0
/*   */     //   26: getfield matchRawType : Z
/*   */     //   29: ifeq -> 68
/*   */     //   32: goto -> 39
/*   */     //   35: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   38: athrow
/*   */     //   39: aload_0
/*   */     //   40: getfield exactType : Lcom/google/gson/reflect/TypeToken;
/*   */     //   43: invokevirtual getType : ()Ljava/lang/reflect/Type;
/*   */     //   46: aload_2
/*   */     //   47: invokevirtual getRawType : ()Ljava/lang/Class;
/*   */     //   50: if_acmpne -> 68
/*   */     //   53: goto -> 60
/*   */     //   56: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   59: athrow
/*   */     //   60: iconst_1
/*   */     //   61: goto -> 83
/*   */     //   64: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   67: athrow
/*   */     //   68: iconst_0
/*   */     //   69: goto -> 83
/*   */     //   72: aload_0
/*   */     //   73: getfield hierarchyType : Ljava/lang/Class;
/*   */     //   76: aload_2
/*   */     //   77: invokevirtual getRawType : ()Ljava/lang/Class;
/*   */     //   80: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*   */     //   83: istore_3
/*   */     //   84: iload_3
/*   */     //   85: ifeq -> 114
/*   */     //   88: new com/google/gson/TreeTypeAdapter
/*   */     //   91: dup
/*   */     //   92: aload_0
/*   */     //   93: getfield serializer : Lcom/google/gson/JsonSerializer;
/*   */     //   96: aload_0
/*   */     //   97: getfield deserializer : Lcom/google/gson/JsonDeserializer;
/*   */     //   100: aload_1
/*   */     //   101: aload_2
/*   */     //   102: aload_0
/*   */     //   103: aconst_null
/*   */     //   104: invokespecial <init> : (Lcom/google/gson/JsonSerializer;Lcom/google/gson/JsonDeserializer;Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapterFactory;Lcom/google/gson/TreeTypeAdapter$1;)V
/*   */     //   107: goto -> 115
/*   */     //   110: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*   */     //   113: athrow
/*   */     //   114: aconst_null
/*   */     //   115: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #8	-> 0
/*   */     //   #5	-> 84
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   0	18	21	java/lang/RuntimeException
/*   */     //   7	32	35	java/lang/RuntimeException
/*   */     //   25	53	56	java/lang/RuntimeException
/*   */     //   39	64	64	java/lang/RuntimeException
/*   */     //   84	110	110	java/lang/RuntimeException
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\TreeTypeAdapter$SingleTypeFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */