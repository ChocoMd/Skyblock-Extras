/*     */ package com.google.gson.internal;
/*     */ public final class $Gson$Types {
/*     */   public static Type[] getMapKeyAndValueTypes(Type paramType, Class<?> paramClass) { 
/*   4 */     try { if (paramType == Properties.class)
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 165 */         return new Type[] { String.class, String.class }; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }  Type type = getSupertype(paramType, paramClass, Map.class); if (type instanceof ParameterizedType) { ParameterizedType parameterizedType = (ParameterizedType)type; return parameterizedType.getActualTypeArguments(); }  return new Type[] { Object.class, Object.class }; } private static int indexOf(Object[] paramArrayOfObject, Object paramObject) { byte b = 0; while (true) { try { if (b < paramArrayOfObject.length) { try { if (paramObject.equals(paramArrayOfObject[b]))
/* 166 */               return b;  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */           
/*     */           b++; }
/*     */          }
/*     */       catch (IllegalArgumentException illegalArgumentException)
/*     */       { throw b(null); }
/*     */       
/*     */       break; }
/*     */     
/*     */     throw new NoSuchElementException(); }
/*     */ 
/*     */   
/*     */   public static boolean equals(Type paramType1, Type paramType2) {
/*     */     try {
/*     */       if (paramType1 == paramType2)
/*     */         return true; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType1 instanceof Class)
/*     */         return paramType1.equals(paramType2); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType1 instanceof ParameterizedType) {
/*     */         try {
/*     */           if (!(paramType2 instanceof ParameterizedType))
/*     */             return false; 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         ParameterizedType parameterizedType = (ParameterizedType)paramType1;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType1 instanceof GenericArrayType) {
/*     */         try {
/*     */           if (!(paramType2 instanceof GenericArrayType))
/*     */             return false; 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         GenericArrayType genericArrayType1 = (GenericArrayType)paramType1;
/*     */         GenericArrayType genericArrayType2 = (GenericArrayType)paramType2;
/*     */         return equals(genericArrayType1.getGenericComponentType(), genericArrayType2.getGenericComponentType());
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType1 instanceof WildcardType) {
/*     */         try {
/*     */           if (!(paramType2 instanceof WildcardType))
/*     */             return false; 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         WildcardType wildcardType1 = (WildcardType)paramType1;
/*     */         WildcardType wildcardType2 = (WildcardType)paramType2;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType1 instanceof TypeVariable) {
/*     */         try {
/*     */           if (!(paramType2 instanceof TypeVariable))
/*     */             return false; 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         TypeVariable typeVariable1 = (TypeVariable)paramType1;
/*     */         TypeVariable typeVariable2 = (TypeVariable)paramType2;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return false;
/*     */   }
/*     */   
/*     */   static boolean equal(Object paramObject1, Object paramObject2) {
/*     */     try {
/*     */       if (paramObject1 != paramObject2) {
/*     */         try {
/*     */           if (paramObject1 != null)
/*     */             try {
/*     */               if (paramObject1.equals(paramObject2));
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         return false;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static Type resolveTypeVariable(Type paramType, Class<?> paramClass, TypeVariable<?> paramTypeVariable) {
/*     */     Class<?> clazz = declaringClassOf(paramTypeVariable);
/*     */     try {
/*     */       if (clazz == null)
/*     */         return paramTypeVariable; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     Type type = getGenericSupertype(paramType, paramClass, clazz);
/*     */     if (type instanceof ParameterizedType) {
/*     */       int i = indexOf((Object[])clazz.getTypeParameters(), paramTypeVariable);
/*     */       return ((ParameterizedType)type).getActualTypeArguments()[i];
/*     */     } 
/*     */     return paramTypeVariable;
/*     */   }
/*     */   
/*     */   public static Type getCollectionElementType(Type paramType, Class<?> paramClass) {
/*     */     Type type = getSupertype(paramType, paramClass, Collection.class);
/*     */     if (type instanceof WildcardType)
/*     */       type = ((WildcardType)type).getUpperBounds()[0]; 
/*     */     try {
/*     */       if (type instanceof ParameterizedType)
/*     */         return ((ParameterizedType)type).getActualTypeArguments()[0]; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return Object.class;
/*     */   }
/*     */   
/*     */   private static int hashCodeOrZero(Object paramObject) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (paramObject != null) ? paramObject.hashCode() : 0;
/*     */   }
/*     */   
/*     */   public static WildcardType supertypeOf(Type paramType) {
/*     */     return new $Gson$Types$WildcardTypeImpl(new Type[] { Object.class }, new Type[] { paramType });
/*     */   }
/*     */   
/*     */   public static WildcardType subtypeOf(Type paramType) {
/*     */     return new $Gson$Types$WildcardTypeImpl(new Type[] { paramType }, EMPTY_TYPE_ARRAY);
/*     */   }
/*     */   
/*     */   public static String typeToString(Type paramType) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (paramType instanceof Class) ? ((Class)paramType).getName() : paramType.toString();
/*     */   }
/*     */   
/*     */   static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
/*     */   
/*     */   static Type getGenericSupertype(Type paramType, Class<?> paramClass1, Class<?> paramClass2) {
/*     */     try {
/*     */       if (paramClass2 == paramClass1)
/*     */         return paramType; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     if (paramClass2.isInterface()) {
/*     */       Class[] arrayOfClass = paramClass1.getInterfaces();
/*     */       byte b = 0;
/*     */       int i = arrayOfClass.length;
/*     */       while (true) {
/*     */         try {
/*     */           if (b < i) {
/*     */             try {
/*     */               if (arrayOfClass[b] == paramClass2)
/*     */                 return paramClass1.getGenericInterfaces()[b]; 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw b(null);
/*     */             } 
/*     */             try {
/*     */               if (paramClass2.isAssignableFrom(arrayOfClass[b]))
/*     */                 return getGenericSupertype(paramClass1.getGenericInterfaces()[b], arrayOfClass[b], paramClass2); 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         } 
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     try {
/*     */       if (!paramClass1.isInterface())
/*     */         while (paramClass1 != Object.class) {
/*     */           Class<?> clazz = paramClass1.getSuperclass();
/*     */           try {
/*     */             if (clazz == paramClass2)
/*     */               return paramClass1.getGenericSuperclass(); 
/*     */           } catch (IllegalArgumentException illegalArgumentException) {
/*     */             throw b(null);
/*     */           } 
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return paramClass2;
/*     */   }
/*     */   
/*     */   public static GenericArrayType arrayOf(Type paramType) {
/*     */     return new $Gson$Types$GenericArrayTypeImpl(paramType);
/*     */   }
/*     */   
/*     */   public static Type resolve(Type paramType1, Class<?> paramClass, Type paramType2) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof java/lang/reflect/TypeVariable
/*     */     //   4: ifeq -> 33
/*     */     //   7: aload_2
/*     */     //   8: checkcast java/lang/reflect/TypeVariable
/*     */     //   11: astore_3
/*     */     //   12: aload_0
/*     */     //   13: aload_1
/*     */     //   14: aload_3
/*     */     //   15: invokestatic resolveTypeVariable : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/TypeVariable;)Ljava/lang/reflect/Type;
/*     */     //   18: astore_2
/*     */     //   19: aload_2
/*     */     //   20: aload_3
/*     */     //   21: if_acmpne -> 30
/*     */     //   24: aload_2
/*     */     //   25: areturn
/*     */     //   26: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   29: athrow
/*     */     //   30: goto -> 0
/*     */     //   33: aload_2
/*     */     //   34: instanceof java/lang/Class
/*     */     //   37: ifeq -> 98
/*     */     //   40: aload_2
/*     */     //   41: checkcast java/lang/Class
/*     */     //   44: invokevirtual isArray : ()Z
/*     */     //   47: ifeq -> 98
/*     */     //   50: goto -> 57
/*     */     //   53: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   56: athrow
/*     */     //   57: aload_2
/*     */     //   58: checkcast java/lang/Class
/*     */     //   61: astore_3
/*     */     //   62: aload_3
/*     */     //   63: invokevirtual getComponentType : ()Ljava/lang/Class;
/*     */     //   66: astore #4
/*     */     //   68: aload_0
/*     */     //   69: aload_1
/*     */     //   70: aload #4
/*     */     //   72: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   75: astore #5
/*     */     //   77: aload #4
/*     */     //   79: aload #5
/*     */     //   81: if_acmpne -> 92
/*     */     //   84: aload_3
/*     */     //   85: goto -> 97
/*     */     //   88: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   91: athrow
/*     */     //   92: aload #5
/*     */     //   94: invokestatic arrayOf : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
/*     */     //   97: areturn
/*     */     //   98: aload_2
/*     */     //   99: instanceof java/lang/reflect/GenericArrayType
/*     */     //   102: ifeq -> 148
/*     */     //   105: aload_2
/*     */     //   106: checkcast java/lang/reflect/GenericArrayType
/*     */     //   109: astore_3
/*     */     //   110: aload_3
/*     */     //   111: invokeinterface getGenericComponentType : ()Ljava/lang/reflect/Type;
/*     */     //   116: astore #4
/*     */     //   118: aload_0
/*     */     //   119: aload_1
/*     */     //   120: aload #4
/*     */     //   122: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   125: astore #5
/*     */     //   127: aload #4
/*     */     //   129: aload #5
/*     */     //   131: if_acmpne -> 142
/*     */     //   134: aload_3
/*     */     //   135: goto -> 147
/*     */     //   138: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   141: athrow
/*     */     //   142: aload #5
/*     */     //   144: invokestatic arrayOf : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/GenericArrayType;
/*     */     //   147: areturn
/*     */     //   148: aload_2
/*     */     //   149: instanceof java/lang/reflect/ParameterizedType
/*     */     //   152: ifeq -> 305
/*     */     //   155: aload_2
/*     */     //   156: checkcast java/lang/reflect/ParameterizedType
/*     */     //   159: astore_3
/*     */     //   160: aload_3
/*     */     //   161: invokeinterface getOwnerType : ()Ljava/lang/reflect/Type;
/*     */     //   166: astore #4
/*     */     //   168: aload_0
/*     */     //   169: aload_1
/*     */     //   170: aload #4
/*     */     //   172: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   175: astore #5
/*     */     //   177: aload #5
/*     */     //   179: aload #4
/*     */     //   181: if_acmpeq -> 192
/*     */     //   184: iconst_1
/*     */     //   185: goto -> 193
/*     */     //   188: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   191: athrow
/*     */     //   192: iconst_0
/*     */     //   193: istore #6
/*     */     //   195: aload_3
/*     */     //   196: invokeinterface getActualTypeArguments : ()[Ljava/lang/reflect/Type;
/*     */     //   201: astore #7
/*     */     //   203: iconst_0
/*     */     //   204: istore #8
/*     */     //   206: aload #7
/*     */     //   208: arraylength
/*     */     //   209: istore #9
/*     */     //   211: iload #8
/*     */     //   213: iload #9
/*     */     //   215: if_icmpge -> 278
/*     */     //   218: aload_0
/*     */     //   219: aload_1
/*     */     //   220: aload #7
/*     */     //   222: iload #8
/*     */     //   224: aaload
/*     */     //   225: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   228: astore #10
/*     */     //   230: aload #10
/*     */     //   232: aload #7
/*     */     //   234: iload #8
/*     */     //   236: aaload
/*     */     //   237: if_acmpeq -> 272
/*     */     //   240: iload #6
/*     */     //   242: ifne -> 265
/*     */     //   245: goto -> 252
/*     */     //   248: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   251: athrow
/*     */     //   252: aload #7
/*     */     //   254: invokevirtual clone : ()Ljava/lang/Object;
/*     */     //   257: checkcast [Ljava/lang/reflect/Type;
/*     */     //   260: astore #7
/*     */     //   262: iconst_1
/*     */     //   263: istore #6
/*     */     //   265: aload #7
/*     */     //   267: iload #8
/*     */     //   269: aload #10
/*     */     //   271: aastore
/*     */     //   272: iinc #8, 1
/*     */     //   275: goto -> 211
/*     */     //   278: iload #6
/*     */     //   280: ifeq -> 303
/*     */     //   283: aload #5
/*     */     //   285: aload_3
/*     */     //   286: invokeinterface getRawType : ()Ljava/lang/reflect/Type;
/*     */     //   291: aload #7
/*     */     //   293: invokestatic newParameterizedTypeWithOwner : (Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;
/*     */     //   296: goto -> 304
/*     */     //   299: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   302: athrow
/*     */     //   303: aload_3
/*     */     //   304: areturn
/*     */     //   305: aload_2
/*     */     //   306: instanceof java/lang/reflect/WildcardType
/*     */     //   309: ifeq -> 412
/*     */     //   312: aload_2
/*     */     //   313: checkcast java/lang/reflect/WildcardType
/*     */     //   316: astore_3
/*     */     //   317: aload_3
/*     */     //   318: invokeinterface getLowerBounds : ()[Ljava/lang/reflect/Type;
/*     */     //   323: astore #4
/*     */     //   325: aload_3
/*     */     //   326: invokeinterface getUpperBounds : ()[Ljava/lang/reflect/Type;
/*     */     //   331: astore #5
/*     */     //   333: aload #4
/*     */     //   335: arraylength
/*     */     //   336: iconst_1
/*     */     //   337: if_icmpne -> 373
/*     */     //   340: aload_0
/*     */     //   341: aload_1
/*     */     //   342: aload #4
/*     */     //   344: iconst_0
/*     */     //   345: aaload
/*     */     //   346: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   349: astore #6
/*     */     //   351: aload #6
/*     */     //   353: aload #4
/*     */     //   355: iconst_0
/*     */     //   356: aaload
/*     */     //   357: if_acmpeq -> 370
/*     */     //   360: aload #6
/*     */     //   362: invokestatic supertypeOf : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
/*     */     //   365: areturn
/*     */     //   366: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   369: athrow
/*     */     //   370: goto -> 410
/*     */     //   373: aload #5
/*     */     //   375: arraylength
/*     */     //   376: iconst_1
/*     */     //   377: if_icmpne -> 410
/*     */     //   380: aload_0
/*     */     //   381: aload_1
/*     */     //   382: aload #5
/*     */     //   384: iconst_0
/*     */     //   385: aaload
/*     */     //   386: invokestatic resolve : (Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
/*     */     //   389: astore #6
/*     */     //   391: aload #6
/*     */     //   393: aload #5
/*     */     //   395: iconst_0
/*     */     //   396: aaload
/*     */     //   397: if_acmpeq -> 410
/*     */     //   400: aload #6
/*     */     //   402: invokestatic subtypeOf : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/WildcardType;
/*     */     //   405: areturn
/*     */     //   406: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   409: athrow
/*     */     //   410: aload_3
/*     */     //   411: areturn
/*     */     //   412: aload_2
/*     */     //   413: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #98	-> 0
/*     */     //   #18	-> 7
/*     */     //   #156	-> 12
/*     */     //   #52	-> 19
/*     */     //   #3	-> 24
/*     */     //   #114	-> 30
/*     */     //   #153	-> 57
/*     */     //   #88	-> 62
/*     */     //   #157	-> 68
/*     */     //   #154	-> 77
/*     */     //   #34	-> 98
/*     */     //   #48	-> 105
/*     */     //   #6	-> 110
/*     */     //   #134	-> 118
/*     */     //   #106	-> 127
/*     */     //   #66	-> 148
/*     */     //   #19	-> 155
/*     */     //   #77	-> 160
/*     */     //   #58	-> 168
/*     */     //   #135	-> 177
/*     */     //   #109	-> 195
/*     */     //   #62	-> 203
/*     */     //   #113	-> 218
/*     */     //   #155	-> 230
/*     */     //   #21	-> 240
/*     */     //   #101	-> 252
/*     */     //   #57	-> 262
/*     */     //   #38	-> 265
/*     */     //   #81	-> 272
/*     */     //   #148	-> 278
/*     */     //   #118	-> 305
/*     */     //   #67	-> 312
/*     */     //   #123	-> 317
/*     */     //   #104	-> 325
/*     */     //   #96	-> 333
/*     */     //   #60	-> 340
/*     */     //   #55	-> 351
/*     */     //   #161	-> 360
/*     */     //   #132	-> 370
/*     */     //   #11	-> 380
/*     */     //   #122	-> 391
/*     */     //   #17	-> 400
/*     */     //   #130	-> 410
/*     */     //   #56	-> 412
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   19	26	26	java/lang/IllegalArgumentException
/*     */     //   33	50	53	java/lang/IllegalArgumentException
/*     */     //   77	88	88	java/lang/IllegalArgumentException
/*     */     //   127	138	138	java/lang/IllegalArgumentException
/*     */     //   177	188	188	java/lang/IllegalArgumentException
/*     */     //   230	245	248	java/lang/IllegalArgumentException
/*     */     //   278	299	299	java/lang/IllegalArgumentException
/*     */     //   351	366	366	java/lang/IllegalArgumentException
/*     */     //   391	406	406	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public static Class<?> getRawType(Type paramType) {
/*     */     try {
/*     */       if (paramType instanceof Class)
/*     */         return (Class)paramType; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     if (paramType instanceof ParameterizedType) {
/*     */       ParameterizedType parameterizedType = (ParameterizedType)paramType;
/*     */       Type type = parameterizedType.getRawType();
/*     */       $Gson$Preconditions.checkArgument(type instanceof Class);
/*     */       return (Class)type;
/*     */     } 
/*     */     if (paramType instanceof GenericArrayType) {
/*     */       Type type = ((GenericArrayType)paramType).getGenericComponentType();
/*     */       return Array.newInstance(getRawType(type), 0).getClass();
/*     */     } 
/*     */     try {
/*     */       if (paramType instanceof TypeVariable)
/*     */         return Object.class; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramType instanceof WildcardType)
/*     */         return getRawType(((WildcardType)paramType).getUpperBounds()[0]); 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     String str = (paramType == null) ? "null" : paramType.getClass().getName();
/*     */     throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + paramType + "> is of type " + str);
/*     */   }
/*     */   
/*     */   private static void checkNotPrimitive(Type paramType) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: instanceof java/lang/Class
/*     */     //   4: ifeq -> 24
/*     */     //   7: aload_0
/*     */     //   8: checkcast java/lang/Class
/*     */     //   11: invokevirtual isPrimitive : ()Z
/*     */     //   14: ifne -> 32
/*     */     //   17: goto -> 24
/*     */     //   20: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   23: athrow
/*     */     //   24: iconst_1
/*     */     //   25: goto -> 33
/*     */     //   28: invokestatic b : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
/*     */     //   31: athrow
/*     */     //   32: iconst_0
/*     */     //   33: invokestatic checkArgument : (Z)V
/*     */     //   36: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #107	-> 0
/*     */     //   #94	-> 36
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	17	20	java/lang/IllegalArgumentException
/*     */     //   7	28	28	java/lang/IllegalArgumentException
/*     */   }
/*     */   
/*     */   public static Type canonicalize(Type paramType) {
/*     */     if (paramType instanceof Class) {
/*     */       Class clazz = (Class)paramType;
/*     */       try {
/*     */       
/*     */       } catch (IllegalArgumentException illegalArgumentException) {
/*     */         throw b(null);
/*     */       } 
/*     */       return clazz.isArray() ? new $Gson$Types$GenericArrayTypeImpl(canonicalize(clazz.getComponentType())) : clazz;
/*     */     } 
/*     */     if (paramType instanceof ParameterizedType) {
/*     */       ParameterizedType parameterizedType = (ParameterizedType)paramType;
/*     */       return new $Gson$Types$ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
/*     */     } 
/*     */     if (paramType instanceof GenericArrayType) {
/*     */       GenericArrayType genericArrayType = (GenericArrayType)paramType;
/*     */       return new $Gson$Types$GenericArrayTypeImpl(genericArrayType.getGenericComponentType());
/*     */     } 
/*     */     if (paramType instanceof WildcardType) {
/*     */       WildcardType wildcardType = (WildcardType)paramType;
/*     */       return new $Gson$Types$WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
/*     */     } 
/*     */     return paramType;
/*     */   }
/*     */   
/*     */   static Type getSupertype(Type paramType, Class<?> paramClass1, Class<?> paramClass2) {
/*     */     $Gson$Preconditions.checkArgument(paramClass2.isAssignableFrom(paramClass1));
/*     */     return resolve(paramType, paramClass1, getGenericSupertype(paramType, paramClass1, paramClass2));
/*     */   }
/*     */   
/*     */   public static Type getArrayComponentType(Type paramType) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (paramType instanceof GenericArrayType) ? ((GenericArrayType)paramType).getGenericComponentType() : ((Class)paramType).getComponentType();
/*     */   }
/*     */   
/*     */   private static Class<?> declaringClassOf(TypeVariable<?> paramTypeVariable) {
/*     */     Object object = paramTypeVariable.getGenericDeclaration();
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (object instanceof Class) ? (Class)object : null;
/*     */   }
/*     */   
/*     */   public static ParameterizedType newParameterizedTypeWithOwner(Type paramType1, Type paramType2, Type... paramVarArgs) {
/*     */     return new $Gson$Types$ParameterizedTypeImpl(paramType1, paramType2, paramVarArgs);
/*     */   }
/*     */   
/*     */   private static IllegalArgumentException b(IllegalArgumentException paramIllegalArgumentException) {
/*     */     return paramIllegalArgumentException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\$Gson$Types.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */