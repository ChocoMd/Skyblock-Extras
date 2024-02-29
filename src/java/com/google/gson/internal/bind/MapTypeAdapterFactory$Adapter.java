/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonPrimitive;
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Map;
/*    */ 
/*    */ final class MapTypeAdapterFactory$Adapter<K, V> extends TypeAdapter<Map<K, V>> {
/*    */   private final TypeAdapter<K> keyTypeAdapter;
/*    */   private final TypeAdapter<V> valueTypeAdapter;
/*    */   private final ObjectConstructor<? extends Map<K, V>> constructor;
/*    */   final MapTypeAdapterFactory this$0;
/*    */   
/* 18 */   public Map<K, V> read(JsonReader paramJsonReader) throws IOException { JsonToken jsonToken = paramJsonReader.peek();
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
/* 76 */     try { if (jsonToken == JsonToken.NULL) { paramJsonReader.nextNull(); return null; }  } catch (IOException iOException) { throw b(null); }  Map<Object, Object> map = (Map)this.constructor.construct(); try { if (jsonToken == JsonToken.BEGIN_ARRAY) { paramJsonReader.beginArray(); for (; paramJsonReader.hasNext(); object2 = this.valueTypeAdapter.read(paramJsonReader)) { Object object2; paramJsonReader.beginArray(); Object object1 = this.keyTypeAdapter.read(paramJsonReader); }  paramJsonReader.endArray(); }  }
/*    */     catch (IOException iOException) { throw b(null); }
/* 78 */      paramJsonReader.beginObject(); for (; paramJsonReader.hasNext(); object2 = this.valueTypeAdapter.read(paramJsonReader), object = map.put(object1, object2)) {
/*    */       Object object2; Object object; JsonReaderInternalAccess.INSTANCE.promoteNameToValue(paramJsonReader); Object object1 = this.keyTypeAdapter.read(paramJsonReader);
/*    */     } 
/*    */     paramJsonReader.endObject();
/* 82 */     return (Map)map; } public void write(JsonWriter paramJsonWriter, Map<K, V> paramMap) throws IOException { try { if (paramMap == null) { paramJsonWriter.nullValue(); return; }  } catch (IOException iOException) { throw b(null); }  if (!MapTypeAdapterFactory.access$000(MapTypeAdapterFactory.this)) { paramJsonWriter.beginObject(); Iterator iterator = paramMap.entrySet().iterator(); }
/* 83 */      boolean bool = false; ArrayList<JsonElement> arrayList = new ArrayList(paramMap.size()); ArrayList arrayList1 = new ArrayList(paramMap.size());
/*    */     for (Map.Entry<K, V> entry : paramMap.entrySet()) {
/*    */       continue;
/*    */       jsonElement = this.keyTypeAdapter.toJsonTree(SYNTHETIC_LOCAL_VARIABLE_7.getKey());
/*    */     } 
/*    */     if (bool) {
/*    */       paramJsonWriter.beginArray();
/*    */       boolean bool1 = false;
/*    */     } 
/*    */     paramJsonWriter.beginObject();
/*    */     for (byte b = 0; b < arrayList.size(); ) {
/*    */       JsonElement jsonElement = arrayList.get(b);
/*    */       paramJsonWriter.name(keyToString(jsonElement));
/*    */       this.valueTypeAdapter.write(paramJsonWriter, arrayList1.get(b));
/*    */       b++;
/*    */     } 
/*    */     paramJsonWriter.endObject(); }
/*    */ 
/*    */   
/*    */   private String keyToString(JsonElement paramJsonElement) {
/*    */     if (paramJsonElement.isJsonPrimitive()) {
/*    */       JsonPrimitive jsonPrimitive = paramJsonElement.getAsJsonPrimitive();
/*    */       try {
/*    */         if (jsonPrimitive.isNumber())
/*    */           return String.valueOf(jsonPrimitive.getAsNumber()); 
/*    */       } catch (JsonSyntaxException jsonSyntaxException) {
/*    */         throw b(null);
/*    */       } 
/*    */       try {
/*    */         if (jsonPrimitive.isBoolean())
/*    */           return Boolean.toString(jsonPrimitive.getAsBoolean()); 
/*    */       } catch (JsonSyntaxException jsonSyntaxException) {
/*    */         throw b(null);
/*    */       } 
/*    */       try {
/*    */         if (jsonPrimitive.isString())
/*    */           return jsonPrimitive.getAsString(); 
/*    */       } catch (JsonSyntaxException jsonSyntaxException) {
/*    */         throw b(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (paramJsonElement.isJsonNull())
/*    */         return "null"; 
/*    */     } catch (JsonSyntaxException jsonSyntaxException) {
/*    */       throw b(null);
/*    */     } 
/*    */     throw new AssertionError();
/*    */   }
/*    */   
/*    */   public MapTypeAdapterFactory$Adapter(Gson paramGson, Type paramType1, TypeAdapter<K> paramTypeAdapter, Type paramType2, TypeAdapter<V> paramTypeAdapter1, ObjectConstructor<? extends Map<K, V>> paramObjectConstructor) {
/*    */     this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper<K>(paramGson, paramTypeAdapter, paramType1);
/*    */     this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper<V>(paramGson, paramTypeAdapter1, paramType2);
/*    */     this.constructor = paramObjectConstructor;
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\MapTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */