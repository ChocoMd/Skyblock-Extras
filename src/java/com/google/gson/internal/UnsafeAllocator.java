/*    */ package com.google.gson.internal;
/*    */ import java.lang.reflect.Field;
/*    */ import java.lang.reflect.Method;
/*    */ 
/*    */ public abstract class UnsafeAllocator {
/*    */   public static UnsafeAllocator create() {
/*    */     try {
/*  8 */       Class<?> clazz = Class.forName("sun.misc.Unsafe"); Field field = clazz.getDeclaredField("theUnsafe"); field.setAccessible(true);
/*  9 */       Object object = field.get(null);
/*    */ 
/*    */       
/*    */       Method method = clazz.getMethod("allocateInstance", new Class[] { Class.class });
/*    */       
/* 14 */       return new UnsafeAllocator$1(method, object);
/*    */     } catch (Exception exception) {
/*    */       try {
/*    */         Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
/*    */         
/*    */         method.setAccessible(true);
/* 20 */         return new UnsafeAllocator$2(method);
/*    */       } catch (Exception exception1) {
/*    */         try {
/*    */           Method method1 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
/*    */           method1.setAccessible(true);
/*    */           int i = ((Integer)method1.invoke(null, new Object[] { Object.class })).intValue();
/*    */           Method method2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[] { Class.class, int.class });
/*    */           method2.setAccessible(true);
/*    */           return new UnsafeAllocator$3(method2, i);
/*    */         } catch (Exception exception2) {
/*    */           return new UnsafeAllocator$4();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public abstract <T> T newInstance(Class<T> paramClass) throws Exception;
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\UnsafeAllocator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */