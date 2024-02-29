/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ final class TypeAdapters$1 extends TypeAdapter<Class> {
/*    */   public Class read(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  6 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       { paramJsonReader.nextNull();
/*  8 */         return null; }  } catch (IOException iOException) { throw b(null); }
/*    */ 
/*    */     
/* 11 */     throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Class paramClass) throws IOException {
/*    */     try {
/*    */       if (paramClass == null) {
/*    */         paramJsonWriter.nullValue();
/*    */       } else {
/*    */         throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + paramClass.getName() + ". Forgot to register a type adapter?");
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */