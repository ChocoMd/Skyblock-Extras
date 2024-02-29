/* 1 */ package com.google.gson.internal.bind;final class TypeAdapters$27 implements TypeAdapterFactory { public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return paramTypeToken.equals(type) ? typeAdapter : null; }
/*   */ 
/*   */   
/*   */   final TypeToken val$type;
/*   */   final TypeAdapter val$typeAdapter;
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$27.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */