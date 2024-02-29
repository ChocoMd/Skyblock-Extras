/*   */ package com.google.gson.internal;class ConstructorConstructor$3 implements ObjectConstructor<T> { public T construct() { try {
/* 2 */       Object[] arrayOfObject = null;
/*   */ 
/*   */       
/* 5 */       return constructor.newInstance(arrayOfObject);
/*   */ 
/*   */     
/*   */     }
/* 9 */     catch (InstantiationException instantiationException) {
/*   */       throw new RuntimeException("Failed to invoke " + constructor + " with no args", instantiationException);
/*   */     } catch (InvocationTargetException invocationTargetException) {
/*   */       throw new RuntimeException("Failed to invoke " + constructor + " with no args", invocationTargetException.getTargetException());
/*   */     } catch (IllegalAccessException illegalAccessException) {
/*   */       throw new AssertionError(illegalAccessException);
/*   */     }  }
/*   */ 
/*   */   
/*   */   final Constructor val$constructor;
/*   */   final ConstructorConstructor this$0; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\ConstructorConstructor$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */