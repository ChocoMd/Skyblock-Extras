/*    */ package org.spongepowered.asm.lib.tree.analysis;public class SourceValue implements Value { public final int size; public int hashCode() {
/*  2 */     return this.insns.hashCode();
/*    */   } public final Set<AbstractInsnNode> insns;
/*    */   public SourceValue(int paramInt) {
/*  5 */     this(paramInt, SmallSet.emptySet());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SourceValue(int paramInt, Set<AbstractInsnNode> paramSet)
/*    */   {
/* 14 */     this.size = paramInt;
/*    */     this.insns = paramSet; } public int getSize() {
/* 16 */     return this.size;
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     try {
/*    */       if (!(paramObject instanceof SourceValue))
/*    */         return false; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     SourceValue sourceValue = (SourceValue)paramObject;
/*    */     try {
/*    */       if (this.size == sourceValue.size)
/*    */         try {
/*    */           if (this.insns.equals(sourceValue.insns));
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public SourceValue(int paramInt, AbstractInsnNode paramAbstractInsnNode) {
/*    */     this.size = paramInt;
/*    */     this.insns = new SmallSet<AbstractInsnNode>(paramAbstractInsnNode, null);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\SourceValue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */