/* 1 */ package org.spongepowered.asm.lib.tree;public class InsnNode extends AbstractInsnNode { public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new InsnNode(this.opcode)).cloneAnnotations(this); } public InsnNode(int paramInt) {
/* 2 */     super(paramInt);
/*   */   }
/*   */   
/*   */   public int getType() {
/* 6 */     return 0; } public void accept(MethodVisitor paramMethodVisitor) {
/* 7 */     paramMethodVisitor.visitInsn(this.opcode);
/*   */     acceptAnnotations(paramMethodVisitor);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\InsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */