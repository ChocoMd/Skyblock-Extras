/*  1 */ package com.google.gson.internal.bind;public final class ReflectiveTypeAdapterFactory$Adapter<T> extends TypeAdapter<T> { public T read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       
/*    */       { 
/*  4 */         paramJsonReader.nextNull();
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
/* 27 */         return null; }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */ 
/*    */     
/*    */     Object object = this.constructor.construct();
/*    */     try {
/*    */       paramJsonReader.beginObject();
/*    */       while (true) {
/*    */         if (paramJsonReader.hasNext()) {
/* 35 */           String str = paramJsonReader.nextName();
/*    */           ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField = this.boundFields.get(str);
/*    */           
/* 38 */           try { if (reflectiveTypeAdapterFactory$BoundField != null) { try { if (reflectiveTypeAdapterFactory$BoundField.deserialized) { reflectiveTypeAdapterFactory$BoundField.read(paramJsonReader, object); continue; }  paramJsonReader.skipValue(); } catch (IllegalStateException illegalStateException) { throw b(null); }  continue; }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */         
/*    */         } else {
/*    */           break;
/*    */         } 
/*    */         paramJsonReader.skipValue();
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw new JsonSyntaxException(illegalStateException);
/*    */     } catch (IllegalAccessException illegalAccessException) {
/*    */       throw new AssertionError(illegalAccessException);
/*    */     } 
/*    */     paramJsonReader.endObject();
/*    */     return (T)object; }
/*    */ 
/*    */   
/*    */   private final ObjectConstructor<T> constructor;
/*    */   private final Map<String, ReflectiveTypeAdapterFactory$BoundField> boundFields;
/*    */   
/*    */   ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor<T> paramObjectConstructor, Map<String, ReflectiveTypeAdapterFactory$BoundField> paramMap, ReflectiveTypeAdapterFactory$1 paramReflectiveTypeAdapterFactory$1) {
/*    */     this(paramObjectConstructor, paramMap);
/*    */   }
/*    */   
/*    */   private ReflectiveTypeAdapterFactory$Adapter(ObjectConstructor<T> paramObjectConstructor, Map<String, ReflectiveTypeAdapterFactory$BoundField> paramMap) {
/*    */     this.constructor = paramObjectConstructor;
/*    */     this.boundFields = paramMap;
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, T paramT) throws IOException {
/*    */     try {
/*    */       if (paramT == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IllegalAccessException illegalAccessException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.beginObject();
/*    */     try {
/*    */       for (ReflectiveTypeAdapterFactory$BoundField reflectiveTypeAdapterFactory$BoundField : this.boundFields.values()) {
/*    */         try {
/*    */           if (reflectiveTypeAdapterFactory$BoundField.serialized) {
/*    */             paramJsonWriter.name(reflectiveTypeAdapterFactory$BoundField.name);
/*    */             reflectiveTypeAdapterFactory$BoundField.write(paramJsonWriter, paramT);
/*    */           } 
/*    */         } catch (IllegalAccessException illegalAccessException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } 
/*    */     } catch (IllegalAccessException illegalAccessException) {
/*    */       throw new AssertionError();
/*    */     } 
/*    */     paramJsonWriter.endObject();
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */