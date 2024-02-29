/*   */ package com.google.gson.internal.bind;
/* 2 */ final class TypeAdapters$29 implements TypeAdapterFactory { final Class val$unboxed; final Class val$boxed; public String toString() { return "Factory[type=" + boxed.getName() + "+" + unboxed.getName() + ",adapter=" + typeAdapter + "]"; }
/* 3 */   final TypeAdapter val$typeAdapter; private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { Class clazz = paramTypeToken.getRawType();
/*   */     try {
/*   */       if (clazz != unboxed) {
/*   */         try {
/*   */           if (clazz == boxed);
/*   */         } catch (RuntimeException runtimeException) {
/*   */           throw b(null);
/*   */         } 
/*   */         return null;
/*   */       } 
/*   */     } catch (RuntimeException runtimeException) {
/*   */       throw b(null);
/*   */     }  }
/*   */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$29.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */