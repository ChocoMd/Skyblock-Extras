/*    */ package org.spongepowered.asm.launch;public final class GlobalProperties {
/*    */   public static <T> T get(String paramString, T paramT) {
/*  3 */     return (T)getService().getProperty(paramString, paramT);
/*    */   } private static IGlobalPropertyService service;
/*    */   public static String getString(String paramString1, String paramString2) {
/*  6 */     return getService().getPropertyString(paramString1, paramString2); } public static <T> T get(String paramString) {
/*  7 */     return (T)getService().getProperty(paramString);
/*    */   }
/*  9 */   public static void put(String paramString, Object paramObject) { getService().setProperty(paramString, paramObject); } private static IGlobalPropertyService getService() {
/* 10 */     if (service == null) {
/* 11 */       ServiceLoader<IGlobalPropertyService> serviceLoader = ServiceLoader.load(IGlobalPropertyService.class, GlobalProperties.class.getClassLoader());
/*    */       service = serviceLoader.iterator().next();
/*    */     } 
/*    */     return service;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\GlobalProperties.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */