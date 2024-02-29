/*   */ package com.google.gson;
/*   */ 
/*   */ public enum LongSerializationPolicy
/*   */ {
/* 5 */   DEFAULT, STRING;
/* 6 */   private static final LongSerializationPolicy[] $VALUES = new LongSerializationPolicy[] { DEFAULT, STRING };
/*   */   
/*   */   public abstract JsonElement serialize(Long paramLong);
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\LongSerializationPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */