/*  1 */ package com.google.gson.internal.bind;public final class ObjectTypeAdapter extends TypeAdapter<Object> { public Object read(JsonReader paramJsonReader) throws IOException { ArrayList<Object> arrayList; LinkedTreeMap<String, Object> linkedTreeMap; JsonToken jsonToken = paramJsonReader.peek();
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
/* 15 */     switch (ObjectTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
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
/*    */       case 1:
/* 35 */         arrayList = new ArrayList();
/*    */         paramJsonReader.beginArray();
/*    */         try {
/*    */           while (paramJsonReader.hasNext())
/*    */             arrayList.add(read(paramJsonReader)); 
/*    */         } catch (IOException iOException) {
/*    */           throw b(null);
/*    */         } 
/*    */         paramJsonReader.endArray();
/*    */         return arrayList;
/*    */       case 2:
/*    */         linkedTreeMap = new LinkedTreeMap();
/*    */         paramJsonReader.beginObject();
/*    */         try {
/*    */           while (paramJsonReader.hasNext())
/*    */             linkedTreeMap.put(paramJsonReader.nextName(), read(paramJsonReader)); 
/*    */         } catch (IOException iOException) {
/*    */           throw b(null);
/*    */         } 
/*    */         paramJsonReader.endObject();
/*    */         return linkedTreeMap;
/*    */       case 3:
/*    */         return paramJsonReader.nextString();
/*    */       case 4:
/*    */         return Double.valueOf(paramJsonReader.nextDouble());
/*    */       case 5:
/*    */         return Boolean.valueOf(paramJsonReader.nextBoolean());
/*    */       case 6:
/*    */         paramJsonReader.nextNull();
/*    */         return null;
/*    */     } 
/*    */     throw new IllegalStateException(); }
/*    */ 
/*    */   
/*    */   public static final TypeAdapterFactory FACTORY = new ObjectTypeAdapter$1();
/*    */   private final Gson gson;
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
/*    */     try {
/*    */       if (paramObject == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     TypeAdapter typeAdapter = this.gson.getAdapter(paramObject.getClass());
/*    */     try {
/*    */       if (typeAdapter instanceof ObjectTypeAdapter) {
/*    */         paramJsonWriter.beginObject();
/*    */         paramJsonWriter.endObject();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     typeAdapter.write(paramJsonWriter, paramObject);
/*    */   }
/*    */   
/*    */   ObjectTypeAdapter(Gson paramGson, ObjectTypeAdapter$1 paramObjectTypeAdapter$1) {
/*    */     this(paramGson);
/*    */   }
/*    */   
/*    */   private ObjectTypeAdapter(Gson paramGson) {
/*    */     this.gson = paramGson;
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ObjectTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */