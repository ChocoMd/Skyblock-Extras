/*   */ package com.google.gson.internal.bind;final class TypeAdapters$18 extends TypeAdapter<URL> { public URL read(JsonReader paramJsonReader) throws IOException { 
/* 2 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*   */       { paramJsonReader.nextNull();
/* 4 */         return null; }  } catch (IOException iOException) { throw b(null); }
/*   */ 
/*   */ 
/*   */     
/* 8 */     String str = paramJsonReader.nextString(); try {  }
/* 9 */     catch (IOException iOException) { throw b(null); }  return "null".equals(str) ? null : new URL(str); }
/*   */ 
/*   */   
/*   */   public void write(JsonWriter paramJsonWriter, URL paramURL) throws IOException {
/*   */     try {
/*   */     
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     paramJsonWriter.value((paramURL == null) ? null : paramURL.toExternalForm());
/*   */   }
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$18.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */