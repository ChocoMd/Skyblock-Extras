/*  1 */ package org.spongepowered.asm.lib.tree;public class IntInsnNode extends AbstractInsnNode { public void setOpcode(int paramInt) { this.opcode = paramInt; }
/*    */   
/*    */   public int operand;
/*    */   
/*    */   public int getType() {
/*  6 */     return 1; }
/*  7 */   public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitIntInsn(this.opcode, this.operand);
/*  8 */     acceptAnnotations(paramMethodVisitor); } public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new IntInsnNode(this.opcode, this.operand)).cloneAnnotations(this); }
/*    */    public IntInsnNode(int paramInt1, int paramInt2) {
/* 10 */     super(paramInt1);
/*    */     this.operand = paramInt2;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\IntInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */