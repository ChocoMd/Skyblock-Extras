package com.google.gson;

import com.google.gson.reflect.TypeToken;

public interface TypeAdapterFactory {
  <T> TypeAdapter<T> create(Gson paramGson, TypeToken<T> paramTypeToken);
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\TypeAdapterFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */