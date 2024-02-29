/*  1 */ package com.google.gson;public final class JsonStreamParser implements Iterator<JsonElement> { private final JsonReader parser; public void remove() { throw new UnsupportedOperationException(); } private final Object lock; public boolean hasNext() {
/*  2 */     synchronized (this.lock) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 25 */       return (this.parser.peek() != JsonToken.END_DOCUMENT);
/*    */     } 
/*    */   }
/*    */   
/*    */   public JsonStreamParser(Reader paramReader) {
/*    */     this.parser = new JsonReader(paramReader);
/*    */     this.parser.setLenient(true);
/*    */     this.lock = new Object();
/*    */   }
/*    */   
/*    */   public JsonElement next() throws JsonParseException {
/*    */     try {
/*    */       if (!hasNext())
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (StackOverflowError stackOverflowError) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       return Streams.parse(this.parser);
/*    */     } catch (StackOverflowError stackOverflowError) {
/*    */       throw new JsonParseException("Failed parsing JSON source to Json", stackOverflowError);
/*    */     } catch (OutOfMemoryError outOfMemoryError) {
/*    */       throw new JsonParseException("Failed parsing JSON source to Json", outOfMemoryError);
/*    */     } catch (JsonParseException jsonParseException) {
/*    */       try {
/*    */       
/*    */       } catch (StackOverflowError stackOverflowError) {
/*    */         throw b(null);
/*    */       } 
/*    */       throw (jsonParseException.getCause() instanceof java.io.EOFException) ? new NoSuchElementException() : jsonParseException;
/*    */     } 
/*    */   }
/*    */   
/*    */   public JsonStreamParser(String paramString) {
/*    */     this(new StringReader(paramString));
/*    */   }
/*    */   
/*    */   private static StackOverflowError b(StackOverflowError paramStackOverflowError) {
/*    */     return paramStackOverflowError;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonStreamParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */