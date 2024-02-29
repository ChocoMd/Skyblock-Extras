/*    */ package com.google.gson.internal;
/*  2 */ public final class Primitives { private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER_TYPE; public static <T> Class<T> unwrap(Class<T> paramClass) { Class<T> clazz = (Class)WRAPPER_TO_PRIMITIVE_TYPE.get($Gson$Preconditions.checkNotNull(paramClass));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/* 10 */     { throw b(null); }  return (clazz == null) ? paramClass : clazz; }
/*    */   private static final Map<Class<?>, Class<?>> WRAPPER_TO_PRIMITIVE_TYPE; public static boolean isWrapperType(Type paramType) { return WRAPPER_TO_PRIMITIVE_TYPE.containsKey($Gson$Preconditions.checkNotNull(paramType)); } static {
/* 12 */     HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(16);
/*    */     
/*    */     HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>(16);
/*    */     add((Map)hashMap1, (Map)hashMap2, boolean.class, Boolean.class);
/* 16 */     add((Map)hashMap1, (Map)hashMap2, byte.class, Byte.class);
/*    */     add((Map)hashMap1, (Map)hashMap2, char.class, Character.class);
/* 18 */     add((Map)hashMap1, (Map)hashMap2, double.class, Double.class);
/*    */     
/*    */     add((Map)hashMap1, (Map)hashMap2, float.class, Float.class);
/*    */     
/*    */     add((Map)hashMap1, (Map)hashMap2, int.class, Integer.class);
/* 23 */     add((Map)hashMap1, (Map)hashMap2, long.class, Long.class); add((Map)hashMap1, (Map)hashMap2, short.class, Short.class); add((Map)hashMap1, (Map)hashMap2, void.class, Void.class);
/* 24 */     PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(hashMap1);
/*    */     WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(hashMap2);
/*    */   }
/*    */   
/*    */   public static <T> Class<T> wrap(Class<T> paramClass) {
/*    */     Class<T> clazz = (Class)PRIMITIVE_TO_WRAPPER_TYPE.get($Gson$Preconditions.checkNotNull(paramClass));
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (clazz == null) ? paramClass : clazz;
/*    */   }
/*    */   
/*    */   public static boolean isPrimitive(Type paramType) {
/*    */     return PRIMITIVE_TO_WRAPPER_TYPE.containsKey(paramType);
/*    */   }
/*    */   
/*    */   private static void add(Map<Class<?>, Class<?>> paramMap1, Map<Class<?>, Class<?>> paramMap2, Class<?> paramClass1, Class<?> paramClass2) {
/*    */     paramMap1.put(paramClass1, paramClass2);
/*    */     paramMap2.put(paramClass2, paramClass1);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Primitives.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */