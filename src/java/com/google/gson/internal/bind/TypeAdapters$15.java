/*    */ package com.google.gson.internal.bind;final class TypeAdapters$15 extends TypeAdapter<BigInteger> { public BigInteger read(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  3 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       { paramJsonReader.nextNull();
/*    */ 
/*    */ 
/*    */ 
/*    */         
/*  9 */         return null; }  } catch (NumberFormatException numberFormatException) { throw b(null); }
/* 10 */      try { return new BigInteger(paramJsonReader.nextString()); }
/* 11 */     catch (NumberFormatException numberFormatException)
/*    */     { throw new JsonSyntaxException(numberFormatException); }
/*    */   
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, BigInteger paramBigInteger) throws IOException {
/*    */     paramJsonWriter.value(paramBigInteger);
/*    */   }
/*    */   
/*    */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
/*    */     return paramNumberFormatException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$15.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */