/*    */ package com.google.gson.internal.bind;public final class JsonTreeWriter extends JsonWriter { private JsonElement peek() {
/*  2 */     return this.stack.get(this.stack.size() - 1);
/*  3 */   } private JsonElement product = (JsonElement)JsonNull.INSTANCE; private String pendingName; private final List<JsonElement> stack;
/*    */   public JsonWriter value(boolean paramBoolean) throws IOException {
/*  5 */     put((JsonElement)new JsonPrimitive(Boolean.valueOf(paramBoolean)));
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     return this;
/*    */   }
/*    */   
/*    */   public JsonWriter value(long paramLong) throws IOException { put((JsonElement)new JsonPrimitive(Long.valueOf(paramLong)));
/* 42 */     return this; }
/*    */   public JsonWriter value(double paramDouble) throws IOException { try { if (!isLenient())
/*    */         try { if (!Double.isNaN(paramDouble)) { try { if (Double.isInfinite(paramDouble))
/*    */                 throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramDouble);  }
/*    */             catch (IOException iOException)
/*    */             { throw c(null); }
/*    */              }
/*    */           else
/*    */           { throw new IllegalArgumentException("JSON forbids NaN and infinities: " + paramDouble); }
/*    */            }
/*    */         catch (IOException iOException)
/*    */         { throw c(null); }
/*    */           }
/*    */     catch (IOException iOException)
/*    */     { throw c(null); }
/*    */      put((JsonElement)new JsonPrimitive(Double.valueOf(paramDouble))); return this; } public void flush() throws IOException {} public JsonWriter name(String paramString) throws IOException { 
/*    */     try { if (!this.stack.isEmpty())
/*    */         
/*    */         try { if (this.pendingName == null)
/* 61 */           { JsonElement jsonElement = peek();
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
/* 72 */             try { if (jsonElement instanceof JsonObject) { this.pendingName = paramString; return this; }  } catch (IOException iOException) { throw c(null); }  throw new IllegalStateException(); }  throw new IllegalStateException(); } catch (IOException iOException) { throw c(null); }
/*    */           }
/*    */     catch (IOException iOException) { throw c(null); }
/* 75 */      throw new IllegalStateException(); } public JsonWriter beginArray() throws IOException { JsonArray jsonArray = new JsonArray(); put((JsonElement)jsonArray); this.stack.add(jsonArray); return this; } private void put(JsonElement paramJsonElement) { try { if (this.pendingName != null) { try { if (!paramJsonElement.isJsonNull() || getSerializeNulls()) { JsonObject jsonObject = (JsonObject)peek(); jsonObject.add(this.pendingName, paramJsonElement); }  } catch (IllegalStateException illegalStateException) { throw c(null); }
/*    */          this.pendingName = null; }
/* 77 */       else { try { if (this.stack.isEmpty()) { this.product = paramJsonElement; } else { JsonElement jsonElement = peek(); try { if (jsonElement instanceof JsonArray) { ((JsonArray)jsonElement).add(paramJsonElement); } else { throw new IllegalStateException(); }  } catch (IllegalStateException illegalStateException) { throw c(null); }  }  } catch (IllegalStateException illegalStateException) { throw c(null); }
/*    */          }
/*    */        }
/*    */     catch (IllegalStateException illegalStateException)
/*    */     { throw c(null); }
/*    */      }
/*    */ 
/*    */   
/*    */   public JsonWriter value(String paramString) throws IOException {
/*    */     try {
/*    */       if (paramString == null)
/*    */         return nullValue(); 
/*    */     } catch (IOException iOException) {
/*    */       throw c(null);
/*    */     } 
/*    */     put((JsonElement)new JsonPrimitive(paramString));
/*    */     return this;
/*    */   }
/*    */   
/*    */   private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");
/*    */   
/*    */   public JsonTreeWriter() {
/*    */     super(UNWRITABLE_WRITER);
/*    */     this.product = (JsonElement)JsonNull.INSTANCE;
/*    */   }
/*    */   
/*    */   public JsonWriter nullValue() throws IOException {
/*    */     put((JsonElement)JsonNull.INSTANCE);
/*    */     return this;
/*    */   }
/*    */   
/*    */   public JsonElement get() {
/*    */     try {
/*    */       if (!this.stack.isEmpty())
/*    */         throw new IllegalStateException("Expected one JSON element but was " + this.stack); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return this.product;
/*    */   }
/*    */   
/*    */   public JsonWriter endObject() throws IOException {
/*    */     try {
/*    */       if (!this.stack.isEmpty())
/*    */         try {
/*    */           if (this.pendingName == null) {
/*    */             JsonElement jsonElement = peek();
/*    */             try {
/*    */               if (jsonElement instanceof JsonObject) {
/*    */                 this.stack.remove(this.stack.size() - 1);
/*    */                 return this;
/*    */               } 
/*    */             } catch (IOException iOException) {
/*    */               throw c(null);
/*    */             } 
/*    */             throw new IllegalStateException();
/*    */           } 
/*    */           throw new IllegalStateException();
/*    */         } catch (IOException iOException) {
/*    */           throw c(null);
/*    */         }  
/*    */     } catch (IOException iOException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public JsonWriter beginObject() throws IOException {
/*    */     JsonObject jsonObject = new JsonObject();
/*    */     put((JsonElement)jsonObject);
/*    */     this.stack.add(jsonObject);
/*    */     return this;
/*    */   }
/*    */   
/*    */   private static final Writer UNWRITABLE_WRITER = new JsonTreeWriter$1();
/*    */   
/*    */   public JsonWriter endArray() throws IOException {
/*    */     try {
/*    */       if (!this.stack.isEmpty())
/*    */         try {
/*    */           if (this.pendingName == null) {
/*    */             JsonElement jsonElement = peek();
/*    */             try {
/*    */               if (jsonElement instanceof JsonArray) {
/*    */                 this.stack.remove(this.stack.size() - 1);
/*    */                 return this;
/*    */               } 
/*    */             } catch (IOException iOException) {
/*    */               throw c(null);
/*    */             } 
/*    */             throw new IllegalStateException();
/*    */           } 
/*    */           throw new IllegalStateException();
/*    */         } catch (IOException iOException) {
/*    */           throw c(null);
/*    */         }  
/*    */     } catch (IOException iOException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public void close() throws IOException {
/*    */     try {
/*    */       if (!this.stack.isEmpty())
/*    */         throw new IOException("Incomplete document"); 
/*    */     } catch (IOException iOException) {
/*    */       throw c(null);
/*    */     } 
/*    */     this.stack.add(SENTINEL_CLOSED);
/*    */   }
/*    */   
/*    */   public JsonWriter value(Number paramNumber) throws IOException {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ifnonnull -> 13
/*    */     //   4: aload_0
/*    */     //   5: invokevirtual nullValue : ()Lcom/google/gson/stream/JsonWriter;
/*    */     //   8: areturn
/*    */     //   9: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*    */     //   12: athrow
/*    */     //   13: aload_0
/*    */     //   14: invokevirtual isLenient : ()Z
/*    */     //   17: ifne -> 77
/*    */     //   20: aload_1
/*    */     //   21: invokevirtual doubleValue : ()D
/*    */     //   24: dstore_2
/*    */     //   25: dload_2
/*    */     //   26: invokestatic isNaN : (D)Z
/*    */     //   29: ifne -> 46
/*    */     //   32: dload_2
/*    */     //   33: invokestatic isInfinite : (D)Z
/*    */     //   36: ifeq -> 77
/*    */     //   39: goto -> 46
/*    */     //   42: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*    */     //   45: athrow
/*    */     //   46: new java/lang/IllegalArgumentException
/*    */     //   49: dup
/*    */     //   50: new java/lang/StringBuilder
/*    */     //   53: dup
/*    */     //   54: invokespecial <init> : ()V
/*    */     //   57: ldc 'JSON forbids NaN and infinities: '
/*    */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   62: aload_1
/*    */     //   63: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   66: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   69: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   72: athrow
/*    */     //   73: invokestatic c : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*    */     //   76: athrow
/*    */     //   77: aload_0
/*    */     //   78: new com/google/gson/JsonPrimitive
/*    */     //   81: dup
/*    */     //   82: aload_1
/*    */     //   83: invokespecial <init> : (Ljava/lang/Number;)V
/*    */     //   86: invokespecial put : (Lcom/google/gson/JsonElement;)V
/*    */     //   89: aload_0
/*    */     //   90: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #78	-> 0
/*    */     //   #34	-> 4
/*    */     //   #74	-> 13
/*    */     //   #76	-> 20
/*    */     //   #71	-> 25
/*    */     //   #47	-> 46
/*    */     //   #16	-> 77
/*    */     //   #1	-> 89
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	9	9	java/io/IOException
/*    */     //   25	39	42	java/io/IOException
/*    */     //   32	73	73	java/io/IOException
/*    */   }
/*    */   
/*    */   private static Exception c(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\JsonTreeWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */