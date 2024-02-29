/*  1 */ package org.spongepowered.asm.lib.tree;public class MethodInsnNode extends AbstractInsnNode { public String owner; public String name; public void setOpcode(int paramInt) { this.opcode = paramInt; }
/*    */    public String desc; public boolean itf; public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*  3 */     return new MethodInsnNode(this.opcode, this.owner, this.name, this.desc, this.itf); } @Deprecated
/*    */   public MethodInsnNode(int paramInt, String paramString1, String paramString2, String paramString3) {
/*  5 */     this(paramInt, paramString1, paramString2, paramString3, (paramInt == 185));
/*    */   } public int getType() {
/*  7 */     return 5;
/*    */   }
/*    */   
/*    */   public void accept(MethodVisitor paramMethodVisitor) {
/* 11 */     paramMethodVisitor.visitMethodInsn(this.opcode, this.owner, this.name, this.desc, this.itf);
/* 12 */     acceptAnnotations(paramMethodVisitor); } public MethodInsnNode(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { super(paramInt);
/*    */ 
/*    */     
/* 15 */     this.owner = paramString1;
/*    */     this.name = paramString2;
/*    */     this.desc = paramString3;
/*    */     this.itf = paramBoolean; }
/*    */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\MethodInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */