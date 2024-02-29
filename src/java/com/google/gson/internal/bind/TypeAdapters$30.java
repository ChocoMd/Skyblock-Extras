/*   */ package com.google.gson.internal.bind;final class TypeAdapters$30 implements TypeAdapterFactory { public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) {
/* 2 */     Class clazz = paramTypeToken.getRawType();
/*   */     
/* 4 */     try { if (clazz != base) { try { if (clazz == sub); } catch (RuntimeException runtimeException) { throw b(null); }  return null; }  } catch (RuntimeException runtimeException) { throw b(null); }
/*   */   
/*   */   }
/*   */   
/*   */   final Class val$base;
/*   */   final Class val$sub;
/*   */   final TypeAdapter val$typeAdapter;
/*   */   
/*   */   public String toString() {
/*   */     return "Factory[type=" + base.getName() + "+" + sub.getName() + ",adapter=" + typeAdapter + "]";
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$30.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */