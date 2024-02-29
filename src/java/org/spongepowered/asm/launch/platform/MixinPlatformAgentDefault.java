/*    */ package org.spongepowered.asm.launch.platform;public class MixinPlatformAgentDefault extends MixinPlatformAgentAbstract {
/*    */   public String getLaunchTarget() {
/*  3 */     return this.attributes.get("Main-Class");
/*    */   }
/*    */   public void inject() {}
/*    */   
/*    */   public MixinPlatformAgentDefault(MixinPlatformManager paramMixinPlatformManager, URI paramURI) {
/*  8 */     super(paramMixinPlatformManager, paramURI);
/*    */   }
/*    */ 
/*    */   
/*    */   public void initPrimaryContainer() {}
/*    */ 
/*    */   
/*    */   public void prepare() {
/* 16 */     String str1 = this.attributes.get("MixinCompatibilityLevel");
/*    */     
/* 18 */     try { if (str1 != null)
/* 19 */         this.manager.setCompatibilityLevel(str1);  } catch (RuntimeException runtimeException) { throw b(null); }  String str2 = this.attributes.get("MixinConfigs");
/*    */     if (str2 != null) {
/*    */       String[] arrayOfString;
/*    */       int i;
/*    */       byte b;
/*    */       for (arrayOfString = str2.split(","), i = arrayOfString.length, b = 0; b < i; this.manager.addConfig(str.trim()))
/*    */         String str = arrayOfString[b]; 
/*    */     } 
/*    */     String str3 = this.attributes.get("MixinTokenProviders");
/*    */     if (str3 != null) {
/*    */       String[] arrayOfString;
/*    */       int i;
/*    */       byte b;
/*    */       for (arrayOfString = str3.split(","), i = arrayOfString.length, b = 0; b < i; ) {
/*    */         String str = arrayOfString[b];
/*    */         this.manager.addTokenProvider(str.trim());
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MixinPlatformAgentDefault.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */