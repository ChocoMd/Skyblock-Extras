/*    */ package com.google.gson;
/*    */ public abstract class JsonElement {
/*    */   public JsonNull getAsJsonNull() { 
/*  4 */     try { if (isJsonNull())
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
/* 23 */         return (JsonNull)this; }  } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalStateException("This is not a JSON Null."); }
/*    */   public boolean getAsBoolean() { throw new UnsupportedOperationException(getClass().getSimpleName()); }
/* 25 */   Boolean getAsBooleanWrapper() { throw new UnsupportedOperationException(getClass().getSimpleName()); } public boolean isJsonNull() { return this instanceof JsonNull; } public JsonObject getAsJsonObject() { try { if (isJsonObject()) return (JsonObject)this;  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */     
/*    */     throw new IllegalStateException("Not a JSON Object: " + this); }
/*    */   public boolean isJsonObject() { return this instanceof JsonObject; }
/*    */   public short getAsShort() { throw new UnsupportedOperationException(getClass().getSimpleName()); }
/*    */   public boolean isJsonPrimitive() { return this instanceof JsonPrimitive; }
/*    */   public BigDecimal getAsBigDecimal() { throw new UnsupportedOperationException(getClass().getSimpleName()); }
/*    */   public String getAsString() { throw new UnsupportedOperationException(getClass().getSimpleName()); } public JsonPrimitive getAsJsonPrimitive() { 
/*    */     try { if (isJsonPrimitive())
/* 34 */         return (JsonPrimitive)this;  } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalStateException("This is not a JSON Primitive."); } public float getAsFloat() { throw new UnsupportedOperationException(getClass().getSimpleName()); } public boolean isJsonArray() { return this instanceof JsonArray; } public BigInteger getAsBigInteger() { throw new UnsupportedOperationException(getClass().getSimpleName()); } public long getAsLong() { throw new UnsupportedOperationException(getClass().getSimpleName()); }
/* 35 */   public JsonArray getAsJsonArray() { try { if (isJsonArray())
/*    */       {
/* 37 */         return (JsonArray)this; }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */     
/*    */     throw new IllegalStateException("This is not a JSON Array."); }
/*    */ 
/*    */   
/*    */   public byte getAsByte() {
/*    */     throw new UnsupportedOperationException(getClass().getSimpleName());
/*    */   }
/*    */   
/*    */   public int getAsInt() {
/*    */     throw new UnsupportedOperationException(getClass().getSimpleName());
/*    */   }
/*    */   
/*    */   public Number getAsNumber() {
/*    */     throw new UnsupportedOperationException(getClass().getSimpleName());
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     try {
/*    */       StringWriter stringWriter = new StringWriter();
/*    */       JsonWriter jsonWriter = new JsonWriter(stringWriter);
/*    */       jsonWriter.setLenient(true);
/*    */       Streams.write(this, jsonWriter);
/*    */       return stringWriter.toString();
/*    */     } catch (IOException iOException) {
/*    */       throw new AssertionError(iOException);
/*    */     } 
/*    */   }
/*    */   
/*    */   public double getAsDouble() {
/*    */     throw new UnsupportedOperationException(getClass().getSimpleName());
/*    */   }
/*    */   
/*    */   public char getAsCharacter() {
/*    */     throw new UnsupportedOperationException(getClass().getSimpleName());
/*    */   }
/*    */   
/*    */   abstract JsonElement deepCopy();
/*    */   
/*    */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonElement.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */