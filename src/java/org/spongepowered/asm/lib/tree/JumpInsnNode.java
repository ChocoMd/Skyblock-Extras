/*  1 */ package org.spongepowered.asm.lib.tree;public class JumpInsnNode extends AbstractInsnNode { public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (
/*  2 */       new JumpInsnNode(this.opcode, clone(this.label, paramMap)))
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*  7 */       .cloneAnnotations(this); }
/*  8 */   public LabelNode label; public JumpInsnNode(int paramInt, LabelNode paramLabelNode) { super(paramInt); this.label = paramLabelNode; } public int getType() { return 7; }
/*    */   
/* 10 */   public void setOpcode(int paramInt) { this.opcode = paramInt; } public void accept(MethodVisitor paramMethodVisitor) {
/* 11 */     paramMethodVisitor.visitJumpInsn(this.opcode, this.label.getLabel());
/*    */     acceptAnnotations(paramMethodVisitor);
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\JumpInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */