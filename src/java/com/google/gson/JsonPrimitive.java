/*    */ package com.google.gson;
/*    */ public final class JsonPrimitive extends JsonElement {
/*    */   public char getAsCharacter() {
/*  4 */     return getAsString().charAt(0);
/*    */   }
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
/*    */   public JsonPrimitive(String paramString) {
/* 34 */     setValue(paramString);
/*    */   } public Number getAsNumber() { try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.value instanceof String) ? (Number)new LazilyParsedNumber((String)this.value) : (Number)this.value; } Boolean getAsBooleanWrapper() { return (Boolean)this.value; } public double getAsDouble() { try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString()); }
/*    */   public short getAsShort() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
/*    */   }
/*    */   public boolean isBoolean() {
/*    */     return this.value instanceof Boolean;
/*    */   }
/* 57 */   public JsonPrimitive(Character paramCharacter) { setValue(paramCharacter); }
/*    */   public BigInteger getAsBigInteger() { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (this.value instanceof BigInteger) ? (BigInteger)this.value : new BigInteger(this.value.toString()); }
/*    */   public boolean isString() { return this.value instanceof String; }
/*    */   public int hashCode() { try { if (this.value == null)
/*    */         return 31;  } catch (RuntimeException runtimeException) { throw b(null); }  if (isIntegral(this)) { long l = getAsNumber().longValue(); return (int)(l ^ l >>> 32L); }  if (this.value instanceof Number) { long l = Double.doubleToLongBits(getAsNumber().doubleValue()); return (int)(l ^ l >>> 32L); }  return this.value.hashCode(); }
/*    */   JsonPrimitive deepCopy() { return this; }
/*    */   private static boolean isIntegral(JsonPrimitive paramJsonPrimitive) { if (paramJsonPrimitive.value instanceof Number) { Number number = (Number)paramJsonPrimitive.value; try { if (!(number instanceof BigInteger))
/*    */           try { if (!(number instanceof Long))
/*    */               try { if (!(number instanceof Integer))
/*    */                   try { if (!(number instanceof Short)) { try { if (number instanceof Byte); } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }   }
/*    */               catch (RuntimeException runtimeException) { throw b(null); }
/*    */                 }
/*    */           catch (RuntimeException runtimeException) { throw b(null); }
/*    */             }
/*    */       catch (RuntimeException runtimeException) { throw b(null); }
/*    */        }
/* 73 */      return false; } public JsonPrimitive(Boolean paramBoolean) { setValue(paramBoolean); }
/*    */   public float getAsFloat() { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString()); } public boolean equals(Object paramObject) { try { if (this == paramObject)
/*    */         return true;  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (paramObject != null)
/*    */         try { if (getClass() == paramObject.getClass()) { JsonPrimitive jsonPrimitive = (JsonPrimitive)paramObject; try { if (this.value == null) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (jsonPrimitive.value == null); }  }
/*    */             catch (RuntimeException runtimeException) { throw b(null); }
/* 78 */              try { if (isIntegral(this)) try { if (isIntegral(jsonPrimitive)) { 
/*    */                     try {  }
/*    */                     catch (RuntimeException runtimeException)
/* 81 */                     { throw b(null); }  return (getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue()); }  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  try { if (this.value instanceof Number && jsonPrimitive.value instanceof Number) { double d1 = getAsNumber().doubleValue(); double d2 = jsonPrimitive.getAsNumber().doubleValue(); try { if (d1 != d2) { try { if (Double.isNaN(d1)) try { if (Double.isNaN(d2)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }  }  } catch (RuntimeException runtimeException) { throw b(null); }  return this.value.equals(jsonPrimitive.value); }  return false; } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; } public String getAsString() { try { if (isNumber()) return getAsNumber().toString();  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (isBoolean()) return getAsBooleanWrapper().toString();  } catch (RuntimeException runtimeException) { throw b(null); }  return (String)this.value; }
/* 82 */   public boolean isNumber() { return this.value instanceof Number; }
/*    */ 
/*    */   
/*    */   public int getAsInt() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
/*    */   }
/*    */   
/*    */   public JsonPrimitive(Number paramNumber) {
/*    */     setValue(paramNumber);
/*    */   }
/*    */   
/*    */   public long getAsLong() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
/*    */   }
/*    */   
/*    */   private static boolean isPrimitiveOrString(Object paramObject) {
/*    */     try {
/*    */       if (paramObject instanceof String)
/*    */         return true; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Class<?> clazz = paramObject.getClass();
/*    */     Class<?>[] arrayOfClass;
/*    */     int i;
/*    */     byte b;
/*    */     for (arrayOfClass = PRIMITIVE_TYPES, i = arrayOfClass.length, b = 0; b < i; ) {
/*    */       Class<?> clazz1 = arrayOfClass[b];
/*    */       try {
/*    */         if (clazz1.isAssignableFrom(clazz))
/*    */           return true; 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public byte getAsByte() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
/*    */   }
/*    */   
/*    */   JsonPrimitive(Object paramObject) {
/*    */     setValue(paramObject);
/*    */   }
/*    */   
/*    */   public boolean getAsBoolean() {
/*    */     try {
/*    */       if (isBoolean())
/*    */         return getAsBooleanWrapper().booleanValue(); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return Boolean.parseBoolean(getAsString());
/*    */   }
/*    */   
/*    */   void setValue(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof java/lang/Character
/*    */     //   4: ifeq -> 26
/*    */     //   7: aload_1
/*    */     //   8: checkcast java/lang/Character
/*    */     //   11: invokevirtual charValue : ()C
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: iload_2
/*    */     //   17: invokestatic valueOf : (C)Ljava/lang/String;
/*    */     //   20: putfield value : Ljava/lang/Object;
/*    */     //   23: goto -> 64
/*    */     //   26: aload_1
/*    */     //   27: instanceof java/lang/Number
/*    */     //   30: ifne -> 47
/*    */     //   33: aload_1
/*    */     //   34: invokestatic isPrimitiveOrString : (Ljava/lang/Object;)Z
/*    */     //   37: ifeq -> 55
/*    */     //   40: goto -> 47
/*    */     //   43: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   46: athrow
/*    */     //   47: iconst_1
/*    */     //   48: goto -> 56
/*    */     //   51: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   54: athrow
/*    */     //   55: iconst_0
/*    */     //   56: invokestatic checkArgument : (Z)V
/*    */     //   59: aload_0
/*    */     //   60: aload_1
/*    */     //   61: putfield value : Ljava/lang/Object;
/*    */     //   64: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #72	-> 0
/*    */     //   #25	-> 7
/*    */     //   #53	-> 15
/*    */     //   #76	-> 23
/*    */     //   #75	-> 26
/*    */     //   #48	-> 59
/*    */     //   #28	-> 64
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   26	40	43	java/lang/RuntimeException
/*    */     //   33	51	51	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   private static final Class<?>[] PRIMITIVE_TYPES = new Class[] { 
/*    */       int.class, long.class, short.class, float.class, double.class, byte.class, boolean.class, char.class, Integer.class, Long.class, 
/*    */       Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
/*    */   private Object value;
/*    */   
/*    */   public BigDecimal getAsBigDecimal() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.value instanceof BigDecimal) ? (BigDecimal)this.value : new BigDecimal(this.value.toString());
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonPrimitive.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */