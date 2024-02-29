/*    */ package org.spongepowered.asm.lib.tree;public class LookupSwitchInsnNode extends AbstractInsnNode { public LabelNode dflt;
/*    */   public List<Integer> keys;
/*    */   public List<LabelNode> labels;
/*    */   
/*  5 */   public void accept(MethodVisitor paramMethodVisitor) { int[] arrayOfInt = new int[this.keys.size()];
/*    */     
/*  7 */     byte b1 = 0; try { while (b1 < arrayOfInt.length)
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 24 */         arrayOfInt[b1] = ((Integer)this.keys.get(b1)).intValue();
/*    */         
/* 26 */         b1++; }  } catch (RuntimeException runtimeException) { throw c(null); }  Label[] arrayOfLabel = new Label[this.labels.size()]; byte b2 = 0; try { for (; b2 < arrayOfLabel.length; b2++)
/* 27 */         arrayOfLabel[b2] = ((LabelNode)this.labels.get(b2)).getLabel();  } catch (RuntimeException runtimeException) { throw c(null); }  paramMethodVisitor.visitLookupSwitchInsn(this.dflt.getLabel(), arrayOfInt, arrayOfLabel); acceptAnnotations(paramMethodVisitor); } public int getType() { return 12; }
/*    */ 
/*    */   
/*    */   public LookupSwitchInsnNode(LabelNode paramLabelNode, int[] paramArrayOfint, LabelNode[] paramArrayOfLabelNode) {
/*    */     super(171);
/*    */     this.dflt = paramLabelNode;
/*    */     this.keys = new ArrayList<Integer>((paramArrayOfint == null) ? 0 : paramArrayOfint.length);
/*    */     this.labels = new ArrayList<LabelNode>((paramArrayOfLabelNode == null) ? 0 : paramArrayOfLabelNode.length);
/*    */     if (paramArrayOfint != null) {
/*    */       byte b = 0;
/*    */       try {
/*    */         while (b < paramArrayOfint.length) {
/*    */           this.keys.add(Integer.valueOf(paramArrayOfint[b]));
/*    */           b++;
/*    */         } 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw c(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (paramArrayOfLabelNode != null)
/*    */         this.labels.addAll(Arrays.asList(paramArrayOfLabelNode)); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*    */     LookupSwitchInsnNode lookupSwitchInsnNode = new LookupSwitchInsnNode(clone(this.dflt, paramMap), null, clone(this.labels, paramMap));
/*    */     lookupSwitchInsnNode.keys.addAll(this.keys);
/*    */     return lookupSwitchInsnNode.cloneAnnotations(this);
/*    */   }
/*    */   
/*    */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LookupSwitchInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */