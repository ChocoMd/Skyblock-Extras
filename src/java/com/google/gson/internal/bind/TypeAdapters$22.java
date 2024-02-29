/* 1 */ package com.google.gson.internal.bind;final class TypeAdapters$22 implements TypeAdapterFactory { public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { try { if (paramTypeToken.getRawType() != Timestamp.class)
/*   */       {
/* 3 */         return null; }  } catch (RuntimeException runtimeException) { throw b(null); }
/* 4 */      TypeAdapter typeAdapter = paramGson.getAdapter(Date.class);
/* 5 */     return new TypeAdapters$22$1(this, typeAdapter); }
/*   */ 
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$22.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */