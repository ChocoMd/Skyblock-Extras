/*   */ package org.spongepowered.asm.mixin.gen;
/*   */ 
/*   */ public abstract class AccessorGeneratorField extends AccessorGenerator {
/*   */   public AccessorGeneratorField(AccessorInfo paramAccessorInfo) {
/* 5 */     super(paramAccessorInfo);
/*   */     this.targetField = paramAccessorInfo.getTargetField();
/*   */     this.targetType = paramAccessorInfo.getTargetFieldType();
/*   */     this.isInstanceField = ((this.targetField.access & 0x8) == 0);
/*   */   }
/*   */   
/*   */   protected final FieldNode targetField;
/*   */   protected final Type targetType;
/*   */   protected final boolean isInstanceField;
/*   */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\mixin\gen\AccessorGeneratorField.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */