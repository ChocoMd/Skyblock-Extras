/*    */ package org.spongepowered.asm.lib;
/*    */ final class Item { int index; int type; int intVal; long longVal; String strVal1; String strVal2; String strVal3; int hashCode;
/*    */   Item next;
/*    */   
/*  5 */   void set(double paramDouble) { this.type = 6;
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
/* 20 */     this.longVal = Double.doubleToRawLongBits(paramDouble);
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
/* 48 */     this.hashCode = Integer.MAX_VALUE & this.type + (int)paramDouble; }
/*    */   void set(int paramInt1, int paramInt2) { this.type = 33; this.intVal = paramInt1; this.hashCode = paramInt2; } void set(int paramInt) { this.type = 3;
/* 50 */     this.intVal = paramInt;
/*    */     this.hashCode = Integer.MAX_VALUE & this.type + paramInt; }
/*    */   void set(int paramInt, String paramString1, String paramString2, String paramString3) { 
/*    */     try { this.type = paramInt;
/* 54 */       this.strVal1 = paramString1; this.strVal2 = paramString2; this.strVal3 = paramString3; switch (paramInt) { case 7: this.intVal = 0;
/*    */         case 1: case 8: case 16: case 30: this.hashCode = Integer.MAX_VALUE & paramInt + paramString1.hashCode(); return;
/* 56 */         case 12: this.hashCode = Integer.MAX_VALUE & paramInt + paramString1.hashCode() * paramString2.hashCode(); return; }  } catch (RuntimeException runtimeException) { throw b(null); }  this.hashCode = Integer.MAX_VALUE & paramInt + paramString1.hashCode() * paramString2.hashCode() * paramString3.hashCode(); } Item() {} void set(float paramFloat) { this.type = 4; this.intVal = Float.floatToRawIntBits(paramFloat); this.hashCode = Integer.MAX_VALUE & this.type + (int)paramFloat; }
/*    */ 
/*    */   
/*    */   Item(int paramInt) {
/*    */     this.index = paramInt;
/*    */   }
/*    */   
/*    */   void set(String paramString1, String paramString2, int paramInt) {
/*    */     this.type = 18;
/*    */     this.longVal = paramInt;
/*    */     this.strVal1 = paramString1;
/* 67 */     this.strVal2 = paramString2; this.hashCode = Integer.MAX_VALUE & 18 + paramInt * this.strVal1.hashCode() * this.strVal2.hashCode(); } boolean isEqualTo(Item paramItem) { try { switch (this.type) { case 1: case 7: case 8: case 16: case 30: return paramItem.strVal1.equals(this.strVal1);case 5: case 6: case 32: try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (paramItem.longVal == this.longVal);case 3: case 4: try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (paramItem.intVal == this.intVal);case 31: try { if (paramItem.intVal == this.intVal)
/* 68 */               try { if (paramItem.strVal1.equals(this.strVal1)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false;case 12: try { if (paramItem.strVal1.equals(this.strVal1)) try { if (paramItem.strVal2.equals(this.strVal2)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false;
/*    */         case 18:
/*    */           try {
/*    */             if (paramItem.longVal == this.longVal)
/*    */               try {
/*    */                 if (paramItem.strVal1.equals(this.strVal1))
/*    */                   try {
/*    */                     if (paramItem.strVal2.equals(this.strVal2));
/*    */                   } catch (RuntimeException runtimeException) {
/*    */                     throw b(null);
/*    */                   }  
/*    */               } catch (RuntimeException runtimeException) {
/*    */                 throw b(null);
/*    */               }  
/*    */           } catch (RuntimeException runtimeException) {
/*    */             throw b(null);
/*    */           } 
/*    */           return false; }
/*    */        }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*    */     
/*    */     try {
/*    */       if (paramItem.strVal1.equals(this.strVal1))
/*    */         try {
/*    */           if (paramItem.strVal2.equals(this.strVal2))
/*    */             try {
/*    */               if (paramItem.strVal3.equals(this.strVal3));
/*    */             } catch (RuntimeException runtimeException) {
/*    */               throw b(null);
/*    */             }  
/*    */         } catch (RuntimeException runtimeException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false; }
/*    */ 
/*    */   
/*    */   Item(int paramInt, Item paramItem) {
/*    */     this.index = paramInt;
/*    */     this.type = paramItem.type;
/*    */     this.intVal = paramItem.intVal;
/*    */     this.longVal = paramItem.longVal;
/*    */     this.strVal1 = paramItem.strVal1;
/*    */     this.strVal2 = paramItem.strVal2;
/*    */     this.strVal3 = paramItem.strVal3;
/*    */     this.hashCode = paramItem.hashCode;
/*    */   }
/*    */   
/*    */   void set(long paramLong) {
/*    */     this.type = 5;
/*    */     this.longVal = paramLong;
/*    */     this.hashCode = Integer.MAX_VALUE & this.type + (int)paramLong;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Item.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */