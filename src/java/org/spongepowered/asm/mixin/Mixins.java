/*    */ package org.spongepowered.asm.mixin;
/*  2 */ public final class Mixins { public static Set<Config> getConfigs() { Set<Config> set = (Set)GlobalProperties.get("mixin.configs.queue");
/*  3 */     if (set == null) {
/*    */       
/*  5 */       set = new LinkedHashSet();
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
/* 25 */       GlobalProperties.put("mixin.configs.queue", set);
/*    */     }  return set; } public static Set<String> getErrorHandlerClasses() { return Collections.unmodifiableSet(errorHandlers); }
/*    */   private static void registerConfiguration(Config paramConfig) { try { if (paramConfig == null)
/*    */         return;  }
/*    */     catch (RuntimeException runtimeException)
/* 30 */     { throw b(null); }
/*    */      MixinEnvironment mixinEnvironment = paramConfig.getEnvironment(); try {
/*    */       if (mixinEnvironment != null)
/*    */         mixinEnvironment.registerConfig(paramConfig.getName()); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     }  getConfigs().add(paramConfig); } public static void addConfiguration(String paramString) { createConfiguration(paramString, MixinEnvironment.getDefaultEnvironment()); }
/*    */   private static void createConfiguration(String paramString, MixinEnvironment paramMixinEnvironment) { Config config = null; 
/* 38 */     try { config = Config.create(paramString, paramMixinEnvironment); } catch (Exception exception) { logger.error("Error encountered reading mixin config " + paramString + ": " + exception.getClass().getName() + " " + exception.getMessage(), exception); }
/* 39 */      registerConfiguration(config); } private static final Logger logger = LogManager.getLogger("mixin"); public static int getUnvisitedCount() { byte b = 0; for (Config config : getConfigs()) {
/*    */       try {
/*    */         if (!config.isVisited())
/*    */           b++; 
/*    */       } catch (RuntimeException runtimeException) {
/*    */         throw b(null);
/*    */       } 
/*    */     } 
/*    */     return b; }
/*    */ 
/*    */   
/*    */   private static final String CONFIGS_KEY = "mixin.configs.queue";
/*    */   
/*    */   @Deprecated
/*    */   static void addConfiguration(String paramString, MixinEnvironment paramMixinEnvironment) {
/*    */     createConfiguration(paramString, paramMixinEnvironment);
/*    */   }
/*    */   
/*    */   private static final Set<String> errorHandlers = new LinkedHashSet<String>();
/*    */   
/*    */   public static void registerErrorHandlerClass(String paramString) {
/*    */     try {
/*    */       if (paramString != null)
/*    */         errorHandlers.add(paramString); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void addConfigurations(String... paramVarArgs) {
/*    */     MixinEnvironment mixinEnvironment = MixinEnvironment.getDefaultEnvironment();
/*    */     String[] arrayOfString;
/*    */     int i;
/*    */     byte b;
/*    */     for (arrayOfString = paramVarArgs, i = arrayOfString.length, b = 0; b < i; ) {
/*    */       String str = arrayOfString[b];
/*    */       createConfiguration(str, mixinEnvironment);
/*    */       b++;
/*    */     } 
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\Mixins.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */