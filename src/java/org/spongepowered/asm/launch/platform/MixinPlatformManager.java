/*     */ package org.spongepowered.asm.launch.platform;
/*     */ 
/*     */ public class MixinPlatformManager {
/*   4 */   public final MixinContainer addContainer(URI paramURI) { MixinContainer mixinContainer1 = this.containers.get(paramURI);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  84 */       if (mixinContainer1 != null) {
/*     */         return mixinContainer1;
/*     */       }
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     logger.debug("Adding mixin platform agents for container {}", new Object[] { paramURI });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     MixinContainer mixinContainer2 = new MixinContainer(this, paramURI); try { this.containers.put(paramURI, mixinContainer2); if (this.prepared)
/*     */         mixinContainer2.prepare();  }
/*     */     catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */      return mixinContainer2; } private boolean prepared = false; final void addTokenProvider(String paramString) { if (paramString.contains("@")) {
/* 112 */       String[] arrayOfString = paramString.split("@", 2); MixinEnvironment.Phase phase = MixinEnvironment.Phase.forName(arrayOfString[1]);
/*     */       try {
/*     */         if (phase != null) {
/*     */           logger.debug("Registering token provider class: {}", new Object[] { arrayOfString[0] });
/*     */           MixinEnvironment.getEnvironment(phase).registerTokenProviderClass(arrayOfString[0]);
/*     */         } 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw b(null);
/*     */       } 
/*     */       return;
/*     */     } 
/*     */     MixinEnvironment.getDefaultEnvironment().registerTokenProviderClass(paramString); }
/*     */ 
/*     */   
/*     */   private void parseArgs(List<String> paramList) {
/*     */     boolean bool = false;
/*     */     for (String str : paramList) {
/*     */       try {
/*     */         if (bool)
/*     */           addConfig(str); 
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final Logger logger = LogManager.getLogger("mixin");
/*     */   
/*     */   final void addConfig(String paramString) {
/*     */     try {
/*     */       if (paramString.endsWith(".json")) {
/*     */         logger.debug("Registering mixin config: {}", new Object[] { paramString });
/*     */         Mixins.addConfiguration(paramString);
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     if (paramString.contains(".json@")) {
/*     */       int i = paramString.indexOf(".json@");
/*     */       String str = paramString.substring(i + 6);
/*     */       paramString = paramString.substring(0, i + 5);
/*     */       MixinEnvironment.Phase phase = MixinEnvironment.Phase.forName(str);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void prepare(List<String> paramList) {
/*     */     this.prepared = true;
/*     */     for (MixinContainer mixinContainer : this.containers.values())
/*     */       mixinContainer.prepare(); 
/*     */     try {
/*     */       if (paramList != null) {
/*     */         parseArgs(paramList);
/*     */       } else {
/*     */         String str = System.getProperty("sun.java.command");
/*     */         try {
/*     */           if (str != null)
/*     */             parseArgs(Arrays.asList(str.split(" "))); 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void init() {
/*     */     // Byte code:
/*     */     //   0: getstatic org/spongepowered/asm/launch/platform/MixinPlatformManager.logger : Lorg/apache/logging/log4j/Logger;
/*     */     //   3: ldc 'Initialising Mixin Platform Manager'
/*     */     //   5: invokeinterface debug : (Ljava/lang/String;)V
/*     */     //   10: aconst_null
/*     */     //   11: astore_1
/*     */     //   12: aload_0
/*     */     //   13: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   16: invokevirtual getProtectionDomain : ()Ljava/security/ProtectionDomain;
/*     */     //   19: invokevirtual getCodeSource : ()Ljava/security/CodeSource;
/*     */     //   22: invokevirtual getLocation : ()Ljava/net/URL;
/*     */     //   25: invokevirtual toURI : ()Ljava/net/URI;
/*     */     //   28: astore_1
/*     */     //   29: aload_1
/*     */     //   30: ifnull -> 67
/*     */     //   33: getstatic org/spongepowered/asm/launch/platform/MixinPlatformManager.logger : Lorg/apache/logging/log4j/Logger;
/*     */     //   36: ldc 'Mixin platform: primary container is {}'
/*     */     //   38: iconst_1
/*     */     //   39: anewarray java/lang/Object
/*     */     //   42: dup
/*     */     //   43: iconst_0
/*     */     //   44: aload_1
/*     */     //   45: aastore
/*     */     //   46: invokeinterface debug : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   51: aload_0
/*     */     //   52: aload_0
/*     */     //   53: aload_1
/*     */     //   54: invokevirtual addContainer : (Ljava/net/URI;)Lorg/spongepowered/asm/launch/platform/MixinContainer;
/*     */     //   57: putfield primaryContainer : Lorg/spongepowered/asm/launch/platform/MixinContainer;
/*     */     //   60: goto -> 67
/*     */     //   63: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   66: athrow
/*     */     //   67: goto -> 75
/*     */     //   70: astore_2
/*     */     //   71: aload_2
/*     */     //   72: invokevirtual printStackTrace : ()V
/*     */     //   75: aload_0
/*     */     //   76: invokespecial scanClasspath : ()V
/*     */     //   79: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 0
/*     */     //   #42	-> 10
/*     */     //   #35	-> 12
/*     */     //   #71	-> 29
/*     */     //   #113	-> 33
/*     */     //   #40	-> 51
/*     */     //   #17	-> 67
/*     */     //   #10	-> 70
/*     */     //   #8	-> 71
/*     */     //   #51	-> 75
/*     */     //   #59	-> 79
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	67	70	java/net/URISyntaxException
/*     */     //   29	60	63	java/net/URISyntaxException
/*     */   }
/*     */   
/*     */   private void scanClasspath() {
/*     */     URL[] arrayOfURL1 = MixinService.getService().getClassProvider().getClassPath();
/*     */     URL[] arrayOfURL2;
/*     */     int i;
/*     */     byte b;
/*     */     for (arrayOfURL2 = arrayOfURL1, i = arrayOfURL2.length, b = 0; b < i; b++) {
/*     */       URL uRL = arrayOfURL2[b];
/*     */       try {
/*     */         URI uRI = uRL.toURI();
/*     */         if (!this.containers.containsKey(uRI)) {
/*     */           logger.debug("Scanning {} for mixin tweaker", new Object[] { uRI });
/*     */           if ("file".equals(uRI.getScheme()) && (new File(uRI)).exists()) {
/*     */             MainAttributes mainAttributes = MainAttributes.of(uRI);
/*     */             String str = mainAttributes.get("TweakClass");
/*     */             try {
/*     */               if ("org.spongepowered.asm.launch.MixinTweaker".equals(str)) {
/*     */                 logger.debug("{} contains a mixin tweaker, adding agents", new Object[] { uRI });
/*     */                 addContainer(uRI);
/*     */               } 
/*     */             } catch (Exception exception) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void inject() {
/*     */     try {
/*     */       if (this.injected)
/*     */         return; 
/*     */     } catch (Exception exception) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.injected = true;
/*     */       if (this.primaryContainer != null)
/*     */         this.primaryContainer.initPrimaryContainer(); 
/*     */     } catch (Exception exception) {
/*     */       throw b(null);
/*     */     } 
/*     */     scanClasspath();
/*     */     logger.debug("inject() running with {} agents", new Object[] { Integer.valueOf(this.containers.size()) });
/*     */     for (MixinContainer mixinContainer : this.containers.values()) {
/*     */       try {
/*     */         mixinContainer.inject();
/*     */       } catch (Exception exception) {
/*     */         exception.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private final Map<URI, MixinContainer> containers = new LinkedHashMap<URI, MixinContainer>();
/*     */   private static final String DEFAULT_MAIN_CLASS = "net.minecraft.client.main.Main";
/*     */   private static final String MIXIN_TWEAKER_CLASS = "org.spongepowered.asm.launch.MixinTweaker";
/*     */   private MixinContainer primaryContainer;
/*     */   private boolean injected;
/*     */   
/*     */   public Collection<String> getPhaseProviderClasses() {
/*     */     Collection<String> collection = this.primaryContainer.getPhaseProviders();
/*     */     try {
/*     */       if (collection != null)
/*     */         return Collections.unmodifiableCollection(collection); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return Collections.emptyList();
/*     */   }
/*     */   
/*     */   public String getLaunchTarget() {
/*     */     for (MixinContainer mixinContainer : this.containers.values())
/*     */       String str = mixinContainer.getLaunchTarget(); 
/*     */     return "net.minecraft.client.main.Main";
/*     */   }
/*     */   
/*     */   final void setCompatibilityLevel(String paramString) {
/*     */     try {
/*     */       MixinEnvironment.CompatibilityLevel compatibilityLevel = MixinEnvironment.CompatibilityLevel.valueOf(paramString.toUpperCase());
/*     */       logger.debug("Setting mixin compatibility level: {}", new Object[] { compatibilityLevel });
/*     */       MixinEnvironment.setCompatibilityLevel(compatibilityLevel);
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       logger.warn("Invalid compatibility level specified: {}", new Object[] { paramString });
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MixinPlatformManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */