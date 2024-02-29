/*  1 */ package org.spongepowered.asm.lib.tree;public class LocalVariableAnnotationNode extends TypeAnnotationNode { public LocalVariableAnnotationNode(int paramInt, TypePath paramTypePath, LabelNode[] paramArrayOfLabelNode1, LabelNode[] paramArrayOfLabelNode2, int[] paramArrayOfint, String paramString) { this(327680, paramInt, paramTypePath, paramArrayOfLabelNode1, paramArrayOfLabelNode2, paramArrayOfint, paramString); }
/*    */   
/*    */   public List<LabelNode> start; public List<LabelNode> end;
/*    */   public List<Integer> index;
/*    */   
/*    */   public LocalVariableAnnotationNode(int paramInt1, int paramInt2, TypePath paramTypePath, LabelNode[] paramArrayOfLabelNode1, LabelNode[] paramArrayOfLabelNode2, int[] paramArrayOfint, String paramString) {
/*  7 */     super(paramInt1, paramInt2, paramTypePath, paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.start = new ArrayList<LabelNode>(paramArrayOfLabelNode1.length);
/*    */     
/*    */     this.start.addAll(Arrays.asList(paramArrayOfLabelNode1));
/*    */     
/* 17 */     this.end = new ArrayList<LabelNode>(paramArrayOfLabelNode2.length);
/*    */     
/*    */     this.end.addAll(Arrays.asList(paramArrayOfLabelNode2));
/*    */     
/* 21 */     this.index = new ArrayList<Integer>(paramArrayOfint.length); int arrayOfInt[], i; byte b; for (arrayOfInt = paramArrayOfint, i = arrayOfInt.length, b = 0; b < i; ) { int j = arrayOfInt[b]; this.index.add(Integer.valueOf(j)); b++; }
/* 22 */      } public void accept(MethodVisitor paramMethodVisitor, boolean paramBoolean) { Label[] arrayOfLabel1 = new Label[this.start.size()]; Label[] arrayOfLabel2 = new Label[this.end.size()]; int[] arrayOfInt = new int[this.index.size()];
/*    */     byte b = 0;
/*    */     try {
/*    */       while (b < arrayOfLabel1.length) {
/*    */         arrayOfLabel1[b] = ((LabelNode)this.start.get(b)).getLabel();
/*    */         arrayOfLabel2[b] = ((LabelNode)this.end.get(b)).getLabel();
/*    */         arrayOfInt[b] = ((Integer)this.index.get(b)).intValue();
/*    */         b++;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     accept(paramMethodVisitor.visitLocalVariableAnnotation(this.typeRef, this.typePath, arrayOfLabel1, arrayOfLabel2, arrayOfInt, this.desc, true)); }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LocalVariableAnnotationNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */