/* 1 */ package com.google.gson;class Gson$2 implements JsonSerializationContext { public JsonElement serialize(Object paramObject, Type paramType) { return Gson.this.toJsonTree(paramObject, paramType); }
/*   */    final Gson this$0; public JsonElement serialize(Object paramObject) {
/* 3 */     return Gson.this.toJsonTree(paramObject);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\Gson$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */