package org.spongepowered.asm.mixin.extensibility;

public interface IMixinErrorHandler {
  IMixinErrorHandler$ErrorAction onPrepareError(IMixinConfig paramIMixinConfig, Throwable paramThrowable, IMixinInfo paramIMixinInfo, IMixinErrorHandler$ErrorAction paramIMixinErrorHandler$ErrorAction);
  
  IMixinErrorHandler$ErrorAction onApplyError(String paramString, Throwable paramThrowable, IMixinInfo paramIMixinInfo, IMixinErrorHandler$ErrorAction paramIMixinErrorHandler$ErrorAction);
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\extensibility\IMixinErrorHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */