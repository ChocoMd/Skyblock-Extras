/*    */ package org.spongepowered.asm.mixin;
/*    */ import org.spongepowered.asm.mixin.extensibility.IEnvironmentTokenProvider;
/*    */ 
/*    */ class MixinEnvironment$TokenProviderWrapper implements Comparable<MixinEnvironment$TokenProviderWrapper> {
/*    */   public MixinEnvironment$TokenProviderWrapper(IEnvironmentTokenProvider paramIEnvironmentTokenProvider, MixinEnvironment paramMixinEnvironment) {
/*  6 */     this.provider = paramIEnvironmentTokenProvider;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     this.environment = paramMixinEnvironment;
/*    */     
/* 15 */     this.order = nextOrder++;
/*    */     this.priority = paramIEnvironmentTokenProvider.getPriority();
/*    */   }
/*    */   
/*    */   private static int nextOrder = 0;
/*    */   private final int priority;
/*    */   private final int order;
/*    */   private final IEnvironmentTokenProvider provider;
/*    */   private final MixinEnvironment environment;
/*    */   
/*    */   public int compareTo(MixinEnvironment$TokenProviderWrapper paramMixinEnvironment$TokenProviderWrapper) {
/*    */     try {
/*    */       if (paramMixinEnvironment$TokenProviderWrapper == null)
/*    */         return 0; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramMixinEnvironment$TokenProviderWrapper.priority == this.priority)
/*    */         return paramMixinEnvironment$TokenProviderWrapper.order - this.order; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return paramMixinEnvironment$TokenProviderWrapper.priority - this.priority;
/*    */   }
/*    */   
/*    */   public IEnvironmentTokenProvider getProvider() {
/*    */     return this.provider;
/*    */   }
/*    */   
/*    */   Integer getToken(String paramString) {
/*    */     return this.provider.getToken(paramString, this.environment);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$TokenProviderWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */