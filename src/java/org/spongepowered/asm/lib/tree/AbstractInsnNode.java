/*    */ package org.spongepowered.asm.lib.tree;
/*    */ public abstract class AbstractInsnNode { public static final int INSN = 0; public static final int INT_INSN = 1;
/*    */   public static final int VAR_INSN = 2;
/*    */   public static final int TYPE_INSN = 3;
/*    */   public static final int FIELD_INSN = 4;
/*    */   public static final int METHOD_INSN = 5;
/*    */   public static final int INVOKE_DYNAMIC_INSN = 6;
/*    */   public static final int JUMP_INSN = 7;
/*    */   public static final int LABEL = 8;
/*    */   public static final int LDC_INSN = 9;
/*    */   public static final int IINC_INSN = 10;
/*    */   
/* 13 */   static LabelNode[] clone(List<LabelNode> paramList, Map<LabelNode, LabelNode> paramMap) { LabelNode[] arrayOfLabelNode = new LabelNode[paramList.size()];
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
/* 25 */     byte b = 0; try { for (; b < arrayOfLabelNode.length; b++) {
/*    */         arrayOfLabelNode[b] = paramMap.get(paramList.get(b));
/*    */       } }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     return arrayOfLabelNode; }
/*    */   public static final int TABLESWITCH_INSN = 11; public static final int LOOKUPSWITCH_INSN = 12; public static final int MULTIANEWARRAY_INSN = 13; public static final int FRAME = 14; public static final int LINE = 15; protected int opcode; public List<TypeAnnotationNode> visibleTypeAnnotations; public List<TypeAnnotationNode> invisibleTypeAnnotations; AbstractInsnNode prev; AbstractInsnNode next; int index; public AbstractInsnNode getNext() { return this.next; } protected final void acceptAnnotations(MethodVisitor paramMethodVisitor) { try {  }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/* 43 */      byte b1 = (this.visibleTypeAnnotations == null) ? 0 : this.visibleTypeAnnotations.size();
/*    */     byte b2;
/*    */     for (b2 = 0; b2 < b1; typeAnnotationNode.accept(paramMethodVisitor.visitInsnAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true)), b2++)
/*    */       TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(b2); 
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     b1 = (this.invisibleTypeAnnotations == null) ? 0 : this.invisibleTypeAnnotations.size();
/*    */     for (b2 = 0; b2 < b1; ) {
/*    */       TypeAnnotationNode typeAnnotationNode = this.invisibleTypeAnnotations.get(b2);
/*    */       typeAnnotationNode.accept(paramMethodVisitor.visitInsnAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, false));
/*    */       b2++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   protected final AbstractInsnNode cloneAnnotations(AbstractInsnNode paramAbstractInsnNode) {
/*    */     if (paramAbstractInsnNode.visibleTypeAnnotations != null) {
/*    */       this.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>();
/*    */       for (byte b = 0; b < paramAbstractInsnNode.visibleTypeAnnotations.size(); ) {
/*    */         TypeAnnotationNode typeAnnotationNode1 = paramAbstractInsnNode.visibleTypeAnnotations.get(b);
/*    */         TypeAnnotationNode typeAnnotationNode2 = new TypeAnnotationNode(typeAnnotationNode1.typeRef, typeAnnotationNode1.typePath, typeAnnotationNode1.desc);
/*    */         typeAnnotationNode1.accept(typeAnnotationNode2);
/*    */       } 
/*    */     } 
/*    */     if (paramAbstractInsnNode.invisibleTypeAnnotations != null) {
/*    */       this.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>();
/*    */       boolean bool = false;
/*    */     } 
/*    */     return this;
/*    */   }
/*    */   
/*    */   protected AbstractInsnNode(int paramInt) {
/*    */     this.opcode = paramInt;
/*    */     this.index = -1;
/*    */   }
/*    */   
/*    */   public AbstractInsnNode getPrevious() {
/*    */     return this.prev;
/*    */   }
/*    */   
/*    */   public int getOpcode() {
/*    */     return this.opcode;
/*    */   }
/*    */   
/*    */   static LabelNode clone(LabelNode paramLabelNode, Map<LabelNode, LabelNode> paramMap) {
/*    */     return paramMap.get(paramLabelNode);
/*    */   }
/*    */   
/*    */   public abstract int getType();
/*    */   
/*    */   public abstract void accept(MethodVisitor paramMethodVisitor);
/*    */   
/*    */   public abstract AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap);
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\AbstractInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */