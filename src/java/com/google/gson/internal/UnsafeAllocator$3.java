/* 1 */ package com.google.gson.internal;final class UnsafeAllocator$3 extends UnsafeAllocator { public <T> T newInstance(Class<T> paramClass) throws Exception { return (T)newInstance.invoke(null, new Object[] { paramClass, Integer.valueOf(this.val$constructorId) }); }
/*   */ 
/*   */   
/*   */   final Method val$newInstance;
/*   */   final int val$constructorId; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\UnsafeAllocator$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */