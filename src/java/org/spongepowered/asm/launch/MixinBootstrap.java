/*    */ package org.spongepowered.asm.launch;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.spongepowered.asm.launch.platform.MixinPlatformManager;
/*    */ import org.spongepowered.asm.service.MixinService;
/*    */ 
/*    */ public abstract class MixinBootstrap {
/*    */   static boolean start() {
/*    */     // Byte code:
/*    */     //   0: invokestatic isSubsystemRegistered : ()Z
/*    */     //   3: ifeq -> 64
/*    */     //   6: invokestatic checkSubsystemVersion : ()Z
/*    */     //   9: ifne -> 62
/*    */     //   12: goto -> 19
/*    */     //   15: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   18: athrow
/*    */     //   19: new org/spongepowered/asm/launch/MixinInitialisationError
/*    */     //   22: dup
/*    */     //   23: new java/lang/StringBuilder
/*    */     //   26: dup
/*    */     //   27: invokespecial <init> : ()V
/*    */     //   30: ldc 'Mixin subsystem version '
/*    */     //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   35: invokestatic getActiveSubsystemVersion : ()Ljava/lang/Object;
/*    */     //   38: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   41: ldc ' was already initialised. Cannot bootstrap version '
/*    */     //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   46: ldc '0.7.11'
/*    */     //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   51: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   54: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   57: athrow
/*    */     //   58: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   61: athrow
/*    */     //   62: iconst_0
/*    */     //   63: ireturn
/*    */     //   64: ldc '0.7.11'
/*    */     //   66: invokestatic registerSubsystem : (Ljava/lang/String;)V
/*    */     //   69: getstatic org/spongepowered/asm/launch/MixinBootstrap.initialised : Z
/*    */     //   72: ifne -> 180
/*    */     //   75: iconst_1
/*    */     //   76: putstatic org/spongepowered/asm/launch/MixinBootstrap.initialised : Z
/*    */     //   79: ldc 'sun.java.command'
/*    */     //   81: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   84: astore_0
/*    */     //   85: aload_0
/*    */     //   86: ifnull -> 120
/*    */     //   89: aload_0
/*    */     //   90: ldc 'GradleStart'
/*    */     //   92: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   95: ifeq -> 120
/*    */     //   98: goto -> 105
/*    */     //   101: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   104: athrow
/*    */     //   105: ldc 'mixin.env.remapRefMap'
/*    */     //   107: ldc 'true'
/*    */     //   109: invokestatic setProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   112: pop
/*    */     //   113: goto -> 120
/*    */     //   116: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   119: athrow
/*    */     //   120: invokestatic getService : ()Lorg/spongepowered/asm/service/IMixinService;
/*    */     //   123: invokeinterface getInitialPhase : ()Lorg/spongepowered/asm/mixin/MixinEnvironment$Phase;
/*    */     //   128: astore_1
/*    */     //   129: aload_1
/*    */     //   130: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Phase.DEFAULT : Lorg/spongepowered/asm/mixin/MixinEnvironment$Phase;
/*    */     //   133: if_acmpne -> 168
/*    */     //   136: getstatic org/spongepowered/asm/launch/MixinBootstrap.logger : Lorg/apache/logging/log4j/Logger;
/*    */     //   139: ldc 'Initialising mixin subsystem after game pre-init phase! Some mixins may be skipped.'
/*    */     //   141: invokeinterface error : (Ljava/lang/String;)V
/*    */     //   146: aload_1
/*    */     //   147: invokestatic init : (Lorg/spongepowered/asm/mixin/MixinEnvironment$Phase;)V
/*    */     //   150: invokestatic getPlatform : ()Lorg/spongepowered/asm/launch/platform/MixinPlatformManager;
/*    */     //   153: aconst_null
/*    */     //   154: invokevirtual prepare : (Ljava/util/List;)V
/*    */     //   157: iconst_0
/*    */     //   158: putstatic org/spongepowered/asm/launch/MixinBootstrap.initState : Z
/*    */     //   161: goto -> 172
/*    */     //   164: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   167: athrow
/*    */     //   168: aload_1
/*    */     //   169: invokestatic init : (Lorg/spongepowered/asm/mixin/MixinEnvironment$Phase;)V
/*    */     //   172: invokestatic getService : ()Lorg/spongepowered/asm/service/IMixinService;
/*    */     //   175: invokeinterface beginPhase : ()V
/*    */     //   180: invokestatic getPlatform : ()Lorg/spongepowered/asm/launch/platform/MixinPlatformManager;
/*    */     //   183: pop
/*    */     //   184: iconst_1
/*    */     //   185: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 0
/*    */     //   #58	-> 6
/*    */     //   #10	-> 19
/*    */     //   #47	-> 62
/*    */     //   #50	-> 64
/*    */     //   #24	-> 69
/*    */     //   #5	-> 75
/*    */     //   #55	-> 79
/*    */     //   #39	-> 85
/*    */     //   #36	-> 105
/*    */     //   #4	-> 120
/*    */     //   #51	-> 129
/*    */     //   #7	-> 136
/*    */     //   #19	-> 146
/*    */     //   #33	-> 150
/*    */     //   #53	-> 157
/*    */     //   #28	-> 168
/*    */     //   #25	-> 172
/*    */     //   #16	-> 180
/*    */     //   #11	-> 184
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	12	15	java/lang/IllegalStateException
/*    */     //   6	58	58	java/lang/IllegalStateException
/*    */     //   85	98	101	java/lang/IllegalStateException
/*    */     //   89	113	116	java/lang/IllegalStateException
/*    */     //   129	164	164	java/lang/IllegalStateException
/*    */   }
/*    */   
/*    */   private static boolean initialised = false;
/*    */   
/* 14 */   private static Object getActiveSubsystemVersion() { Object object = GlobalProperties.get("mixin.initialised");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {  }
/*    */     catch (IllegalStateException illegalStateException)
/* 22 */     { throw b(null); }  return (object != null) ? object : ""; }
/*    */   private static boolean checkSubsystemVersion() { return "0.7.11".equals(getActiveSubsystemVersion()); }
/*    */   private static boolean isSubsystemRegistered() { 
/*    */     try {  }
/*    */     catch (IllegalStateException illegalStateException)
/* 27 */     { throw b(null); }  return (GlobalProperties.get("mixin.initialised") != null); }
/*    */   @Deprecated public static void addProxy() { MixinService.getService().beginPhase(); }
/* 29 */   private static void registerSubsystem(String paramString) { GlobalProperties.put("mixin.initialised", paramString); } static void inject() { getPlatform().inject(); }
/*    */ 
/*    */   
/*    */   public static void init() {
/*    */     try {
/* 34 */       if (!start())
/*    */         return; 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     doInit(null); } private static boolean initState = true; static void doInit(List<String> paramList) { 
/* 40 */     try { if (!initialised)
/*    */       { 
/* 42 */         try { if (isSubsystemRegistered()) {
/*    */             logger.warn("Multiple Mixin containers present, init suppressed for 0.7.11");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/*    */             return;
/*    */           }  }
/*    */         catch (IllegalStateException illegalStateException)
/* 54 */         { throw b(null); }  throw new IllegalStateException("MixinBootstrap.doInit() called before MixinBootstrap.start()"); }  }
/*    */     catch (IllegalStateException illegalStateException) { throw b(null); }
/* 56 */      try { getPlatform().getPhaseProviderClasses(); if (initState) { getPlatform().prepare(paramList); MixinService.getService().init(); }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/* 57 */      } private static final Logger logger = LogManager.getLogger("mixin"); public static final String VERSION = "0.7.11"; static { MixinService.boot();
/*    */     
/* 59 */     MixinService.getService().prepare(); }
/*    */ 
/*    */   
/*    */   private static MixinPlatformManager platform;
/*    */   
/*    */   public static MixinPlatformManager getPlatform() {
/*    */     if (platform == null) {
/*    */       MixinPlatformManager mixinPlatformManager = (MixinPlatformManager)GlobalProperties.get("mixin.platform");
/*    */       try {
/*    */         if (mixinPlatformManager instanceof MixinPlatformManager) {
/*    */           platform = mixinPlatformManager;
/*    */         } else {
/*    */           platform = new MixinPlatformManager();
/*    */           GlobalProperties.put("mixin.platform", platform);
/*    */           platform.init();
/*    */         } 
/*    */       } catch (IllegalStateException illegalStateException) {
/*    */         throw b(null);
/*    */       } 
/*    */     } 
/*    */     return platform;
/*    */   }
/*    */   
/*    */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\MixinBootstrap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */