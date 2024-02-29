/*    */ package org.spongepowered.asm.lib.tree;
/*    */ public class TableSwitchInsnNode extends AbstractInsnNode { public int min;
/*    */   public int max;
/*    */   
/*  5 */   public TableSwitchInsnNode(int paramInt1, int paramInt2, LabelNode paramLabelNode, LabelNode... paramVarArgs) { super(170);
/*    */ 
/*    */ 
/*    */     
/*    */     this.min = paramInt1;
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.max = paramInt2; this.dflt = paramLabelNode;
/*    */     this.labels = new ArrayList<LabelNode>();
/*    */     if (paramVarArgs != null)
/* 16 */       this.labels.addAll(Arrays.asList(paramVarArgs));  }
/*    */   public LabelNode dflt;
/* 18 */   public List<LabelNode> labels; public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new TableSwitchInsnNode(this.min, this.max, clone(this.dflt, paramMap), clone(this.labels, paramMap))).cloneAnnotations(this); } public int getType() { return 11; } public void accept(MethodVisitor paramMethodVisitor) { Label[] arrayOfLabel = new Label[this.labels.size()];
/*    */     byte b = 0;
/*    */     try {
/*    */       while (b < arrayOfLabel.length) {
/*    */         arrayOfLabel[b] = ((LabelNode)this.labels.get(b)).getLabel();
/*    */         b++;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */     paramMethodVisitor.visitTableSwitchInsn(this.min, this.max, this.dflt.getLabel(), arrayOfLabel);
/*    */     acceptAnnotations(paramMethodVisitor); }
/*    */ 
/*    */   
/*    */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\TableSwitchInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */