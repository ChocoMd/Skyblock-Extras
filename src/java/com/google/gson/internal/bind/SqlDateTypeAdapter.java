/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
/*  4 */   private final DateFormat format = new SimpleDateFormat("MMM d, yyyy"); public synchronized void write(JsonWriter paramJsonWriter, Date paramDate) throws IOException { try {  }
/*  5 */     catch (IOException iOException) { throw b(null); }  paramJsonWriter.value((paramDate == null) ? null : this.format.format(paramDate)); }
/*  6 */    public static final TypeAdapterFactory FACTORY = new SqlDateTypeAdapter$1();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public synchronized Date read(JsonReader paramJsonReader) throws IOException {
/*    */     try {
/* 14 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */         paramJsonReader.nextNull();
/*    */         return null;
/*    */       } 
/*    */     } catch (ParseException parseException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       long l = this.format.parse(paramJsonReader.nextString()).getTime();
/*    */       return new Date(l);
/*    */     } catch (ParseException parseException) {
/*    */       throw new JsonSyntaxException(parseException);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\SqlDateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */