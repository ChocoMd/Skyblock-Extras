/*  1 */ package com.google.gson;class Gson$FutureTypeAdapter<T> extends TypeAdapter<T> { public T read(JsonReader paramJsonReader) throws IOException { try { if (this.delegate == null)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 11 */         throw new IllegalStateException(); }  } catch (IOException iOException) { throw b(null); }
/* 12 */      return this.delegate.read(paramJsonReader); } private TypeAdapter<T> delegate; public void setDelegate(TypeAdapter<T> paramTypeAdapter) { try { if (this.delegate != null)
/*    */         throw new AssertionError();  }
/*    */     catch (IllegalStateException illegalStateException)
/*    */     { throw b(null); }
/*    */     
/*    */     this.delegate = paramTypeAdapter; }
/*    */ 
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, T paramT) throws IOException {
/*    */     try {
/*    */       if (this.delegate == null)
/*    */         throw new IllegalStateException(); 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     this.delegate.write(paramJsonWriter, paramT);
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson$FutureTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */