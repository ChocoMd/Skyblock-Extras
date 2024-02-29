/*    */ package com.google.gson.internal;
/*    */ 
/*    */ import com.google.gson.JsonElement;
/*    */ import com.google.gson.JsonParseException;
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.google.gson.internal.bind.TypeAdapters;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.MalformedJsonException;
/*    */ import java.io.EOFException;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public final class Streams {
/* 13 */   public static JsonElement parse(JsonReader paramJsonReader) throws JsonParseException { boolean bool = true; try { paramJsonReader.peek(); bool = false; return (JsonElement)TypeAdapters.JSON_ELEMENT.read(paramJsonReader); } catch (EOFException eOFException) { try { if (bool)
/*    */           return (JsonElement)JsonNull.INSTANCE;  }
/*    */       catch (EOFException eOFException1) { throw b(null); }
/* 16 */        throw new JsonSyntaxException(eOFException); } catch (MalformedJsonException malformedJsonException) { throw new JsonSyntaxException(malformedJsonException); } catch (IOException iOException) { throw new JsonIOException(iOException); }
/* 17 */     catch (NumberFormatException numberFormatException) { throw new JsonSyntaxException(numberFormatException); }
/* 18 */      } public static void write(JsonElement paramJsonElement, JsonWriter paramJsonWriter) throws IOException { TypeAdapters.JSON_ELEMENT.write(paramJsonWriter, paramJsonElement); } public static Writer writerForAppendable(Appendable paramAppendable) { try {  }
/* 19 */     catch (JsonParseException jsonParseException) { throw b(null); }  return (paramAppendable instanceof Writer) ? (Writer)paramAppendable : new Streams$AppendableWriter(paramAppendable, null); }
/*    */ 
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Streams.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */