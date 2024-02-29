/*   */ package com.google.gson.internal.bind;final class TypeAdapters$20 extends TypeAdapter<InetAddress> { public void write(JsonWriter paramJsonWriter, InetAddress paramInetAddress) throws IOException {
/*   */     
/*   */     try {  }
/*   */     catch (IOException iOException)
/* 5 */     { throw b(null); }  paramJsonWriter.value((paramInetAddress == null) ? null : paramInetAddress.getHostAddress());
/*   */   } public InetAddress read(JsonReader paramJsonReader) throws IOException {
/*   */     try {
/* 8 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*   */         paramJsonReader.nextNull();
/*   */         return null;
/*   */       } 
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     return InetAddress.getByName(paramJsonReader.nextString());
/*   */   }
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$20.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */