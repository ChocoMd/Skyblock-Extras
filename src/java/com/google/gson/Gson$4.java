/*    */ package com.google.gson;
/*    */ 
/*    */ class Gson$4 extends TypeAdapter<Number> {
/*    */   public Float read(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  6 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       { paramJsonReader.nextNull();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 13 */         return null; }  } catch (IOException iOException) { throw b(null); }
/*    */     
/*    */     return Float.valueOf((float)paramJsonReader.nextDouble());
/*    */   }
/*    */   
/*    */   final Gson this$0;
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
/*    */     try {
/*    */       if (paramNumber == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     float f = paramNumber.floatValue();
/*    */     Gson.access$000(Gson.this, f);
/*    */     paramJsonWriter.value(paramNumber);
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */