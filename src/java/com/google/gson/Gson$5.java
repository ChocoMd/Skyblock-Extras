/*    */ package com.google.gson;
/*    */ class Gson$5 extends TypeAdapter<Number> {
/*    */   public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException { try {
/*  4 */       if (paramNumber == null) {
/*  5 */         paramJsonWriter.nullValue(); return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*  9 */     }  paramJsonWriter.value(paramNumber.toString()); } final Gson this$0; public Number read(JsonReader paramJsonReader) throws IOException { try {
/* 10 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         
/* 12 */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return Long.valueOf(paramJsonReader.nextLong()); }
/*    */ 
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */