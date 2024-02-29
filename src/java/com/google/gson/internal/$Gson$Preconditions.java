/*   */ package com.google.gson.internal;
/*   */ 
/*   */ public final class $Gson$Preconditions {
/*   */   public static <T> T checkNotNull(T paramT) {
/*   */     
/* 6 */     try { if (paramT == null)
/* 7 */         throw new NullPointerException();  } catch (NullPointerException nullPointerException) { throw b(null); }  return paramT; } public static void checkArgument(boolean paramBoolean) { try { if (!paramBoolean)
/*   */         throw new IllegalArgumentException();  }
/*   */     catch (NullPointerException nullPointerException)
/*   */     { throw b(null); }
/*   */      }
/*   */ 
/*   */   
/*   */   private static NullPointerException b(NullPointerException paramNullPointerException) {
/*   */     return paramNullPointerException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\$Gson$Preconditions.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */