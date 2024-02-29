/*  1 */ package com.google.gson.internal.bind;public final class DateTypeAdapter extends TypeAdapter<Date> { private static DateFormat buildIso8601Format() { SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  8 */     simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
/*    */     return simpleDateFormat; }
/* 10 */    public static final TypeAdapterFactory FACTORY = new DateTypeAdapter$1();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 15 */   private final DateFormat iso8601Format = buildIso8601Format();
/*    */   public Date read(JsonReader paramJsonReader) throws IOException {
/*    */     
/* 18 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 25 */         paramJsonReader.nextNull(); return null; }  }
/*    */     catch (IOException iOException) { throw b(null); }
/* 27 */      return deserializeToDate(paramJsonReader.nextString());
/*    */   }
/*    */   
/*    */   private final DateFormat localFormat = DateFormat.getDateTimeInstance(2, 2);
/*    */   
/*    */   private synchronized Date deserializeToDate(String paramString) {
/*    */     try {
/*    */       return this.localFormat.parse(paramString);
/*    */     } catch (ParseException parseException) {}
/*    */     try {
/*    */       return this.enUsFormat.parse(paramString);
/*    */     } catch (ParseException parseException) {
/*    */       try {
/*    */         return this.iso8601Format.parse(paramString);
/*    */       } catch (ParseException parseException1) {
/*    */         throw new JsonSyntaxException(paramString, parseException1);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private final DateFormat enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
/*    */   
/*    */   public synchronized void write(JsonWriter paramJsonWriter, Date paramDate) throws IOException {
/*    */     try {
/*    */       if (paramDate == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     String str = this.enUsFormat.format(paramDate);
/*    */     paramJsonWriter.value(str);
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\DateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */