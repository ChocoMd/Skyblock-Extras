/*    */ package org.spongepowered.asm.lib.commons;
/*    */ 
/*    */ import org.spongepowered.asm.lib.Type;
/*    */ import org.spongepowered.asm.lib.signature.SignatureVisitor;
/*    */ import org.spongepowered.asm.lib.signature.SignatureWriter;
/*    */ 
/*    */ public abstract class Remapper {
/*    */   public String mapSignature(String paramString, boolean paramBoolean) { try {
/*  9 */       if (paramString == null) {
/*    */         return null;
/*    */       }
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
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
/* 44 */     SignatureReader signatureReader = new SignatureReader(paramString);
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
/* 73 */     SignatureWriter signatureWriter = new SignatureWriter(); SignatureVisitor signatureVisitor = createSignatureRemapper((SignatureVisitor)signatureWriter); try { if (paramBoolean) { signatureReader.acceptType(signatureVisitor); }
/*    */       else
/* 75 */       { signatureReader.accept(signatureVisitor); }  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/* 77 */      return signatureWriter.toString(); } public String[] mapTypes(String[] paramArrayOfString) { String[] arrayOfString = null; boolean bool = false;
/*    */     for (byte b = 0; b < paramArrayOfString.length; str = map((String)SYNTHETIC_LOCAL_VARIABLE_5)) {
/*    */       String str = paramArrayOfString[b];
/*    */       continue;
/*    */     } 
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return bool ? arrayOfString : paramArrayOfString; }
/*    */ 
/*    */   
/*    */   protected SignatureVisitor createSignatureRemapper(SignatureVisitor paramSignatureVisitor) {
/*    */     return createRemappingSignatureAdapter(paramSignatureVisitor);
/*    */   }
/*    */   
/*    */   public String mapMethodName(String paramString1, String paramString2, String paramString3) {
/*    */     return paramString2;
/*    */   }
/*    */   
/*    */   public String mapMethodDesc(String paramString) {
/*    */     try {
/*    */       if ("()V".equals(paramString))
/*    */         return paramString; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Type[] arrayOfType = Type.getArgumentTypes(paramString);
/*    */     StringBuilder stringBuilder = new StringBuilder("(");
/*    */     byte b = 0;
/*    */     try {
/*    */       while (b < arrayOfType.length) {
/*    */         stringBuilder.append(mapDesc(arrayOfType[b].getDescriptor()));
/*    */         b++;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     Type type = Type.getReturnType(paramString);
/*    */     try {
/*    */       if (type == Type.VOID_TYPE) {
/*    */         stringBuilder.append(")V");
/*    */         return stringBuilder.toString();
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     stringBuilder.append(')').append(mapDesc(type.getDescriptor()));
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public String mapDesc(String paramString) {
/*    */     String str1;
/*    */     byte b;
/*    */     String str2;
/*    */     Type type = Type.getType(paramString);
/*    */     switch (type.getSort()) {
/*    */       case 9:
/*    */         str1 = mapDesc(type.getElementType().getDescriptor());
/*    */         for (b = 0; b < type.getDimensions(); ) {
/*    */           str1 = '[' + str1;
/*    */           b++;
/*    */         } 
/*    */         return str1;
/*    */       case 10:
/*    */         str2 = map(type.getInternalName());
/*    */         try {
/*    */           if (str2 != null)
/*    */             return 'L' + str2 + ';'; 
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         break;
/*    */     } 
/*    */     return paramString;
/*    */   }
/*    */   
/*    */   public String map(String paramString) {
/*    */     return paramString;
/*    */   }
/*    */   
/*    */   public String mapFieldName(String paramString1, String paramString2, String paramString3) {
/*    */     return paramString2;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   protected SignatureVisitor createRemappingSignatureAdapter(SignatureVisitor paramSignatureVisitor) {
/*    */     return new SignatureRemapper(paramSignatureVisitor, this);
/*    */   }
/*    */   
/*    */   private Type mapType(Type paramType) {
/*    */     String str;
/*    */     byte b;
/*    */     switch (paramType.getSort()) {
/*    */       case 9:
/*    */         str = mapDesc(paramType.getElementType().getDescriptor());
/*    */         for (b = 0; b < paramType.getDimensions(); ) {
/*    */           str = '[' + str;
/*    */           b++;
/*    */         } 
/*    */         return Type.getType(str);
/*    */       case 10:
/*    */         str = map(paramType.getInternalName());
/*    */         try {
/*    */         
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         return (str != null) ? Type.getObjectType(str) : paramType;
/*    */       case 11:
/*    */         return Type.getMethodType(mapMethodDesc(paramType.getDescriptor()));
/*    */     } 
/*    */     return paramType;
/*    */   }
/*    */   
/*    */   public Object mapValue(Object paramObject) {
/*    */     try {
/*    */       if (paramObject instanceof Type)
/*    */         return mapType((Type)paramObject); 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     if (paramObject instanceof Handle)
/*    */       Handle handle = (Handle)paramObject; 
/*    */     return paramObject;
/*    */   }
/*    */   
/*    */   public String mapInvokeDynamicMethodName(String paramString1, String paramString2) {
/*    */     return paramString1;
/*    */   }
/*    */   
/*    */   public String mapType(String paramString) {
/*    */     try {
/*    */       if (paramString == null)
/*    */         return null; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return mapType(Type.getObjectType(paramString)).getInternalName();
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\commons\Remapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */