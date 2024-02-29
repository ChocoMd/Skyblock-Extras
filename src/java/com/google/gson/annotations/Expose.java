package com.google.gson.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Expose {
  boolean serialize() default true;
  
  boolean deserialize() default true;
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\annotations\Expose.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */