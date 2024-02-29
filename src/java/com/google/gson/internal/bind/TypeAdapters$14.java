/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.math.BigDecimal;
/*    */ 
/*    */ final class TypeAdapters$14 extends TypeAdapter<BigDecimal> {
/* 10 */   public void write(JsonWriter paramJsonWriter, BigDecimal paramBigDecimal) throws IOException { paramJsonWriter.value(paramBigDecimal); }
/* 11 */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) { return paramNumberFormatException; } public BigDecimal read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       }  }
/*    */     catch (NumberFormatException numberFormatException)
/*    */     { throw b(null); }
/*    */     
/*    */     try {
/*    */       return new BigDecimal(paramJsonReader.nextString());
/*    */     } catch (NumberFormatException numberFormatException) {
/*    */       throw new JsonSyntaxException(numberFormatException);
/*    */     }  }
/*    */ 
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$14.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */