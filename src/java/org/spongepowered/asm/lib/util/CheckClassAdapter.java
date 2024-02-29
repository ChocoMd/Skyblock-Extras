/*     */ package org.spongepowered.asm.lib.util;
/*     */ 
/*     */ import java.io.PrintWriter;
/*     */ import org.spongepowered.asm.lib.ClassReader;
/*     */ import org.spongepowered.asm.lib.TypePath;
/*     */ import org.spongepowered.asm.lib.tree.MethodNode;
/*     */ 
/*     */ public class CheckClassAdapter extends ClassVisitor {
/*     */   private int version;
/*     */   private boolean start;
/*     */   private boolean source;
/*     */   private boolean outer;
/*     */   private boolean end;
/*     */   
/*  15 */   public static void checkFieldSignature(String paramString) { int i = checkFieldTypeSignature(paramString, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 125 */       if (i != paramString.length())
/*     */         throw new IllegalArgumentException(paramString + ": error at index " + i); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/* 129 */     }  } private static int checkTypeArguments(String paramString, int paramInt) { paramInt = checkChar('<', paramString, paramInt); paramInt = checkTypeArgument(paramString, paramInt);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 283 */     while (getChar(paramString, paramInt) != '>')
/*     */       paramInt = checkTypeArgument(paramString, paramInt);  return paramInt + 1; } static void checkTypeRefAndPath(int paramInt, TypePath paramTypePath) { int i = 0; switch (paramInt >>> 24) { case 0: case 1: case 22: i = -65536; break;
/*     */       case 19: case 20: case 21: case 64: case 65: case 67: case 68: case 69: case 70:
/*     */         i = -16777216; break;
/*     */       case 16:
/*     */       case 17:
/*     */       case 18:
/*     */       case 23:
/*     */       case 66:
/*     */         i = -256; break;
/*     */       case 71:
/*     */       case 72:
/*     */       case 73:
/*     */       case 74:
/*     */       case 75:
/*     */         i = -16776961; break;
/*     */       default:
/* 300 */         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(paramInt >>> 24)); }  try { if ((paramInt & (i ^ 0xFFFFFFFF)) != 0)
/*     */         throw new IllegalArgumentException("Invalid type reference 0x" + Integer.toHexString(paramInt));  } catch (IllegalStateException illegalStateException) { throw b(null); }  if (paramTypePath != null)
/*     */       for (byte b = 0; b < paramTypePath.getLength(); ) { int j = paramTypePath.getStep(b); try { if (j != 0)
/*     */             try { if (j != 1)
/*     */                 try { if (j != 3)
/*     */                     try { if (j != 2)
/*     */                         throw new IllegalArgumentException("Invalid type path step " + b + " in " + paramTypePath);  } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  }   } static void printAnalyzerResult(MethodNode paramMethodNode, Analyzer<BasicValue> paramAnalyzer, PrintWriter paramPrintWriter) { Frame[] arrayOfFrame = paramAnalyzer.getFrames(); Textifier textifier = new Textifier(); TraceMethodVisitor traceMethodVisitor = new TraceMethodVisitor(textifier); paramPrintWriter.println(paramMethodNode.name + paramMethodNode.desc); byte b = 0; while (true) { StringBuilder stringBuilder; if (b < paramMethodNode.instructions.size()) { paramMethodNode.instructions.get(b).accept(traceMethodVisitor); stringBuilder = new StringBuilder(); Frame frame = arrayOfFrame[b]; try { if (frame == null) { stringBuilder.append('?'); } else { byte b1 = 0; try { for (; b1 < frame.getLocals(); stringBuilder.append(getShortName(((BasicValue)frame.getLocal(b1)).toString())).append(' '), b1++); } catch (IllegalStateException illegalStateException) { throw b(null); }  }  } catch (IllegalStateException illegalStateException) { throw b(null); }  } else { break; }  while (stringBuilder.length() < paramMethodNode.maxStack + paramMethodNode.maxLocals + 1)
/* 307 */         stringBuilder.append(' ');  paramPrintWriter.print(Integer.toString(b + 100000).substring(1)); paramPrintWriter.print(" " + stringBuilder + " : " + textifier.text.get(textifier.text.size() - 1)); b++; }  b = 0; try { while (b < paramMethodNode.tryCatchBlocks.size()) { ((TryCatchBlockNode)paramMethodNode.tryCatchBlocks.get(b)).accept(traceMethodVisitor); paramPrintWriter.print(" " + textifier.text.get(textifier.text.size() - 1)); b++; }  } catch (IllegalStateException illegalStateException) { throw b(null); }  paramPrintWriter.println(); }
/* 308 */   public void visitAttribute(Attribute paramAttribute) { try { checkState(); if (paramAttribute == null) throw new IllegalArgumentException("Invalid attribute (must not be null)");  } catch (IllegalStateException illegalStateException) { throw b(null); }  super.visitAttribute(paramAttribute); } public static void checkMethodSignature(String paramString) { int i = 0; if (getChar(paramString, 0) == '<') i = checkFormalTypeParameters(paramString, i); 
/*     */     i = checkChar('(', paramString, i);
/*     */     while ("ZCBSIFJDL[T".indexOf(getChar(paramString, i)) != -1)
/*     */       i = checkTypeSignature(paramString, i); 
/*     */     i = checkChar(')', paramString, i);
/*     */     try {
/*     */       if (getChar(paramString, i) == 'V') {
/*     */         i++;
/*     */       } else {
/*     */         i = checkTypeSignature(paramString, i);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     while (true) {
/*     */       try {
/*     */         if (getChar(paramString, i) == '^') {
/*     */           i++;
/*     */           if (getChar(paramString, i) == 'L') {
/*     */             i = checkClassTypeSignature(paramString, i);
/*     */             continue;
/*     */           } 
/*     */           i = checkTypeVariableSignature(paramString, i);
/*     */           continue;
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     try {
/*     */       if (i != paramString.length())
/*     */         throw new IllegalArgumentException(paramString + ": error at index " + i); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     }  }
/*     */ 
/*     */   
/*     */   public void visitOuterClass(String paramString1, String paramString2, String paramString3) {
/*     */     try {
/*     */       checkState();
/*     */       if (this.outer)
/*     */         throw new IllegalStateException("visitOuterClass can be called only once."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.outer = true;
/*     */       if (paramString1 == null)
/*     */         throw new IllegalArgumentException("Illegal outer class owner"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramString3 != null)
/*     */         CheckMethodAdapter.checkMethodDesc(paramString3); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitOuterClass(paramString1, paramString2, paramString3);
/*     */   }
/*     */   
/*     */   private static int checkTypeSignature(String paramString, int paramInt) {
/*     */     try {
/*     */       switch (getChar(paramString, paramInt)) {
/*     */         case 'B':
/*     */         case 'C':
/*     */         case 'D':
/*     */         case 'F':
/*     */         case 'I':
/*     */         case 'J':
/*     */         case 'S':
/*     */         case 'Z':
/*     */           return paramInt + 1;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return checkFieldTypeSignature(paramString, paramInt);
/*     */   }
/*     */   
/*     */   private void checkState() {
/*     */     try {
/*     */       if (!this.start)
/*     */         throw new IllegalStateException("Cannot visit member before visit has been called."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (this.end)
/*     */         throw new IllegalStateException("Cannot visit member after visitEnd has been called."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void verify(ClassReader paramClassReader, ClassLoader paramClassLoader, boolean paramBoolean, PrintWriter paramPrintWriter) {
/*     */     // Byte code:
/*     */     //   0: new org/spongepowered/asm/lib/tree/ClassNode
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore #4
/*     */     //   9: aload_0
/*     */     //   10: new org/spongepowered/asm/lib/util/CheckClassAdapter
/*     */     //   13: dup
/*     */     //   14: aload #4
/*     */     //   16: iconst_0
/*     */     //   17: invokespecial <init> : (Lorg/spongepowered/asm/lib/ClassVisitor;Z)V
/*     */     //   20: iconst_2
/*     */     //   21: invokevirtual accept : (Lorg/spongepowered/asm/lib/ClassVisitor;I)V
/*     */     //   24: aload #4
/*     */     //   26: getfield superName : Ljava/lang/String;
/*     */     //   29: ifnonnull -> 40
/*     */     //   32: aconst_null
/*     */     //   33: goto -> 48
/*     */     //   36: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   39: athrow
/*     */     //   40: aload #4
/*     */     //   42: getfield superName : Ljava/lang/String;
/*     */     //   45: invokestatic getObjectType : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   48: astore #5
/*     */     //   50: aload #4
/*     */     //   52: getfield methods : Ljava/util/List;
/*     */     //   55: astore #6
/*     */     //   57: new java/util/ArrayList
/*     */     //   60: dup
/*     */     //   61: invokespecial <init> : ()V
/*     */     //   64: astore #7
/*     */     //   66: aload #4
/*     */     //   68: getfield interfaces : Ljava/util/List;
/*     */     //   71: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   76: astore #8
/*     */     //   78: aload #8
/*     */     //   80: invokeinterface hasNext : ()Z
/*     */     //   85: ifeq -> 116
/*     */     //   88: aload #7
/*     */     //   90: aload #8
/*     */     //   92: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   97: checkcast java/lang/String
/*     */     //   100: invokestatic getObjectType : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   103: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   108: pop
/*     */     //   109: goto -> 78
/*     */     //   112: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   115: athrow
/*     */     //   116: iconst_0
/*     */     //   117: istore #8
/*     */     //   119: iload #8
/*     */     //   121: aload #6
/*     */     //   123: invokeinterface size : ()I
/*     */     //   128: if_icmpge -> 260
/*     */     //   131: aload #6
/*     */     //   133: iload #8
/*     */     //   135: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   140: checkcast org/spongepowered/asm/lib/tree/MethodNode
/*     */     //   143: astore #9
/*     */     //   145: new org/spongepowered/asm/lib/tree/analysis/SimpleVerifier
/*     */     //   148: dup
/*     */     //   149: aload #4
/*     */     //   151: getfield name : Ljava/lang/String;
/*     */     //   154: invokestatic getObjectType : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Type;
/*     */     //   157: aload #5
/*     */     //   159: aload #7
/*     */     //   161: aload #4
/*     */     //   163: getfield access : I
/*     */     //   166: sipush #512
/*     */     //   169: iand
/*     */     //   170: ifeq -> 181
/*     */     //   173: iconst_1
/*     */     //   174: goto -> 182
/*     */     //   177: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   180: athrow
/*     */     //   181: iconst_0
/*     */     //   182: invokespecial <init> : (Lorg/spongepowered/asm/lib/Type;Lorg/spongepowered/asm/lib/Type;Ljava/util/List;Z)V
/*     */     //   185: astore #10
/*     */     //   187: new org/spongepowered/asm/lib/tree/analysis/Analyzer
/*     */     //   190: dup
/*     */     //   191: aload #10
/*     */     //   193: invokespecial <init> : (Lorg/spongepowered/asm/lib/tree/analysis/Interpreter;)V
/*     */     //   196: astore #11
/*     */     //   198: aload_1
/*     */     //   199: ifnull -> 215
/*     */     //   202: aload #10
/*     */     //   204: aload_1
/*     */     //   205: invokevirtual setClassLoader : (Ljava/lang/ClassLoader;)V
/*     */     //   208: goto -> 215
/*     */     //   211: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   214: athrow
/*     */     //   215: aload #11
/*     */     //   217: aload #4
/*     */     //   219: getfield name : Ljava/lang/String;
/*     */     //   222: aload #9
/*     */     //   224: invokevirtual analyze : (Ljava/lang/String;Lorg/spongepowered/asm/lib/tree/MethodNode;)[Lorg/spongepowered/asm/lib/tree/analysis/Frame;
/*     */     //   227: pop
/*     */     //   228: iload_2
/*     */     //   229: ifne -> 235
/*     */     //   232: goto -> 254
/*     */     //   235: goto -> 246
/*     */     //   238: astore #12
/*     */     //   240: aload #12
/*     */     //   242: aload_3
/*     */     //   243: invokevirtual printStackTrace : (Ljava/io/PrintWriter;)V
/*     */     //   246: aload #9
/*     */     //   248: aload #11
/*     */     //   250: aload_3
/*     */     //   251: invokestatic printAnalyzerResult : (Lorg/spongepowered/asm/lib/tree/MethodNode;Lorg/spongepowered/asm/lib/tree/analysis/Analyzer;Ljava/io/PrintWriter;)V
/*     */     //   254: iinc #8, 1
/*     */     //   257: goto -> 119
/*     */     //   260: aload_3
/*     */     //   261: invokevirtual flush : ()V
/*     */     //   264: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #63	-> 0
/*     */     //   #19	-> 9
/*     */     //   #79	-> 24
/*     */     //   #128	-> 45
/*     */     //   #235	-> 50
/*     */     //   #242	-> 57
/*     */     //   #216	-> 66
/*     */     //   #36	-> 88
/*     */     //   #40	-> 116
/*     */     //   #113	-> 131
/*     */     //   #161	-> 145
/*     */     //   #279	-> 154
/*     */     //   #164	-> 187
/*     */     //   #144	-> 198
/*     */     //   #232	-> 202
/*     */     //   #38	-> 215
/*     */     //   #195	-> 228
/*     */     //   #205	-> 232
/*     */     //   #130	-> 235
/*     */     //   #34	-> 238
/*     */     //   #243	-> 240
/*     */     //   #276	-> 246
/*     */     //   #158	-> 254
/*     */     //   #289	-> 260
/*     */     //   #188	-> 264
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	36	36	java/lang/Exception
/*     */     //   78	112	112	java/lang/Exception
/*     */     //   145	177	177	java/lang/Exception
/*     */     //   198	208	211	java/lang/Exception
/*     */     //   215	232	238	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static int checkFormalTypeParameter(String paramString, int paramInt) {
/*     */     paramInt = checkIdentifier(paramString, paramInt);
/*     */     paramInt = checkChar(':', paramString, paramInt);
/*     */     if ("L[T".indexOf(getChar(paramString, paramInt)) != -1)
/*     */       paramInt = checkFieldTypeSignature(paramString, paramInt); 
/*     */     while (getChar(paramString, paramInt) == ':')
/*     */       paramInt = checkFieldTypeSignature(paramString, paramInt + 1); 
/*     */     return paramInt;
/*     */   }
/*     */   
/*     */   private static int checkClassTypeSignature(String paramString, int paramInt) {
/*     */     paramInt = checkChar('L', paramString, paramInt);
/*     */     paramInt = checkIdentifier(paramString, paramInt);
/*     */     while (getChar(paramString, paramInt) == '/')
/*     */       paramInt = checkIdentifier(paramString, paramInt + 1); 
/*     */     if (getChar(paramString, paramInt) == '<')
/*     */       paramInt = checkTypeArguments(paramString, paramInt); 
/*     */     while (getChar(paramString, paramInt) == '.') {
/*     */       paramInt = checkIdentifier(paramString, paramInt + 1);
/*     */       if (getChar(paramString, paramInt) == '<')
/*     */         paramInt = checkTypeArguments(paramString, paramInt); 
/*     */     } 
/*     */     return checkChar(';', paramString, paramInt);
/*     */   }
/*     */   
/*     */   public CheckClassAdapter(ClassVisitor paramClassVisitor, boolean paramBoolean) {
/*     */     this(327680, paramClassVisitor, paramBoolean);
/*     */     if (getClass() != CheckClassAdapter.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     checkState();
/*     */     int i = paramInt >>> 24;
/*     */     try {
/*     */       if (i != 0)
/*     */         try {
/*     */           if (i != 17)
/*     */             try {
/*     */               if (i != 16)
/*     */                 throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     checkTypeRefAndPath(paramInt, paramTypePath);
/*     */     CheckMethodAdapter.checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   public void visitEnd() {
/*     */     checkState();
/*     */     this.end = true;
/*     */     super.visitEnd();
/*     */   }
/*     */   
/*     */   public void visitSource(String paramString1, String paramString2) {
/*     */     try {
/*     */       checkState();
/*     */       if (this.source)
/*     */         throw new IllegalStateException("visitSource can be called only once."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.source = true;
/*     */     super.visitSource(paramString1, paramString2);
/*     */   }
/*     */   
/*     */   private static char getChar(String paramString, int paramInt) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (paramInt < paramString.length()) ? paramString.charAt(paramInt) : Character.MIN_VALUE;
/*     */   }
/*     */   
/*     */   private static int checkChar(char paramChar, String paramString, int paramInt) {
/*     */     try {
/*     */       if (getChar(paramString, paramInt) == paramChar)
/*     */         return paramInt + 1; 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException(paramString + ": '" + paramChar + "' expected at index " + paramInt);
/*     */   }
/*     */   
/*     */   public static void checkClassSignature(String paramString) {
/*     */     int i = 0;
/*     */     if (getChar(paramString, 0) == '<')
/*     */       i = checkFormalTypeParameters(paramString, i); 
/*     */     i = checkClassTypeSignature(paramString, i);
/*     */     while (getChar(paramString, i) == 'L')
/*     */       i = checkClassTypeSignature(paramString, i); 
/*     */     try {
/*     */       if (i != paramString.length())
/*     */         throw new IllegalArgumentException(paramString + ": error at index " + i); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static void checkAccess(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       if ((paramInt1 & (paramInt2 ^ 0xFFFFFFFF)) != 0)
/*     */         throw new IllegalArgumentException("Invalid access flags: " + paramInt1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b1 = ((paramInt1 & 0x1) == 0) ? 0 : 1;
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b2 = ((paramInt1 & 0x2) == 0) ? 0 : 1;
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b3 = ((paramInt1 & 0x4) == 0) ? 0 : 1;
/*     */     try {
/*     */       if (b1 + b2 + b3 > 1)
/*     */         throw new IllegalArgumentException("public private and protected are mutually exclusive: " + paramInt1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b4 = ((paramInt1 & 0x10) == 0) ? 0 : 1;
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b5 = ((paramInt1 & 0x400) == 0) ? 0 : 1;
/*     */     try {
/*     */       if (b4 + b5 > 1)
/*     */         throw new IllegalArgumentException("final and abstract are mutually exclusive: " + paramInt1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected CheckClassAdapter(int paramInt, ClassVisitor paramClassVisitor, boolean paramBoolean) {
/*     */     super(paramInt, paramClassVisitor);
/*     */     this.checkDataFlow = paramBoolean;
/*     */   }
/*     */   
/*     */   private static int checkTypeVariableSignature(String paramString, int paramInt) {
/*     */     paramInt = checkChar('T', paramString, paramInt);
/*     */     paramInt = checkIdentifier(paramString, paramInt);
/*     */     return checkChar(';', paramString, paramInt);
/*     */   }
/*     */   
/*     */   public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial checkState : ()V
/*     */     //   4: iload_1
/*     */     //   5: ldc 400895
/*     */     //   7: invokestatic checkAccess : (II)V
/*     */     //   10: ldc '<init>'
/*     */     //   12: aload_2
/*     */     //   13: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   16: ifne -> 52
/*     */     //   19: ldc '<clinit>'
/*     */     //   21: aload_2
/*     */     //   22: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   25: ifne -> 52
/*     */     //   28: goto -> 35
/*     */     //   31: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   34: athrow
/*     */     //   35: aload_0
/*     */     //   36: getfield version : I
/*     */     //   39: aload_2
/*     */     //   40: ldc 'method name'
/*     */     //   42: invokestatic checkMethodIdentifier : (ILjava/lang/String;Ljava/lang/String;)V
/*     */     //   45: goto -> 52
/*     */     //   48: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   51: athrow
/*     */     //   52: aload_3
/*     */     //   53: invokestatic checkMethodDesc : (Ljava/lang/String;)V
/*     */     //   56: aload #4
/*     */     //   58: ifnull -> 73
/*     */     //   61: aload #4
/*     */     //   63: invokestatic checkMethodSignature : (Ljava/lang/String;)V
/*     */     //   66: goto -> 73
/*     */     //   69: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   72: athrow
/*     */     //   73: aload #5
/*     */     //   75: ifnull -> 127
/*     */     //   78: iconst_0
/*     */     //   79: istore #6
/*     */     //   81: iload #6
/*     */     //   83: aload #5
/*     */     //   85: arraylength
/*     */     //   86: if_icmpge -> 127
/*     */     //   89: aload #5
/*     */     //   91: iload #6
/*     */     //   93: aaload
/*     */     //   94: new java/lang/StringBuilder
/*     */     //   97: dup
/*     */     //   98: invokespecial <init> : ()V
/*     */     //   101: ldc 'exception name at index '
/*     */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   106: iload #6
/*     */     //   108: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   111: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   114: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   117: iinc #6, 1
/*     */     //   120: goto -> 81
/*     */     //   123: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   126: athrow
/*     */     //   127: aload_0
/*     */     //   128: getfield checkDataFlow : Z
/*     */     //   131: ifeq -> 164
/*     */     //   134: new org/spongepowered/asm/lib/util/CheckMethodAdapter
/*     */     //   137: dup
/*     */     //   138: iload_1
/*     */     //   139: aload_2
/*     */     //   140: aload_3
/*     */     //   141: aload_0
/*     */     //   142: iload_1
/*     */     //   143: aload_2
/*     */     //   144: aload_3
/*     */     //   145: aload #4
/*     */     //   147: aload #5
/*     */     //   149: invokespecial visitMethod : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   152: aload_0
/*     */     //   153: getfield labels : Ljava/util/Map;
/*     */     //   156: invokespecial <init> : (ILjava/lang/String;Ljava/lang/String;Lorg/spongepowered/asm/lib/MethodVisitor;Ljava/util/Map;)V
/*     */     //   159: astore #6
/*     */     //   161: goto -> 188
/*     */     //   164: new org/spongepowered/asm/lib/util/CheckMethodAdapter
/*     */     //   167: dup
/*     */     //   168: aload_0
/*     */     //   169: iload_1
/*     */     //   170: aload_2
/*     */     //   171: aload_3
/*     */     //   172: aload #4
/*     */     //   174: aload #5
/*     */     //   176: invokespecial visitMethod : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   179: aload_0
/*     */     //   180: getfield labels : Ljava/util/Map;
/*     */     //   183: invokespecial <init> : (Lorg/spongepowered/asm/lib/MethodVisitor;Ljava/util/Map;)V
/*     */     //   186: astore #6
/*     */     //   188: aload #6
/*     */     //   190: aload_0
/*     */     //   191: getfield version : I
/*     */     //   194: putfield version : I
/*     */     //   197: aload #6
/*     */     //   199: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 0
/*     */     //   #154	-> 4
/*     */     //   #248	-> 10
/*     */     //   #4	-> 35
/*     */     //   #201	-> 52
/*     */     //   #114	-> 56
/*     */     //   #6	-> 61
/*     */     //   #303	-> 73
/*     */     //   #100	-> 78
/*     */     //   #173	-> 89
/*     */     //   #290	-> 117
/*     */     //   #159	-> 127
/*     */     //   #115	-> 134
/*     */     //   #256	-> 164
/*     */     //   #117	-> 188
/*     */     //   #209	-> 197
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	28	31	java/lang/IllegalStateException
/*     */     //   19	45	48	java/lang/IllegalStateException
/*     */     //   52	66	69	java/lang/IllegalStateException
/*     */     //   81	123	123	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*     */     try {
/*     */       checkState();
/*     */       checkAccess(paramInt, 413919);
/*     */       CheckMethodAdapter.checkUnqualifiedName(this.version, paramString1, "field name");
/*     */       CheckMethodAdapter.checkDesc(paramString2, false);
/*     */       if (paramString3 != null)
/*     */         checkFieldSignature(paramString3); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramObject != null)
/*     */         CheckMethodAdapter.checkConstant(paramObject); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     FieldVisitor fieldVisitor = super.visitField(paramInt, paramString1, paramString2, paramString3, paramObject);
/*     */     return new CheckFieldAdapter(fieldVisitor);
/*     */   }
/*     */   
/*     */   public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial checkState : ()V
/*     */     //   4: aload_1
/*     */     //   5: ldc 'class name'
/*     */     //   7: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   10: aload_2
/*     */     //   11: ifnull -> 27
/*     */     //   14: aload_2
/*     */     //   15: ldc 'outer class name'
/*     */     //   17: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   20: goto -> 27
/*     */     //   23: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   26: athrow
/*     */     //   27: aload_3
/*     */     //   28: ifnull -> 109
/*     */     //   31: iconst_0
/*     */     //   32: istore #5
/*     */     //   34: iload #5
/*     */     //   36: aload_3
/*     */     //   37: invokevirtual length : ()I
/*     */     //   40: if_icmpge -> 72
/*     */     //   43: aload_3
/*     */     //   44: iload #5
/*     */     //   46: invokevirtual charAt : (I)C
/*     */     //   49: invokestatic isDigit : (C)Z
/*     */     //   52: ifeq -> 72
/*     */     //   55: goto -> 62
/*     */     //   58: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   61: athrow
/*     */     //   62: iinc #5, 1
/*     */     //   65: goto -> 34
/*     */     //   68: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   71: athrow
/*     */     //   72: iload #5
/*     */     //   74: ifeq -> 93
/*     */     //   77: iload #5
/*     */     //   79: aload_3
/*     */     //   80: invokevirtual length : ()I
/*     */     //   83: if_icmpge -> 109
/*     */     //   86: goto -> 93
/*     */     //   89: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   92: athrow
/*     */     //   93: aload_3
/*     */     //   94: iload #5
/*     */     //   96: iconst_m1
/*     */     //   97: ldc 'inner class name'
/*     */     //   99: invokestatic checkIdentifier : (Ljava/lang/String;IILjava/lang/String;)V
/*     */     //   102: goto -> 109
/*     */     //   105: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   108: athrow
/*     */     //   109: iload #4
/*     */     //   111: sipush #30239
/*     */     //   114: invokestatic checkAccess : (II)V
/*     */     //   117: aload_0
/*     */     //   118: aload_1
/*     */     //   119: aload_2
/*     */     //   120: aload_3
/*     */     //   121: iload #4
/*     */     //   123: invokespecial visitInnerClass : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
/*     */     //   126: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #168	-> 0
/*     */     //   #295	-> 4
/*     */     //   #55	-> 10
/*     */     //   #140	-> 14
/*     */     //   #223	-> 27
/*     */     //   #153	-> 31
/*     */     //   #267	-> 34
/*     */     //   #273	-> 46
/*     */     //   #297	-> 62
/*     */     //   #291	-> 72
/*     */     //   #59	-> 93
/*     */     //   #239	-> 109
/*     */     //   #299	-> 117
/*     */     //   #258	-> 126
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	20	23	java/lang/IllegalStateException
/*     */     //   34	55	58	java/lang/IllegalStateException
/*     */     //   43	68	68	java/lang/IllegalStateException
/*     */     //   72	86	89	java/lang/IllegalStateException
/*     */     //   77	102	105	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public CheckClassAdapter(ClassVisitor paramClassVisitor) {
/*     */     this(paramClassVisitor, true);
/*     */   }
/*     */   
/*     */   public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield start : Z
/*     */     //   4: ifeq -> 21
/*     */     //   7: new java/lang/IllegalStateException
/*     */     //   10: dup
/*     */     //   11: ldc 'visit must be called only once'
/*     */     //   13: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   16: athrow
/*     */     //   17: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   20: athrow
/*     */     //   21: aload_0
/*     */     //   22: iconst_1
/*     */     //   23: putfield start : Z
/*     */     //   26: aload_0
/*     */     //   27: invokespecial checkState : ()V
/*     */     //   30: iload_2
/*     */     //   31: ldc 423473
/*     */     //   33: invokestatic checkAccess : (II)V
/*     */     //   36: aload_3
/*     */     //   37: ifnull -> 56
/*     */     //   40: aload_3
/*     */     //   41: ldc 'package-info'
/*     */     //   43: invokevirtual endsWith : (Ljava/lang/String;)Z
/*     */     //   46: ifne -> 69
/*     */     //   49: goto -> 56
/*     */     //   52: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   55: athrow
/*     */     //   56: aload_3
/*     */     //   57: ldc 'class name'
/*     */     //   59: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   62: goto -> 69
/*     */     //   65: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   68: athrow
/*     */     //   69: ldc 'java/lang/Object'
/*     */     //   71: aload_3
/*     */     //   72: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 104
/*     */     //   78: aload #5
/*     */     //   80: ifnull -> 111
/*     */     //   83: goto -> 90
/*     */     //   86: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   89: athrow
/*     */     //   90: new java/lang/IllegalArgumentException
/*     */     //   93: dup
/*     */     //   94: ldc 'The super class name of the Object class must be 'null''
/*     */     //   96: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   99: athrow
/*     */     //   100: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   103: athrow
/*     */     //   104: aload #5
/*     */     //   106: ldc 'super class name'
/*     */     //   108: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   111: aload #4
/*     */     //   113: ifnull -> 128
/*     */     //   116: aload #4
/*     */     //   118: invokestatic checkClassSignature : (Ljava/lang/String;)V
/*     */     //   121: goto -> 128
/*     */     //   124: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   127: athrow
/*     */     //   128: iload_2
/*     */     //   129: sipush #512
/*     */     //   132: iand
/*     */     //   133: ifeq -> 167
/*     */     //   136: ldc 'java/lang/Object'
/*     */     //   138: aload #5
/*     */     //   140: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   143: ifne -> 167
/*     */     //   146: goto -> 153
/*     */     //   149: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   152: athrow
/*     */     //   153: new java/lang/IllegalArgumentException
/*     */     //   156: dup
/*     */     //   157: ldc 'The super class name of interfaces must be 'java/lang/Object''
/*     */     //   159: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   162: athrow
/*     */     //   163: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   166: athrow
/*     */     //   167: aload #6
/*     */     //   169: ifnull -> 221
/*     */     //   172: iconst_0
/*     */     //   173: istore #7
/*     */     //   175: iload #7
/*     */     //   177: aload #6
/*     */     //   179: arraylength
/*     */     //   180: if_icmpge -> 221
/*     */     //   183: aload #6
/*     */     //   185: iload #7
/*     */     //   187: aaload
/*     */     //   188: new java/lang/StringBuilder
/*     */     //   191: dup
/*     */     //   192: invokespecial <init> : ()V
/*     */     //   195: ldc 'interface name at index '
/*     */     //   197: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   200: iload #7
/*     */     //   202: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   205: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   208: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   211: iinc #7, 1
/*     */     //   214: goto -> 175
/*     */     //   217: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   220: athrow
/*     */     //   221: aload_0
/*     */     //   222: iload_1
/*     */     //   223: putfield version : I
/*     */     //   226: aload_0
/*     */     //   227: iload_1
/*     */     //   228: iload_2
/*     */     //   229: aload_3
/*     */     //   230: aload #4
/*     */     //   232: aload #5
/*     */     //   234: aload #6
/*     */     //   236: invokespecial visit : (IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/*     */     //   239: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #208	-> 0
/*     */     //   #170	-> 7
/*     */     //   #123	-> 21
/*     */     //   #234	-> 26
/*     */     //   #75	-> 30
/*     */     //   #102	-> 36
/*     */     //   #101	-> 56
/*     */     //   #247	-> 69
/*     */     //   #124	-> 78
/*     */     //   #260	-> 90
/*     */     //   #73	-> 104
/*     */     //   #284	-> 111
/*     */     //   #191	-> 116
/*     */     //   #10	-> 128
/*     */     //   #60	-> 136
/*     */     //   #272	-> 153
/*     */     //   #162	-> 167
/*     */     //   #269	-> 172
/*     */     //   #142	-> 183
/*     */     //   #274	-> 211
/*     */     //   #296	-> 221
/*     */     //   #22	-> 226
/*     */     //   #78	-> 239
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	17	17	java/lang/IllegalStateException
/*     */     //   21	49	52	java/lang/IllegalStateException
/*     */     //   40	62	65	java/lang/IllegalStateException
/*     */     //   69	83	86	java/lang/IllegalStateException
/*     */     //   78	100	100	java/lang/IllegalStateException
/*     */     //   111	121	124	java/lang/IllegalStateException
/*     */     //   128	146	149	java/lang/IllegalStateException
/*     */     //   136	163	163	java/lang/IllegalStateException
/*     */     //   175	217	217	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   private static int checkFormalTypeParameters(String paramString, int paramInt) {
/*     */     paramInt = checkChar('<', paramString, paramInt);
/*     */     paramInt = checkFormalTypeParameter(paramString, paramInt);
/*     */     while (getChar(paramString, paramInt) != '>')
/*     */       paramInt = checkFormalTypeParameter(paramString, paramInt); 
/*     */     return paramInt + 1;
/*     */   }
/*     */   
/*     */   private static int checkIdentifier(String paramString, int paramInt) {
/*     */     try {
/*     */       if (!Character.isJavaIdentifierStart(getChar(paramString, paramInt)))
/*     */         throw new IllegalArgumentException(paramString + ": identifier expected at index " + paramInt); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     paramInt++;
/*     */     try {
/*     */       while (Character.isJavaIdentifierPart(getChar(paramString, paramInt)))
/*     */         paramInt++; 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return paramInt;
/*     */   }
/*     */   
/*     */   private Map<Label, Integer> labels = new HashMap<Label, Integer>();
/*     */   private boolean checkDataFlow;
/*     */   
/*     */   private static int checkFieldTypeSignature(String paramString, int paramInt) {
/*     */     try {
/*     */       switch (getChar(paramString, paramInt)) {
/*     */         case 'L':
/*     */           return checkClassTypeSignature(paramString, paramInt);
/*     */         case '[':
/*     */           return checkTypeSignature(paramString, paramInt + 1);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return checkTypeVariableSignature(paramString, paramInt);
/*     */   }
/*     */   
/*     */   public static void main(String[] paramArrayOfString) throws Exception {
/*     */     ClassReader classReader;
/*     */     try {
/*     */       if (paramArrayOfString.length != 1) {
/*     */         System.err.println("Verifies the given class.");
/*     */         System.err.println("Usage: CheckClassAdapter <fully qualified class name or class file name>");
/*     */       } 
/*     */     } catch (Exception exception) {
/*     */       throw b(null);
/*     */     } 
/*     */     if (paramArrayOfString[0].endsWith(".class")) {
/*     */       classReader = new ClassReader(new FileInputStream(paramArrayOfString[0]));
/*     */     } else {
/*     */       classReader = new ClassReader(paramArrayOfString[0]);
/*     */     } 
/*     */     verify(classReader, false, new PrintWriter(System.err));
/*     */   }
/*     */   
/*     */   private static String getShortName(String paramString) {
/*     */     int i = paramString.lastIndexOf('/');
/*     */     int j = paramString.length();
/*     */     try {
/*     */       if (paramString.charAt(j - 1) == ';')
/*     */         j--; 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (i == -1) ? paramString : paramString.substring(i + 1, j);
/*     */   }
/*     */   
/*     */   private static int checkTypeArgument(String paramString, int paramInt) {
/*     */     char c = getChar(paramString, paramInt);
/*     */     try {
/*     */       if (c == '*')
/*     */         return paramInt + 1; 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (c != '+') {
/*     */         try {
/*     */           if (c == '-') {
/*     */             paramInt++;
/*     */             return checkFieldTypeSignature(paramString, paramInt);
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         return checkFieldTypeSignature(paramString, paramInt);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     paramInt++;
/*     */     return checkFieldTypeSignature(paramString, paramInt);
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*     */     checkState();
/*     */     CheckMethodAdapter.checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitAnnotation(paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   public static void verify(ClassReader paramClassReader, boolean paramBoolean, PrintWriter paramPrintWriter) {
/*     */     verify(paramClassReader, null, paramBoolean, paramPrintWriter);
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckClassAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */