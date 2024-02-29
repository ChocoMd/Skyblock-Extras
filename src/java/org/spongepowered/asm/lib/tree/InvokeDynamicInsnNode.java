/*    */ package org.spongepowered.asm.lib.tree;
/*  2 */ public class InvokeDynamicInsnNode extends AbstractInsnNode { public String name; public String desc; public InvokeDynamicInsnNode(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) { super(186);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  9 */     this.name = paramString1;
/*    */     
/*    */     this.desc = paramString2;
/* 12 */     this.bsm = paramHandle; this.bsmArgs = paramVarArgs; }
/* 13 */   public Handle bsm; public Object[] bsmArgs; public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) { return (new InvokeDynamicInsnNode(this.name, this.desc, this.bsm, this.bsmArgs)).cloneAnnotations(this); } public int getType() { return 6; } public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitInvokeDynamicInsn(this.name, this.desc, this.bsm, this.bsmArgs);
/*    */     acceptAnnotations(paramMethodVisitor); }
/*    */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\InvokeDynamicInsnNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */