/*   */ package com.google.gson.internal.bind;abstract class ReflectiveTypeAdapterFactory$BoundField { protected ReflectiveTypeAdapterFactory$BoundField(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/* 2 */     this.name = paramString;
/*   */ 
/*   */     
/* 5 */     this.serialized = paramBoolean1;
/*   */     this.deserialized = paramBoolean2;
/*   */   }
/*   */   
/*   */   final String name;
/*   */   final boolean serialized;
/*   */   final boolean deserialized;
/*   */   
/*   */   abstract void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException, IllegalAccessException;
/*   */   
/*   */   abstract void read(JsonReader paramJsonReader, Object paramObject) throws IOException, IllegalAccessException; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$BoundField.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */