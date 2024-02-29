/*    */ package org.spongepowered.asm.mixin;
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
/*    */ public enum MixinEnvironment$CompatibilityLevel
/*    */ {
/* 18 */   JAVA_6(6, 50, false),
/*    */   
/* 20 */   JAVA_7(7, 51, false),
/* 21 */   JAVA_8(8, 52, true), JAVA_9(9, 53, true); MixinEnvironment$CompatibilityLevel(int paramInt1, int paramInt2, boolean paramBoolean) { this.ver = paramInt1; this.classVersion = paramInt2; this.supportsMethodsInInterfaces = paramBoolean; } public int classVersion() { return this.classVersion; }
/* 22 */   public boolean canElevateTo(MixinEnvironment$CompatibilityLevel paramMixinEnvironment$CompatibilityLevel) { try { if (paramMixinEnvironment$CompatibilityLevel != null) try { if (this.maxCompatibleLevel != null) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (paramMixinEnvironment$CompatibilityLevel.ver <= this.maxCompatibleLevel.ver); }  return true; } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return true; }
/* 23 */   boolean isSupported() { return true; } public boolean isAtLeast(MixinEnvironment$CompatibilityLevel paramMixinEnvironment$CompatibilityLevel) { try { if (paramMixinEnvironment$CompatibilityLevel != null) { try { if (this.ver >= paramMixinEnvironment$CompatibilityLevel.ver); } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }  } public boolean supportsMethodsInInterfaces() { return this.supportsMethodsInInterfaces; }
/* 24 */   public boolean canSupport(MixinEnvironment$CompatibilityLevel paramMixinEnvironment$CompatibilityLevel) { try { if (paramMixinEnvironment$CompatibilityLevel == null) return true;  } catch (RuntimeException runtimeException) { throw b(null); }  return paramMixinEnvironment$CompatibilityLevel.canElevateTo(this); } private void setMaxCompatibleLevel(MixinEnvironment$CompatibilityLevel paramMixinEnvironment$CompatibilityLevel) { this.maxCompatibleLevel = paramMixinEnvironment$CompatibilityLevel; } private static final MixinEnvironment$CompatibilityLevel[] $VALUES = new MixinEnvironment$CompatibilityLevel[] { JAVA_6, JAVA_7, JAVA_8, JAVA_9 };
/*    */   private static final int CLASS_V1_9 = 53;
/*    */   private final int ver;
/*    */   private final int classVersion;
/*    */   private final boolean supportsMethodsInInterfaces;
/*    */   private MixinEnvironment$CompatibilityLevel maxCompatibleLevel;
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$CompatibilityLevel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */