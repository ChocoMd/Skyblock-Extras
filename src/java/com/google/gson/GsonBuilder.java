/*    */ package com.google.gson;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class GsonBuilder {
/*    */   public GsonBuilder registerTypeHierarchyAdapter(Class<?> paramClass, Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/google/gson/JsonSerializer
/*    */     //   4: ifne -> 35
/*    */     //   7: aload_2
/*    */     //   8: instanceof com/google/gson/JsonDeserializer
/*    */     //   11: ifne -> 35
/*    */     //   14: goto -> 21
/*    */     //   17: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   20: athrow
/*    */     //   21: aload_2
/*    */     //   22: instanceof com/google/gson/TypeAdapter
/*    */     //   25: ifeq -> 43
/*    */     //   28: goto -> 35
/*    */     //   31: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   34: athrow
/*    */     //   35: iconst_1
/*    */     //   36: goto -> 44
/*    */     //   39: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   42: athrow
/*    */     //   43: iconst_0
/*    */     //   44: invokestatic checkArgument : (Z)V
/*    */     //   47: aload_2
/*    */     //   48: instanceof com/google/gson/JsonDeserializer
/*    */     //   51: ifne -> 68
/*    */     //   54: aload_2
/*    */     //   55: instanceof com/google/gson/JsonSerializer
/*    */     //   58: ifeq -> 90
/*    */     //   61: goto -> 68
/*    */     //   64: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   67: athrow
/*    */     //   68: aload_0
/*    */     //   69: getfield hierarchyFactories : Ljava/util/List;
/*    */     //   72: iconst_0
/*    */     //   73: aload_1
/*    */     //   74: aload_2
/*    */     //   75: invokestatic newTypeHierarchyFactory : (Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
/*    */     //   78: invokeinterface add : (ILjava/lang/Object;)V
/*    */     //   83: goto -> 90
/*    */     //   86: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   89: athrow
/*    */     //   90: aload_2
/*    */     //   91: instanceof com/google/gson/TypeAdapter
/*    */     //   94: ifeq -> 122
/*    */     //   97: aload_0
/*    */     //   98: getfield factories : Ljava/util/List;
/*    */     //   101: aload_1
/*    */     //   102: aload_2
/*    */     //   103: checkcast com/google/gson/TypeAdapter
/*    */     //   106: invokestatic newTypeHierarchyFactory : (Ljava/lang/Class;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
/*    */     //   109: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   114: pop
/*    */     //   115: goto -> 122
/*    */     //   118: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   121: athrow
/*    */     //   122: aload_0
/*    */     //   123: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 0
/*    */     //   #61	-> 47
/*    */     //   #33	-> 68
/*    */     //   #80	-> 90
/*    */     //   #58	-> 97
/*    */     //   #12	-> 122
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	14	17	java/lang/RuntimeException
/*    */     //   7	28	31	java/lang/RuntimeException
/*    */     //   21	39	39	java/lang/RuntimeException
/*    */     //   44	61	64	java/lang/RuntimeException
/*    */     //   54	83	86	java/lang/RuntimeException
/*    */     //   90	115	118	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy paramLongSerializationPolicy) {
/* 11 */     this.longSerializationPolicy = paramLongSerializationPolicy;
/*    */ 
/*    */     
/* 14 */     return this;
/*    */   }
/* 16 */   private final List<TypeAdapterFactory> factories = new ArrayList<TypeAdapterFactory>();
/* 17 */   private int timeStyle = 2;
/* 18 */   public GsonBuilder setDateFormat(int paramInt) { this.dateStyle = paramInt;
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
/*    */     this.datePattern = null;
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
/* 45 */     return this; }
/*    */   public GsonBuilder excludeFieldsWithModifiers(int... paramVarArgs) { this.excluder = this.excluder.withModifiers(paramVarArgs);
/*    */     return this; }
/*    */   public GsonBuilder serializeNulls() { this.serializeNulls = true;
/*    */     return this; } private Excluder excluder = Excluder.DEFAULT; private final Map<Type, InstanceCreator<?>> instanceCreators = new HashMap<Type, InstanceCreator<?>>(); private final List<TypeAdapterFactory> hierarchyFactories = new ArrayList<TypeAdapterFactory>(); private LongSerializationPolicy longSerializationPolicy; private FieldNamingStrategy fieldNamingPolicy; private boolean serializeNulls; private String datePattern; private int dateStyle; public Gson create() { ArrayList<TypeAdapterFactory> arrayList = new ArrayList();
/* 50 */     arrayList.addAll(this.factories);
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
/*    */     Collections.reverse(arrayList);
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
/* 83 */     arrayList.addAll(this.hierarchyFactories); addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList); return new Gson(this.excluder, this.fieldNamingPolicy, this.instanceCreators, this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.prettyPrinting, this.serializeSpecialFloatingPointValues, this.longSerializationPolicy, arrayList); }
/*    */   private boolean complexMapKeySerialization; private boolean serializeSpecialFloatingPointValues; private boolean escapeHtmlChars; private boolean prettyPrinting; private boolean generateNonExecutableJson; public GsonBuilder() { this.hierarchyFactories = new ArrayList<TypeAdapterFactory>(); this.dateStyle = 2; this.timeStyle = 2; this.escapeHtmlChars = true; } public GsonBuilder disableInnerClassSerialization() { this.excluder = this.excluder.disableInnerClassSerialization(); return this; } public GsonBuilder registerTypeAdapter(Type paramType, Object paramObject) { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/google/gson/JsonSerializer
/*    */     //   4: ifne -> 49
/*    */     //   7: aload_2
/*    */     //   8: instanceof com/google/gson/JsonDeserializer
/*    */     //   11: ifne -> 49
/*    */     //   14: goto -> 21
/*    */     //   17: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   20: athrow
/*    */     //   21: aload_2
/*    */     //   22: instanceof com/google/gson/InstanceCreator
/*    */     //   25: ifne -> 49
/*    */     //   28: goto -> 35
/*    */     //   31: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   34: athrow
/*    */     //   35: aload_2
/*    */     //   36: instanceof com/google/gson/TypeAdapter
/*    */     //   39: ifeq -> 57
/*    */     //   42: goto -> 49
/*    */     //   45: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   48: athrow
/*    */     //   49: iconst_1
/*    */     //   50: goto -> 58
/*    */     //   53: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   56: athrow
/*    */     //   57: iconst_0
/*    */     //   58: invokestatic checkArgument : (Z)V
/*    */     //   61: aload_2
/*    */     //   62: instanceof com/google/gson/InstanceCreator
/*    */     //   65: ifeq -> 90
/*    */     //   68: aload_0
/*    */     //   69: getfield instanceCreators : Ljava/util/Map;
/*    */     //   72: aload_1
/*    */     //   73: aload_2
/*    */     //   74: checkcast com/google/gson/InstanceCreator
/*    */     //   77: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   82: pop
/*    */     //   83: goto -> 90
/*    */     //   86: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   89: athrow
/*    */     //   90: aload_2
/*    */     //   91: instanceof com/google/gson/JsonSerializer
/*    */     //   94: ifne -> 111
/*    */     //   97: aload_2
/*    */     //   98: instanceof com/google/gson/JsonDeserializer
/*    */     //   101: ifeq -> 131
/*    */     //   104: goto -> 111
/*    */     //   107: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   110: athrow
/*    */     //   111: aload_1
/*    */     //   112: invokestatic get : (Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
/*    */     //   115: astore_3
/*    */     //   116: aload_0
/*    */     //   117: getfield factories : Ljava/util/List;
/*    */     //   120: aload_3
/*    */     //   121: aload_2
/*    */     //   122: invokestatic newFactoryWithMatchRawType : (Lcom/google/gson/reflect/TypeToken;Ljava/lang/Object;)Lcom/google/gson/TypeAdapterFactory;
/*    */     //   125: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   130: pop
/*    */     //   131: aload_2
/*    */     //   132: instanceof com/google/gson/TypeAdapter
/*    */     //   135: ifeq -> 166
/*    */     //   138: aload_0
/*    */     //   139: getfield factories : Ljava/util/List;
/*    */     //   142: aload_1
/*    */     //   143: invokestatic get : (Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;
/*    */     //   146: aload_2
/*    */     //   147: checkcast com/google/gson/TypeAdapter
/*    */     //   150: invokestatic newFactory : (Lcom/google/gson/reflect/TypeToken;Lcom/google/gson/TypeAdapter;)Lcom/google/gson/TypeAdapterFactory;
/*    */     //   153: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   158: pop
/*    */     //   159: goto -> 166
/*    */     //   162: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   165: athrow
/*    */     //   166: aload_0
/*    */     //   167: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 0
/*    */     //   #5	-> 61
/*    */     //   #8	-> 68
/*    */     //   #25	-> 90
/*    */     //   #2	-> 111
/*    */     //   #48	-> 116
/*    */     //   #38	-> 131
/*    */     //   #19	-> 138
/*    */     //   #51	-> 166
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	14	17	java/lang/RuntimeException
/*    */     //   7	28	31	java/lang/RuntimeException
/*    */     //   21	42	45	java/lang/RuntimeException
/*    */     //   35	53	53	java/lang/RuntimeException
/*    */     //   58	83	86	java/lang/RuntimeException
/*    */     //   90	104	107	java/lang/RuntimeException
/* 84 */     //   131	159	162	java/lang/RuntimeException } public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy) { this.excluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, true, false); return this; } public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory paramTypeAdapterFactory) { this.factories.add(paramTypeAdapterFactory); return this; }
/*    */   public GsonBuilder serializeSpecialFloatingPointValues() { this.serializeSpecialFloatingPointValues = true; return this; }
/* 86 */   public GsonBuilder setDateFormat(int paramInt1, int paramInt2) { this.dateStyle = paramInt1; this.timeStyle = paramInt2; this.datePattern = null;
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy paramFieldNamingPolicy) {
/*    */     this.fieldNamingPolicy = paramFieldNamingPolicy;
/*    */     return this;
/*    */   }
/*    */   
/*    */   private void addTypeAdaptersForDate(String paramString, int paramInt1, int paramInt2, List<TypeAdapterFactory> paramList) {
/*    */     DefaultDateTypeAdapter defaultDateTypeAdapter;
/*    */     try {
/*    */       if (paramString != null && !"".equals(paramString.trim())) {
/*    */         defaultDateTypeAdapter = new DefaultDateTypeAdapter(paramString);
/*    */       } else {
/*    */         try {
/*    */           if (paramInt1 != 2 && paramInt2 != 2) {
/*    */             defaultDateTypeAdapter = new DefaultDateTypeAdapter(paramInt1, paramInt2);
/*    */           } else {
/*    */             return;
/*    */           } 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramList.add(TreeTypeAdapter.newFactory(TypeToken.get(Date.class), defaultDateTypeAdapter));
/*    */     paramList.add(TreeTypeAdapter.newFactory(TypeToken.get(Timestamp.class), defaultDateTypeAdapter));
/*    */     paramList.add(TreeTypeAdapter.newFactory(TypeToken.get(Date.class), defaultDateTypeAdapter));
/*    */   }
/*    */   
/*    */   public GsonBuilder setVersion(double paramDouble) {
/*    */     this.excluder = this.excluder.withVersion(paramDouble);
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder disableHtmlEscaping() {
/*    */     this.escapeHtmlChars = false;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder generateNonExecutableJson() {
/*    */     this.generateNonExecutableJson = true;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder setDateFormat(String paramString) {
/*    */     this.datePattern = paramString;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
/*    */     this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder setExclusionStrategies(ExclusionStrategy... paramVarArgs) {
/*    */     ExclusionStrategy[] arrayOfExclusionStrategy;
/*    */     int i;
/*    */     byte b;
/*    */     for (arrayOfExclusionStrategy = paramVarArgs, i = arrayOfExclusionStrategy.length, b = 0; b < i; ) {
/*    */       ExclusionStrategy exclusionStrategy = arrayOfExclusionStrategy[b];
/*    */       this.excluder = this.excluder.withExclusionStrategy(exclusionStrategy, true, true);
/*    */       b++;
/*    */     } 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder setPrettyPrinting() {
/*    */     this.prettyPrinting = true;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy paramExclusionStrategy) {
/*    */     this.excluder = this.excluder.withExclusionStrategy(paramExclusionStrategy, false, true);
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy paramFieldNamingStrategy) {
/*    */     this.fieldNamingPolicy = paramFieldNamingStrategy;
/*    */     return this;
/*    */   }
/*    */   
/*    */   public GsonBuilder enableComplexMapKeySerialization() {
/*    */     this.complexMapKeySerialization = true;
/*    */     return this;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\GsonBuilder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */