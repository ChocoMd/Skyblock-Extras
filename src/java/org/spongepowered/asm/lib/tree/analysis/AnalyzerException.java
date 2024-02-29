/* 1 */ package org.spongepowered.asm.lib.tree.analysis;public class AnalyzerException extends Exception { public AnalyzerException(AbstractInsnNode paramAbstractInsnNode, String paramString, Throwable paramThrowable) { super(paramString, paramThrowable);
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */     
/* 9 */     this.node = paramAbstractInsnNode; }
/*   */ 
/*   */   
/*   */   public final AbstractInsnNode node;
/*   */   
/*   */   public AnalyzerException(AbstractInsnNode paramAbstractInsnNode, String paramString, Object paramObject, Value paramValue) {
/*   */     super(((paramString == null) ? "Expected " : (paramString + ": expected ")) + paramObject + ", but found " + paramValue);
/*   */     this.node = paramAbstractInsnNode;
/*   */   }
/*   */   
/*   */   public AnalyzerException(AbstractInsnNode paramAbstractInsnNode, String paramString) {
/*   */     super(paramString);
/*   */     this.node = paramAbstractInsnNode;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\AnalyzerException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */