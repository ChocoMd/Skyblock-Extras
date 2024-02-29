/*   1 */ package com.google.gson.internal.bind;public final class JsonTreeReader extends JsonReader { private final List<Object> stack; private static final Object SENTINEL_CLOSED = new Object();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object popStack() {
/*  12 */     return this.stack.remove(this.stack.size() - 1);
/*     */   }
/*  14 */   public String nextName() throws IOException { expect(JsonToken.NAME);
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
/*  84 */     Iterator<Map.Entry> iterator = (Iterator)peekStack(); Map.Entry entry = iterator.next(); this.stack.add(entry.getValue()); return (String)entry.getKey(); } public JsonTreeReader(JsonElement paramJsonElement) { super(UNREADABLE_READER); this.stack = new ArrayList(); this.stack.add(paramJsonElement); }
/*     */   public String toString() { return getClass().getSimpleName(); }
/*     */   public String nextString() throws IOException { JsonToken jsonToken = peek(); try { if (jsonToken != JsonToken.STRING)
/*     */         try { if (jsonToken != JsonToken.NUMBER)
/*     */             throw new IllegalStateException("Expected " + JsonToken.STRING + " but was " + jsonToken);  }
/*     */         catch (IOException iOException) { throw b(null); }
/*     */           }
/*     */     catch (IOException iOException) { throw b(null); }
/*     */      return ((JsonPrimitive)popStack()).getAsString(); }
/*     */   public long nextLong() throws IOException { JsonToken jsonToken = peek(); try { if (jsonToken != JsonToken.NUMBER)
/*     */         try { if (jsonToken != JsonToken.STRING)
/*     */             throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken);  }
/*     */         catch (IOException iOException) { throw b(null); }
/*     */           }
/*     */     catch (IOException iOException)
/*     */     { throw b(null); }
/*     */      long l = ((JsonPrimitive)peekStack()).getAsLong(); popStack(); return l; }
/*     */   public boolean nextBoolean() throws IOException { expect(JsonToken.BOOLEAN); return ((JsonPrimitive)popStack()).getAsBoolean(); }
/*     */   private void expect(JsonToken paramJsonToken) throws IOException { 
/*     */     try { if (peek() != paramJsonToken)
/* 104 */         throw new IllegalStateException("Expected " + paramJsonToken + " but was " + peek());  } catch (IOException iOException) { throw b(null); }  }
/* 105 */   public JsonToken peek() throws IOException { try { if (this.stack.isEmpty()) return JsonToken.END_DOCUMENT;  } catch (IOException iOException) { throw b(null); }  Object object = peekStack(); if (object instanceof Iterator) { boolean bool = this.stack.get(this.stack.size() - 2) instanceof JsonObject; Iterator iterator = (Iterator)object; try { if (iterator.hasNext()) { try { if (bool) return JsonToken.NAME;  } catch (IOException iOException) { throw b(null); }  this.stack.add(iterator.next()); return peek(); }  } catch (IOException iOException) { throw b(null); }  try {  } catch (IOException iOException) { throw b(null); }  return bool ? JsonToken.END_OBJECT : JsonToken.END_ARRAY; }  try { if (object instanceof JsonObject) return JsonToken.BEGIN_OBJECT;  } catch (IOException iOException) { throw b(null); }  try { if (object instanceof JsonArray) return JsonToken.BEGIN_ARRAY;  } catch (IOException iOException) { throw b(null); }  if (object instanceof JsonPrimitive) { JsonPrimitive jsonPrimitive = (JsonPrimitive)object; try { if (jsonPrimitive.isString()) return JsonToken.STRING;  } catch (IOException iOException) { throw b(null); }  }  try { if (object instanceof com.google.gson.JsonNull) return JsonToken.NULL;  } catch (IOException iOException) { throw b(null); }  try { if (object == SENTINEL_CLOSED) throw new IllegalStateException("JsonReader is closed");  } catch (IOException iOException) { throw b(null); }  throw new AssertionError(); } public void skipValue() throws IOException { try { if (peek() == JsonToken.NAME) { nextName(); } else { popStack(); }  } catch (IOException iOException) { throw b(null); }  } public int nextInt() throws IOException { JsonToken jsonToken = peek(); try { if (jsonToken != JsonToken.NUMBER) try { if (jsonToken != JsonToken.STRING) throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken);  } catch (IOException iOException) { throw b(null); }   } catch (IOException iOException) { throw b(null); }  int i = ((JsonPrimitive)peekStack()).getAsInt(); popStack(); return i; }
/* 106 */   public boolean hasNext() throws IOException { JsonToken jsonToken = peek(); try { if (jsonToken != JsonToken.END_OBJECT) try { if (jsonToken != JsonToken.END_ARRAY); } catch (IOException iOException) { throw b(null); }   } catch (IOException iOException) { throw b(null); }  return false; } public void beginArray() throws IOException { expect(JsonToken.BEGIN_ARRAY); JsonArray jsonArray = (JsonArray)peekStack(); this.stack.add(jsonArray.iterator()); } public void endArray() throws IOException { expect(JsonToken.END_ARRAY); popStack(); popStack(); } public void close() throws IOException { this.stack.clear(); this.stack.add(SENTINEL_CLOSED); } public void endObject() throws IOException { expect(JsonToken.END_OBJECT); popStack(); popStack(); } private Object peekStack() { return this.stack.get(this.stack.size() - 1); } public void nextNull() throws IOException { expect(JsonToken.NULL); popStack(); } public void beginObject() throws IOException { expect(JsonToken.BEGIN_OBJECT); JsonObject jsonObject = (JsonObject)peekStack(); this.stack.add(jsonObject.entrySet().iterator()); } private static final Reader UNREADABLE_READER = new JsonTreeReader$1(); public double nextDouble() throws IOException { JsonToken jsonToken = peek(); try { if (jsonToken != JsonToken.NUMBER) try { if (jsonToken != JsonToken.STRING) throw new IllegalStateException("Expected " + JsonToken.NUMBER + " but was " + jsonToken);  } catch (IOException iOException) { throw b(null); }   } catch (IOException iOException) { throw b(null); }  double d = ((JsonPrimitive)peekStack()).getAsDouble(); try { if (!isLenient()) try { if (!Double.isNaN(d)) { try { if (Double.isInfinite(d)) throw new NumberFormatException("JSON forbids NaN and infinities: " + d);  } catch (IOException iOException) { throw b(null); }  } else { throw new NumberFormatException("JSON forbids NaN and infinities: " + d); }  } catch (IOException iOException) { throw b(null); }   } catch (IOException iOException) { throw b(null); }  popStack(); return d; }
/* 107 */   public void promoteNameToValue() throws IOException { expect(JsonToken.NAME);
/*     */     Iterator<Map.Entry> iterator = (Iterator)peekStack();
/*     */     Map.Entry entry = iterator.next();
/*     */     this.stack.add(entry.getValue());
/*     */     this.stack.add(new JsonPrimitive((String)entry.getKey())); }
/*     */ 
/*     */   
/*     */   private static IOException b(IOException paramIOException) {
/*     */     return paramIOException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\JsonTreeReader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */