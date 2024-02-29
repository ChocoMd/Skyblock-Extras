/*    */ package com.google.gson.internal.bind;
/*    */ 
/*    */ import com.google.gson.JsonSyntaxException;
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonToken;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.BitSet;
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
/*    */ final class TypeAdapters$2
/*    */   extends TypeAdapter<BitSet>
/*    */ {
/*    */   public BitSet read(JsonReader paramJsonReader) throws IOException {
/*    */     
/* 27 */     try { if (paramJsonReader.peek() == JsonToken.NULL)
/*    */       
/*    */       { 
/*    */         
/* 31 */         paramJsonReader.nextNull(); return null; }  } catch (NumberFormatException numberFormatException) { throw b(null); }
/* 32 */      BitSet bitSet = new BitSet();
/*    */ 
/*    */     
/*    */     paramJsonReader.beginArray();
/*    */     
/* 37 */     boolean bool = false; JsonToken jsonToken = paramJsonReader.peek(); while (true) { try { if (jsonToken != JsonToken.END_ARRAY) { boolean bool1; try { String str; switch (TypeAdapters$32.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) { case 1: try {  } catch (NumberFormatException numberFormatException) { throw b(null); }  bool1 = (paramJsonReader.nextInt() != 0); break;case 2: bool1 = paramJsonReader.nextBoolean(); break;case 3: str = paramJsonReader.nextString(); try { try {  } catch (NumberFormatException numberFormatException) { throw b(null); }  bool1 = (Integer.parseInt(str) != 0); } catch (NumberFormatException numberFormatException) { throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + str); }  break;
/* 38 */               default: throw new JsonSyntaxException("Invalid bitset value type: " + jsonToken); }
/*    */              }
/*    */           catch (NumberFormatException numberFormatException)
/*    */           { throw b(null); }
/*    */           
/*    */           try {
/*    */             if (bool1)
/*    */               bitSet.set(bool); 
/*    */           } catch (NumberFormatException numberFormatException) {
/*    */             throw b(null);
/*    */           }  }
/*    */          }
/*    */       catch (NumberFormatException numberFormatException)
/*    */       { throw b(null); }
/*    */       
/*    */       paramJsonReader.endArray();
/*    */       return bitSet; }
/*    */   
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, BitSet paramBitSet) throws IOException {
/*    */     try {
/*    */       if (paramBitSet == null) {
/*    */         paramJsonWriter.nullValue();
/*    */         return;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.beginArray();
/*    */     byte b = 0;
/*    */     while (true) {
/*    */       try {
/*    */         if (b < paramBitSet.length()) {
/*    */           try {
/*    */           
/*    */           } catch (IOException iOException) {
/*    */             throw b(null);
/*    */           } 
/*    */           boolean bool = paramBitSet.get(b) ? true : false;
/*    */           paramJsonWriter.value(bool);
/*    */           b++;
/*    */         } 
/*    */       } catch (IOException iOException) {
/*    */         throw b(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     paramJsonWriter.endArray();
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */