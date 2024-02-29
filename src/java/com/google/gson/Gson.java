/*     */ package com.google.gson;
/*   2 */ public final class Gson { public <T> T fromJson(Reader paramReader, Type paramType) throws JsonIOException, JsonSyntaxException { JsonReader jsonReader = new JsonReader(paramReader);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     T t = (T)fromJson(jsonReader, paramType); assertFullConsumption(t, jsonReader); return t; } public <T> TypeAdapter<T> getAdapter(Class<T> paramClass) { return getAdapter(TypeToken.get(paramClass)); } final JsonSerializationContext serializationContext = new Gson$2(this);
/*     */   private TypeAdapter<Number> floatAdapter(boolean paramBoolean) { try { if (paramBoolean)
/*     */         return TypeAdapters.FLOAT;  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */      return new Gson$4(this); }
/*     */   public <T> TypeAdapter<T> getDelegateAdapter(TypeAdapterFactory paramTypeAdapterFactory, TypeToken<T> paramTypeToken) { boolean bool = false; for (TypeAdapterFactory typeAdapterFactory : this.factories) { try { if (!bool)
/*     */           if (typeAdapterFactory == paramTypeAdapterFactory)
/*     */             bool = true;   }
/*     */       catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */        }
/*     */      throw new IllegalArgumentException("GSON cannot serialize " + paramTypeToken); }
/*     */   public JsonElement toJsonTree(Object paramObject) { try { if (paramObject == null)
/*     */         return JsonNull.INSTANCE;  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */      return toJsonTree(paramObject, paramObject.getClass()); }
/*     */   public String toJson(Object paramObject, Type paramType) { StringWriter stringWriter = new StringWriter(); toJson(paramObject, paramType, stringWriter); return stringWriter.toString(); }
/*     */   private void checkValidFloatingPoint(double paramDouble) { try { if (!Double.isNaN(paramDouble))
/*     */         try { if (!Double.isInfinite(paramDouble))
/*     */             return;  throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."); }
/*     */         catch (IllegalArgumentException illegalArgumentException)
/*     */         { throw b(null); }
/*     */           }
/*     */     catch (IllegalArgumentException illegalArgumentException)
/*     */     { throw b(null); }
/*     */      throw new IllegalArgumentException(paramDouble + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."); }
/*     */   public Gson() { this(Excluder.DEFAULT, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, LongSerializationPolicy.DEFAULT, Collections.emptyList()); }
/*     */   public <T> T fromJson(String paramString, Type paramType) throws JsonSyntaxException { try {
/*     */       if (paramString == null)
/*     */         return null; 
/*     */     } catch (JsonSyntaxException jsonSyntaxException) {
/*     */       throw b(null);
/*     */     }  StringReader stringReader = new StringReader(paramString); return (T)fromJson(stringReader, paramType); }
/*     */   public void toJson(Object paramObject, Appendable paramAppendable) throws JsonIOException { try {
/*     */       if (paramObject != null) {
/*     */         toJson(paramObject, paramObject.getClass(), paramAppendable);
/*     */       } else {
/*     */         toJson(JsonNull.INSTANCE, paramAppendable);
/*     */       } 
/*     */     } catch (JsonIOException jsonIOException) {
/*     */       throw b(null);
/*     */     }  }
/* 210 */   public void toJson(JsonElement paramJsonElement, JsonWriter paramJsonWriter) throws JsonIOException { boolean bool1 = paramJsonWriter.isLenient(); paramJsonWriter.setLenient(true); boolean bool2 = paramJsonWriter.isHtmlSafe(); paramJsonWriter.setHtmlSafe(this.htmlSafe); boolean bool3 = paramJsonWriter.getSerializeNulls(); paramJsonWriter.setSerializeNulls(this.serializeNulls); try { Streams.write(paramJsonElement, paramJsonWriter); } catch (IOException iOException) { throw new JsonIOException(iOException); } finally { paramJsonWriter.setLenient(bool1); paramJsonWriter.setHtmlSafe(bool2); paramJsonWriter.setSerializeNulls(bool3); }  }
/*     */   public <T> T fromJson(JsonElement paramJsonElement, Class<T> paramClass) throws JsonSyntaxException { Object object = fromJson(paramJsonElement, paramClass); return Primitives.wrap(paramClass).cast(object); }
/*     */   public void toJson(JsonElement paramJsonElement, Appendable paramAppendable) throws JsonIOException { try { JsonWriter jsonWriter = newJsonWriter(Streams.writerForAppendable(paramAppendable)); toJson(paramJsonElement, jsonWriter); } catch (IOException iOException) { throw new RuntimeException(iOException); }  }
/* 213 */   private TypeAdapter<Number> doubleAdapter(boolean paramBoolean) { try { if (paramBoolean) return TypeAdapters.DOUBLE;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return new Gson$3(this); } private final Map<TypeToken<?>, TypeAdapter<?>> typeTokenCache = Collections.synchronizedMap(new HashMap<TypeToken<?>, TypeAdapter<?>>()); private static void assertFullConsumption(Object paramObject, JsonReader paramJsonReader) { try { try { if (paramObject != null) try { if (paramJsonReader.peek() != JsonToken.END_DOCUMENT) throw new JsonIOException("JSON document was not fully consumed.");  } catch (MalformedJsonException malformedJsonException) { throw b(null); }
/*     */             }
/*     */       catch (MalformedJsonException malformedJsonException)
/*     */       { throw b(null); }
/*     */        }
/*     */     catch (MalformedJsonException malformedJsonException)
/* 219 */     { throw new JsonSyntaxException(malformedJsonException); } catch (IOException iOException) { throw new JsonIOException(iOException); }  }
/* 220 */   private final ThreadLocal<Map<TypeToken<?>, Gson$FutureTypeAdapter<?>>> calls = new ThreadLocal<Map<TypeToken<?>, Gson$FutureTypeAdapter<?>>>(); public JsonElement toJsonTree(Object paramObject, Type paramType) { JsonTreeWriter jsonTreeWriter = new JsonTreeWriter(); toJson(paramObject, paramType, (JsonWriter)jsonTreeWriter); return jsonTreeWriter.get(); } public <T> T fromJson(JsonElement paramJsonElement, Type paramType) throws JsonSyntaxException { try { if (paramJsonElement == null) return null;  } catch (JsonSyntaxException jsonSyntaxException) { throw b(null); }  return fromJson((JsonReader)new JsonTreeReader(paramJsonElement), paramType); } public String toJson(Object paramObject) { try { if (paramObject == null) return toJson(JsonNull.INSTANCE);  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return toJson(paramObject, paramObject.getClass()); } public void toJson(Object paramObject, Type paramType, Appendable paramAppendable) throws JsonIOException { try { JsonWriter jsonWriter = newJsonWriter(Streams.writerForAppendable(paramAppendable)); toJson(paramObject, paramType, jsonWriter); } catch (IOException iOException) { throw new JsonIOException(iOException); }  } private TypeAdapter<Number> longAdapter(LongSerializationPolicy paramLongSerializationPolicy) { try { if (paramLongSerializationPolicy == LongSerializationPolicy.DEFAULT) return TypeAdapters.LONG;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  return new Gson$5(this); } public String toJson(JsonElement paramJsonElement) { StringWriter stringWriter = new StringWriter(); toJson(paramJsonElement, stringWriter); return stringWriter.toString(); } public <T> T fromJson(String paramString, Class<T> paramClass) throws JsonSyntaxException { Object object = fromJson(paramString, paramClass); return Primitives.wrap(paramClass).cast(object); }
/*     */   public void toJson(Object paramObject, Type paramType, JsonWriter paramJsonWriter) throws JsonIOException { TypeAdapter<?> typeAdapter = getAdapter(TypeToken.get(paramType)); boolean bool1 = paramJsonWriter.isLenient(); paramJsonWriter.setLenient(true);
/*     */     boolean bool2 = paramJsonWriter.isHtmlSafe();
/* 223 */     paramJsonWriter.setHtmlSafe(this.htmlSafe); boolean bool3 = paramJsonWriter.getSerializeNulls(); paramJsonWriter.setSerializeNulls(this.serializeNulls); try { typeAdapter.write(paramJsonWriter, paramObject); } catch (IOException iOException) { throw new JsonIOException(iOException); } finally { paramJsonWriter.setLenient(bool1); paramJsonWriter.setHtmlSafe(bool2); paramJsonWriter.setSerializeNulls(bool3); }  } public <T> T fromJson(Reader paramReader, Class<T> paramClass) throws JsonSyntaxException, JsonIOException { JsonReader jsonReader = new JsonReader(paramReader); Object object = fromJson(jsonReader, paramClass); assertFullConsumption(object, jsonReader); return Primitives.wrap(paramClass).cast(object); } final JsonDeserializationContext deserializationContext = new Gson$1(this); static final boolean DEFAULT_JSON_NON_EXECUTABLE = false; private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n"; private final List<TypeAdapterFactory> factories; private final ConstructorConstructor constructorConstructor; private final boolean serializeNulls; private final boolean htmlSafe; private final boolean generateNonExecutableJson; private final boolean prettyPrinting; public <T> TypeAdapter<T> getAdapter(TypeToken<T> paramTypeToken) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield typeTokenCache : Ljava/util/Map;
/*     */     //   4: aload_1
/*     */     //   5: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   10: checkcast com/google/gson/TypeAdapter
/*     */     //   13: astore_2
/*     */     //   14: aload_2
/*     */     //   15: ifnull -> 24
/*     */     //   18: aload_2
/*     */     //   19: areturn
/*     */     //   20: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   23: athrow
/*     */     //   24: aload_0
/*     */     //   25: getfield calls : Ljava/lang/ThreadLocal;
/*     */     //   28: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   31: checkcast java/util/Map
/*     */     //   34: astore_3
/*     */     //   35: iconst_0
/*     */     //   36: istore #4
/*     */     //   38: aload_3
/*     */     //   39: ifnonnull -> 61
/*     */     //   42: new java/util/HashMap
/*     */     //   45: dup
/*     */     //   46: invokespecial <init> : ()V
/*     */     //   49: astore_3
/*     */     //   50: aload_0
/*     */     //   51: getfield calls : Ljava/lang/ThreadLocal;
/*     */     //   54: aload_3
/*     */     //   55: invokevirtual set : (Ljava/lang/Object;)V
/*     */     //   58: iconst_1
/*     */     //   59: istore #4
/*     */     //   61: aload_3
/*     */     //   62: aload_1
/*     */     //   63: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   68: checkcast com/google/gson/Gson$FutureTypeAdapter
/*     */     //   71: astore #5
/*     */     //   73: aload #5
/*     */     //   75: ifnull -> 85
/*     */     //   78: aload #5
/*     */     //   80: areturn
/*     */     //   81: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   84: athrow
/*     */     //   85: new com/google/gson/Gson$FutureTypeAdapter
/*     */     //   88: dup
/*     */     //   89: invokespecial <init> : ()V
/*     */     //   92: astore #6
/*     */     //   94: aload_3
/*     */     //   95: aload_1
/*     */     //   96: aload #6
/*     */     //   98: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   103: pop
/*     */     //   104: aload_0
/*     */     //   105: getfield factories : Ljava/util/List;
/*     */     //   108: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   113: astore #7
/*     */     //   115: aload #7
/*     */     //   117: invokeinterface hasNext : ()Z
/*     */     //   122: ifeq -> 210
/*     */     //   125: aload #7
/*     */     //   127: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   132: checkcast com/google/gson/TypeAdapterFactory
/*     */     //   135: astore #8
/*     */     //   137: aload #8
/*     */     //   139: aload_0
/*     */     //   140: aload_1
/*     */     //   141: invokeinterface create : (Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
/*     */     //   146: astore #9
/*     */     //   148: aload #9
/*     */     //   150: ifnull -> 207
/*     */     //   153: aload #6
/*     */     //   155: aload #9
/*     */     //   157: invokevirtual setDelegate : (Lcom/google/gson/TypeAdapter;)V
/*     */     //   160: aload_0
/*     */     //   161: getfield typeTokenCache : Ljava/util/Map;
/*     */     //   164: aload_1
/*     */     //   165: aload #9
/*     */     //   167: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   172: pop
/*     */     //   173: aload #9
/*     */     //   175: astore #10
/*     */     //   177: aload_3
/*     */     //   178: aload_1
/*     */     //   179: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   184: pop
/*     */     //   185: iload #4
/*     */     //   187: ifeq -> 204
/*     */     //   190: aload_0
/*     */     //   191: getfield calls : Ljava/lang/ThreadLocal;
/*     */     //   194: invokevirtual remove : ()V
/*     */     //   197: goto -> 204
/*     */     //   200: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   203: athrow
/*     */     //   204: aload #10
/*     */     //   206: areturn
/*     */     //   207: goto -> 115
/*     */     //   210: new java/lang/IllegalArgumentException
/*     */     //   213: dup
/*     */     //   214: new java/lang/StringBuilder
/*     */     //   217: dup
/*     */     //   218: invokespecial <init> : ()V
/*     */     //   221: ldc 'GSON cannot handle '
/*     */     //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   226: aload_1
/*     */     //   227: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   230: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   233: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   236: athrow
/*     */     //   237: astore #11
/*     */     //   239: aload_3
/*     */     //   240: aload_1
/*     */     //   241: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   246: pop
/*     */     //   247: iload #4
/*     */     //   249: ifeq -> 266
/*     */     //   252: aload_0
/*     */     //   253: getfield calls : Ljava/lang/ThreadLocal;
/*     */     //   256: invokevirtual remove : ()V
/*     */     //   259: goto -> 266
/*     */     //   262: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   265: athrow
/*     */     //   266: aload #11
/*     */     //   268: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #193	-> 0
/*     */     //   #33	-> 14
/*     */     //   #49	-> 18
/*     */     //   #131	-> 24
/*     */     //   #194	-> 35
/*     */     //   #117	-> 38
/*     */     //   #80	-> 42
/*     */     //   #151	-> 50
/*     */     //   #104	-> 58
/*     */     //   #73	-> 61
/*     */     //   #86	-> 73
/*     */     //   #212	-> 78
/*     */     //   #3	-> 85
/*     */     //   #184	-> 94
/*     */     //   #43	-> 104
/*     */     //   #59	-> 137
/*     */     //   #208	-> 148
/*     */     //   #155	-> 153
/*     */     //   #14	-> 160
/*     */     //   #20	-> 173
/*     */     //   #81	-> 177
/*     */     //   #41	-> 185
/*     */     //   #147	-> 190
/*     */     //   #21	-> 207
/*     */     //   #148	-> 210
/*     */     //   #138	-> 237
/*     */     //   #113	-> 247
/*     */     //   #215	-> 252
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	20	20	java/lang/IllegalArgumentException
/*     */     //   73	81	81	java/lang/IllegalArgumentException
/*     */     //   85	177	237	finally
/*     */     //   177	197	200	java/lang/IllegalArgumentException
/*     */     //   207	239	237	finally
/*     */     //   239	259	262	java/lang/IllegalArgumentException } public <T> T fromJson(JsonReader paramJsonReader, Type paramType) throws JsonIOException, JsonSyntaxException { boolean bool = true; boolean bool1 = paramJsonReader.isLenient(); paramJsonReader.setLenient(true); try { paramJsonReader.peek(); bool = false; TypeToken<?> typeToken = TypeToken.get(paramType); TypeAdapter<?> typeAdapter = getAdapter(typeToken); Object object = typeAdapter.read(paramJsonReader); return (T)object; } catch (EOFException eOFException) { if (bool) return null;  throw new JsonSyntaxException(eOFException); } catch (IllegalStateException illegalStateException) { throw new JsonSyntaxException(illegalStateException); } catch (IOException iOException) { throw new JsonSyntaxException(iOException); } finally { paramJsonReader.setLenient(bool1); }  }
/* 224 */   Gson(Excluder paramExcluder, FieldNamingStrategy paramFieldNamingStrategy, Map<Type, InstanceCreator<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, LongSerializationPolicy paramLongSerializationPolicy, List<TypeAdapterFactory> paramList) { this.constructorConstructor = new ConstructorConstructor(paramMap); this.serializeNulls = paramBoolean1; this.generateNonExecutableJson = paramBoolean3; this.htmlSafe = paramBoolean4; this.prettyPrinting = paramBoolean5; ArrayList<TypeAdapterFactory> arrayList = new ArrayList(); arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY); arrayList.add(ObjectTypeAdapter.FACTORY); arrayList.add(paramExcluder); arrayList.addAll(paramList); arrayList.add(TypeAdapters.STRING_FACTORY); arrayList.add(TypeAdapters.INTEGER_FACTORY); arrayList.add(TypeAdapters.BOOLEAN_FACTORY); arrayList.add(TypeAdapters.BYTE_FACTORY); arrayList.add(TypeAdapters.SHORT_FACTORY);
/*     */     arrayList.add(TypeAdapters.newFactory(long.class, Long.class, longAdapter(paramLongSerializationPolicy)));
/*     */     arrayList.add(TypeAdapters.newFactory(double.class, Double.class, doubleAdapter(paramBoolean6)));
/*     */     arrayList.add(TypeAdapters.newFactory(float.class, Float.class, floatAdapter(paramBoolean6)));
/*     */     arrayList.add(TypeAdapters.NUMBER_FACTORY);
/*     */     arrayList.add(TypeAdapters.CHARACTER_FACTORY);
/*     */     arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
/*     */     arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
/*     */     arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
/*     */     arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
/*     */     arrayList.add(TypeAdapters.URL_FACTORY);
/*     */     arrayList.add(TypeAdapters.URI_FACTORY);
/*     */     arrayList.add(TypeAdapters.UUID_FACTORY);
/*     */     arrayList.add(TypeAdapters.LOCALE_FACTORY);
/*     */     arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
/*     */     arrayList.add(TypeAdapters.BIT_SET_FACTORY);
/*     */     arrayList.add(DateTypeAdapter.FACTORY);
/*     */     arrayList.add(TypeAdapters.CALENDAR_FACTORY);
/*     */     arrayList.add(TimeTypeAdapter.FACTORY);
/*     */     arrayList.add(SqlDateTypeAdapter.FACTORY);
/*     */     arrayList.add(TypeAdapters.TIMESTAMP_FACTORY);
/*     */     arrayList.add(ArrayTypeAdapter.FACTORY);
/*     */     arrayList.add(TypeAdapters.ENUM_FACTORY);
/*     */     arrayList.add(TypeAdapters.CLASS_FACTORY);
/*     */     arrayList.add(new CollectionTypeAdapterFactory(this.constructorConstructor));
/*     */     arrayList.add(new MapTypeAdapterFactory(this.constructorConstructor, paramBoolean2));
/*     */     arrayList.add(new ReflectiveTypeAdapterFactory(this.constructorConstructor, paramFieldNamingStrategy, paramExcluder));
/*     */     this.factories = Collections.unmodifiableList(arrayList); }
/*     */ 
/*     */   
/*     */   public String toString() {
/*     */     return "{serializeNulls:" + this.serializeNulls + "factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
/*     */   }
/*     */   
/*     */   private JsonWriter newJsonWriter(Writer paramWriter) throws IOException {
/*     */     try {
/*     */       if (this.generateNonExecutableJson)
/*     */         paramWriter.write(")]}'\n"); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     JsonWriter jsonWriter = new JsonWriter(paramWriter);
/*     */     try {
/*     */       if (this.prettyPrinting)
/*     */         jsonWriter.setIndent("  "); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     jsonWriter.setSerializeNulls(this.serializeNulls);
/*     */     return jsonWriter;
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */