/*  1 */ package com.google.gson.internal;public final class LazilyParsedNumber extends Number { public double doubleValue() { return Double.parseDouble(this.value); }
/*    */   
/*    */   private final String value;
/*    */   public int intValue() {
/*    */     try {
/*  6 */       return Integer.parseInt(this.value);
/*    */     }
/*  8 */     catch (NumberFormatException numberFormatException) {
/*    */ 
/*    */ 
/*    */       
/*    */       try { 
/* 13 */         return (int)Long.parseLong(this.value); } catch (NumberFormatException numberFormatException1) { return (new BigDecimal(this.value)).intValue(); } 
/* 14 */     }  } public String toString() { return this.value; }
/*    */ 
/*    */   
/*    */   public LazilyParsedNumber(String paramString) {
/*    */     this.value = paramString;
/*    */   }
/*    */   
/*    */   public long longValue() {
/*    */     try {
/*    */       return Long.parseLong(this.value);
/*    */     } catch (NumberFormatException numberFormatException) {
/*    */       return (new BigDecimal(this.value)).longValue();
/*    */     } 
/*    */   }
/*    */   
/*    */   private Object writeReplace() throws ObjectStreamException {
/*    */     return new BigDecimal(this.value);
/*    */   }
/*    */   
/*    */   public float floatValue() {
/*    */     return Float.parseFloat(this.value);
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LazilyParsedNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */