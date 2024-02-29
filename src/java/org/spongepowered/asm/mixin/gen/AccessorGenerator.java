/*   */ package org.spongepowered.asm.mixin.gen;public abstract class AccessorGenerator { protected final MethodNode createMethod(int paramInt1, int paramInt2) {
/* 2 */     MethodNode methodNode1 = this.info.getMethod();
/*   */     
/*   */     MethodNode methodNode2 = new MethodNode(327680, methodNode1.access & 0xFFFFFBFF | 0x1000, methodNode1.name, methodNode1.desc, null, null);
/*   */     
/* 6 */     methodNode2.visibleAnnotations = new ArrayList();
/*   */     
/*   */     methodNode2.visibleAnnotations.add(this.info.getAnnotation());
/* 9 */     methodNode2.maxLocals = paramInt1;
/*   */     methodNode2.maxStack = paramInt2;
/*   */     return methodNode2;
/*   */   }
/*   */   
/*   */   protected final AccessorInfo info;
/*   */   
/*   */   public abstract MethodNode generate();
/*   */   
/*   */   public AccessorGenerator(AccessorInfo paramAccessorInfo) {
/*   */     this.info = paramAccessorInfo;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\AccessorGenerator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */