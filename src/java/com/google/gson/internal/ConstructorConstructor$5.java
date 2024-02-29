/*   */ package com.google.gson.internal;class ConstructorConstructor$5 implements ObjectConstructor<T> { public T construct() {
/* 2 */     if (type instanceof ParameterizedType)
/* 3 */     { Type type = ((ParameterizedType)type).getActualTypeArguments()[0];
/*   */ 
/*   */       
/* 6 */       try { if (type instanceof Class)
/* 7 */           return (T)EnumSet.noneOf((Class<Enum>)type);  } catch (JsonIOException jsonIOException) { throw b(null); }  throw new JsonIOException("Invalid EnumSet type: " + type.toString()); }  throw new JsonIOException("Invalid EnumSet type: " + type.toString());
/*   */   }
/*   */   
/*   */   final Type val$type;
/*   */   final ConstructorConstructor this$0;
/*   */   
/*   */   private static JsonIOException b(JsonIOException paramJsonIOException) {
/*   */     return paramJsonIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\ConstructorConstructor$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */