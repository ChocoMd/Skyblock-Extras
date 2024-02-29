/*    */ package org.spongepowered.asm.lib;class Handler {
/*    */   Label start;
/*    */   Label end;
/*    */   Label handler;
/*    */   String desc;
/*    */   int type;
/*    */   Handler next;
/*    */   
/*    */   static Handler remove(Handler paramHandler, Label paramLabel1, Label paramLabel2) {
/*    */     try {
/* 11 */       if (paramHandler == null) {
/*    */         return null;
/*    */       }
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 20 */     paramHandler.next = remove(paramHandler.next, paramLabel1, paramLabel2); int i = paramHandler.start.position; int j = paramHandler.end.position; int k = paramLabel1.position; 
/*    */     try {  }
/*    */     catch (RuntimeException runtimeException)
/* 23 */     { throw b(null); }  int m = (paramLabel2 == null) ? Integer.MAX_VALUE : paramLabel2.position; try { if (k < j)
/*    */         try { if (m > i)
/* 25 */             try { if (k <= i) { if (m >= j) { paramHandler = paramHandler.next; }
/*    */                 else
/*    */                 { paramHandler.start = paramLabel2; }
/*    */                  }
/*    */               else
/*    */               { try {
/*    */                   if (m >= j) {
/*    */                     paramHandler.end = paramLabel1;
/*    */                   } else {
/*    */                     Handler handler = new Handler();
/*    */                     handler.start = paramLabel2;
/*    */                     handler.end = paramHandler.end;
/*    */                     handler.handler = paramHandler.handler;
/*    */                   } 
/*    */                 } catch (RuntimeException runtimeException) {
/*    */                   throw b(null);
/*    */                 }  }
/*    */                }
/*    */             catch (RuntimeException runtimeException)
/*    */             { throw b(null); }
/*    */               }
/*    */         catch (RuntimeException runtimeException)
/*    */         { throw b(null); }
/*    */           }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*    */     
/*    */     return paramHandler;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Handler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */