/*   */ package com.google.gson.internal;final class UnsafeAllocator$2 extends UnsafeAllocator { public <T> T newInstance(Class<T> paramClass) throws Exception {
/* 2 */     return (T)newInstance.invoke(null, new Object[] { paramClass, Object.class });
/*   */   }
/*   */   
/*   */   final Method val$newInstance; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\UnsafeAllocator$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */