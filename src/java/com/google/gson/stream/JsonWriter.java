/*     */ package com.google.gson.stream;public class JsonWriter implements Closeable, Flushable { private boolean serializeNulls; private String deferredName; private boolean htmlSafe; private boolean lenient; public JsonWriter value(boolean paramBoolean) throws IOException { 
/*   2 */     try { writeDeferredName();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       beforeValue(false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */        }
/*     */     
/*     */     catch (IOException iOException)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 162 */       throw b(null); }  this.out.write(paramBoolean ? "true" : "false"); return this; } private String separator; private String indent; private int stackSize; private int[] stack; private final Writer out; public JsonWriter name(String paramString) throws IOException { try { if (paramString == null)
/*     */         throw new NullPointerException("name == null");  } catch (IOException iOException) { throw b(null); }
/*     */      try { if (this.deferredName != null)
/*     */         throw new IllegalStateException();  }
/*     */     catch (IOException iOException) { throw b(null); }
/*     */      try { if (this.stackSize == 0)
/* 168 */         throw new IllegalStateException("JsonWriter is closed.");  } catch (IOException iOException) { throw b(null); }
/*     */      this.deferredName = paramString; return this; } private JsonWriter open(int paramInt, String paramString) throws IOException { beforeValue(true); push(paramInt); this.out.write(paramString);
/* 170 */     return this; } public JsonWriter value(long paramLong) throws IOException { writeDeferredName(); beforeValue(false); this.out.write(Long.toString(paramLong)); return this; }
/*     */   public JsonWriter beginObject() throws IOException { writeDeferredName(); return open(3, "{"); }
/* 172 */   static { HTML_SAFE_REPLACEMENT_CHARS[60] = "\\u003c"; HTML_SAFE_REPLACEMENT_CHARS[62] = "\\u003e"; HTML_SAFE_REPLACEMENT_CHARS[38] = "\\u0026"; HTML_SAFE_REPLACEMENT_CHARS[61] = "\\u003d"; HTML_SAFE_REPLACEMENT_CHARS[39] = "\\u0027"; } private void push(int paramInt) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield stackSize : I
/*     */     //   4: aload_0
/*     */     //   5: getfield stack : [I
/*     */     //   8: arraylength
/*     */     //   9: if_icmpne -> 40
/*     */     //   12: aload_0
/*     */     //   13: getfield stackSize : I
/*     */     //   16: iconst_2
/*     */     //   17: imul
/*     */     //   18: newarray int
/*     */     //   20: astore_2
/*     */     //   21: aload_0
/*     */     //   22: getfield stack : [I
/*     */     //   25: iconst_0
/*     */     //   26: aload_2
/*     */     //   27: iconst_0
/*     */     //   28: aload_0
/*     */     //   29: getfield stackSize : I
/*     */     //   32: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*     */     //   35: aload_0
/*     */     //   36: aload_2
/*     */     //   37: putfield stack : [I
/*     */     //   40: aload_0
/*     */     //   41: getfield stack : [I
/*     */     //   44: aload_0
/*     */     //   45: dup
/*     */     //   46: getfield stackSize : I
/*     */     //   49: dup_x1
/*     */     //   50: iconst_1
/*     */     //   51: iadd
/*     */     //   52: putfield stackSize : I
/*     */     //   55: iload_1
/*     */     //   56: iastore
/*     */     //   57: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #48	-> 0
/*     */     //   #113	-> 12
/*     */     //   #150	-> 21
/*     */     //   #9	-> 35
/*     */     //   #89	-> 40
/*     */     //   #91	-> 57 }
/*     */   public JsonWriter value(Number paramNumber) throws IOException { try { if (paramNumber == null)
/*     */         return nullValue();  } catch (IOException iOException) { throw b(null); }
/* 175 */      writeDeferredName();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     String str = paramNumber.toString();
/*     */     try {
/*     */       if (!this.lenient)
/*     */         try {
/*     */           if (!str.equals("-Infinity")) {
/*     */             try {
/*     */               if (!str.equals("Infinity")) {
/*     */                 try {
/*     */                   if (str.equals("NaN"))
/*     */                     throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber); 
/*     */                 } catch (IOException iOException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } else {
/*     */                 throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
/*     */               } 
/*     */             } catch (IOException iOException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } else {
/*     */             throw new IllegalArgumentException("Numeric values must be finite, but was " + paramNumber);
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     beforeValue(false);
/*     */     this.out.append(str);
/*     */     return this; }
/*     */ 
/*     */   
/*     */   public JsonWriter value(double paramDouble) throws IOException {
/*     */     try {
/*     */       if (!Double.isNaN(paramDouble))
/*     */         try {
/*     */           if (!Double.isInfinite(paramDouble)) {
/*     */             writeDeferredName();
/*     */             beforeValue(false);
/*     */             this.out.append(Double.toString(paramDouble));
/*     */             return this;
/*     */           } 
/*     */           throw new IllegalArgumentException("Numeric values must be finite, but was " + paramDouble);
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Numeric values must be finite, but was " + paramDouble);
/*     */   }
/*     */   
/*     */   public JsonWriter nullValue() throws IOException {
/*     */     try {
/*     */       if (this.deferredName != null)
/*     */         try {
/*     */           if (this.serializeNulls) {
/*     */             writeDeferredName();
/*     */           } else {
/*     */             this.deferredName = null;
/*     */             return this;
/*     */           } 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     beforeValue(false);
/*     */     this.out.write("null");
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static final String[] HTML_SAFE_REPLACEMENT_CHARS = (String[])REPLACEMENT_CHARS.clone();
/*     */   
/*     */   public JsonWriter beginArray() throws IOException {
/*     */     writeDeferredName();
/*     */     return open(1, "[");
/*     */   }
/*     */   
/*     */   public void close() throws IOException {
/*     */     this.out.close();
/*     */     int i = this.stackSize;
/*     */     try {
/*     */       if (i <= 1) {
/*     */         try {
/*     */           if (i == 1)
/*     */             try {
/*     */               if (this.stack[i - 1] != 7)
/*     */                 throw new IOException("Incomplete document"); 
/*     */             } catch (IOException iOException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } else {
/*     */         throw new IOException("Incomplete document");
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.stackSize = 0;
/*     */   }
/*     */   
/*     */   private void string(String paramString) throws IOException {
/*     */     try {
/*     */     
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     String[] arrayOfString = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
/*     */     this.out.write("\"");
/*     */     byte b1 = 0;
/*     */     int i = paramString.length();
/*     */     for (byte b2 = 0; b2 < i; ) {
/*     */       continue;
/*     */       c = paramString.charAt(b2);
/*     */     } 
/*     */     try {
/*     */       if (b1 < i)
/*     */         this.out.write(paramString, b1, i - b1); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.out.write("\"");
/*     */   }
/*     */   
/*     */   public final void setHtmlSafe(boolean paramBoolean) {
/*     */     this.htmlSafe = paramBoolean;
/*     */   }
/*     */   
/*     */   private void newline() throws IOException {
/*     */     try {
/*     */       if (this.indent == null)
/*     */         return; 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.out.write("\n");
/*     */     byte b = 1;
/*     */     int i = this.stackSize;
/*     */     try {
/*     */       while (b < i) {
/*     */         this.out.write(this.indent);
/*     */         b++;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static {
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b <= 31) {
/*     */         REPLACEMENT_CHARS[b] = String.format("\\u%04x", new Object[] { Integer.valueOf(b) });
/*     */         b++;
/*     */       } 
/*     */     } catch (NullPointerException nullPointerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     REPLACEMENT_CHARS[34] = "\\\"";
/*     */     REPLACEMENT_CHARS[92] = "\\\\";
/*     */     REPLACEMENT_CHARS[9] = "\\t";
/*     */     REPLACEMENT_CHARS[8] = "\\b";
/*     */     REPLACEMENT_CHARS[10] = "\\n";
/*     */     REPLACEMENT_CHARS[13] = "\\r";
/*     */     REPLACEMENT_CHARS[12] = "\\f";
/*     */   }
/*     */   
/*     */   private void writeDeferredName() throws IOException {
/*     */     try {
/*     */       if (this.deferredName != null) {
/*     */         beforeName();
/*     */         string(this.deferredName);
/*     */         this.deferredName = null;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final boolean isHtmlSafe() {
/*     */     return this.htmlSafe;
/*     */   }
/*     */   
/*     */   public final void setSerializeNulls(boolean paramBoolean) {
/*     */     this.serializeNulls = paramBoolean;
/*     */   }
/*     */   
/*     */   public final boolean getSerializeNulls() {
/*     */     return this.serializeNulls;
/*     */   }
/*     */   
/*     */   public final void setIndent(String paramString) {
/*     */     try {
/*     */       if (paramString.length() == 0) {
/*     */         this.indent = null;
/*     */         this.separator = ":";
/*     */       } 
/*     */     } catch (NullPointerException nullPointerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.indent = paramString;
/*     */     this.separator = ": ";
/*     */   }
/*     */   
/*     */   public boolean isLenient() {
/*     */     return this.lenient;
/*     */   }
/*     */   
/*     */   private void beforeName() throws IOException {
/*     */     int i = peek();
/*     */     try {
/*     */       if (i == 5) {
/*     */         this.out.write(44);
/*     */       } else {
/*     */         try {
/*     */           if (i != 3)
/*     */             throw new IllegalStateException("Nesting problem."); 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     newline();
/*     */     replaceTop(4);
/*     */   }
/*     */   
/*     */   private void replaceTop(int paramInt) {
/*     */     this.stack[this.stackSize - 1] = paramInt;
/*     */   }
/*     */   
/*     */   private JsonWriter close(int paramInt1, int paramInt2, String paramString) throws IOException {
/*     */     int i = peek();
/*     */     try {
/*     */       if (i != paramInt2)
/*     */         try {
/*     */           if (i != paramInt1)
/*     */             throw new IllegalStateException("Nesting problem."); 
/*     */         } catch (IOException iOException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (this.deferredName != null)
/*     */         throw new IllegalStateException("Dangling name: " + this.deferredName); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.stackSize--;
/*     */       if (i == paramInt2)
/*     */         newline(); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.out.write(paramString);
/*     */     return this;
/*     */   }
/*     */   
/*     */   public void flush() throws IOException {
/*     */     try {
/*     */       if (this.stackSize == 0)
/*     */         throw new IllegalStateException("JsonWriter is closed."); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.out.flush();
/*     */   }
/*     */   
/*     */   public JsonWriter(Writer paramWriter) {
/*     */     this.stack = new int[32];
/*     */     this.stackSize = 0;
/*     */     push(6);
/*     */     this.separator = ":";
/*     */     this.serializeNulls = true;
/*     */     if (paramWriter == null)
/*     */       throw new NullPointerException("out == null"); 
/*     */     this.out = paramWriter;
/*     */   }
/*     */   
/*     */   private int peek() {
/*     */     try {
/*     */       if (this.stackSize == 0)
/*     */         throw new IllegalStateException("JsonWriter is closed."); 
/*     */     } catch (NullPointerException nullPointerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return this.stack[this.stackSize - 1];
/*     */   }
/*     */   
/*     */   public JsonWriter endArray() throws IOException {
/*     */     return close(1, 2, "]");
/*     */   }
/*     */   
/*     */   private static final String[] REPLACEMENT_CHARS = new String[128];
/*     */   
/*     */   public final void setLenient(boolean paramBoolean) {
/*     */     this.lenient = paramBoolean;
/*     */   }
/*     */   
/*     */   private void beforeValue(boolean paramBoolean) throws IOException {
/*     */     try {
/*     */       switch (peek()) {
/*     */         case 7:
/*     */           try {
/*     */             if (!this.lenient)
/*     */               throw new IllegalStateException("JSON must have only one top-level value."); 
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 6:
/*     */           try {
/*     */             if (!this.lenient)
/*     */               try {
/*     */                 if (!paramBoolean)
/*     */                   throw new IllegalStateException("JSON must start with an array or an object."); 
/*     */               } catch (IOException iOException) {
/*     */                 throw b(null);
/*     */               }  
/*     */           } catch (IOException iOException) {
/*     */             throw b(null);
/*     */           } 
/*     */           replaceTop(7);
/*     */           return;
/*     */         case 1:
/*     */           replaceTop(2);
/*     */           newline();
/*     */           return;
/*     */         case 2:
/*     */           this.out.append(',');
/*     */           newline();
/*     */           return;
/*     */         case 4:
/*     */           this.out.append(this.separator);
/*     */           replaceTop(5);
/*     */           return;
/*     */       } 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Nesting problem.");
/*     */   }
/*     */   
/*     */   public JsonWriter endObject() throws IOException {
/*     */     return close(3, 5, "}");
/*     */   }
/*     */   
/*     */   public JsonWriter value(String paramString) throws IOException {
/*     */     try {
/*     */       if (paramString == null)
/*     */         return nullValue(); 
/*     */     } catch (IOException iOException) {
/*     */       throw b(null);
/*     */     } 
/*     */     writeDeferredName();
/*     */     beforeValue(false);
/*     */     string(paramString);
/*     */     return this;
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\stream\JsonWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */