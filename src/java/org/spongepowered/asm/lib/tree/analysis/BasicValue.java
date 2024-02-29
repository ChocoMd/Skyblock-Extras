/*    */ package org.spongepowered.asm.lib.tree.analysis;public class BasicValue implements Value {
/*  2 */   public static final BasicValue LONG_VALUE = new BasicValue(Type.LONG_TYPE);
/*    */ 
/*    */   
/*  5 */   public static final BasicValue DOUBLE_VALUE = new BasicValue(Type.DOUBLE_TYPE);
/*  6 */   public static final BasicValue UNINITIALIZED_VALUE = new BasicValue(null); public int getSize() { 
/*  7 */     try { if (this.type != Type.LONG_TYPE) { try { if (this.type == Type.DOUBLE_TYPE); } catch (RuntimeException runtimeException) { throw b(null); }  return 1; }  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */      }
/*  9 */    public static final BasicValue INT_VALUE = new BasicValue(Type.INT_TYPE);
/*    */ 
/*    */ 
/*    */   
/* 13 */   public static final BasicValue REFERENCE_VALUE = new BasicValue(Type.getObjectType("java/lang/Object"));
/*    */ 
/*    */   
/* 16 */   public static final BasicValue RETURNADDRESS_VALUE = new BasicValue(Type.VOID_TYPE); public int hashCode() { try {  }
/* 17 */     catch (RuntimeException runtimeException) { throw b(null); }  return (this.type == null) ? 0 : this.type.hashCode(); }
/* 18 */    public static final BasicValue FLOAT_VALUE = new BasicValue(Type.FLOAT_TYPE); private final Type type; public boolean equals(Object paramObject) { 
/* 19 */     try { if (paramObject == this)
/*    */       {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 26 */         return true; }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (paramObject instanceof BasicValue) { try { if (this.type == null) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (((BasicValue)paramObject).type == null); }  } catch (RuntimeException runtimeException) { throw b(null); }  return this.type.equals(((BasicValue)paramObject).type); }
/*    */        }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/* 29 */      return false; }
/*    */ 
/*    */   
/*    */   public BasicValue(Type paramType) {
/*    */     this.type = paramType;
/*    */   }
/*    */   
/*    */   public Type getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   public boolean isReference() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield type : Lorg/spongepowered/asm/lib/Type;
/*    */     //   4: ifnull -> 53
/*    */     //   7: aload_0
/*    */     //   8: getfield type : Lorg/spongepowered/asm/lib/Type;
/*    */     //   11: invokevirtual getSort : ()I
/*    */     //   14: bipush #10
/*    */     //   16: if_icmpeq -> 45
/*    */     //   19: goto -> 26
/*    */     //   22: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   25: athrow
/*    */     //   26: aload_0
/*    */     //   27: getfield type : Lorg/spongepowered/asm/lib/Type;
/*    */     //   30: invokevirtual getSort : ()I
/*    */     //   33: bipush #9
/*    */     //   35: if_icmpne -> 53
/*    */     //   38: goto -> 45
/*    */     //   41: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   44: athrow
/*    */     //   45: iconst_1
/*    */     //   46: goto -> 54
/*    */     //   49: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   52: athrow
/*    */     //   53: iconst_0
/*    */     //   54: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 0
/*    */     //   #14	-> 11
/*    */     //   #30	-> 54
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	19	22	java/lang/RuntimeException
/*    */     //   7	38	41	java/lang/RuntimeException
/*    */     //   26	49	49	java/lang/RuntimeException
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     try {
/*    */       if (this == UNINITIALIZED_VALUE)
/*    */         return "."; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (this == RETURNADDRESS_VALUE)
/*    */         return "A"; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (this == REFERENCE_VALUE)
/*    */         return "R"; 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.type.getDescriptor();
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\BasicValue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */