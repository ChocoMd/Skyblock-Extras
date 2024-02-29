/*  1 */ package com.google.gson.internal.bind;final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> { public void write(JsonWriter paramJsonWriter, T paramT) throws IOException { TypeAdapter<T> typeAdapter = this.delegate;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     Type type = getRuntimeTypeIfMoreSpecific(this.type, paramT);
/*    */     if (type != this.type) {
/*    */       TypeAdapter<T> typeAdapter1 = this.context.getAdapter(TypeToken.get(type));
/*    */       if (!(typeAdapter1 instanceof ReflectiveTypeAdapterFactory$Adapter)) {
/*    */         typeAdapter = typeAdapter1;
/*    */       } else if (!(this.delegate instanceof ReflectiveTypeAdapterFactory$Adapter)) {
/*    */         typeAdapter = this.delegate;
/*    */       } else {
/*    */         typeAdapter = typeAdapter1;
/*    */       } 
/*    */     } 
/*    */     typeAdapter.write(paramJsonWriter, paramT); }
/*    */ 
/*    */   
/*    */   private final Gson context;
/*    */   private final TypeAdapter<T> delegate;
/*    */   private final Type type;
/*    */   
/*    */   private Type getRuntimeTypeIfMoreSpecific(Type<?> paramType, Object paramObject) {
/*    */     try {
/*    */       if (paramObject != null) {
/*    */         try {
/*    */           if (paramType != Object.class) {
/*    */             try {
/*    */               if (paramType instanceof java.lang.reflect.TypeVariable || paramType instanceof Class) {
/*    */                 paramType = paramObject.getClass();
/*    */                 return paramType;
/*    */               } 
/*    */             } catch (RuntimeException runtimeException) {
/*    */               throw b(null);
/*    */             } 
/*    */             return paramType;
/*    */           } 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } else {
/*    */         return paramType;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramType = paramObject.getClass();
/*    */     return paramType;
/*    */   }
/*    */   
/*    */   public T read(JsonReader paramJsonReader) throws IOException {
/*    */     return (T)this.delegate.read(paramJsonReader);
/*    */   }
/*    */   
/*    */   TypeAdapterRuntimeTypeWrapper(Gson paramGson, TypeAdapter<T> paramTypeAdapter, Type paramType) {
/*    */     this.context = paramGson;
/*    */     this.delegate = paramTypeAdapter;
/*    */     this.type = paramType;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapterRuntimeTypeWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */