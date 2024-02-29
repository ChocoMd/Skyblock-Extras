/*   */ package com.google.gson.internal.bind;
/*   */ class TypeAdapters$22$1 extends TypeAdapter<Timestamp> { final TypeAdapter val$dateTypeAdapter;
/* 3 */   public void write(JsonWriter paramJsonWriter, Timestamp paramTimestamp) throws IOException { dateTypeAdapter.write(paramJsonWriter, paramTimestamp); } final TypeAdapters$22 this$0; private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } public Timestamp read(JsonReader paramJsonReader) throws IOException {
/* 6 */     Date date = (Date)dateTypeAdapter.read(paramJsonReader);
/*   */     try {
/*   */     
/*   */     } catch (IOException iOException) {
/*   */       throw b(null);
/*   */     } 
/*   */     return (date != null) ? new Timestamp(date.getTime()) : null;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$22$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */