/*    */ package com.google.gson.internal.bind;
/*    */ final class TypeAdapters$5 extends TypeAdapter<Number> {
/*    */   public Number read(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  5 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       
/*    */       { 
/*    */ 
/*    */         
/* 10 */         paramJsonReader.nextNull();
/* 11 */         return null; }  } catch (NumberFormatException numberFormatException) { throw b(null); }
/* 12 */      try { int i = paramJsonReader.nextInt(); return Byte.valueOf((byte)i); }
/*    */     catch (NumberFormatException numberFormatException)
/*    */     { throw new JsonSyntaxException(numberFormatException); }
/*    */   
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
/*    */     paramJsonWriter.value(paramNumber);
/*    */   }
/*    */   
/*    */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
/*    */     return paramNumberFormatException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */