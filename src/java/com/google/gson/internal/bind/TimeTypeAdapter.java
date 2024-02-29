/*    */ package com.google.gson.internal.bind;public final class TimeTypeAdapter extends TypeAdapter<Time> {
/*  2 */   private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 11 */   public static final TypeAdapterFactory FACTORY = new TimeTypeAdapter$1();
/*    */   public synchronized Time read(JsonReader paramJsonReader) throws IOException { 
/* 13 */     try { if (paramJsonReader.peek() == JsonToken.NULL) { paramJsonReader.nextNull(); return null; }  } catch (ParseException parseException) { throw b(null); }  try { Date date = this.format.parse(paramJsonReader.nextString()); return new Time(date.getTime()); } catch (ParseException parseException) { throw new JsonSyntaxException(parseException); }  } public synchronized void write(JsonWriter paramJsonWriter, Time paramTime) throws IOException { try {  }
/* 14 */     catch (IOException iOException) { throw b(null); }  paramJsonWriter.value((paramTime == null) ? null : this.format.format(paramTime)); }
/*    */ 
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TimeTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */