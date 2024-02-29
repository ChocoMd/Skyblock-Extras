/*    */ package com.google.gson.reflect;public class TypeToken<T> { final Class<? super T> rawType; final Type type; final int hashCode;
/*    */   
/*    */   @Deprecated
/*  4 */   public boolean isAssignableFrom(TypeToken<?> paramTypeToken) { return isAssignableFrom(paramTypeToken.getType()); } private static boolean matches(Type paramType1, Type paramType2, Map<String, Type> paramMap) {
/*    */     
/*  6 */     try { if (!paramType2.equals(paramType1)) { try { if (paramType1 instanceof TypeVariable) try { if (paramType2.equals(paramMap.get(((TypeVariable)paramType1).getName()))); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */   
/*    */   }
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
/*    */   public final Type getType() {
/* 30 */     return this.type;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static <T> TypeToken<T> get(Class<T> paramClass) {
/* 40 */     return new TypeToken<T>(paramClass);
/*    */   }
/*    */   
/*    */   private static boolean isAssignableFrom(Type<?> paramType, GenericArrayType paramGenericArrayType) {
/* 44 */     Type type = paramGenericArrayType.getGenericComponentType();
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
/*    */ 
/*    */     
/* 74 */     if (type instanceof ParameterizedType) { Type<?> type1 = paramType; if (paramType instanceof GenericArrayType) { type1 = ((GenericArrayType)paramType).getGenericComponentType(); } else if (paramType instanceof Class) { Class<?> clazz = (Class)paramType; while (clazz.isArray()) clazz = clazz.getComponentType();  type1 = clazz; }  }  return true; }
/*    */   public static TypeToken<?> get(Type paramType) { return new TypeToken(paramType); }
/*    */   @Deprecated public boolean isAssignableFrom(Type paramType) { try { if (paramType == null) return false;  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (this.type.equals(paramType)) return true;  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (this.type instanceof Class) return this.rawType.isAssignableFrom(.Gson.Types.getRawType(paramType));  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (this.type instanceof ParameterizedType)
/*    */         return isAssignableFrom(paramType, (ParameterizedType)this.type, new HashMap<String, Type>());  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (this.type instanceof GenericArrayType) { try { if (this.rawType.isAssignableFrom(.Gson.Types.getRawType(paramType)))
/* 78 */             try { if (isAssignableFrom(paramType, (GenericArrayType)this.type)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }  } catch (RuntimeException runtimeException) { throw b(null); }  throw buildUnexpectedTypeError(this.type, new Class[] { Class.class, ParameterizedType.class, GenericArrayType.class }); } protected TypeToken() { this.type = getSuperclassTypeParameter(getClass()); this.rawType = .Gson.Types.getRawType(this.type); this.hashCode = this.type.hashCode(); }
/*    */   @Deprecated public boolean isAssignableFrom(Class<?> paramClass) { return isAssignableFrom(paramClass); } private static AssertionError buildUnexpectedTypeError(Type paramType, Class<?>... paramVarArgs) { StringBuilder stringBuilder = new StringBuilder("Unexpected type. Expected one of: "); Class<?>[] arrayOfClass; int i; byte b;
/* 80 */     for (arrayOfClass = paramVarArgs, i = arrayOfClass.length, b = 0; b < i; stringBuilder.append(clazz.getName()).append(", "), b++) Class<?> clazz = arrayOfClass[b];
/*    */ 
/*    */     
/* 83 */     stringBuilder.append("but got: ").append(paramType.getClass().getName()).append(", for type token: ").append(paramType.toString()).append('.'); return new AssertionError(stringBuilder.toString()); } public final int hashCode() { return this.hashCode; }
/*    */   public final String toString() { return .Gson.Types.typeToString(this.type); }
/*    */   public final Class<? super T> getRawType() { return this.rawType; }
/* 86 */   static Type getSuperclassTypeParameter(Class<?> paramClass) { Type type = paramClass.getGenericSuperclass(); try { if (type instanceof Class) throw new RuntimeException("Missing type parameter.");  } catch (RuntimeException runtimeException) { throw b(null); }  ParameterizedType parameterizedType = (ParameterizedType)type; return .Gson.Types.canonicalize(parameterizedType.getActualTypeArguments()[0]); } TypeToken(Type paramType) { this.type = .Gson.Types.canonicalize((Type).Gson.Preconditions.checkNotNull(paramType)); this.rawType = .Gson.Types.getRawType(this.type); this.hashCode = this.type.hashCode(); }
/* 87 */   public final boolean equals(Object paramObject) { try { if (paramObject instanceof TypeToken) try { if (.Gson.Types.equals(this.type, ((TypeToken)paramObject).type)); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }
/*    */    private static boolean isAssignableFrom(Type paramType, ParameterizedType paramParameterizedType, Map<String, Type> paramMap) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ifnonnull -> 10
/*    */     //   4: iconst_0
/*    */     //   5: ireturn
/*    */     //   6: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   9: athrow
/*    */     //   10: aload_1
/*    */     //   11: aload_0
/*    */     //   12: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   15: ifeq -> 24
/*    */     //   18: iconst_1
/*    */     //   19: ireturn
/*    */     //   20: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   23: athrow
/*    */     //   24: aload_0
/*    */     //   25: invokestatic getRawType : (Ljava/lang/reflect/Type;)Ljava/lang/Class;
/*    */     //   28: astore_3
/*    */     //   29: aconst_null
/*    */     //   30: astore #4
/*    */     //   32: aload_0
/*    */     //   33: instanceof java/lang/reflect/ParameterizedType
/*    */     //   36: ifeq -> 45
/*    */     //   39: aload_0
/*    */     //   40: checkcast java/lang/reflect/ParameterizedType
/*    */     //   43: astore #4
/*    */     //   45: aload #4
/*    */     //   47: ifnull -> 164
/*    */     //   50: aload #4
/*    */     //   52: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
/*    */     //   57: astore #5
/*    */     //   59: aload_3
/*    */     //   60: invokevirtual getTypeParameters : ()[Ljava/lang/reflect/TypeVariable;
/*    */     //   63: astore #6
/*    */     //   65: iconst_0
/*    */     //   66: istore #7
/*    */     //   68: iload #7
/*    */     //   70: aload #5
/*    */     //   72: arraylength
/*    */     //   73: if_icmpge -> 148
/*    */     //   76: aload #5
/*    */     //   78: iload #7
/*    */     //   80: aaload
/*    */     //   81: astore #8
/*    */     //   83: aload #6
/*    */     //   85: iload #7
/*    */     //   87: aaload
/*    */     //   88: astore #9
/*    */     //   90: aload #8
/*    */     //   92: instanceof java/lang/reflect/TypeVariable
/*    */     //   95: ifeq -> 126
/*    */     //   98: aload #8
/*    */     //   100: checkcast java/lang/reflect/TypeVariable
/*    */     //   103: astore #10
/*    */     //   105: aload_2
/*    */     //   106: aload #10
/*    */     //   108: invokeinterface getName : ()Ljava/lang/String;
/*    */     //   113: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   118: checkcast java/lang/reflect/Type
/*    */     //   121: astore #8
/*    */     //   123: goto -> 90
/*    */     //   126: aload_2
/*    */     //   127: aload #9
/*    */     //   129: invokeinterface getName : ()Ljava/lang/String;
/*    */     //   134: aload #8
/*    */     //   136: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   141: pop
/*    */     //   142: iinc #7, 1
/*    */     //   145: goto -> 68
/*    */     //   148: aload #4
/*    */     //   150: aload_1
/*    */     //   151: aload_2
/*    */     //   152: invokestatic typeEquals : (Ljava/lang/reflect/ParameterizedType;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
/*    */     //   155: ifeq -> 164
/*    */     //   158: iconst_1
/*    */     //   159: ireturn
/*    */     //   160: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   163: athrow
/*    */     //   164: aload_3
/*    */     //   165: invokevirtual getGenericInterfaces : ()[Ljava/lang/reflect/Type;
/*    */     //   168: astore #5
/*    */     //   170: aload #5
/*    */     //   172: arraylength
/*    */     //   173: istore #6
/*    */     //   175: iconst_0
/*    */     //   176: istore #7
/*    */     //   178: iload #7
/*    */     //   180: iload #6
/*    */     //   182: if_icmpge -> 221
/*    */     //   185: aload #5
/*    */     //   187: iload #7
/*    */     //   189: aaload
/*    */     //   190: astore #8
/*    */     //   192: aload #8
/*    */     //   194: aload_1
/*    */     //   195: new java/util/HashMap
/*    */     //   198: dup
/*    */     //   199: aload_2
/*    */     //   200: invokespecial <init> : (Ljava/util/Map;)V
/*    */     //   203: invokestatic isAssignableFrom : (Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
/*    */     //   206: ifeq -> 215
/*    */     //   209: iconst_1
/*    */     //   210: ireturn
/*    */     //   211: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   214: athrow
/*    */     //   215: iinc #7, 1
/*    */     //   218: goto -> 178
/*    */     //   221: aload_3
/*    */     //   222: invokevirtual getGenericSuperclass : ()Ljava/lang/reflect/Type;
/*    */     //   225: astore #5
/*    */     //   227: aload #5
/*    */     //   229: aload_1
/*    */     //   230: new java/util/HashMap
/*    */     //   233: dup
/*    */     //   234: aload_2
/*    */     //   235: invokespecial <init> : (Ljava/util/Map;)V
/*    */     //   238: invokestatic isAssignableFrom : (Ljava/lang/reflect/Type;Ljava/lang/reflect/ParameterizedType;Ljava/util/Map;)Z
/*    */     //   241: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #88	-> 0
/*    */     //   #7	-> 4
/*    */     //   #63	-> 10
/*    */     //   #77	-> 18
/*    */     //   #13	-> 24
/*    */     //   #69	-> 29
/*    */     //   #37	-> 32
/*    */     //   #20	-> 39
/*    */     //   #16	-> 45
/*    */     //   #42	-> 50
/*    */     //   #50	-> 59
/*    */     //   #47	-> 65
/*    */     //   #23	-> 76
/*    */     //   #85	-> 83
/*    */     //   #35	-> 90
/*    */     //   #2	-> 98
/*    */     //   #84	-> 105
/*    */     //   #58	-> 123
/*    */     //   #12	-> 126
/*    */     //   #38	-> 142
/*    */     //   #9	-> 148
/*    */     //   #52	-> 158
/*    */     //   #48	-> 164
/*    */     //   #11	-> 192
/*    */     //   #90	-> 209
/*    */     //   #34	-> 215
/*    */     //   #8	-> 221
/*    */     //   #22	-> 227
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	6	6	java/lang/RuntimeException
/*    */     //   10	20	20	java/lang/RuntimeException
/*    */     //   148	160	160	java/lang/RuntimeException
/*    */     //   192	211	211	java/lang/RuntimeException
/*    */   } private static boolean typeEquals(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map<String, Type> paramMap) {
/* 91 */     if (paramParameterizedType1.getRawType().equals(paramParameterizedType2.getRawType())) {
/*    */       Type[] arrayOfType1 = paramParameterizedType1.getActualTypeArguments();
/*    */       Type[] arrayOfType2 = paramParameterizedType2.getActualTypeArguments();
/*    */       boolean bool = false;
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\reflect\TypeToken.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */