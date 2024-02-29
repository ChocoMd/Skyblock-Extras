/*   */ package org.spongepowered.asm.launch;public class MixinTweaker implements ITweaker { public final void injectIntoClassLoader(LaunchClassLoader paramLaunchClassLoader) {
/* 2 */     MixinBootstrap.inject();
/*   */   }
/* 4 */   public MixinTweaker() { MixinBootstrap.start(); }
/* 5 */   public final void acceptOptions(List<String> paramList, File paramFile1, File paramFile2, String paramString) { MixinBootstrap.doInit(paramList); } public String getLaunchTarget() {
/* 6 */     return MixinBootstrap.getPlatform().getLaunchTarget();
/*   */   } public String[] getLaunchArguments() {
/* 8 */     return new String[0];
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\MixinTweaker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */