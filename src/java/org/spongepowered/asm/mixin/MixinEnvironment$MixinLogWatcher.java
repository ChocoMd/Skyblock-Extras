/*    */ package org.spongepowered.asm.mixin;class MixinEnvironment$MixinLogWatcher {
/*  2 */   static Level oldLevel = null;
/*    */   static Logger log; private static RuntimeException b(RuntimeException paramRuntimeException) { return paramRuntimeException; } static void end() { 
/*  4 */     try { if (log != null)
/*    */       {
/*    */ 
/*    */ 
/*    */         
/*  9 */         log.removeAppender((Appender)appender); }  } catch (RuntimeException runtimeException) { throw b(null); }
/* 10 */      } static void begin() { Logger logger = LogManager.getLogger("FML"); try { if (!(logger instanceof Logger))
/*    */         return;  }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/* 14 */      log = (Logger)logger;
/*    */     oldLevel = log.getLevel();
/*    */     appender.start();
/*    */     log.addAppender((Appender)appender);
/*    */     log.setLevel(Level.ALL); }
/*    */ 
/*    */   
/*    */   static MixinEnvironment$MixinLogWatcher$MixinAppender appender = new MixinEnvironment$MixinLogWatcher$MixinAppender();
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\MixinEnvironment$MixinLogWatcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */