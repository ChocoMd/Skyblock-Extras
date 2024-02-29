/*    */ package com.google.gson;
/*    */ 
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.MalformedJsonException;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class JsonParser {
/*  8 */   public JsonElement parse(String paramString) throws JsonSyntaxException { return parse(new StringReader(paramString)); } public JsonElement parse(Reader paramReader) throws JsonIOException, JsonSyntaxException { 
/*  9 */     try { JsonReader jsonReader = new JsonReader(paramReader);
/*    */       
/* 11 */       JsonElement jsonElement = parse(jsonReader);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 16 */       try { if (!jsonElement.isJsonNull()) try { if (jsonReader.peek() != JsonToken.END_DOCUMENT)
/*    */             {
/* 18 */               throw new JsonSyntaxException("Did not consume the entire document."); }  } catch (MalformedJsonException malformedJsonException) { throw b(null); }
/*    */             }
/*    */       catch (MalformedJsonException malformedJsonException) { throw b(null); }
/* 21 */        return jsonElement; } catch (MalformedJsonException malformedJsonException) { throw new JsonSyntaxException(malformedJsonException); } catch (IOException iOException) { throw new JsonIOException(iOException); } catch (NumberFormatException numberFormatException) { throw new JsonSyntaxException(numberFormatException); }
/* 22 */      } public JsonElement parse(JsonReader paramJsonReader) throws JsonIOException, JsonSyntaxException { boolean bool = paramJsonReader.isLenient(); paramJsonReader.setLenient(true); try { return Streams.parse(paramJsonReader); }
/*    */     catch (StackOverflowError stackOverflowError)
/*    */     { throw new JsonParseException("Failed parsing JSON source: " + paramJsonReader + " to Json", stackOverflowError); }
/*    */     catch (OutOfMemoryError outOfMemoryError)
/*    */     { throw new JsonParseException("Failed parsing JSON source: " + paramJsonReader + " to Json", outOfMemoryError); }
/*    */     finally
/*    */     { paramJsonReader.setLenient(bool); }
/*    */      }
/*    */ 
/*    */   
/*    */   private static MalformedJsonException b(MalformedJsonException paramMalformedJsonException) {
/*    */     return paramMalformedJsonException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */