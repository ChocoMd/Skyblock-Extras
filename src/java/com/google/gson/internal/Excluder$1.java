/*    */ package com.google.gson.internal;
/*    */ class Excluder$1 extends TypeAdapter<T> { private TypeAdapter<T> delegate;
/*    */   final boolean val$skipDeserialize;
/*    */   final boolean val$skipSerialize;
/*    */   
/*  6 */   private TypeAdapter<T> delegate() { TypeAdapter<T> typeAdapter = this.delegate; 
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/*  9 */     { throw b(null); }  return (typeAdapter != null) ? typeAdapter : (this.delegate = gson.getDelegateAdapter(Excluder.this, type)); } final Gson val$gson; final TypeToken val$type; final Excluder this$0; public T read(JsonReader paramJsonReader) throws IOException { try { if (skipDeserialize) { paramJsonReader.skipValue(); return null; }  } catch (IOException iOException) { throw b(null); }
/* 10 */      return (T)delegate().read(paramJsonReader); } public void write(JsonWriter paramJsonWriter, T paramT) throws IOException { 
/* 11 */     try { if (skipSerialize) { paramJsonWriter.nullValue(); return; }  } catch (IOException iOException) { throw b(null); }
/* 12 */      delegate().write(paramJsonWriter, paramT); }
/*    */ 
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Excluder$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */