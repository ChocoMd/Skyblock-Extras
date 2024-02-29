/*   */ package com.google.gson.internal.bind;final class TypeAdapters$8 extends TypeAdapter<Number> { public Number read(JsonReader paramJsonReader) throws IOException {
/*   */     
/* 3 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*   */       { paramJsonReader.nextNull();
/*   */         
/* 6 */         return null; }  } catch (NumberFormatException numberFormatException) { throw b(null); }  try { return Long.valueOf(paramJsonReader.nextLong()); }
/* 7 */     catch (NumberFormatException numberFormatException)
/* 8 */     { throw new JsonSyntaxException(numberFormatException); }
/*   */   
/*   */   }
/*   */   
/*   */   public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException {
/*   */     paramJsonWriter.value(paramNumber);
/*   */   }
/*   */   
/*   */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
/*   */     return paramNumberFormatException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */