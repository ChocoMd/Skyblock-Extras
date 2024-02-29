/*   */ package org.spongepowered.asm.lib;
/*   */ class CurrentFrame extends Frame {
/*   */   void execute(int paramInt1, int paramInt2, ClassWriter paramClassWriter, Item paramItem) {
/* 4 */     super.execute(paramInt1, paramInt2, paramClassWriter, paramItem);
/*   */ 
/*   */     
/* 7 */     Frame frame = new Frame();
/*   */     merge(paramClassWriter, frame, 0);
/*   */     set(frame);
/*   */     this.owner.inputStackTop = 0;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\CurrentFrame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */