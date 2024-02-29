/*    */ package org.spongepowered.asm.lib;public final class Handle { final int tag; final String owner; final String name; final String desc;
/*    */   final boolean itf;
/*    */   
/*  4 */   public Handle(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { this.tag = paramInt;
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
/* 17 */     this.owner = paramString1;
/*    */     this.name = paramString2;
/* 19 */     this.desc = paramString3; this.itf = paramBoolean; } public String getOwner() { return this.owner; }
/*    */   public int getTag() { return this.tag; }
/*    */   public boolean equals(Object paramObject) { try { if (paramObject == this)
/* 22 */         return true;  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (!(paramObject instanceof Handle)) return false;  } catch (RuntimeException runtimeException) { throw b(null); }  Handle handle = (Handle)paramObject; try { if (this.tag == handle.tag) try { if (this.itf == handle.itf) try { if (this.owner.equals(handle.owner))
/*    */                 try { if (this.name.equals(handle.name))
/* 24 */                     try { if (this.desc.equals(handle.desc)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; } public String getDesc() { return this.desc; }
/*    */ 
/*    */   
/*    */   public String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.tag + (this.itf ? 64 : 0) + this.owner.hashCode() * this.name.hashCode() * this.desc.hashCode();
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.owner + '.' + this.name + this.desc + " (" + this.tag + (this.itf ? " itf" : "") + ')';
/*    */   }
/*    */   
/*    */   public boolean isInterface() {
/*    */     return this.itf;
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public Handle(int paramInt, String paramString1, String paramString2, String paramString3) {
/*    */     this(paramInt, paramString1, paramString2, paramString3, (paramInt == 9));
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Handle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */