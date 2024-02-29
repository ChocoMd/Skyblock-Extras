/*   */ package org.spongepowered.asm.mixin;
/*   */ 
/*   */ class MixinEnvironment$MixinLogWatcher$MixinAppender extends AbstractAppender {
/* 4 */   MixinEnvironment$MixinLogWatcher$MixinAppender() { super("MixinLogWatcherAppender", null, null); } public void append(LogEvent paramLogEvent) { try {
/* 5 */       if (paramLogEvent.getLevel() == Level.DEBUG) try { if ("Validating minecraft".equals(paramLogEvent.getMessage().getFormattedMessage())) { 
/* 6 */             try { MixinEnvironment.gotoPhase(MixinEnvironment$Phase.INIT); if (MixinEnvironment$MixinLogWatcher.log.getLevel() == Level.ALL)
/* 7 */                 MixinEnvironment$MixinLogWatcher.log.setLevel(MixinEnvironment$MixinLogWatcher.oldLevel);  } catch (RuntimeException runtimeException) { throw b(null); }
/*   */             
/*   */             return; }
/*   */           
/*   */           return; }
/*   */         catch (RuntimeException runtimeException)
/*   */         { throw b(null); }
/*   */          
/*   */     } catch (RuntimeException runtimeException) {
/*   */       throw b(null);
/*   */     }  }
/*   */ 
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$MixinLogWatcher$MixinAppender.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */