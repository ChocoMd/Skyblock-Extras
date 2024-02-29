/*    */ package com.google.gson.internal.bind;
/*    */ public final class CollectionTypeAdapterFactory implements TypeAdapterFactory {
/*    */   private final ConstructorConstructor constructorConstructor;
/*    */   
/*  5 */   public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { Type type1 = paramTypeToken.getType();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 10 */     Class<?> clazz = paramTypeToken.getRawType(); try { if (!Collection.class.isAssignableFrom(clazz))
/* 11 */         return null;  } catch (RuntimeException runtimeException) { throw b(null); }  Type type2 = .Gson.Types.getCollectionElementType(type1, clazz); TypeAdapter<?> typeAdapter = paramGson.getAdapter(TypeToken.get(type2)); ObjectConstructor<? extends Collection<?>> objectConstructor = this.constructorConstructor.get(paramTypeToken); return new CollectionTypeAdapterFactory$Adapter(paramGson, type2, typeAdapter, objectConstructor); }
/* 12 */   private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } public CollectionTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor) { this.constructorConstructor = paramConstructorConstructor; }
/*    */ 
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\CollectionTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */