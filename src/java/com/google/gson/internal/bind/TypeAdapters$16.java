/*   */ package com.google.gson.internal.bind;
/*   */ final class TypeAdapters$16 extends TypeAdapter<StringBuilder> {
/*   */   public void write(JsonWriter paramJsonWriter, StringBuilder paramStringBuilder) throws IOException { 
/*   */     try {  }
/*   */     catch (IOException iOException)
/* 6 */     { throw b(null); }  paramJsonWriter.value((paramStringBuilder == null) ? null : paramStringBuilder.toString()); } public StringBuilder read(JsonReader paramJsonReader) throws IOException { try {
/* 7 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/* 8 */         paramJsonReader.nextNull();
/*   */         return null;
/*   */       } 
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     return new StringBuilder(paramJsonReader.nextString()); }
/*   */ 
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$16.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */