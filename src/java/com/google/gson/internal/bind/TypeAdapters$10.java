/*   */ package com.google.gson.internal.bind;final class TypeAdapters$10 extends TypeAdapter<Number> {
/*   */   public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
/* 3 */     paramJsonWriter.value(paramNumber);
/*   */   } public Number read(JsonReader paramJsonReader) throws IOException {
/*   */     try {
/* 6 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*   */         
/* 8 */         paramJsonReader.nextNull();
/*   */         return null;
/*   */       } 
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     return Double.valueOf(paramJsonReader.nextDouble());
/*   */   }
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */