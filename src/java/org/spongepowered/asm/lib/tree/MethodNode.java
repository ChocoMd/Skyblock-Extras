/*     */ package org.spongepowered.asm.lib.tree;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.spongepowered.asm.lib.AnnotationVisitor;
/*     */ import org.spongepowered.asm.lib.Attribute;
/*     */ import org.spongepowered.asm.lib.ClassVisitor;
/*     */ import org.spongepowered.asm.lib.Label;
/*     */ import org.spongepowered.asm.lib.MethodVisitor;
/*     */ import org.spongepowered.asm.lib.TypePath;
/*     */ 
/*     */ public class MethodNode extends MethodVisitor {
/*     */   public void visitMaxs(int paramInt1, int paramInt2) {
/*  13 */     this.maxStack = paramInt1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 243 */     this.maxLocals = paramInt2;
/*     */   }
/*     */ 
/*     */   
/*     */   public int access;
/*     */   
/*     */   public String name;
/*     */   
/*     */   public String desc;
/*     */   
/*     */   public String signature;
/*     */   
/*     */   public List<String> exceptions;
/*     */   
/*     */   public List<ParameterNode> parameters;
/*     */   
/*     */   public List<AnnotationNode> visibleAnnotations;
/*     */   
/*     */   public List<AnnotationNode> invisibleAnnotations;
/*     */   
/*     */   public List<TypeAnnotationNode> visibleTypeAnnotations;
/*     */   
/*     */   public List<TypeAnnotationNode> invisibleTypeAnnotations;
/*     */   
/*     */   public List<Attribute> attrs;
/*     */   
/*     */   public Object annotationDefault;
/*     */   
/*     */   public List<AnnotationNode>[] visibleParameterAnnotations;
/*     */   
/*     */   public List<AnnotationNode>[] invisibleParameterAnnotations;
/*     */   
/*     */   public InsnList instructions;
/*     */   public List<TryCatchBlockNode> tryCatchBlocks;
/*     */   public int maxStack;
/*     */   public int maxLocals;
/*     */   public List<LocalVariableNode> localVariables;
/*     */   public List<LocalVariableAnnotationNode> visibleLocalVariableAnnotations;
/*     */   public List<LocalVariableAnnotationNode> invisibleLocalVariableAnnotations;
/*     */   private boolean visited;
/*     */   
/*     */   private LabelNode[] getLabelNodes(Label[] paramArrayOfLabel) {
/*     */     LabelNode[] arrayOfLabelNode = new LabelNode[paramArrayOfLabel.length];
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramArrayOfLabel.length) {
/*     */         arrayOfLabelNode[b] = getLabelNode(paramArrayOfLabel[b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return arrayOfLabelNode;
/*     */   }
/*     */   
/*     */   public void visitParameter(String paramString, int paramInt) {
/*     */     
/*     */     try { if (this.parameters == null)
/* 301 */         this.parameters = new ArrayList<ParameterNode>(5);  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*     */     
/*     */     this.parameters.add(new ParameterNode(paramString, paramInt));
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     TryCatchBlockNode tryCatchBlockNode = this.tryCatchBlocks.get((paramInt & 0xFFFF00) >> 8);
/*     */     TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(paramInt, paramTypePath, paramString);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         try {
/*     */           if (tryCatchBlockNode.visibleTypeAnnotations == null)
/*     */             tryCatchBlockNode.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         tryCatchBlockNode.visibleTypeAnnotations.add(typeAnnotationNode);
/*     */       } else {
/*     */         try {
/*     */           if (tryCatchBlockNode.invisibleTypeAnnotations == null)
/*     */             tryCatchBlockNode.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         tryCatchBlockNode.invisibleTypeAnnotations.add(typeAnnotationNode);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return typeAnnotationNode;
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(paramInt, paramTypePath, paramString);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         try {
/*     */           if (this.visibleTypeAnnotations == null)
/*     */             this.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         this.visibleTypeAnnotations.add(typeAnnotationNode);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (this.invisibleTypeAnnotations == null)
/*     */         this.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.invisibleTypeAnnotations.add(typeAnnotationNode);
/*     */     return typeAnnotationNode;
/*     */   }
/*     */   
/*     */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*     */     this.instructions.add(new IincInsnNode(paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public MethodNode(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     this(327680, paramInt, paramString1, paramString2, paramString3, paramArrayOfString);
/*     */     if (getClass() != MethodNode.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public void visitLabel(Label paramLabel) {
/*     */     this.instructions.add(getLabelNode(paramLabel));
/*     */   }
/*     */   
/*     */   public MethodNode(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*     */     super(paramInt1);
/*     */     this.access = paramInt2;
/*     */     this.name = paramString1;
/*     */     this.desc = paramString2;
/*     */     this.signature = paramString3;
/*     */     this.exceptions = new ArrayList<String>((paramArrayOfString == null) ? 0 : paramArrayOfString.length);
/*     */     boolean bool = ((paramInt2 & 0x400) != 0) ? true : false;
/*     */     try {
/*     */       if (!bool)
/*     */         this.localVariables = new ArrayList<LocalVariableNode>(5); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       this.tryCatchBlocks = new ArrayList<TryCatchBlockNode>();
/*     */       if (paramArrayOfString != null)
/*     */         this.exceptions.addAll(Arrays.asList(paramArrayOfString)); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.instructions = new InsnList();
/*     */   }
/*     */   
/*     */   public MethodNode(int paramInt) {
/*     */     super(paramInt);
/*     */     this.instructions = new InsnList();
/*     */   }
/*     */   
/*     */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*     */     this.instructions.add(new IntInsnNode(paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   private Object[] getLabelNodes(Object[] paramArrayOfObject) {
/*     */     Object[] arrayOfObject = new Object[paramArrayOfObject.length];
/*     */     for (byte b = 0; b < paramArrayOfObject.length; arrayOfObject[b] = object, b++) {
/*     */       Object object = paramArrayOfObject[b];
/*     */       if (object instanceof Label)
/*     */         object = getLabelNode((Label)object); 
/*     */     } 
/*     */     return arrayOfObject;
/*     */   }
/*     */   
/*     */   public void visitTypeInsn(int paramInt, String paramString) {
/*     */     this.instructions.add(new TypeInsnNode(paramInt, paramString));
/*     */   }
/*     */   
/*     */   public void visitCode() {}
/*     */   
/*     */   public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: new org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   3: dup
/*     */     //   4: aload_2
/*     */     //   5: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   8: astore #4
/*     */     //   10: iload_3
/*     */     //   11: ifeq -> 97
/*     */     //   14: aload_0
/*     */     //   15: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   18: ifnonnull -> 50
/*     */     //   21: goto -> 28
/*     */     //   24: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   27: athrow
/*     */     //   28: aload_0
/*     */     //   29: getfield desc : Ljava/lang/String;
/*     */     //   32: invokestatic getArgumentTypes : (Ljava/lang/String;)[Lorg/spongepowered/asm/lib/Type;
/*     */     //   35: arraylength
/*     */     //   36: istore #5
/*     */     //   38: aload_0
/*     */     //   39: iload #5
/*     */     //   41: anewarray java/util/List
/*     */     //   44: checkcast [Ljava/util/List;
/*     */     //   47: putfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   50: aload_0
/*     */     //   51: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   54: iload_1
/*     */     //   55: aaload
/*     */     //   56: ifnonnull -> 80
/*     */     //   59: aload_0
/*     */     //   60: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   63: iload_1
/*     */     //   64: new java/util/ArrayList
/*     */     //   67: dup
/*     */     //   68: iconst_1
/*     */     //   69: invokespecial <init> : (I)V
/*     */     //   72: aastore
/*     */     //   73: goto -> 80
/*     */     //   76: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   79: athrow
/*     */     //   80: aload_0
/*     */     //   81: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   84: iload_1
/*     */     //   85: aaload
/*     */     //   86: aload #4
/*     */     //   88: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   93: pop
/*     */     //   94: goto -> 170
/*     */     //   97: aload_0
/*     */     //   98: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   101: ifnonnull -> 126
/*     */     //   104: aload_0
/*     */     //   105: getfield desc : Ljava/lang/String;
/*     */     //   108: invokestatic getArgumentTypes : (Ljava/lang/String;)[Lorg/spongepowered/asm/lib/Type;
/*     */     //   111: arraylength
/*     */     //   112: istore #5
/*     */     //   114: aload_0
/*     */     //   115: iload #5
/*     */     //   117: anewarray java/util/List
/*     */     //   120: checkcast [Ljava/util/List;
/*     */     //   123: putfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   126: aload_0
/*     */     //   127: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   130: iload_1
/*     */     //   131: aaload
/*     */     //   132: ifnonnull -> 156
/*     */     //   135: aload_0
/*     */     //   136: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   139: iload_1
/*     */     //   140: new java/util/ArrayList
/*     */     //   143: dup
/*     */     //   144: iconst_1
/*     */     //   145: invokespecial <init> : (I)V
/*     */     //   148: aastore
/*     */     //   149: goto -> 156
/*     */     //   152: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   155: athrow
/*     */     //   156: aload_0
/*     */     //   157: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   160: iload_1
/*     */     //   161: aaload
/*     */     //   162: aload #4
/*     */     //   164: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   169: pop
/*     */     //   170: aload #4
/*     */     //   172: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #106	-> 0
/*     */     //   #109	-> 10
/*     */     //   #120	-> 14
/*     */     //   #148	-> 28
/*     */     //   #56	-> 38
/*     */     //   #191	-> 50
/*     */     //   #204	-> 59
/*     */     //   #76	-> 80
/*     */     //   #187	-> 97
/*     */     //   #2	-> 104
/*     */     //   #201	-> 114
/*     */     //   #275	-> 126
/*     */     //   #66	-> 135
/*     */     //   #135	-> 156
/*     */     //   #108	-> 170
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   10	21	24	java/lang/IllegalStateException
/*     */     //   50	73	76	java/lang/IllegalStateException
/*     */     //   126	149	152	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
/*     */     this.instructions.add(new FieldInsnNode(paramInt, paramString1, paramString2, paramString3));
/*     */   }
/*     */   
/*     */   public void visitEnd() {}
/*     */   
/*     */   protected LabelNode getLabelNode(Label paramLabel) {
/*     */     try {
/*     */       if (!(paramLabel.info instanceof LabelNode))
/*     */         paramLabel.info = new LabelNode(); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (LabelNode)paramLabel.info;
/*     */   }
/*     */   
/*     */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
/*     */     this.localVariables.add(new LocalVariableNode(paramString1, paramString2, paramString3, getLabelNode(paramLabel1), getLabelNode(paramLabel2), paramInt));
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotationDefault() {
/*     */     return new AnnotationNode(new MethodNode$1(this, 0));
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*     */     AnnotationNode annotationNode = new AnnotationNode(paramString);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         try {
/*     */           if (this.visibleAnnotations == null)
/*     */             this.visibleAnnotations = new ArrayList<AnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         this.visibleAnnotations.add(annotationNode);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (this.invisibleAnnotations == null)
/*     */         this.invisibleAnnotations = new ArrayList<AnnotationNode>(1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.invisibleAnnotations.add(annotationNode);
/*     */     return annotationNode;
/*     */   }
/*     */   
/*     */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*     */     this.instructions.add(new InvokeDynamicInsnNode(paramString1, paramString2, paramHandle, paramVarArgs));
/*     */   }
/*     */   
/*     */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*     */     this.instructions.add(new VarInsnNode(paramInt1, paramInt2));
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     AbstractInsnNode abstractInsnNode = this.instructions.getLast();
/*     */     while (abstractInsnNode.getOpcode() == -1)
/*     */       abstractInsnNode = abstractInsnNode.getPrevious(); 
/*     */     TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(paramInt, paramTypePath, paramString);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         try {
/*     */           if (abstractInsnNode.visibleTypeAnnotations == null)
/*     */             abstractInsnNode.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         abstractInsnNode.visibleTypeAnnotations.add(typeAnnotationNode);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (abstractInsnNode.invisibleTypeAnnotations == null)
/*     */         abstractInsnNode.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     abstractInsnNode.invisibleTypeAnnotations.add(typeAnnotationNode);
/*     */     return typeAnnotationNode;
/*     */   }
/*     */   
/*     */   public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     if (paramArrayOfObject2 == null) {
/*     */     
/*     */     } else {
/*     */     
/*     */     } 
/*     */     this.instructions.add(new FrameNode(paramInt1, paramInt2, (paramArrayOfObject1 == null) ? null : getLabelNodes(paramArrayOfObject1), paramInt3, getLabelNodes(paramArrayOfObject2)));
/*     */   }
/*     */   
/*     */   public void check(int paramInt) {
/*     */     try {
/*     */       if (paramInt == 262144) {
/*     */         try {
/*     */           if (this.visibleTypeAnnotations != null)
/*     */             try {
/*     */               if (this.visibleTypeAnnotations.size() > 0)
/*     */                 throw new RuntimeException(); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         try {
/*     */           if (this.invisibleTypeAnnotations != null)
/*     */             try {
/*     */               if (this.invisibleTypeAnnotations.size() > 0)
/*     */                 throw new RuntimeException(); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         try {
/*     */         
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         boolean bool1 = (this.tryCatchBlocks == null) ? false : this.tryCatchBlocks.size();
/*     */         boolean bool2 = false;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*     */     this.instructions.add(new JumpInsnNode(paramInt, getLabelNode(paramLabel)));
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
/*     */     this.instructions.add(new MethodInsnNode(paramInt, paramString1, paramString2, paramString3));
/*     */   }
/*     */   
/*     */   public MethodNode() {
/*     */     this(327680);
/*     */     if (getClass() != MethodNode.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*     */     try {
/*     */       if (this.attrs == null)
/*     */         this.attrs = new ArrayList<Attribute>(1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.attrs.add(paramAttribute);
/*     */   }
/*     */   
/*     */   public void accept(MethodVisitor paramMethodVisitor) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield parameters : Ljava/util/List;
/*     */     //   4: ifnonnull -> 15
/*     */     //   7: iconst_0
/*     */     //   8: goto -> 24
/*     */     //   11: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   14: athrow
/*     */     //   15: aload_0
/*     */     //   16: getfield parameters : Ljava/util/List;
/*     */     //   19: invokeinterface size : ()I
/*     */     //   24: istore_2
/*     */     //   25: iconst_0
/*     */     //   26: istore_3
/*     */     //   27: iload_3
/*     */     //   28: iload_2
/*     */     //   29: if_icmpge -> 67
/*     */     //   32: aload_0
/*     */     //   33: getfield parameters : Ljava/util/List;
/*     */     //   36: iload_3
/*     */     //   37: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   42: checkcast org/spongepowered/asm/lib/tree/ParameterNode
/*     */     //   45: astore #4
/*     */     //   47: aload_1
/*     */     //   48: aload #4
/*     */     //   50: getfield name : Ljava/lang/String;
/*     */     //   53: aload #4
/*     */     //   55: getfield access : I
/*     */     //   58: invokevirtual visitParameter : (Ljava/lang/String;I)V
/*     */     //   61: iinc #3, 1
/*     */     //   64: goto -> 27
/*     */     //   67: aload_0
/*     */     //   68: getfield annotationDefault : Ljava/lang/Object;
/*     */     //   71: ifnull -> 107
/*     */     //   74: aload_1
/*     */     //   75: invokevirtual visitAnnotationDefault : ()Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   78: astore #4
/*     */     //   80: aload #4
/*     */     //   82: aconst_null
/*     */     //   83: aload_0
/*     */     //   84: getfield annotationDefault : Ljava/lang/Object;
/*     */     //   87: invokestatic accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;Ljava/lang/String;Ljava/lang/Object;)V
/*     */     //   90: aload #4
/*     */     //   92: ifnull -> 107
/*     */     //   95: aload #4
/*     */     //   97: invokevirtual visitEnd : ()V
/*     */     //   100: goto -> 107
/*     */     //   103: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   106: athrow
/*     */     //   107: aload_0
/*     */     //   108: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   111: ifnonnull -> 122
/*     */     //   114: iconst_0
/*     */     //   115: goto -> 131
/*     */     //   118: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   121: athrow
/*     */     //   122: aload_0
/*     */     //   123: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   126: invokeinterface size : ()I
/*     */     //   131: istore_2
/*     */     //   132: iconst_0
/*     */     //   133: istore_3
/*     */     //   134: iload_3
/*     */     //   135: iload_2
/*     */     //   136: if_icmpge -> 175
/*     */     //   139: aload_0
/*     */     //   140: getfield visibleAnnotations : Ljava/util/List;
/*     */     //   143: iload_3
/*     */     //   144: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   149: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   152: astore #4
/*     */     //   154: aload #4
/*     */     //   156: aload_1
/*     */     //   157: aload #4
/*     */     //   159: getfield desc : Ljava/lang/String;
/*     */     //   162: iconst_1
/*     */     //   163: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   166: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   169: iinc #3, 1
/*     */     //   172: goto -> 134
/*     */     //   175: aload_0
/*     */     //   176: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   179: ifnonnull -> 190
/*     */     //   182: iconst_0
/*     */     //   183: goto -> 199
/*     */     //   186: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   189: athrow
/*     */     //   190: aload_0
/*     */     //   191: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   194: invokeinterface size : ()I
/*     */     //   199: istore_2
/*     */     //   200: iconst_0
/*     */     //   201: istore_3
/*     */     //   202: iload_3
/*     */     //   203: iload_2
/*     */     //   204: if_icmpge -> 243
/*     */     //   207: aload_0
/*     */     //   208: getfield invisibleAnnotations : Ljava/util/List;
/*     */     //   211: iload_3
/*     */     //   212: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   217: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   220: astore #4
/*     */     //   222: aload #4
/*     */     //   224: aload_1
/*     */     //   225: aload #4
/*     */     //   227: getfield desc : Ljava/lang/String;
/*     */     //   230: iconst_0
/*     */     //   231: invokevirtual visitAnnotation : (Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   234: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   237: iinc #3, 1
/*     */     //   240: goto -> 202
/*     */     //   243: aload_0
/*     */     //   244: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   247: ifnonnull -> 258
/*     */     //   250: iconst_0
/*     */     //   251: goto -> 267
/*     */     //   254: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   257: athrow
/*     */     //   258: aload_0
/*     */     //   259: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   262: invokeinterface size : ()I
/*     */     //   267: istore_2
/*     */     //   268: iconst_0
/*     */     //   269: istore_3
/*     */     //   270: iload_3
/*     */     //   271: iload_2
/*     */     //   272: if_icmpge -> 321
/*     */     //   275: aload_0
/*     */     //   276: getfield visibleTypeAnnotations : Ljava/util/List;
/*     */     //   279: iload_3
/*     */     //   280: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   285: checkcast org/spongepowered/asm/lib/tree/TypeAnnotationNode
/*     */     //   288: astore #4
/*     */     //   290: aload #4
/*     */     //   292: aload_1
/*     */     //   293: aload #4
/*     */     //   295: getfield typeRef : I
/*     */     //   298: aload #4
/*     */     //   300: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*     */     //   303: aload #4
/*     */     //   305: getfield desc : Ljava/lang/String;
/*     */     //   308: iconst_1
/*     */     //   309: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   312: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   315: iinc #3, 1
/*     */     //   318: goto -> 270
/*     */     //   321: aload_0
/*     */     //   322: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   325: ifnonnull -> 336
/*     */     //   328: iconst_0
/*     */     //   329: goto -> 345
/*     */     //   332: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   335: athrow
/*     */     //   336: aload_0
/*     */     //   337: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   340: invokeinterface size : ()I
/*     */     //   345: istore_2
/*     */     //   346: iconst_0
/*     */     //   347: istore_3
/*     */     //   348: iload_3
/*     */     //   349: iload_2
/*     */     //   350: if_icmpge -> 399
/*     */     //   353: aload_0
/*     */     //   354: getfield invisibleTypeAnnotations : Ljava/util/List;
/*     */     //   357: iload_3
/*     */     //   358: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   363: checkcast org/spongepowered/asm/lib/tree/TypeAnnotationNode
/*     */     //   366: astore #4
/*     */     //   368: aload #4
/*     */     //   370: aload_1
/*     */     //   371: aload #4
/*     */     //   373: getfield typeRef : I
/*     */     //   376: aload #4
/*     */     //   378: getfield typePath : Lorg/spongepowered/asm/lib/TypePath;
/*     */     //   381: aload #4
/*     */     //   383: getfield desc : Ljava/lang/String;
/*     */     //   386: iconst_0
/*     */     //   387: invokevirtual visitTypeAnnotation : (ILorg/spongepowered/asm/lib/TypePath;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   390: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   393: iinc #3, 1
/*     */     //   396: goto -> 348
/*     */     //   399: aload_0
/*     */     //   400: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   403: ifnonnull -> 414
/*     */     //   406: iconst_0
/*     */     //   407: goto -> 419
/*     */     //   410: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   413: athrow
/*     */     //   414: aload_0
/*     */     //   415: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   418: arraylength
/*     */     //   419: istore_2
/*     */     //   420: iconst_0
/*     */     //   421: istore_3
/*     */     //   422: iload_3
/*     */     //   423: iload_2
/*     */     //   424: if_icmpge -> 504
/*     */     //   427: aload_0
/*     */     //   428: getfield visibleParameterAnnotations : [Ljava/util/List;
/*     */     //   431: iload_3
/*     */     //   432: aaload
/*     */     //   433: astore #4
/*     */     //   435: aload #4
/*     */     //   437: ifnonnull -> 447
/*     */     //   440: goto -> 498
/*     */     //   443: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   446: athrow
/*     */     //   447: iconst_0
/*     */     //   448: istore #5
/*     */     //   450: iload #5
/*     */     //   452: aload #4
/*     */     //   454: invokeinterface size : ()I
/*     */     //   459: if_icmpge -> 498
/*     */     //   462: aload #4
/*     */     //   464: iload #5
/*     */     //   466: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   471: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   474: astore #6
/*     */     //   476: aload #6
/*     */     //   478: aload_1
/*     */     //   479: iload_3
/*     */     //   480: aload #6
/*     */     //   482: getfield desc : Ljava/lang/String;
/*     */     //   485: iconst_1
/*     */     //   486: invokevirtual visitParameterAnnotation : (ILjava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   489: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   492: iinc #5, 1
/*     */     //   495: goto -> 450
/*     */     //   498: iinc #3, 1
/*     */     //   501: goto -> 422
/*     */     //   504: aload_0
/*     */     //   505: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   508: ifnonnull -> 519
/*     */     //   511: iconst_0
/*     */     //   512: goto -> 524
/*     */     //   515: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   518: athrow
/*     */     //   519: aload_0
/*     */     //   520: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   523: arraylength
/*     */     //   524: istore_2
/*     */     //   525: iconst_0
/*     */     //   526: istore_3
/*     */     //   527: iload_3
/*     */     //   528: iload_2
/*     */     //   529: if_icmpge -> 609
/*     */     //   532: aload_0
/*     */     //   533: getfield invisibleParameterAnnotations : [Ljava/util/List;
/*     */     //   536: iload_3
/*     */     //   537: aaload
/*     */     //   538: astore #4
/*     */     //   540: aload #4
/*     */     //   542: ifnonnull -> 552
/*     */     //   545: goto -> 603
/*     */     //   548: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   551: athrow
/*     */     //   552: iconst_0
/*     */     //   553: istore #5
/*     */     //   555: iload #5
/*     */     //   557: aload #4
/*     */     //   559: invokeinterface size : ()I
/*     */     //   564: if_icmpge -> 603
/*     */     //   567: aload #4
/*     */     //   569: iload #5
/*     */     //   571: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   576: checkcast org/spongepowered/asm/lib/tree/AnnotationNode
/*     */     //   579: astore #6
/*     */     //   581: aload #6
/*     */     //   583: aload_1
/*     */     //   584: iload_3
/*     */     //   585: aload #6
/*     */     //   587: getfield desc : Ljava/lang/String;
/*     */     //   590: iconst_0
/*     */     //   591: invokevirtual visitParameterAnnotation : (ILjava/lang/String;Z)Lorg/spongepowered/asm/lib/AnnotationVisitor;
/*     */     //   594: invokevirtual accept : (Lorg/spongepowered/asm/lib/AnnotationVisitor;)V
/*     */     //   597: iinc #5, 1
/*     */     //   600: goto -> 555
/*     */     //   603: iinc #3, 1
/*     */     //   606: goto -> 527
/*     */     //   609: aload_0
/*     */     //   610: getfield visited : Z
/*     */     //   613: ifeq -> 630
/*     */     //   616: aload_0
/*     */     //   617: getfield instructions : Lorg/spongepowered/asm/lib/tree/InsnList;
/*     */     //   620: invokevirtual resetLabels : ()V
/*     */     //   623: goto -> 630
/*     */     //   626: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   629: athrow
/*     */     //   630: aload_0
/*     */     //   631: getfield attrs : Ljava/util/List;
/*     */     //   634: ifnonnull -> 645
/*     */     //   637: iconst_0
/*     */     //   638: goto -> 654
/*     */     //   641: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   644: athrow
/*     */     //   645: aload_0
/*     */     //   646: getfield attrs : Ljava/util/List;
/*     */     //   649: invokeinterface size : ()I
/*     */     //   654: istore_2
/*     */     //   655: iconst_0
/*     */     //   656: istore_3
/*     */     //   657: iload_3
/*     */     //   658: iload_2
/*     */     //   659: if_icmpge -> 689
/*     */     //   662: aload_1
/*     */     //   663: aload_0
/*     */     //   664: getfield attrs : Ljava/util/List;
/*     */     //   667: iload_3
/*     */     //   668: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   673: checkcast org/spongepowered/asm/lib/Attribute
/*     */     //   676: invokevirtual visitAttribute : (Lorg/spongepowered/asm/lib/Attribute;)V
/*     */     //   679: iinc #3, 1
/*     */     //   682: goto -> 657
/*     */     //   685: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   688: athrow
/*     */     //   689: aload_0
/*     */     //   690: getfield instructions : Lorg/spongepowered/asm/lib/tree/InsnList;
/*     */     //   693: invokevirtual size : ()I
/*     */     //   696: ifle -> 990
/*     */     //   699: aload_1
/*     */     //   700: invokevirtual visitCode : ()V
/*     */     //   703: aload_0
/*     */     //   704: getfield tryCatchBlocks : Ljava/util/List;
/*     */     //   707: ifnonnull -> 725
/*     */     //   710: goto -> 717
/*     */     //   713: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   716: athrow
/*     */     //   717: iconst_0
/*     */     //   718: goto -> 734
/*     */     //   721: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   724: athrow
/*     */     //   725: aload_0
/*     */     //   726: getfield tryCatchBlocks : Ljava/util/List;
/*     */     //   729: invokeinterface size : ()I
/*     */     //   734: istore_2
/*     */     //   735: iconst_0
/*     */     //   736: istore_3
/*     */     //   737: iload_3
/*     */     //   738: iload_2
/*     */     //   739: if_icmpge -> 786
/*     */     //   742: aload_0
/*     */     //   743: getfield tryCatchBlocks : Ljava/util/List;
/*     */     //   746: iload_3
/*     */     //   747: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   752: checkcast org/spongepowered/asm/lib/tree/TryCatchBlockNode
/*     */     //   755: iload_3
/*     */     //   756: invokevirtual updateIndex : (I)V
/*     */     //   759: aload_0
/*     */     //   760: getfield tryCatchBlocks : Ljava/util/List;
/*     */     //   763: iload_3
/*     */     //   764: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   769: checkcast org/spongepowered/asm/lib/tree/TryCatchBlockNode
/*     */     //   772: aload_1
/*     */     //   773: invokevirtual accept : (Lorg/spongepowered/asm/lib/MethodVisitor;)V
/*     */     //   776: iinc #3, 1
/*     */     //   779: goto -> 737
/*     */     //   782: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   785: athrow
/*     */     //   786: aload_0
/*     */     //   787: getfield instructions : Lorg/spongepowered/asm/lib/tree/InsnList;
/*     */     //   790: aload_1
/*     */     //   791: invokevirtual accept : (Lorg/spongepowered/asm/lib/MethodVisitor;)V
/*     */     //   794: aload_0
/*     */     //   795: getfield localVariables : Ljava/util/List;
/*     */     //   798: ifnonnull -> 809
/*     */     //   801: iconst_0
/*     */     //   802: goto -> 818
/*     */     //   805: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   808: athrow
/*     */     //   809: aload_0
/*     */     //   810: getfield localVariables : Ljava/util/List;
/*     */     //   813: invokeinterface size : ()I
/*     */     //   818: istore_2
/*     */     //   819: iconst_0
/*     */     //   820: istore_3
/*     */     //   821: iload_3
/*     */     //   822: iload_2
/*     */     //   823: if_icmpge -> 853
/*     */     //   826: aload_0
/*     */     //   827: getfield localVariables : Ljava/util/List;
/*     */     //   830: iload_3
/*     */     //   831: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   836: checkcast org/spongepowered/asm/lib/tree/LocalVariableNode
/*     */     //   839: aload_1
/*     */     //   840: invokevirtual accept : (Lorg/spongepowered/asm/lib/MethodVisitor;)V
/*     */     //   843: iinc #3, 1
/*     */     //   846: goto -> 821
/*     */     //   849: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   852: athrow
/*     */     //   853: aload_0
/*     */     //   854: getfield visibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   857: ifnonnull -> 868
/*     */     //   860: iconst_0
/*     */     //   861: goto -> 877
/*     */     //   864: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   867: athrow
/*     */     //   868: aload_0
/*     */     //   869: getfield visibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   872: invokeinterface size : ()I
/*     */     //   877: istore_2
/*     */     //   878: iconst_0
/*     */     //   879: istore_3
/*     */     //   880: iload_3
/*     */     //   881: iload_2
/*     */     //   882: if_icmpge -> 913
/*     */     //   885: aload_0
/*     */     //   886: getfield visibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   889: iload_3
/*     */     //   890: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   895: checkcast org/spongepowered/asm/lib/tree/LocalVariableAnnotationNode
/*     */     //   898: aload_1
/*     */     //   899: iconst_1
/*     */     //   900: invokevirtual accept : (Lorg/spongepowered/asm/lib/MethodVisitor;Z)V
/*     */     //   903: iinc #3, 1
/*     */     //   906: goto -> 880
/*     */     //   909: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   912: athrow
/*     */     //   913: aload_0
/*     */     //   914: getfield invisibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   917: ifnonnull -> 928
/*     */     //   920: iconst_0
/*     */     //   921: goto -> 937
/*     */     //   924: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   927: athrow
/*     */     //   928: aload_0
/*     */     //   929: getfield invisibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   932: invokeinterface size : ()I
/*     */     //   937: istore_2
/*     */     //   938: iconst_0
/*     */     //   939: istore_3
/*     */     //   940: iload_3
/*     */     //   941: iload_2
/*     */     //   942: if_icmpge -> 973
/*     */     //   945: aload_0
/*     */     //   946: getfield invisibleLocalVariableAnnotations : Ljava/util/List;
/*     */     //   949: iload_3
/*     */     //   950: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   955: checkcast org/spongepowered/asm/lib/tree/LocalVariableAnnotationNode
/*     */     //   958: aload_1
/*     */     //   959: iconst_0
/*     */     //   960: invokevirtual accept : (Lorg/spongepowered/asm/lib/MethodVisitor;Z)V
/*     */     //   963: iinc #3, 1
/*     */     //   966: goto -> 940
/*     */     //   969: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*     */     //   972: athrow
/*     */     //   973: aload_1
/*     */     //   974: aload_0
/*     */     //   975: getfield maxStack : I
/*     */     //   978: aload_0
/*     */     //   979: getfield maxLocals : I
/*     */     //   982: invokevirtual visitMaxs : (II)V
/*     */     //   985: aload_0
/*     */     //   986: iconst_1
/*     */     //   987: putfield visited : Z
/*     */     //   990: aload_1
/*     */     //   991: invokevirtual visitEnd : ()V
/*     */     //   994: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #234	-> 0
/*     */     //   #128	-> 25
/*     */     //   #271	-> 32
/*     */     //   #17	-> 47
/*     */     //   #158	-> 61
/*     */     //   #36	-> 67
/*     */     //   #184	-> 74
/*     */     //   #160	-> 80
/*     */     //   #140	-> 90
/*     */     //   #114	-> 95
/*     */     //   #185	-> 107
/*     */     //   #113	-> 132
/*     */     //   #107	-> 139
/*     */     //   #203	-> 154
/*     */     //   #222	-> 169
/*     */     //   #293	-> 175
/*     */     //   #33	-> 200
/*     */     //   #193	-> 207
/*     */     //   #156	-> 222
/*     */     //   #127	-> 237
/*     */     //   #131	-> 243
/*     */     //   #153	-> 268
/*     */     //   #8	-> 275
/*     */     //   #98	-> 290
/*     */     //   #96	-> 315
/*     */     //   #288	-> 321
/*     */     //   #87	-> 340
/*     */     //   #53	-> 346
/*     */     //   #225	-> 353
/*     */     //   #14	-> 368
/*     */     //   #60	-> 393
/*     */     //   #181	-> 399
/*     */     //   #171	-> 420
/*     */     //   #196	-> 427
/*     */     //   #212	-> 435
/*     */     //   #219	-> 440
/*     */     //   #40	-> 447
/*     */     //   #68	-> 462
/*     */     //   #230	-> 476
/*     */     //   #9	-> 492
/*     */     //   #119	-> 498
/*     */     //   #48	-> 504
/*     */     //   #25	-> 525
/*     */     //   #62	-> 532
/*     */     //   #286	-> 540
/*     */     //   #278	-> 545
/*     */     //   #249	-> 552
/*     */     //   #290	-> 567
/*     */     //   #115	-> 581
/*     */     //   #6	-> 597
/*     */     //   #124	-> 603
/*     */     //   #198	-> 609
/*     */     //   #240	-> 616
/*     */     //   #255	-> 630
/*     */     //   #274	-> 655
/*     */     //   #97	-> 662
/*     */     //   #126	-> 679
/*     */     //   #297	-> 689
/*     */     //   #100	-> 699
/*     */     //   #155	-> 703
/*     */     //   #122	-> 735
/*     */     //   #176	-> 742
/*     */     //   #165	-> 759
/*     */     //   #250	-> 776
/*     */     //   #224	-> 786
/*     */     //   #151	-> 794
/*     */     //   #31	-> 819
/*     */     //   #64	-> 826
/*     */     //   #70	-> 843
/*     */     //   #77	-> 853
/*     */     //   #20	-> 872
/*     */     //   #84	-> 878
/*     */     //   #241	-> 885
/*     */     //   #238	-> 903
/*     */     //   #226	-> 913
/*     */     //   #229	-> 932
/*     */     //   #139	-> 938
/*     */     //   #144	-> 945
/*     */     //   #159	-> 963
/*     */     //   #216	-> 973
/*     */     //   #200	-> 985
/*     */     //   #210	-> 990
/*     */     //   #186	-> 994
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	11	11	java/lang/IllegalStateException
/*     */     //   80	100	103	java/lang/IllegalStateException
/*     */     //   107	118	118	java/lang/IllegalStateException
/*     */     //   175	186	186	java/lang/IllegalStateException
/*     */     //   243	254	254	java/lang/IllegalStateException
/*     */     //   321	332	332	java/lang/IllegalStateException
/*     */     //   399	410	410	java/lang/IllegalStateException
/*     */     //   435	443	443	java/lang/IllegalStateException
/*     */     //   504	515	515	java/lang/IllegalStateException
/*     */     //   540	548	548	java/lang/IllegalStateException
/*     */     //   609	623	626	java/lang/IllegalStateException
/*     */     //   630	641	641	java/lang/IllegalStateException
/*     */     //   657	685	685	java/lang/IllegalStateException
/*     */     //   689	710	713	java/lang/IllegalStateException
/*     */     //   699	721	721	java/lang/IllegalStateException
/*     */     //   737	782	782	java/lang/IllegalStateException
/*     */     //   786	805	805	java/lang/IllegalStateException
/*     */     //   821	849	849	java/lang/IllegalStateException
/*     */     //   853	864	864	java/lang/IllegalStateException
/*     */     //   880	909	909	java/lang/IllegalStateException
/*     */     //   913	924	924	java/lang/IllegalStateException
/*     */     //   940	969	969	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void accept(ClassVisitor paramClassVisitor) {
/*     */     String[] arrayOfString = new String[this.exceptions.size()];
/*     */     this.exceptions.toArray(arrayOfString);
/*     */     MethodVisitor methodVisitor = paramClassVisitor.visitMethod(this.access, this.name, this.desc, this.signature, arrayOfString);
/*     */     try {
/*     */       if (methodVisitor != null)
/*     */         accept(methodVisitor); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*     */     LocalVariableAnnotationNode localVariableAnnotationNode = new LocalVariableAnnotationNode(paramInt, paramTypePath, getLabelNodes(paramArrayOfLabel1), getLabelNodes(paramArrayOfLabel2), paramArrayOfint, paramString);
/*     */     try {
/*     */       if (paramBoolean) {
/*     */         try {
/*     */           if (this.visibleLocalVariableAnnotations == null)
/*     */             this.visibleLocalVariableAnnotations = new ArrayList<LocalVariableAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         this.visibleLocalVariableAnnotations.add(localVariableAnnotationNode);
/*     */       } else {
/*     */         try {
/*     */           if (this.invisibleLocalVariableAnnotations == null)
/*     */             this.invisibleLocalVariableAnnotations = new ArrayList<LocalVariableAnnotationNode>(1); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         this.invisibleLocalVariableAnnotations.add(localVariableAnnotationNode);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return localVariableAnnotationNode;
/*     */   }
/*     */   
/*     */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*     */     this.tryCatchBlocks.add(new TryCatchBlockNode(getLabelNode(paramLabel1), getLabelNode(paramLabel2), getLabelNode(paramLabel3), paramString));
/*     */   }
/*     */   
/*     */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
/*     */     this.instructions.add(new LookupSwitchInsnNode(getLabelNode(paramLabel), paramArrayOfint, getLabelNodes(paramArrayOfLabel)));
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
/*     */     this.instructions.add(new MethodInsnNode(paramInt, paramString1, paramString2, paramString3, paramBoolean));
/*     */   }
/*     */   
/*     */   public void visitLdcInsn(Object paramObject) {
/*     */     this.instructions.add(new LdcInsnNode(paramObject));
/*     */   }
/*     */   
/*     */   public void visitInsn(int paramInt) {
/*     */     this.instructions.add(new InsnNode(paramInt));
/*     */   }
/*     */   
/*     */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
/*     */     this.instructions.add(new TableSwitchInsnNode(paramInt1, paramInt2, getLabelNode(paramLabel), getLabelNodes(paramVarArgs)));
/*     */   }
/*     */   
/*     */   public void visitMultiANewArrayInsn(String paramString, int paramInt) {
/*     */     this.instructions.add(new MultiANewArrayInsnNode(paramString, paramInt));
/*     */   }
/*     */   
/*     */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*     */     this.instructions.add(new LineNumberNode(paramInt, getLabelNode(paramLabel)));
/*     */   }
/*     */   
/*     */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*     */     return paramIllegalStateException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\MethodNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */