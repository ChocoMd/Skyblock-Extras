/*   */ package com.google.gson.internal.bind;
/*   */ 
/*   */ final class TypeAdapters$26 implements TypeAdapterFactory {
/*   */   public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) {
/* 5 */     Class<?> clazz = paramTypeToken.getRawType(); try { if (Enum.class.isAssignableFrom(clazz))
/*   */         try { if (clazz != Enum.class) {
/* 7 */             if (!clazz.isEnum())
/*   */               clazz = clazz.getSuperclass(); 
/*   */             return new TypeAdapters$EnumTypeAdapter(clazz);
/*   */           } 
/*   */           return null; }
/*   */         catch (RuntimeException runtimeException)
/*   */         { throw b(null); }
/*   */           }
/*   */     catch (RuntimeException runtimeException)
/*   */     { throw b(null); }
/*   */     
/*   */     return null;
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$26.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */