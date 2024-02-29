/*    */ package org.spongepowered.asm.lib.tree;public class VarInsnNode extends AbstractInsnNode { public int var;
/*    */   
/*  3 */   public VarInsnNode(int paramInt1, int paramInt2) { super(paramInt1);
/*    */ 
/*    */     
/*  6 */     this.var = paramInt2; }
/*  7 */   public int getType() { return 2; } public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new VarInsnNode(this.opcode, this.var)).cloneAnnotations(this); } public void setOpcode(int paramInt) {
/*    */     this.opcode = paramInt;
/*    */   } public void accept(MethodVisitor paramMethodVisitor) {
/* 10 */     paramMethodVisitor.visitVarInsn(this.opcode, this.var);
/*    */     acceptAnnotations(paramMethodVisitor);
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\VarInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */