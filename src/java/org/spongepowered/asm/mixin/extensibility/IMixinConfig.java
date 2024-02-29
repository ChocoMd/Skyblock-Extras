package org.spongepowered.asm.mixin.extensibility;

import java.util.Set;
import org.spongepowered.asm.mixin.MixinEnvironment;

public interface IMixinConfig {
  public static final int DEFAULT_PRIORITY = 1000;
  
  MixinEnvironment getEnvironment();
  
  String getName();
  
  String getMixinPackage();
  
  int getPriority();
  
  IMixinConfigPlugin getPlugin();
  
  boolean isRequired();
  
  Set<String> getTargets();
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\extensibility\IMixinConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */