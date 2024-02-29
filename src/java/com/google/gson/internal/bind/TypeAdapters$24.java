/*    */ package com.google.gson.internal.bind;
/*    */ import com.google.gson.TypeAdapter;
/*    */ import com.google.gson.stream.JsonReader;
/*    */ import com.google.gson.stream.JsonToken;
/*    */ import com.google.gson.stream.JsonWriter;
/*    */ import java.io.IOException;
/*    */ import java.util.Locale;
/*    */ import java.util.StringTokenizer;
/*    */ 
/*    */ final class TypeAdapters$24 extends TypeAdapter<Locale> {
/*    */   public Locale read(JsonReader paramJsonReader) throws IOException {
/*    */     try {
/* 13 */       if (paramJsonReader.peek() == JsonToken.NULL) {
/*    */ 
/*    */ 
/*    */         
/* 17 */         paramJsonReader.nextNull(); return null;
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     }  String str1 = paramJsonReader.nextString(); StringTokenizer stringTokenizer = new StringTokenizer(str1, "_"); String str2 = null; String str3 = null;
/* 22 */     String str4 = null; if (stringTokenizer.hasMoreElements())
/*    */       str2 = stringTokenizer.nextToken();  if (stringTokenizer.hasMoreElements())
/* 24 */       str3 = stringTokenizer.nextToken(); 
/*    */     if (stringTokenizer.hasMoreElements())
/*    */       str4 = stringTokenizer.nextToken(); 
/*    */     try {
/*    */       if (str3 == null)
/*    */         try {
/*    */           if (str4 == null)
/*    */             return new Locale(str2); 
/*    */         } catch (IOException iOException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (str4 == null)
/*    */         return new Locale(str2, str3); 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return new Locale(str2, str3, str4);
/*    */   }
/*    */   
/*    */   public void write(JsonWriter paramJsonWriter, Locale paramLocale) throws IOException {
/*    */     try {
/*    */     
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     paramJsonWriter.value((paramLocale == null) ? null : paramLocale.toString());
/*    */   }
/*    */   
/*    */   private static IOException b(IOException paramIOException) {
/*    */     return paramIOException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters$24.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */