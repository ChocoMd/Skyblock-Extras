/* 1 */ package com.google.gson.internal.bind;final class TypeAdapters$31 implements TypeAdapterFactory { final Class val$clazz; public String toString() { return "Factory[typeHierarchy=" + clazz.getName() + ",adapter=" + typeAdapter + "]"; }
/* 2 */   final TypeAdapter val$typeAdapter; private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return clazz.isAssignableFrom(paramTypeToken.getRawType()) ? typeAdapter : null; }
/*   */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$31.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */