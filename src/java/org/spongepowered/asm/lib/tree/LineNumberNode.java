/*   */ package org.spongepowered.asm.lib.tree;public class LineNumberNode extends AbstractInsnNode { public int line;
/*   */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/* 3 */     return new LineNumberNode(this.line, clone(this.start, paramMap));
/*   */   } public LabelNode start; public int getType() {
/* 5 */     return 15; }
/* 6 */   public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitLineNumber(this.line, this.start.getLabel()); } public LineNumberNode(int paramInt, LabelNode paramLabelNode) {
/* 7 */     super(-1);
/* 8 */     this.line = paramInt;
/*   */     this.start = paramLabelNode;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LineNumberNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */