/* 1 */ package org.spongepowered.asm.lib.tree;public class MultiANewArrayInsnNode extends AbstractInsnNode { public String desc; public int getType() { return 13; }
/*   */    public int dims;
/*   */   public MultiANewArrayInsnNode(String paramString, int paramInt) {
/* 4 */     super(197);
/*   */ 
/*   */ 
/*   */ 
/*   */     
/* 9 */     this.desc = paramString;
/*   */     this.dims = paramInt;
/*   */   }
/*   */   
/*   */   public void accept(MethodVisitor paramMethodVisitor) {
/*   */     paramMethodVisitor.visitMultiANewArrayInsn(this.desc, this.dims);
/*   */     acceptAnnotations(paramMethodVisitor);
/*   */   }
/*   */   
/*   */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*   */     return (new MultiANewArrayInsnNode(this.desc, this.dims)).cloneAnnotations(this);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\MultiANewArrayInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */