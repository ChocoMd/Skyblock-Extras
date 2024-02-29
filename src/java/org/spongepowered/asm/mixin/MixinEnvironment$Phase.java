/*  1 */ package org.spongepowered.asm.mixin;public final class MixinEnvironment$Phase { public static final MixinEnvironment$Phase DEFAULT = new MixinEnvironment$Phase(2, "DEFAULT");
/*  2 */   public static MixinEnvironment$Phase forName(String paramString) { for (MixinEnvironment$Phase mixinEnvironment$Phase : phases) {
/*    */       
/*  4 */       try { if (mixinEnvironment$Phase.name.equals(paramString))
/*    */         {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 13 */           return mixinEnvironment$Phase; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*    */     
/* 15 */     }  return null; } static final MixinEnvironment$Phase NOT_INITIALISED = new MixinEnvironment$Phase(-1, "NOT_INITIALISED"); public static final MixinEnvironment$Phase PREINIT = new MixinEnvironment$Phase(0, "PREINIT");
/* 16 */   static final List<MixinEnvironment$Phase> phases = (List<MixinEnvironment$Phase>)ImmutableList.of(PREINIT, INIT, DEFAULT); public String toString() { return this.name; } public static final MixinEnvironment$Phase INIT = new MixinEnvironment$Phase(1, "INIT"); final int ordinal; final String name; private MixinEnvironment environment;
/*    */   private MixinEnvironment$Phase(int paramInt, String paramString) { this.ordinal = paramInt;
/* 18 */     this.name = paramString; } MixinEnvironment getEnvironment() {
/*    */     try {
/* 20 */       if (this.ordinal < 0)
/*    */         throw new IllegalArgumentException("Cannot access the NOT_INITIALISED environment"); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (this.environment == null)
/*    */         this.environment = new MixinEnvironment(this); 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.environment;
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$Phase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */