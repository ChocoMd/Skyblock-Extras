/*    */ package com.google.gson;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum FieldNamingPolicy
/*    */   implements FieldNamingStrategy
/*    */ {
/*  9 */   IDENTITY,
/*    */ 
/*    */ 
/*    */   
/* 13 */   UPPER_CAMEL_CASE,
/*    */   
/* 15 */   UPPER_CAMEL_CASE_WITH_SPACES,
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
/* 31 */   LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES;
/*    */   private static final FieldNamingPolicy[] $VALUES = new FieldNamingPolicy[] { IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES }; private static String modifyString(char paramChar, String paramString, int paramInt) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (paramInt < paramString.length()) ? (paramChar + paramString.substring(paramInt)) : String.valueOf(paramChar); } private static String upperCaseFirstLetter(String paramString) { StringBuilder stringBuilder = new StringBuilder(); byte b = 0; char c = paramString.charAt(b); while (true) { try { if (b < paramString.length() - 1) { try { if (Character.isLetter(c))
/* 33 */               break;  } catch (RuntimeException runtimeException) { throw b(null); }
/* 34 */            stringBuilder.append(c); c = paramString.charAt(++b); continue; }  } catch (RuntimeException runtimeException) { throw b(null); }  break; }  try { if (b == paramString.length())
/* 35 */         return stringBuilder.toString();  } catch (RuntimeException runtimeException) { throw b(null); }  if (!Character.isUpperCase(c)) { String str = modifyString(Character.toUpperCase(c), paramString, ++b); return stringBuilder.append(str).toString(); }  return paramString; } private static String separateCamelCase(String paramString1, String paramString2) { StringBuilder stringBuilder = new StringBuilder(); for (byte b = 0; b < paramString1.length(); stringBuilder.append(c), b++) { char c = paramString1.charAt(b); try { if (Character.isUpperCase(c)) try { if (stringBuilder.length() != 0) stringBuilder.append(paramString2);  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }
/*    */        }
/*    */     
/*    */     return stringBuilder.toString(); }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\FieldNamingPolicy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */