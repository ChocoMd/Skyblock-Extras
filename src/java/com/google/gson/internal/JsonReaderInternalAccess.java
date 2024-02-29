package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

public abstract class JsonReaderInternalAccess {
  public static JsonReaderInternalAccess INSTANCE;
  
  public abstract void promoteNameToValue(JsonReader paramJsonReader) throws IOException;
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\JsonReaderInternalAccess.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */