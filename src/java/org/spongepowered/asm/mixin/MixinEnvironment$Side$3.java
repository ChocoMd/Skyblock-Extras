/*   */ package org.spongepowered.asm.mixin;enum MixinEnvironment$Side$3 {
/*   */   protected boolean detect() {
/* 3 */     String str = MixinService.getService().getSideName();
/*   */     try {
/*   */       if (!"SERVER".equals(str)) {
/*   */         try {
/*   */           if ("DEDICATEDSERVER".equals(str));
/*   */         } catch (RuntimeException runtimeException) {
/*   */           throw b(null);
/*   */         } 
/*   */         return false;
/*   */       } 
/*   */     } catch (RuntimeException runtimeException) {
/*   */       throw b(null);
/*   */     } 
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$Side$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */