/*     */ package org.spongepowered.asm.lib.util;public class ASMifier extends Printer { protected final String name; protected final int id; protected Map<Label, String> labelNames; private static final int ACCESS_CLASS = 262144; private static final int ACCESS_FIELD = 524288; private static final int ACCESS_INNER = 1048576; public ASMifier visitMethodAnnotation(String paramString, boolean paramBoolean) { return visitAnnotation(paramString, paramBoolean); } public Printer visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: ldc '{\\n'
/*     */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   17: ldc 'av0 = '
/*     */     //   19: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   22: aload_0
/*     */     //   23: getfield name : Ljava/lang/String;
/*     */     //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   29: ldc '.visitLocalVariableAnnotation('
/*     */     //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   34: pop
/*     */     //   35: aload_0
/*     */     //   36: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   39: iload_1
/*     */     //   40: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   43: pop
/*     */     //   44: aload_2
/*     */     //   45: ifnonnull -> 65
/*     */     //   48: aload_0
/*     */     //   49: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   52: ldc ', null, '
/*     */     //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   57: pop
/*     */     //   58: goto -> 84
/*     */     //   61: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   64: athrow
/*     */     //   65: aload_0
/*     */     //   66: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   69: ldc ', TypePath.fromString("'
/*     */     //   71: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   74: aload_2
/*     */     //   75: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*     */     //   78: ldc '"), '
/*     */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   83: pop
/*     */     //   84: aload_0
/*     */     //   85: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   88: ldc 'new Label[] {'
/*     */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   93: pop
/*     */     //   94: iconst_0
/*     */     //   95: istore #8
/*     */     //   97: iload #8
/*     */     //   99: aload_3
/*     */     //   100: arraylength
/*     */     //   101: if_icmpge -> 149
/*     */     //   104: aload_0
/*     */     //   105: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   108: iload #8
/*     */     //   110: ifne -> 129
/*     */     //   113: goto -> 120
/*     */     //   116: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   119: athrow
/*     */     //   120: ldc ' '
/*     */     //   122: goto -> 131
/*     */     //   125: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   128: athrow
/*     */     //   129: ldc ', '
/*     */     //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   134: pop
/*     */     //   135: aload_0
/*     */     //   136: aload_3
/*     */     //   137: iload #8
/*     */     //   139: aaload
/*     */     //   140: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   143: iinc #8, 1
/*     */     //   146: goto -> 97
/*     */     //   149: aload_0
/*     */     //   150: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   153: ldc ' }, new Label[] {'
/*     */     //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   158: pop
/*     */     //   159: iconst_0
/*     */     //   160: istore #8
/*     */     //   162: iload #8
/*     */     //   164: aload #4
/*     */     //   166: arraylength
/*     */     //   167: if_icmpge -> 216
/*     */     //   170: aload_0
/*     */     //   171: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   174: iload #8
/*     */     //   176: ifne -> 195
/*     */     //   179: goto -> 186
/*     */     //   182: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   185: athrow
/*     */     //   186: ldc ' '
/*     */     //   188: goto -> 197
/*     */     //   191: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   194: athrow
/*     */     //   195: ldc ', '
/*     */     //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   200: pop
/*     */     //   201: aload_0
/*     */     //   202: aload #4
/*     */     //   204: iload #8
/*     */     //   206: aaload
/*     */     //   207: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   210: iinc #8, 1
/*     */     //   213: goto -> 162
/*     */     //   216: aload_0
/*     */     //   217: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   220: ldc ' }, new int[] {'
/*     */     //   222: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   225: pop
/*     */     //   226: iconst_0
/*     */     //   227: istore #8
/*     */     //   229: iload #8
/*     */     //   231: aload #5
/*     */     //   233: arraylength
/*     */     //   234: if_icmpge -> 282
/*     */     //   237: aload_0
/*     */     //   238: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   241: iload #8
/*     */     //   243: ifne -> 262
/*     */     //   246: goto -> 253
/*     */     //   249: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   252: athrow
/*     */     //   253: ldc ' '
/*     */     //   255: goto -> 264
/*     */     //   258: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   261: athrow
/*     */     //   262: ldc ', '
/*     */     //   264: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   267: aload #5
/*     */     //   269: iload #8
/*     */     //   271: iaload
/*     */     //   272: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   275: pop
/*     */     //   276: iinc #8, 1
/*     */     //   279: goto -> 229
/*     */     //   282: aload_0
/*     */     //   283: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   286: ldc ' }, '
/*     */     //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   291: pop
/*     */     //   292: aload_0
/*     */     //   293: aload #6
/*     */     //   295: invokevirtual appendConstant : (Ljava/lang/Object;)V
/*     */     //   298: aload_0
/*     */     //   299: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   302: ldc ', '
/*     */     //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   307: iload #7
/*     */     //   309: invokevirtual append : (Z)Ljava/lang/StringBuffer;
/*     */     //   312: ldc ');\\n'
/*     */     //   314: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   317: pop
/*     */     //   318: aload_0
/*     */     //   319: getfield text : Ljava/util/List;
/*     */     //   322: aload_0
/*     */     //   323: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   326: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   329: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   334: pop
/*     */     //   335: aload_0
/*     */     //   336: ldc 'av'
/*     */     //   338: iconst_0
/*     */     //   339: invokevirtual createASMifier : (Ljava/lang/String;I)Lorg/spongepowered/asm/lib/util/ASMifier;
/*     */     //   342: astore #8
/*     */     //   344: aload_0
/*     */     //   345: getfield text : Ljava/util/List;
/*     */     //   348: aload #8
/*     */     //   350: invokevirtual getText : ()Ljava/util/List;
/*     */     //   353: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   358: pop
/*     */     //   359: aload_0
/*     */     //   360: getfield text : Ljava/util/List;
/*     */     //   363: ldc '}\\n'
/*     */     //   365: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   370: pop
/*     */     //   371: aload #8
/*     */     //   373: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #53	-> 0
/*     */     //   #323	-> 8
/*     */     //   #381	-> 31
/*     */     //   #514	-> 35
/*     */     //   #106	-> 44
/*     */     //   #475	-> 48
/*     */     //   #606	-> 65
/*     */     //   #306	-> 84
/*     */     //   #212	-> 94
/*     */     //   #537	-> 104
/*     */     //   #643	-> 135
/*     */     //   #522	-> 143
/*     */     //   #611	-> 149
/*     */     //   #720	-> 159
/*     */     //   #353	-> 170
/*     */     //   #583	-> 201
/*     */     //   #751	-> 210
/*     */     //   #28	-> 216
/*     */     //   #296	-> 226
/*     */     //   #370	-> 237
/*     */     //   #452	-> 276
/*     */     //   #82	-> 282
/*     */     //   #309	-> 292
/*     */     //   #706	-> 298
/*     */     //   #307	-> 318
/*     */     //   #770	-> 335
/*     */     //   #228	-> 344
/*     */     //   #417	-> 359
/*     */     //   #406	-> 371
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	61	61	java/lang/IllegalStateException
/*     */     //   97	113	116	java/lang/IllegalStateException
/*     */     //   104	125	125	java/lang/IllegalStateException
/*     */     //   162	179	182	java/lang/IllegalStateException
/*     */     //   170	191	191	java/lang/IllegalStateException
/*     */     //   229	246	249	java/lang/IllegalStateException
/*   1 */     //   237	258	258	java/lang/IllegalStateException } public void visitTypeInsn(int paramInt, String paramString) { this.buf.setLength(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 256 */     this.buf.append(this.name).append(".visitTypeInsn(").append(OPCODES[paramInt])
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 440 */       .append(", ");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 723 */     appendConstant(paramString); this.buf.append(");\n"); this.text.add(this.buf.toString()); }
/*     */   public ASMifier visitMethodTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean); }
/*     */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) { this.buf.setLength(0); this.buf.append(this.name).append(".visitFieldInsn(").append(OPCODES[paramInt]).append(", "); appendConstant(paramString1); this.buf.append(", "); appendConstant(paramString2); this.buf.append(", "); appendConstant(paramString3); this.buf.append(");\n"); this.text.add(this.buf.toString()); } public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { String str; int i = paramString1.lastIndexOf('/'); if (i == -1) { str = paramString1; } else { this.text.add("package asm." + paramString1.substring(0, i).replace('/', '.') + ";\n"); str = paramString1.substring(i + 1); }  try { this.text.add("import java.util.*;\n"); this.text.add("import org.objectweb.asm.*;\n"); this.text.add("public class " + str + "Dump implements Opcodes {\n\n"); this.text.add("public static byte[] dump () throws Exception {\n\n"); this.text.add("ClassWriter cw = new ClassWriter(0);\n"); this.text.add("FieldVisitor fv;\n"); this.text.add("MethodVisitor mv;\n"); this.text.add("AnnotationVisitor av0;\n\n"); this.buf.setLength(0); this.buf.append("cw.visit("); switch (paramInt1) { case 196653: this.buf.append("V1_1"); break;case 46: this.buf.append("V1_2"); break;case 47: this.buf.append("V1_3"); break;case 48: this.buf.append("V1_4"); break;
/*     */         case 49: this.buf.append("V1_5"); break;
/*     */         case 50: this.buf.append("V1_6"); break;
/*     */         case 51: this.buf.append("V1_7"); break;
/* 729 */         default: this.buf.append(paramInt1); break; }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { this.buf.append(", "); appendAccess(paramInt2 | 0x40000); this.buf.append(", "); appendConstant(paramString1); this.buf.append(", "); appendConstant(paramString2); this.buf.append(", "); appendConstant(paramString3); this.buf.append(", "); if (paramArrayOfString != null && paramArrayOfString.length > 0)
/*     */       { this.buf.append("new String[] {");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         byte b = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         while (true)
/*     */         { 
/*     */           try { if (b < paramArrayOfString.length)
/*     */             { try {
/*     */               
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               this.buf.append((b == 0) ? " " : ", ");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 773 */               appendConstant(paramArrayOfString[b]); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.buf.append(" }"); this.buf.append(");\n\n"); this.text.add(this.buf.toString()); return; }  }  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.buf.append("null"); this.buf.append(");\n\n"); this.text.add(this.buf.toString()); } public void visitSource(String paramString1, String paramString2) { this.buf.setLength(0); this.buf.append("cw.visitSource("); appendConstant(paramString1); this.buf.append(", "); appendConstant(paramString2); this.buf.append(");\n\n"); this.text.add(this.buf.toString()); } public void visitOuterClass(String paramString1, String paramString2, String paramString3) { this.buf.setLength(0); this.buf.append("cw.visitOuterClass("); appendConstant(paramString1); this.buf.append(", "); appendConstant(paramString2); this.buf.append(", "); appendConstant(paramString3); this.buf.append(");\n\n"); this.text.add(this.buf.toString()); } public void visitLabel(Label paramLabel) { this.buf.setLength(0); declareLabel(paramLabel); this.buf.append(this.name).append(".visitLabel("); appendLabel(paramLabel); this.buf.append(");\n"); this.text.add(this.buf.toString()); } public void visitParameter(String paramString, int paramInt) { this.buf.setLength(0); this.buf.append(this.name).append(".visitParameter("); appendString(this.buf, paramString); this.buf.append(", "); appendAccess(paramInt); this.text.add(this.buf.append(");\n").toString()); } public void visitAnnotationEnd() { this.buf.setLength(0); this.buf.append("av").append(this.id).append(".visitEnd();\n"); this.text.add(this.buf.toString()); }
/*     */   protected ASMifier createASMifier(String paramString, int paramInt) { return new ASMifier(327680, paramString, paramInt); }
/*     */   public ASMifier visitAnnotation(String paramString, boolean paramBoolean) { this.buf.setLength(0); this.buf.append("{\n").append("av0 = ").append(this.name).append(".visitAnnotation("); appendConstant(paramString); this.buf.append(", ").append(paramBoolean).append(");\n"); this.text.add(this.buf.toString()); ASMifier aSMifier = createASMifier("av", 0); this.text.add(aSMifier.getText()); this.text.add("}\n"); return aSMifier; }
/* 776 */   public void visitMethodEnd() { this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitEnd();\n");
/*     */     this.text.add(this.buf.toString()); }
/*     */ 
/*     */   
/*     */   public void visitMethodAttribute(Attribute paramAttribute) {
/*     */     visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   public ASMifier visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation("visitInsnAnnotation", paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("av").append(this.id).append(".visitEnum(");
/*     */     appendConstant(this.buf, paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(this.buf, paramString2);
/*     */     this.buf.append(", ");
/*     */     appendConstant(this.buf, paramString3);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*     */     try {
/*     */       if (this.api < 327680) {
/*     */         super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean);
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     doVisitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitFieldEnd() {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitEnd();\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitCode() {
/*     */     this.text.add(this.name + ".visitCode();\n");
/*     */   }
/*     */   
/*     */   public void visitClassEnd() {
/*     */     this.text.add("cw.visitEnd();\n\n");
/*     */     this.text.add("return cw.toByteArray();\n");
/*     */     this.text.add("}\n");
/*     */     this.text.add("}\n");
/*     */   }
/*     */   
/*     */   public ASMifier visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("{\n").append("av0 = ").append(this.name).append(".visitParameterAnnotation(").append(paramInt).append(", ");
/*     */     appendConstant(paramString);
/*     */     this.buf.append(", ").append(paramBoolean).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("av", 0);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   protected void appendConstant(Object paramObject) {
/*     */     appendConstant(this.buf, paramObject);
/*     */   }
/*     */   
/*     */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitLocalVariable(");
/*     */     appendConstant(paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString2);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString3);
/*     */     this.buf.append(", ");
/*     */     appendLabel(paramLabel1);
/*     */     this.buf.append(", ");
/*     */     appendLabel(paramLabel2);
/*     */     this.buf.append(", ").append(paramInt).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitAnnotationDefault() {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("{\n").append("av0 = ").append(this.name).append(".visitAnnotationDefault();\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("av", 0);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   public ASMifier visitFieldAnnotation(String paramString, boolean paramBoolean) {
/*     */     return visitAnnotation(paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public ASMifier visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation("visitTryCatchAnnotation", paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public ASMifier visitArray(String paramString) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("{\n");
/*     */     this.buf.append("AnnotationVisitor av").append(this.id + 1).append(" = av");
/*     */     this.buf.append(this.id).append(".visitArray(");
/*     */     appendConstant(this.buf, paramString);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("av", this.id + 1);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   public void visitFieldAttribute(Attribute paramAttribute) {
/*     */     visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*     */     this.buf.setLength(0);
/*     */     declareLabel(paramLabel);
/*     */     this.buf.append(this.name).append(".visitJumpInsn(").append(OPCODES[paramInt]).append(", ");
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) throws Exception {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_1
/*     */     //   2: iconst_2
/*     */     //   3: istore_2
/*     */     //   4: iconst_1
/*     */     //   5: istore_3
/*     */     //   6: aload_0
/*     */     //   7: arraylength
/*     */     //   8: iconst_1
/*     */     //   9: if_icmplt -> 25
/*     */     //   12: aload_0
/*     */     //   13: arraylength
/*     */     //   14: iconst_2
/*     */     //   15: if_icmple -> 27
/*     */     //   18: goto -> 25
/*     */     //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   24: athrow
/*     */     //   25: iconst_0
/*     */     //   26: istore_3
/*     */     //   27: iload_3
/*     */     //   28: ifeq -> 61
/*     */     //   31: ldc '-debug'
/*     */     //   33: aload_0
/*     */     //   34: iconst_0
/*     */     //   35: aaload
/*     */     //   36: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   39: ifeq -> 61
/*     */     //   42: goto -> 49
/*     */     //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   48: athrow
/*     */     //   49: iconst_1
/*     */     //   50: istore_1
/*     */     //   51: iconst_0
/*     */     //   52: istore_2
/*     */     //   53: aload_0
/*     */     //   54: arraylength
/*     */     //   55: iconst_2
/*     */     //   56: if_icmpeq -> 61
/*     */     //   59: iconst_0
/*     */     //   60: istore_3
/*     */     //   61: iload_3
/*     */     //   62: ifne -> 86
/*     */     //   65: getstatic java/lang/System.err : Ljava/io/PrintStream;
/*     */     //   68: ldc 'Prints the ASM code to generate the given class.'
/*     */     //   70: invokevirtual println : (Ljava/lang/String;)V
/*     */     //   73: getstatic java/lang/System.err : Ljava/io/PrintStream;
/*     */     //   76: ldc 'Usage: ASMifier [-debug] <fully qualified class name or class file name>'
/*     */     //   78: invokevirtual println : (Ljava/lang/String;)V
/*     */     //   81: return
/*     */     //   82: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   85: athrow
/*     */     //   86: aload_0
/*     */     //   87: iload_1
/*     */     //   88: aaload
/*     */     //   89: ldc '.class'
/*     */     //   91: invokevirtual endsWith : (Ljava/lang/String;)Z
/*     */     //   94: ifne -> 135
/*     */     //   97: aload_0
/*     */     //   98: iload_1
/*     */     //   99: aaload
/*     */     //   100: bipush #92
/*     */     //   102: invokevirtual indexOf : (I)I
/*     */     //   105: iconst_m1
/*     */     //   106: if_icmpgt -> 135
/*     */     //   109: goto -> 116
/*     */     //   112: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   115: athrow
/*     */     //   116: aload_0
/*     */     //   117: iload_1
/*     */     //   118: aaload
/*     */     //   119: bipush #47
/*     */     //   121: invokevirtual indexOf : (I)I
/*     */     //   124: iconst_m1
/*     */     //   125: if_icmple -> 157
/*     */     //   128: goto -> 135
/*     */     //   131: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   134: athrow
/*     */     //   135: new org/spongepowered/asm/lib/ClassReader
/*     */     //   138: dup
/*     */     //   139: new java/io/FileInputStream
/*     */     //   142: dup
/*     */     //   143: aload_0
/*     */     //   144: iload_1
/*     */     //   145: aaload
/*     */     //   146: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   149: invokespecial <init> : (Ljava/io/InputStream;)V
/*     */     //   152: astore #4
/*     */     //   154: goto -> 169
/*     */     //   157: new org/spongepowered/asm/lib/ClassReader
/*     */     //   160: dup
/*     */     //   161: aload_0
/*     */     //   162: iload_1
/*     */     //   163: aaload
/*     */     //   164: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   167: astore #4
/*     */     //   169: aload #4
/*     */     //   171: new org/spongepowered/asm/lib/util/TraceClassVisitor
/*     */     //   174: dup
/*     */     //   175: aconst_null
/*     */     //   176: new org/spongepowered/asm/lib/util/ASMifier
/*     */     //   179: dup
/*     */     //   180: invokespecial <init> : ()V
/*     */     //   183: new java/io/PrintWriter
/*     */     //   186: dup
/*     */     //   187: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   190: invokespecial <init> : (Ljava/io/OutputStream;)V
/*     */     //   193: invokespecial <init> : (Lorg/spongepowered/asm/lib/ClassVisitor;Lorg/spongepowered/asm/lib/util/Printer;Ljava/io/PrintWriter;)V
/*     */     //   196: iload_2
/*     */     //   197: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;I)V
/*     */     //   200: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #335	-> 0
/*     */     //   #738	-> 2
/*     */     //   #657	-> 4
/*     */     //   #233	-> 6
/*     */     //   #310	-> 25
/*     */     //   #435	-> 27
/*     */     //   #523	-> 49
/*     */     //   #543	-> 51
/*     */     //   #676	-> 53
/*     */     //   #635	-> 59
/*     */     //   #745	-> 61
/*     */     //   #320	-> 65
/*     */     //   #232	-> 70
/*     */     //   #386	-> 73
/*     */     //   #274	-> 81
/*     */     //   #497	-> 86
/*     */     //   #540	-> 121
/*     */     //   #517	-> 135
/*     */     //   #116	-> 157
/*     */     //   #119	-> 169
/*     */     //   #93	-> 200
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	18	21	java/lang/Exception
/*     */     //   27	42	45	java/lang/Exception
/*     */     //   61	82	82	java/lang/Exception
/*     */     //   86	109	112	java/lang/Exception
/*     */     //   97	128	131	java/lang/Exception
/*     */   }
/*     */   
/*     */   static void appendConstant(StringBuffer paramStringBuffer, Object paramObject) {
/*     */     try {
/*     */       if (paramObject == null) {
/*     */         paramStringBuffer.append("null");
/*     */       } else {
/*     */         try {
/*     */           if (paramObject instanceof String) {
/*     */             appendString(paramStringBuffer, (String)paramObject);
/*     */           } else {
/*     */             try {
/*     */               if (paramObject instanceof Type) {
/*     */                 paramStringBuffer.append("Type.getType(\"");
/*     */                 paramStringBuffer.append(((Type)paramObject).getDescriptor());
/*     */                 paramStringBuffer.append("\")");
/*     */               } else {
/*     */                 if (paramObject instanceof Handle) {
/*     */                   paramStringBuffer.append("new Handle(");
/*     */                   Handle handle = (Handle)paramObject;
/*     */                   paramStringBuffer.append("Opcodes.").append(HANDLE_TAG[handle.getTag()]).append(", \"");
/*     */                   paramStringBuffer.append(handle.getOwner()).append("\", \"");
/*     */                 } 
/*     */                 try {
/*     */                   if (paramObject instanceof Byte) {
/*     */                     paramStringBuffer.append("new Byte((byte)").append(paramObject).append(')');
/*     */                   } else {
/*     */                     try {
/*     */                       if (paramObject instanceof Boolean) {
/*     */                         try {
/*     */                         
/*     */                         } catch (IllegalStateException illegalStateException) {
/*     */                           throw b(null);
/*     */                         } 
/*     */                         paramStringBuffer.append(((Boolean)paramObject).booleanValue() ? "Boolean.TRUE" : "Boolean.FALSE");
/*     */                       } else {
/*     */                         try {
/*     */                           if (paramObject instanceof Short) {
/*     */                             paramStringBuffer.append("new Short((short)").append(paramObject).append(')');
/*     */                           } else if (paramObject instanceof Character) {
/*     */                             char c = ((Character)paramObject).charValue();
/*     */                             paramStringBuffer.append("new Character((char)").append(c).append(')');
/*     */                           } else {
/*     */                             try {
/*     */                               if (paramObject instanceof Integer) {
/*     */                                 paramStringBuffer.append("new Integer(").append(paramObject).append(')');
/*     */                               } else {
/*     */                                 try {
/*     */                                   if (paramObject instanceof Float) {
/*     */                                     paramStringBuffer.append("new Float(\"").append(paramObject).append("\")");
/*     */                                   } else {
/*     */                                     try {
/*     */                                       if (paramObject instanceof Long) {
/*     */                                         paramStringBuffer.append("new Long(").append(paramObject).append("L)");
/*     */                                       } else {
/*     */                                         try {
/*     */                                           if (paramObject instanceof Double) {
/*     */                                             paramStringBuffer.append("new Double(\"").append(paramObject).append("\")");
/*     */                                           } else {
/*     */                                             if (paramObject instanceof byte[]) {
/*     */                                               byte[] arrayOfByte = (byte[])paramObject;
/*     */                                               paramStringBuffer.append("new byte[] {");
/*     */                                               byte b = 0;
/*     */                                               while (true) {
/*     */                                                 try {
/*     */                                                   if (b < arrayOfByte.length) {
/*     */                                                     try {
/*     */                                                     
/*     */                                                     } catch (IllegalStateException illegalStateException) {
/*     */                                                       throw b(null);
/*     */                                                     } 
/*     */                                                     paramStringBuffer.append((b == 0) ? "" : ",").append(arrayOfByte[b]);
/*     */                                                     b++;
/*     */                                                     continue;
/*     */                                                   } 
/*     */                                                 } catch (IllegalStateException illegalStateException) {
/*     */                                                   throw b(null);
/*     */                                                 } 
/*     */                                                 paramStringBuffer.append('}');
/*     */                                                 return;
/*     */                                               } 
/*     */                                             } 
/*     */                                             if (paramObject instanceof boolean[]) {
/*     */                                               boolean[] arrayOfBoolean = (boolean[])paramObject;
/*     */                                               paramStringBuffer.append("new boolean[] {");
/*     */                                             } 
/*     */                                             if (paramObject instanceof short[]) {
/*     */                                               short[] arrayOfShort = (short[])paramObject;
/*     */                                               paramStringBuffer.append("new short[] {");
/*     */                                               boolean bool = false;
/*     */                                             } 
/*     */                                           } 
/*     */                                         } catch (IllegalStateException illegalStateException) {
/*     */                                           throw b(null);
/*     */                                         } 
/*     */                                       } 
/*     */                                     } catch (IllegalStateException illegalStateException) {
/*     */                                       throw b(null);
/*     */                                     } 
/*     */                                   } 
/*     */                                 } catch (IllegalStateException illegalStateException) {
/*     */                                   throw b(null);
/*     */                                 } 
/*     */                               } 
/*     */                             } catch (IllegalStateException illegalStateException) {
/*     */                               throw b(null);
/*     */                             } 
/*     */                           } 
/*     */                         } catch (IllegalStateException illegalStateException) {
/*     */                           throw b(null);
/*     */                         } 
/*     */                       } 
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     } 
/*     */                   } 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitInvokeDynamicInsn(");
/*     */     appendConstant(paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString2);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramHandle);
/*     */     this.buf.append(", new Object[]{");
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < paramVarArgs.length) {
/*     */           try {
/*     */             appendConstant(paramVarArgs[b]);
/*     */             if (b != paramVarArgs.length - 1)
/*     */               this.buf.append(", "); 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           b++;
/*     */           continue;
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       this.buf.append("});\n");
/*     */       this.text.add(this.buf.toString());
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitIincInsn(").append(paramInt1).append(", ").append(paramInt2).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   private void declareFrameTypes(int paramInt, Object[] paramArrayOfObject) {
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < paramInt) {
/*     */           try {
/*     */             if (paramArrayOfObject[b] instanceof Label)
/*     */               declareLabel((Label)paramArrayOfObject[b]); 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           b++;
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */   }
/*     */   
/*     */   protected void appendLabel(Label paramLabel) {
/*     */     this.buf.append(this.labelNames.get(paramLabel));
/*     */   }
/*     */   
/*     */   public ASMifier visitTypeAnnotation(String paramString1, int paramInt, TypePath paramTypePath, String paramString2, boolean paramBoolean) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append("{\n").append("av0 = ").append(this.name).append(".").append(paramString1).append("(");
/*     */       this.buf.append(paramInt);
/*     */       if (paramTypePath == null) {
/*     */         this.buf.append(", null, ");
/*     */       } else {
/*     */         this.buf.append(", TypePath.fromString(\"").append(paramTypePath).append("\"), ");
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     appendConstant(paramString2);
/*     */     this.buf.append(", ").append(paramBoolean).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("av", 0);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   protected void declareLabel(Label paramLabel) {
/*     */     try {
/*     */       if (this.labelNames == null)
/*     */         this.labelNames = new HashMap<Label, String>(); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     String str = this.labelNames.get(paramLabel);
/*     */     if (str == null) {
/*     */       str = "l" + this.labelNames.size();
/*     */       this.labelNames.put(paramLabel, str);
/*     */       this.buf.append("Label ").append(str).append(" = new Label();\n");
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(this.name).append(".visitIntInsn(").append(OPCODES[paramInt1]).append(", ").append((paramInt1 == 188) ? TYPES[paramInt2] : Integer.toString(paramInt2)).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitMultiANewArrayInsn(String paramString, int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitMultiANewArrayInsn(");
/*     */     appendConstant(paramString);
/*     */     this.buf.append(", ").append(paramInt).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitAnnotation(String paramString1, String paramString2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("{\n");
/*     */     this.buf.append("AnnotationVisitor av").append(this.id + 1).append(" = av");
/*     */     this.buf.append(this.id).append(".visitAnnotation(");
/*     */     appendConstant(this.buf, paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(this.buf, paramString2);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("av", this.id + 1);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   public ASMifier() {
/*     */     this(327680, "cw", 0);
/*     */     if (getClass() != ASMifier.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public ASMifier visitFieldTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visit(String paramString, Object paramObject) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("av").append(this.id).append(".visit(");
/*     */     appendConstant(this.buf, paramString);
/*     */     this.buf.append(", ");
/*     */     appendConstant(this.buf, paramObject);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*     */     this.buf.setLength(0);
/*     */     declareLabel(paramLabel1);
/*     */     declareLabel(paramLabel2);
/*     */     declareLabel(paramLabel3);
/*     */     this.buf.append(this.name).append(".visitTryCatchBlock(");
/*     */     appendLabel(paramLabel1);
/*     */     this.buf.append(", ");
/*     */     appendLabel(paramLabel2);
/*     */     this.buf.append(", ");
/*     */     appendLabel(paramLabel3);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("{\n");
/*     */     this.buf.append("fv = cw.visitField(");
/*     */     appendAccess(paramInt | 0x80000);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString2);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString3);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramObject);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */     ASMifier aSMifier = createASMifier("fv", 0);
/*     */     this.text.add(aSMifier.getText());
/*     */     this.text.add("}\n");
/*     */     return aSMifier;
/*     */   }
/*     */   
/*     */   private void appendFrameTypes(int paramInt, Object[] paramArrayOfObject) {
/*     */     byte b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < paramInt) {
/*     */           try {
/*     */             if (b > 0)
/*     */               this.buf.append(", "); 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           try {
/*     */             if (paramArrayOfObject[b] instanceof String) {
/*     */               appendConstant(paramArrayOfObject[b]);
/*     */             } else {
/*     */               try {
/*     */                 if (paramArrayOfObject[b] instanceof Integer) {
/*     */                   try {
/*     */                     switch (((Integer)paramArrayOfObject[b]).intValue()) {
/*     */                       case 0:
/*     */                         this.buf.append("Opcodes.TOP");
/*     */                         break;
/*     */                       case 1:
/*     */                         this.buf.append("Opcodes.INTEGER");
/*     */                         break;
/*     */                       case 2:
/*     */                         this.buf.append("Opcodes.FLOAT");
/*     */                         break;
/*     */                       case 3:
/*     */                         this.buf.append("Opcodes.DOUBLE");
/*     */                         break;
/*     */                       case 4:
/*     */                         this.buf.append("Opcodes.LONG");
/*     */                         break;
/*     */                       case 5:
/*     */                         this.buf.append("Opcodes.NULL");
/*     */                         break;
/*     */                       case 6:
/*     */                         this.buf.append("Opcodes.UNINITIALIZED_THIS");
/*     */                         break;
/*     */                     } 
/*     */                   } catch (IllegalStateException illegalStateException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                 } else {
/*     */                   appendLabel((Label)paramArrayOfObject[b]);
/*     */                 } 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLdcInsn(Object paramObject) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitLdcInsn(");
/*     */     appendConstant(paramObject);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation("visitTypeAnnotation", paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitVarInsn(").append(OPCODES[paramInt1]).append(", ").append(paramInt2).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitClassAnnotation(String paramString, boolean paramBoolean) {
/*     */     return visitAnnotation(paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitMaxs(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitMaxs(").append(paramInt1).append(", ").append(paramInt2).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitClassTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitInsn(int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitInsn(").append(OPCODES[paramInt]).append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       switch (paramInt1) {
/*     */         case -1:
/*     */         case 0:
/*     */           try {
/*     */             declareFrameTypes(paramInt2, paramArrayOfObject1);
/*     */             declareFrameTypes(paramInt3, paramArrayOfObject2);
/*     */             if (paramInt1 == -1) {
/*     */               this.buf.append(this.name).append(".visitFrame(Opcodes.F_NEW, ");
/*     */             } else {
/*     */               this.buf.append(this.name).append(".visitFrame(Opcodes.F_FULL, ");
/*     */             } 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           this.buf.append(paramInt2).append(", new Object[] {");
/*     */           appendFrameTypes(paramInt2, paramArrayOfObject1);
/*     */           this.buf.append("}, ").append(paramInt3).append(", new Object[] {");
/*     */           appendFrameTypes(paramInt3, paramArrayOfObject2);
/*     */           this.buf.append('}');
/*     */           break;
/*     */         case 1:
/*     */           declareFrameTypes(paramInt2, paramArrayOfObject1);
/*     */           this.buf.append(this.name).append(".visitFrame(Opcodes.F_APPEND,").append(paramInt2).append(", new Object[] {");
/*     */           appendFrameTypes(paramInt2, paramArrayOfObject1);
/*     */           this.buf.append("}, 0, null");
/*     */           break;
/*     */         case 2:
/*     */           this.buf.append(this.name).append(".visitFrame(Opcodes.F_CHOP,").append(paramInt2).append(", null, 0, null");
/*     */           break;
/*     */         case 3:
/*     */           this.buf.append(this.name).append(".visitFrame(Opcodes.F_SAME, 0, null, 0, null");
/*     */           break;
/*     */         case 4:
/*     */           declareFrameTypes(1, paramArrayOfObject2);
/*     */           this.buf.append(this.name).append(".visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {");
/*     */           appendFrameTypes(1, paramArrayOfObject2);
/*     */           this.buf.append('}');
/*     */           break;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: iconst_0
/*     */     //   9: istore #4
/*     */     //   11: iload #4
/*     */     //   13: aload_3
/*     */     //   14: arraylength
/*     */     //   15: if_icmpge -> 36
/*     */     //   18: aload_0
/*     */     //   19: aload_3
/*     */     //   20: iload #4
/*     */     //   22: aaload
/*     */     //   23: invokevirtual declareLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   26: iinc #4, 1
/*     */     //   29: goto -> 11
/*     */     //   32: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   35: athrow
/*     */     //   36: aload_0
/*     */     //   37: aload_1
/*     */     //   38: invokevirtual declareLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   41: aload_0
/*     */     //   42: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   45: aload_0
/*     */     //   46: getfield name : Ljava/lang/String;
/*     */     //   49: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   52: ldc '.visitLookupSwitchInsn('
/*     */     //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   57: pop
/*     */     //   58: aload_0
/*     */     //   59: aload_1
/*     */     //   60: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   63: aload_0
/*     */     //   64: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   67: ldc ', new int[] {'
/*     */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   72: pop
/*     */     //   73: iconst_0
/*     */     //   74: istore #4
/*     */     //   76: iload #4
/*     */     //   78: aload_2
/*     */     //   79: arraylength
/*     */     //   80: if_icmpge -> 127
/*     */     //   83: aload_0
/*     */     //   84: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   87: iload #4
/*     */     //   89: ifne -> 108
/*     */     //   92: goto -> 99
/*     */     //   95: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   98: athrow
/*     */     //   99: ldc ' '
/*     */     //   101: goto -> 110
/*     */     //   104: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   107: athrow
/*     */     //   108: ldc ', '
/*     */     //   110: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   113: aload_2
/*     */     //   114: iload #4
/*     */     //   116: iaload
/*     */     //   117: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   120: pop
/*     */     //   121: iinc #4, 1
/*     */     //   124: goto -> 76
/*     */     //   127: aload_0
/*     */     //   128: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   131: ldc ' }, new Label[] {'
/*     */     //   133: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   136: pop
/*     */     //   137: iconst_0
/*     */     //   138: istore #4
/*     */     //   140: iload #4
/*     */     //   142: aload_3
/*     */     //   143: arraylength
/*     */     //   144: if_icmpge -> 192
/*     */     //   147: aload_0
/*     */     //   148: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   151: iload #4
/*     */     //   153: ifne -> 172
/*     */     //   156: goto -> 163
/*     */     //   159: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   162: athrow
/*     */     //   163: ldc ' '
/*     */     //   165: goto -> 174
/*     */     //   168: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   171: athrow
/*     */     //   172: ldc ', '
/*     */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   177: pop
/*     */     //   178: aload_0
/*     */     //   179: aload_3
/*     */     //   180: iload #4
/*     */     //   182: aaload
/*     */     //   183: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   186: iinc #4, 1
/*     */     //   189: goto -> 140
/*     */     //   192: aload_0
/*     */     //   193: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   196: ldc ' });\\n'
/*     */     //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   201: pop
/*     */     //   202: aload_0
/*     */     //   203: getfield text : Ljava/util/List;
/*     */     //   206: aload_0
/*     */     //   207: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   210: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   213: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   218: pop
/*     */     //   219: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #673	-> 0
/*     */     //   #305	-> 8
/*     */     //   #447	-> 18
/*     */     //   #261	-> 26
/*     */     //   #152	-> 36
/*     */     //   #670	-> 41
/*     */     //   #245	-> 58
/*     */     //   #601	-> 63
/*     */     //   #319	-> 73
/*     */     //   #333	-> 83
/*     */     //   #74	-> 121
/*     */     //   #97	-> 127
/*     */     //   #444	-> 137
/*     */     //   #460	-> 147
/*     */     //   #416	-> 178
/*     */     //   #556	-> 186
/*     */     //   #453	-> 192
/*     */     //   #142	-> 202
/*     */     //   #698	-> 219
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	32	32	java/lang/IllegalStateException
/*     */     //   76	92	95	java/lang/IllegalStateException
/*     */     //   83	104	104	java/lang/IllegalStateException
/*     */     //   140	156	159	java/lang/IllegalStateException
/*     */     //   147	168	168	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.name).append(".visitLineNumber(").append(paramInt).append(", ");
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append("cw.visitInnerClass(");
/*     */     appendConstant(paramString1);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString2);
/*     */     this.buf.append(", ");
/*     */     appendConstant(paramString3);
/*     */     this.buf.append(", ");
/*     */     appendAccess(paramInt | 0x100000);
/*     */     this.buf.append(");\n\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   void appendAccess(int paramInt) {
/*     */     // Byte code:
/*     */     //   0: iconst_1
/*     */     //   1: istore_2
/*     */     //   2: iload_1
/*     */     //   3: iconst_1
/*     */     //   4: iand
/*     */     //   5: ifeq -> 20
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: ldc 'ACC_PUBLIC'
/*     */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   17: pop
/*     */     //   18: iconst_0
/*     */     //   19: istore_2
/*     */     //   20: iload_1
/*     */     //   21: iconst_2
/*     */     //   22: iand
/*     */     //   23: ifeq -> 38
/*     */     //   26: aload_0
/*     */     //   27: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   30: ldc 'ACC_PRIVATE'
/*     */     //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   35: pop
/*     */     //   36: iconst_0
/*     */     //   37: istore_2
/*     */     //   38: iload_1
/*     */     //   39: iconst_4
/*     */     //   40: iand
/*     */     //   41: ifeq -> 56
/*     */     //   44: aload_0
/*     */     //   45: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   48: ldc 'ACC_PROTECTED'
/*     */     //   50: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   53: pop
/*     */     //   54: iconst_0
/*     */     //   55: istore_2
/*     */     //   56: iload_1
/*     */     //   57: bipush #16
/*     */     //   59: iand
/*     */     //   60: ifeq -> 103
/*     */     //   63: iload_2
/*     */     //   64: ifne -> 91
/*     */     //   67: goto -> 74
/*     */     //   70: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   73: athrow
/*     */     //   74: aload_0
/*     */     //   75: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   78: ldc ' + '
/*     */     //   80: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   83: pop
/*     */     //   84: goto -> 91
/*     */     //   87: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   90: athrow
/*     */     //   91: aload_0
/*     */     //   92: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   95: ldc 'ACC_FINAL'
/*     */     //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   100: pop
/*     */     //   101: iconst_0
/*     */     //   102: istore_2
/*     */     //   103: iload_1
/*     */     //   104: bipush #8
/*     */     //   106: iand
/*     */     //   107: ifeq -> 150
/*     */     //   110: iload_2
/*     */     //   111: ifne -> 138
/*     */     //   114: goto -> 121
/*     */     //   117: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   120: athrow
/*     */     //   121: aload_0
/*     */     //   122: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   125: ldc ' + '
/*     */     //   127: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   130: pop
/*     */     //   131: goto -> 138
/*     */     //   134: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   137: athrow
/*     */     //   138: aload_0
/*     */     //   139: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   142: ldc 'ACC_STATIC'
/*     */     //   144: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   147: pop
/*     */     //   148: iconst_0
/*     */     //   149: istore_2
/*     */     //   150: iload_1
/*     */     //   151: bipush #32
/*     */     //   153: iand
/*     */     //   154: ifeq -> 221
/*     */     //   157: iload_2
/*     */     //   158: ifne -> 185
/*     */     //   161: goto -> 168
/*     */     //   164: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: aload_0
/*     */     //   169: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   172: ldc ' + '
/*     */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   177: pop
/*     */     //   178: goto -> 185
/*     */     //   181: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   184: athrow
/*     */     //   185: iload_1
/*     */     //   186: ldc 262144
/*     */     //   188: iand
/*     */     //   189: ifne -> 209
/*     */     //   192: aload_0
/*     */     //   193: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   196: ldc 'ACC_SYNCHRONIZED'
/*     */     //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   201: pop
/*     */     //   202: goto -> 219
/*     */     //   205: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   208: athrow
/*     */     //   209: aload_0
/*     */     //   210: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   213: ldc 'ACC_SUPER'
/*     */     //   215: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   218: pop
/*     */     //   219: iconst_0
/*     */     //   220: istore_2
/*     */     //   221: iload_1
/*     */     //   222: bipush #64
/*     */     //   224: iand
/*     */     //   225: ifeq -> 282
/*     */     //   228: iload_1
/*     */     //   229: ldc 524288
/*     */     //   231: iand
/*     */     //   232: ifeq -> 282
/*     */     //   235: goto -> 242
/*     */     //   238: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   241: athrow
/*     */     //   242: iload_2
/*     */     //   243: ifne -> 270
/*     */     //   246: goto -> 253
/*     */     //   249: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   252: athrow
/*     */     //   253: aload_0
/*     */     //   254: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   257: ldc ' + '
/*     */     //   259: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   262: pop
/*     */     //   263: goto -> 270
/*     */     //   266: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   269: athrow
/*     */     //   270: aload_0
/*     */     //   271: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   274: ldc 'ACC_VOLATILE'
/*     */     //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   279: pop
/*     */     //   280: iconst_0
/*     */     //   281: istore_2
/*     */     //   282: iload_1
/*     */     //   283: bipush #64
/*     */     //   285: iand
/*     */     //   286: ifeq -> 357
/*     */     //   289: iload_1
/*     */     //   290: ldc 262144
/*     */     //   292: iand
/*     */     //   293: ifne -> 357
/*     */     //   296: goto -> 303
/*     */     //   299: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   302: athrow
/*     */     //   303: iload_1
/*     */     //   304: ldc 524288
/*     */     //   306: iand
/*     */     //   307: ifne -> 357
/*     */     //   310: goto -> 317
/*     */     //   313: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   316: athrow
/*     */     //   317: iload_2
/*     */     //   318: ifne -> 345
/*     */     //   321: goto -> 328
/*     */     //   324: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   327: athrow
/*     */     //   328: aload_0
/*     */     //   329: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   332: ldc ' + '
/*     */     //   334: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   337: pop
/*     */     //   338: goto -> 345
/*     */     //   341: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   344: athrow
/*     */     //   345: aload_0
/*     */     //   346: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   349: ldc 'ACC_BRIDGE'
/*     */     //   351: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   354: pop
/*     */     //   355: iconst_0
/*     */     //   356: istore_2
/*     */     //   357: iload_1
/*     */     //   358: sipush #128
/*     */     //   361: iand
/*     */     //   362: ifeq -> 433
/*     */     //   365: iload_1
/*     */     //   366: ldc 262144
/*     */     //   368: iand
/*     */     //   369: ifne -> 433
/*     */     //   372: goto -> 379
/*     */     //   375: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   378: athrow
/*     */     //   379: iload_1
/*     */     //   380: ldc 524288
/*     */     //   382: iand
/*     */     //   383: ifne -> 433
/*     */     //   386: goto -> 393
/*     */     //   389: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   392: athrow
/*     */     //   393: iload_2
/*     */     //   394: ifne -> 421
/*     */     //   397: goto -> 404
/*     */     //   400: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   403: athrow
/*     */     //   404: aload_0
/*     */     //   405: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   408: ldc ' + '
/*     */     //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   413: pop
/*     */     //   414: goto -> 421
/*     */     //   417: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   420: athrow
/*     */     //   421: aload_0
/*     */     //   422: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   425: ldc 'ACC_VARARGS'
/*     */     //   427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   430: pop
/*     */     //   431: iconst_0
/*     */     //   432: istore_2
/*     */     //   433: iload_1
/*     */     //   434: sipush #128
/*     */     //   437: iand
/*     */     //   438: ifeq -> 495
/*     */     //   441: iload_1
/*     */     //   442: ldc 524288
/*     */     //   444: iand
/*     */     //   445: ifeq -> 495
/*     */     //   448: goto -> 455
/*     */     //   451: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   454: athrow
/*     */     //   455: iload_2
/*     */     //   456: ifne -> 483
/*     */     //   459: goto -> 466
/*     */     //   462: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   465: athrow
/*     */     //   466: aload_0
/*     */     //   467: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   470: ldc ' + '
/*     */     //   472: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   475: pop
/*     */     //   476: goto -> 483
/*     */     //   479: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   482: athrow
/*     */     //   483: aload_0
/*     */     //   484: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   487: ldc 'ACC_TRANSIENT'
/*     */     //   489: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   492: pop
/*     */     //   493: iconst_0
/*     */     //   494: istore_2
/*     */     //   495: iload_1
/*     */     //   496: sipush #256
/*     */     //   499: iand
/*     */     //   500: ifeq -> 571
/*     */     //   503: iload_1
/*     */     //   504: ldc 262144
/*     */     //   506: iand
/*     */     //   507: ifne -> 571
/*     */     //   510: goto -> 517
/*     */     //   513: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   516: athrow
/*     */     //   517: iload_1
/*     */     //   518: ldc 524288
/*     */     //   520: iand
/*     */     //   521: ifne -> 571
/*     */     //   524: goto -> 531
/*     */     //   527: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   530: athrow
/*     */     //   531: iload_2
/*     */     //   532: ifne -> 559
/*     */     //   535: goto -> 542
/*     */     //   538: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   541: athrow
/*     */     //   542: aload_0
/*     */     //   543: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   546: ldc ' + '
/*     */     //   548: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   551: pop
/*     */     //   552: goto -> 559
/*     */     //   555: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   558: athrow
/*     */     //   559: aload_0
/*     */     //   560: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   563: ldc 'ACC_NATIVE'
/*     */     //   565: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   568: pop
/*     */     //   569: iconst_0
/*     */     //   570: istore_2
/*     */     //   571: iload_1
/*     */     //   572: sipush #16384
/*     */     //   575: iand
/*     */     //   576: ifeq -> 661
/*     */     //   579: iload_1
/*     */     //   580: ldc 262144
/*     */     //   582: iand
/*     */     //   583: ifne -> 621
/*     */     //   586: goto -> 593
/*     */     //   589: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   592: athrow
/*     */     //   593: iload_1
/*     */     //   594: ldc 524288
/*     */     //   596: iand
/*     */     //   597: ifne -> 621
/*     */     //   600: goto -> 607
/*     */     //   603: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   606: athrow
/*     */     //   607: iload_1
/*     */     //   608: ldc 1048576
/*     */     //   610: iand
/*     */     //   611: ifeq -> 661
/*     */     //   614: goto -> 621
/*     */     //   617: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   620: athrow
/*     */     //   621: iload_2
/*     */     //   622: ifne -> 649
/*     */     //   625: goto -> 632
/*     */     //   628: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   631: athrow
/*     */     //   632: aload_0
/*     */     //   633: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   636: ldc ' + '
/*     */     //   638: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   641: pop
/*     */     //   642: goto -> 649
/*     */     //   645: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   648: athrow
/*     */     //   649: aload_0
/*     */     //   650: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   653: ldc 'ACC_ENUM'
/*     */     //   655: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   658: pop
/*     */     //   659: iconst_0
/*     */     //   660: istore_2
/*     */     //   661: iload_1
/*     */     //   662: sipush #8192
/*     */     //   665: iand
/*     */     //   666: ifeq -> 737
/*     */     //   669: iload_1
/*     */     //   670: ldc 262144
/*     */     //   672: iand
/*     */     //   673: ifne -> 697
/*     */     //   676: goto -> 683
/*     */     //   679: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   682: athrow
/*     */     //   683: iload_1
/*     */     //   684: ldc 1048576
/*     */     //   686: iand
/*     */     //   687: ifeq -> 737
/*     */     //   690: goto -> 697
/*     */     //   693: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   696: athrow
/*     */     //   697: iload_2
/*     */     //   698: ifne -> 725
/*     */     //   701: goto -> 708
/*     */     //   704: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   707: athrow
/*     */     //   708: aload_0
/*     */     //   709: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   712: ldc ' + '
/*     */     //   714: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   717: pop
/*     */     //   718: goto -> 725
/*     */     //   721: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   724: athrow
/*     */     //   725: aload_0
/*     */     //   726: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   729: ldc 'ACC_ANNOTATION'
/*     */     //   731: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   734: pop
/*     */     //   735: iconst_0
/*     */     //   736: istore_2
/*     */     //   737: iload_1
/*     */     //   738: sipush #1024
/*     */     //   741: iand
/*     */     //   742: ifeq -> 785
/*     */     //   745: iload_2
/*     */     //   746: ifne -> 773
/*     */     //   749: goto -> 756
/*     */     //   752: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   755: athrow
/*     */     //   756: aload_0
/*     */     //   757: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   760: ldc ' + '
/*     */     //   762: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   765: pop
/*     */     //   766: goto -> 773
/*     */     //   769: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   772: athrow
/*     */     //   773: aload_0
/*     */     //   774: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   777: ldc 'ACC_ABSTRACT'
/*     */     //   779: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   782: pop
/*     */     //   783: iconst_0
/*     */     //   784: istore_2
/*     */     //   785: iload_1
/*     */     //   786: sipush #512
/*     */     //   789: iand
/*     */     //   790: ifeq -> 833
/*     */     //   793: iload_2
/*     */     //   794: ifne -> 821
/*     */     //   797: goto -> 804
/*     */     //   800: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   803: athrow
/*     */     //   804: aload_0
/*     */     //   805: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   808: ldc ' + '
/*     */     //   810: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   813: pop
/*     */     //   814: goto -> 821
/*     */     //   817: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   820: athrow
/*     */     //   821: aload_0
/*     */     //   822: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   825: ldc 'ACC_INTERFACE'
/*     */     //   827: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   830: pop
/*     */     //   831: iconst_0
/*     */     //   832: istore_2
/*     */     //   833: iload_1
/*     */     //   834: sipush #2048
/*     */     //   837: iand
/*     */     //   838: ifeq -> 881
/*     */     //   841: iload_2
/*     */     //   842: ifne -> 869
/*     */     //   845: goto -> 852
/*     */     //   848: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   851: athrow
/*     */     //   852: aload_0
/*     */     //   853: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   856: ldc ' + '
/*     */     //   858: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   861: pop
/*     */     //   862: goto -> 869
/*     */     //   865: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   868: athrow
/*     */     //   869: aload_0
/*     */     //   870: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   873: ldc 'ACC_STRICT'
/*     */     //   875: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   878: pop
/*     */     //   879: iconst_0
/*     */     //   880: istore_2
/*     */     //   881: iload_1
/*     */     //   882: sipush #4096
/*     */     //   885: iand
/*     */     //   886: ifeq -> 929
/*     */     //   889: iload_2
/*     */     //   890: ifne -> 917
/*     */     //   893: goto -> 900
/*     */     //   896: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   899: athrow
/*     */     //   900: aload_0
/*     */     //   901: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   904: ldc ' + '
/*     */     //   906: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   909: pop
/*     */     //   910: goto -> 917
/*     */     //   913: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   916: athrow
/*     */     //   917: aload_0
/*     */     //   918: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   921: ldc 'ACC_SYNTHETIC'
/*     */     //   923: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   926: pop
/*     */     //   927: iconst_0
/*     */     //   928: istore_2
/*     */     //   929: iload_1
/*     */     //   930: ldc 131072
/*     */     //   932: iand
/*     */     //   933: ifeq -> 976
/*     */     //   936: iload_2
/*     */     //   937: ifne -> 964
/*     */     //   940: goto -> 947
/*     */     //   943: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   946: athrow
/*     */     //   947: aload_0
/*     */     //   948: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   951: ldc ' + '
/*     */     //   953: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   956: pop
/*     */     //   957: goto -> 964
/*     */     //   960: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   963: athrow
/*     */     //   964: aload_0
/*     */     //   965: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   968: ldc 'ACC_DEPRECATED'
/*     */     //   970: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   973: pop
/*     */     //   974: iconst_0
/*     */     //   975: istore_2
/*     */     //   976: iload_1
/*     */     //   977: ldc 32768
/*     */     //   979: iand
/*     */     //   980: ifeq -> 1023
/*     */     //   983: iload_2
/*     */     //   984: ifne -> 1011
/*     */     //   987: goto -> 994
/*     */     //   990: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   993: athrow
/*     */     //   994: aload_0
/*     */     //   995: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   998: ldc ' + '
/*     */     //   1000: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   1003: pop
/*     */     //   1004: goto -> 1011
/*     */     //   1007: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1010: athrow
/*     */     //   1011: aload_0
/*     */     //   1012: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   1015: ldc 'ACC_MANDATED'
/*     */     //   1017: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   1020: pop
/*     */     //   1021: iconst_0
/*     */     //   1022: istore_2
/*     */     //   1023: iload_2
/*     */     //   1024: ifeq -> 1044
/*     */     //   1027: aload_0
/*     */     //   1028: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   1031: bipush #48
/*     */     //   1033: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   1036: pop
/*     */     //   1037: goto -> 1044
/*     */     //   1040: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1043: athrow
/*     */     //   1044: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #717	-> 0
/*     */     //   #155	-> 2
/*     */     //   #554	-> 8
/*     */     //   #172	-> 18
/*     */     //   #434	-> 20
/*     */     //   #685	-> 26
/*     */     //   #476	-> 36
/*     */     //   #46	-> 38
/*     */     //   #574	-> 44
/*     */     //   #655	-> 54
/*     */     //   #47	-> 56
/*     */     //   #403	-> 63
/*     */     //   #701	-> 74
/*     */     //   #35	-> 91
/*     */     //   #156	-> 101
/*     */     //   #287	-> 103
/*     */     //   #661	-> 110
/*     */     //   #355	-> 121
/*     */     //   #48	-> 138
/*     */     //   #181	-> 148
/*     */     //   #280	-> 150
/*     */     //   #200	-> 157
/*     */     //   #192	-> 168
/*     */     //   #520	-> 185
/*     */     //   #41	-> 192
/*     */     //   #464	-> 209
/*     */     //   #394	-> 219
/*     */     //   #127	-> 221
/*     */     //   #231	-> 242
/*     */     //   #436	-> 253
/*     */     //   #340	-> 270
/*     */     //   #397	-> 280
/*     */     //   #767	-> 282
/*     */     //   #544	-> 317
/*     */     //   #541	-> 328
/*     */     //   #730	-> 345
/*     */     //   #420	-> 355
/*     */     //   #507	-> 357
/*     */     //   #238	-> 393
/*     */     //   #20	-> 404
/*     */     //   #534	-> 421
/*     */     //   #419	-> 431
/*     */     //   #750	-> 433
/*     */     //   #291	-> 455
/*     */     //   #691	-> 466
/*     */     //   #628	-> 483
/*     */     //   #141	-> 493
/*     */     //   #713	-> 495
/*     */     //   #44	-> 531
/*     */     //   #648	-> 542
/*     */     //   #360	-> 559
/*     */     //   #605	-> 569
/*     */     //   #133	-> 571
/*     */     //   #72	-> 621
/*     */     //   #553	-> 632
/*     */     //   #735	-> 649
/*     */     //   #686	-> 659
/*     */     //   #104	-> 661
/*     */     //   #432	-> 697
/*     */     //   #236	-> 708
/*     */     //   #337	-> 725
/*     */     //   #688	-> 735
/*     */     //   #454	-> 737
/*     */     //   #572	-> 745
/*     */     //   #505	-> 756
/*     */     //   #268	-> 773
/*     */     //   #341	-> 783
/*     */     //   #371	-> 785
/*     */     //   #22	-> 793
/*     */     //   #8	-> 804
/*     */     //   #455	-> 821
/*     */     //   #29	-> 831
/*     */     //   #457	-> 833
/*     */     //   #299	-> 841
/*     */     //   #213	-> 852
/*     */     //   #88	-> 869
/*     */     //   #332	-> 879
/*     */     //   #178	-> 881
/*     */     //   #510	-> 889
/*     */     //   #737	-> 900
/*     */     //   #760	-> 917
/*     */     //   #168	-> 927
/*     */     //   #658	-> 929
/*     */     //   #642	-> 936
/*     */     //   #184	-> 947
/*     */     //   #342	-> 964
/*     */     //   #679	-> 974
/*     */     //   #599	-> 976
/*     */     //   #329	-> 983
/*     */     //   #284	-> 994
/*     */     //   #724	-> 1011
/*     */     //   #289	-> 1021
/*     */     //   #199	-> 1023
/*     */     //   #442	-> 1027
/*     */     //   #76	-> 1044
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   56	67	70	java/lang/IllegalStateException
/*     */     //   63	84	87	java/lang/IllegalStateException
/*     */     //   103	114	117	java/lang/IllegalStateException
/*     */     //   110	131	134	java/lang/IllegalStateException
/*     */     //   150	161	164	java/lang/IllegalStateException
/*     */     //   157	178	181	java/lang/IllegalStateException
/*     */     //   185	205	205	java/lang/IllegalStateException
/*     */     //   221	235	238	java/lang/IllegalStateException
/*     */     //   228	246	249	java/lang/IllegalStateException
/*     */     //   242	263	266	java/lang/IllegalStateException
/*     */     //   282	296	299	java/lang/IllegalStateException
/*     */     //   289	310	313	java/lang/IllegalStateException
/*     */     //   303	321	324	java/lang/IllegalStateException
/*     */     //   317	338	341	java/lang/IllegalStateException
/*     */     //   357	372	375	java/lang/IllegalStateException
/*     */     //   365	386	389	java/lang/IllegalStateException
/*     */     //   379	397	400	java/lang/IllegalStateException
/*     */     //   393	414	417	java/lang/IllegalStateException
/*     */     //   433	448	451	java/lang/IllegalStateException
/*     */     //   441	459	462	java/lang/IllegalStateException
/*     */     //   455	476	479	java/lang/IllegalStateException
/*     */     //   495	510	513	java/lang/IllegalStateException
/*     */     //   503	524	527	java/lang/IllegalStateException
/*     */     //   517	535	538	java/lang/IllegalStateException
/*     */     //   531	552	555	java/lang/IllegalStateException
/*     */     //   571	586	589	java/lang/IllegalStateException
/*     */     //   579	600	603	java/lang/IllegalStateException
/*     */     //   593	614	617	java/lang/IllegalStateException
/*     */     //   607	625	628	java/lang/IllegalStateException
/*     */     //   621	642	645	java/lang/IllegalStateException
/*     */     //   661	676	679	java/lang/IllegalStateException
/*     */     //   669	690	693	java/lang/IllegalStateException
/*     */     //   683	701	704	java/lang/IllegalStateException
/*     */     //   697	718	721	java/lang/IllegalStateException
/*     */     //   737	749	752	java/lang/IllegalStateException
/*     */     //   745	766	769	java/lang/IllegalStateException
/*     */     //   785	797	800	java/lang/IllegalStateException
/*     */     //   793	814	817	java/lang/IllegalStateException
/*     */     //   833	845	848	java/lang/IllegalStateException
/*     */     //   841	862	865	java/lang/IllegalStateException
/*     */     //   881	893	896	java/lang/IllegalStateException
/*     */     //   889	910	913	java/lang/IllegalStateException
/*     */     //   929	940	943	java/lang/IllegalStateException
/*     */     //   936	957	960	java/lang/IllegalStateException
/*     */     //   976	987	990	java/lang/IllegalStateException
/*     */     //   983	1004	1007	java/lang/IllegalStateException
/*     */     //   1023	1037	1040	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
/*     */     try {
/*     */       if (this.api >= 327680) {
/*     */         super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3);
/*     */         return;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     doVisitMethodInsn(paramInt, paramString1, paramString2, paramString3, (paramInt == 185));
/*     */   }
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: ldc '// ATTRIBUTE '
/*     */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   17: aload_1
/*     */     //   18: getfield type : Ljava/lang/String;
/*     */     //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   24: bipush #10
/*     */     //   26: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   29: pop
/*     */     //   30: aload_1
/*     */     //   31: instanceof org/spongepowered/asm/lib/util/ASMifiable
/*     */     //   34: ifeq -> 125
/*     */     //   37: aload_0
/*     */     //   38: getfield labelNames : Ljava/util/Map;
/*     */     //   41: ifnonnull -> 69
/*     */     //   44: goto -> 51
/*     */     //   47: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   50: athrow
/*     */     //   51: aload_0
/*     */     //   52: new java/util/HashMap
/*     */     //   55: dup
/*     */     //   56: invokespecial <init> : ()V
/*     */     //   59: putfield labelNames : Ljava/util/Map;
/*     */     //   62: goto -> 69
/*     */     //   65: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   68: athrow
/*     */     //   69: aload_0
/*     */     //   70: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   73: ldc '{\\n'
/*     */     //   75: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   78: pop
/*     */     //   79: aload_1
/*     */     //   80: checkcast org/spongepowered/asm/lib/util/ASMifiable
/*     */     //   83: aload_0
/*     */     //   84: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   87: ldc 'attr'
/*     */     //   89: aload_0
/*     */     //   90: getfield labelNames : Ljava/util/Map;
/*     */     //   93: invokeinterface asmify : (Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/util/Map;)V
/*     */     //   98: aload_0
/*     */     //   99: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   102: aload_0
/*     */     //   103: getfield name : Ljava/lang/String;
/*     */     //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   109: ldc '.visitAttribute(attr);\\n'
/*     */     //   111: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   114: pop
/*     */     //   115: aload_0
/*     */     //   116: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   119: ldc '}\\n'
/*     */     //   121: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   124: pop
/*     */     //   125: aload_0
/*     */     //   126: getfield text : Ljava/util/List;
/*     */     //   129: aload_0
/*     */     //   130: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   133: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   141: pop
/*     */     //   142: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #732	-> 0
/*     */     //   #59	-> 8
/*     */     //   #493	-> 30
/*     */     //   #160	-> 37
/*     */     //   #524	-> 51
/*     */     //   #748	-> 69
/*     */     //   #19	-> 79
/*     */     //   #279	-> 98
/*     */     //   #712	-> 115
/*     */     //   #230	-> 125
/*     */     //   #70	-> 142
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	44	47	java/lang/IllegalStateException
/*     */     //   37	62	65	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
/*     */     this.buf.setLength(0);
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < paramVarArgs.length; b++)
/*     */         declareLabel(paramVarArgs[b]); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     declareLabel(paramLabel);
/*     */     this.buf.append(this.name).append(".visitTableSwitchInsn(").append(paramInt1).append(", ").append(paramInt2).append(", ");
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append(", new Label[] {");
/*     */     b = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (b < paramVarArgs.length) {
/*     */           try {
/*     */           
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           this.buf.append((b == 0) ? " " : ", ");
/*     */           appendLabel(paramVarArgs[b]);
/*     */           b++;
/*     */           continue;
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     this.buf.append(" });\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public ASMifier visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: ldc '{\\n'
/*     */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   17: pop
/*     */     //   18: aload_0
/*     */     //   19: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   22: ldc 'mv = cw.visitMethod('
/*     */     //   24: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   27: pop
/*     */     //   28: aload_0
/*     */     //   29: iload_1
/*     */     //   30: invokevirtual appendAccess : (I)V
/*     */     //   33: aload_0
/*     */     //   34: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   37: ldc ', '
/*     */     //   39: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   42: pop
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokevirtual appendConstant : (Ljava/lang/Object;)V
/*     */     //   48: aload_0
/*     */     //   49: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   52: ldc ', '
/*     */     //   54: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   57: pop
/*     */     //   58: aload_0
/*     */     //   59: aload_3
/*     */     //   60: invokevirtual appendConstant : (Ljava/lang/Object;)V
/*     */     //   63: aload_0
/*     */     //   64: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   67: ldc ', '
/*     */     //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   72: pop
/*     */     //   73: aload_0
/*     */     //   74: aload #4
/*     */     //   76: invokevirtual appendConstant : (Ljava/lang/Object;)V
/*     */     //   79: aload_0
/*     */     //   80: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   83: ldc ', '
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   88: pop
/*     */     //   89: aload #5
/*     */     //   91: ifnull -> 187
/*     */     //   94: aload #5
/*     */     //   96: arraylength
/*     */     //   97: ifle -> 187
/*     */     //   100: goto -> 107
/*     */     //   103: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   106: athrow
/*     */     //   107: aload_0
/*     */     //   108: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   111: ldc 'new String[] {'
/*     */     //   113: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   116: pop
/*     */     //   117: iconst_0
/*     */     //   118: istore #6
/*     */     //   120: iload #6
/*     */     //   122: aload #5
/*     */     //   124: arraylength
/*     */     //   125: if_icmpge -> 174
/*     */     //   128: aload_0
/*     */     //   129: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   132: iload #6
/*     */     //   134: ifne -> 153
/*     */     //   137: goto -> 144
/*     */     //   140: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   143: athrow
/*     */     //   144: ldc ' '
/*     */     //   146: goto -> 155
/*     */     //   149: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   152: athrow
/*     */     //   153: ldc ', '
/*     */     //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   158: pop
/*     */     //   159: aload_0
/*     */     //   160: aload #5
/*     */     //   162: iload #6
/*     */     //   164: aaload
/*     */     //   165: invokevirtual appendConstant : (Ljava/lang/Object;)V
/*     */     //   168: iinc #6, 1
/*     */     //   171: goto -> 120
/*     */     //   174: aload_0
/*     */     //   175: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   178: ldc ' }'
/*     */     //   180: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   183: pop
/*     */     //   184: goto -> 197
/*     */     //   187: aload_0
/*     */     //   188: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   191: ldc 'null'
/*     */     //   193: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   196: pop
/*     */     //   197: aload_0
/*     */     //   198: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   201: ldc ');\\n'
/*     */     //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   206: pop
/*     */     //   207: aload_0
/*     */     //   208: getfield text : Ljava/util/List;
/*     */     //   211: aload_0
/*     */     //   212: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   215: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   218: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   223: pop
/*     */     //   224: aload_0
/*     */     //   225: ldc 'mv'
/*     */     //   227: iconst_0
/*     */     //   228: invokevirtual createASMifier : (Ljava/lang/String;I)Lorg/spongepowered/asm/lib/util/ASMifier;
/*     */     //   231: astore #6
/*     */     //   233: aload_0
/*     */     //   234: getfield text : Ljava/util/List;
/*     */     //   237: aload #6
/*     */     //   239: invokevirtual getText : ()Ljava/util/List;
/*     */     //   242: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   247: pop
/*     */     //   248: aload_0
/*     */     //   249: getfield text : Ljava/util/List;
/*     */     //   252: ldc '}\\n'
/*     */     //   254: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   259: pop
/*     */     //   260: aload #6
/*     */     //   262: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #743	-> 0
/*     */     //   #383	-> 8
/*     */     //   #372	-> 18
/*     */     //   #632	-> 28
/*     */     //   #710	-> 33
/*     */     //   #13	-> 43
/*     */     //   #281	-> 48
/*     */     //   #515	-> 58
/*     */     //   #586	-> 63
/*     */     //   #263	-> 73
/*     */     //   #361	-> 79
/*     */     //   #533	-> 89
/*     */     //   #170	-> 107
/*     */     //   #303	-> 117
/*     */     //   #202	-> 128
/*     */     //   #623	-> 159
/*     */     //   #700	-> 168
/*     */     //   #302	-> 174
/*     */     //   #550	-> 187
/*     */     //   #290	-> 197
/*     */     //   #487	-> 207
/*     */     //   #250	-> 224
/*     */     //   #429	-> 233
/*     */     //   #409	-> 248
/*     */     //   #584	-> 260
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	100	103	java/lang/IllegalStateException
/*     */     //   120	137	140	java/lang/IllegalStateException
/*     */     //   128	149	149	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitClassAttribute(Attribute paramAttribute) {
/*     */     visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   protected ASMifier(int paramInt1, String paramString, int paramInt2) {
/*     */     super(paramInt1);
/*     */     this.name = paramString;
/*     */     this.id = paramInt2;
/*     */   }
/*     */   
/*     */   private void doVisitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(this.name).append(".visitMethodInsn(").append(OPCODES[paramInt]).append(", ");
/*     */       appendConstant(paramString1);
/*     */       this.buf.append(", ");
/*     */       appendConstant(paramString2);
/*     */       this.buf.append(", ");
/*     */       appendConstant(paramString3);
/*     */       this.buf.append(", ");
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(paramBoolean ? "true" : "false");
/*     */     this.buf.append(");\n");
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\ASMifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */