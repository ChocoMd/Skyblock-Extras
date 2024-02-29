package com.google.gson;

public interface ExclusionStrategy {
  boolean shouldSkipField(FieldAttributes paramFieldAttributes);
  
  boolean shouldSkipClass(Class<?> paramClass);
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\ExclusionStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */