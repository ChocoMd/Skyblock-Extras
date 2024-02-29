/*   */ package org.spongepowered.asm.mixin;
/*   */ 
/*   */ public enum MixinEnvironment$Side {
/* 4 */   UNKNOWN,
/*   */   
/* 6 */   CLIENT, SERVER;
/*   */   private static final MixinEnvironment$Side[] $VALUES = new MixinEnvironment$Side[] { UNKNOWN, CLIENT, SERVER };
/*   */   
/*   */   protected abstract boolean detect();
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$Side.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */