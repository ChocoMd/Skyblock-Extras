/*    */ package org.spongepowered.asm.lib.tree;
/*    */ public class LocalVariableNode { public String name; public String desc; public String signature;
/*    */   
/*  4 */   public LocalVariableNode(String paramString1, String paramString2, String paramString3, LabelNode paramLabelNode1, LabelNode paramLabelNode2, int paramInt) { this.name = paramString1;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*  9 */     this.desc = paramString2; this.signature = paramString3;
/*    */     this.start = paramLabelNode1;
/* 11 */     this.end = paramLabelNode2;
/* 12 */     this.index = paramInt; } public LabelNode start; public LabelNode end; public int index; public void accept(MethodVisitor paramMethodVisitor) { paramMethodVisitor.visitLocalVariable(this.name, this.desc, this.signature, this.start.getLabel(), this.end.getLabel(), this.index); }
/*    */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\LocalVariableNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */