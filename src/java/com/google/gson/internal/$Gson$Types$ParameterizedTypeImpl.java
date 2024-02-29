/*    */ package com.google.gson.internal;
/*    */ final class $Gson$Types$ParameterizedTypeImpl implements ParameterizedType, Serializable { private final Type ownerType; private final Type rawType; private final Type[] typeArguments; private static final long serialVersionUID = 0L;
/*  3 */   public Type getOwnerType() { return this.ownerType; } public Type getRawType() {
/*  4 */     return this.rawType;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Type[] getActualTypeArguments() {
/* 15 */     return (Type[])this.typeArguments.clone();
/*    */   }
/*    */   public $Gson$Types$ParameterizedTypeImpl(Type paramType1, Type paramType2, Type... paramVarArgs) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: invokespecial <init> : ()V
/*    */     //   4: aload_2
/*    */     //   5: instanceof java/lang/Class
/*    */     //   8: ifeq -> 79
/*    */     //   11: aload_2
/*    */     //   12: checkcast java/lang/Class
/*    */     //   15: astore #4
/*    */     //   17: aload_1
/*    */     //   18: ifnonnull -> 36
/*    */     //   21: aload #4
/*    */     //   23: invokevirtual getEnclosingClass : ()Ljava/lang/Class;
/*    */     //   26: ifnonnull -> 44
/*    */     //   29: goto -> 36
/*    */     //   32: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   35: athrow
/*    */     //   36: iconst_1
/*    */     //   37: goto -> 45
/*    */     //   40: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   43: athrow
/*    */     //   44: iconst_0
/*    */     //   45: invokestatic checkArgument : (Z)V
/*    */     //   48: aload_1
/*    */     //   49: ifnull -> 67
/*    */     //   52: aload #4
/*    */     //   54: invokevirtual getEnclosingClass : ()Ljava/lang/Class;
/*    */     //   57: ifnull -> 75
/*    */     //   60: goto -> 67
/*    */     //   63: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   66: athrow
/*    */     //   67: iconst_1
/*    */     //   68: goto -> 76
/*    */     //   71: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   74: athrow
/*    */     //   75: iconst_0
/*    */     //   76: invokestatic checkArgument : (Z)V
/*    */     //   79: aload_0
/*    */     //   80: aload_1
/*    */     //   81: ifnonnull -> 92
/*    */     //   84: aconst_null
/*    */     //   85: goto -> 96
/*    */     //   88: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   91: athrow
/*    */     //   92: aload_1
/*    */     //   93: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*    */     //   96: putfield ownerType : Ljava/lang/reflect/Type;
/*    */     //   99: aload_0
/*    */     //   100: aload_2
/*    */     //   101: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*    */     //   104: putfield rawType : Ljava/lang/reflect/Type;
/*    */     //   107: aload_0
/*    */     //   108: aload_3
/*    */     //   109: invokevirtual clone : ()Ljava/lang/Object;
/*    */     //   112: checkcast [Ljava/lang/reflect/Type;
/*    */     //   115: putfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   118: iconst_0
/*    */     //   119: istore #4
/*    */     //   121: iload #4
/*    */     //   123: aload_0
/*    */     //   124: getfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   127: arraylength
/*    */     //   128: if_icmpge -> 179
/*    */     //   131: aload_0
/*    */     //   132: getfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   135: iload #4
/*    */     //   137: aaload
/*    */     //   138: invokestatic checkNotNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   141: pop
/*    */     //   142: aload_0
/*    */     //   143: getfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   146: iload #4
/*    */     //   148: aaload
/*    */     //   149: invokestatic access$000 : (Ljava/lang/reflect/Type;)V
/*    */     //   152: aload_0
/*    */     //   153: getfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   156: iload #4
/*    */     //   158: aload_0
/*    */     //   159: getfield typeArguments : [Ljava/lang/reflect/Type;
/*    */     //   162: iload #4
/*    */     //   164: aaload
/*    */     //   165: invokestatic canonicalize : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*    */     //   168: aastore
/*    */     //   169: iinc #4, 1
/*    */     //   172: goto -> 121
/*    */     //   175: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   178: athrow
/*    */     //   179: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 0
/*    */     //   #16	-> 4
/*    */     //   #20	-> 11
/*    */     //   #21	-> 17
/*    */     //   #5	-> 48
/*    */     //   #8	-> 79
/*    */     //   #19	-> 99
/*    */     //   #25	-> 107
/*    */     //   #2	-> 118
/*    */     //   #12	-> 131
/*    */     //   #6	-> 142
/*    */     //   #24	-> 152
/*    */     //   #1	-> 169
/*    */     //   #28	-> 179
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	29	32	java/lang/RuntimeException
/*    */     //   21	40	40	java/lang/RuntimeException
/*    */     //   45	60	63	java/lang/RuntimeException
/*    */     //   52	71	71	java/lang/RuntimeException
/*    */     //   79	88	88	java/lang/RuntimeException
/*    */     //   121	175	175	java/lang/RuntimeException
/*    */   }
/*    */   public boolean equals(Object paramObject) {
/*    */     
/* 22 */     try { if (paramObject instanceof ParameterizedType) try { if ($Gson$Types.equals(this, (ParameterizedType)paramObject)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 26 */     StringBuilder stringBuilder = new StringBuilder(30 * (this.typeArguments.length + 1)); try { stringBuilder.append($Gson$Types.typeToString(this.rawType)); if (this.typeArguments.length == 0)
/* 27 */         return stringBuilder.toString();  } catch (RuntimeException runtimeException) { throw b(null); }  stringBuilder.append("<").append($Gson$Types.typeToString(this.typeArguments[0])); byte b = 1; try { while (b < this.typeArguments.length) { stringBuilder.append(", ").append($Gson$Types.typeToString(this.typeArguments[b])); b++; }  } catch (RuntimeException runtimeException) { throw b(null); }  return stringBuilder.append(">").toString(); } public int hashCode() { return Arrays.hashCode((Object[])this.typeArguments) ^ this.rawType.hashCode() ^ $Gson$Types.access$100(this.ownerType); }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\$Gson$Types$ParameterizedTypeImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */