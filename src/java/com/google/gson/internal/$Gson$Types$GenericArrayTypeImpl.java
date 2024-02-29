/* 1 */ package com.google.gson.internal;final class $Gson$Types$GenericArrayTypeImpl implements GenericArrayType, Serializable { private final Type componentType; public String toString() { return $Gson$Types.typeToString(this.componentType) + "[]"; }
/*   */    private static final long serialVersionUID = 0L; public int hashCode() {
/* 3 */     return this.componentType.hashCode(); } public $Gson$Types$GenericArrayTypeImpl(Type paramType) {
/*   */     this.componentType = $Gson$Types.canonicalize(paramType);
/*   */   }
/* 6 */   public Type getGenericComponentType() { return this.componentType; } public boolean equals(Object paramObject) { 
/* 7 */     try { if (paramObject instanceof GenericArrayType) try { if ($Gson$Types.equals(this, (GenericArrayType)paramObject)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }
/*   */ 
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\$Gson$Types$GenericArrayTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */