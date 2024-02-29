/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ 
/*    */ public final class MapTypeAdapterFactory implements TypeAdapterFactory {
/*    */   private final ConstructorConstructor constructorConstructor;
/*    */   
/*  7 */   public MapTypeAdapterFactory(ConstructorConstructor paramConstructorConstructor, boolean paramBoolean) { this.constructorConstructor = paramConstructorConstructor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     this.complexMapKeySerialization = paramBoolean; } private final boolean complexMapKeySerialization; public <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken) { Type type = paramTypeToken.getType(); Class<?> clazz = paramTypeToken.getRawType(); try {
/* 17 */       if (!Map.class.isAssignableFrom(clazz))
/*    */         return null; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Class clazz1 = .Gson.Types.getRawType(type);
/*    */     Type[] arrayOfType = .Gson.Types.getMapKeyAndValueTypes(type, clazz1);
/*    */     TypeAdapter<?> typeAdapter1 = getKeyAdapter(paramGson, arrayOfType[0]);
/*    */     TypeAdapter<?> typeAdapter2 = paramGson.getAdapter(TypeToken.get(arrayOfType[1]));
/*    */     ObjectConstructor<? extends Map<?, ?>> objectConstructor = this.constructorConstructor.get(paramTypeToken);
/*    */     return (TypeAdapter)new MapTypeAdapterFactory$Adapter<Object, Object>(this, paramGson, arrayOfType[0], typeAdapter1, arrayOfType[1], typeAdapter2, objectConstructor); }
/*    */ 
/*    */   
/*    */   private TypeAdapter<?> getKeyAdapter(Gson paramGson, Type paramType) {
/*    */     try {
/*    */       if (paramType != boolean.class) {
/*    */         try {
/*    */           if (paramType == Boolean.class);
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         return paramGson.getAdapter(TypeToken.get(paramType));
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\MapTypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */