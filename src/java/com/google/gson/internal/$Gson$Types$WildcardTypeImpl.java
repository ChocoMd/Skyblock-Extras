/*    */ package com.google.gson.internal;
/*    */ import java.lang.reflect.Type;
/*    */ 
/*    */ final class $Gson$Types$WildcardTypeImpl implements WildcardType, Serializable {
/*    */   public String toString() {
/*    */     
/*  7 */     try { if (this.lowerBound != null)
/*    */       {
/*    */         
/* 10 */         return "? super " + $Gson$Types.typeToString(this.lowerBound); }  } catch (RuntimeException runtimeException) { throw b(null); }
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
/*    */     try { if (this.upperBound == Object.class)
/* 23 */         return "?";  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */     
/*    */     return "? extends " + $Gson$Types.typeToString(this.upperBound);
/*    */   }
/*    */   
/*    */   private final Type upperBound;
/*    */   private final Type lowerBound;
/*    */   private static final long serialVersionUID = 0L;
/*    */   
/*    */   public Type[] getLowerBounds() {
/*    */     try {
/*    */       (new Type[1])[0] = this.lowerBound;
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.lowerBound != null) ? new Type[1] : $Gson$Types.EMPTY_TYPE_ARRAY;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return ((this.lowerBound != null) ? (31 + this.lowerBound.hashCode()) : 1) ^ 31 + this.upperBound.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     try {
/*    */       if (paramObject instanceof WildcardType)
/*    */         try {
/*    */           if ($Gson$Types.equals(this, (WildcardType)paramObject));
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public $Gson$Types$WildcardTypeImpl(Type[] paramArrayOfType1, Type[] paramArrayOfType2) {
/*    */     try {
/*    */       $Gson$Preconditions.checkArgument((paramArrayOfType2.length <= 1));
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       $Gson$Preconditions.checkArgument((paramArrayOfType1.length == 1));
/*    */       if (paramArrayOfType2.length == 1) {
/*    */         try {
/*    */           $Gson$Preconditions.checkNotNull(paramArrayOfType2[0]);
/*    */           $Gson$Types.access$000(paramArrayOfType2[0]);
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         } 
/*    */         $Gson$Preconditions.checkArgument((paramArrayOfType1[0] == Object.class));
/*    */         this.lowerBound = $Gson$Types.canonicalize(paramArrayOfType2[0]);
/*    */         this.upperBound = Object.class;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     $Gson$Preconditions.checkNotNull(paramArrayOfType1[0]);
/*    */     $Gson$Types.access$000(paramArrayOfType1[0]);
/*    */     this.lowerBound = null;
/*    */     this.upperBound = $Gson$Types.canonicalize(paramArrayOfType1[0]);
/*    */   }
/*    */   
/*    */   public Type[] getUpperBounds() {
/*    */     return new Type[] { this.upperBound };
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\$Gson$Types$WildcardTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */