/*   */ package org.spongepowered.asm.mixin.gen;public class AccessorGeneratorFieldGetter extends AccessorGeneratorField {
/*   */   public AccessorGeneratorFieldGetter(AccessorInfo paramAccessorInfo) {
/* 3 */     super(paramAccessorInfo);
/*   */   }
/*   */ 
/*   */ 
/*   */   
/*   */   public MethodNode generate() {
/* 9 */     MethodNode methodNode = createMethod(this.targetType.getSize(), this.targetType.getSize());
/*   */     try {
/*   */       if (this.isInstanceField)
/*   */         methodNode.instructions.add((AbstractInsnNode)new VarInsnNode(25, 0)); 
/*   */     } catch (RuntimeException runtimeException) {
/*   */       throw b(null);
/*   */     } 
/*   */     try {
/*   */     
/*   */     } catch (RuntimeException runtimeException) {
/*   */       throw b(null);
/*   */     } 
/*   */     char c = this.isInstanceField ? '´' : '²';
/*   */     methodNode.instructions.add((AbstractInsnNode)new FieldInsnNode(c, (this.info.getClassNode()).name, this.targetField.name, this.targetField.desc));
/*   */     methodNode.instructions.add((AbstractInsnNode)new InsnNode(this.targetType.getOpcode(172)));
/*   */     return methodNode;
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\AccessorGeneratorFieldGetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */