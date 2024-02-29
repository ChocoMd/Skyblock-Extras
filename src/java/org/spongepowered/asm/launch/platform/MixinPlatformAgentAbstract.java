/*   */ package org.spongepowered.asm.launch.platform;
/*   */ 
/*   */ import java.io.File;
/*   */ import java.net.URI;
/*   */ import org.apache.logging.log4j.Logger;
/*   */ 
/*   */ public abstract class MixinPlatformAgentAbstract implements IMixinPlatformAgent {
/* 8 */   public MixinPlatformAgentAbstract(MixinPlatformManager paramMixinPlatformManager, URI paramURI) { this.manager = paramMixinPlatformManager; this.uri = paramURI; this.container = (this.uri != null) ? new File(this.uri) : null;
/* 9 */     this.attributes = MainAttributes.of(paramURI); } public String getPhaseProvider() { return null; }
/*   */ 
/*   */   
/*   */   protected static final Logger logger = LogManager.getLogger("mixin");
/*   */   protected final MixinPlatformManager manager;
/*   */   protected final URI uri;
/*   */   protected final File container;
/*   */   protected final MainAttributes attributes;
/*   */   
/*   */   public String toString() {
/*   */     return String.format("PlatformAgent[%s:%s]", new Object[] { getClass().getSimpleName(), this.uri });
/*   */   }
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MixinPlatformAgentAbstract.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */