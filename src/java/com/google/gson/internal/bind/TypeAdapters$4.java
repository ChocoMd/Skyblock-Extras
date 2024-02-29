/*   */ package com.google.gson.internal.bind;final class TypeAdapters$4 extends TypeAdapter<Boolean> { public Boolean read(JsonReader paramJsonReader) throws IOException { 
/* 2 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*   */       
/* 4 */       { paramJsonReader.nextNull();
/*   */         
/* 6 */         return null; }  } catch (IOException iOException) { throw b(null); }
/* 7 */      return Boolean.valueOf(paramJsonReader.nextString()); } public void write(JsonWriter paramJsonWriter, Boolean paramBoolean) throws IOException { try {  }
/* 8 */     catch (IOException iOException) { throw b(null); }  paramJsonWriter.value((paramBoolean == null) ? "null" : paramBoolean.toString()); }
/*   */ 
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */