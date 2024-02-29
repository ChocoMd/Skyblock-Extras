/*   */ package org.spongepowered.asm.lib.tree;
/* 2 */ public class IincInsnNode extends AbstractInsnNode { public int var; public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitIincInsn(this.var, this.incr);
/*   */ 
/*   */     
/* 5 */     acceptAnnotations(paramMethodVisitor); }
/*   */   public int incr; public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new IincInsnNode(this.var, this.incr)).cloneAnnotations(this); } public int getType() {
/*   */     return 10;
/*   */   } public IincInsnNode(int paramInt1, int paramInt2) {
/* 9 */     super(132);
/*   */     this.var = paramInt1;
/*   */     this.incr = paramInt2;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\IincInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */