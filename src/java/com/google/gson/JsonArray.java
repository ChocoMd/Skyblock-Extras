/*    */ package com.google.gson;public final class JsonArray extends JsonElement implements Iterable<JsonElement> { public short getAsShort() { 
/*  2 */     try { if (this.elements.size() == 1)
/*    */       {
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
/* 56 */         return ((JsonElement)this.elements.get(0)).getAsShort(); }  } catch (IllegalStateException illegalStateException) { throw c(null); }
/*    */     
/*    */     throw new IllegalStateException(); }
/*    */ 
/*    */   
/*    */   public void addAll(JsonArray paramJsonArray) {
/*    */     this.elements.addAll(paramJsonArray.elements);
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     try {
/*    */       if (paramObject != this) {
/*    */         try {
/*    */           if (paramObject instanceof JsonArray)
/*    */             try {
/*    */               if (((JsonArray)paramObject).elements.equals(this.elements));
/*    */             } catch (IllegalStateException illegalStateException) {
/*    */               throw c(null);
/*    */             }  
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw c(null);
/*    */         } 
/*    */         return false;
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean getAsBoolean() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsBoolean(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   JsonArray deepCopy() {
/*    */     JsonArray jsonArray = new JsonArray();
/*    */     for (JsonElement jsonElement : this.elements)
/*    */       jsonArray.add(jsonElement.deepCopy()); 
/*    */     return jsonArray;
/*    */   }
/*    */   
/*    */   public JsonElement get(int paramInt) {
/*    */     return this.elements.get(paramInt);
/*    */   }
/*    */   
/*    */   public BigDecimal getAsBigDecimal() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsBigDecimal(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public double getAsDouble() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsDouble(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public String getAsString() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsString(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public byte getAsByte() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsByte(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public void add(JsonElement paramJsonElement) {
/*    */     if (paramJsonElement == null)
/*    */       paramJsonElement = JsonNull.INSTANCE; 
/*    */     this.elements.add(paramJsonElement);
/*    */   }
/*    */   
/*    */   public Iterator<JsonElement> iterator() {
/*    */     return this.elements.iterator();
/*    */   }
/*    */   
/*    */   public int getAsInt() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsInt(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public BigInteger getAsBigInteger() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsBigInteger(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   private final List<JsonElement> elements = new ArrayList<JsonElement>();
/*    */   
/*    */   public int size() {
/*    */     return this.elements.size();
/*    */   }
/*    */   
/*    */   public Number getAsNumber() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsNumber(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public long getAsLong() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsLong(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.elements.hashCode();
/*    */   }
/*    */   
/*    */   public float getAsFloat() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsFloat(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   public char getAsCharacter() {
/*    */     try {
/*    */       if (this.elements.size() == 1)
/*    */         return ((JsonElement)this.elements.get(0)).getAsCharacter(); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw c(null);
/*    */     } 
/*    */     throw new IllegalStateException();
/*    */   }
/*    */   
/*    */   private static IllegalStateException c(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonArray.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */