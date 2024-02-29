/*   */ package com.google.gson;public final class JsonNull extends JsonElement { public boolean equals(Object paramObject) { 
/* 2 */     try { if (this != paramObject) { try { if (paramObject instanceof JsonNull); } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }  }
/* 3 */   private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } public static final JsonNull INSTANCE = new JsonNull();
/*   */   
/* 5 */   public int hashCode() { return JsonNull.class.hashCode(); } JsonNull deepCopy() {
/* 6 */     return INSTANCE;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonNull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */