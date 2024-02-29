/* 1 */ package com.google.gson.stream;public final class MalformedJsonException extends IOException { public MalformedJsonException(String paramString, Throwable paramThrowable) { super(paramString);
/*   */ 
/*   */ 
/*   */ 
/*   */ 
/*   */     
/* 7 */     initCause(paramThrowable); } private static final long serialVersionUID = 1L; public MalformedJsonException(Throwable paramThrowable) {
/* 8 */     initCause(paramThrowable);
/*   */   }
/*   */   
/*   */   public MalformedJsonException(String paramString) {
/*   */     super(paramString);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\stream\MalformedJsonException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */