/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import java.io.IOException;
/*    */ import java.util.Collection;
/*    */ 
/*    */ final class CollectionTypeAdapterFactory$Adapter<E> extends TypeAdapter<Collection<E>> {
/*    */   private final TypeAdapter<E> elementTypeAdapter;
/*    */   
/* 10 */   public CollectionTypeAdapterFactory$Adapter(Gson paramGson, Type paramType, TypeAdapter<E> paramTypeAdapter, ObjectConstructor<? extends Collection<E>> paramObjectConstructor) { this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(paramGson, paramTypeAdapter, paramType);
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
/* 21 */     this.constructor = paramObjectConstructor; }
/*    */   private final ObjectConstructor<? extends Collection<E>> constructor; public void write(JsonWriter paramJsonWriter, Collection<E> paramCollection) throws IOException { // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ifnonnull -> 14
/*    */     //   4: aload_1
/*    */     //   5: invokevirtual nullValue : ()Lcom/google/gson/stream/JsonWriter;
/*    */     //   8: pop
/*    */     //   9: return
/*    */     //   10: invokestatic b : (Ljava/io/IOException;)Ljava/io/IOException;
/*    */     //   13: athrow
/*    */     //   14: aload_1
/*    */     //   15: invokevirtual beginArray : ()Lcom/google/gson/stream/JsonWriter;
/*    */     //   18: pop
/*    */     //   19: aload_2
/*    */     //   20: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   25: astore_3
/*    */     //   26: aload_3
/*    */     //   27: invokeinterface hasNext : ()Z
/*    */     //   32: ifeq -> 56
/*    */     //   35: aload_3
/*    */     //   36: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   41: astore #4
/*    */     //   43: aload_0
/*    */     //   44: getfield elementTypeAdapter : Lcom/google/gson/TypeAdapter;
/*    */     //   47: aload_1
/*    */     //   48: aload #4
/*    */     //   50: invokevirtual write : (Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
/*    */     //   53: goto -> 26
/*    */     //   56: aload_1
/*    */     //   57: invokevirtual endArray : ()Lcom/google/gson/stream/JsonWriter;
/*    */     //   60: pop
/*    */     //   61: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 0
/*    */     //   #14	-> 4
/*    */     //   #15	-> 9
/*    */     //   #2	-> 14
/*    */     //   #26	-> 19
/*    */     //   #5	-> 43
/*    */     //   #3	-> 53
/*    */     //   #20	-> 56
/*    */     //   #25	-> 61
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	10	10	java/io/IOException } public Collection<E> read(JsonReader paramJsonReader) throws IOException { 
/* 23 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/* 24 */       { paramJsonReader.nextNull(); return null; }  } catch (IOException iOException) { throw b(null); }
/*    */     
/*    */     Collection<Object> collection = (Collection)this.constructor.construct();
/*    */     paramJsonReader.beginArray();
/*    */     while (paramJsonReader.hasNext()) {
/*    */       Object object = this.elementTypeAdapter.read(paramJsonReader);
/*    */       collection.add(object);
/*    */     } 
/*    */     paramJsonReader.endArray();
/*    */     return (Collection)collection; }
/*    */ 
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\CollectionTypeAdapterFactory$Adapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */