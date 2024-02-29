/*   */ package com.google.gson.internal;
/*   */ class ConstructorConstructor$12 implements ObjectConstructor<T> { public T construct() { 
/* 3 */     try { return 
/*   */         
/* 5 */         (T)this.unsafeAllocator.newInstance(rawType); } catch (Exception exception) { throw new RuntimeException("Unable to invoke no-args constructor for " + type + ". " + "Register an InstanceCreator with Gson for this type may fix this problem.", exception); }
/* 6 */      } private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();
/*   */   final Class val$rawType;
/*   */   final Type val$type;
/*   */   final ConstructorConstructor this$0; }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\ConstructorConstructor$12.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */