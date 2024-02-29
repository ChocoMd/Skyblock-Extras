/*   */ package com.google.gson;
/*   */ class TypeAdapter$1 extends TypeAdapter<T> {
/*   */   final TypeAdapter this$0;
/*   */   
/*   */   public void write(JsonWriter paramJsonWriter, T paramT) throws IOException { 
/* 6 */     try { if (paramT == null) { paramJsonWriter.nullValue(); }
/*   */       else
/* 8 */       { TypeAdapter.this.write(paramJsonWriter, paramT); }  } catch (IOException iOException) { throw b(null); }
/* 9 */      } public T read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL) {
/*   */         paramJsonReader.nextNull();
/*   */         return null;
/*   */       }  }
/*   */     catch (IOException iOException)
/*   */     { throw b(null); }
/*   */     
/*   */     return TypeAdapter.this.read(paramJsonReader); }
/*   */ 
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\TypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */