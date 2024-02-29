/*    */ package org.spongepowered.asm.lib.commons;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ public class SimpleRemapper
/*    */   extends Remapper
/*    */ {
/*    */   private final Map<String, String> mapping;
/*    */   
/*    */   public SimpleRemapper(String paramString1, String paramString2) {
/* 13 */     this.mapping = Collections.singletonMap(paramString1, paramString2);
/*    */   }
/*    */   
/*    */   public SimpleRemapper(Map<String, String> paramMap) {
/*    */     this.mapping = paramMap;
/*    */   }
/*    */   
/*    */   public String mapMethodName(String paramString1, String paramString2, String paramString3) {
/*    */     String str = map(paramString1 + '.' + paramString2 + paramString3);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return (str == null) ? paramString2 : str;
/*    */   }
/*    */   
/*    */   public String mapInvokeDynamicMethodName(String paramString1, String paramString2) {
/*    */     String str = map('.' + paramString1 + paramString2);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return (str == null) ? paramString1 : str;
/*    */   }
/*    */   
/*    */   public String mapFieldName(String paramString1, String paramString2, String paramString3) {
/*    */     String str = map(paramString1 + '.' + paramString2);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */     return (str == null) ? paramString2 : str;
/*    */   }
/*    */   
/*    */   public String map(String paramString) {
/*    */     return this.mapping.get(paramString);
/*    */   }
/*    */   
/*    */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\SimpleRemapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */