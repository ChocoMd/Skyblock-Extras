/*    */ package com.google.gson.internal.bind;
/*    */ final class TypeAdapters$3 extends TypeAdapter<Boolean> { public Boolean read(JsonReader paramJsonReader) throws IOException { 
/*  3 */     try { if (paramJsonReader.peek() == JsonToken.NULL) {
/*  4 */         paramJsonReader.nextNull(); return null;
/*    */       }  }
/*    */     catch (IOException iOException) { throw b(null); }
/*    */      
/*    */     try { if (paramJsonReader.peek() == JsonToken.STRING)
/*  9 */         return Boolean.valueOf(Boolean.parseBoolean(paramJsonReader.nextString()));  } catch (IOException iOException) { throw b(null); }
/* 10 */      return Boolean.valueOf(paramJsonReader.nextBoolean()); } public void write(JsonWriter paramJsonWriter, Boolean paramBoolean) throws IOException { try { if (paramBoolean == null) { paramJsonWriter.nullValue(); return; }  }
/* 11 */     catch (IOException iOException) { throw b(null); }
/* 12 */      paramJsonWriter.value(paramBoolean.booleanValue()); }
/*    */ 
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */