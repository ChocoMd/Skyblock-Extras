/*   1 */ package org.spongepowered.asm.launch.platform;public class MixinPlatformAgentFML extends MixinPlatformAgentAbstract { private static final String LOAD_CORE_MOD_METHOD = "loadCoreMod"; private static final String GET_REPARSEABLE_COREMODS_METHOD = "getReparseableCoremods"; private static final String CORE_MOD_MANAGER_CLASS = "net.minecraftforge.fml.relauncher.CoreModManager"; private static final String CORE_MOD_MANAGER_CLASS_LEGACY = "cpw.mods.fml.relauncher.CoreModManager"; private static final String GET_IGNORED_MODS_METHOD = "getIgnoredMods"; private static final String GET_IGNORED_MODS_METHOD_LEGACY = "getLoadedCoremods"; private static final String FML_REMAPPER_ADAPTER_CLASS = "org.spongepowered.asm.bridge.RemapperAdapterFML"; private static final String FML_CMDLINE_COREMODS = "fml.coreMods.load"; private static final String FML_PLUGIN_WRAPPER_CLASS = "FMLPluginWrapper"; private static final String FML_CORE_MOD_INSTANCE_FIELD = "coreModInstance"; private void injectRemapper() { try { MixinPlatformAgentAbstract.logger.debug("Creating FML remapper adapter: {}", new Object[] { "org.spongepowered.asm.bridge.RemapperAdapterFML" });
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  88 */       Class<?> clazz = Class.forName("org.spongepowered.asm.bridge.RemapperAdapterFML", true, (ClassLoader)Launch.classLoader);
/*     */       
/*     */       Method method = clazz.getDeclaredMethod("create", new Class[0]);
/*     */       
/*  92 */       IRemapper iRemapper = (IRemapper)method.invoke(null, new Object[0]);
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
/*     */       MixinEnvironment.getDefaultEnvironment().getRemappers().add(iRemapper); }
/* 106 */     catch (Exception exception) { MixinPlatformAgentAbstract.logger.debug("Failed instancing FML remapper adapter, things will probably go horribly for notch-obf'd mods!"); }  }
/*     */   private static final String MFATT_FORCELOADASMOD = "ForceLoadAsMod";
/*     */   private static final String MFATT_FMLCOREPLUGIN = "FMLCorePlugin";
/*     */   private static final String MFATT_COREMODCONTAINSMOD = "FMLCorePluginContainsFMLMod";
/*     */   private static final String FML_TWEAKER_DEOBF = "FMLDeobfTweaker"; private static final String FML_TWEAKER_INJECTION = "FMLInjectionAndSortingTweaker"; private static final String FML_TWEAKER_TERMINAL = "TerminalTweaker"; private static final Set<String> loadedCoreMods; private final ITweaker coreModWrapper; private final String fileName; private Class<?> clCoreModManager; private boolean initInjectionState; public MixinPlatformAgentFML(MixinPlatformManager paramMixinPlatformManager, URI paramURI) { super(paramMixinPlatformManager, paramURI); this.fileName = this.container.getName(); this.coreModWrapper = initFMLCoreMod(); } public String getLaunchTarget() { return null; } private static Class<?> getCoreModManagerClass() throws ClassNotFoundException { try { return Class.forName(GlobalProperties.getString("mixin.launch.fml.coremodmanagerclass", "net.minecraftforge.fml.relauncher.CoreModManager")); } catch (ClassNotFoundException classNotFoundException) { return Class.forName("cpw.mods.fml.relauncher.CoreModManager"); }  } private static boolean isTweakerQueued(String paramString) { for (String str : GlobalProperties.get("TweakClasses")) { try { if (str.endsWith(paramString))
/*     */           return true;  } catch (RuntimeException runtimeException) { throw b(null); }  }  return false; } public void initPrimaryContainer() { try { if (this.clCoreModManager != null)
/* 112 */         injectRemapper();  } catch (RuntimeException runtimeException) { throw b(null); }
/*     */      } public void prepare() { this.initInjectionState |= isTweakerQueued("FMLInjectionAndSortingTweaker"); }
/*     */   private ITweaker injectCorePlugin() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException { String str = this.attributes.get("FMLCorePlugin"); try { if (str == null)
/* 115 */         return null;  } catch (NoSuchMethodException noSuchMethodException) { throw b(null); }  try { if (isAlreadyInjected(str)) { MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Skipping because it was already injected.", new Object[] { this.fileName, str }); return null; }  }
/*     */     catch (NoSuchMethodException noSuchMethodException) { throw b(null); }
/* 117 */      MixinPlatformAgentAbstract.logger.debug("{} has core plugin {}. Injecting it into FML for co-initialisation:", new Object[] { this.fileName, str }); Method method = this.clCoreModManager.getDeclaredMethod(GlobalProperties.getString("mixin.launch.fml.loadcoremodmethod", "loadCoreMod"), new Class[] { LaunchClassLoader.class, String.class, File.class }); method.setAccessible(true); ITweaker iTweaker = (ITweaker)method.invoke(null, new Object[] { Launch.classLoader, str, this.container }); try { if (iTweaker == null) { MixinPlatformAgentAbstract.logger.debug("Core plugin {} could not be loaded.", new Object[] { str }); return null; }  } catch (NoSuchMethodException noSuchMethodException) { throw b(null); }  this.initInjectionState = isTweakerQueued("FMLInjectionAndSortingTweaker"); loadedCoreMods.add(str); return iTweaker; } protected final boolean checkForCoInitialisation() { // Byte code:
/*     */     //   0: ldc 'FMLInjectionAndSortingTweaker'
/*     */     //   2: invokestatic isTweakerQueued : (Ljava/lang/String;)Z
/*     */     //   5: istore_1
/*     */     //   6: ldc 'TerminalTweaker'
/*     */     //   8: invokestatic isTweakerQueued : (Ljava/lang/String;)Z
/*     */     //   11: istore_2
/*     */     //   12: aload_0
/*     */     //   13: getfield initInjectionState : Z
/*     */     //   16: ifeq -> 30
/*     */     //   19: iload_2
/*     */     //   20: ifne -> 41
/*     */     //   23: goto -> 30
/*     */     //   26: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   29: athrow
/*     */     //   30: iload_1
/*     */     //   31: ifeq -> 68
/*     */     //   34: goto -> 41
/*     */     //   37: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   40: athrow
/*     */     //   41: getstatic org/spongepowered/asm/launch/platform/MixinPlatformAgentAbstract.logger : Lorg/apache/logging/log4j/Logger;
/*     */     //   44: ldc 'FML agent is skipping co-init for {} because FML will inject it normally'
/*     */     //   46: iconst_1
/*     */     //   47: anewarray java/lang/Object
/*     */     //   50: dup
/*     */     //   51: iconst_0
/*     */     //   52: aload_0
/*     */     //   53: getfield coreModWrapper : Lnet/minecraft/launchwrapper/ITweaker;
/*     */     //   56: aastore
/*     */     //   57: invokeinterface debug : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   62: iconst_0
/*     */     //   63: ireturn
/*     */     //   64: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   67: athrow
/*     */     //   68: ldc 'FMLDeobfTweaker'
/*     */     //   70: invokestatic isTweakerQueued : (Ljava/lang/String;)Z
/*     */     //   73: ifne -> 84
/*     */     //   76: iconst_1
/*     */     //   77: goto -> 85
/*     */     //   80: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   83: athrow
/*     */     //   84: iconst_0
/*     */     //   85: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 0
/*     */     //   #99	-> 6
/*     */     //   #82	-> 12
/*     */     //   #43	-> 41
/*     */     //   #110	-> 62
/*     */     //   #119	-> 68
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   12	23	26	java/lang/RuntimeException
/*     */     //   19	34	37	java/lang/RuntimeException
/*     */     //   30	64	64	java/lang/RuntimeException
/*     */     //   68	80	80	java/lang/RuntimeException }
/*     */   private static List<String> getIgnoredMods(Class<?> paramClass) throws IllegalAccessException, InvocationTargetException { Method method = null; try { method = paramClass.getDeclaredMethod(GlobalProperties.getString("mixin.launch.fml.ignoredmodsmethod", "getIgnoredMods"), new Class[0]); } catch (NoSuchMethodException noSuchMethodException) { try { method = paramClass.getDeclaredMethod("getLoadedCoremods", new Class[0]); } catch (NoSuchMethodException noSuchMethodException1) { MixinPlatformAgentAbstract.logger.catching(Level.DEBUG, noSuchMethodException1); return Collections.emptyList(); }  }  return (List<String>)method.invoke(null, new Object[0]); }
/*     */   private ITweaker initFMLCoreMod() { try { try { this.clCoreModManager = getCoreModManagerClass(); } catch (ClassNotFoundException classNotFoundException) { MixinPlatformAgentAbstract.logger.info("FML platform manager could not load class {}. Proceeding without FML support.", new Object[] { classNotFoundException.getMessage() }); return null; }  try { if ("true".equalsIgnoreCase(this.attributes.get("ForceLoadAsMod"))) { MixinPlatformAgentAbstract.logger.debug("ForceLoadAsMod was specified for {}, attempting force-load", new Object[] { this.fileName }); loadAsMod(); }  }
/*     */       catch (ClassNotFoundException classNotFoundException) { throw b(null); }
/* 121 */        return injectCorePlugin(); }
/*     */     catch (Exception exception)
/*     */     { MixinPlatformAgentAbstract.logger.catching(exception);
/*     */       return null; }
/*     */      }
/*     */ 
/*     */   
/*     */   public void inject() {
/*     */     try {
/*     */       if (this.coreModWrapper != null)
/*     */         try {
/*     */           if (checkForCoInitialisation()) {
/*     */             MixinPlatformAgentAbstract.logger.debug("FML agent is co-initiralising coremod instance {} for {}", new Object[] { this.coreModWrapper, this.uri });
/*     */             this.coreModWrapper.injectIntoClassLoader(Launch.classLoader);
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public String getPhaseProvider() {
/*     */     return MixinPlatformAgentFML.class.getName() + "$PhaseProvider";
/*     */   }
/*     */   
/*     */   private boolean isAlreadyInjected(String paramString) {
/*     */     try {
/*     */       if (loadedCoreMods.contains(paramString))
/*     */         return true; 
/*     */     } catch (Exception exception) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       List list = (List)GlobalProperties.get("Tweaks");
/*     */       if (list == null)
/*     */         return false; 
/*     */       for (ITweaker iTweaker : list)
/*     */         Class<?> clazz = iTweaker.getClass(); 
/*     */     } catch (Exception exception) {}
/*     */     return false;
/*     */   }
/*     */   
/*     */   private boolean isIgnoredReparseable() {
/*     */     return this.container.toString().contains("deobfedDeps");
/*     */   }
/*     */   
/*     */   private void addReparseableJar() {
/*     */     try {
/*     */       Method method = this.clCoreModManager.getDeclaredMethod(GlobalProperties.getString("mixin.launch.fml.reparseablecoremodsmethod", "getReparseableCoremods"), new Class[0]);
/*     */       List<String> list = (List)method.invoke(null, new Object[0]);
/*     */       try {
/*     */         if (!list.contains(this.fileName)) {
/*     */           MixinPlatformAgentAbstract.logger.debug("Adding {} to reparseable coremod collection", new Object[] { this.fileName });
/*     */           list.add(this.fileName);
/*     */         } 
/*     */       } catch (Exception exception) {
/*     */         throw b(null);
/*     */       } 
/*     */     } catch (Exception exception) {
/*     */       MixinPlatformAgentAbstract.logger.catching(exception);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void loadAsMod() {
/*     */     try {
/*     */       getIgnoredMods(this.clCoreModManager).remove(this.fileName);
/*     */     } catch (Exception exception) {
/*     */       MixinPlatformAgentAbstract.logger.catching(exception);
/*     */     } 
/*     */     try {
/*     */       if (this.attributes.get("FMLCorePluginContainsFMLMod") != null) {
/*     */         try {
/*     */           if (isIgnoredReparseable()) {
/*     */             MixinPlatformAgentAbstract.logger.debug("Ignoring request to add {} to reparseable coremod collection - it is a deobfuscated dependency", new Object[] { this.fileName });
/*     */             return;
/*     */           } 
/*     */         } catch (Exception exception) {
/*     */           throw b(null);
/*     */         } 
/*     */         addReparseableJar();
/*     */       } 
/*     */     } catch (Exception exception) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static {
/*     */     // Byte code:
/*     */     //   0: new java/util/HashSet
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: putstatic org/spongepowered/asm/launch/platform/MixinPlatformAgentFML.loadedCoreMods : Ljava/util/Set;
/*     */     //   10: ldc 'fml.coreMods.load'
/*     */     //   12: ldc ''
/*     */     //   14: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   17: ldc ','
/*     */     //   19: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
/*     */     //   22: astore_0
/*     */     //   23: aload_0
/*     */     //   24: arraylength
/*     */     //   25: istore_1
/*     */     //   26: iconst_0
/*     */     //   27: istore_2
/*     */     //   28: iload_2
/*     */     //   29: iload_1
/*     */     //   30: if_icmpge -> 85
/*     */     //   33: aload_0
/*     */     //   34: iload_2
/*     */     //   35: aaload
/*     */     //   36: astore_3
/*     */     //   37: aload_3
/*     */     //   38: invokevirtual isEmpty : ()Z
/*     */     //   41: ifne -> 79
/*     */     //   44: getstatic org/spongepowered/asm/launch/platform/MixinPlatformAgentAbstract.logger : Lorg/apache/logging/log4j/Logger;
/*     */     //   47: ldc 'FML platform agent will ignore coremod {} specified on the command line'
/*     */     //   49: iconst_1
/*     */     //   50: anewarray java/lang/Object
/*     */     //   53: dup
/*     */     //   54: iconst_0
/*     */     //   55: aload_3
/*     */     //   56: aastore
/*     */     //   57: invokeinterface debug : (Ljava/lang/String;[Ljava/lang/Object;)V
/*     */     //   62: getstatic org/spongepowered/asm/launch/platform/MixinPlatformAgentFML.loadedCoreMods : Ljava/util/Set;
/*     */     //   65: aload_3
/*     */     //   66: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   71: pop
/*     */     //   72: goto -> 79
/*     */     //   75: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   78: athrow
/*     */     //   79: iinc #2, 1
/*     */     //   82: goto -> 28
/*     */     //   85: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #4	-> 0
/*     */     //   #40	-> 10
/*     */     //   #50	-> 37
/*     */     //   #28	-> 44
/*     */     //   #26	-> 62
/*     */     //   #51	-> 79
/*     */     //   #89	-> 85
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   37	72	75	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MixinPlatformAgentFML.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */