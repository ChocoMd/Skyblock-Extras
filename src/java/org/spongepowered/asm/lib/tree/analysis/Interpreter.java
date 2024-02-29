/* 1 */ package org.spongepowered.asm.lib.tree.analysis;public abstract class Interpreter<V extends Value> { protected Interpreter(int paramInt) { this.api = paramInt; }
/*   */ 
/*   */   
/*   */   protected final int api;
/*   */   
/*   */   public abstract V newValue(Type paramType);
/*   */   
/*   */   public abstract V newOperation(AbstractInsnNode paramAbstractInsnNode) throws AnalyzerException;
/*   */   
/*   */   public abstract V copyOperation(AbstractInsnNode paramAbstractInsnNode, V paramV) throws AnalyzerException;
/*   */   
/*   */   public abstract V unaryOperation(AbstractInsnNode paramAbstractInsnNode, V paramV) throws AnalyzerException;
/*   */   
/*   */   public abstract V binaryOperation(AbstractInsnNode paramAbstractInsnNode, V paramV1, V paramV2) throws AnalyzerException;
/*   */   
/*   */   public abstract V ternaryOperation(AbstractInsnNode paramAbstractInsnNode, V paramV1, V paramV2, V paramV3) throws AnalyzerException;
/*   */   
/*   */   public abstract V naryOperation(AbstractInsnNode paramAbstractInsnNode, List<? extends V> paramList) throws AnalyzerException;
/*   */   
/*   */   public abstract void returnOperation(AbstractInsnNode paramAbstractInsnNode, V paramV1, V paramV2) throws AnalyzerException;
/*   */   
/*   */   public abstract V merge(V paramV1, V paramV2); }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\Interpreter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */