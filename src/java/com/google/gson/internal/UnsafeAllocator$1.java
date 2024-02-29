/*   */ package com.google.gson.internal;final class UnsafeAllocator$1 extends UnsafeAllocator { public <T> T newInstance(Class<T> paramClass) throws Exception {
/* 2 */     return (T)allocateInstance.invoke(unsafe, new Object[] { paramClass });
/*   */   }
/*   */   
/*   */   final Method val$allocateInstance;
/*   */   final Object val$unsafe; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\UnsafeAllocator$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */