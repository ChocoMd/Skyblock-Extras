/*    */ package com.google.gson;final class TreeTypeAdapter<T> extends TypeAdapter<T> { private final JsonSerializer<T> serializer; private final JsonDeserializer<T> deserializer; private final Gson gson; public static TypeAdapterFactory newFactoryWithMatchRawType(TypeToken<?> paramTypeToken, Object paramObject) { try {  }
/*    */     catch (RuntimeException runtimeException)
/*  3 */     { throw b(null); }  boolean bool = (paramTypeToken.getType() == paramTypeToken.getRawType()) ? true : false;
/*  4 */     return new TreeTypeAdapter$SingleTypeFactory(paramObject, paramTypeToken, bool, null, null); } private final TypeToken<T> typeToken; private final TypeAdapterFactory skipPast; private TypeAdapter<T> delegate; private TypeAdapter<T> delegate() { TypeAdapter<T> typeAdapter = this.delegate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/* 15 */     { throw b(null); }  return (typeAdapter != null) ? typeAdapter : (this.delegate = this.gson.<T>getDelegateAdapter(this.skipPast, this.typeToken)); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public T read(JsonReader paramJsonReader) throws IOException {
/*    */     try {
/*    */       if (this.deserializer == null) {
/*    */         return delegate().read(paramJsonReader);
/*    */       }
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/* 29 */     JsonElement jsonElement = Streams.parse(paramJsonReader);
/*    */     try {
/*    */       if (jsonElement.isJsonNull())
/*    */         return null; 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.deserializer.deserialize(jsonElement, this.typeToken.getType(), this.gson.deserializationContext);
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, T paramT) throws IOException {
/*    */     try {
/*    */       if (this.serializer == null) {
/*    */         delegate().write(paramJsonWriter, paramT);
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramT == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     JsonElement jsonElement = this.serializer.serialize(paramT, this.typeToken.getType(), this.gson.serializationContext);
/*    */     Streams.write(jsonElement, paramJsonWriter);
/*    */   }
/*    */   
/*    */   private TreeTypeAdapter(JsonSerializer<T> paramJsonSerializer, JsonDeserializer<T> paramJsonDeserializer, Gson paramGson, TypeToken<T> paramTypeToken, TypeAdapterFactory paramTypeAdapterFactory) {
/*    */     this.serializer = paramJsonSerializer;
/*    */     this.deserializer = paramJsonDeserializer;
/*    */     this.gson = paramGson;
/*    */     this.typeToken = paramTypeToken;
/*    */     this.skipPast = paramTypeAdapterFactory;
/*    */   }
/*    */   
/*    */   public static TypeAdapterFactory newTypeHierarchyFactory(Class<?> paramClass, Object paramObject) {
/*    */     return new TreeTypeAdapter$SingleTypeFactory(paramObject, null, false, paramClass, null);
/*    */   }
/*    */   
/*    */   TreeTypeAdapter(JsonSerializer<T> paramJsonSerializer, JsonDeserializer<T> paramJsonDeserializer, Gson paramGson, TypeToken<T> paramTypeToken, TypeAdapterFactory paramTypeAdapterFactory, TreeTypeAdapter$1 paramTreeTypeAdapter$1) {
/*    */     this(paramJsonSerializer, paramJsonDeserializer, paramGson, paramTypeToken, paramTypeAdapterFactory);
/*    */   }
/*    */   
/*    */   public static TypeAdapterFactory newFactory(TypeToken<?> paramTypeToken, Object paramObject) {
/*    */     return new TreeTypeAdapter$SingleTypeFactory(paramObject, paramTypeToken, false, null, null);
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\TreeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */