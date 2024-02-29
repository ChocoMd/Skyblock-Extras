/*   */ package com.google.gson.internal.bind;final class ArrayTypeAdapter$1 implements TypeAdapterFactory { public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) {
/* 2 */     Type type1 = paramTypeToken.getType();
/*   */ 
/*   */ 
/*   */ 
/*   */     
/* 7 */     try { if (!(type1 instanceof java.lang.reflect.GenericArrayType)) try { if (type1 instanceof Class) { try { if (!((Class)type1).isArray()) return null;  } catch (RuntimeException runtimeException) { throw b(null); }  } else { return null; }  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }
/*   */     
/*   */     Type type2 = .Gson.Types.getArrayComponentType(type1);
/*   */     TypeAdapter<?> typeAdapter = paramGson.getAdapter(TypeToken.get(type2));
/*   */     return new ArrayTypeAdapter(paramGson, typeAdapter, .Gson.Types.getRawType(type2));
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ArrayTypeAdapter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */