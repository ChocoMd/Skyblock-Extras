/*     */ package org.spongepowered.asm.lib.util;
/*     */ 
/*     */ import java.util.Map;
/*     */ import org.spongepowered.asm.lib.Attribute;
/*     */ import org.spongepowered.asm.lib.Handle;
/*     */ import org.spongepowered.asm.lib.Label;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ import org.spongepowered.asm.lib.TypePath;
/*     */ import org.spongepowered.asm.lib.TypeReference;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Textifier
/*     */   extends Printer
/*     */ {
/*     */   public void visitMultiANewArrayInsn(String paramString, int paramInt) {
/*  20 */     this.buf.setLength(0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 596 */     this.buf.append(this.tab2).append("MULTIANEWARRAY ");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     appendDescriptor(1, paramString);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 671 */     this.buf.append(' ').append(paramInt).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Textifier visitAnnotation(String paramString, boolean paramBoolean) {
/*     */     this.buf.setLength(0);
/* 753 */     this.buf.append(this.tab).append('@');
/*     */     appendDescriptor(1, paramString);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     try {
/*     */       this.text.add(textifier.getText());
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.text.add(paramBoolean ? ")\n" : ") // invisible\n");
/*     */     return textifier;
/*     */   } public Textifier visitMethodAnnotation(String paramString, boolean paramBoolean) { return visitAnnotation(paramString, paramBoolean); } public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) { this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt]).append(' ');
/*     */     appendDescriptor(0, paramString1);
/*     */     this.buf.append('.').append(paramString2).append(" : ");
/*     */     appendDescriptor(1, paramString3);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString()); }
/*     */   private void visitInt(int paramInt) { this.buf.append(paramInt); }
/*     */   public Printer visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("TRYCATCHBLOCK @");
/*     */     appendDescriptor(1, paramString);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     try {
/*     */       this.text.add(textifier.getText());
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(") : ");
/*     */       appendTypeReference(paramInt);
/*     */       this.buf.append(", ").append(paramTypePath);
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(paramBoolean ? "\n" : " // invisible\n");
/*     */     this.text.add(this.buf.toString());
/*     */     return textifier; }
/*     */   public Textifier visitClassAnnotation(String paramString, boolean paramBoolean) { this.text.add("\n");
/*     */     return visitAnnotation(paramString, paramBoolean); }
/*     */   public void visitOuterClass(String paramString1, String paramString2, String paramString3) { 
/*     */     try { this.buf.setLength(0);
/* 795 */       this.buf.append(this.tab).append("OUTERCLASS "); appendDescriptor(0, paramString1); this.buf.append(' '); if (paramString2 != null)
/* 796 */         this.buf.append(paramString2).append(' ');  } catch (IllegalStateException illegalStateException) { throw b(null); }  appendDescriptor(3, paramString3); this.buf.append('\n'); this.text.add(this.buf.toString()); }
/*     */   protected String ltab = "   ";
/*     */   public Textifier visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: bipush #10
/*     */     //   14: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   17: pop
/*     */     //   18: iload_1
/*     */     //   19: ldc 131072
/*     */     //   21: iand
/*     */     //   22: ifeq -> 49
/*     */     //   25: aload_0
/*     */     //   26: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   29: aload_0
/*     */     //   30: getfield tab : Ljava/lang/String;
/*     */     //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   36: ldc '// DEPRECATED\\n'
/*     */     //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   41: pop
/*     */     //   42: goto -> 49
/*     */     //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   48: athrow
/*     */     //   49: aload_0
/*     */     //   50: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   53: aload_0
/*     */     //   54: getfield tab : Ljava/lang/String;
/*     */     //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   60: ldc '// access flags 0x'
/*     */     //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   65: iload_1
/*     */     //   66: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   69: invokevirtual toUpperCase : ()Ljava/lang/String;
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   75: bipush #10
/*     */     //   77: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   80: pop
/*     */     //   81: aload #4
/*     */     //   83: ifnull -> 163
/*     */     //   86: aload_0
/*     */     //   87: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   90: aload_0
/*     */     //   91: getfield tab : Ljava/lang/String;
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   97: pop
/*     */     //   98: aload_0
/*     */     //   99: iconst_2
/*     */     //   100: aload #4
/*     */     //   102: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   105: new org/spongepowered/asm/lib/util/TraceSignatureVisitor
/*     */     //   108: dup
/*     */     //   109: iconst_0
/*     */     //   110: invokespecial <init> : (I)V
/*     */     //   113: astore #6
/*     */     //   115: new org/spongepowered/asm/lib/signature/SignatureReader
/*     */     //   118: dup
/*     */     //   119: aload #4
/*     */     //   121: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   124: astore #7
/*     */     //   126: aload #7
/*     */     //   128: aload #6
/*     */     //   130: invokevirtual acceptType : (Lorg/spongepowered/asm/lib/signature/SignatureVisitor;)V
/*     */     //   133: aload_0
/*     */     //   134: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   137: aload_0
/*     */     //   138: getfield tab : Ljava/lang/String;
/*     */     //   141: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   144: ldc '// declaration: '
/*     */     //   146: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   149: aload #6
/*     */     //   151: invokevirtual getDeclaration : ()Ljava/lang/String;
/*     */     //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   157: bipush #10
/*     */     //   159: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   162: pop
/*     */     //   163: aload_0
/*     */     //   164: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   167: aload_0
/*     */     //   168: getfield tab : Ljava/lang/String;
/*     */     //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   174: pop
/*     */     //   175: aload_0
/*     */     //   176: iload_1
/*     */     //   177: invokespecial appendAccess : (I)V
/*     */     //   180: aload_0
/*     */     //   181: iconst_1
/*     */     //   182: aload_3
/*     */     //   183: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   186: aload_0
/*     */     //   187: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   190: bipush #32
/*     */     //   192: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   195: aload_2
/*     */     //   196: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   199: pop
/*     */     //   200: aload #5
/*     */     //   202: ifnull -> 267
/*     */     //   205: aload_0
/*     */     //   206: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   209: ldc ' = '
/*     */     //   211: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   214: pop
/*     */     //   215: aload #5
/*     */     //   217: instanceof java/lang/String
/*     */     //   220: ifeq -> 257
/*     */     //   223: goto -> 230
/*     */     //   226: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   229: athrow
/*     */     //   230: aload_0
/*     */     //   231: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   234: bipush #34
/*     */     //   236: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   239: aload #5
/*     */     //   241: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*     */     //   244: bipush #34
/*     */     //   246: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   249: pop
/*     */     //   250: goto -> 267
/*     */     //   253: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   256: athrow
/*     */     //   257: aload_0
/*     */     //   258: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   261: aload #5
/*     */     //   263: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuffer;
/*     */     //   266: pop
/*     */     //   267: aload_0
/*     */     //   268: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   271: bipush #10
/*     */     //   273: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   276: pop
/*     */     //   277: aload_0
/*     */     //   278: getfield text : Ljava/util/List;
/*     */     //   281: aload_0
/*     */     //   282: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   285: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   288: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   293: pop
/*     */     //   294: aload_0
/*     */     //   295: invokevirtual createTextifier : ()Lorg/spongepowered/asm/lib/util/Textifier;
/*     */     //   298: astore #6
/*     */     //   300: aload_0
/*     */     //   301: getfield text : Ljava/util/List;
/*     */     //   304: aload #6
/*     */     //   306: invokevirtual getText : ()Ljava/util/List;
/*     */     //   309: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   314: pop
/*     */     //   315: aload #6
/*     */     //   317: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #123	-> 0
/*     */     //   #777	-> 8
/*     */     //   #522	-> 18
/*     */     //   #239	-> 25
/*     */     //   #393	-> 49
/*     */     //   #242	-> 66
/*     */     //   #477	-> 81
/*     */     //   #472	-> 86
/*     */     //   #327	-> 98
/*     */     //   #399	-> 105
/*     */     //   #112	-> 115
/*     */     //   #155	-> 126
/*     */     //   #21	-> 133
/*     */     //   #106	-> 151
/*     */     //   #561	-> 163
/*     */     //   #178	-> 175
/*     */     //   #246	-> 180
/*     */     //   #499	-> 186
/*     */     //   #745	-> 200
/*     */     //   #40	-> 205
/*     */     //   #83	-> 215
/*     */     //   #557	-> 230
/*     */     //   #781	-> 257
/*     */     //   #532	-> 267
/*     */     //   #790	-> 277
/*     */     //   #321	-> 294
/*     */     //   #216	-> 300
/*     */     //   #273	-> 315
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	42	45	java/lang/IllegalStateException
/*     */     //   163	223	226	java/lang/IllegalStateException
/*     */     //   205	253	253	java/lang/IllegalStateException }
/*     */   private void visitType(Type paramType) { this.buf.append(paramType.getClassName()).append(".class"); } private void visitFloat(float paramFloat) { this.buf.append(paramFloat).append('F'); } private void appendFrameTypes(int paramInt, Object[] paramArrayOfObject) { byte b = 0; while (true) { try { if (b < paramInt) { try { if (b > 0)
/*     */               this.buf.append(' ');  } catch (IllegalStateException illegalStateException) { throw b(null); }  if (paramArrayOfObject[b] instanceof String) { String str = (String)paramArrayOfObject[b]; try { if (str.startsWith("[")) { appendDescriptor(1, str); } else { appendDescriptor(0, str); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  } else { try { if (paramArrayOfObject[b] instanceof Integer) { try { switch (((Integer)paramArrayOfObject[b]).intValue()) { case 0:
/*     */                       appendDescriptor(1, "T"); break;
/*     */                     case 1:
/* 803 */                       appendDescriptor(1, "I"); break;
/*     */                     case 2: appendDescriptor(1, "F"); break;
/*     */                     case 3: appendDescriptor(1, "D"); break;
/*     */                     case 4: appendDescriptor(1, "J"); break;
/*     */                     case 5: appendDescriptor(1, "N"); break;
/*     */                     case 6: appendDescriptor(1, "U"); break; }  } catch (IllegalStateException illegalStateException) { throw b(null); }  } else { appendLabel((Label)paramArrayOfObject[b]); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  }  }  } catch (IllegalStateException illegalStateException) { throw b(null); }  break; }  }
/*     */   private void visitChar(char paramChar) { this.buf.append("(char)").append(paramChar); }
/* 810 */   public void visitParameter(String paramString, int paramInt) { try { this.buf.setLength(0); this.buf.append(this.tab2).append("// parameter "); appendAccess(paramInt); } catch (IllegalStateException illegalStateException) { throw b(null); }  this.buf.append(' ').append((paramString == null) ? "<no name>" : paramString).append('\n'); this.text.add(this.buf.toString()); } public Textifier visitAnnotationDefault() { this.text.add(this.tab2 + "default="); Textifier textifier = createTextifier(); this.text.add(textifier.getText()); this.text.add("\n"); return textifier; } public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) { try { this.buf.setLength(0); this.buf.append(this.ltab); this.buf.append("FRAME "); switch (paramInt1) { case -1: case 0: this.buf.append("FULL ["); appendFrameTypes(paramInt2, paramArrayOfObject1); this.buf.append("] ["); appendFrameTypes(paramInt3, paramArrayOfObject2); this.buf.append(']'); break;case 1: this.buf.append("APPEND ["); appendFrameTypes(paramInt2, paramArrayOfObject1); this.buf.append(']'); break;case 2: this.buf.append("CHOP ").append(paramInt2); break;case 3: this.buf.append("SAME"); break;
/*     */         case 4: this.buf.append("SAME1 "); appendFrameTypes(1, paramArrayOfObject2); break; }  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.buf.append('\n'); this.text.add(this.buf.toString()); } public void visitMethodEnd() {}
/* 812 */   public Textifier visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) { this.buf.setLength(0); this.buf.append(this.tab2).append('@'); appendDescriptor(1, paramString);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     try {
/*     */       this.text.add(textifier.getText());
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.text.add(paramBoolean ? ") // parameter " : ") // invisible, parameter ");
/*     */     this.text.add(Integer.valueOf(paramInt));
/*     */     this.text.add("\n");
/*     */     return textifier; }
/*     */ 
/*     */   
/*     */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(this.tab2).append("INVOKEDYNAMIC").append(' ');
/*     */       this.buf.append(paramString1);
/*     */       appendDescriptor(3, paramString2);
/*     */       this.buf.append(" [");
/*     */       this.buf.append('\n');
/*     */       this.buf.append(this.tab3);
/*     */       appendHandle(paramHandle);
/*     */       this.buf.append('\n');
/*     */       this.buf.append(this.tab3).append("// arguments:");
/*     */       if (paramVarArgs.length == 0) {
/*     */         this.buf.append(" none");
/*     */       } else {
/*     */         this.buf.append('\n');
/*     */         for (byte b = 0; b < paramVarArgs.length; object = paramVarArgs[b]) {
/*     */           Object object;
/*     */           this.buf.append(this.tab3);
/*     */         } 
/*     */         this.buf.setLength(this.buf.length() - 3);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append('\n');
/*     */     this.buf.append(this.tab2).append("]\n");
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
/*     */   public void visitAnnotationEnd() {}
/*     */   
/*     */   private void visitBoolean(boolean paramBoolean) {
/*     */     this.buf.append(paramBoolean);
/*     */   }
/*     */   
/*     */   public Textifier visitAnnotation(String paramString1, String paramString2) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       appendComa(this.valueNumber++);
/*     */       if (paramString1 != null)
/*     */         this.buf.append(paramString1).append('='); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append('@');
/*     */     appendDescriptor(1, paramString2);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     this.text.add(textifier.getText());
/*     */     this.text.add(")");
/*     */     return textifier;
/*     */   }
/*     */   
/*     */   public void visitMaxs(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("MAXSTACK = ").append(paramInt1).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("MAXLOCALS = ").append(paramInt2).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: iload_2
/*     */     //   2: putfield access : I
/*     */     //   5: iload_1
/*     */     //   6: ldc 65535
/*     */     //   8: iand
/*     */     //   9: istore #7
/*     */     //   11: iload_1
/*     */     //   12: bipush #16
/*     */     //   14: iushr
/*     */     //   15: istore #8
/*     */     //   17: aload_0
/*     */     //   18: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   21: iconst_0
/*     */     //   22: invokevirtual setLength : (I)V
/*     */     //   25: aload_0
/*     */     //   26: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   29: ldc '// class version '
/*     */     //   31: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   34: iload #7
/*     */     //   36: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   39: bipush #46
/*     */     //   41: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   44: iload #8
/*     */     //   46: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   49: ldc ' ('
/*     */     //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   54: iload_1
/*     */     //   55: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   58: ldc ')\\n'
/*     */     //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   63: pop
/*     */     //   64: iload_2
/*     */     //   65: ldc 131072
/*     */     //   67: iand
/*     */     //   68: ifeq -> 88
/*     */     //   71: aload_0
/*     */     //   72: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   75: ldc '// DEPRECATED\\n'
/*     */     //   77: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   80: pop
/*     */     //   81: goto -> 88
/*     */     //   84: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   87: athrow
/*     */     //   88: aload_0
/*     */     //   89: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   92: ldc '// access flags 0x'
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   97: iload_2
/*     */     //   98: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   101: invokevirtual toUpperCase : ()Ljava/lang/String;
/*     */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   107: bipush #10
/*     */     //   109: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   112: pop
/*     */     //   113: aload_0
/*     */     //   114: iconst_5
/*     */     //   115: aload #4
/*     */     //   117: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   120: aload #4
/*     */     //   122: ifnull -> 180
/*     */     //   125: new org/spongepowered/asm/lib/util/TraceSignatureVisitor
/*     */     //   128: dup
/*     */     //   129: iload_2
/*     */     //   130: invokespecial <init> : (I)V
/*     */     //   133: astore #9
/*     */     //   135: new org/spongepowered/asm/lib/signature/SignatureReader
/*     */     //   138: dup
/*     */     //   139: aload #4
/*     */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   144: astore #10
/*     */     //   146: aload #10
/*     */     //   148: aload #9
/*     */     //   150: invokevirtual accept : (Lorg/spongepowered/asm/lib/signature/SignatureVisitor;)V
/*     */     //   153: aload_0
/*     */     //   154: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   157: ldc '// declaration: '
/*     */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   162: aload_3
/*     */     //   163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   166: aload #9
/*     */     //   168: invokevirtual getDeclaration : ()Ljava/lang/String;
/*     */     //   171: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   174: bipush #10
/*     */     //   176: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   179: pop
/*     */     //   180: aload_0
/*     */     //   181: iload_2
/*     */     //   182: bipush #-33
/*     */     //   184: iand
/*     */     //   185: invokespecial appendAccess : (I)V
/*     */     //   188: iload_2
/*     */     //   189: sipush #8192
/*     */     //   192: iand
/*     */     //   193: ifeq -> 213
/*     */     //   196: aload_0
/*     */     //   197: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   200: ldc '@interface '
/*     */     //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   205: pop
/*     */     //   206: goto -> 263
/*     */     //   209: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   212: athrow
/*     */     //   213: iload_2
/*     */     //   214: sipush #512
/*     */     //   217: iand
/*     */     //   218: ifeq -> 238
/*     */     //   221: aload_0
/*     */     //   222: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   225: ldc 'interface '
/*     */     //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   230: pop
/*     */     //   231: goto -> 263
/*     */     //   234: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   237: athrow
/*     */     //   238: iload_2
/*     */     //   239: sipush #16384
/*     */     //   242: iand
/*     */     //   243: ifne -> 263
/*     */     //   246: aload_0
/*     */     //   247: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   250: ldc 'class '
/*     */     //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   255: pop
/*     */     //   256: goto -> 263
/*     */     //   259: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   262: athrow
/*     */     //   263: aload_0
/*     */     //   264: iconst_0
/*     */     //   265: aload_3
/*     */     //   266: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   269: aload #5
/*     */     //   271: ifnull -> 325
/*     */     //   274: ldc 'java/lang/Object'
/*     */     //   276: aload #5
/*     */     //   278: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   281: ifne -> 325
/*     */     //   284: goto -> 291
/*     */     //   287: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   290: athrow
/*     */     //   291: aload_0
/*     */     //   292: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   295: ldc ' extends '
/*     */     //   297: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   300: pop
/*     */     //   301: aload_0
/*     */     //   302: iconst_0
/*     */     //   303: aload #5
/*     */     //   305: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   308: aload_0
/*     */     //   309: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   312: bipush #32
/*     */     //   314: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   317: pop
/*     */     //   318: goto -> 325
/*     */     //   321: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   324: athrow
/*     */     //   325: aload #6
/*     */     //   327: ifnull -> 394
/*     */     //   330: aload #6
/*     */     //   332: arraylength
/*     */     //   333: ifle -> 394
/*     */     //   336: goto -> 343
/*     */     //   339: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   342: athrow
/*     */     //   343: aload_0
/*     */     //   344: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   347: ldc ' implements '
/*     */     //   349: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   352: pop
/*     */     //   353: iconst_0
/*     */     //   354: istore #9
/*     */     //   356: iload #9
/*     */     //   358: aload #6
/*     */     //   360: arraylength
/*     */     //   361: if_icmpge -> 394
/*     */     //   364: aload_0
/*     */     //   365: iconst_0
/*     */     //   366: aload #6
/*     */     //   368: iload #9
/*     */     //   370: aaload
/*     */     //   371: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   374: aload_0
/*     */     //   375: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   378: bipush #32
/*     */     //   380: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   383: pop
/*     */     //   384: iinc #9, 1
/*     */     //   387: goto -> 356
/*     */     //   390: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   393: athrow
/*     */     //   394: aload_0
/*     */     //   395: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   398: ldc ' {\\n\\n'
/*     */     //   400: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   403: pop
/*     */     //   404: aload_0
/*     */     //   405: getfield text : Ljava/util/List;
/*     */     //   408: aload_0
/*     */     //   409: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   412: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   415: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   420: pop
/*     */     //   421: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #265	-> 0
/*     */     //   #704	-> 5
/*     */     //   #351	-> 11
/*     */     //   #740	-> 17
/*     */     //   #161	-> 25
/*     */     //   #450	-> 51
/*     */     //   #576	-> 64
/*     */     //   #762	-> 71
/*     */     //   #612	-> 88
/*     */     //   #206	-> 98
/*     */     //   #416	-> 113
/*     */     //   #33	-> 120
/*     */     //   #63	-> 125
/*     */     //   #724	-> 135
/*     */     //   #725	-> 146
/*     */     //   #563	-> 153
/*     */     //   #436	-> 168
/*     */     //   #625	-> 180
/*     */     //   #506	-> 188
/*     */     //   #163	-> 196
/*     */     //   #528	-> 213
/*     */     //   #293	-> 221
/*     */     //   #587	-> 238
/*     */     //   #354	-> 246
/*     */     //   #54	-> 263
/*     */     //   #30	-> 269
/*     */     //   #513	-> 291
/*     */     //   #373	-> 301
/*     */     //   #201	-> 308
/*     */     //   #224	-> 325
/*     */     //   #336	-> 343
/*     */     //   #127	-> 353
/*     */     //   #342	-> 364
/*     */     //   #408	-> 374
/*     */     //   #597	-> 384
/*     */     //   #654	-> 394
/*     */     //   #57	-> 404
/*     */     //   #288	-> 421
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   17	81	84	java/lang/IllegalStateException
/*     */     //   180	209	209	java/lang/IllegalStateException
/*     */     //   213	234	234	java/lang/IllegalStateException
/*     */     //   238	256	259	java/lang/IllegalStateException
/*     */     //   263	284	287	java/lang/IllegalStateException
/*     */     //   274	318	321	java/lang/IllegalStateException
/*     */     //   325	336	339	java/lang/IllegalStateException
/*     */     //   356	390	390	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt1]).append(' ').append(paramInt2).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab).append("// access flags 0x");
/*     */     this.buf.append(Integer.toHexString(paramInt & 0xFFFFFFDF).toUpperCase()).append('\n');
/*     */     this.buf.append(this.tab);
/*     */     appendAccess(paramInt);
/*     */     this.buf.append("INNERCLASS ");
/*     */     appendDescriptor(0, paramString1);
/*     */     this.buf.append(' ');
/*     */     appendDescriptor(0, paramString2);
/*     */     this.buf.append(' ');
/*     */     appendDescriptor(0, paramString3);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitClassEnd() {
/*     */     this.text.add("}\n");
/*     */   }
/*     */   
/*     */   protected String tab3 = "      ";
/*     */   
/*     */   public void visitTypeInsn(int paramInt, String paramString) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt]).append(' ');
/*     */     appendDescriptor(0, paramString);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitClassAttribute(Attribute paramAttribute) {
/*     */     this.text.add("\n");
/*     */     visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("IINC ").append(paramInt1).append(' ').append(paramInt2).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   protected String tab = "  ";
/*     */   
/*     */   public Printer visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("LOCALVARIABLE @");
/*     */     appendDescriptor(1, paramString);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     this.text.add(textifier.getText());
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(") : ");
/*     */     appendTypeReference(paramInt);
/*     */     this.buf.append(", ").append(paramTypePath);
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < paramArrayOfLabel1.length; appendLabel(paramArrayOfLabel1[b]), this.buf.append(" - "), appendLabel(paramArrayOfLabel2[b]), this.buf.append(" - ").append(paramArrayOfint[b]).append(" ]"), b++)
/*     */         this.buf.append(" [ "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(paramBoolean ? "\n" : " // invisible\n");
/*     */     this.text.add(this.buf.toString());
/*     */     return textifier;
/*     */   }
/*     */   
/*     */   public Textifier visitArray(String paramString) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       appendComa(this.valueNumber++);
/*     */       if (paramString != null)
/*     */         this.buf.append(paramString).append('='); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append('{');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     this.text.add(textifier.getText());
/*     */     this.text.add("}");
/*     */     return textifier;
/*     */   }
/*     */   
/*     */   public void visitCode() {}
/*     */   
/*     */   public void visitMethodAttribute(Attribute paramAttribute) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(this.tab).append("ATTRIBUTE ");
/*     */       appendDescriptor(-1, paramAttribute.type);
/*     */       if (paramAttribute instanceof Textifiable) {
/*     */         ((Textifiable)paramAttribute).textify(this.buf, this.labelNames);
/*     */       } else {
/*     */         this.buf.append(" : unknown\n");
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(this.tab).append("ATTRIBUTE ");
/*     */       appendDescriptor(-1, paramAttribute.type);
/*     */       if (paramAttribute instanceof Textifiable) {
/*     */         ((Textifiable)paramAttribute).textify(this.buf, null);
/*     */       } else {
/*     */         this.buf.append(" : unknown\n");
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("LINENUMBER ").append(paramInt).append(' ');
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt]).append(' ');
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public Textifier visitFieldAnnotation(String paramString, boolean paramBoolean) {
/*     */     return visitAnnotation(paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   protected void appendHandle(Handle paramHandle) {
/*     */     int i = paramHandle.getTag();
/*     */     this.buf.append("// handle kind 0x").append(Integer.toHexString(i)).append(" : ");
/*     */     boolean bool = false;
/*     */     try {
/*     */       switch (i) {
/*     */         case 1:
/*     */           this.buf.append("GETFIELD");
/*     */           break;
/*     */         case 2:
/*     */           this.buf.append("GETSTATIC");
/*     */           break;
/*     */         case 3:
/*     */           this.buf.append("PUTFIELD");
/*     */           break;
/*     */         case 4:
/*     */           this.buf.append("PUTSTATIC");
/*     */           break;
/*     */         case 9:
/*     */           this.buf.append("INVOKEINTERFACE");
/*     */           bool = true;
/*     */           break;
/*     */         case 7:
/*     */           this.buf.append("INVOKESPECIAL");
/*     */           bool = true;
/*     */           break;
/*     */         case 6:
/*     */           this.buf.append("INVOKESTATIC");
/*     */           bool = true;
/*     */           break;
/*     */         case 5:
/*     */           this.buf.append("INVOKEVIRTUAL");
/*     */           bool = true;
/*     */           break;
/*     */         case 8:
/*     */           this.buf.append("NEWINVOKESPECIAL");
/*     */           bool = true;
/*     */           break;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.buf.append('\n');
/*     */       this.buf.append(this.tab3);
/*     */       appendDescriptor(0, paramHandle.getOwner());
/*     */       this.buf.append('.');
/*     */       this.buf.append(paramHandle.getName());
/*     */       if (!bool)
/*     */         this.buf.append('('); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       appendDescriptor(9, paramHandle.getDesc());
/*     */       if (!bool)
/*     */         this.buf.append(')'); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void appendTypeReference(int paramInt) {
/*     */     TypeReference typeReference = new TypeReference(paramInt);
/*     */     try {
/*     */       switch (typeReference.getSort()) {
/*     */         case 0:
/*     */           this.buf.append("CLASS_TYPE_PARAMETER ").append(typeReference.getTypeParameterIndex());
/*     */           break;
/*     */         case 1:
/*     */           this.buf.append("METHOD_TYPE_PARAMETER ").append(typeReference.getTypeParameterIndex());
/*     */           break;
/*     */         case 16:
/*     */           this.buf.append("CLASS_EXTENDS ").append(typeReference.getSuperTypeIndex());
/*     */           break;
/*     */         case 17:
/*     */           this.buf.append("CLASS_TYPE_PARAMETER_BOUND ").append(typeReference.getTypeParameterIndex()).append(", ").append(typeReference.getTypeParameterBoundIndex());
/*     */           break;
/*     */         case 18:
/*     */           this.buf.append("METHOD_TYPE_PARAMETER_BOUND ").append(typeReference.getTypeParameterIndex()).append(", ").append(typeReference.getTypeParameterBoundIndex());
/*     */           break;
/*     */         case 19:
/*     */           this.buf.append("FIELD");
/*     */           break;
/*     */         case 20:
/*     */           this.buf.append("METHOD_RETURN");
/*     */           break;
/*     */         case 21:
/*     */           this.buf.append("METHOD_RECEIVER");
/*     */           break;
/*     */         case 22:
/*     */           this.buf.append("METHOD_FORMAL_PARAMETER ").append(typeReference.getFormalParameterIndex());
/*     */           break;
/*     */         case 23:
/*     */           this.buf.append("THROWS ").append(typeReference.getExceptionIndex());
/*     */           break;
/*     */         case 64:
/*     */           this.buf.append("LOCAL_VARIABLE");
/*     */           break;
/*     */         case 65:
/*     */           this.buf.append("RESOURCE_VARIABLE");
/*     */           break;
/*     */         case 66:
/*     */           this.buf.append("EXCEPTION_PARAMETER ").append(typeReference.getTryCatchBlockIndex());
/*     */           break;
/*     */         case 67:
/*     */           this.buf.append("INSTANCEOF");
/*     */           break;
/*     */         case 68:
/*     */           this.buf.append("NEW");
/*     */           break;
/*     */         case 69:
/*     */           this.buf.append("CONSTRUCTOR_REFERENCE");
/*     */           break;
/*     */         case 70:
/*     */           this.buf.append("METHOD_REFERENCE");
/*     */           break;
/*     */         case 71:
/*     */           this.buf.append("CAST ").append(typeReference.getTypeArgumentIndex());
/*     */           break;
/*     */         case 72:
/*     */           this.buf.append("CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
/*     */           break;
/*     */         case 73:
/*     */           this.buf.append("METHOD_INVOCATION_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
/*     */           break;
/*     */         case 74:
/*     */           this.buf.append("CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
/*     */           break;
/*     */         case 75:
/*     */           this.buf.append("METHOD_REFERENCE_TYPE_ARGUMENT ").append(typeReference.getTypeArgumentIndex());
/*     */           break;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected Textifier createTextifier() {
/*     */     return new Textifier();
/*     */   }
/*     */   
/*     */   public Printer visitClassTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     this.text.add("\n");
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   protected void appendDescriptor(int paramInt, String paramString) {
/*     */     try {
/*     */       if (paramInt != 5)
/*     */         try {
/*     */           if (paramInt != 2) {
/*     */             try {
/*     */               if (paramInt == 4) {
/*     */                 try {
/*     */                   if (paramString != null)
/*     */                     this.buf.append("// signature ").append(paramString).append('\n'); 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 return;
/*     */               } 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             this.buf.append(paramString);
/*     */             return;
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramString != null)
/*     */         this.buf.append("// signature ").append(paramString).append('\n'); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected String tab2 = "    ";
/*     */   public static final int INTERNAL_NAME = 0;
/*     */   public static final int FIELD_DESCRIPTOR = 1;
/*     */   public static final int FIELD_SIGNATURE = 2;
/*     */   public static final int METHOD_DESCRIPTOR = 3;
/*     */   public static final int METHOD_SIGNATURE = 4;
/*     */   public static final int CLASS_SIGNATURE = 5;
/*     */   public static final int TYPE_DECLARATION = 6;
/*     */   public static final int CLASS_DECLARATION = 7;
/*     */   public static final int PARAMETERS_DECLARATION = 8;
/*     */   public static final int HANDLE_DESCRIPTOR = 9;
/*     */   protected Map<Label, String> labelNames;
/*     */   private int access;
/*     */   private int valueNumber;
/*     */   
/*     */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: aload_0
/*     */     //   13: getfield tab2 : Ljava/lang/String;
/*     */     //   16: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   19: ldc 'LOCALVARIABLE '
/*     */     //   21: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   24: aload_1
/*     */     //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   28: bipush #32
/*     */     //   30: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   33: pop
/*     */     //   34: aload_0
/*     */     //   35: iconst_1
/*     */     //   36: aload_2
/*     */     //   37: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   44: bipush #32
/*     */     //   46: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   49: pop
/*     */     //   50: aload_0
/*     */     //   51: aload #4
/*     */     //   53: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   56: aload_0
/*     */     //   57: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   60: bipush #32
/*     */     //   62: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   65: pop
/*     */     //   66: aload_0
/*     */     //   67: aload #5
/*     */     //   69: invokevirtual appendLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*     */     //   72: aload_0
/*     */     //   73: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   76: bipush #32
/*     */     //   78: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   81: iload #6
/*     */     //   83: invokevirtual append : (I)Ljava/lang/StringBuffer;
/*     */     //   86: bipush #10
/*     */     //   88: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   91: pop
/*     */     //   92: aload_3
/*     */     //   93: ifnull -> 171
/*     */     //   96: aload_0
/*     */     //   97: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   100: aload_0
/*     */     //   101: getfield tab2 : Ljava/lang/String;
/*     */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   107: pop
/*     */     //   108: aload_0
/*     */     //   109: iconst_2
/*     */     //   110: aload_3
/*     */     //   111: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   114: new org/spongepowered/asm/lib/util/TraceSignatureVisitor
/*     */     //   117: dup
/*     */     //   118: iconst_0
/*     */     //   119: invokespecial <init> : (I)V
/*     */     //   122: astore #7
/*     */     //   124: new org/spongepowered/asm/lib/signature/SignatureReader
/*     */     //   127: dup
/*     */     //   128: aload_3
/*     */     //   129: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   132: astore #8
/*     */     //   134: aload #8
/*     */     //   136: aload #7
/*     */     //   138: invokevirtual acceptType : (Lorg/spongepowered/asm/lib/signature/SignatureVisitor;)V
/*     */     //   141: aload_0
/*     */     //   142: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   145: aload_0
/*     */     //   146: getfield tab2 : Ljava/lang/String;
/*     */     //   149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   152: ldc '// declaration: '
/*     */     //   154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   157: aload #7
/*     */     //   159: invokevirtual getDeclaration : ()Ljava/lang/String;
/*     */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   165: bipush #10
/*     */     //   167: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   170: pop
/*     */     //   171: aload_0
/*     */     //   172: getfield text : Ljava/util/List;
/*     */     //   175: aload_0
/*     */     //   176: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   179: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   182: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   187: pop
/*     */     //   188: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #479	-> 0
/*     */     //   #811	-> 8
/*     */     //   #253	-> 34
/*     */     //   #710	-> 40
/*     */     //   #730	-> 50
/*     */     //   #700	-> 56
/*     */     //   #644	-> 66
/*     */     //   #260	-> 72
/*     */     //   #529	-> 92
/*     */     //   #548	-> 96
/*     */     //   #165	-> 108
/*     */     //   #505	-> 114
/*     */     //   #698	-> 124
/*     */     //   #255	-> 134
/*     */     //   #756	-> 141
/*     */     //   #58	-> 159
/*     */     //   #407	-> 171
/*     */     //   #535	-> 188
/*     */   }
/*     */   
/*     */   private void appendComa(int paramInt) {
/*     */     try {
/*     */       if (paramInt != 0)
/*     */         this.buf.append(", "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("LOOKUPSWITCH\n");
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramArrayOfLabel.length) {
/*     */         this.buf.append(this.tab3).append(paramArrayOfint[b]).append(": ");
/*     */         appendLabel(paramArrayOfLabel[b]);
/*     */         this.buf.append('\n');
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(this.tab3).append("default: ");
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public Printer visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   public void visitFieldAttribute(Attribute paramAttribute) {
/*     */     visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   private void visitDouble(double paramDouble) {
/*     */     this.buf.append(paramDouble).append('D');
/*     */   }
/*     */   
/*     */   public void visitLdcInsn(Object paramObject) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(this.tab2).append("LDC ");
/*     */       if (paramObject instanceof String) {
/*     */         Printer.appendString(this.buf, (String)paramObject);
/*     */       } else {
/*     */         try {
/*     */           if (paramObject instanceof Type) {
/*     */             this.buf.append(((Type)paramObject).getDescriptor()).append(".class");
/*     */           } else {
/*     */             this.buf.append(paramObject);
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public Printer visitMethodTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   private void visitShort(short paramShort) {
/*     */     this.buf.append("(short)").append(paramShort);
/*     */   }
/*     */   
/*     */   public void visitFieldEnd() {}
/*     */   
/*     */   public Printer visitFieldTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     return visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*     */   }
/*     */   
/*     */   private void appendAccess(int paramInt) {
/*     */     try {
/*     */       if ((paramInt & 0x1) != 0)
/*     */         this.buf.append("public "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x2) != 0)
/*     */         this.buf.append("private "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x4) != 0)
/*     */         this.buf.append("protected "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x10) != 0)
/*     */         this.buf.append("final "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x8) != 0)
/*     */         this.buf.append("static "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x20) != 0)
/*     */         this.buf.append("synchronized "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x40) != 0)
/*     */         this.buf.append("volatile "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x80) != 0)
/*     */         this.buf.append("transient "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x400) != 0)
/*     */         this.buf.append("abstract "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x800) != 0)
/*     */         this.buf.append("strictfp "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x1000) != 0)
/*     */         this.buf.append("synthetic "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x8000) != 0)
/*     */         this.buf.append("mandated "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if ((paramInt & 0x4000) != 0)
/*     */         this.buf.append("enum "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLabel(Label paramLabel) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.ltab);
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("TRYCATCHBLOCK ");
/*     */     appendLabel(paramLabel1);
/*     */     this.buf.append(' ');
/*     */     appendLabel(paramLabel2);
/*     */     this.buf.append(' ');
/*     */     appendLabel(paramLabel3);
/*     */     this.buf.append(' ');
/*     */     appendDescriptor(0, paramString);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitInsn(int paramInt) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt]).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       appendComa(this.valueNumber++);
/*     */       if (paramString1 != null)
/*     */         this.buf.append(paramString1).append('='); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     appendDescriptor(1, paramString2);
/*     */     this.buf.append('.').append(paramString3);
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public Textifier visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab).append('@');
/*     */     appendDescriptor(1, paramString);
/*     */     this.buf.append('(');
/*     */     this.text.add(this.buf.toString());
/*     */     Textifier textifier = createTextifier();
/*     */     try {
/*     */       this.text.add(textifier.getText());
/*     */       this.buf.setLength(0);
/*     */       this.buf.append(") : ");
/*     */       appendTypeReference(paramInt);
/*     */       this.buf.append(", ").append(paramTypePath);
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(paramBoolean ? "\n" : " // invisible\n");
/*     */     this.text.add(this.buf.toString());
/*     */     return textifier;
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
/*     */   public Textifier() {
/*     */     this(327680);
/*     */     if (getClass() != Textifier.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   private void doVisitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt]).append(' ');
/*     */     appendDescriptor(0, paramString1);
/*     */     this.buf.append('.').append(paramString2).append(' ');
/*     */     appendDescriptor(3, paramString3);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   public void visitSource(String paramString1, String paramString2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_1
/*     */     //   9: ifnull -> 45
/*     */     //   12: aload_0
/*     */     //   13: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   16: aload_0
/*     */     //   17: getfield tab : Ljava/lang/String;
/*     */     //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   23: ldc '// compiled from: '
/*     */     //   25: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   28: aload_1
/*     */     //   29: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   32: bipush #10
/*     */     //   34: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   37: pop
/*     */     //   38: goto -> 45
/*     */     //   41: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   44: athrow
/*     */     //   45: aload_2
/*     */     //   46: ifnull -> 82
/*     */     //   49: aload_0
/*     */     //   50: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   53: aload_0
/*     */     //   54: getfield tab : Ljava/lang/String;
/*     */     //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   60: ldc '// debug info: '
/*     */     //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   65: aload_2
/*     */     //   66: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   69: bipush #10
/*     */     //   71: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   74: pop
/*     */     //   75: goto -> 82
/*     */     //   78: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   81: athrow
/*     */     //   82: aload_0
/*     */     //   83: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   86: invokevirtual length : ()I
/*     */     //   89: ifle -> 116
/*     */     //   92: aload_0
/*     */     //   93: getfield text : Ljava/util/List;
/*     */     //   96: aload_0
/*     */     //   97: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   103: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   108: pop
/*     */     //   109: goto -> 116
/*     */     //   112: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   115: athrow
/*     */     //   116: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #632	-> 0
/*     */     //   #160	-> 8
/*     */     //   #750	-> 12
/*     */     //   #200	-> 34
/*     */     //   #278	-> 45
/*     */     //   #538	-> 49
/*     */     //   #1	-> 71
/*     */     //   #108	-> 82
/*     */     //   #516	-> 92
/*     */     //   #322	-> 116
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	38	41	java/lang/IllegalStateException
/*     */     //   45	75	78	java/lang/IllegalStateException
/*     */     //   82	109	112	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   protected void appendLabel(Label paramLabel) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield labelNames : Ljava/util/Map;
/*     */     //   4: ifnonnull -> 25
/*     */     //   7: aload_0
/*     */     //   8: new java/util/HashMap
/*     */     //   11: dup
/*     */     //   12: invokespecial <init> : ()V
/*     */     //   15: putfield labelNames : Ljava/util/Map;
/*     */     //   18: goto -> 25
/*     */     //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   24: athrow
/*     */     //   25: aload_0
/*     */     //   26: getfield labelNames : Ljava/util/Map;
/*     */     //   29: aload_1
/*     */     //   30: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   35: checkcast java/lang/String
/*     */     //   38: astore_2
/*     */     //   39: aload_2
/*     */     //   40: ifnonnull -> 83
/*     */     //   43: new java/lang/StringBuilder
/*     */     //   46: dup
/*     */     //   47: invokespecial <init> : ()V
/*     */     //   50: ldc 'L'
/*     */     //   52: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   55: aload_0
/*     */     //   56: getfield labelNames : Ljava/util/Map;
/*     */     //   59: invokeinterface size : ()I
/*     */     //   64: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   67: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   70: astore_2
/*     */     //   71: aload_0
/*     */     //   72: getfield labelNames : Ljava/util/Map;
/*     */     //   75: aload_1
/*     */     //   76: aload_2
/*     */     //   77: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   82: pop
/*     */     //   83: aload_0
/*     */     //   84: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   87: aload_2
/*     */     //   88: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   91: pop
/*     */     //   92: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #639	-> 0
/*     */     //   #594	-> 7
/*     */     //   #404	-> 25
/*     */     //   #757	-> 39
/*     */     //   #578	-> 43
/*     */     //   #552	-> 71
/*     */     //   #661	-> 83
/*     */     //   #405	-> 92
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	18	21	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   private void visitByte(byte paramByte) {
/*     */     this.buf.append("(byte)").append(paramByte);
/*     */   }
/*     */   
/*     */   public Textifier visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   12: bipush #10
/*     */     //   14: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   17: pop
/*     */     //   18: iload_1
/*     */     //   19: ldc 131072
/*     */     //   21: iand
/*     */     //   22: ifeq -> 49
/*     */     //   25: aload_0
/*     */     //   26: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   29: aload_0
/*     */     //   30: getfield tab : Ljava/lang/String;
/*     */     //   33: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   36: ldc '// DEPRECATED\\n'
/*     */     //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   41: pop
/*     */     //   42: goto -> 49
/*     */     //   45: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   48: athrow
/*     */     //   49: aload_0
/*     */     //   50: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   53: aload_0
/*     */     //   54: getfield tab : Ljava/lang/String;
/*     */     //   57: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   60: ldc '// access flags 0x'
/*     */     //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   65: iload_1
/*     */     //   66: invokestatic toHexString : (I)Ljava/lang/String;
/*     */     //   69: invokevirtual toUpperCase : ()Ljava/lang/String;
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   75: bipush #10
/*     */     //   77: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   80: pop
/*     */     //   81: aload #4
/*     */     //   83: ifnull -> 227
/*     */     //   86: aload_0
/*     */     //   87: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   90: aload_0
/*     */     //   91: getfield tab : Ljava/lang/String;
/*     */     //   94: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   97: pop
/*     */     //   98: aload_0
/*     */     //   99: iconst_4
/*     */     //   100: aload #4
/*     */     //   102: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   105: new org/spongepowered/asm/lib/util/TraceSignatureVisitor
/*     */     //   108: dup
/*     */     //   109: iconst_0
/*     */     //   110: invokespecial <init> : (I)V
/*     */     //   113: astore #6
/*     */     //   115: new org/spongepowered/asm/lib/signature/SignatureReader
/*     */     //   118: dup
/*     */     //   119: aload #4
/*     */     //   121: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   124: astore #7
/*     */     //   126: aload #7
/*     */     //   128: aload #6
/*     */     //   130: invokevirtual accept : (Lorg/spongepowered/asm/lib/signature/SignatureVisitor;)V
/*     */     //   133: aload #6
/*     */     //   135: invokevirtual getDeclaration : ()Ljava/lang/String;
/*     */     //   138: astore #8
/*     */     //   140: aload #6
/*     */     //   142: invokevirtual getReturnType : ()Ljava/lang/String;
/*     */     //   145: astore #9
/*     */     //   147: aload #6
/*     */     //   149: invokevirtual getExceptions : ()Ljava/lang/String;
/*     */     //   152: astore #10
/*     */     //   154: aload_0
/*     */     //   155: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   158: aload_0
/*     */     //   159: getfield tab : Ljava/lang/String;
/*     */     //   162: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   165: ldc '// declaration: '
/*     */     //   167: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   170: aload #9
/*     */     //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   175: bipush #32
/*     */     //   177: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   180: aload_2
/*     */     //   181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   184: aload #8
/*     */     //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   189: pop
/*     */     //   190: aload #10
/*     */     //   192: ifnull -> 217
/*     */     //   195: aload_0
/*     */     //   196: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   199: ldc ' throws '
/*     */     //   201: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   204: aload #10
/*     */     //   206: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   209: pop
/*     */     //   210: goto -> 217
/*     */     //   213: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   216: athrow
/*     */     //   217: aload_0
/*     */     //   218: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   221: bipush #10
/*     */     //   223: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   226: pop
/*     */     //   227: aload_0
/*     */     //   228: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   231: aload_0
/*     */     //   232: getfield tab : Ljava/lang/String;
/*     */     //   235: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   238: pop
/*     */     //   239: aload_0
/*     */     //   240: iload_1
/*     */     //   241: bipush #-65
/*     */     //   243: iand
/*     */     //   244: invokespecial appendAccess : (I)V
/*     */     //   247: iload_1
/*     */     //   248: sipush #256
/*     */     //   251: iand
/*     */     //   252: ifeq -> 272
/*     */     //   255: aload_0
/*     */     //   256: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   259: ldc 'native '
/*     */     //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   264: pop
/*     */     //   265: goto -> 272
/*     */     //   268: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   271: athrow
/*     */     //   272: iload_1
/*     */     //   273: sipush #128
/*     */     //   276: iand
/*     */     //   277: ifeq -> 297
/*     */     //   280: aload_0
/*     */     //   281: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   284: ldc 'varargs '
/*     */     //   286: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   289: pop
/*     */     //   290: goto -> 297
/*     */     //   293: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   296: athrow
/*     */     //   297: iload_1
/*     */     //   298: bipush #64
/*     */     //   300: iand
/*     */     //   301: ifeq -> 321
/*     */     //   304: aload_0
/*     */     //   305: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   308: ldc 'bridge '
/*     */     //   310: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   313: pop
/*     */     //   314: goto -> 321
/*     */     //   317: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   320: athrow
/*     */     //   321: aload_0
/*     */     //   322: getfield access : I
/*     */     //   325: sipush #512
/*     */     //   328: iand
/*     */     //   329: ifeq -> 378
/*     */     //   332: iload_1
/*     */     //   333: sipush #1024
/*     */     //   336: iand
/*     */     //   337: ifne -> 378
/*     */     //   340: goto -> 347
/*     */     //   343: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   346: athrow
/*     */     //   347: iload_1
/*     */     //   348: bipush #8
/*     */     //   350: iand
/*     */     //   351: ifne -> 378
/*     */     //   354: goto -> 361
/*     */     //   357: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   360: athrow
/*     */     //   361: aload_0
/*     */     //   362: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   365: ldc 'default '
/*     */     //   367: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   370: pop
/*     */     //   371: goto -> 378
/*     */     //   374: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   377: athrow
/*     */     //   378: aload_0
/*     */     //   379: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   382: aload_2
/*     */     //   383: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   386: pop
/*     */     //   387: aload_0
/*     */     //   388: iconst_3
/*     */     //   389: aload_3
/*     */     //   390: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   393: aload #5
/*     */     //   395: ifnull -> 462
/*     */     //   398: aload #5
/*     */     //   400: arraylength
/*     */     //   401: ifle -> 462
/*     */     //   404: goto -> 411
/*     */     //   407: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   410: athrow
/*     */     //   411: aload_0
/*     */     //   412: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   415: ldc ' throws '
/*     */     //   417: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   420: pop
/*     */     //   421: iconst_0
/*     */     //   422: istore #6
/*     */     //   424: iload #6
/*     */     //   426: aload #5
/*     */     //   428: arraylength
/*     */     //   429: if_icmpge -> 462
/*     */     //   432: aload_0
/*     */     //   433: iconst_0
/*     */     //   434: aload #5
/*     */     //   436: iload #6
/*     */     //   438: aaload
/*     */     //   439: invokevirtual appendDescriptor : (ILjava/lang/String;)V
/*     */     //   442: aload_0
/*     */     //   443: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   446: bipush #32
/*     */     //   448: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   451: pop
/*     */     //   452: iinc #6, 1
/*     */     //   455: goto -> 424
/*     */     //   458: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   461: athrow
/*     */     //   462: aload_0
/*     */     //   463: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   466: bipush #10
/*     */     //   468: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   471: pop
/*     */     //   472: aload_0
/*     */     //   473: getfield text : Ljava/util/List;
/*     */     //   476: aload_0
/*     */     //   477: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   480: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   483: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   488: pop
/*     */     //   489: aload_0
/*     */     //   490: invokevirtual createTextifier : ()Lorg/spongepowered/asm/lib/util/Textifier;
/*     */     //   493: astore #6
/*     */     //   495: aload_0
/*     */     //   496: getfield text : Ljava/util/List;
/*     */     //   499: aload #6
/*     */     //   501: invokevirtual getText : ()Ljava/util/List;
/*     */     //   504: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   509: pop
/*     */     //   510: aload #6
/*     */     //   512: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #685	-> 0
/*     */     //   #655	-> 8
/*     */     //   #571	-> 18
/*     */     //   #433	-> 25
/*     */     //   #646	-> 49
/*     */     //   #85	-> 66
/*     */     //   #434	-> 81
/*     */     //   #627	-> 86
/*     */     //   #385	-> 98
/*     */     //   #140	-> 105
/*     */     //   #80	-> 115
/*     */     //   #355	-> 126
/*     */     //   #285	-> 133
/*     */     //   #582	-> 140
/*     */     //   #209	-> 147
/*     */     //   #390	-> 154
/*     */     //   #575	-> 177
/*     */     //   #244	-> 190
/*     */     //   #179	-> 195
/*     */     //   #641	-> 217
/*     */     //   #250	-> 227
/*     */     //   #105	-> 239
/*     */     //   #692	-> 247
/*     */     //   #366	-> 255
/*     */     //   #145	-> 272
/*     */     //   #727	-> 280
/*     */     //   #359	-> 297
/*     */     //   #521	-> 304
/*     */     //   #27	-> 321
/*     */     //   #493	-> 361
/*     */     //   #363	-> 378
/*     */     //   #166	-> 387
/*     */     //   #227	-> 393
/*     */     //   #401	-> 411
/*     */     //   #372	-> 421
/*     */     //   #492	-> 432
/*     */     //   #614	-> 442
/*     */     //   #619	-> 452
/*     */     //   #752	-> 462
/*     */     //   #324	-> 472
/*     */     //   #257	-> 489
/*     */     //   #245	-> 495
/*     */     //   #600	-> 510
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	42	45	java/lang/IllegalStateException
/*     */     //   154	210	213	java/lang/IllegalStateException
/*     */     //   227	265	268	java/lang/IllegalStateException
/*     */     //   272	290	293	java/lang/IllegalStateException
/*     */     //   297	314	317	java/lang/IllegalStateException
/*     */     //   321	340	343	java/lang/IllegalStateException
/*     */     //   332	354	357	java/lang/IllegalStateException
/*     */     //   347	371	374	java/lang/IllegalStateException
/*     */     //   378	404	407	java/lang/IllegalStateException
/*     */     //   424	458	458	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
/*     */     this.buf.setLength(0);
/*     */     this.buf.append(this.tab2).append("TABLESWITCH\n");
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < paramVarArgs.length; appendLabel(paramVarArgs[b]), this.buf.append('\n'))
/*     */         this.buf.append(this.tab3).append(paramInt1 + b).append(": "); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(this.tab3).append("default: ");
/*     */     appendLabel(paramLabel);
/*     */     this.buf.append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   protected Textifier(int paramInt) {
/*     */     super(paramInt);
/*     */     this.valueNumber = 0;
/*     */   }
/*     */   
/*     */   private void visitLong(long paramLong) {
/*     */     this.buf.append(paramLong).append('L');
/*     */   }
/*     */   
/*     */   private void visitString(String paramString) {
/*     */     appendString(this.buf, paramString);
/*     */   }
/*     */   
/*     */   public void visit(String paramString, Object paramObject) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   4: iconst_0
/*     */     //   5: invokevirtual setLength : (I)V
/*     */     //   8: aload_0
/*     */     //   9: aload_0
/*     */     //   10: dup
/*     */     //   11: getfield valueNumber : I
/*     */     //   14: dup_x1
/*     */     //   15: iconst_1
/*     */     //   16: iadd
/*     */     //   17: putfield valueNumber : I
/*     */     //   20: invokespecial appendComa : (I)V
/*     */     //   23: aload_1
/*     */     //   24: ifnull -> 48
/*     */     //   27: aload_0
/*     */     //   28: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   31: aload_1
/*     */     //   32: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuffer;
/*     */     //   35: bipush #61
/*     */     //   37: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   40: pop
/*     */     //   41: goto -> 48
/*     */     //   44: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   47: athrow
/*     */     //   48: aload_2
/*     */     //   49: instanceof java/lang/String
/*     */     //   52: ifeq -> 70
/*     */     //   55: aload_0
/*     */     //   56: aload_2
/*     */     //   57: checkcast java/lang/String
/*     */     //   60: invokespecial visitString : (Ljava/lang/String;)V
/*     */     //   63: goto -> 742
/*     */     //   66: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   69: athrow
/*     */     //   70: aload_2
/*     */     //   71: instanceof org/spongepowered/asm/lib/Type
/*     */     //   74: ifeq -> 92
/*     */     //   77: aload_0
/*     */     //   78: aload_2
/*     */     //   79: checkcast org/spongepowered/asm/lib/Type
/*     */     //   82: invokespecial visitType : (Lorg/spongepowered/asm/lib/Type;)V
/*     */     //   85: goto -> 742
/*     */     //   88: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   91: athrow
/*     */     //   92: aload_2
/*     */     //   93: instanceof java/lang/Byte
/*     */     //   96: ifeq -> 117
/*     */     //   99: aload_0
/*     */     //   100: aload_2
/*     */     //   101: checkcast java/lang/Byte
/*     */     //   104: invokevirtual byteValue : ()B
/*     */     //   107: invokespecial visitByte : (B)V
/*     */     //   110: goto -> 742
/*     */     //   113: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   116: athrow
/*     */     //   117: aload_2
/*     */     //   118: instanceof java/lang/Boolean
/*     */     //   121: ifeq -> 142
/*     */     //   124: aload_0
/*     */     //   125: aload_2
/*     */     //   126: checkcast java/lang/Boolean
/*     */     //   129: invokevirtual booleanValue : ()Z
/*     */     //   132: invokespecial visitBoolean : (Z)V
/*     */     //   135: goto -> 742
/*     */     //   138: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   141: athrow
/*     */     //   142: aload_2
/*     */     //   143: instanceof java/lang/Short
/*     */     //   146: ifeq -> 167
/*     */     //   149: aload_0
/*     */     //   150: aload_2
/*     */     //   151: checkcast java/lang/Short
/*     */     //   154: invokevirtual shortValue : ()S
/*     */     //   157: invokespecial visitShort : (S)V
/*     */     //   160: goto -> 742
/*     */     //   163: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   166: athrow
/*     */     //   167: aload_2
/*     */     //   168: instanceof java/lang/Character
/*     */     //   171: ifeq -> 192
/*     */     //   174: aload_0
/*     */     //   175: aload_2
/*     */     //   176: checkcast java/lang/Character
/*     */     //   179: invokevirtual charValue : ()C
/*     */     //   182: invokespecial visitChar : (C)V
/*     */     //   185: goto -> 742
/*     */     //   188: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   191: athrow
/*     */     //   192: aload_2
/*     */     //   193: instanceof java/lang/Integer
/*     */     //   196: ifeq -> 217
/*     */     //   199: aload_0
/*     */     //   200: aload_2
/*     */     //   201: checkcast java/lang/Integer
/*     */     //   204: invokevirtual intValue : ()I
/*     */     //   207: invokespecial visitInt : (I)V
/*     */     //   210: goto -> 742
/*     */     //   213: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   216: athrow
/*     */     //   217: aload_2
/*     */     //   218: instanceof java/lang/Float
/*     */     //   221: ifeq -> 242
/*     */     //   224: aload_0
/*     */     //   225: aload_2
/*     */     //   226: checkcast java/lang/Float
/*     */     //   229: invokevirtual floatValue : ()F
/*     */     //   232: invokespecial visitFloat : (F)V
/*     */     //   235: goto -> 742
/*     */     //   238: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   241: athrow
/*     */     //   242: aload_2
/*     */     //   243: instanceof java/lang/Long
/*     */     //   246: ifeq -> 267
/*     */     //   249: aload_0
/*     */     //   250: aload_2
/*     */     //   251: checkcast java/lang/Long
/*     */     //   254: invokevirtual longValue : ()J
/*     */     //   257: invokespecial visitLong : (J)V
/*     */     //   260: goto -> 742
/*     */     //   263: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   266: athrow
/*     */     //   267: aload_2
/*     */     //   268: instanceof java/lang/Double
/*     */     //   271: ifeq -> 292
/*     */     //   274: aload_0
/*     */     //   275: aload_2
/*     */     //   276: checkcast java/lang/Double
/*     */     //   279: invokevirtual doubleValue : ()D
/*     */     //   282: invokespecial visitDouble : (D)V
/*     */     //   285: goto -> 742
/*     */     //   288: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   291: athrow
/*     */     //   292: aload_2
/*     */     //   293: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   296: invokevirtual isArray : ()Z
/*     */     //   299: ifeq -> 742
/*     */     //   302: aload_0
/*     */     //   303: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   306: bipush #123
/*     */     //   308: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   311: pop
/*     */     //   312: aload_2
/*     */     //   313: instanceof [B
/*     */     //   316: ifeq -> 371
/*     */     //   319: goto -> 326
/*     */     //   322: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   325: athrow
/*     */     //   326: aload_2
/*     */     //   327: checkcast [B
/*     */     //   330: checkcast [B
/*     */     //   333: astore_3
/*     */     //   334: iconst_0
/*     */     //   335: istore #4
/*     */     //   337: iload #4
/*     */     //   339: aload_3
/*     */     //   340: arraylength
/*     */     //   341: if_icmpge -> 368
/*     */     //   344: aload_0
/*     */     //   345: iload #4
/*     */     //   347: invokespecial appendComa : (I)V
/*     */     //   350: aload_0
/*     */     //   351: aload_3
/*     */     //   352: iload #4
/*     */     //   354: baload
/*     */     //   355: invokespecial visitByte : (B)V
/*     */     //   358: iinc #4, 1
/*     */     //   361: goto -> 337
/*     */     //   364: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   367: athrow
/*     */     //   368: goto -> 732
/*     */     //   371: aload_2
/*     */     //   372: instanceof [Z
/*     */     //   375: ifeq -> 423
/*     */     //   378: aload_2
/*     */     //   379: checkcast [Z
/*     */     //   382: checkcast [Z
/*     */     //   385: astore_3
/*     */     //   386: iconst_0
/*     */     //   387: istore #4
/*     */     //   389: iload #4
/*     */     //   391: aload_3
/*     */     //   392: arraylength
/*     */     //   393: if_icmpge -> 420
/*     */     //   396: aload_0
/*     */     //   397: iload #4
/*     */     //   399: invokespecial appendComa : (I)V
/*     */     //   402: aload_0
/*     */     //   403: aload_3
/*     */     //   404: iload #4
/*     */     //   406: baload
/*     */     //   407: invokespecial visitBoolean : (Z)V
/*     */     //   410: iinc #4, 1
/*     */     //   413: goto -> 389
/*     */     //   416: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   419: athrow
/*     */     //   420: goto -> 732
/*     */     //   423: aload_2
/*     */     //   424: instanceof [S
/*     */     //   427: ifeq -> 475
/*     */     //   430: aload_2
/*     */     //   431: checkcast [S
/*     */     //   434: checkcast [S
/*     */     //   437: astore_3
/*     */     //   438: iconst_0
/*     */     //   439: istore #4
/*     */     //   441: iload #4
/*     */     //   443: aload_3
/*     */     //   444: arraylength
/*     */     //   445: if_icmpge -> 472
/*     */     //   448: aload_0
/*     */     //   449: iload #4
/*     */     //   451: invokespecial appendComa : (I)V
/*     */     //   454: aload_0
/*     */     //   455: aload_3
/*     */     //   456: iload #4
/*     */     //   458: saload
/*     */     //   459: invokespecial visitShort : (S)V
/*     */     //   462: iinc #4, 1
/*     */     //   465: goto -> 441
/*     */     //   468: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   471: athrow
/*     */     //   472: goto -> 732
/*     */     //   475: aload_2
/*     */     //   476: instanceof [C
/*     */     //   479: ifeq -> 527
/*     */     //   482: aload_2
/*     */     //   483: checkcast [C
/*     */     //   486: checkcast [C
/*     */     //   489: astore_3
/*     */     //   490: iconst_0
/*     */     //   491: istore #4
/*     */     //   493: iload #4
/*     */     //   495: aload_3
/*     */     //   496: arraylength
/*     */     //   497: if_icmpge -> 524
/*     */     //   500: aload_0
/*     */     //   501: iload #4
/*     */     //   503: invokespecial appendComa : (I)V
/*     */     //   506: aload_0
/*     */     //   507: aload_3
/*     */     //   508: iload #4
/*     */     //   510: caload
/*     */     //   511: invokespecial visitChar : (C)V
/*     */     //   514: iinc #4, 1
/*     */     //   517: goto -> 493
/*     */     //   520: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   523: athrow
/*     */     //   524: goto -> 732
/*     */     //   527: aload_2
/*     */     //   528: instanceof [I
/*     */     //   531: ifeq -> 579
/*     */     //   534: aload_2
/*     */     //   535: checkcast [I
/*     */     //   538: checkcast [I
/*     */     //   541: astore_3
/*     */     //   542: iconst_0
/*     */     //   543: istore #4
/*     */     //   545: iload #4
/*     */     //   547: aload_3
/*     */     //   548: arraylength
/*     */     //   549: if_icmpge -> 576
/*     */     //   552: aload_0
/*     */     //   553: iload #4
/*     */     //   555: invokespecial appendComa : (I)V
/*     */     //   558: aload_0
/*     */     //   559: aload_3
/*     */     //   560: iload #4
/*     */     //   562: iaload
/*     */     //   563: invokespecial visitInt : (I)V
/*     */     //   566: iinc #4, 1
/*     */     //   569: goto -> 545
/*     */     //   572: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   575: athrow
/*     */     //   576: goto -> 732
/*     */     //   579: aload_2
/*     */     //   580: instanceof [J
/*     */     //   583: ifeq -> 631
/*     */     //   586: aload_2
/*     */     //   587: checkcast [J
/*     */     //   590: checkcast [J
/*     */     //   593: astore_3
/*     */     //   594: iconst_0
/*     */     //   595: istore #4
/*     */     //   597: iload #4
/*     */     //   599: aload_3
/*     */     //   600: arraylength
/*     */     //   601: if_icmpge -> 628
/*     */     //   604: aload_0
/*     */     //   605: iload #4
/*     */     //   607: invokespecial appendComa : (I)V
/*     */     //   610: aload_0
/*     */     //   611: aload_3
/*     */     //   612: iload #4
/*     */     //   614: laload
/*     */     //   615: invokespecial visitLong : (J)V
/*     */     //   618: iinc #4, 1
/*     */     //   621: goto -> 597
/*     */     //   624: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   627: athrow
/*     */     //   628: goto -> 732
/*     */     //   631: aload_2
/*     */     //   632: instanceof [F
/*     */     //   635: ifeq -> 683
/*     */     //   638: aload_2
/*     */     //   639: checkcast [F
/*     */     //   642: checkcast [F
/*     */     //   645: astore_3
/*     */     //   646: iconst_0
/*     */     //   647: istore #4
/*     */     //   649: iload #4
/*     */     //   651: aload_3
/*     */     //   652: arraylength
/*     */     //   653: if_icmpge -> 680
/*     */     //   656: aload_0
/*     */     //   657: iload #4
/*     */     //   659: invokespecial appendComa : (I)V
/*     */     //   662: aload_0
/*     */     //   663: aload_3
/*     */     //   664: iload #4
/*     */     //   666: faload
/*     */     //   667: invokespecial visitFloat : (F)V
/*     */     //   670: iinc #4, 1
/*     */     //   673: goto -> 649
/*     */     //   676: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   679: athrow
/*     */     //   680: goto -> 732
/*     */     //   683: aload_2
/*     */     //   684: instanceof [D
/*     */     //   687: ifeq -> 732
/*     */     //   690: aload_2
/*     */     //   691: checkcast [D
/*     */     //   694: checkcast [D
/*     */     //   697: astore_3
/*     */     //   698: iconst_0
/*     */     //   699: istore #4
/*     */     //   701: iload #4
/*     */     //   703: aload_3
/*     */     //   704: arraylength
/*     */     //   705: if_icmpge -> 732
/*     */     //   708: aload_0
/*     */     //   709: iload #4
/*     */     //   711: invokespecial appendComa : (I)V
/*     */     //   714: aload_0
/*     */     //   715: aload_3
/*     */     //   716: iload #4
/*     */     //   718: daload
/*     */     //   719: invokespecial visitDouble : (D)V
/*     */     //   722: iinc #4, 1
/*     */     //   725: goto -> 701
/*     */     //   728: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   731: athrow
/*     */     //   732: aload_0
/*     */     //   733: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   736: bipush #125
/*     */     //   738: invokevirtual append : (C)Ljava/lang/StringBuffer;
/*     */     //   741: pop
/*     */     //   742: aload_0
/*     */     //   743: getfield text : Ljava/util/List;
/*     */     //   746: aload_0
/*     */     //   747: getfield buf : Ljava/lang/StringBuffer;
/*     */     //   750: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   753: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   758: pop
/*     */     //   759: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #761	-> 0
/*     */     //   #262	-> 8
/*     */     //   #565	-> 23
/*     */     //   #695	-> 27
/*     */     //   #572	-> 48
/*     */     //   #636	-> 55
/*     */     //   #631	-> 70
/*     */     //   #266	-> 77
/*     */     //   #141	-> 92
/*     */     //   #550	-> 99
/*     */     //   #38	-> 117
/*     */     //   #315	-> 124
/*     */     //   #634	-> 142
/*     */     //   #484	-> 149
/*     */     //   #376	-> 167
/*     */     //   #440	-> 174
/*     */     //   #230	-> 192
/*     */     //   #558	-> 199
/*     */     //   #527	-> 217
/*     */     //   #130	-> 224
/*     */     //   #410	-> 242
/*     */     //   #36	-> 249
/*     */     //   #697	-> 267
/*     */     //   #720	-> 274
/*     */     //   #496	-> 292
/*     */     //   #282	-> 302
/*     */     //   #645	-> 312
/*     */     //   #488	-> 326
/*     */     //   #31	-> 334
/*     */     //   #687	-> 344
/*     */     //   #515	-> 350
/*     */     //   #329	-> 358
/*     */     //   #98	-> 368
/*     */     //   #446	-> 378
/*     */     //   #396	-> 386
/*     */     //   #485	-> 396
/*     */     //   #48	-> 402
/*     */     //   #470	-> 410
/*     */     //   #349	-> 420
/*     */     //   #705	-> 430
/*     */     //   #502	-> 438
/*     */     //   #779	-> 448
/*     */     //   #648	-> 454
/*     */     //   #41	-> 462
/*     */     //   #793	-> 472
/*     */     //   #39	-> 482
/*     */     //   #367	-> 490
/*     */     //   #706	-> 500
/*     */     //   #339	-> 506
/*     */     //   #368	-> 514
/*     */     //   #663	-> 524
/*     */     //   #312	-> 534
/*     */     //   #25	-> 542
/*     */     //   #119	-> 552
/*     */     //   #61	-> 558
/*     */     //   #97	-> 566
/*     */     //   #274	-> 576
/*     */     //   #343	-> 586
/*     */     //   #353	-> 594
/*     */     //   #617	-> 604
/*     */     //   #395	-> 610
/*     */     //   #382	-> 618
/*     */     //   #174	-> 628
/*     */     //   #460	-> 638
/*     */     //   #172	-> 646
/*     */     //   #70	-> 656
/*     */     //   #378	-> 662
/*     */     //   #96	-> 670
/*     */     //   #352	-> 680
/*     */     //   #742	-> 690
/*     */     //   #185	-> 698
/*     */     //   #394	-> 708
/*     */     //   #678	-> 714
/*     */     //   #804	-> 722
/*     */     //   #297	-> 732
/*     */     //   #536	-> 742
/*     */     //   #633	-> 759
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	41	44	java/lang/IllegalStateException
/*     */     //   48	66	66	java/lang/IllegalStateException
/*     */     //   70	88	88	java/lang/IllegalStateException
/*     */     //   92	113	113	java/lang/IllegalStateException
/*     */     //   117	138	138	java/lang/IllegalStateException
/*     */     //   142	163	163	java/lang/IllegalStateException
/*     */     //   167	188	188	java/lang/IllegalStateException
/*     */     //   192	213	213	java/lang/IllegalStateException
/*     */     //   217	238	238	java/lang/IllegalStateException
/*     */     //   242	263	263	java/lang/IllegalStateException
/*     */     //   267	288	288	java/lang/IllegalStateException
/*     */     //   292	319	322	java/lang/IllegalStateException
/*     */     //   337	364	364	java/lang/IllegalStateException
/*     */     //   389	416	416	java/lang/IllegalStateException
/*     */     //   441	468	468	java/lang/IllegalStateException
/*     */     //   493	520	520	java/lang/IllegalStateException
/*     */     //   545	572	572	java/lang/IllegalStateException
/*     */     //   597	624	624	java/lang/IllegalStateException
/*     */     //   649	676	676	java/lang/IllegalStateException
/*     */     //   701	728	728	java/lang/IllegalStateException
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
/*     */     //   68: ldc 'Prints a disassembled view of the given class.'
/*     */     //   70: invokevirtual println : (Ljava/lang/String;)V
/*     */     //   73: getstatic java/lang/System.err : Ljava/io/PrintStream;
/*     */     //   76: ldc 'Usage: Textifier [-debug] <fully qualified class name or class file name>'
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
/*     */     //   175: new java/io/PrintWriter
/*     */     //   178: dup
/*     */     //   179: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   182: invokespecial <init> : (Ljava/io/OutputStream;)V
/*     */     //   185: invokespecial <init> : (Ljava/io/PrintWriter;)V
/*     */     //   188: iload_2
/*     */     //   189: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;I)V
/*     */     //   192: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #797	-> 0
/*     */     //   #686	-> 2
/*     */     //   #722	-> 4
/*     */     //   #150	-> 6
/*     */     //   #87	-> 25
/*     */     //   #361	-> 27
/*     */     //   #248	-> 49
/*     */     //   #409	-> 51
/*     */     //   #457	-> 53
/*     */     //   #90	-> 59
/*     */     //   #701	-> 61
/*     */     //   #143	-> 65
/*     */     //   #14	-> 70
/*     */     //   #739	-> 73
/*     */     //   #459	-> 81
/*     */     //   #776	-> 86
/*     */     //   #310	-> 121
/*     */     //   #758	-> 135
/*     */     //   #94	-> 157
/*     */     //   #494	-> 169
/*     */     //   #735	-> 192
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   6	18	21	java/lang/Exception
/*     */     //   27	42	45	java/lang/Exception
/*     */     //   61	82	82	java/lang/Exception
/*     */     //   86	109	112	java/lang/Exception
/*     */     //   97	128	131	java/lang/Exception
/*     */   }
/*     */   
/*     */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       this.buf.setLength(0);
/*     */       if (paramInt1 == 188) {
/*     */       
/*     */       } else {
/*     */       
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.buf.append(this.tab2).append(OPCODES[paramInt1]).append(' ').append(Integer.toString(paramInt2)).append('\n');
/*     */     this.text.add(this.buf.toString());
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\Textifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */