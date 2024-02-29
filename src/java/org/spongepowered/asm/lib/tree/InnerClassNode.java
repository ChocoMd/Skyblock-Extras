/*   */ package org.spongepowered.asm.lib.tree;public class InnerClassNode { public InnerClassNode(String paramString1, String paramString2, String paramString3, int paramInt) {
/* 2 */     this.name = paramString1;
/*   */ 
/*   */ 
/*   */     
/* 6 */     this.outerName = paramString2;
/*   */     
/* 8 */     this.innerName = paramString3;
/*   */     this.access = paramInt;
/*   */   }
/*   */   
/*   */   public String name;
/*   */   public String outerName;
/*   */   public String innerName;
/*   */   public int access;
/*   */   
/*   */   public void accept(ClassVisitor paramClassVisitor) {
/*   */     paramClassVisitor.visitInnerClass(this.name, this.outerName, this.innerName, this.access);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\InnerClassNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */