/*   */ package org.spongepowered.asm.lib.tree;
/*   */ public class TypeAnnotationNode extends AnnotationNode { public int typeRef;
/* 3 */   public TypeAnnotationNode(int paramInt1, int paramInt2, TypePath paramTypePath, String paramString) { super(paramInt1, paramString);
/*   */ 
/*   */ 
/*   */     
/* 7 */     this.typeRef = paramInt2; this.typePath = paramTypePath; } public TypePath typePath; public TypeAnnotationNode(int paramInt, TypePath paramTypePath, String paramString) { this(327680, paramInt, paramTypePath, paramString); if (getClass() != TypeAnnotationNode.class)
/* 8 */       throw new IllegalStateException();  }
/*   */    }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\TypeAnnotationNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */