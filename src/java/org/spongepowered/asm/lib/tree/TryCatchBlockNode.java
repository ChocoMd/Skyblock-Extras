/*    */ package org.spongepowered.asm.lib.tree;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.spongepowered.asm.lib.MethodVisitor;
/*    */ 
/*    */ 
/*    */ public class TryCatchBlockNode
/*    */ {
/*    */   public LabelNode start;
/*    */   public LabelNode end;
/*    */   public LabelNode handler;
/*    */   public String type;
/*    */   public List<TypeAnnotationNode> visibleTypeAnnotations;
/*    */   public List<TypeAnnotationNode> invisibleTypeAnnotations;
/*    */   
/*    */   public TryCatchBlockNode(LabelNode paramLabelNode1, LabelNode paramLabelNode2, LabelNode paramLabelNode3, String paramString) {
/* 17 */     this.start = paramLabelNode1;
/*    */ 
/*    */     
/*    */     this.end = paramLabelNode2;
/*    */ 
/*    */     
/*    */     this.handler = paramLabelNode3;
/*    */     
/* 25 */     this.type = paramString; } public void accept(MethodVisitor paramMethodVisitor) {
/*    */     
/* 27 */     try { if (this.handler == null) {  } else {  }  } catch (RuntimeException runtimeException) { throw b(null); }  try { paramMethodVisitor.visitTryCatchBlock(this.start.getLabel(), this.end.getLabel(), this.handler.getLabel(), this.type); }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*    */      byte b1 = (this.visibleTypeAnnotations == null) ? 0 : this.visibleTypeAnnotations.size();
/*    */     byte b2;
/* 32 */     for (b2 = 0; b2 < b1; b2++) {
/*    */       TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(b2);
/*    */       typeAnnotationNode.accept(paramMethodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true));
/*    */     } 
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     b1 = (this.invisibleTypeAnnotations == null) ? 0 : this.invisibleTypeAnnotations.size();
/*    */     for (b2 = 0; b2 < b1; ) {
/*    */       TypeAnnotationNode typeAnnotationNode = this.invisibleTypeAnnotations.get(b2);
/*    */       typeAnnotationNode.accept(paramMethodVisitor.visitTryCatchAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, false));
/*    */       b2++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public void updateIndex(int paramInt) {
/*    */     int i = 0x42000000 | paramInt << 8;
/*    */     if (this.visibleTypeAnnotations != null)
/*    */       for (TypeAnnotationNode typeAnnotationNode : this.visibleTypeAnnotations)
/*    */         typeAnnotationNode.typeRef = i;  
/*    */     if (this.invisibleTypeAnnotations != null)
/*    */       for (TypeAnnotationNode typeAnnotationNode : this.invisibleTypeAnnotations)
/*    */         typeAnnotationNode.typeRef = i;  
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\TryCatchBlockNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */