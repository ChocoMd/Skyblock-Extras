/*    */ package com.google.gson.internal.bind;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
/*  8 */   public static final TypeAdapterFactory FACTORY = new ArrayTypeAdapter$1();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final Class<E> componentType;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final TypeAdapter<E> componentTypeAdapter;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ArrayTypeAdapter(Gson paramGson, TypeAdapter<E> paramTypeAdapter, Class<E> paramClass) {
/* 29 */     this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper<E>(paramGson, paramTypeAdapter, paramClass); this.componentType = paramClass; } public Object read(JsonReader paramJsonReader) throws IOException { try { if (paramJsonReader.peek() == JsonToken.NULL) { paramJsonReader.nextNull(); return null; }  } catch (IOException iOException) { throw b(null); }  ArrayList<Object> arrayList = new ArrayList(); paramJsonReader.beginArray(); while (paramJsonReader.hasNext()) { Object object1 = this.componentTypeAdapter.read(paramJsonReader); arrayList.add(object1); }
/* 30 */      paramJsonReader.endArray(); Object object = Array.newInstance(this.componentType, arrayList.size()); byte b = 0; try { while (b < arrayList.size()) { Array.set(object, b, arrayList.get(b)); b++; }  } catch (IOException iOException) { throw b(null); }
/*    */     
/*    */     return object; }
/*    */ 
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException {
/*    */     try {
/*    */       if (paramObject == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.beginArray();
/*    */     byte b;
/*    */     int i;
/*    */     for (b = 0, i = Array.getLength(paramObject); b < i; ) {
/*    */       Object object = Array.get(paramObject, b);
/*    */       this.componentTypeAdapter.write(paramJsonWriter, object);
/*    */       b++;
/*    */     } 
/*    */     paramJsonWriter.endArray();
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ArrayTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */