/*  1 */ package org.spongepowered.asm.lib.tree;public class TypeInsnNode extends AbstractInsnNode { public void setOpcode(int paramInt) { this.opcode = paramInt; }
/*    */    public String desc;
/*    */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*  4 */     return (new TypeInsnNode(this.opcode, this.desc)).cloneAnnotations(this); } public int getType() {
/*  5 */     return 3;
/*    */   } public void accept(MethodVisitor paramMethodVisitor) {
/*  7 */     paramMethodVisitor.visitTypeInsn(this.opcode, this.desc);
/*  8 */     acceptAnnotations(paramMethodVisitor);
/*    */   } public TypeInsnNode(int paramInt, String paramString) {
/* 10 */     super(paramInt);
/*    */     this.desc = paramString;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\TypeInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */