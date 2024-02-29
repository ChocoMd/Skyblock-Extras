/*   */ package com.google.gson.internal.bind;final class DateTypeAdapter$1 implements TypeAdapterFactory { public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { try {  }
/* 2 */     catch (RuntimeException runtimeException) { throw b(null); }  return (paramTypeToken.getRawType() == Date.class) ? new DateTypeAdapter() : null; }
/*   */ 
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\DateTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */