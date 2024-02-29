/*    */ package org.spongepowered.asm.mixin.gen;
/*    */ 
/*    */ public class AccessorGeneratorMethodProxy extends AccessorGenerator {
/*    */   public MethodNode generate() {
/*    */     
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/*  8 */     { throw b(null); }  int i = Bytecode.getArgsSize(this.argTypes) + this.returnType.getSize() + (this.isInstanceMethod ? 1 : 0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     MethodNode methodNode = createMethod(i, i);
/*    */     try {
/* 16 */       if (this.isInstanceMethod)
/*    */         methodNode.instructions.add((AbstractInsnNode)new VarInsnNode(25, 0)); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Bytecode.loadArgs(this.argTypes, methodNode.instructions, this.isInstanceMethod ? 1 : 0);
/*    */     boolean bool = Bytecode.hasFlag(this.targetMethod, 2);
/*    */     try {
/*    */       if (this.isInstanceMethod) {
/*    */         try {
/*    */         
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } else {
/*    */       
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     char c = '¸';
/*    */     methodNode.instructions.add((AbstractInsnNode)new MethodInsnNode(c, (this.info.getClassNode()).name, this.targetMethod.name, this.targetMethod.desc, false));
/*    */     methodNode.instructions.add((AbstractInsnNode)new InsnNode(this.returnType.getOpcode(172)));
/*    */     return methodNode;
/*    */   }
/*    */   
/*    */   private final MethodNode targetMethod;
/*    */   private final Type[] argTypes;
/*    */   private final Type returnType;
/*    */   private final boolean isInstanceMethod;
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */   
/*    */   public AccessorGeneratorMethodProxy(AccessorInfo paramAccessorInfo) {
/*    */     super(paramAccessorInfo);
/*    */     this.targetMethod = paramAccessorInfo.getTargetMethod();
/*    */     this.argTypes = paramAccessorInfo.getArgTypes();
/*    */     this.returnType = paramAccessorInfo.getReturnType();
/*    */     this.isInstanceMethod = !Bytecode.hasFlag(this.targetMethod, 8);
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\AccessorGeneratorMethodProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */