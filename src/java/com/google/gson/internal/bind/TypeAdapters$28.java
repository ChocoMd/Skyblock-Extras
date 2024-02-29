/* 1 */ package com.google.gson.internal.bind;final class TypeAdapters$28 implements TypeAdapterFactory { final Class val$type; public String toString() { return "Factory[type=" + type.getName() + ",adapter=" + typeAdapter + "]"; }
/*   */   final TypeAdapter val$typeAdapter; private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { try {  }
/* 3 */     catch (RuntimeException runtimeException) { throw b(null); }  return (paramTypeToken.getRawType() == type) ? typeAdapter : null; }
/*   */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$28.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */