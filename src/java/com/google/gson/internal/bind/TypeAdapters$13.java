/*    */ package com.google.gson.internal.bind;
/*    */ final class TypeAdapters$13 extends TypeAdapter<String> {
/*    */   public void write(JsonWriter paramJsonWriter, String paramString) throws IOException {
/*  4 */     paramJsonWriter.value(paramString);
/*    */   }
/*    */   public String read(JsonReader paramJsonReader) throws IOException {
/*  7 */     JsonToken jsonToken = paramJsonReader.peek(); 
/*  8 */     try { if (jsonToken == JsonToken.NULL)
/*  9 */       { paramJsonReader.nextNull(); return null; }  } catch (IOException iOException) { throw b(null); }  try { if (jsonToken == JsonToken.BOOLEAN)
/* 10 */         return Boolean.toString(paramJsonReader.nextBoolean());  } catch (IOException iOException) { throw b(null); }
/*    */     
/* 12 */     return paramJsonReader.nextString();
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$13.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */