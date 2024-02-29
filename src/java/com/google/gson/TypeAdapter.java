/*    */ package com.google.gson;
/*  2 */ public abstract class TypeAdapter<T> { public final T fromJson(String paramString) throws IOException { return fromJson(new StringReader(paramString)); } public final TypeAdapter<T> nullSafe() {
/*  3 */     return new TypeAdapter$1(this);
/*    */   }
/*    */   
/*    */   public final String toJson(T paramT) throws IOException {
/*  7 */     StringWriter stringWriter = new StringWriter();
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
/* 18 */     toJson(stringWriter, paramT); return stringWriter.toString();
/*    */   } public final void toJson(Writer paramWriter, T paramT) throws IOException { JsonWriter jsonWriter = new JsonWriter(paramWriter); write(jsonWriter, paramT); } public final T fromJsonTree(JsonElement paramJsonElement) { try {
/* 20 */       JsonTreeReader jsonTreeReader = new JsonTreeReader(paramJsonElement); return read((JsonReader)jsonTreeReader);
/*    */     } catch (IOException iOException) {
/*    */       throw new JsonIOException(iOException);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public final JsonElement toJsonTree(T paramT) {
/*    */     try {
/*    */       JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
/*    */       write((JsonWriter)jsonTreeWriter, paramT);
/*    */       return jsonTreeWriter.get();
/*    */     } catch (IOException iOException) {
/*    */       throw new JsonIOException(iOException);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final T fromJson(Reader paramReader) throws IOException {
/*    */     JsonReader jsonReader = new JsonReader(paramReader);
/*    */     return read(jsonReader);
/*    */   }
/*    */   
/*    */   public abstract void write(JsonWriter paramJsonWriter, T paramT) throws IOException;
/*    */   
/*    */   public abstract T read(JsonReader paramJsonReader) throws IOException; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\TypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */