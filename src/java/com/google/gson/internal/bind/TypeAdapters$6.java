/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ 
/*    */ final class TypeAdapters$6 extends TypeAdapter<Number> {
/*    */   public Number read(JsonReader paramJsonReader) throws IOException { 
/*  9 */     try { if (paramJsonReader.peek() == JsonToken.NULL) { paramJsonReader.nextNull(); return null; }  } catch (NumberFormatException numberFormatException) { throw b(null); }  try { return Short.valueOf((short)paramJsonReader.nextInt()); }
/*    */     catch (NumberFormatException numberFormatException) { throw new JsonSyntaxException(numberFormatException); }
/* 11 */      } public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException { paramJsonWriter.value(paramNumber); }
/*    */ 
/*    */   
/*    */   private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
/*    */     return paramNumberFormatException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */