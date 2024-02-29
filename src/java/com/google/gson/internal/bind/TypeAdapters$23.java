/*    */ package com.google.gson.internal.bind;final class TypeAdapters$23 extends TypeAdapter<Calendar> {
/*    */   private static final String YEAR = "year";
/*    */   
/*    */   public Calendar read(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  6 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       
/*    */       { 
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
/* 41 */         paramJsonReader.nextNull(); return null; }  }
/*    */     catch (IOException iOException) { throw b(null); }
/* 43 */      paramJsonReader.beginObject(); int i = 0;
/*    */     int j = 0;
/*    */     int k = 0;
/*    */     int m = 0;
/*    */     int n = 0;
/* 48 */     int i1 = 0; while (paramJsonReader.peek() != JsonToken.END_OBJECT) { String str = paramJsonReader.nextName(); int i2 = paramJsonReader.nextInt(); if ("year".equals(str)) { i = i2; continue; }  if ("month".equals(str)) { j = i2; continue; }
/* 49 */        if ("dayOfMonth".equals(str)) {
/*    */         k = i2;
/*    */         continue;
/*    */       } 
/*    */       if ("hourOfDay".equals(str)) {
/*    */         m = i2;
/*    */         continue;
/*    */       } 
/*    */       if ("minute".equals(str)) {
/*    */         n = i2;
/*    */         continue;
/*    */       } 
/*    */       if ("second".equals(str))
/*    */         i1 = i2;  }
/*    */     
/*    */     paramJsonReader.endObject();
/*    */     return new GregorianCalendar(i, j, k, m, n, i1);
/*    */   }
/*    */   
/*    */   private static final String MONTH = "month";
/*    */   private static final String DAY_OF_MONTH = "dayOfMonth";
/*    */   private static final String HOUR_OF_DAY = "hourOfDay";
/*    */   private static final String MINUTE = "minute";
/*    */   private static final String SECOND = "second";
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Calendar paramCalendar) throws IOException {
/*    */     try {
/*    */       if (paramCalendar == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.beginObject();
/*    */     paramJsonWriter.name("year");
/*    */     paramJsonWriter.value(paramCalendar.get(1));
/*    */     paramJsonWriter.name("month");
/*    */     paramJsonWriter.value(paramCalendar.get(2));
/*    */     paramJsonWriter.name("dayOfMonth");
/*    */     paramJsonWriter.value(paramCalendar.get(5));
/*    */     paramJsonWriter.name("hourOfDay");
/*    */     paramJsonWriter.value(paramCalendar.get(11));
/*    */     paramJsonWriter.name("minute");
/*    */     paramJsonWriter.value(paramCalendar.get(12));
/*    */     paramJsonWriter.name("second");
/*    */     paramJsonWriter.value(paramCalendar.get(13));
/*    */     paramJsonWriter.endObject();
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$23.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */