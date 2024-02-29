/*     */ package org.spongepowered.asm.mixin;public final class MixinEnvironment implements ITokenProvider { public String getVersion() {
/*   2 */     return (String)GlobalProperties.get("mixin.initialised");
/*     */   } public void addTransformerExclusion(String paramString) {
/*   4 */     excludeTransformers.add(paramString);
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
/*  73 */     this.transformers = null;
/*     */   }
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
/*     */   private static MixinEnvironment$Phase getCurrentPhase() {
/*     */     
/*     */     try { if (currentPhase == MixinEnvironment$Phase.NOT_INITIALISED)
/* 101 */         init(MixinEnvironment$Phase.PREINIT);  } catch (MixinException mixinException) { throw b(null); }
/*     */      return currentPhase;
/*     */   }
/*     */   @Deprecated public MixinEnvironment addConfiguration(String paramString) { logger.warn("MixinEnvironment::addConfiguration is deprecated and will be removed. Use Mixins::addConfiguration instead!"); Mixins.addConfiguration(paramString, this); return this; }
/*     */   public String getObfuscationContext() { return this.obfuscationContext; }
/*     */   public void setActiveTransformer(ITransformer paramITransformer) { try {
/*     */       if (paramITransformer != null)
/*     */         GlobalProperties.put("mixin.transformer", paramITransformer); 
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     }  }
/*     */   private void printHeader(Object paramObject) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial getCodeSource : ()Ljava/lang/String;
/*     */     //   4: astore_2
/*     */     //   5: aload_0
/*     */     //   6: getfield service : Lorg/spongepowered/asm/service/IMixinService;
/*     */     //   9: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   14: astore_3
/*     */     //   15: aload_0
/*     */     //   16: invokevirtual getSide : ()Lorg/spongepowered/asm/mixin/MixinEnvironment$Side;
/*     */     //   19: astore #4
/*     */     //   21: getstatic org/spongepowered/asm/mixin/MixinEnvironment.logger : Lorg/apache/logging/log4j/Logger;
/*     */     //   24: ldc 'SpongePowered MIXIN Subsystem Version={} Source={} Service={} Env={}'
/*     */     //   26: iconst_4
/*     */     //   27: anewarray java/lang/Object
/*     */     //   30: dup
/*     */     //   31: iconst_0
/*     */     //   32: aload_1
/*     */     //   33: aastore
/*     */     //   34: dup
/*     */     //   35: iconst_1
/*     */     //   36: aload_2
/*     */     //   37: aastore
/*     */     //   38: dup
/*     */     //   39: iconst_2
/*     */     //   40: aload_3
/*     */     //   41: aastore
/*     */     //   42: dup
/*     */     //   43: iconst_3
/*     */     //   44: aload #4
/*     */     //   46: aastore
/*     */     //   47: invokeinterface info : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   52: aload_0
/*     */     //   53: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option.DEBUG_VERBOSE : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*     */     //   56: invokevirtual getOption : (Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;)Z
/*     */     //   59: istore #5
/*     */     //   61: iload #5
/*     */     //   63: ifne -> 100
/*     */     //   66: aload_0
/*     */     //   67: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option.DEBUG_EXPORT : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*     */     //   70: invokevirtual getOption : (Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;)Z
/*     */     //   73: ifne -> 100
/*     */     //   76: goto -> 83
/*     */     //   79: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   82: athrow
/*     */     //   83: aload_0
/*     */     //   84: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option.DEBUG_PROFILER : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*     */     //   87: invokevirtual getOption : (Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;)Z
/*     */     //   90: ifeq -> 338
/*     */     //   93: goto -> 100
/*     */     //   96: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   99: athrow
/*     */     //   100: new org/spongepowered/asm/util/PrettyPrinter
/*     */     //   103: dup
/*     */     //   104: bipush #32
/*     */     //   106: invokespecial <init> : (I)V
/*     */     //   109: astore #6
/*     */     //   111: aload #6
/*     */     //   113: ldc 'SpongePowered MIXIN%s'
/*     */     //   115: iconst_1
/*     */     //   116: anewarray java/lang/Object
/*     */     //   119: dup
/*     */     //   120: iconst_0
/*     */     //   121: iload #5
/*     */     //   123: ifeq -> 135
/*     */     //   126: ldc ' (Verbose debugging enabled)'
/*     */     //   128: goto -> 137
/*     */     //   131: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   134: athrow
/*     */     //   135: ldc ''
/*     */     //   137: aastore
/*     */     //   138: invokevirtual add : (Ljava/lang/String;[Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   141: invokevirtual centre : ()Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   144: invokevirtual hr : ()Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   147: pop
/*     */     //   148: aload #6
/*     */     //   150: ldc 'Code source'
/*     */     //   152: aload_2
/*     */     //   153: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   156: pop
/*     */     //   157: aload #6
/*     */     //   159: ldc 'Internal Version'
/*     */     //   161: aload_1
/*     */     //   162: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   165: pop
/*     */     //   166: aload #6
/*     */     //   168: ldc 'Java 8 Supported'
/*     */     //   170: getstatic org/spongepowered/asm/mixin/MixinEnvironment$CompatibilityLevel.JAVA_8 : Lorg/spongepowered/asm/mixin/MixinEnvironment$CompatibilityLevel;
/*     */     //   173: invokevirtual isSupported : ()Z
/*     */     //   176: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*     */     //   179: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   182: invokevirtual hr : ()Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   185: pop
/*     */     //   186: aload #6
/*     */     //   188: ldc 'Service Name'
/*     */     //   190: aload_3
/*     */     //   191: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   194: pop
/*     */     //   195: aload #6
/*     */     //   197: ldc 'Service Class'
/*     */     //   199: aload_0
/*     */     //   200: getfield service : Lorg/spongepowered/asm/service/IMixinService;
/*     */     //   203: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   206: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   209: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   212: invokevirtual hr : ()Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   215: pop
/*     */     //   216: invokestatic values : ()[Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*     */     //   219: astore #7
/*     */     //   221: aload #7
/*     */     //   223: arraylength
/*     */     //   224: istore #8
/*     */     //   226: iconst_0
/*     */     //   227: istore #9
/*     */     //   229: iload #9
/*     */     //   231: iload #8
/*     */     //   233: if_icmpge -> 316
/*     */     //   236: aload #7
/*     */     //   238: iload #9
/*     */     //   240: aaload
/*     */     //   241: astore #10
/*     */     //   243: new java/lang/StringBuilder
/*     */     //   246: dup
/*     */     //   247: invokespecial <init> : ()V
/*     */     //   250: astore #11
/*     */     //   252: iconst_0
/*     */     //   253: istore #12
/*     */     //   255: iload #12
/*     */     //   257: aload #10
/*     */     //   259: getfield depth : I
/*     */     //   262: if_icmpge -> 283
/*     */     //   265: aload #11
/*     */     //   267: ldc '- '
/*     */     //   269: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   272: pop
/*     */     //   273: iinc #12, 1
/*     */     //   276: goto -> 255
/*     */     //   279: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   282: athrow
/*     */     //   283: aload #6
/*     */     //   285: aload #10
/*     */     //   287: getfield property : Ljava/lang/String;
/*     */     //   290: ldc '%s<%s>'
/*     */     //   292: iconst_2
/*     */     //   293: anewarray java/lang/Object
/*     */     //   296: dup
/*     */     //   297: iconst_0
/*     */     //   298: aload #11
/*     */     //   300: aastore
/*     */     //   301: dup
/*     */     //   302: iconst_1
/*     */     //   303: aload #10
/*     */     //   305: aastore
/*     */     //   306: invokevirtual kv : (Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   309: pop
/*     */     //   310: iinc #9, 1
/*     */     //   313: goto -> 229
/*     */     //   316: aload #6
/*     */     //   318: invokevirtual hr : ()Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   321: ldc 'Detected Side'
/*     */     //   323: aload #4
/*     */     //   325: invokevirtual kv : (Ljava/lang/String;Ljava/lang/Object;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   328: pop
/*     */     //   329: aload #6
/*     */     //   331: getstatic java/lang/System.err : Ljava/io/PrintStream;
/*     */     //   334: invokevirtual print : (Ljava/io/PrintStream;)Lorg/spongepowered/asm/util/PrettyPrinter;
/*     */     //   337: pop
/*     */     //   338: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #19	-> 0
/*     */     //   #1	-> 5
/*     */     //   #115	-> 15
/*     */     //   #65	-> 21
/*     */     //   #56	-> 52
/*     */     //   #143	-> 61
/*     */     //   #110	-> 100
/*     */     //   #189	-> 111
/*     */     //   #46	-> 148
/*     */     //   #173	-> 157
/*     */     //   #24	-> 166
/*     */     //   #99	-> 186
/*     */     //   #14	-> 195
/*     */     //   #183	-> 216
/*     */     //   #8	-> 243
/*     */     //   #68	-> 252
/*     */     //   #108	-> 265
/*     */     //   #155	-> 273
/*     */     //   #151	-> 283
/*     */     //   #157	-> 310
/*     */     //   #102	-> 316
/*     */     //   #10	-> 329
/*     */     //   #132	-> 338
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   61	76	79	org/spongepowered/asm/mixin/throwables/MixinException
/*     */     //   66	93	96	org/spongepowered/asm/mixin/throwables/MixinException
/*     */     //   111	131	131	org/spongepowered/asm/mixin/throwables/MixinException
/*     */     //   255	279	279	org/spongepowered/asm/mixin/throwables/MixinException }
/*     */   public void setOption(MixinEnvironment$Option paramMixinEnvironment$Option, boolean paramBoolean) { this.options[paramMixinEnvironment$Option.ordinal()] = paramBoolean; }
/*     */   void registerConfig(String paramString) { List<String> list = getMixinConfigs(); try {
/*     */       if (!list.contains(paramString))
/*     */         list.add(paramString); 
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     }  }
/*     */   public MixinEnvironment$Side getSide() { if (this.side == null) {
/*     */       MixinEnvironment$Side[] arrayOfMixinEnvironment$Side; int i; byte b; for (arrayOfMixinEnvironment$Side = MixinEnvironment$Side.values(), i = arrayOfMixinEnvironment$Side.length, b = 0; b < i; ) {
/*     */         MixinEnvironment$Side mixinEnvironment$Side = arrayOfMixinEnvironment$Side[b]; try {
/*     */           if (mixinEnvironment$Side.detect()) {
/*     */             this.side = mixinEnvironment$Side; break;
/*     */           } 
/*     */         } catch (MixinException mixinException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     }  try {
/*     */     
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     }  return (this.side != null) ? this.side : MixinEnvironment$Side.UNKNOWN; } static void gotoPhase(MixinEnvironment$Phase paramMixinEnvironment$Phase) { try {
/*     */       if (paramMixinEnvironment$Phase != null)
/*     */         try {
/*     */           if (paramMixinEnvironment$Phase.ordinal >= 0) {
/*     */             try {
/*     */               if (paramMixinEnvironment$Phase.ordinal > (getCurrentPhase()).ordinal)
/*     */                 MixinService.getService().beginPhase(); 
/*     */             } catch (MixinException mixinException) {
/*     */               throw b(null);
/*     */             }  try {
/*     */               if (paramMixinEnvironment$Phase == MixinEnvironment$Phase.DEFAULT)
/*     */                 MixinEnvironment$MixinLogWatcher.end(); 
/*     */             } catch (MixinException mixinException) {
/*     */               throw b(null);
/*     */             }  currentPhase = paramMixinEnvironment$Phase; currentEnvironment = getEnvironment(getCurrentPhase()); return;
/*     */           } 
/*     */           throw new IllegalArgumentException("Cannot go to the specified phase, phase is null or invalid");
/*     */         } catch (MixinException mixinException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Cannot go to the specified phase, phase is null or invalid"); } public MixinEnvironment registerTokenProvider(IEnvironmentTokenProvider paramIEnvironmentTokenProvider) { 
/*     */     try { if (paramIEnvironmentTokenProvider != null && !this.tokenProviderClasses.contains(paramIEnvironmentTokenProvider.getClass().getName()))
/*     */       { String str = paramIEnvironmentTokenProvider.getClass().getName();
/* 160 */         MixinEnvironment$TokenProviderWrapper mixinEnvironment$TokenProviderWrapper = new MixinEnvironment$TokenProviderWrapper(paramIEnvironmentTokenProvider, this);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         logger.info("Adding new token provider {} to {}", new Object[] { str, this });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         this.tokenProviders.add(mixinEnvironment$TokenProviderWrapper);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 184 */         this.tokenProviderClasses.add(str); Collections.sort(this.tokenProviders); }  } catch (MixinException mixinException) { throw b(null); }  return this; } MixinEnvironment(MixinEnvironment$Phase paramMixinEnvironment$Phase) { this.tokenProviderClasses = new HashSet<String>(); this.tokenProviders = new ArrayList<MixinEnvironment$TokenProviderWrapper>(); this.internalTokens = new HashMap<String, Integer>(); this.remappers = new RemapperChain(); this.obfuscationContext = null; this.service = MixinService.getService(); this.phase = paramMixinEnvironment$Phase; this.configsKey = "mixin.configs." + this.phase.name.toLowerCase(); String str = getVersion(); try { if (str != null)
/*     */         try { if ("0.7.11".equals(str)) { this.service.checkEnv(this); this.options = new boolean[(MixinEnvironment$Option.values()).length]; MixinEnvironment$Option[] arrayOfMixinEnvironment$Option; int i; byte b; for (arrayOfMixinEnvironment$Option = MixinEnvironment$Option.values(), i = arrayOfMixinEnvironment$Option.length, b = 0; b < i; this.options[mixinEnvironment$Option.ordinal()] = mixinEnvironment$Option.getBooleanValue())
/* 186 */               MixinEnvironment$Option mixinEnvironment$Option = arrayOfMixinEnvironment$Option[b];  try { if (showHeader) { showHeader = false; printHeader(str); }  } catch (MixinException mixinException) { throw b(null); }  return; }  throw new MixinException("Environment conflict, mismatched versions or you didn't call MixinBootstrap.init()"); } catch (MixinException mixinException) { throw b(null); }   } catch (MixinException mixinException) { throw b(null); }  throw new MixinException("Environment conflict, mismatched versions or you didn't call MixinBootstrap.init()"); } @Deprecated public MixinEnvironment registerErrorHandlerClass(String paramString) { Mixins.registerErrorHandlerClass(paramString); return this; } private void buildTransformerDelegationList() { logger.debug("Rebuilding transformer delegation list:"); this.transformers = new ArrayList<ILegacyClassTransformer>(); for (ITransformer iTransformer : this.service.getTransformers()) { try { if (!(iTransformer instanceof ILegacyClassTransformer)); } catch (MixinException mixinException) { throw b(null); }  }  logger.debug("Transformer delegation list created with {} entries", new Object[] { Integer.valueOf(this.transformers.size()) }); } public Integer getToken(String paramString) { paramString = paramString.toUpperCase(); for (MixinEnvironment$TokenProviderWrapper mixinEnvironment$TokenProviderWrapper : this.tokenProviders) { Integer integer = mixinEnvironment$TokenProviderWrapper.getToken(paramString); try { if (integer != null) return integer;  } catch (MixinException mixinException) { throw b(null); }  }  return this.internalTokens.get(paramString); } public String getOptionValue(MixinEnvironment$Option paramMixinEnvironment$Option) { return paramMixinEnvironment$Option.getStringValue(); } public static MixinEnvironment getDefaultEnvironment() { return getEnvironment(MixinEnvironment$Phase.DEFAULT); } public List<ILegacyClassTransformer> getTransformers() { try { if (this.transformers == null) buildTransformerDelegationList();  } catch (MixinException mixinException) { throw b(null); }  return Collections.unmodifiableList(this.transformers); }
/*     */   public String toString() { return String.format("%s[%s]", new Object[] { getClass().getSimpleName(), this.phase }); }
/* 188 */   public MixinEnvironment registerTokenProviderClass(String paramString) { if (!this.tokenProviderClasses.contains(paramString)) try { Class<IEnvironmentTokenProvider> clazz = this.service.getClassProvider().findClass(paramString, true); IEnvironmentTokenProvider iEnvironmentTokenProvider = clazz.newInstance(); registerTokenProvider(iEnvironmentTokenProvider); } catch (Throwable throwable)
/*     */       { logger.error("Error instantiating " + paramString, throwable); }
/*     */        
/*     */     return this; }
/*     */ 
/*     */   
/*     */   @Deprecated
/*     */   public Set<String> getErrorHandlerClasses() {
/*     */     return Mixins.getErrorHandlerClasses();
/*     */   }
/*     */   
/*     */   public static MixinEnvironment$CompatibilityLevel getCompatibilityLevel() {
/*     */     return compatibility;
/*     */   }
/*     */   
/*     */   public static MixinEnvironment getCurrentEnvironment() {
/*     */     try {
/*     */       if (currentEnvironment == null)
/*     */         currentEnvironment = getEnvironment(getCurrentPhase()); 
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return currentEnvironment;
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public List<String> getMixinConfigs() {
/*     */     List<String> list = (List)GlobalProperties.get(this.configsKey);
/*     */     if (list == null) {
/*     */       list = new ArrayList();
/*     */       GlobalProperties.put(this.configsKey, list);
/*     */     } 
/*     */     return list;
/*     */   }
/*     */   
/*     */   private static MixinEnvironment$Phase currentPhase = MixinEnvironment$Phase.NOT_INITIALISED;
/*     */   
/*     */   public static MixinEnvironment getEnvironment(MixinEnvironment$Phase paramMixinEnvironment$Phase) {
/*     */     try {
/*     */       if (paramMixinEnvironment$Phase == null)
/*     */         return MixinEnvironment$Phase.DEFAULT.getEnvironment(); 
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return paramMixinEnvironment$Phase.getEnvironment();
/*     */   }
/*     */   
/*     */   private static final Logger logger = LogManager.getLogger("mixin");
/*     */   private static final Set<String> excludeTransformers = Sets.newHashSet((Object[])new String[] { "net.minecraftforge.fml.common.asm.transformers.EventSubscriptionTransformer", "cpw.mods.fml.common.asm.transformers.EventSubscriptionTransformer", "net.minecraftforge.fml.common.asm.transformers.TerminalTransformer", "cpw.mods.fml.common.asm.transformers.TerminalTransformer" });
/*     */   private static boolean showHeader = true;
/*     */   
/*     */   @Deprecated
/*     */   public static void setCompatibilityLevel(MixinEnvironment$CompatibilityLevel paramMixinEnvironment$CompatibilityLevel) throws IllegalArgumentException {
/*     */     StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
/*     */     try {
/*     */       if (!"org.spongepowered.asm.mixin.transformer.MixinConfig".equals(arrayOfStackTraceElement[2].getClassName()))
/*     */         logger.warn("MixinEnvironment::setCompatibilityLevel is deprecated and will be removed. Set level via config instead!"); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramMixinEnvironment$CompatibilityLevel != compatibility)
/*     */         try {
/*     */           if (paramMixinEnvironment$CompatibilityLevel.isAtLeast(compatibility)) {
/*     */             try {
/*     */               if (!paramMixinEnvironment$CompatibilityLevel.isSupported())
/*     */                 throw new IllegalArgumentException("The requested compatibility level " + paramMixinEnvironment$CompatibilityLevel + " could not be set. Level is not supported"); 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw b(null);
/*     */             } 
/*     */             compatibility = paramMixinEnvironment$CompatibilityLevel;
/*     */             logger.info("Compatibility level set to {}", new Object[] { paramMixinEnvironment$CompatibilityLevel });
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String getCodeSource() {
/*     */     try {
/*     */       return getClass().getProtectionDomain().getCodeSource().getLocation().toString();
/*     */     } catch (Throwable throwable) {
/*     */       return "Unknown";
/*     */     } 
/*     */   }
/*     */   
/*     */   public <E extends Enum<E>> E getOption(MixinEnvironment$Option paramMixinEnvironment$Option, E paramE) {
/*     */     return paramMixinEnvironment$Option.getEnumValue(paramE);
/*     */   }
/*     */   
/*     */   private static MixinEnvironment$CompatibilityLevel compatibility = MixinEnvironment$Option.DEFAULT_COMPATIBILITY_LEVEL.<MixinEnvironment$CompatibilityLevel>getEnumValue(MixinEnvironment$CompatibilityLevel.JAVA_6);
/*     */   
/*     */   public MixinEnvironment setSide(MixinEnvironment$Side paramMixinEnvironment$Side) {
/*     */     try {
/*     */       if (paramMixinEnvironment$Side != null)
/*     */         try {
/*     */           if (getSide() == MixinEnvironment$Side.UNKNOWN)
/*     */             try {
/*     */               if (paramMixinEnvironment$Side != MixinEnvironment$Side.UNKNOWN)
/*     */                 this.side = paramMixinEnvironment$Side; 
/*     */             } catch (MixinException mixinException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (MixinException mixinException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return this;
/*     */   }
/*     */   
/*     */   public static void init(MixinEnvironment$Phase paramMixinEnvironment$Phase) {
/*     */     if (currentPhase == MixinEnvironment$Phase.NOT_INITIALISED) {
/*     */       currentPhase = paramMixinEnvironment$Phase;
/*     */       MixinEnvironment mixinEnvironment = getEnvironment(paramMixinEnvironment$Phase);
/*     */       getProfiler().setActive(mixinEnvironment.getOption(MixinEnvironment$Option.DEBUG_PROFILER));
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Profiler getProfiler() {
/*     */     return profiler;
/*     */   }
/*     */   
/*     */   public boolean getOption(MixinEnvironment$Option paramMixinEnvironment$Option) {
/*     */     return this.options[paramMixinEnvironment$Option.ordinal()];
/*     */   }
/*     */   
/*     */   public void setObfuscationContext(String paramString) {
/*     */     this.obfuscationContext = paramString;
/*     */   }
/*     */   
/*     */   public void audit() {
/*     */     Object object = getActiveTransformer();
/*     */     if (object instanceof MixinTransformer) {
/*     */       MixinTransformer mixinTransformer = (MixinTransformer)object;
/*     */       mixinTransformer.audit(this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String getRefmapObfuscationContext() {
/*     */     String str = MixinEnvironment$Option.OBFUSCATION_TYPE.getStringValue();
/*     */     try {
/*     */       if (str != null)
/*     */         return str; 
/*     */     } catch (MixinException mixinException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return this.obfuscationContext;
/*     */   }
/*     */   
/*     */   public RemapperChain getRemappers() {
/*     */     return this.remappers;
/*     */   }
/*     */   
/*     */   public Object getActiveTransformer() {
/*     */     return GlobalProperties.get("mixin.transformer");
/*     */   }
/*     */   
/*     */   private static final Profiler profiler = new Profiler();
/*     */   private static MixinEnvironment currentEnvironment;
/*     */   private final IMixinService service;
/*     */   private final MixinEnvironment$Phase phase;
/*     */   private final String configsKey;
/*     */   private final boolean[] options;
/*     */   private final Set<String> tokenProviderClasses;
/*     */   private final List<MixinEnvironment$TokenProviderWrapper> tokenProviders;
/*     */   private final Map<String, Integer> internalTokens;
/*     */   private final RemapperChain remappers;
/*     */   private MixinEnvironment$Side side;
/*     */   private List<ILegacyClassTransformer> transformers;
/*     */   private String obfuscationContext;
/*     */   
/*     */   public MixinEnvironment$Phase getPhase() {
/*     */     return this.phase;
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */