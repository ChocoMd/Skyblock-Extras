/*    */ package com.google.gson;
/*    */ import java.util.Map;
/*  3 */ public final class JsonObject extends JsonElement { public JsonArray getAsJsonArray(String paramString) { return (JsonArray)this.members.get(paramString); } public void addProperty(String paramString, Number paramNumber) { add(paramString, createJsonElement(paramNumber)); } public void addProperty(String paramString, Boolean paramBoolean) { add(paramString, createJsonElement(paramBoolean)); } public JsonObject getAsJsonObject(String paramString) { return (JsonObject)this.members.get(paramString); } JsonObject deepCopy() { JsonObject jsonObject = new JsonObject();
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
/* 17 */     for (Map.Entry entry : this.members.entrySet())
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 24 */       jsonObject.add((String)entry.getKey(), ((JsonElement)entry.getValue()).deepCopy()); }  return jsonObject; }
/* 25 */   public JsonPrimitive getAsJsonPrimitive(String paramString) { return (JsonPrimitive)this.members.get(paramString); } public boolean has(String paramString) { return this.members.containsKey(paramString); } public int hashCode() { return this.members.hashCode(); } public JsonElement remove(String paramString) { return (JsonElement)this.members.remove(paramString); } public JsonElement get(String paramString) { return (JsonElement)this.members.get(paramString); } public void addProperty(String paramString, Character paramCharacter) { add(paramString, createJsonElement(paramCharacter)); } private JsonElement createJsonElement(Object paramObject) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (paramObject == null) ? JsonNull.INSTANCE : new JsonPrimitive(paramObject); }
/* 26 */   public void add(String paramString, JsonElement paramJsonElement) { if (paramJsonElement == null)
/*    */       paramJsonElement = JsonNull.INSTANCE; 
/*    */     this.members.put(paramString, paramJsonElement); }
/*    */ 
/*    */   
/*    */   public Set<Map.Entry<String, JsonElement>> entrySet() {
/*    */     return this.members.entrySet();
/*    */   }
/*    */   
/*    */   private final LinkedTreeMap<String, JsonElement> members = new LinkedTreeMap();
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     try {
/*    */       if (paramObject != this) {
/*    */         try {
/*    */           if (paramObject instanceof JsonObject)
/*    */             try {
/*    */               if (((JsonObject)paramObject).members.equals(this.members));
/*    */             } catch (RuntimeException runtimeException) {
/*    */               throw b(null);
/*    */             }  
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         return false;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void addProperty(String paramString1, String paramString2) {
/*    */     add(paramString1, createJsonElement(paramString2));
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonObject.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */