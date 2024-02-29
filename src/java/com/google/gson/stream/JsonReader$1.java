/*    */ package com.google.gson.stream;
/*    */ import com.google.gson.internal.bind.JsonTreeReader;
/*    */ import java.io.IOException;
/*    */ 
/*    */ final class JsonReader$1 extends JsonReaderInternalAccess {
/*    */   public void promoteNameToValue(JsonReader paramJsonReader) throws IOException {
/*    */     
/*  8 */     try { if (paramJsonReader instanceof JsonTreeReader)
/*    */       
/*    */       { 
/* 11 */         ((JsonTreeReader)paramJsonReader).promoteNameToValue(); return; }  }
/*    */     catch (IOException iOException) { throw b(null); }
/*    */      int i = JsonReader.access$000(paramJsonReader); if (i == 0)
/* 14 */       i = JsonReader.access$100(paramJsonReader);  try { if (i == 13)
/* 15 */       { JsonReader.access$002(paramJsonReader, 9); } else { try { if (i == 12) { JsonReader.access$002(paramJsonReader, 8); } else { try { if (i == 14) { JsonReader.access$002(paramJsonReader, 10); } else { throw new IllegalStateException("Expected a name but was " + paramJsonReader.peek() + " " + " at line " + JsonReader.access$200(paramJsonReader) + " column " + JsonReader.access$300(paramJsonReader)); }  } catch (IOException iOException) { throw b(null); }  }  } catch (IOException iOException) { throw b(null); }  }  } catch (IOException iOException) { throw b(null); }
/*    */   
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\stream\JsonReader$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */