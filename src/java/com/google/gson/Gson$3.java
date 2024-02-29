/*    */ package com.google.gson;class Gson$3 extends TypeAdapter<Number> { public void write(JsonWriter paramJsonWriter, Number paramNumber) throws IOException { 
/*  2 */     try { if (paramNumber == null) { paramJsonWriter.nullValue(); return; }
/*    */        }
/*  4 */     catch (IOException iOException) { throw b(null); }
/*    */ 
/*    */ 
/*    */     
/*  8 */     double d = paramNumber.doubleValue(); Gson.access$000(Gson.this, d); paramJsonWriter.value(paramNumber); } final Gson this$0; public Double read(JsonReader paramJsonReader) throws IOException { 
/*  9 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       { paramJsonReader.nextNull();
/*    */         
/* 12 */         return null; }  } catch (IOException iOException) { throw b(null); }
/*    */     
/* 14 */     return Double.valueOf(paramJsonReader.nextDouble()); }
/*    */ 
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */