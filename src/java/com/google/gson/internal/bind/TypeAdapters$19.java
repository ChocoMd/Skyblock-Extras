/*  1 */ package com.google.gson.internal.bind;final class TypeAdapters$19 extends TypeAdapter<URI> { public URI read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 10 */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       }  }
/*    */     catch (URISyntaxException uRISyntaxException)
/*    */     { throw b(null); }
/*    */     
/*    */     try {
/*    */       String str = paramJsonReader.nextString();
/*    */       try {
/*    */       
/*    */       } catch (URISyntaxException uRISyntaxException) {
/*    */         throw b(null);
/*    */       } 
/*    */       return "null".equals(str) ? null : new URI(str);
/*    */     } catch (URISyntaxException uRISyntaxException) {
/*    */       throw new JsonIOException(uRISyntaxException);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, URI paramURI) throws IOException {
/*    */     try {
/*    */     
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.value((paramURI == null) ? null : paramURI.toASCIIString());
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$19.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */