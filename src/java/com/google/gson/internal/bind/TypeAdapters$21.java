/* 1 */ package com.google.gson.internal.bind;final class TypeAdapters$21 extends TypeAdapter<UUID> { public UUID read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL)
/*   */       
/*   */       { 
/* 4 */         paramJsonReader.nextNull();
/*   */ 
/*   */ 
/*   */ 
/*   */         
/* 9 */         return null; }  } catch (IOException iOException) { throw b(null); }
/*   */     
/*   */     return UUID.fromString(paramJsonReader.nextString()); }
/*   */ 
/*   */   
/*   */   public void write(JsonWriter paramJsonWriter, UUID paramUUID) throws IOException {
/*   */     try {
/*   */     
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     paramJsonWriter.value((paramUUID == null) ? null : paramUUID.toString());
/*   */   }
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$21.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */