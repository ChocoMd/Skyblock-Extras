/*   */ package org.spongepowered.asm.mixin.extensibility;public enum IMixinErrorHandler$ErrorAction {
/* 2 */   NONE(Level.INFO),
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */   
/* 8 */   WARN(Level.WARN),
/*   */   ERROR(Level.FATAL);
/*   */   private static final IMixinErrorHandler$ErrorAction[] $VALUES = new IMixinErrorHandler$ErrorAction[] { NONE, WARN, ERROR };
/*   */   public final Level logLevel;
/*   */   
/*   */   IMixinErrorHandler$ErrorAction(Level paramLevel) {
/*   */     this.logLevel = paramLevel;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\extensibility\IMixinErrorHandler$ErrorAction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */