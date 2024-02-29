/*    */ package com.google.gson.internal.bind;
/*    */ final class TypeAdapters$12 extends TypeAdapter<Character> {
/*    */   public void write(JsonWriter paramJsonWriter, Character paramCharacter) throws IOException {
/*    */     
/*    */     try {  }
/*    */     catch (IOException iOException)
/*  7 */     { throw b(null); }  paramJsonWriter.value((paramCharacter == null) ? null : String.valueOf(paramCharacter));
/*    */   }
/*    */   public Character read(JsonReader paramJsonReader) throws IOException {
/*    */     try {
/* 11 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     String str = paramJsonReader.nextString();
/*    */     try {
/*    */       if (str.length() != 1)
/*    */         throw new JsonSyntaxException("Expecting character, got: " + str); 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return Character.valueOf(str.charAt(0));
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */