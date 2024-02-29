package com.google.gson;

import java.lang.reflect.Type;

public interface JsonDeserializer<T> {
  T deserialize(JsonElement paramJsonElement, Type paramType, JsonDeserializationContext paramJsonDeserializationContext) throws JsonParseException;
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\JsonDeserializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */