/*    */ package org.spongepowered.asm.launch.platform;
/*    */ import java.net.URI;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class MixinContainer {
/*    */   public void initPrimaryContainer() {
/*  8 */     for (IMixinPlatformAgent iMixinPlatformAgent : this.agents) {
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
/*    */ 
/*    */       
/* 40 */       this.logger.debug("Processing launch tasks for {}", new Object[] { iMixinPlatformAgent });
/*    */       iMixinPlatformAgent.initPrimaryContainer();
/*    */     } 
/*    */   }
/*    */   
/*    */   static { GlobalProperties.put("mixin.agents", agentClasses);
/*    */     for (String str : MixinService.getService().getPlatformAgents())
/* 47 */       agentClasses.add(str); 
/*    */     agentClasses.add("org.spongepowered.asm.launch.platform.MixinPlatformAgentDefault"); } public String getLaunchTarget() { for (IMixinPlatformAgent iMixinPlatformAgent : this.agents)
/* 49 */     { String str = iMixinPlatformAgent.getLaunchTarget(); try { if (str != null)
/* 50 */           return str;  } catch (RuntimeException runtimeException) { throw b(null); }  }  return null; } public MixinContainer(MixinPlatformManager paramMixinPlatformManager, URI paramURI) { this.uri = paramURI; for (String str : agentClasses) { try { Class<?> clazz = Class.forName(str); Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[] { MixinPlatformManager.class, URI.class }); this.logger.debug("Instancing new {} for {}", new Object[] { clazz.getSimpleName(), this.uri }); IMixinPlatformAgent iMixinPlatformAgent = (IMixinPlatformAgent)constructor.newInstance(new Object[] { paramMixinPlatformManager, paramURI }); this.agents.add(iMixinPlatformAgent); } catch (Exception exception) { this.logger.catching(exception); }  }
/* 51 */      } private final Logger logger = LogManager.getLogger("mixin"); private final List<IMixinPlatformAgent> agents = new ArrayList<IMixinPlatformAgent>(); private static final List<String> agentClasses = new ArrayList<String>(); public Collection<String> getPhaseProviders() { ArrayList<String> arrayList = new ArrayList(); for (IMixinPlatformAgent iMixinPlatformAgent : this.agents)
/*    */       String str = iMixinPlatformAgent.getPhaseProvider(); 
/*    */     return arrayList; }
/*    */ 
/*    */   
/*    */   private final URI uri;
/*    */   
/*    */   public void inject() {
/*    */     for (IMixinPlatformAgent iMixinPlatformAgent : this.agents) {
/*    */       this.logger.debug("Processing inject() for {}", new Object[] { iMixinPlatformAgent });
/*    */     } 
/*    */   }
/*    */   
/*    */   public URI getURI() {
/*    */     return this.uri;
/*    */   }
/*    */   
/*    */   public void prepare() {
/*    */     for (IMixinPlatformAgent iMixinPlatformAgent : this.agents) {
/*    */       this.logger.debug("Processing prepare() for {}", new Object[] { iMixinPlatformAgent });
/*    */       iMixinPlatformAgent.prepare();
/*    */     } 
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\launch\platform\MixinContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */