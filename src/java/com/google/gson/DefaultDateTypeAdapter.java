/*  1 */ package com.google.gson;final class DefaultDateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> { private final DateFormat enUsFormat; public JsonElement serialize(Date paramDate, Type paramType, JsonSerializationContext paramJsonSerializationContext) { synchronized (this.localFormat)
/*    */     
/*    */     { 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 42 */       String str = this.enUsFormat.format(paramDate); return new JsonPrimitive(str); }  }
/* 43 */   private final DateFormat localFormat; private final DateFormat iso8601Format; DefaultDateTypeAdapter(String paramString) { this(new SimpleDateFormat(paramString, Locale.US), new SimpleDateFormat(paramString)); } public DefaultDateTypeAdapter(int paramInt1, int paramInt2) { this(DateFormat.getDateTimeInstance(paramInt1, paramInt2, Locale.US), DateFormat.getDateTimeInstance(paramInt1, paramInt2)); }
/*    */ 
/*    */   
/*    */   private Date deserializeToDate(JsonElement paramJsonElement) {
/*    */     synchronized (this.localFormat) {
/*    */       try {
/*    */         return this.localFormat.parse(paramJsonElement.getAsString());
/*    */       } catch (ParseException parseException) {}
/*    */       try {
/*    */         return this.enUsFormat.parse(paramJsonElement.getAsString());
/*    */       } catch (ParseException parseException) {
/*    */         try {
/*    */           return this.iso8601Format.parse(paramJsonElement.getAsString());
/*    */         } catch (ParseException parseException1) {
/*    */           throw new JsonSyntaxException(paramJsonElement.getAsString(), parseException1);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public Date deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext) throws JsonParseException {
/*    */     try {
/*    */       if (!(paramJsonElement instanceof JsonPrimitive))
/*    */         throw new JsonParseException("The date should be a string value"); 
/*    */     } catch (JsonParseException jsonParseException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Date date = deserializeToDate(paramJsonElement);
/*    */     try {
/*    */       if (paramType == Date.class)
/*    */         return date; 
/*    */     } catch (JsonParseException jsonParseException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramType == Timestamp.class)
/*    */         return new Timestamp(date.getTime()); 
/*    */     } catch (JsonParseException jsonParseException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramType == Date.class)
/*    */         return new Date(date.getTime()); 
/*    */     } catch (JsonParseException jsonParseException) {
/*    */       throw b(null);
/*    */     } 
/*    */     throw new IllegalArgumentException(getClass() + " cannot deserialize to " + paramType);
/*    */   }
/*    */   
/*    */   DefaultDateTypeAdapter(int paramInt) {
/*    */     this(DateFormat.getDateInstance(paramInt, Locale.US), DateFormat.getDateInstance(paramInt));
/*    */   }
/*    */   
/*    */   DefaultDateTypeAdapter(DateFormat paramDateFormat1, DateFormat paramDateFormat2) {
/*    */     this.enUsFormat = paramDateFormat1;
/*    */     this.localFormat = paramDateFormat2;
/*    */     this.iso8601Format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
/*    */     this.iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
/*    */   }
/*    */   
/*    */   DefaultDateTypeAdapter() {
/*    */     this(DateFormat.getDateTimeInstance(2, 2, Locale.US), DateFormat.getDateTimeInstance(2, 2));
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     StringBuilder stringBuilder = new StringBuilder();
/*    */     stringBuilder.append(DefaultDateTypeAdapter.class.getSimpleName());
/*    */     stringBuilder.append('(').append(this.localFormat.getClass().getSimpleName()).append(')');
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   private static JsonParseException b(JsonParseException paramJsonParseException) {
/*    */     return paramJsonParseException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\DefaultDateTypeAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */