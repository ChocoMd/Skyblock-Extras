/*    */ package org.spongepowered.asm.lib.tree;public class LabelNode extends AbstractInsnNode { private Label label;
/*    */   
/*  3 */   public LabelNode() { super(-1); } public Label getLabel() { 
/*  4 */     try { if (this.label == null)
/*    */       {
/*    */ 
/*    */ 
/*    */         
/*  9 */         this.label = new Label(); }  } catch (RuntimeException runtimeException) { throw c(null); }  return this.label; }
/* 10 */   public void resetLabel() { this.label = null; } public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return paramMap.get(this); }
/* 11 */   public int getType() { return 8; } public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitLabel(getLabel()); } public LabelNode(Label paramLabel) { super(-1);
/*    */     this.label = paramLabel; }
/*    */ 
/*    */   
/*    */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LabelNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */