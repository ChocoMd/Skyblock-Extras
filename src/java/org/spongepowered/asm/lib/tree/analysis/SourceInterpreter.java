/*    */ package org.spongepowered.asm.lib.tree.analysis;
/*    */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*    */ public class SourceInterpreter extends Interpreter<SourceValue> implements Opcodes { protected SourceInterpreter(int paramInt) { super(paramInt); } public void returnOperation(AbstractInsnNode paramAbstractInsnNode, SourceValue paramSourceValue1, SourceValue paramSourceValue2) {} public SourceValue newOperation(AbstractInsnNode paramAbstractInsnNode) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: invokevirtual getOpcode : ()I
/*    */     //   4: lookupswitch default -> 128, 9 -> 64, 10 -> 64, 14 -> 64, 15 -> 64, 18 -> 69, 178 -> 111
/*    */     //   64: iconst_2
/*    */     //   65: istore_2
/*    */     //   66: goto -> 130
/*    */     //   69: aload_1
/*    */     //   70: checkcast org/spongepowered/asm/lib/tree/LdcInsnNode
/*    */     //   73: getfield cst : Ljava/lang/Object;
/*    */     //   76: astore_3
/*    */     //   77: aload_3
/*    */     //   78: instanceof java/lang/Long
/*    */     //   81: ifne -> 98
/*    */     //   84: aload_3
/*    */     //   85: instanceof java/lang/Double
/*    */     //   88: ifeq -> 106
/*    */     //   91: goto -> 98
/*    */     //   94: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   97: athrow
/*    */     //   98: iconst_2
/*    */     //   99: goto -> 107
/*    */     //   102: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   105: athrow
/*    */     //   106: iconst_1
/*    */     //   107: istore_2
/*    */     //   108: goto -> 130
/*    */     //   111: aload_1
/*    */     //   112: checkcast org/spongepowered/asm/lib/tree/FieldInsnNode
/*    */     //   115: getfield desc : Ljava/lang/String;
/*    */     //   118: invokestatic getType : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Type;
/*    */     //   121: invokevirtual getSize : ()I
/*    */     //   124: istore_2
/*    */     //   125: goto -> 130
/*    */     //   128: iconst_1
/*    */     //   129: istore_2
/*    */     //   130: new org/spongepowered/asm/lib/tree/analysis/SourceValue
/*    */     //   133: dup
/*    */     //   134: iload_2
/*    */     //   135: aload_1
/*    */     //   136: invokespecial <init> : (ILorg/spongepowered/asm/lib/tree/AbstractInsnNode;)V
/*    */     //   139: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 0
/*    */     //   #31	-> 64
/*    */     //   #16	-> 66
/*    */     //   #30	-> 69
/*    */     //   #19	-> 77
/*    */     //   #3	-> 108
/*    */     //   #57	-> 111
/*    */     //   #53	-> 125
/*    */     //   #36	-> 128
/*    */     //   #43	-> 130
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   77	91	94	java/lang/RuntimeException
/*    */     //   84	102	102	java/lang/RuntimeException } public SourceValue newValue(Type paramType) { 
/*  4 */     try { if (paramType == Type.VOID_TYPE)
/*    */       {
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 55 */         return null; }  } catch (RuntimeException runtimeException) { throw b(null); }  try {  } catch (RuntimeException runtimeException) { throw b(null); }  return new SourceValue((paramType == null) ? 1 : paramType.getSize()); }
/* 56 */   public SourceInterpreter() { super(327680); } public SourceValue binaryOperation(AbstractInsnNode paramAbstractInsnNode, SourceValue paramSourceValue1, SourceValue paramSourceValue2) { switch (paramAbstractInsnNode.getOpcode()) { case 47: case 49: case 97: case 99: case 101: case 103: case 105: case 107: case 109: case 111: case 113: case 115: case 121: case 123: case 125: case 127: case 129: case 131: b = 2; return new SourceValue(b, paramAbstractInsnNode); }  byte b = 1; return new SourceValue(b, paramAbstractInsnNode); } public SourceValue unaryOperation(AbstractInsnNode paramAbstractInsnNode, SourceValue paramSourceValue) { switch (paramAbstractInsnNode.getOpcode()) { case 117: case 119: case 133: case 135: case 138: case 140: case 141: case 143: i = 2; return new SourceValue(i, paramAbstractInsnNode);case 180: i = Type.getType(((FieldInsnNode)paramAbstractInsnNode).desc).getSize(); return new SourceValue(i, paramAbstractInsnNode); }  int i = 1; return new SourceValue(i, paramAbstractInsnNode); } public SourceValue merge(SourceValue paramSourceValue1, SourceValue paramSourceValue2) { try { if (paramSourceValue1.insns instanceof SmallSet && paramSourceValue2.insns instanceof SmallSet) { Set<AbstractInsnNode> set = ((SmallSet)paramSourceValue1.insns).union((SmallSet)paramSourceValue2.insns); try { if (set == paramSourceValue1.insns) try { if (paramSourceValue1.size == paramSourceValue2.size) return paramSourceValue1;  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return new SourceValue(Math.min(paramSourceValue1.size, paramSourceValue2.size), set); }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (paramSourceValue1.size != paramSourceValue2.size || !paramSourceValue1.insns.containsAll(paramSourceValue2.insns)) { HashSet<AbstractInsnNode> hashSet = new HashSet(); hashSet.addAll(paramSourceValue1.insns); hashSet.addAll(paramSourceValue2.insns); return new SourceValue(Math.min(paramSourceValue1.size, paramSourceValue2.size), hashSet); }  } catch (RuntimeException runtimeException) { throw b(null); }  return paramSourceValue1; } public SourceValue ternaryOperation(AbstractInsnNode paramAbstractInsnNode, SourceValue paramSourceValue1, SourceValue paramSourceValue2, SourceValue paramSourceValue3) { return new SourceValue(1, paramAbstractInsnNode); }
/*    */   public SourceValue copyOperation(AbstractInsnNode paramAbstractInsnNode, SourceValue paramSourceValue) { return new SourceValue(paramSourceValue.getSize(), paramAbstractInsnNode); }
/* 58 */   public SourceValue naryOperation(AbstractInsnNode paramAbstractInsnNode, List<? extends SourceValue> paramList) { int j, i = paramAbstractInsnNode.getOpcode();
/*    */     if (i == 197) {
/*    */       j = 1;
/*    */     } else {
/*    */       try {
/*    */       
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */       String str = (i == 186) ? ((InvokeDynamicInsnNode)paramAbstractInsnNode).desc : ((MethodInsnNode)paramAbstractInsnNode).desc;
/*    */       j = Type.getReturnType(str).getSize();
/*    */     } 
/*    */     return new SourceValue(j, paramAbstractInsnNode); }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\SourceInterpreter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */