/*  1 */ package org.spongepowered.asm.lib.tree.analysis;class Subroutine { public Subroutine copy() { Subroutine subroutine = new Subroutine();
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
/* 23 */     subroutine.start = this.start;
/*    */     
/*    */     subroutine.access = new boolean[this.access.length];
/*    */     
/*    */     System.arraycopy(this.access, 0, subroutine.access, 0, this.access.length);
/* 28 */     subroutine.callers = new ArrayList<JumpInsnNode>(this.callers);
/*    */     return subroutine; }
/*    */ 
/*    */   
/*    */   LabelNode start;
/*    */   boolean[] access;
/*    */   List<JumpInsnNode> callers;
/*    */   
/*    */   private Subroutine() {}
/*    */   
/*    */   Subroutine(LabelNode paramLabelNode, int paramInt, JumpInsnNode paramJumpInsnNode) {
/*    */     this.start = paramLabelNode;
/*    */     this.access = new boolean[paramInt];
/*    */     this.callers = new ArrayList<JumpInsnNode>();
/*    */     this.callers.add(paramJumpInsnNode);
/*    */   }
/*    */   
/*    */   public boolean merge(Subroutine paramSubroutine) throws AnalyzerException {
/*    */     boolean bool = false;
/*    */     byte b = 0;
/*    */     while (true) {
/*    */       try {
/*    */         if (b < this.access.length) {
/*    */           try {
/*    */             if (paramSubroutine.access[b] && !this.access[b]) {
/*    */               this.access[b] = true;
/*    */               bool = true;
/*    */             } 
/*    */           } catch (AnalyzerException analyzerException) {
/*    */             throw b(null);
/*    */           } 
/*    */           b++;
/*    */           continue;
/*    */         } 
/*    */       } catch (AnalyzerException analyzerException) {
/*    */         throw b(null);
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     if (paramSubroutine.start == this.start)
/*    */       for (b = 0; b < paramSubroutine.callers.size(); ) {
/*    */         JumpInsnNode jumpInsnNode = paramSubroutine.callers.get(b);
/*    */         if (!this.callers.contains(jumpInsnNode)) {
/*    */           this.callers.add(jumpInsnNode);
/*    */           bool = true;
/*    */         } 
/*    */         b++;
/*    */       }  
/*    */     return bool;
/*    */   }
/*    */   
/*    */   private static AnalyzerException b(AnalyzerException paramAnalyzerException) {
/*    */     return paramAnalyzerException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\Subroutine.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */