/*   */ package org.spongepowered.asm.lib.tree;public class LdcInsnNode extends AbstractInsnNode { public int getType() {
/* 2 */     return 9;
/*   */   } public Object cst; public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/* 4 */     return (new LdcInsnNode(this.cst)).cloneAnnotations(this);
/*   */   }
/*   */   
/* 7 */   public LdcInsnNode(Object paramObject) { super(18);
/* 8 */     this.cst = paramObject; } public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitLdcInsn(this.cst);
/*   */     acceptAnnotations(paramMethodVisitor); }
/*   */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LdcInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */