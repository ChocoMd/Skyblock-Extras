/*    */ package com.google.gson.internal.bind;final class TypeAdapters$11 extends TypeAdapter<Number> { public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
/*  2 */     paramJsonWriter.value(paramNumber);
/*    */   }
/*    */ 
/*    */   
/*    */   public Number read(JsonReader paramJsonReader) throws IOException {
/*  7 */     JsonToken jsonToken = paramJsonReader.peek();
/*    */ 
/*    */     
/*    */     try {
/* 11 */       switch (TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
/*    */         case 4:
/*    */           paramJsonReader.nextNull();
/*    */           return null;
/*    */         case 1:
/*    */           return (Number)new LazilyParsedNumber(paramJsonReader.nextString());
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     throw new JsonSyntaxException("Expecting number, got: " + jsonToken);
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$11.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */