/*    */ package org.spongepowered.asm.mixin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum Interface$Remap
/*    */ {
/* 11 */   ALL, FORCE(true), ONLY_PREFIXED,
/* 12 */   NONE;
/* 13 */   private static final Interface$Remap[] $VALUES = new Interface$Remap[] { ALL, FORCE, ONLY_PREFIXED, NONE };
/*    */   
/*    */   public boolean forceRemap() {
/*    */     return this.forceRemap;
/*    */   }
/*    */   
/*    */   Interface$Remap(boolean paramBoolean) {
/*    */     this.forceRemap = paramBoolean;
/*    */   }
/*    */   
/*    */   private final boolean forceRemap;
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\Interface$Remap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */