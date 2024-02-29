/*    */ package com.google.gson.internal.bind;
/*    */ final class TypeAdapters$7 extends TypeAdapter<Number> { public Number read(JsonReader paramJsonReader) throws IOException { 
/*  3 */     try { if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         
/*  5 */         paramJsonReader.nextNull(); return null;
/*    */       }  }
/*    */     catch (NumberFormatException numberFormatException) { throw b(null); }
/*  8 */      try { return Integer.valueOf(paramJsonReader.nextInt()); }
/*    */     catch (NumberFormatException numberFormatException) { throw new JsonSyntaxException(numberFormatException); }
/* 10 */      } public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException { paramJsonWriter.value(paramNumber); }
/*    */ 
/*    */   
/*    */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
/*    */     return paramNumberFormatException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */