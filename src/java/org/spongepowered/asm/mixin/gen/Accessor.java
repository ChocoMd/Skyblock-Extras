package org.spongepowered.asm.mixin.gen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Accessor {
  String value() default "";
  
  boolean remap() default true;
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\Accessor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */