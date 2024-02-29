/*    */ package org.spongepowered.asm.bridge;public abstract class RemapperAdapter implements IRemapper, ObfuscationUtil.IClassRemapper { public RemapperAdapter(Remapper paramRemapper) {
/*  2 */     this.remapper = paramRemapper;
/*    */   } public String mapMethodName(String paramString1, String paramString2, String paramString3) {
/*  4 */     this.logger.debug("{} is remapping method {}{} for {}", new Object[] { this, paramString2, paramString3, paramString1 });
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     String str1 = this.remapper.mapMethodName(paramString1, paramString2, paramString3);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try { if (!str1.equals(paramString2))
/* 24 */         return str1;  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */      String str2 = unmap(paramString1); String str3 = unmapDesc(paramString3); this.logger.debug("{} is remapping obfuscated method {}{} for {}", new Object[] { this, paramString2, str3, str2 });
/* 26 */     return this.remapper.mapMethodName(str2, paramString2, str3);
/*    */   }
/*    */   
/*    */   public String unmap(String paramString) {
/*    */     return paramString;
/*    */   }
/*    */   
/*    */   public String mapFieldName(String paramString1, String paramString2, String paramString3) {
/*    */     this.logger.debug("{} is remapping field {}{} for {}", new Object[] { this, paramString2, paramString3, paramString1 });
/*    */     String str1 = this.remapper.mapFieldName(paramString1, paramString2, paramString3);
/*    */     try {
/*    */       if (!str1.equals(paramString2))
/*    */         return str1; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     String str2 = unmap(paramString1);
/*    */     String str3 = unmapDesc(paramString3);
/*    */     this.logger.debug("{} is remapping obfuscated field {}{} for {}", new Object[] { this, paramString2, str3, str2 });
/*    */     return this.remapper.mapFieldName(str2, paramString2, str3);
/*    */   }
/*    */   
/*    */   protected final Logger logger = LogManager.getLogger("mixin");
/*    */   protected final Remapper remapper;
/*    */   
/*    */   public String map(String paramString) {
/*    */     this.logger.debug("{} is remapping class {}", new Object[] { this, paramString });
/*    */     return this.remapper.map(paramString);
/*    */   }
/*    */   
/*    */   public String unmapDesc(String paramString) {
/*    */     return ObfuscationUtil.unmapDescriptor(paramString, this);
/*    */   }
/*    */   
/*    */   public String mapDesc(String paramString) {
/*    */     return this.remapper.mapDesc(paramString);
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     return getClass().getSimpleName();
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\bridge\RemapperAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */