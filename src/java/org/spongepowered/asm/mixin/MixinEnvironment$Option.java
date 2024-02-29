/*    */ package org.spongepowered.asm.mixin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum MixinEnvironment$Option
/*    */ {
/*  8 */   DEBUG_ALL("debug"),
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 71 */   DEBUG_EXPORT(DEBUG_ALL, "export"),
/*    */ 
/*    */   
/*    */   DEBUG_EXPORT_FILTER(DEBUG_EXPORT, "filter", false),
/*    */   
/*    */   DEBUG_EXPORT_DECOMPILE(DEBUG_EXPORT, MixinEnvironment$Option$Inherit.ALLOW_OVERRIDE, "decompile"),
/*    */   
/*    */   DEBUG_EXPORT_DECOMPILE_THREADED(DEBUG_EXPORT_DECOMPILE, MixinEnvironment$Option$Inherit.ALLOW_OVERRIDE, "async"),
/*    */   
/*    */   DEBUG_EXPORT_DECOMPILE_MERGESIGNATURES(DEBUG_EXPORT_DECOMPILE, MixinEnvironment$Option$Inherit.ALLOW_OVERRIDE, "mergeGenericSignatures"),
/*    */   
/*    */   DEBUG_VERIFY(DEBUG_ALL, "verify"),
/*    */   
/* 84 */   DEBUG_VERBOSE(DEBUG_ALL, "verbose"),
/*    */   DEBUG_INJECTORS(DEBUG_ALL, "countInjections"),
/*    */   DEBUG_STRICT(DEBUG_ALL, MixinEnvironment$Option$Inherit.INDEPENDENT, "strict"),
/*    */   DEBUG_UNIQUE(DEBUG_STRICT, "unique"),
/*    */   DEBUG_TARGETS(DEBUG_STRICT, "targets"),
/*    */   DEBUG_PROFILER(DEBUG_ALL, MixinEnvironment$Option$Inherit.ALLOW_OVERRIDE, "profiler"),
/*    */   DUMP_TARGET_ON_FAILURE("dumpTargetOnFailure"),
/*    */   CHECK_ALL("checks"),
/*    */   CHECK_IMPLEMENTS(CHECK_ALL, "interfaces"),
/*    */   CHECK_IMPLEMENTS_STRICT(CHECK_IMPLEMENTS, MixinEnvironment$Option$Inherit.ALLOW_OVERRIDE, "strict"),
/*    */   IGNORE_CONSTRAINTS("ignoreConstraints"),
/*    */   HOT_SWAP("hotSwap"),
/*    */   ENVIRONMENT(MixinEnvironment$Option$Inherit.ALWAYS_FALSE, "env"),
/*    */   OBFUSCATION_TYPE(ENVIRONMENT, MixinEnvironment$Option$Inherit.ALWAYS_FALSE, "obf"),
/*    */   DISABLE_REFMAP(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "disableRefMap"),
/*    */   REFMAP_REMAP(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "remapRefMap"),
/*    */   REFMAP_REMAP_RESOURCE(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "refMapRemappingFile", ""),
/*    */   REFMAP_REMAP_SOURCE_ENV(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "refMapRemappingEnv", "searge"),
/*    */   REFMAP_REMAP_ALLOW_PERMISSIVE(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "allowPermissiveMatch", true, "true"),
/*    */   IGNORE_REQUIRED(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "ignoreRequired"),
/*    */   DEFAULT_COMPATIBILITY_LEVEL(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "compatLevel"),
/*    */   SHIFT_BY_VIOLATION_BEHAVIOUR(ENVIRONMENT, MixinEnvironment$Option$Inherit.INDEPENDENT, "shiftByViolation", "warn"),
/*    */   INITIALISER_INJECTION_MODE("initialiserInjectionMode", "default");
/*    */   
/*    */   MixinEnvironment$Option(MixinEnvironment$Option paramMixinEnvironment$Option, MixinEnvironment$Option$Inherit paramMixinEnvironment$Option$Inherit, String paramString1, boolean paramBoolean, String paramString2) {
/*    */     this.parent = paramMixinEnvironment$Option;
/*    */     this.inheritance = paramMixinEnvironment$Option$Inherit;
/*    */     this.property = ((paramMixinEnvironment$Option != null) ? paramMixinEnvironment$Option.property : "mixin") + "." + paramString1;
/*    */     this.defaultValue = paramString2;
/*    */     this.isFlag = paramBoolean;
/*    */     byte b = 0;
/*    */     for (; paramMixinEnvironment$Option != null; b++)
/*    */       paramMixinEnvironment$Option = paramMixinEnvironment$Option.parent; 
/*    */     this.depth = b;
/*    */   }
/*    */   
/*    */   MixinEnvironment$Option getParent() {
/*    */     return this.parent;
/*    */   }
/*    */   
/*    */   private boolean getLocalBooleanValue(boolean paramBoolean) {
/*    */     return Boolean.parseBoolean(System.getProperty(this.property, Boolean.toString(paramBoolean)));
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     try {
/*    */     
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.isFlag ? String.valueOf(getBooleanValue()) : getStringValue();
/*    */   }
/*    */   
/*    */   final boolean getBooleanValue() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield inheritance : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   4: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit.ALWAYS_FALSE : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   7: if_acmpne -> 16
/*    */     //   10: iconst_0
/*    */     //   11: ireturn
/*    */     //   12: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   15: athrow
/*    */     //   16: aload_0
/*    */     //   17: iconst_0
/*    */     //   18: invokespecial getLocalBooleanValue : (Z)Z
/*    */     //   21: istore_1
/*    */     //   22: aload_0
/*    */     //   23: getfield inheritance : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   26: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit.INDEPENDENT : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   29: if_acmpne -> 38
/*    */     //   32: iload_1
/*    */     //   33: ireturn
/*    */     //   34: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   37: athrow
/*    */     //   38: iload_1
/*    */     //   39: ifne -> 56
/*    */     //   42: aload_0
/*    */     //   43: invokespecial getInheritedBooleanValue : ()Z
/*    */     //   46: ifeq -> 64
/*    */     //   49: goto -> 56
/*    */     //   52: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   55: athrow
/*    */     //   56: iconst_1
/*    */     //   57: goto -> 65
/*    */     //   60: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   63: athrow
/*    */     //   64: iconst_0
/*    */     //   65: istore_2
/*    */     //   66: aload_0
/*    */     //   67: getfield inheritance : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   70: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit.INHERIT : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   73: if_acmpne -> 84
/*    */     //   76: iload_2
/*    */     //   77: goto -> 89
/*    */     //   80: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   83: athrow
/*    */     //   84: aload_0
/*    */     //   85: iload_2
/*    */     //   86: invokespecial getLocalBooleanValue : (Z)Z
/*    */     //   89: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #43	-> 10
/*    */     //   #75	-> 16
/*    */     //   #22	-> 22
/*    */     //   #60	-> 32
/*    */     //   #63	-> 38
/*    */     //   #45	-> 66
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	12	12	java/lang/IllegalArgumentException
/*    */     //   22	34	34	java/lang/IllegalArgumentException
/*    */     //   38	49	52	java/lang/IllegalArgumentException
/*    */     //   42	60	60	java/lang/IllegalArgumentException
/*    */     //   66	80	80	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private boolean getInheritedBooleanValue() {
/*    */     try {
/*    */       if (this.parent != null)
/*    */         try {
/*    */           if (this.parent.getBooleanValue());
/*    */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   <E extends Enum<E>> E getEnumValue(E paramE) {
/*    */     String str = System.getProperty(this.property, paramE.name());
/*    */     try {
/*    */       return Enum.valueOf((Class)paramE.getClass(), str.toUpperCase());
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       return paramE;
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final MixinEnvironment$Option[] $VALUES = new MixinEnvironment$Option[] { 
/*    */       DEBUG_ALL, DEBUG_EXPORT, DEBUG_EXPORT_FILTER, DEBUG_EXPORT_DECOMPILE, DEBUG_EXPORT_DECOMPILE_THREADED, DEBUG_EXPORT_DECOMPILE_MERGESIGNATURES, DEBUG_VERIFY, DEBUG_VERBOSE, DEBUG_INJECTORS, DEBUG_STRICT, 
/*    */       DEBUG_UNIQUE, DEBUG_TARGETS, DEBUG_PROFILER, DUMP_TARGET_ON_FAILURE, CHECK_ALL, CHECK_IMPLEMENTS, CHECK_IMPLEMENTS_STRICT, IGNORE_CONSTRAINTS, HOT_SWAP, ENVIRONMENT, 
/*    */       OBFUSCATION_TYPE, DISABLE_REFMAP, REFMAP_REMAP, REFMAP_REMAP_RESOURCE, REFMAP_REMAP_SOURCE_ENV, REFMAP_REMAP_ALLOW_PERMISSIVE, IGNORE_REQUIRED, DEFAULT_COMPATIBILITY_LEVEL, SHIFT_BY_VIOLATION_BEHAVIOUR, INITIALISER_INJECTION_MODE };
/*    */   
/*    */   String getProperty() {
/*    */     return this.property;
/*    */   }
/*    */   
/*    */   final String getStringValue() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield inheritance : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   4: getstatic org/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit.INDEPENDENT : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option$Inherit;
/*    */     //   7: if_acmpeq -> 41
/*    */     //   10: aload_0
/*    */     //   11: getfield parent : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*    */     //   14: ifnull -> 41
/*    */     //   17: goto -> 24
/*    */     //   20: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   23: athrow
/*    */     //   24: aload_0
/*    */     //   25: getfield parent : Lorg/spongepowered/asm/mixin/MixinEnvironment$Option;
/*    */     //   28: invokevirtual getBooleanValue : ()Z
/*    */     //   31: ifeq -> 59
/*    */     //   34: goto -> 41
/*    */     //   37: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   40: athrow
/*    */     //   41: aload_0
/*    */     //   42: getfield property : Ljava/lang/String;
/*    */     //   45: aload_0
/*    */     //   46: getfield defaultValue : Ljava/lang/String;
/*    */     //   49: invokestatic getProperty : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   52: goto -> 63
/*    */     //   55: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*    */     //   58: athrow
/*    */     //   59: aload_0
/*    */     //   60: getfield defaultValue : Ljava/lang/String;
/*    */     //   63: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #69	-> 0
/*    */     //   #33	-> 49
/*    */     //   #51	-> 63
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	17	20	java/lang/IllegalArgumentException
/*    */     //   10	34	37	java/lang/IllegalArgumentException
/*    */     //   24	55	55	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   private static final String PREFIX = "mixin";
/*    */   final MixinEnvironment$Option parent;
/*    */   final MixinEnvironment$Option$Inherit inheritance;
/*    */   final String property;
/*    */   final String defaultValue;
/*    */   final boolean isFlag;
/*    */   final int depth;
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$Option.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */