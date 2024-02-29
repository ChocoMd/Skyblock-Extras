/*   */ package org.spongepowered.asm.mixin;
/* 2 */ public class EnvironmentStateTweaker implements ITweaker { public void injectIntoClassLoader(LaunchClassLoader paramLaunchClassLoader) { MixinBootstrap.getPlatform().inject(); } public String getLaunchTarget() {
/* 3 */     return "";
/*   */   } public String[] getLaunchArguments() {
/* 5 */     MixinEnvironment.gotoPhase(MixinEnvironment$Phase.DEFAULT);
/*   */     return new String[0];
/*   */   }
/*   */   
/*   */   public void acceptOptions(List<String> paramList, File paramFile1, File paramFile2, String paramString) {} }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\EnvironmentStateTweaker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */