/*  1 */ package com.google.gson.internal.bind;final class TypeAdapters$EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> { public void write(JsonWriter paramJsonWriter, T paramT) throws IOException { try {  } catch (IOException iOException) { throw b(null); }  paramJsonWriter.value((paramT == null) ? null : this.constantToName.get(paramT)); }
/*    */   
/*  3 */   private final Map<String, T> nameToConstant = new HashMap<String, T>();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*  9 */   private final Map<T, String> constantToName = new HashMap<T, String>(); public TypeAdapters$EnumTypeAdapter(Class<T> paramClass) { try {
/*    */       Enum[] arrayOfEnum; int i;
/*    */       byte b;
/* 12 */       for (arrayOfEnum = (Enum[])paramClass.getEnumConstants(), i = arrayOfEnum.length, b = 0; b < i; ) { Enum enum_ = arrayOfEnum[b];
/*    */ 
/*    */ 
/*    */         
/*    */         String str = enum_.name();
/*    */ 
/*    */         
/* 19 */         SerializedName serializedName = paramClass.getField(str).<SerializedName>getAnnotation(SerializedName.class); }
/*    */ 
/*    */     
/*    */     }
/* 23 */     catch (NoSuchFieldException noSuchFieldException) {
/*    */       throw new AssertionError();
/*    */     }  }
/*    */ 
/*    */   
/*    */   public T read(JsonReader paramJsonReader) throws IOException {
/*    */     try {
/*    */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.nameToConstant.get(paramJsonReader.nextString());
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$EnumTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */