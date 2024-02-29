/*    */ package org.spongepowered.asm.lib.tree;public class FieldInsnNode extends AbstractInsnNode {
/*    */   public void accept(MethodVisitor paramMethodVisitor) {
/*  3 */     paramMethodVisitor.visitFieldInsn(this.opcode, this.owner, this.name, this.desc);
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
/* 14 */     acceptAnnotations(paramMethodVisitor);
/*    */   }
/*    */   
/*    */   public String owner;
/*    */   public String name;
/*    */   public String desc;
/*    */   
/*    */   public int getType() {
/*    */     return 4;
/*    */   }
/*    */   
/*    */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*    */     return (new FieldInsnNode(this.opcode, this.owner, this.name, this.desc)).cloneAnnotations(this);
/*    */   }
/*    */   
/*    */   public FieldInsnNode(int paramInt, String paramString1, String paramString2, String paramString3) {
/*    */     super(paramInt);
/*    */     this.owner = paramString1;
/*    */     this.name = paramString2;
/*    */     this.desc = paramString3;
/*    */   }
/*    */   
/*    */   public void setOpcode(int paramInt) {
/*    */     this.opcode = paramInt;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\FieldInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */