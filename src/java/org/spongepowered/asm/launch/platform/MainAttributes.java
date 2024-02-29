/*  1 */ package org.spongepowered.asm.launch.platform;final class MainAttributes { private static final Map<URI, MainAttributes> instances = new HashMap<URI, MainAttributes>(); protected final Attributes attributes;
/*    */   
/*    */   public static MainAttributes of(File paramFile) {
/*  4 */     return of(paramFile.toURI());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static MainAttributes of(URI paramURI) {
/* 15 */     MainAttributes mainAttributes = instances.get(paramURI);
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
/*    */     if (mainAttributes == null) {
/* 38 */       mainAttributes = new MainAttributes(new File(paramURI));
/* 39 */       instances.put(paramURI, mainAttributes);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 46 */     return mainAttributes;
/*    */   }
/*    */   
/*    */   private MainAttributes() {
/*    */     this.attributes = new Attributes();
/*    */   }
/*    */   
/*    */   private static Attributes getAttributes(File paramFile) {
/*    */     try {
/*    */       if (paramFile == null)
/*    */         return null; 
/*    */     } catch (IOException iOException) {
/*    */       throw b(null);
/*    */     } 
/*    */     JarFile jarFile = null;
/*    */     try {
/*    */       jarFile = new JarFile(paramFile);
/*    */       Manifest manifest = jarFile.getManifest();
/*    */       if (manifest != null) {
/*    */         Attributes attributes = manifest.getMainAttributes();
/*    */         try {
/*    */           try {
/*    */             if (jarFile != null)
/*    */               jarFile.close(); 
/*    */           } catch (RuntimeException runtimeException) {
/*    */             throw b(null);
/*    */           } 
/*    */         } catch (IOException iOException) {}
/*    */       } 
/*    */     } catch (IOException iOException) {
/*    */       try {
/*    */         try {
/*    */           if (jarFile != null)
/*    */             jarFile.close(); 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } catch (IOException iOException1) {}
/*    */     } finally {
/*    */       try {
/*    */         try {
/*    */           if (jarFile != null)
/*    */             jarFile.close(); 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } catch (IOException iOException) {}
/*    */     } 
/*    */     return new Attributes();
/*    */   }
/*    */   
/*    */   public final String get(String paramString) {
/*    */     try {
/*    */       if (this.attributes != null)
/*    */         return this.attributes.getValue(paramString); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   private MainAttributes(File paramFile) {
/*    */     this.attributes = getAttributes(paramFile);
/*    */   }
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MainAttributes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */