/*     */ package org.spongepowered.asm.lib;public class Type { public int getSize() { 
/*     */     try {  }
/*     */     catch (RuntimeException runtimeException)
/*   4 */     { throw b(null); }  return (this.buf == null) ? (this.off & 0xFF) : 1; }
/*   5 */   public static String getMethodDescriptor(Type paramType, Type... paramVarArgs) { StringBuilder stringBuilder = new StringBuilder();
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
/*  32 */     stringBuilder.append('(');
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
/*     */     byte b = 0;
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
/*     */     try {
/*  77 */       for (; b < paramVarArgs.length; b++)
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
/* 121 */         paramVarArgs[b].getDescriptor(stringBuilder); } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     }  stringBuilder.append(')'); paramType.getDescriptor(stringBuilder); return stringBuilder.toString(); }
/*     */   public static Type getType(Method paramMethod) { return getType(getMethodDescriptor(paramMethod)); }
/*     */   private static void getDescriptor(StringBuilder paramStringBuilder, Class<?> paramClass) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: astore_2
/*     */     //   2: aload_2
/*     */     //   3: invokevirtual isPrimitive : ()Z
/*     */     //   6: ifeq -> 130
/*     */     //   9: aload_2
/*     */     //   10: getstatic java/lang/Integer.TYPE : Ljava/lang/Class;
/*     */     //   13: if_acmpne -> 29
/*     */     //   16: goto -> 23
/*     */     //   19: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   22: athrow
/*     */     //   23: bipush #73
/*     */     //   25: istore_3
/*     */     //   26: goto -> 123
/*     */     //   29: aload_2
/*     */     //   30: getstatic java/lang/Void.TYPE : Ljava/lang/Class;
/*     */     //   33: if_acmpne -> 42
/*     */     //   36: bipush #86
/*     */     //   38: istore_3
/*     */     //   39: goto -> 123
/*     */     //   42: aload_2
/*     */     //   43: getstatic java/lang/Boolean.TYPE : Ljava/lang/Class;
/*     */     //   46: if_acmpne -> 55
/*     */     //   49: bipush #90
/*     */     //   51: istore_3
/*     */     //   52: goto -> 123
/*     */     //   55: aload_2
/*     */     //   56: getstatic java/lang/Byte.TYPE : Ljava/lang/Class;
/*     */     //   59: if_acmpne -> 68
/*     */     //   62: bipush #66
/*     */     //   64: istore_3
/*     */     //   65: goto -> 123
/*     */     //   68: aload_2
/*     */     //   69: getstatic java/lang/Character.TYPE : Ljava/lang/Class;
/*     */     //   72: if_acmpne -> 81
/*     */     //   75: bipush #67
/*     */     //   77: istore_3
/*     */     //   78: goto -> 123
/*     */     //   81: aload_2
/*     */     //   82: getstatic java/lang/Short.TYPE : Ljava/lang/Class;
/*     */     //   85: if_acmpne -> 94
/*     */     //   88: bipush #83
/*     */     //   90: istore_3
/*     */     //   91: goto -> 123
/*     */     //   94: aload_2
/*     */     //   95: getstatic java/lang/Double.TYPE : Ljava/lang/Class;
/*     */     //   98: if_acmpne -> 107
/*     */     //   101: bipush #68
/*     */     //   103: istore_3
/*     */     //   104: goto -> 123
/*     */     //   107: aload_2
/*     */     //   108: getstatic java/lang/Float.TYPE : Ljava/lang/Class;
/*     */     //   111: if_acmpne -> 120
/*     */     //   114: bipush #70
/*     */     //   116: istore_3
/*     */     //   117: goto -> 123
/*     */     //   120: bipush #74
/*     */     //   122: istore_3
/*     */     //   123: aload_0
/*     */     //   124: iload_3
/*     */     //   125: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   128: pop
/*     */     //   129: return
/*     */     //   130: aload_2
/*     */     //   131: invokevirtual isArray : ()Z
/*     */     //   134: ifeq -> 152
/*     */     //   137: aload_0
/*     */     //   138: bipush #91
/*     */     //   140: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   143: pop
/*     */     //   144: aload_2
/*     */     //   145: invokevirtual getComponentType : ()Ljava/lang/Class;
/*     */     //   148: astore_2
/*     */     //   149: goto -> 2
/*     */     //   152: aload_0
/*     */     //   153: bipush #76
/*     */     //   155: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   158: pop
/*     */     //   159: aload_2
/*     */     //   160: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   163: astore_3
/*     */     //   164: aload_3
/*     */     //   165: invokevirtual length : ()I
/*     */     //   168: istore #4
/*     */     //   170: iconst_0
/*     */     //   171: istore #5
/*     */     //   173: iload #5
/*     */     //   175: iload #4
/*     */     //   177: if_icmpge -> 217
/*     */     //   180: aload_3
/*     */     //   181: iload #5
/*     */     //   183: invokevirtual charAt : (I)C
/*     */     //   186: istore #6
/*     */     //   188: aload_0
/*     */     //   189: iload #6
/*     */     //   191: bipush #46
/*     */     //   193: if_icmpne -> 205
/*     */     //   196: bipush #47
/*     */     //   198: goto -> 207
/*     */     //   201: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   204: athrow
/*     */     //   205: iload #6
/*     */     //   207: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   210: pop
/*     */     //   211: iinc #5, 1
/*     */     //   214: goto -> 173
/*     */     //   217: aload_0
/*     */     //   218: bipush #59
/*     */     //   220: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   223: pop
/*     */     //   224: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 0
/*     */     //   #195	-> 2
/*     */     //   #162	-> 9
/*     */     //   #167	-> 23
/*     */     //   #240	-> 29
/*     */     //   #155	-> 36
/*     */     //   #231	-> 42
/*     */     //   #163	-> 49
/*     */     //   #34	-> 55
/*     */     //   #156	-> 62
/*     */     //   #241	-> 68
/*     */     //   #210	-> 75
/*     */     //   #14	-> 81
/*     */     //   #73	-> 88
/*     */     //   #81	-> 94
/*     */     //   #235	-> 101
/*     */     //   #131	-> 107
/*     */     //   #59	-> 114
/*     */     //   #171	-> 120
/*     */     //   #51	-> 123
/*     */     //   #91	-> 129
/*     */     //   #202	-> 130
/*     */     //   #54	-> 137
/*     */     //   #208	-> 144
/*     */     //   #194	-> 152
/*     */     //   #96	-> 159
/*     */     //   #170	-> 164
/*     */     //   #66	-> 170
/*     */     //   #117	-> 180
/*     */     //   #217	-> 188
/*     */     //   #229	-> 211
/*     */     //   #80	-> 217
/*     */     //   #114	-> 224
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   2	16	19	java/lang/RuntimeException
/* 126 */     //   188	201	201	java/lang/RuntimeException } public static Type[] getArgumentTypes(Method paramMethod) { Class[] arrayOfClass = paramMethod.getParameterTypes(); Type[] arrayOfType = new Type[arrayOfClass.length];
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
/* 138 */     int i = arrayOfClass.length - 1; try { for (; i >= 0; i--) {
/*     */         arrayOfType[i] = getType(arrayOfClass[i]);
/*     */       } }
/*     */     catch (RuntimeException runtimeException)
/*     */     { throw b(null); }
/*     */ 
/*     */     
/* 145 */     return arrayOfType; }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getOpcode(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: bipush #46
/*     */     //   3: if_icmpeq -> 19
/*     */     //   6: iload_1
/*     */     //   7: bipush #79
/*     */     //   9: if_icmpne -> 54
/*     */     //   12: goto -> 19
/*     */     //   15: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   18: athrow
/*     */     //   19: iload_1
/*     */     //   20: aload_0
/*     */     //   21: getfield buf : [C
/*     */     //   24: ifnonnull -> 51
/*     */     //   27: goto -> 34
/*     */     //   30: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   33: athrow
/*     */     //   34: aload_0
/*     */     //   35: getfield off : I
/*     */     //   38: ldc 65280
/*     */     //   40: iand
/*     */     //   41: bipush #8
/*     */     //   43: ishr
/*     */     //   44: goto -> 52
/*     */     //   47: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   50: athrow
/*     */     //   51: iconst_4
/*     */     //   52: iadd
/*     */     //   53: ireturn
/*     */     //   54: iload_1
/*     */     //   55: aload_0
/*     */     //   56: getfield buf : [C
/*     */     //   59: ifnonnull -> 79
/*     */     //   62: aload_0
/*     */     //   63: getfield off : I
/*     */     //   66: ldc 16711680
/*     */     //   68: iand
/*     */     //   69: bipush #16
/*     */     //   71: ishr
/*     */     //   72: goto -> 80
/*     */     //   75: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   78: athrow
/*     */     //   79: iconst_4
/*     */     //   80: iadd
/*     */     //   81: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #28	-> 0
/*     */     //   #220	-> 19
/*     */     //   #143	-> 54
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	12	15	java/lang/RuntimeException
/*     */     //   6	27	30	java/lang/RuntimeException
/*     */     //   19	47	47	java/lang/RuntimeException
/*     */     //   54	75	75	java/lang/RuntimeException
/*     */   }
/*     */ 
/*     */   
/*     */   public static final Type SHORT_TYPE = new Type(4, null, 1392510721, 1);
/*     */   
/*     */   public Type getElementType() {
/*     */     return getType(this.buf, this.off + getDimensions());
/*     */   }
/*     */   
/*     */   private void getDescriptor(StringBuilder paramStringBuilder) {
/*     */     try {
/*     */       if (this.buf == null) {
/*     */         paramStringBuilder.append((char)((this.off & 0xFF000000) >>> 24));
/*     */       } else {
/*     */         try {
/* 166 */           if (this.sort == 10) {
/*     */             paramStringBuilder.append('L'); paramStringBuilder.append(this.buf, this.off, this.len); paramStringBuilder.append(';');
/*     */           } else {
/*     */             paramStringBuilder.append(this.buf, this.off, this.len);
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     }  } public String getDescriptor() { StringBuilder stringBuilder = new StringBuilder();
/* 178 */     getDescriptor(stringBuilder);
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
/* 218 */     return stringBuilder.toString(); }
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
/*     */   public static int getArgumentsAndReturnSizes(String paramString)
/*     */   {
/*     */     boolean bool = true;
/* 233 */     byte b = 1; while (true)
/*     */       char c = paramString.charAt(b++);  } private static Type getType(char[] paramArrayOfchar, int paramInt) { try {
/*     */       byte b; switch (paramArrayOfchar[paramInt]) {
/*     */         case 'V':
/*     */           return VOID_TYPE;
/*     */         case 'Z':
/* 239 */           return BOOLEAN_TYPE;case 'C': return CHAR_TYPE;case 'B': return BYTE_TYPE;case 'S': return SHORT_TYPE;case 'I': return INT_TYPE;case 'F': return FLOAT_TYPE;case 'J': return LONG_TYPE;
/*     */         case 'D': return DOUBLE_TYPE;
/*     */         case '[': b = 1; try { while (paramArrayOfchar[paramInt + b] == '[')
/* 242 */               b++;  } catch (RuntimeException runtimeException) { throw b(null); }
/*     */           
/*     */           try {
/*     */             if (paramArrayOfchar[paramInt + b] == 'L') {
/*     */               b++;
/*     */               try {
/*     */                 while (paramArrayOfchar[paramInt + b] != ';')
/*     */                   b++; 
/*     */               } catch (RuntimeException runtimeException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           return new Type(9, paramArrayOfchar, paramInt, b + 1);
/*     */         case 'L':
/*     */           b = 1;
/*     */           try {
/*     */             while (paramArrayOfchar[paramInt + b] != ';')
/*     */               b++; 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           return new Type(10, paramArrayOfchar, paramInt + 1, b - 1);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return new Type(11, paramArrayOfchar, paramInt, paramArrayOfchar.length - paramInt); }
/*     */ 
/*     */   
/*     */   public boolean equals(Object paramObject) {
/*     */     try {
/*     */       if (this == paramObject)
/*     */         return true; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (!(paramObject instanceof Type))
/*     */         return false; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     Type type = (Type)paramObject;
/*     */     try {
/*     */       if (this.sort != type.sort)
/*     */         return false; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (this.sort >= 9) {
/*     */         try {
/*     */           if (this.len != type.len)
/*     */             return false; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */         int i = this.off, j = type.off, k = i + this.len;
/*     */         while (true) {
/*     */           try {
/*     */             if (i < k) {
/*     */               try {
/*     */                 if (this.buf[i] != type.buf[j])
/*     */                   return false; 
/*     */               } catch (RuntimeException runtimeException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               i++;
/*     */               j++;
/*     */             } 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return true;
/*     */   }
/*     */   
/*     */   public static final Type INT_TYPE = new Type(5, null, 1224736769, 1);
/*     */   
/*     */   public static String getDescriptor(Class<?> paramClass) {
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     getDescriptor(stringBuilder, paramClass);
/*     */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public int getDimensions() {
/*     */     byte b = 1;
/*     */     try {
/*     */       while (this.buf[this.off + b] == '[')
/*     */         b++; 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return b;
/*     */   }
/*     */   
/*     */   private Type(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) {
/*     */     this.sort = paramInt1;
/*     */     this.buf = paramArrayOfchar;
/*     */     this.off = paramInt2;
/*     */     this.len = paramInt3;
/*     */   }
/*     */   
/*     */   public static Type getType(String paramString) {
/*     */     return getType(paramString.toCharArray(), 0);
/*     */   }
/*     */   
/*     */   public static Type getMethodType(String paramString) {
/*     */     return getType(paramString.toCharArray(), 0);
/*     */   }
/*     */   
/*     */   public static Type getType(Constructor<?> paramConstructor) {
/*     */     return getType(getConstructorDescriptor(paramConstructor));
/*     */   }
/*     */   
/*     */   public int getSort() {
/*     */     return this.sort;
/*     */   }
/*     */   
/*     */   public String getInternalName() {
/*     */     return new String(this.buf, this.off, this.len);
/*     */   }
/*     */   
/*     */   public int getArgumentsAndReturnSizes() {
/*     */     return getArgumentsAndReturnSizes(getDescriptor());
/*     */   }
/*     */   
/*     */   public static final Type VOID_TYPE = new Type(0, null, 1443168256, 1);
/*     */   
/*     */   public static Type getReturnType(Method paramMethod) {
/*     */     return getType(paramMethod.getReturnType());
/*     */   }
/*     */   
/*     */   public static final Type LONG_TYPE = new Type(7, null, 1241579778, 1);
/*     */   public static final Type FLOAT_TYPE = new Type(6, null, 1174536705, 1);
/*     */   
/*     */   public static Type getObjectType(String paramString) {
/*     */     char[] arrayOfChar = paramString.toCharArray();
/*     */     try {
/*     */     
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return new Type((arrayOfChar[0] == '[') ? 9 : 10, arrayOfChar, 0, arrayOfChar.length);
/*     */   }
/*     */   
/*     */   public static Type getReturnType(String paramString) {
/*     */     char[] arrayOfChar = paramString.toCharArray();
/*     */     byte b = 1;
/*     */     label19: while (true) {
/*     */       char c = arrayOfChar[b++];
/*     */       try {
/*     */         if (c == ')')
/*     */           return getType(arrayOfChar, b); 
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */       try {
/*     */         if (c == 'L') {
/*     */           while (true) {
/*     */             try {
/*     */               if (arrayOfChar[b++] != ';')
/*     */                 continue; 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */             continue label19;
/*     */           } 
/*     */           break;
/*     */         } 
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Type getReturnType() {
/*     */     return getReturnType(getDescriptor());
/*     */   }
/*     */   
/*     */   public static final Type BYTE_TYPE = new Type(3, null, 1107297537, 1);
/*     */   
/*     */   public String toString() {
/*     */     return getDescriptor();
/*     */   }
/*     */   
/*     */   public static String getConstructorDescriptor(Constructor<?> paramConstructor) {
/*     */     Class[] arrayOfClass = paramConstructor.getParameterTypes();
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     stringBuilder.append('(');
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < arrayOfClass.length; b++)
/*     */         getDescriptor(stringBuilder, arrayOfClass[b]); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return stringBuilder.append(")V").toString();
/*     */   }
/*     */   
/*     */   public Type[] getArgumentTypes() {
/*     */     return getArgumentTypes(getDescriptor());
/*     */   }
/*     */   
/*     */   public static String getInternalName(Class<?> paramClass) {
/*     */     return paramClass.getName().replace('.', '/');
/*     */   }
/*     */   
/*     */   public static String getMethodDescriptor(Method paramMethod) {
/*     */     Class[] arrayOfClass = paramMethod.getParameterTypes();
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     stringBuilder.append('(');
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < arrayOfClass.length; b++)
/*     */         getDescriptor(stringBuilder, arrayOfClass[b]); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     stringBuilder.append(')');
/*     */     getDescriptor(stringBuilder, paramMethod.getReturnType());
/*     */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public static final Type BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
/*     */   
/*     */   public static Type[] getArgumentTypes(String paramString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual toCharArray : ()[C
/*     */     //   4: astore_1
/*     */     //   5: iconst_1
/*     */     //   6: istore_2
/*     */     //   7: iconst_0
/*     */     //   8: istore_3
/*     */     //   9: aload_1
/*     */     //   10: iload_2
/*     */     //   11: iinc #2, 1
/*     */     //   14: caload
/*     */     //   15: istore #4
/*     */     //   17: iload #4
/*     */     //   19: bipush #41
/*     */     //   21: if_icmpne -> 31
/*     */     //   24: goto -> 89
/*     */     //   27: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   30: athrow
/*     */     //   31: iload #4
/*     */     //   33: bipush #76
/*     */     //   35: if_icmpne -> 69
/*     */     //   38: aload_1
/*     */     //   39: iload_2
/*     */     //   40: iinc #2, 1
/*     */     //   43: caload
/*     */     //   44: bipush #59
/*     */     //   46: if_icmpeq -> 63
/*     */     //   49: goto -> 56
/*     */     //   52: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   55: athrow
/*     */     //   56: goto -> 38
/*     */     //   59: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   62: athrow
/*     */     //   63: iinc #3, 1
/*     */     //   66: goto -> 86
/*     */     //   69: iload #4
/*     */     //   71: bipush #91
/*     */     //   73: if_icmpeq -> 86
/*     */     //   76: iinc #3, 1
/*     */     //   79: goto -> 86
/*     */     //   82: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   85: athrow
/*     */     //   86: goto -> 9
/*     */     //   89: iload_3
/*     */     //   90: anewarray org/spongepowered/asm/lib/Type
/*     */     //   93: astore #4
/*     */     //   95: iconst_1
/*     */     //   96: istore_2
/*     */     //   97: iconst_0
/*     */     //   98: istore_3
/*     */     //   99: aload_1
/*     */     //   100: iload_2
/*     */     //   101: caload
/*     */     //   102: bipush #41
/*     */     //   104: if_icmpeq -> 161
/*     */     //   107: aload #4
/*     */     //   109: iload_3
/*     */     //   110: aload_1
/*     */     //   111: iload_2
/*     */     //   112: invokestatic getType : ([CI)Lorg/spongepowered/asm/lib/Type;
/*     */     //   115: aastore
/*     */     //   116: iload_2
/*     */     //   117: aload #4
/*     */     //   119: iload_3
/*     */     //   120: aaload
/*     */     //   121: getfield len : I
/*     */     //   124: aload #4
/*     */     //   126: iload_3
/*     */     //   127: aaload
/*     */     //   128: getfield sort : I
/*     */     //   131: bipush #10
/*     */     //   133: if_icmpne -> 151
/*     */     //   136: goto -> 143
/*     */     //   139: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   142: athrow
/*     */     //   143: iconst_2
/*     */     //   144: goto -> 152
/*     */     //   147: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   150: athrow
/*     */     //   151: iconst_0
/*     */     //   152: iadd
/*     */     //   153: iadd
/*     */     //   154: istore_2
/*     */     //   155: iinc #3, 1
/*     */     //   158: goto -> 99
/*     */     //   161: aload #4
/*     */     //   163: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #214	-> 0
/*     */     //   #38	-> 5
/*     */     //   #222	-> 7
/*     */     //   #53	-> 9
/*     */     //   #136	-> 17
/*     */     //   #150	-> 24
/*     */     //   #86	-> 31
/*     */     //   #120	-> 38
/*     */     //   #10	-> 63
/*     */     //   #79	-> 69
/*     */     //   #30	-> 76
/*     */     //   #69	-> 86
/*     */     //   #19	-> 89
/*     */     //   #134	-> 95
/*     */     //   #105	-> 97
/*     */     //   #106	-> 99
/*     */     //   #8	-> 107
/*     */     //   #49	-> 116
/*     */     //   #186	-> 155
/*     */     //   #26	-> 161
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	27	27	java/lang/RuntimeException
/*     */     //   31	49	52	java/lang/RuntimeException
/*     */     //   38	59	59	java/lang/RuntimeException
/*     */     //   69	79	82	java/lang/RuntimeException
/*     */     //   99	136	139	java/lang/RuntimeException
/*     */     //   107	147	147	java/lang/RuntimeException
/*     */   }
/*     */   
/*     */   public String getClassName() {
/*     */     try {
/*     */       StringBuilder stringBuilder;
/*     */       int i;
/*     */       switch (this.sort) {
/*     */         case 0:
/*     */           return "void";
/*     */         case 1:
/*     */           return "boolean";
/*     */         case 2:
/*     */           return "char";
/*     */         case 3:
/*     */           return "byte";
/*     */         case 4:
/*     */           return "short";
/*     */         case 5:
/*     */           return "int";
/*     */         case 6:
/*     */           return "float";
/*     */         case 7:
/*     */           return "long";
/*     */         case 8:
/*     */           return "double";
/*     */         case 9:
/*     */           stringBuilder = new StringBuilder(getElementType().getClassName());
/*     */           i = getDimensions();
/*     */           try {
/*     */             for (; i > 0; i--)
/*     */               stringBuilder.append("[]"); 
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           return stringBuilder.toString();
/*     */         case 10:
/*     */           return (new String(this.buf, this.off, this.len)).replace('/', '.');
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public static Type getMethodType(Type paramType, Type... paramVarArgs) {
/*     */     return getType(getMethodDescriptor(paramType, paramVarArgs));
/*     */   }
/*     */   
/*     */   public static final Type DOUBLE_TYPE = new Type(8, null, 1141048066, 1);
/*     */   public static final Type CHAR_TYPE = new Type(2, null, 1124075009, 1);
/*     */   public static final int VOID = 0;
/*     */   public static final int BOOLEAN = 1;
/*     */   public static final int CHAR = 2;
/*     */   public static final int BYTE = 3;
/*     */   public static final int SHORT = 4;
/*     */   public static final int INT = 5;
/*     */   public static final int FLOAT = 6;
/*     */   public static final int LONG = 7;
/*     */   public static final int DOUBLE = 8;
/*     */   public static final int ARRAY = 9;
/*     */   public static final int OBJECT = 10;
/*     */   public static final int METHOD = 11;
/*     */   private final int sort;
/*     */   private final char[] buf;
/*     */   private final int off;
/*     */   private final int len;
/*     */   
/*     */   public static Type getType(Class<?> paramClass) {
/*     */     try {
/*     */       if (paramClass.isPrimitive()) {
/*     */         try {
/*     */           if (paramClass == int.class)
/*     */             return INT_TYPE; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */         try {
/*     */           if (paramClass == void.class)
/*     */             return VOID_TYPE; 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return getType(getDescriptor(paramClass));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int i = 13 * this.sort;
/*     */     if (this.sort >= 9)
/*     */       for (int j = this.off, k = j + this.len; j < k; ) {
/*     */         i = 17 * (i + this.buf[j]);
/*     */         j++;
/*     */       }  
/*     */     return i;
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */