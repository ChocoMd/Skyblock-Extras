/*   */ package org.spongepowered.asm.mixin;enum MixinEnvironment$CompatibilityLevel$1 { boolean isSupported() { try {  }
/* 2 */     catch (RuntimeException runtimeException) { throw c(null); }  return (JavaVersion.current() >= 1.7D); }
/*   */ 
/*   */   
/*   */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$CompatibilityLevel$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */