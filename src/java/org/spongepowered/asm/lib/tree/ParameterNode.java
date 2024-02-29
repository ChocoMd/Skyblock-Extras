/*   */ package org.spongepowered.asm.lib.tree;
/*   */ import org.spongepowered.asm.lib.MethodVisitor;
/*   */ 
/*   */ public class ParameterNode {
/*   */   public ParameterNode(String paramString, int paramInt) {
/* 6 */     this.name = paramString;
/*   */     this.access = paramInt;
/*   */   }
/*   */   
/*   */   public String name;
/*   */   public int access;
/*   */   
/*   */   public void accept(MethodVisitor paramMethodVisitor) {
/*   */     paramMethodVisitor.visitParameter(this.name, this.access);
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\ParameterNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */