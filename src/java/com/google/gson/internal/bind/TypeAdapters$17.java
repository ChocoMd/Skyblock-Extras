/*   */ package com.google.gson.internal.bind;
/*   */ final class TypeAdapters$17 extends TypeAdapter<StringBuffer> {
/*   */   public StringBuffer read(JsonReader paramJsonReader) throws IOException { 
/* 4 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/* 5 */       { paramJsonReader.nextNull(); return null; }  } catch (IOException iOException) { throw b(null); }  return new StringBuffer(paramJsonReader.nextString()); } public void write(JsonWriter paramJsonWriter, StringBuffer paramStringBuffer) throws IOException { try {  }
/* 6 */     catch (IOException iOException) { throw b(null); }  paramJsonWriter.value((paramStringBuffer == null) ? null : paramStringBuffer.toString()); }
/*   */ 
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$17.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */