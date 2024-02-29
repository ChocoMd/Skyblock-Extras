/*    */ package org.spongepowered.asm.bridge;
/*    */ public final class RemapperAdapterFML extends RemapperAdapter { private static final String DEOBFUSCATING_REMAPPER_CLASS = "fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper"; private static final String DEOBFUSCATING_REMAPPER_CLASS_FORGE = "net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper";
/*    */   private static final String DEOBFUSCATING_REMAPPER_CLASS_LEGACY = "cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper";
/*    */   
/*    */   public static IRemapper create() { try {
/*  6 */       Class<?> clazz = getFMLDeobfuscatingRemapper();
/*  7 */       Field field = clazz.getDeclaredField("INSTANCE");
/*    */       
/*    */       Method method = clazz.getDeclaredMethod("unmap", new Class[] { String.class });
/*    */       
/* 11 */       Remapper remapper = (Remapper)field.get(null);
/*    */ 
/*    */       
/* 14 */       return new RemapperAdapterFML(remapper, method);
/*    */     
/*    */     }
/* 17 */     catch (Exception exception) {} exception.printStackTrace();
/* 18 */     return null; } private static final String INSTANCE_FIELD = "INSTANCE"; private static final String UNMAP_METHOD = "unmap"; private final Method mdUnmap; private RemapperAdapterFML(Remapper paramRemapper, Method paramMethod) { super(paramRemapper);
/*    */     this.logger.info("Initialised Mixin FML Remapper Adapter with {}", new Object[] { paramRemapper });
/*    */     this.mdUnmap = paramMethod; }
/*    */ 
/*    */   
/*    */   public String unmap(String paramString) {
/*    */     try {
/*    */       return this.mdUnmap.invoke(this.remapper, new Object[] { paramString }).toString();
/*    */     } catch (Exception exception) {
/*    */       return paramString;
/*    */     } 
/*    */   }
/*    */   
/*    */   private static Class<?> getFMLDeobfuscatingRemapper() throws ClassNotFoundException {
/*    */     try {
/*    */       return Class.forName("net.minecraftforge.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper");
/*    */     } catch (ClassNotFoundException classNotFoundException) {
/*    */       return Class.forName("cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper");
/*    */     } 
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\bridge\RemapperAdapterFML.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */