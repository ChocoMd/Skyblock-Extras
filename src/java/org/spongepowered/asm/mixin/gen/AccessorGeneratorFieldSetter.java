/*    */ package org.spongepowered.asm.mixin.gen;
/*    */ public class AccessorGeneratorFieldSetter extends AccessorGeneratorField {
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */   
/*    */   public MethodNode generate() { 
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/* 10 */     { throw b(null); }  byte b = this.isInstanceField ? 1 : 0; int i = b + this.targetType.getSize(); int j = b + this.targetType.getSize(); MethodNode methodNode = createMethod(i, j); try { if (this.isInstanceField)
/* 11 */         methodNode.instructions.add((AbstractInsnNode)new VarInsnNode(25, 0));  } catch (RuntimeException runtimeException) { throw b(null); }  try { methodNode.instructions.add((AbstractInsnNode)new VarInsnNode(this.targetType.getOpcode(21), b)); } catch (RuntimeException runtimeException) { throw b(null); }  char c = this.isInstanceField ? 'µ' : '³'; methodNode.instructions.add((AbstractInsnNode)new FieldInsnNode(c, (this.info.getClassNode()).name, this.targetField.name, this.targetField.desc)); methodNode.instructions.add((AbstractInsnNode)new InsnNode(177));
/* 12 */     return methodNode; } public AccessorGeneratorFieldSetter(AccessorInfo paramAccessorInfo) {
/* 13 */     super(paramAccessorInfo);
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\AccessorGeneratorFieldSetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */