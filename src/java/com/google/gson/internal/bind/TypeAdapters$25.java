/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ 
/*    */ final class TypeAdapters$25 extends TypeAdapter<JsonElement> {
/*    */   public void write(JsonWriter paramJsonWriter, JsonElement paramJsonElement) throws IOException { 
/*  8 */     try { if (paramJsonElement != null) { try { if (!paramJsonElement.isJsonNull())
/*    */           
/*    */           { 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 36 */             if (paramJsonElement.isJsonPrimitive()) { JsonPrimitive jsonPrimitive = paramJsonElement.getAsJsonPrimitive(); try { if (jsonPrimitive.isNumber()) { paramJsonWriter.value(jsonPrimitive.getAsNumber()); }
/*    */                 else { 
/* 38 */                   try { if (jsonPrimitive.isBoolean())
/* 39 */                     { paramJsonWriter.value(jsonPrimitive.getAsBoolean()); } else { paramJsonWriter.value(jsonPrimitive.getAsString()); }  } catch (IOException iOException) { throw b(null); }
/*    */                    }
/*    */                  }
/*    */               catch (IOException iOException) { throw b(null); }
/*    */                }
/* 44 */              if (paramJsonElement.isJsonArray()) { paramJsonWriter.beginArray(); Iterator iterator = paramJsonElement.getAsJsonArray().iterator(); }  if (paramJsonElement.isJsonObject()) { paramJsonWriter.beginObject(); for (Map.Entry entry : paramJsonElement.getAsJsonObject().entrySet()) { paramJsonWriter.name((String)entry.getKey()); write(paramJsonWriter, (JsonElement)entry.getValue()); }  }  throw new IllegalArgumentException("Couldn't write " + paramJsonElement.getClass()); }  paramJsonWriter.nullValue(); } catch (IOException iOException) { throw b(null); }  return; }  } catch (IOException iOException) { throw b(null); }
/* 45 */      paramJsonWriter.nullValue(); } public JsonElement read(JsonReader paramJsonReader) throws IOException { try { String str; JsonArray jsonArray; JsonObject jsonObject; switch (TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[paramJsonReader.peek().ordinal()]) { case 3: return (JsonElement)new JsonPrimitive(paramJsonReader.nextString());case 1: str = paramJsonReader.nextString(); return (JsonElement)new JsonPrimitive((Number)new LazilyParsedNumber(str));case 2: return (JsonElement)new JsonPrimitive(Boolean.valueOf(paramJsonReader.nextBoolean()));case 4: paramJsonReader.nextNull(); return (JsonElement)JsonNull.INSTANCE;
/*    */         case 5: jsonArray = new JsonArray(); paramJsonReader.beginArray(); try { while (paramJsonReader.hasNext())
/* 47 */               jsonArray.add(read(paramJsonReader));  } catch (IOException iOException) { throw b(null); }  paramJsonReader.endArray(); return (JsonElement)jsonArray;
/*    */         case 6:
/*    */           jsonObject = new JsonObject();
/*    */           paramJsonReader.beginObject();
/*    */           try {
/*    */             while (paramJsonReader.hasNext())
/*    */               jsonObject.add(paramJsonReader.nextName(), read(paramJsonReader)); 
/*    */           } catch (IOException iOException) {
/*    */             throw b(null);
/*    */           } 
/*    */           paramJsonReader.endObject();
/*    */           return (JsonElement)jsonObject; }
/*    */        }
/*    */     catch (IOException iOException)
/*    */     { throw b(null); }
/*    */     
/*    */     throw new IllegalArgumentException(); }
/*    */ 
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$25.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */