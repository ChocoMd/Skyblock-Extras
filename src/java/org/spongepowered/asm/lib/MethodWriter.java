/*      */ package org.spongepowered.asm.lib;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class MethodWriter
/*      */   extends MethodVisitor
/*      */ {
/*      */   static final int ACC_CONSTRUCTOR = 524288;
/*      */   static final int SAME_FRAME = 0;
/*      */   static final int SAME_LOCALS_1_STACK_ITEM_FRAME = 64;
/*      */   static final int RESERVED = 128;
/*      */   static final int SAME_LOCALS_1_STACK_ITEM_FRAME_EXTENDED = 247;
/*      */   static final int CHOP_FRAME = 248;
/*      */   static final int SAME_FRAME_EXTENDED = 251;
/*      */   static final int APPEND_FRAME = 252;
/*      */   static final int FULL_FRAME = 255;
/*      */   static final int FRAMES = 0;
/*      */   static final int INSERTED_FRAMES = 1;
/*      */   static final int MAXS = 2;
/*      */   static final int NOTHING = 3;
/*      */   final ClassWriter cw;
/*      */   private int access;
/*      */   private final int name;
/*      */   private final int desc;
/*      */   private final String descriptor;
/*      */   String signature;
/*      */   int classReaderOffset;
/*      */   int classReaderLength;
/*      */   int exceptionCount;
/*      */   int[] exceptions;
/*      */   private ByteVector annd;
/*      */   private AnnotationWriter anns;
/*      */   private AnnotationWriter ianns;
/*      */   private AnnotationWriter tanns;
/*      */   private AnnotationWriter itanns;
/*      */   private AnnotationWriter[] panns;
/*      */   private AnnotationWriter[] ipanns;
/*      */   private int synthetics;
/*      */   private Attribute attrs;
/*      */   
/*      */   private void visitImplicitFirstFrame() {
/*   52 */     int i = startFrame(0, this.descriptor.length() + 1, 0);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  392 */       if ((this.access & 0x8) == 0)
/*      */         
/*      */         try {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  452 */           if ((this.access & 0x80000) == 0) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             this.frame[i++] = 0x1700000 | this.cw.addType(this.cw.thisName);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1088 */             this.frame[i++] = 6;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         }  
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     byte b = 1;
/*      */     while (true) {
/*      */       byte b1 = b;
/*      */       switch (this.descriptor.charAt(b++)) {
/*      */         case 'B':
/*      */         case 'C':
/*      */         case 'I':
/*      */         case 'S':
/*      */         case 'Z':
/*      */           this.frame[i++] = 1;
/*      */           continue;
/*      */         case 'F':
/*      */           this.frame[i++] = 2;
/*      */           continue;
/*      */         case 'J':
/*      */           this.frame[i++] = 4;
/*      */           continue;
/*      */         case 'D':
/*      */           this.frame[i++] = 3;
/*      */           continue;
/*      */         case '[':
/*      */           try {
/*      */             while (this.descriptor.charAt(b) == '[')
/*      */               b++; 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           try {
/*      */             if (this.descriptor.charAt(b) == 'L') {
/*      */               b++;
/*      */               try {
/*      */                 while (this.descriptor.charAt(b) != ';')
/*      */                   b++; 
/*      */               } catch (IllegalStateException illegalStateException) {
/*      */                 throw b(null);
/*      */               } 
/*      */             } 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           this.frame[i++] = 0x1700000 | this.cw.addType(this.descriptor.substring(b1, ++b));
/*      */           continue;
/*      */         case 'L':
/*      */           try {
/*      */             while (this.descriptor.charAt(b) != ';')
/*      */               b++; 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           this.frame[i++] = 0x1700000 | this.cw.addType(this.descriptor.substring(b1 + 1, b++));
/*      */           continue;
/*      */       } 
/*      */       this.frame[1] = i - 3;
/*      */       endFrame();
/*      */       return;
/*      */     } 
/*      */   }
/*      */   
/*      */   private ByteVector code;
/*      */   private int maxStack;
/*      */   private int maxLocals;
/*      */   private int currentLocals;
/*      */   private int frameCount;
/*      */   private ByteVector stackMap;
/*      */   private int previousFrameOffset;
/*      */   private int[] previousFrame;
/*      */   private int[] frame;
/*      */   private int handlerCount;
/*      */   private Handler firstHandler;
/*      */   private Handler lastHandler;
/*      */   private int methodParametersCount;
/*      */   private ByteVector methodParameters;
/*      */   private int localVarCount;
/*      */   private ByteVector localVar;
/*      */   private int localVarTypeCount;
/*      */   private ByteVector localVarType;
/*      */   private int lineNumberCount;
/*      */   private ByteVector lineNumber;
/*      */   private int lastCodeOffset;
/*      */   private AnnotationWriter ctanns;
/*      */   private AnnotationWriter ictanns;
/*      */   private Attribute cattrs;
/*      */   private int subroutines;
/*      */   private final int compute;
/*      */   private Label labels;
/*      */   private Label previousBlock;
/*      */   private Label currentBlock;
/*      */   private int stackSize;
/*      */   private int maxStackSize;
/*      */   
/*      */   public void visitTypeInsn(int paramInt, String paramString) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_2
/*      */     //   16: invokevirtual newClassItem : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Item;
/*      */     //   19: astore_3
/*      */     //   20: aload_0
/*      */     //   21: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   24: ifnull -> 129
/*      */     //   27: aload_0
/*      */     //   28: getfield compute : I
/*      */     //   31: ifeq -> 56
/*      */     //   34: goto -> 41
/*      */     //   37: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   40: athrow
/*      */     //   41: aload_0
/*      */     //   42: getfield compute : I
/*      */     //   45: iconst_1
/*      */     //   46: if_icmpne -> 86
/*      */     //   49: goto -> 56
/*      */     //   52: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   55: athrow
/*      */     //   56: aload_0
/*      */     //   57: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   60: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   63: iload_1
/*      */     //   64: aload_0
/*      */     //   65: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   68: getfield length : I
/*      */     //   71: aload_0
/*      */     //   72: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   75: aload_3
/*      */     //   76: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   79: goto -> 129
/*      */     //   82: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   85: athrow
/*      */     //   86: iload_1
/*      */     //   87: sipush #187
/*      */     //   90: if_icmpne -> 129
/*      */     //   93: aload_0
/*      */     //   94: getfield stackSize : I
/*      */     //   97: iconst_1
/*      */     //   98: iadd
/*      */     //   99: istore #4
/*      */     //   101: iload #4
/*      */     //   103: aload_0
/*      */     //   104: getfield maxStackSize : I
/*      */     //   107: if_icmple -> 123
/*      */     //   110: aload_0
/*      */     //   111: iload #4
/*      */     //   113: putfield maxStackSize : I
/*      */     //   116: goto -> 123
/*      */     //   119: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   122: athrow
/*      */     //   123: aload_0
/*      */     //   124: iload #4
/*      */     //   126: putfield stackSize : I
/*      */     //   129: aload_0
/*      */     //   130: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   133: iload_1
/*      */     //   134: aload_3
/*      */     //   135: getfield index : I
/*      */     //   138: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   141: pop
/*      */     //   142: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1	-> 0
/*      */     //   #164	-> 11
/*      */     //   #609	-> 20
/*      */     //   #996	-> 27
/*      */     //   #131	-> 56
/*      */     //   #741	-> 86
/*      */     //   #843	-> 93
/*      */     //   #43	-> 101
/*      */     //   #444	-> 110
/*      */     //   #828	-> 123
/*      */     //   #243	-> 129
/*      */     //   #418	-> 142
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   20	34	37	java/lang/IllegalStateException
/*      */     //   27	49	52	java/lang/IllegalStateException
/*      */     //   41	82	82	java/lang/IllegalStateException
/*      */     //   101	116	119	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*      */     int i;
/*      */     byte b;
/*      */     try {
/*      */       if (this.compute == 0)
/*      */         return; 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       if (this.compute == 1) {
/*      */         try {
/*      */           if (this.currentBlock.frame == null) {
/*      */             this.currentBlock.frame = new CurrentFrame();
/*      */             this.currentBlock.frame.owner = this.currentBlock;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         try {
/*      */           if (paramInt1 == -1)
/*      */             this.currentBlock.frame.set(this.cw, paramInt2, paramArrayOfObject1, paramInt3, paramArrayOfObject2); 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       if (paramInt1 == -1) {
/*      */         try {
/*      */           if (this.previousFrame == null)
/*      */             visitImplicitFirstFrame(); 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         this.currentLocals = paramInt2;
/*      */         i = startFrame(this.code.length, paramInt2, paramInt3);
/*      */         boolean bool = false;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     if (this.stackMap == null) {
/*      */       this.stackMap = new ByteVector();
/*      */       i = this.code.length;
/*      */     } else {
/*      */       i = this.code.length - this.previousFrameOffset - 1;
/*      */       try {
/*      */         if (i < 0) {
/*      */           try {
/*      */             if (paramInt1 == 3)
/*      */               return; 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           throw new IllegalStateException();
/*      */         } 
/*      */       } catch (IllegalStateException illegalStateException) {
/*      */         throw b(null);
/*      */       } 
/*      */     } 
/*      */     switch (paramInt1) {
/*      */       case 0:
/*      */         this.currentLocals = paramInt2;
/*      */         this.stackMap.putByte(255).putShort(i).putShort(paramInt2);
/*      */         b = 0;
/*      */         try {
/*      */           while (b < paramInt2) {
/*      */             writeFrameType(paramArrayOfObject1[b]);
/*      */             b++;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         this.stackMap.putShort(paramInt3);
/*      */         b = 0;
/*      */         try {
/*      */           while (b < paramInt3) {
/*      */             writeFrameType(paramArrayOfObject2[b]);
/*      */             b++;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         break;
/*      */       case 1:
/*      */         this.currentLocals += paramInt2;
/*      */         this.stackMap.putByte(251 + paramInt2).putShort(i);
/*      */         b = 0;
/*      */         try {
/*      */           while (b < paramInt2) {
/*      */             writeFrameType(paramArrayOfObject1[b]);
/*      */             b++;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         break;
/*      */       case 2:
/*      */         this.currentLocals -= paramInt2;
/*      */         this.stackMap.putByte(251 - paramInt2).putShort(i);
/*      */         break;
/*      */       case 3:
/*      */         try {
/*      */           if (i < 64) {
/*      */             this.stackMap.putByte(i);
/*      */             break;
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         this.stackMap.putByte(251).putShort(i);
/*      */         break;
/*      */       case 4:
/*      */         try {
/*      */           if (i < 64) {
/*      */             this.stackMap.putByte(64 + i);
/*      */           } else {
/*      */             this.stackMap.putByte(247).putShort(i);
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         writeFrameType(paramArrayOfObject2[0]);
/*      */         break;
/*      */     } 
/*      */     this.previousFrameOffset = this.code.length;
/*      */     this.frameCount++;
/*      */     this.maxStack = Math.max(this.maxStack, paramInt3);
/*      */     this.maxLocals = Math.max(this.maxLocals, this.currentLocals);
/*      */   }
/*      */   
/*      */   private void addSuccessor(int paramInt, Label paramLabel) {
/*      */     Edge edge = new Edge();
/*      */     edge.info = paramInt;
/*      */     edge.successor = paramLabel;
/*      */     edge.next = this.currentBlock.successors;
/*      */     this.currentBlock.successors = edge;
/*      */   }
/*      */   
/*      */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   15: ifnull -> 107
/*      */     //   18: aload_0
/*      */     //   19: getfield compute : I
/*      */     //   22: ifeq -> 47
/*      */     //   25: goto -> 32
/*      */     //   28: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   31: athrow
/*      */     //   32: aload_0
/*      */     //   33: getfield compute : I
/*      */     //   36: iconst_1
/*      */     //   37: if_icmpne -> 68
/*      */     //   40: goto -> 47
/*      */     //   43: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   46: athrow
/*      */     //   47: aload_0
/*      */     //   48: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   51: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   54: iload_1
/*      */     //   55: iload_2
/*      */     //   56: aconst_null
/*      */     //   57: aconst_null
/*      */     //   58: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   61: goto -> 107
/*      */     //   64: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   67: athrow
/*      */     //   68: iload_1
/*      */     //   69: sipush #188
/*      */     //   72: if_icmpeq -> 107
/*      */     //   75: aload_0
/*      */     //   76: getfield stackSize : I
/*      */     //   79: iconst_1
/*      */     //   80: iadd
/*      */     //   81: istore_3
/*      */     //   82: iload_3
/*      */     //   83: aload_0
/*      */     //   84: getfield maxStackSize : I
/*      */     //   87: if_icmple -> 102
/*      */     //   90: aload_0
/*      */     //   91: iload_3
/*      */     //   92: putfield maxStackSize : I
/*      */     //   95: goto -> 102
/*      */     //   98: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   101: athrow
/*      */     //   102: aload_0
/*      */     //   103: iload_3
/*      */     //   104: putfield stackSize : I
/*      */     //   107: iload_1
/*      */     //   108: bipush #17
/*      */     //   110: if_icmpne -> 130
/*      */     //   113: aload_0
/*      */     //   114: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   117: iload_1
/*      */     //   118: iload_2
/*      */     //   119: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   122: pop
/*      */     //   123: goto -> 140
/*      */     //   126: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   129: athrow
/*      */     //   130: aload_0
/*      */     //   131: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   134: iload_1
/*      */     //   135: iload_2
/*      */     //   136: invokevirtual put11 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   139: pop
/*      */     //   140: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #251	-> 0
/*      */     //   #146	-> 11
/*      */     //   #281	-> 18
/*      */     //   #541	-> 47
/*      */     //   #374	-> 68
/*      */     //   #977	-> 75
/*      */     //   #591	-> 82
/*      */     //   #975	-> 90
/*      */     //   #1012	-> 102
/*      */     //   #757	-> 107
/*      */     //   #440	-> 113
/*      */     //   #883	-> 130
/*      */     //   #617	-> 140
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	25	28	java/lang/IllegalStateException
/*      */     //   18	40	43	java/lang/IllegalStateException
/*      */     //   32	64	64	java/lang/IllegalStateException
/*      */     //   82	95	98	java/lang/IllegalStateException
/*      */     //   107	126	126	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*      */     // Byte code:
/*      */     //   0: iload_1
/*      */     //   1: sipush #200
/*      */     //   4: if_icmplt -> 15
/*      */     //   7: iconst_1
/*      */     //   8: goto -> 16
/*      */     //   11: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   14: athrow
/*      */     //   15: iconst_0
/*      */     //   16: istore_3
/*      */     //   17: iload_3
/*      */     //   18: ifeq -> 32
/*      */     //   21: iload_1
/*      */     //   22: bipush #33
/*      */     //   24: isub
/*      */     //   25: goto -> 33
/*      */     //   28: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   31: athrow
/*      */     //   32: iload_1
/*      */     //   33: istore_1
/*      */     //   34: aload_0
/*      */     //   35: aload_0
/*      */     //   36: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   39: getfield length : I
/*      */     //   42: putfield lastCodeOffset : I
/*      */     //   45: aconst_null
/*      */     //   46: astore #4
/*      */     //   48: aload_0
/*      */     //   49: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   52: ifnull -> 273
/*      */     //   55: aload_0
/*      */     //   56: getfield compute : I
/*      */     //   59: ifne -> 129
/*      */     //   62: goto -> 69
/*      */     //   65: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   68: athrow
/*      */     //   69: aload_0
/*      */     //   70: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   73: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   76: iload_1
/*      */     //   77: iconst_0
/*      */     //   78: aconst_null
/*      */     //   79: aconst_null
/*      */     //   80: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   83: aload_2
/*      */     //   84: invokevirtual getFirst : ()Lorg/spongepowered/asm/lib/Label;
/*      */     //   87: dup
/*      */     //   88: getfield status : I
/*      */     //   91: bipush #16
/*      */     //   93: ior
/*      */     //   94: putfield status : I
/*      */     //   97: aload_0
/*      */     //   98: iconst_0
/*      */     //   99: aload_2
/*      */     //   100: invokespecial addSuccessor : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   103: iload_1
/*      */     //   104: sipush #167
/*      */     //   107: if_icmpeq -> 273
/*      */     //   110: goto -> 117
/*      */     //   113: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   116: athrow
/*      */     //   117: new org/spongepowered/asm/lib/Label
/*      */     //   120: dup
/*      */     //   121: invokespecial <init> : ()V
/*      */     //   124: astore #4
/*      */     //   126: goto -> 273
/*      */     //   129: aload_0
/*      */     //   130: getfield compute : I
/*      */     //   133: iconst_1
/*      */     //   134: if_icmpne -> 158
/*      */     //   137: aload_0
/*      */     //   138: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   141: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   144: iload_1
/*      */     //   145: iconst_0
/*      */     //   146: aconst_null
/*      */     //   147: aconst_null
/*      */     //   148: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   151: goto -> 273
/*      */     //   154: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   157: athrow
/*      */     //   158: iload_1
/*      */     //   159: sipush #168
/*      */     //   162: if_icmpne -> 250
/*      */     //   165: aload_2
/*      */     //   166: getfield status : I
/*      */     //   169: sipush #512
/*      */     //   172: iand
/*      */     //   173: ifne -> 212
/*      */     //   176: goto -> 183
/*      */     //   179: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   182: athrow
/*      */     //   183: aload_2
/*      */     //   184: dup
/*      */     //   185: getfield status : I
/*      */     //   188: sipush #512
/*      */     //   191: ior
/*      */     //   192: putfield status : I
/*      */     //   195: aload_0
/*      */     //   196: dup
/*      */     //   197: getfield subroutines : I
/*      */     //   200: iconst_1
/*      */     //   201: iadd
/*      */     //   202: putfield subroutines : I
/*      */     //   205: goto -> 212
/*      */     //   208: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   211: athrow
/*      */     //   212: aload_0
/*      */     //   213: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   216: dup
/*      */     //   217: getfield status : I
/*      */     //   220: sipush #128
/*      */     //   223: ior
/*      */     //   224: putfield status : I
/*      */     //   227: aload_0
/*      */     //   228: aload_0
/*      */     //   229: getfield stackSize : I
/*      */     //   232: iconst_1
/*      */     //   233: iadd
/*      */     //   234: aload_2
/*      */     //   235: invokespecial addSuccessor : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   238: new org/spongepowered/asm/lib/Label
/*      */     //   241: dup
/*      */     //   242: invokespecial <init> : ()V
/*      */     //   245: astore #4
/*      */     //   247: goto -> 273
/*      */     //   250: aload_0
/*      */     //   251: dup
/*      */     //   252: getfield stackSize : I
/*      */     //   255: getstatic org/spongepowered/asm/lib/Frame.SIZE : [I
/*      */     //   258: iload_1
/*      */     //   259: iaload
/*      */     //   260: iadd
/*      */     //   261: putfield stackSize : I
/*      */     //   264: aload_0
/*      */     //   265: aload_0
/*      */     //   266: getfield stackSize : I
/*      */     //   269: aload_2
/*      */     //   270: invokespecial addSuccessor : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   273: aload_2
/*      */     //   274: getfield status : I
/*      */     //   277: iconst_2
/*      */     //   278: iand
/*      */     //   279: ifeq -> 463
/*      */     //   282: aload_2
/*      */     //   283: getfield position : I
/*      */     //   286: aload_0
/*      */     //   287: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   290: getfield length : I
/*      */     //   293: isub
/*      */     //   294: sipush #-32768
/*      */     //   297: if_icmpge -> 463
/*      */     //   300: goto -> 307
/*      */     //   303: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   306: athrow
/*      */     //   307: iload_1
/*      */     //   308: sipush #167
/*      */     //   311: if_icmpne -> 339
/*      */     //   314: goto -> 321
/*      */     //   317: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   320: athrow
/*      */     //   321: aload_0
/*      */     //   322: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   325: sipush #200
/*      */     //   328: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   331: pop
/*      */     //   332: goto -> 441
/*      */     //   335: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   338: athrow
/*      */     //   339: iload_1
/*      */     //   340: sipush #168
/*      */     //   343: if_icmpne -> 364
/*      */     //   346: aload_0
/*      */     //   347: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   350: sipush #201
/*      */     //   353: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   356: pop
/*      */     //   357: goto -> 441
/*      */     //   360: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   363: athrow
/*      */     //   364: aload #4
/*      */     //   366: ifnull -> 388
/*      */     //   369: aload #4
/*      */     //   371: dup
/*      */     //   372: getfield status : I
/*      */     //   375: bipush #16
/*      */     //   377: ior
/*      */     //   378: putfield status : I
/*      */     //   381: goto -> 388
/*      */     //   384: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   387: athrow
/*      */     //   388: aload_0
/*      */     //   389: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   392: iload_1
/*      */     //   393: sipush #166
/*      */     //   396: if_icmpgt -> 413
/*      */     //   399: iload_1
/*      */     //   400: iconst_1
/*      */     //   401: iadd
/*      */     //   402: iconst_1
/*      */     //   403: ixor
/*      */     //   404: iconst_1
/*      */     //   405: isub
/*      */     //   406: goto -> 416
/*      */     //   409: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   412: athrow
/*      */     //   413: iload_1
/*      */     //   414: iconst_1
/*      */     //   415: ixor
/*      */     //   416: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   419: pop
/*      */     //   420: aload_0
/*      */     //   421: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   424: bipush #8
/*      */     //   426: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   429: pop
/*      */     //   430: aload_0
/*      */     //   431: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   434: sipush #200
/*      */     //   437: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   440: pop
/*      */     //   441: aload_2
/*      */     //   442: aload_0
/*      */     //   443: aload_0
/*      */     //   444: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   447: aload_0
/*      */     //   448: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   451: getfield length : I
/*      */     //   454: iconst_1
/*      */     //   455: isub
/*      */     //   456: iconst_1
/*      */     //   457: invokevirtual put : (Lorg/spongepowered/asm/lib/MethodWriter;Lorg/spongepowered/asm/lib/ByteVector;IZ)V
/*      */     //   460: goto -> 533
/*      */     //   463: iload_3
/*      */     //   464: ifeq -> 505
/*      */     //   467: aload_0
/*      */     //   468: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   471: iload_1
/*      */     //   472: bipush #33
/*      */     //   474: iadd
/*      */     //   475: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   478: pop
/*      */     //   479: aload_2
/*      */     //   480: aload_0
/*      */     //   481: aload_0
/*      */     //   482: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   485: aload_0
/*      */     //   486: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   489: getfield length : I
/*      */     //   492: iconst_1
/*      */     //   493: isub
/*      */     //   494: iconst_1
/*      */     //   495: invokevirtual put : (Lorg/spongepowered/asm/lib/MethodWriter;Lorg/spongepowered/asm/lib/ByteVector;IZ)V
/*      */     //   498: goto -> 533
/*      */     //   501: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   504: athrow
/*      */     //   505: aload_0
/*      */     //   506: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   509: iload_1
/*      */     //   510: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   513: pop
/*      */     //   514: aload_2
/*      */     //   515: aload_0
/*      */     //   516: aload_0
/*      */     //   517: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   520: aload_0
/*      */     //   521: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   524: getfield length : I
/*      */     //   527: iconst_1
/*      */     //   528: isub
/*      */     //   529: iconst_0
/*      */     //   530: invokevirtual put : (Lorg/spongepowered/asm/lib/MethodWriter;Lorg/spongepowered/asm/lib/ByteVector;IZ)V
/*      */     //   533: aload_0
/*      */     //   534: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   537: ifnull -> 583
/*      */     //   540: aload #4
/*      */     //   542: ifnull -> 565
/*      */     //   545: goto -> 552
/*      */     //   548: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   551: athrow
/*      */     //   552: aload_0
/*      */     //   553: aload #4
/*      */     //   555: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   558: goto -> 565
/*      */     //   561: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   564: athrow
/*      */     //   565: iload_1
/*      */     //   566: sipush #167
/*      */     //   569: if_icmpne -> 583
/*      */     //   572: aload_0
/*      */     //   573: invokespecial noSuccessor : ()V
/*      */     //   576: goto -> 583
/*      */     //   579: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   582: athrow
/*      */     //   583: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #276	-> 0
/*      */     //   #140	-> 17
/*      */     //   #1061	-> 34
/*      */     //   #420	-> 45
/*      */     //   #760	-> 48
/*      */     //   #122	-> 55
/*      */     //   #114	-> 69
/*      */     //   #687	-> 83
/*      */     //   #964	-> 97
/*      */     //   #267	-> 103
/*      */     //   #550	-> 117
/*      */     //   #739	-> 129
/*      */     //   #446	-> 137
/*      */     //   #998	-> 158
/*      */     //   #678	-> 165
/*      */     //   #1076	-> 183
/*      */     //   #398	-> 195
/*      */     //   #819	-> 212
/*      */     //   #611	-> 227
/*      */     //   #926	-> 238
/*      */     //   #795	-> 250
/*      */     //   #469	-> 264
/*      */     //   #882	-> 273
/*      */     //   #249	-> 307
/*      */     //   #523	-> 321
/*      */     //   #756	-> 339
/*      */     //   #331	-> 346
/*      */     //   #515	-> 364
/*      */     //   #909	-> 369
/*      */     //   #1006	-> 388
/*      */     //   #356	-> 420
/*      */     //   #907	-> 430
/*      */     //   #31	-> 441
/*      */     //   #128	-> 463
/*      */     //   #749	-> 467
/*      */     //   #80	-> 479
/*      */     //   #831	-> 505
/*      */     //   #71	-> 514
/*      */     //   #322	-> 533
/*      */     //   #702	-> 540
/*      */     //   #313	-> 552
/*      */     //   #321	-> 565
/*      */     //   #235	-> 572
/*      */     //   #240	-> 583
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	11	11	java/lang/IllegalStateException
/*      */     //   17	28	28	java/lang/IllegalStateException
/*      */     //   48	62	65	java/lang/IllegalStateException
/*      */     //   55	110	113	java/lang/IllegalStateException
/*      */     //   129	154	154	java/lang/IllegalStateException
/*      */     //   158	176	179	java/lang/IllegalStateException
/*      */     //   165	205	208	java/lang/IllegalStateException
/*      */     //   273	300	303	java/lang/IllegalStateException
/*      */     //   282	314	317	java/lang/IllegalStateException
/*      */     //   307	335	335	java/lang/IllegalStateException
/*      */     //   339	360	360	java/lang/IllegalStateException
/*      */     //   364	381	384	java/lang/IllegalStateException
/*      */     //   388	409	409	java/lang/IllegalStateException
/*      */     //   463	501	501	java/lang/IllegalStateException
/*      */     //   533	545	548	java/lang/IllegalStateException
/*      */     //   540	558	561	java/lang/IllegalStateException
/*      */     //   565	576	579	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitInsn(int paramInt) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   15: iload_1
/*      */     //   16: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   19: pop
/*      */     //   20: aload_0
/*      */     //   21: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   24: ifnull -> 159
/*      */     //   27: aload_0
/*      */     //   28: getfield compute : I
/*      */     //   31: ifeq -> 56
/*      */     //   34: goto -> 41
/*      */     //   37: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   40: athrow
/*      */     //   41: aload_0
/*      */     //   42: getfield compute : I
/*      */     //   45: iconst_1
/*      */     //   46: if_icmpne -> 77
/*      */     //   49: goto -> 56
/*      */     //   52: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   55: athrow
/*      */     //   56: aload_0
/*      */     //   57: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   60: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   63: iload_1
/*      */     //   64: iconst_0
/*      */     //   65: aconst_null
/*      */     //   66: aconst_null
/*      */     //   67: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   70: goto -> 113
/*      */     //   73: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   76: athrow
/*      */     //   77: aload_0
/*      */     //   78: getfield stackSize : I
/*      */     //   81: getstatic org/spongepowered/asm/lib/Frame.SIZE : [I
/*      */     //   84: iload_1
/*      */     //   85: iaload
/*      */     //   86: iadd
/*      */     //   87: istore_2
/*      */     //   88: iload_2
/*      */     //   89: aload_0
/*      */     //   90: getfield maxStackSize : I
/*      */     //   93: if_icmple -> 108
/*      */     //   96: aload_0
/*      */     //   97: iload_2
/*      */     //   98: putfield maxStackSize : I
/*      */     //   101: goto -> 108
/*      */     //   104: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   107: athrow
/*      */     //   108: aload_0
/*      */     //   109: iload_2
/*      */     //   110: putfield stackSize : I
/*      */     //   113: iload_1
/*      */     //   114: sipush #172
/*      */     //   117: if_icmplt -> 134
/*      */     //   120: iload_1
/*      */     //   121: sipush #177
/*      */     //   124: if_icmple -> 148
/*      */     //   127: goto -> 134
/*      */     //   130: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   133: athrow
/*      */     //   134: iload_1
/*      */     //   135: sipush #191
/*      */     //   138: if_icmpne -> 159
/*      */     //   141: goto -> 148
/*      */     //   144: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   147: athrow
/*      */     //   148: aload_0
/*      */     //   149: invokespecial noSuccessor : ()V
/*      */     //   152: goto -> 159
/*      */     //   155: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   158: athrow
/*      */     //   159: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #344	-> 0
/*      */     //   #421	-> 11
/*      */     //   #918	-> 20
/*      */     //   #630	-> 27
/*      */     //   #525	-> 56
/*      */     //   #835	-> 77
/*      */     //   #1034	-> 88
/*      */     //   #20	-> 96
/*      */     //   #791	-> 108
/*      */     //   #312	-> 113
/*      */     //   #417	-> 148
/*      */     //   #780	-> 159
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	34	37	java/lang/IllegalStateException
/*      */     //   27	49	52	java/lang/IllegalStateException
/*      */     //   41	73	73	java/lang/IllegalStateException
/*      */     //   88	101	104	java/lang/IllegalStateException
/*      */     //   113	127	130	java/lang/IllegalStateException
/*      */     //   120	141	144	java/lang/IllegalStateException
/*      */     //   134	152	155	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   final void put(ByteVector paramByteVector) {
/*      */     // Byte code:
/*      */     //   0: bipush #64
/*      */     //   2: istore_2
/*      */     //   3: ldc 917504
/*      */     //   5: aload_0
/*      */     //   6: getfield access : I
/*      */     //   9: ldc 262144
/*      */     //   11: iand
/*      */     //   12: bipush #64
/*      */     //   14: idiv
/*      */     //   15: ior
/*      */     //   16: istore_3
/*      */     //   17: aload_1
/*      */     //   18: aload_0
/*      */     //   19: getfield access : I
/*      */     //   22: iload_3
/*      */     //   23: iconst_m1
/*      */     //   24: ixor
/*      */     //   25: iand
/*      */     //   26: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   29: aload_0
/*      */     //   30: getfield name : I
/*      */     //   33: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   36: aload_0
/*      */     //   37: getfield desc : I
/*      */     //   40: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   43: pop
/*      */     //   44: aload_0
/*      */     //   45: getfield classReaderOffset : I
/*      */     //   48: ifeq -> 79
/*      */     //   51: aload_1
/*      */     //   52: aload_0
/*      */     //   53: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   56: getfield cr : Lorg/spongepowered/asm/lib/ClassReader;
/*      */     //   59: getfield b : [B
/*      */     //   62: aload_0
/*      */     //   63: getfield classReaderOffset : I
/*      */     //   66: aload_0
/*      */     //   67: getfield classReaderLength : I
/*      */     //   70: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   73: pop
/*      */     //   74: return
/*      */     //   75: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   78: athrow
/*      */     //   79: iconst_0
/*      */     //   80: istore #4
/*      */     //   82: aload_0
/*      */     //   83: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   86: getfield length : I
/*      */     //   89: ifle -> 102
/*      */     //   92: iinc #4, 1
/*      */     //   95: goto -> 102
/*      */     //   98: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   101: athrow
/*      */     //   102: aload_0
/*      */     //   103: getfield exceptionCount : I
/*      */     //   106: ifle -> 119
/*      */     //   109: iinc #4, 1
/*      */     //   112: goto -> 119
/*      */     //   115: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   118: athrow
/*      */     //   119: aload_0
/*      */     //   120: getfield access : I
/*      */     //   123: sipush #4096
/*      */     //   126: iand
/*      */     //   127: ifeq -> 179
/*      */     //   130: aload_0
/*      */     //   131: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   134: getfield version : I
/*      */     //   137: ldc 65535
/*      */     //   139: iand
/*      */     //   140: bipush #49
/*      */     //   142: if_icmplt -> 169
/*      */     //   145: goto -> 152
/*      */     //   148: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   151: athrow
/*      */     //   152: aload_0
/*      */     //   153: getfield access : I
/*      */     //   156: ldc 262144
/*      */     //   158: iand
/*      */     //   159: ifeq -> 179
/*      */     //   162: goto -> 169
/*      */     //   165: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   168: athrow
/*      */     //   169: iinc #4, 1
/*      */     //   172: goto -> 179
/*      */     //   175: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   178: athrow
/*      */     //   179: aload_0
/*      */     //   180: getfield access : I
/*      */     //   183: ldc 131072
/*      */     //   185: iand
/*      */     //   186: ifeq -> 199
/*      */     //   189: iinc #4, 1
/*      */     //   192: goto -> 199
/*      */     //   195: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   198: athrow
/*      */     //   199: aload_0
/*      */     //   200: getfield signature : Ljava/lang/String;
/*      */     //   203: ifnull -> 216
/*      */     //   206: iinc #4, 1
/*      */     //   209: goto -> 216
/*      */     //   212: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   215: athrow
/*      */     //   216: aload_0
/*      */     //   217: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   220: ifnull -> 233
/*      */     //   223: iinc #4, 1
/*      */     //   226: goto -> 233
/*      */     //   229: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   232: athrow
/*      */     //   233: aload_0
/*      */     //   234: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   237: ifnull -> 250
/*      */     //   240: iinc #4, 1
/*      */     //   243: goto -> 250
/*      */     //   246: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   249: athrow
/*      */     //   250: aload_0
/*      */     //   251: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   254: ifnull -> 267
/*      */     //   257: iinc #4, 1
/*      */     //   260: goto -> 267
/*      */     //   263: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   266: athrow
/*      */     //   267: aload_0
/*      */     //   268: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   271: ifnull -> 284
/*      */     //   274: iinc #4, 1
/*      */     //   277: goto -> 284
/*      */     //   280: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   283: athrow
/*      */     //   284: aload_0
/*      */     //   285: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   288: ifnull -> 301
/*      */     //   291: iinc #4, 1
/*      */     //   294: goto -> 301
/*      */     //   297: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   300: athrow
/*      */     //   301: aload_0
/*      */     //   302: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   305: ifnull -> 318
/*      */     //   308: iinc #4, 1
/*      */     //   311: goto -> 318
/*      */     //   314: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   317: athrow
/*      */     //   318: aload_0
/*      */     //   319: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   322: ifnull -> 335
/*      */     //   325: iinc #4, 1
/*      */     //   328: goto -> 335
/*      */     //   331: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   334: athrow
/*      */     //   335: aload_0
/*      */     //   336: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   339: ifnull -> 352
/*      */     //   342: iinc #4, 1
/*      */     //   345: goto -> 352
/*      */     //   348: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   351: athrow
/*      */     //   352: aload_0
/*      */     //   353: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   356: ifnull -> 371
/*      */     //   359: iload #4
/*      */     //   361: aload_0
/*      */     //   362: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   365: invokevirtual getCount : ()I
/*      */     //   368: iadd
/*      */     //   369: istore #4
/*      */     //   371: aload_1
/*      */     //   372: iload #4
/*      */     //   374: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   377: pop
/*      */     //   378: aload_0
/*      */     //   379: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   382: getfield length : I
/*      */     //   385: ifle -> 1297
/*      */     //   388: bipush #12
/*      */     //   390: aload_0
/*      */     //   391: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   394: getfield length : I
/*      */     //   397: iadd
/*      */     //   398: bipush #8
/*      */     //   400: aload_0
/*      */     //   401: getfield handlerCount : I
/*      */     //   404: imul
/*      */     //   405: iadd
/*      */     //   406: istore #5
/*      */     //   408: aload_0
/*      */     //   409: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   412: ifnull -> 430
/*      */     //   415: iload #5
/*      */     //   417: bipush #8
/*      */     //   419: aload_0
/*      */     //   420: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   423: getfield length : I
/*      */     //   426: iadd
/*      */     //   427: iadd
/*      */     //   428: istore #5
/*      */     //   430: aload_0
/*      */     //   431: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   434: ifnull -> 452
/*      */     //   437: iload #5
/*      */     //   439: bipush #8
/*      */     //   441: aload_0
/*      */     //   442: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   445: getfield length : I
/*      */     //   448: iadd
/*      */     //   449: iadd
/*      */     //   450: istore #5
/*      */     //   452: aload_0
/*      */     //   453: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   456: ifnull -> 474
/*      */     //   459: iload #5
/*      */     //   461: bipush #8
/*      */     //   463: aload_0
/*      */     //   464: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   467: getfield length : I
/*      */     //   470: iadd
/*      */     //   471: iadd
/*      */     //   472: istore #5
/*      */     //   474: aload_0
/*      */     //   475: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   478: ifnull -> 496
/*      */     //   481: iload #5
/*      */     //   483: bipush #8
/*      */     //   485: aload_0
/*      */     //   486: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   489: getfield length : I
/*      */     //   492: iadd
/*      */     //   493: iadd
/*      */     //   494: istore #5
/*      */     //   496: aload_0
/*      */     //   497: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   500: ifnull -> 518
/*      */     //   503: iload #5
/*      */     //   505: bipush #8
/*      */     //   507: aload_0
/*      */     //   508: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   511: invokevirtual getSize : ()I
/*      */     //   514: iadd
/*      */     //   515: iadd
/*      */     //   516: istore #5
/*      */     //   518: aload_0
/*      */     //   519: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   522: ifnull -> 540
/*      */     //   525: iload #5
/*      */     //   527: bipush #8
/*      */     //   529: aload_0
/*      */     //   530: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   533: invokevirtual getSize : ()I
/*      */     //   536: iadd
/*      */     //   537: iadd
/*      */     //   538: istore #5
/*      */     //   540: aload_0
/*      */     //   541: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   544: ifnull -> 585
/*      */     //   547: iload #5
/*      */     //   549: aload_0
/*      */     //   550: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   553: aload_0
/*      */     //   554: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   557: aload_0
/*      */     //   558: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   561: getfield data : [B
/*      */     //   564: aload_0
/*      */     //   565: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   568: getfield length : I
/*      */     //   571: aload_0
/*      */     //   572: getfield maxStack : I
/*      */     //   575: aload_0
/*      */     //   576: getfield maxLocals : I
/*      */     //   579: invokevirtual getSize : (Lorg/spongepowered/asm/lib/ClassWriter;[BIII)I
/*      */     //   582: iadd
/*      */     //   583: istore #5
/*      */     //   585: aload_1
/*      */     //   586: aload_0
/*      */     //   587: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   590: ldc 'Code'
/*      */     //   592: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   595: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   598: iload #5
/*      */     //   600: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   603: pop
/*      */     //   604: aload_1
/*      */     //   605: aload_0
/*      */     //   606: getfield maxStack : I
/*      */     //   609: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   612: aload_0
/*      */     //   613: getfield maxLocals : I
/*      */     //   616: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   619: pop
/*      */     //   620: aload_1
/*      */     //   621: aload_0
/*      */     //   622: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   625: getfield length : I
/*      */     //   628: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   631: aload_0
/*      */     //   632: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   635: getfield data : [B
/*      */     //   638: iconst_0
/*      */     //   639: aload_0
/*      */     //   640: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   643: getfield length : I
/*      */     //   646: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   649: pop
/*      */     //   650: aload_1
/*      */     //   651: aload_0
/*      */     //   652: getfield handlerCount : I
/*      */     //   655: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   658: pop
/*      */     //   659: aload_0
/*      */     //   660: getfield handlerCount : I
/*      */     //   663: ifle -> 730
/*      */     //   666: aload_0
/*      */     //   667: getfield firstHandler : Lorg/spongepowered/asm/lib/Handler;
/*      */     //   670: astore #6
/*      */     //   672: aload #6
/*      */     //   674: ifnull -> 730
/*      */     //   677: aload_1
/*      */     //   678: aload #6
/*      */     //   680: getfield start : Lorg/spongepowered/asm/lib/Label;
/*      */     //   683: getfield position : I
/*      */     //   686: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   689: aload #6
/*      */     //   691: getfield end : Lorg/spongepowered/asm/lib/Label;
/*      */     //   694: getfield position : I
/*      */     //   697: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   700: aload #6
/*      */     //   702: getfield handler : Lorg/spongepowered/asm/lib/Label;
/*      */     //   705: getfield position : I
/*      */     //   708: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   711: aload #6
/*      */     //   713: getfield type : I
/*      */     //   716: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   719: pop
/*      */     //   720: aload #6
/*      */     //   722: getfield next : Lorg/spongepowered/asm/lib/Handler;
/*      */     //   725: astore #6
/*      */     //   727: goto -> 672
/*      */     //   730: iconst_0
/*      */     //   731: istore #4
/*      */     //   733: aload_0
/*      */     //   734: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   737: ifnull -> 750
/*      */     //   740: iinc #4, 1
/*      */     //   743: goto -> 750
/*      */     //   746: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   749: athrow
/*      */     //   750: aload_0
/*      */     //   751: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   754: ifnull -> 767
/*      */     //   757: iinc #4, 1
/*      */     //   760: goto -> 767
/*      */     //   763: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   766: athrow
/*      */     //   767: aload_0
/*      */     //   768: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   771: ifnull -> 784
/*      */     //   774: iinc #4, 1
/*      */     //   777: goto -> 784
/*      */     //   780: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   783: athrow
/*      */     //   784: aload_0
/*      */     //   785: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   788: ifnull -> 801
/*      */     //   791: iinc #4, 1
/*      */     //   794: goto -> 801
/*      */     //   797: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   800: athrow
/*      */     //   801: aload_0
/*      */     //   802: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   805: ifnull -> 818
/*      */     //   808: iinc #4, 1
/*      */     //   811: goto -> 818
/*      */     //   814: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   817: athrow
/*      */     //   818: aload_0
/*      */     //   819: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   822: ifnull -> 835
/*      */     //   825: iinc #4, 1
/*      */     //   828: goto -> 835
/*      */     //   831: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   834: athrow
/*      */     //   835: aload_0
/*      */     //   836: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   839: ifnull -> 854
/*      */     //   842: iload #4
/*      */     //   844: aload_0
/*      */     //   845: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   848: invokevirtual getCount : ()I
/*      */     //   851: iadd
/*      */     //   852: istore #4
/*      */     //   854: aload_1
/*      */     //   855: iload #4
/*      */     //   857: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   860: pop
/*      */     //   861: aload_0
/*      */     //   862: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   865: ifnull -> 930
/*      */     //   868: aload_1
/*      */     //   869: aload_0
/*      */     //   870: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   873: ldc 'LocalVariableTable'
/*      */     //   875: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   878: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   881: pop
/*      */     //   882: aload_1
/*      */     //   883: aload_0
/*      */     //   884: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   887: getfield length : I
/*      */     //   890: iconst_2
/*      */     //   891: iadd
/*      */     //   892: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   895: aload_0
/*      */     //   896: getfield localVarCount : I
/*      */     //   899: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   902: pop
/*      */     //   903: aload_1
/*      */     //   904: aload_0
/*      */     //   905: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   908: getfield data : [B
/*      */     //   911: iconst_0
/*      */     //   912: aload_0
/*      */     //   913: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   916: getfield length : I
/*      */     //   919: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   922: pop
/*      */     //   923: goto -> 930
/*      */     //   926: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   929: athrow
/*      */     //   930: aload_0
/*      */     //   931: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   934: ifnull -> 999
/*      */     //   937: aload_1
/*      */     //   938: aload_0
/*      */     //   939: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   942: ldc 'LocalVariableTypeTable'
/*      */     //   944: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   947: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   950: pop
/*      */     //   951: aload_1
/*      */     //   952: aload_0
/*      */     //   953: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   956: getfield length : I
/*      */     //   959: iconst_2
/*      */     //   960: iadd
/*      */     //   961: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   964: aload_0
/*      */     //   965: getfield localVarTypeCount : I
/*      */     //   968: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   971: pop
/*      */     //   972: aload_1
/*      */     //   973: aload_0
/*      */     //   974: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   977: getfield data : [B
/*      */     //   980: iconst_0
/*      */     //   981: aload_0
/*      */     //   982: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   985: getfield length : I
/*      */     //   988: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   991: pop
/*      */     //   992: goto -> 999
/*      */     //   995: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   998: athrow
/*      */     //   999: aload_0
/*      */     //   1000: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1003: ifnull -> 1068
/*      */     //   1006: aload_1
/*      */     //   1007: aload_0
/*      */     //   1008: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1011: ldc 'LineNumberTable'
/*      */     //   1013: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1016: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1019: pop
/*      */     //   1020: aload_1
/*      */     //   1021: aload_0
/*      */     //   1022: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1025: getfield length : I
/*      */     //   1028: iconst_2
/*      */     //   1029: iadd
/*      */     //   1030: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1033: aload_0
/*      */     //   1034: getfield lineNumberCount : I
/*      */     //   1037: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1040: pop
/*      */     //   1041: aload_1
/*      */     //   1042: aload_0
/*      */     //   1043: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1046: getfield data : [B
/*      */     //   1049: iconst_0
/*      */     //   1050: aload_0
/*      */     //   1051: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1054: getfield length : I
/*      */     //   1057: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1060: pop
/*      */     //   1061: goto -> 1068
/*      */     //   1064: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1067: athrow
/*      */     //   1068: aload_0
/*      */     //   1069: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1072: ifnull -> 1177
/*      */     //   1075: aload_0
/*      */     //   1076: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1079: getfield version : I
/*      */     //   1082: ldc 65535
/*      */     //   1084: iand
/*      */     //   1085: bipush #50
/*      */     //   1087: if_icmplt -> 1105
/*      */     //   1090: goto -> 1097
/*      */     //   1093: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1096: athrow
/*      */     //   1097: iconst_1
/*      */     //   1098: goto -> 1106
/*      */     //   1101: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1104: athrow
/*      */     //   1105: iconst_0
/*      */     //   1106: istore #6
/*      */     //   1108: aload_1
/*      */     //   1109: aload_0
/*      */     //   1110: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1113: iload #6
/*      */     //   1115: ifeq -> 1127
/*      */     //   1118: ldc 'StackMapTable'
/*      */     //   1120: goto -> 1129
/*      */     //   1123: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1126: athrow
/*      */     //   1127: ldc 'StackMap'
/*      */     //   1129: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1132: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1135: pop
/*      */     //   1136: aload_1
/*      */     //   1137: aload_0
/*      */     //   1138: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1141: getfield length : I
/*      */     //   1144: iconst_2
/*      */     //   1145: iadd
/*      */     //   1146: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1149: aload_0
/*      */     //   1150: getfield frameCount : I
/*      */     //   1153: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1156: pop
/*      */     //   1157: aload_1
/*      */     //   1158: aload_0
/*      */     //   1159: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1162: getfield data : [B
/*      */     //   1165: iconst_0
/*      */     //   1166: aload_0
/*      */     //   1167: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1170: getfield length : I
/*      */     //   1173: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1176: pop
/*      */     //   1177: aload_0
/*      */     //   1178: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1181: ifnull -> 1213
/*      */     //   1184: aload_1
/*      */     //   1185: aload_0
/*      */     //   1186: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1189: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   1191: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1194: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1197: pop
/*      */     //   1198: aload_0
/*      */     //   1199: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1202: aload_1
/*      */     //   1203: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1206: goto -> 1213
/*      */     //   1209: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1212: athrow
/*      */     //   1213: aload_0
/*      */     //   1214: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1217: ifnull -> 1249
/*      */     //   1220: aload_1
/*      */     //   1221: aload_0
/*      */     //   1222: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1225: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   1227: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1230: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1233: pop
/*      */     //   1234: aload_0
/*      */     //   1235: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1238: aload_1
/*      */     //   1239: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1242: goto -> 1249
/*      */     //   1245: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1248: athrow
/*      */     //   1249: aload_0
/*      */     //   1250: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1253: ifnull -> 1297
/*      */     //   1256: aload_0
/*      */     //   1257: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1260: aload_0
/*      */     //   1261: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1264: aload_0
/*      */     //   1265: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1268: getfield data : [B
/*      */     //   1271: aload_0
/*      */     //   1272: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1275: getfield length : I
/*      */     //   1278: aload_0
/*      */     //   1279: getfield maxLocals : I
/*      */     //   1282: aload_0
/*      */     //   1283: getfield maxStack : I
/*      */     //   1286: aload_1
/*      */     //   1287: invokevirtual put : (Lorg/spongepowered/asm/lib/ClassWriter;[BIIILorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1290: goto -> 1297
/*      */     //   1293: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1296: athrow
/*      */     //   1297: aload_0
/*      */     //   1298: getfield exceptionCount : I
/*      */     //   1301: ifle -> 1372
/*      */     //   1304: aload_1
/*      */     //   1305: aload_0
/*      */     //   1306: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1309: ldc 'Exceptions'
/*      */     //   1311: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1314: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1317: iconst_2
/*      */     //   1318: aload_0
/*      */     //   1319: getfield exceptionCount : I
/*      */     //   1322: imul
/*      */     //   1323: iconst_2
/*      */     //   1324: iadd
/*      */     //   1325: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1328: pop
/*      */     //   1329: aload_1
/*      */     //   1330: aload_0
/*      */     //   1331: getfield exceptionCount : I
/*      */     //   1334: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1337: pop
/*      */     //   1338: iconst_0
/*      */     //   1339: istore #5
/*      */     //   1341: iload #5
/*      */     //   1343: aload_0
/*      */     //   1344: getfield exceptionCount : I
/*      */     //   1347: if_icmpge -> 1372
/*      */     //   1350: aload_1
/*      */     //   1351: aload_0
/*      */     //   1352: getfield exceptions : [I
/*      */     //   1355: iload #5
/*      */     //   1357: iaload
/*      */     //   1358: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1361: pop
/*      */     //   1362: iinc #5, 1
/*      */     //   1365: goto -> 1341
/*      */     //   1368: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1371: athrow
/*      */     //   1372: aload_0
/*      */     //   1373: getfield access : I
/*      */     //   1376: sipush #4096
/*      */     //   1379: iand
/*      */     //   1380: ifeq -> 1447
/*      */     //   1383: aload_0
/*      */     //   1384: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1387: getfield version : I
/*      */     //   1390: ldc 65535
/*      */     //   1392: iand
/*      */     //   1393: bipush #49
/*      */     //   1395: if_icmplt -> 1422
/*      */     //   1398: goto -> 1405
/*      */     //   1401: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1404: athrow
/*      */     //   1405: aload_0
/*      */     //   1406: getfield access : I
/*      */     //   1409: ldc 262144
/*      */     //   1411: iand
/*      */     //   1412: ifeq -> 1447
/*      */     //   1415: goto -> 1422
/*      */     //   1418: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1421: athrow
/*      */     //   1422: aload_1
/*      */     //   1423: aload_0
/*      */     //   1424: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1427: ldc 'Synthetic'
/*      */     //   1429: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1432: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1435: iconst_0
/*      */     //   1436: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1439: pop
/*      */     //   1440: goto -> 1447
/*      */     //   1443: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1446: athrow
/*      */     //   1447: aload_0
/*      */     //   1448: getfield access : I
/*      */     //   1451: ldc 131072
/*      */     //   1453: iand
/*      */     //   1454: ifeq -> 1482
/*      */     //   1457: aload_1
/*      */     //   1458: aload_0
/*      */     //   1459: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1462: ldc 'Deprecated'
/*      */     //   1464: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1467: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1470: iconst_0
/*      */     //   1471: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1474: pop
/*      */     //   1475: goto -> 1482
/*      */     //   1478: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1481: athrow
/*      */     //   1482: aload_0
/*      */     //   1483: getfield signature : Ljava/lang/String;
/*      */     //   1486: ifnull -> 1528
/*      */     //   1489: aload_1
/*      */     //   1490: aload_0
/*      */     //   1491: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1494: ldc 'Signature'
/*      */     //   1496: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1499: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1502: iconst_2
/*      */     //   1503: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1506: aload_0
/*      */     //   1507: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1510: aload_0
/*      */     //   1511: getfield signature : Ljava/lang/String;
/*      */     //   1514: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1517: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1520: pop
/*      */     //   1521: goto -> 1528
/*      */     //   1524: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1527: athrow
/*      */     //   1528: aload_0
/*      */     //   1529: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1532: ifnull -> 1597
/*      */     //   1535: aload_1
/*      */     //   1536: aload_0
/*      */     //   1537: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1540: ldc 'MethodParameters'
/*      */     //   1542: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1545: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1548: pop
/*      */     //   1549: aload_1
/*      */     //   1550: aload_0
/*      */     //   1551: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1554: getfield length : I
/*      */     //   1557: iconst_1
/*      */     //   1558: iadd
/*      */     //   1559: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1562: aload_0
/*      */     //   1563: getfield methodParametersCount : I
/*      */     //   1566: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1569: pop
/*      */     //   1570: aload_1
/*      */     //   1571: aload_0
/*      */     //   1572: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1575: getfield data : [B
/*      */     //   1578: iconst_0
/*      */     //   1579: aload_0
/*      */     //   1580: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1583: getfield length : I
/*      */     //   1586: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1589: pop
/*      */     //   1590: goto -> 1597
/*      */     //   1593: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1596: athrow
/*      */     //   1597: aload_0
/*      */     //   1598: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1601: ifnull -> 1657
/*      */     //   1604: aload_1
/*      */     //   1605: aload_0
/*      */     //   1606: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1609: ldc 'AnnotationDefault'
/*      */     //   1611: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1614: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1617: pop
/*      */     //   1618: aload_1
/*      */     //   1619: aload_0
/*      */     //   1620: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1623: getfield length : I
/*      */     //   1626: invokevirtual putInt : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1629: pop
/*      */     //   1630: aload_1
/*      */     //   1631: aload_0
/*      */     //   1632: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1635: getfield data : [B
/*      */     //   1638: iconst_0
/*      */     //   1639: aload_0
/*      */     //   1640: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1643: getfield length : I
/*      */     //   1646: invokevirtual putByteArray : ([BII)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1649: pop
/*      */     //   1650: goto -> 1657
/*      */     //   1653: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1656: athrow
/*      */     //   1657: aload_0
/*      */     //   1658: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1661: ifnull -> 1693
/*      */     //   1664: aload_1
/*      */     //   1665: aload_0
/*      */     //   1666: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1669: ldc 'RuntimeVisibleAnnotations'
/*      */     //   1671: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1674: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1677: pop
/*      */     //   1678: aload_0
/*      */     //   1679: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1682: aload_1
/*      */     //   1683: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1686: goto -> 1693
/*      */     //   1689: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1692: athrow
/*      */     //   1693: aload_0
/*      */     //   1694: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1697: ifnull -> 1729
/*      */     //   1700: aload_1
/*      */     //   1701: aload_0
/*      */     //   1702: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1705: ldc 'RuntimeInvisibleAnnotations'
/*      */     //   1707: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1710: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1713: pop
/*      */     //   1714: aload_0
/*      */     //   1715: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1718: aload_1
/*      */     //   1719: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1722: goto -> 1729
/*      */     //   1725: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1728: athrow
/*      */     //   1729: aload_0
/*      */     //   1730: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1733: ifnull -> 1765
/*      */     //   1736: aload_1
/*      */     //   1737: aload_0
/*      */     //   1738: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1741: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   1743: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1746: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1749: pop
/*      */     //   1750: aload_0
/*      */     //   1751: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1754: aload_1
/*      */     //   1755: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1758: goto -> 1765
/*      */     //   1761: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1764: athrow
/*      */     //   1765: aload_0
/*      */     //   1766: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1769: ifnull -> 1801
/*      */     //   1772: aload_1
/*      */     //   1773: aload_0
/*      */     //   1774: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1777: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   1779: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1782: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1785: pop
/*      */     //   1786: aload_0
/*      */     //   1787: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1790: aload_1
/*      */     //   1791: invokevirtual put : (Lorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1794: goto -> 1801
/*      */     //   1797: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1800: athrow
/*      */     //   1801: aload_0
/*      */     //   1802: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1805: ifnull -> 1841
/*      */     //   1808: aload_1
/*      */     //   1809: aload_0
/*      */     //   1810: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1813: ldc 'RuntimeVisibleParameterAnnotations'
/*      */     //   1815: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1818: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1821: pop
/*      */     //   1822: aload_0
/*      */     //   1823: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1826: aload_0
/*      */     //   1827: getfield synthetics : I
/*      */     //   1830: aload_1
/*      */     //   1831: invokestatic put : ([Lorg/spongepowered/asm/lib/AnnotationWriter;ILorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1834: goto -> 1841
/*      */     //   1837: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1840: athrow
/*      */     //   1841: aload_0
/*      */     //   1842: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1845: ifnull -> 1881
/*      */     //   1848: aload_1
/*      */     //   1849: aload_0
/*      */     //   1850: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1853: ldc 'RuntimeInvisibleParameterAnnotations'
/*      */     //   1855: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   1858: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   1861: pop
/*      */     //   1862: aload_0
/*      */     //   1863: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   1866: aload_0
/*      */     //   1867: getfield synthetics : I
/*      */     //   1870: aload_1
/*      */     //   1871: invokestatic put : ([Lorg/spongepowered/asm/lib/AnnotationWriter;ILorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1874: goto -> 1881
/*      */     //   1877: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1880: athrow
/*      */     //   1881: aload_0
/*      */     //   1882: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1885: ifnull -> 1911
/*      */     //   1888: aload_0
/*      */     //   1889: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   1892: aload_0
/*      */     //   1893: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   1896: aconst_null
/*      */     //   1897: iconst_0
/*      */     //   1898: iconst_m1
/*      */     //   1899: iconst_m1
/*      */     //   1900: aload_1
/*      */     //   1901: invokevirtual put : (Lorg/spongepowered/asm/lib/ClassWriter;[BIIILorg/spongepowered/asm/lib/ByteVector;)V
/*      */     //   1904: goto -> 1911
/*      */     //   1907: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   1910: athrow
/*      */     //   1911: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #348	-> 0
/*      */     //   #645	-> 3
/*      */     //   #93	-> 17
/*      */     //   #959	-> 44
/*      */     //   #667	-> 51
/*      */     //   #466	-> 74
/*      */     //   #186	-> 79
/*      */     //   #880	-> 82
/*      */     //   #568	-> 92
/*      */     //   #583	-> 102
/*      */     //   #1051	-> 109
/*      */     //   #61	-> 119
/*      */     //   #488	-> 130
/*      */     //   #966	-> 169
/*      */     //   #889	-> 179
/*      */     //   #529	-> 189
/*      */     //   #901	-> 199
/*      */     //   #346	-> 206
/*      */     //   #145	-> 216
/*      */     //   #108	-> 223
/*      */     //   #67	-> 233
/*      */     //   #77	-> 240
/*      */     //   #582	-> 250
/*      */     //   #378	-> 257
/*      */     //   #184	-> 267
/*      */     //   #696	-> 274
/*      */     //   #594	-> 284
/*      */     //   #984	-> 291
/*      */     //   #219	-> 301
/*      */     //   #968	-> 308
/*      */     //   #722	-> 318
/*      */     //   #546	-> 325
/*      */     //   #173	-> 335
/*      */     //   #606	-> 342
/*      */     //   #822	-> 352
/*      */     //   #887	-> 359
/*      */     //   #706	-> 371
/*      */     //   #1085	-> 378
/*      */     //   #1039	-> 388
/*      */     //   #913	-> 408
/*      */     //   #768	-> 415
/*      */     //   #229	-> 430
/*      */     //   #126	-> 437
/*      */     //   #735	-> 452
/*      */     //   #147	-> 459
/*      */     //   #358	-> 474
/*      */     //   #963	-> 481
/*      */     //   #192	-> 496
/*      */     //   #662	-> 503
/*      */     //   #635	-> 518
/*      */     //   #1075	-> 525
/*      */     //   #298	-> 540
/*      */     //   #271	-> 547
/*      */     //   #674	-> 585
/*      */     //   #33	-> 604
/*      */     //   #798	-> 620
/*      */     //   #565	-> 650
/*      */     //   #38	-> 659
/*      */     //   #899	-> 666
/*      */     //   #765	-> 672
/*      */     //   #803	-> 677
/*      */     //   #747	-> 708
/*      */     //   #916	-> 720
/*      */     //   #570	-> 730
/*      */     //   #954	-> 733
/*      */     //   #509	-> 740
/*      */     //   #1030	-> 750
/*      */     //   #136	-> 757
/*      */     //   #807	-> 767
/*      */     //   #877	-> 774
/*      */     //   #302	-> 784
/*      */     //   #306	-> 791
/*      */     //   #453	-> 801
/*      */     //   #432	-> 808
/*      */     //   #564	-> 818
/*      */     //   #487	-> 825
/*      */     //   #731	-> 835
/*      */     //   #422	-> 842
/*      */     //   #48	-> 854
/*      */     //   #707	-> 861
/*      */     //   #844	-> 868
/*      */     //   #1023	-> 882
/*      */     //   #772	-> 903
/*      */     //   #401	-> 930
/*      */     //   #454	-> 937
/*      */     //   #472	-> 951
/*      */     //   #285	-> 972
/*      */     //   #991	-> 999
/*      */     //   #47	-> 1006
/*      */     //   #457	-> 1020
/*      */     //   #182	-> 1041
/*      */     //   #1015	-> 1068
/*      */     //   #585	-> 1075
/*      */     //   #516	-> 1108
/*      */     //   #854	-> 1136
/*      */     //   #427	-> 1157
/*      */     //   #566	-> 1177
/*      */     //   #379	-> 1184
/*      */     //   #1018	-> 1198
/*      */     //   #764	-> 1213
/*      */     //   #393	-> 1220
/*      */     //   #153	-> 1234
/*      */     //   #712	-> 1249
/*      */     //   #151	-> 1256
/*      */     //   #902	-> 1297
/*      */     //   #252	-> 1304
/*      */     //   #218	-> 1329
/*      */     //   #430	-> 1338
/*      */     //   #221	-> 1350
/*      */     //   #9	-> 1362
/*      */     //   #316	-> 1372
/*      */     //   #463	-> 1383
/*      */     //   #762	-> 1422
/*      */     //   #448	-> 1447
/*      */     //   #781	-> 1457
/*      */     //   #63	-> 1482
/*      */     //   #812	-> 1489
/*      */     //   #275	-> 1514
/*      */     //   #508	-> 1528
/*      */     //   #57	-> 1535
/*      */     //   #70	-> 1549
/*      */     //   #1055	-> 1570
/*      */     //   #607	-> 1597
/*      */     //   #428	-> 1604
/*      */     //   #567	-> 1618
/*      */     //   #22	-> 1630
/*      */     //   #149	-> 1657
/*      */     //   #878	-> 1664
/*      */     //   #659	-> 1678
/*      */     //   #1049	-> 1693
/*      */     //   #866	-> 1700
/*      */     //   #415	-> 1714
/*      */     //   #256	-> 1729
/*      */     //   #197	-> 1736
/*      */     //   #686	-> 1750
/*      */     //   #1031	-> 1765
/*      */     //   #118	-> 1772
/*      */     //   #103	-> 1786
/*      */     //   #666	-> 1801
/*      */     //   #742	-> 1808
/*      */     //   #339	-> 1822
/*      */     //   #827	-> 1841
/*      */     //   #547	-> 1848
/*      */     //   #973	-> 1862
/*      */     //   #929	-> 1881
/*      */     //   #399	-> 1888
/*      */     //   #776	-> 1911
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   17	75	75	java/lang/IllegalStateException
/*      */     //   82	95	98	java/lang/IllegalStateException
/*      */     //   102	112	115	java/lang/IllegalStateException
/*      */     //   119	145	148	java/lang/IllegalStateException
/*      */     //   130	162	165	java/lang/IllegalStateException
/*      */     //   152	172	175	java/lang/IllegalStateException
/*      */     //   179	192	195	java/lang/IllegalStateException
/*      */     //   199	209	212	java/lang/IllegalStateException
/*      */     //   216	226	229	java/lang/IllegalStateException
/*      */     //   233	243	246	java/lang/IllegalStateException
/*      */     //   250	260	263	java/lang/IllegalStateException
/*      */     //   267	277	280	java/lang/IllegalStateException
/*      */     //   284	294	297	java/lang/IllegalStateException
/*      */     //   301	311	314	java/lang/IllegalStateException
/*      */     //   318	328	331	java/lang/IllegalStateException
/*      */     //   335	345	348	java/lang/IllegalStateException
/*      */     //   733	743	746	java/lang/IllegalStateException
/*      */     //   750	760	763	java/lang/IllegalStateException
/*      */     //   767	777	780	java/lang/IllegalStateException
/*      */     //   784	794	797	java/lang/IllegalStateException
/*      */     //   801	811	814	java/lang/IllegalStateException
/*      */     //   818	828	831	java/lang/IllegalStateException
/*      */     //   854	923	926	java/lang/IllegalStateException
/*      */     //   930	992	995	java/lang/IllegalStateException
/*      */     //   999	1061	1064	java/lang/IllegalStateException
/*      */     //   1068	1090	1093	java/lang/IllegalStateException
/*      */     //   1075	1101	1101	java/lang/IllegalStateException
/*      */     //   1108	1123	1123	java/lang/IllegalStateException
/*      */     //   1177	1206	1209	java/lang/IllegalStateException
/*      */     //   1213	1242	1245	java/lang/IllegalStateException
/*      */     //   1249	1290	1293	java/lang/IllegalStateException
/*      */     //   1341	1368	1368	java/lang/IllegalStateException
/*      */     //   1372	1398	1401	java/lang/IllegalStateException
/*      */     //   1383	1415	1418	java/lang/IllegalStateException
/*      */     //   1405	1440	1443	java/lang/IllegalStateException
/*      */     //   1447	1475	1478	java/lang/IllegalStateException
/*      */     //   1482	1521	1524	java/lang/IllegalStateException
/*      */     //   1528	1590	1593	java/lang/IllegalStateException
/*      */     //   1597	1650	1653	java/lang/IllegalStateException
/*      */     //   1657	1686	1689	java/lang/IllegalStateException
/*      */     //   1693	1722	1725	java/lang/IllegalStateException
/*      */     //   1729	1758	1761	java/lang/IllegalStateException
/*      */     //   1765	1794	1797	java/lang/IllegalStateException
/*      */     //   1801	1834	1837	java/lang/IllegalStateException
/*      */     //   1841	1874	1877	java/lang/IllegalStateException
/*      */     //   1881	1904	1907	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitEnd() {}
/*      */   
/*      */   public void visitAttribute(Attribute paramAttribute) {
/*      */     try {
/*      */       if (paramAttribute.isCodeAttribute()) {
/*      */         paramAttribute.next = this.cattrs;
/*      */         this.cattrs = paramAttribute;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     paramAttribute.next = this.attrs;
/*      */     this.attrs = paramAttribute;
/*      */   }
/*      */   
/*      */   private void noSuccessor() {
/*      */     if (this.compute == 0) {
/*      */       Label label = new Label();
/*      */       label.frame = new Frame();
/*      */       label.frame.owner = label;
/*      */       label.resolve(this, this.code.length, this.code.data);
/*      */       this.previousBlock.successor = label;
/*      */     } 
/*      */     this.currentBlock.outputStackMax = this.maxStackSize;
/*      */     try {
/*      */       if (this.compute != 1)
/*      */         this.currentBlock = null; 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*      */     this.handlerCount++;
/*      */     Handler handler = new Handler();
/*      */     try {
/*      */       handler.start = paramLabel1;
/*      */       handler.end = paramLabel2;
/*      */       handler.handler = paramLabel3;
/*      */       handler.desc = paramString;
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       handler.type = (paramString != null) ? this.cw.newClass(paramString) : 0;
/*      */       if (this.lastHandler == null) {
/*      */         this.firstHandler = handler;
/*      */       } else {
/*      */         this.lastHandler.next = handler;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     this.lastHandler = handler;
/*      */   }
/*      */   
/*      */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_2
/*      */     //   16: aload_3
/*      */     //   17: aload #4
/*      */     //   19: invokevirtual newFieldItem : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/spongepowered/asm/lib/Item;
/*      */     //   22: astore #5
/*      */     //   24: aload_0
/*      */     //   25: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   28: ifnull -> 315
/*      */     //   31: aload_0
/*      */     //   32: getfield compute : I
/*      */     //   35: ifeq -> 60
/*      */     //   38: goto -> 45
/*      */     //   41: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   44: athrow
/*      */     //   45: aload_0
/*      */     //   46: getfield compute : I
/*      */     //   49: iconst_1
/*      */     //   50: if_icmpne -> 85
/*      */     //   53: goto -> 60
/*      */     //   56: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   59: athrow
/*      */     //   60: aload_0
/*      */     //   61: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   64: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   67: iload_1
/*      */     //   68: iconst_0
/*      */     //   69: aload_0
/*      */     //   70: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   73: aload #5
/*      */     //   75: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   78: goto -> 315
/*      */     //   81: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   84: athrow
/*      */     //   85: aload #4
/*      */     //   87: iconst_0
/*      */     //   88: invokevirtual charAt : (I)C
/*      */     //   91: istore #6
/*      */     //   93: iload_1
/*      */     //   94: tableswitch default -> 248, 178 -> 120, 179 -> 167, 180 -> 208
/*      */     //   120: aload_0
/*      */     //   121: getfield stackSize : I
/*      */     //   124: iload #6
/*      */     //   126: bipush #68
/*      */     //   128: if_icmpeq -> 152
/*      */     //   131: goto -> 138
/*      */     //   134: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   137: athrow
/*      */     //   138: iload #6
/*      */     //   140: bipush #74
/*      */     //   142: if_icmpne -> 160
/*      */     //   145: goto -> 152
/*      */     //   148: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   151: athrow
/*      */     //   152: iconst_2
/*      */     //   153: goto -> 161
/*      */     //   156: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   159: athrow
/*      */     //   160: iconst_1
/*      */     //   161: iadd
/*      */     //   162: istore #7
/*      */     //   164: goto -> 287
/*      */     //   167: aload_0
/*      */     //   168: getfield stackSize : I
/*      */     //   171: iload #6
/*      */     //   173: bipush #68
/*      */     //   175: if_icmpeq -> 192
/*      */     //   178: iload #6
/*      */     //   180: bipush #74
/*      */     //   182: if_icmpne -> 201
/*      */     //   185: goto -> 192
/*      */     //   188: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   191: athrow
/*      */     //   192: bipush #-2
/*      */     //   194: goto -> 202
/*      */     //   197: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   200: athrow
/*      */     //   201: iconst_m1
/*      */     //   202: iadd
/*      */     //   203: istore #7
/*      */     //   205: goto -> 287
/*      */     //   208: aload_0
/*      */     //   209: getfield stackSize : I
/*      */     //   212: iload #6
/*      */     //   214: bipush #68
/*      */     //   216: if_icmpeq -> 233
/*      */     //   219: iload #6
/*      */     //   221: bipush #74
/*      */     //   223: if_icmpne -> 241
/*      */     //   226: goto -> 233
/*      */     //   229: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   232: athrow
/*      */     //   233: iconst_1
/*      */     //   234: goto -> 242
/*      */     //   237: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   240: athrow
/*      */     //   241: iconst_0
/*      */     //   242: iadd
/*      */     //   243: istore #7
/*      */     //   245: goto -> 287
/*      */     //   248: aload_0
/*      */     //   249: getfield stackSize : I
/*      */     //   252: iload #6
/*      */     //   254: bipush #68
/*      */     //   256: if_icmpeq -> 273
/*      */     //   259: iload #6
/*      */     //   261: bipush #74
/*      */     //   263: if_icmpne -> 282
/*      */     //   266: goto -> 273
/*      */     //   269: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   272: athrow
/*      */     //   273: bipush #-3
/*      */     //   275: goto -> 284
/*      */     //   278: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   281: athrow
/*      */     //   282: bipush #-2
/*      */     //   284: iadd
/*      */     //   285: istore #7
/*      */     //   287: iload #7
/*      */     //   289: aload_0
/*      */     //   290: getfield maxStackSize : I
/*      */     //   293: if_icmple -> 309
/*      */     //   296: aload_0
/*      */     //   297: iload #7
/*      */     //   299: putfield maxStackSize : I
/*      */     //   302: goto -> 309
/*      */     //   305: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   308: athrow
/*      */     //   309: aload_0
/*      */     //   310: iload #7
/*      */     //   312: putfield stackSize : I
/*      */     //   315: aload_0
/*      */     //   316: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   319: iload_1
/*      */     //   320: aload #5
/*      */     //   322: getfield index : I
/*      */     //   325: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   328: pop
/*      */     //   329: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #375	-> 0
/*      */     //   #204	-> 11
/*      */     //   #169	-> 24
/*      */     //   #434	-> 31
/*      */     //   #892	-> 60
/*      */     //   #951	-> 85
/*      */     //   #1069	-> 93
/*      */     //   #385	-> 120
/*      */     //   #1009	-> 164
/*      */     //   #976	-> 167
/*      */     //   #629	-> 205
/*      */     //   #382	-> 208
/*      */     //   #544	-> 245
/*      */     //   #618	-> 248
/*      */     //   #770	-> 287
/*      */     //   #468	-> 296
/*      */     //   #575	-> 309
/*      */     //   #797	-> 315
/*      */     //   #820	-> 329
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   24	38	41	java/lang/IllegalStateException
/*      */     //   31	53	56	java/lang/IllegalStateException
/*      */     //   45	81	81	java/lang/IllegalStateException
/*      */     //   93	131	134	java/lang/IllegalStateException
/*      */     //   120	145	148	java/lang/IllegalStateException
/*      */     //   138	156	156	java/lang/IllegalStateException
/*      */     //   167	185	188	java/lang/IllegalStateException
/*      */     //   178	197	197	java/lang/IllegalStateException
/*      */     //   208	226	229	java/lang/IllegalStateException
/*      */     //   219	237	237	java/lang/IllegalStateException
/*      */     //   248	266	269	java/lang/IllegalStateException
/*      */     //   259	278	278	java/lang/IllegalStateException
/*      */     //   287	302	305	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   MethodWriter(ClassWriter paramClassWriter, int paramInt1, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString, int paramInt2) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc 327680
/*      */     //   3: invokespecial <init> : (I)V
/*      */     //   6: aload_0
/*      */     //   7: new org/spongepowered/asm/lib/ByteVector
/*      */     //   10: dup
/*      */     //   11: invokespecial <init> : ()V
/*      */     //   14: putfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   17: aload_1
/*      */     //   18: getfield firstMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*      */     //   21: ifnonnull -> 32
/*      */     //   24: aload_1
/*      */     //   25: aload_0
/*      */     //   26: putfield firstMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*      */     //   29: goto -> 40
/*      */     //   32: aload_1
/*      */     //   33: getfield lastMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*      */     //   36: aload_0
/*      */     //   37: putfield mv : Lorg/spongepowered/asm/lib/MethodVisitor;
/*      */     //   40: aload_1
/*      */     //   41: aload_0
/*      */     //   42: putfield lastMethod : Lorg/spongepowered/asm/lib/MethodWriter;
/*      */     //   45: aload_0
/*      */     //   46: aload_1
/*      */     //   47: putfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   50: aload_0
/*      */     //   51: iload_2
/*      */     //   52: putfield access : I
/*      */     //   55: ldc '<init>'
/*      */     //   57: aload_3
/*      */     //   58: invokevirtual equals : (Ljava/lang/Object;)Z
/*      */     //   61: ifeq -> 82
/*      */     //   64: aload_0
/*      */     //   65: dup
/*      */     //   66: getfield access : I
/*      */     //   69: ldc 524288
/*      */     //   71: ior
/*      */     //   72: putfield access : I
/*      */     //   75: goto -> 82
/*      */     //   78: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   81: athrow
/*      */     //   82: aload_0
/*      */     //   83: aload_1
/*      */     //   84: aload_3
/*      */     //   85: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   88: putfield name : I
/*      */     //   91: aload_0
/*      */     //   92: aload_1
/*      */     //   93: aload #4
/*      */     //   95: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   98: putfield desc : I
/*      */     //   101: aload_0
/*      */     //   102: aload #4
/*      */     //   104: putfield descriptor : Ljava/lang/String;
/*      */     //   107: aload_0
/*      */     //   108: aload #5
/*      */     //   110: putfield signature : Ljava/lang/String;
/*      */     //   113: aload #6
/*      */     //   115: ifnull -> 186
/*      */     //   118: aload #6
/*      */     //   120: arraylength
/*      */     //   121: ifle -> 186
/*      */     //   124: goto -> 131
/*      */     //   127: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   130: athrow
/*      */     //   131: aload_0
/*      */     //   132: aload #6
/*      */     //   134: arraylength
/*      */     //   135: putfield exceptionCount : I
/*      */     //   138: aload_0
/*      */     //   139: aload_0
/*      */     //   140: getfield exceptionCount : I
/*      */     //   143: newarray int
/*      */     //   145: putfield exceptions : [I
/*      */     //   148: iconst_0
/*      */     //   149: istore #8
/*      */     //   151: iload #8
/*      */     //   153: aload_0
/*      */     //   154: getfield exceptionCount : I
/*      */     //   157: if_icmpge -> 186
/*      */     //   160: aload_0
/*      */     //   161: getfield exceptions : [I
/*      */     //   164: iload #8
/*      */     //   166: aload_1
/*      */     //   167: aload #6
/*      */     //   169: iload #8
/*      */     //   171: aaload
/*      */     //   172: invokevirtual newClass : (Ljava/lang/String;)I
/*      */     //   175: iastore
/*      */     //   176: iinc #8, 1
/*      */     //   179: goto -> 151
/*      */     //   182: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   185: athrow
/*      */     //   186: aload_0
/*      */     //   187: iload #7
/*      */     //   189: putfield compute : I
/*      */     //   192: iload #7
/*      */     //   194: iconst_3
/*      */     //   195: if_icmpeq -> 271
/*      */     //   198: aload_0
/*      */     //   199: getfield descriptor : Ljava/lang/String;
/*      */     //   202: invokestatic getArgumentsAndReturnSizes : (Ljava/lang/String;)I
/*      */     //   205: iconst_2
/*      */     //   206: ishr
/*      */     //   207: istore #8
/*      */     //   209: iload_2
/*      */     //   210: bipush #8
/*      */     //   212: iand
/*      */     //   213: ifeq -> 226
/*      */     //   216: iinc #8, -1
/*      */     //   219: goto -> 226
/*      */     //   222: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   225: athrow
/*      */     //   226: aload_0
/*      */     //   227: iload #8
/*      */     //   229: putfield maxLocals : I
/*      */     //   232: aload_0
/*      */     //   233: iload #8
/*      */     //   235: putfield currentLocals : I
/*      */     //   238: aload_0
/*      */     //   239: new org/spongepowered/asm/lib/Label
/*      */     //   242: dup
/*      */     //   243: invokespecial <init> : ()V
/*      */     //   246: putfield labels : Lorg/spongepowered/asm/lib/Label;
/*      */     //   249: aload_0
/*      */     //   250: getfield labels : Lorg/spongepowered/asm/lib/Label;
/*      */     //   253: dup
/*      */     //   254: getfield status : I
/*      */     //   257: bipush #8
/*      */     //   259: ior
/*      */     //   260: putfield status : I
/*      */     //   263: aload_0
/*      */     //   264: aload_0
/*      */     //   265: getfield labels : Lorg/spongepowered/asm/lib/Label;
/*      */     //   268: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   271: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #412	-> 0
/*      */     //   #1045	-> 6
/*      */     //   #1067	-> 17
/*      */     //   #442	-> 24
/*      */     //   #534	-> 32
/*      */     //   #263	-> 40
/*      */     //   #1050	-> 45
/*      */     //   #512	-> 50
/*      */     //   #60	-> 55
/*      */     //   #279	-> 64
/*      */     //   #389	-> 82
/*      */     //   #587	-> 91
/*      */     //   #437	-> 101
/*      */     //   #802	-> 107
/*      */     //   #352	-> 113
/*      */     //   #98	-> 131
/*      */     //   #50	-> 138
/*      */     //   #736	-> 148
/*      */     //   #825	-> 160
/*      */     //   #535	-> 176
/*      */     //   #845	-> 186
/*      */     //   #284	-> 192
/*      */     //   #804	-> 198
/*      */     //   #18	-> 209
/*      */     //   #685	-> 216
/*      */     //   #562	-> 226
/*      */     //   #816	-> 232
/*      */     //   #238	-> 238
/*      */     //   #37	-> 249
/*      */     //   #920	-> 263
/*      */     //   #646	-> 271
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   40	75	78	java/lang/IllegalStateException
/*      */     //   82	124	127	java/lang/IllegalStateException
/*      */     //   151	182	182	java/lang/IllegalStateException
/*      */     //   209	219	222	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     byteVector.putByte(paramInt >>> 24).putShort(paramArrayOfLabel1.length);
/*      */     int i = 0;
/*      */     try {
/*      */       for (; i < paramArrayOfLabel1.length; byteVector.putShort((paramArrayOfLabel1[i]).position).putShort((paramArrayOfLabel2[i]).position - (paramArrayOfLabel1[i]).position).putShort(paramArrayOfint[i]), i++);
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       if (paramTypePath == null) {
/*      */         byteVector.putByte(0);
/*      */       } else {
/*      */         i = paramTypePath.b[paramTypePath.offset] * 2 + 1;
/*      */         byteVector.putByteArray(paramTypePath.b, paramTypePath.offset, i);
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, byteVector.length - 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         annotationWriter.next = this.ctanns;
/*      */         this.ctanns = annotationWriter;
/*      */       } else {
/*      */         annotationWriter.next = this.ictanns;
/*      */         this.ictanns = annotationWriter;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   private int startFrame(int paramInt1, int paramInt2, int paramInt3) {
/*      */     // Byte code:
/*      */     //   0: iconst_3
/*      */     //   1: iload_2
/*      */     //   2: iadd
/*      */     //   3: iload_3
/*      */     //   4: iadd
/*      */     //   5: istore #4
/*      */     //   7: aload_0
/*      */     //   8: getfield frame : [I
/*      */     //   11: ifnull -> 31
/*      */     //   14: aload_0
/*      */     //   15: getfield frame : [I
/*      */     //   18: arraylength
/*      */     //   19: iload #4
/*      */     //   21: if_icmpge -> 46
/*      */     //   24: goto -> 31
/*      */     //   27: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   30: athrow
/*      */     //   31: aload_0
/*      */     //   32: iload #4
/*      */     //   34: newarray int
/*      */     //   36: putfield frame : [I
/*      */     //   39: goto -> 46
/*      */     //   42: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   45: athrow
/*      */     //   46: aload_0
/*      */     //   47: getfield frame : [I
/*      */     //   50: iconst_0
/*      */     //   51: iload_1
/*      */     //   52: iastore
/*      */     //   53: aload_0
/*      */     //   54: getfield frame : [I
/*      */     //   57: iconst_1
/*      */     //   58: iload_2
/*      */     //   59: iastore
/*      */     //   60: aload_0
/*      */     //   61: getfield frame : [I
/*      */     //   64: iconst_2
/*      */     //   65: iload_3
/*      */     //   66: iastore
/*      */     //   67: iconst_3
/*      */     //   68: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #424	-> 0
/*      */     //   #27	-> 7
/*      */     //   #1038	-> 31
/*      */     //   #405	-> 46
/*      */     //   #130	-> 53
/*      */     //   #7	-> 60
/*      */     //   #199	-> 67
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   7	24	27	java/lang/IllegalStateException
/*      */     //   14	39	42	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitAnnotationDefault() {
/*      */     this.annd = new ByteVector();
/*      */     return new AnnotationWriter(this.cw, false, this.annd, null, 0);
/*      */   }
/*      */   
/*      */   private void visitFrame(Frame paramFrame) {
/*      */     // Byte code:
/*      */     //   0: iconst_0
/*      */     //   1: istore_2
/*      */     //   2: iconst_0
/*      */     //   3: istore_3
/*      */     //   4: iconst_0
/*      */     //   5: istore #4
/*      */     //   7: aload_1
/*      */     //   8: getfield inputLocals : [I
/*      */     //   11: astore #5
/*      */     //   13: aload_1
/*      */     //   14: getfield inputStack : [I
/*      */     //   17: astore #6
/*      */     //   19: iconst_0
/*      */     //   20: istore #7
/*      */     //   22: iload #7
/*      */     //   24: aload #5
/*      */     //   26: arraylength
/*      */     //   27: if_icmpge -> 99
/*      */     //   30: aload #5
/*      */     //   32: iload #7
/*      */     //   34: iaload
/*      */     //   35: istore #8
/*      */     //   37: iload #8
/*      */     //   39: ldc 16777216
/*      */     //   41: if_icmpne -> 54
/*      */     //   44: iinc #2, 1
/*      */     //   47: goto -> 62
/*      */     //   50: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   53: athrow
/*      */     //   54: iload_3
/*      */     //   55: iload_2
/*      */     //   56: iconst_1
/*      */     //   57: iadd
/*      */     //   58: iadd
/*      */     //   59: istore_3
/*      */     //   60: iconst_0
/*      */     //   61: istore_2
/*      */     //   62: iload #8
/*      */     //   64: ldc 16777220
/*      */     //   66: if_icmpeq -> 83
/*      */     //   69: iload #8
/*      */     //   71: ldc 16777219
/*      */     //   73: if_icmpne -> 93
/*      */     //   76: goto -> 83
/*      */     //   79: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   82: athrow
/*      */     //   83: iinc #7, 1
/*      */     //   86: goto -> 93
/*      */     //   89: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   92: athrow
/*      */     //   93: iinc #7, 1
/*      */     //   96: goto -> 22
/*      */     //   99: iconst_0
/*      */     //   100: istore #7
/*      */     //   102: iload #7
/*      */     //   104: aload #6
/*      */     //   106: arraylength
/*      */     //   107: if_icmpge -> 157
/*      */     //   110: aload #6
/*      */     //   112: iload #7
/*      */     //   114: iaload
/*      */     //   115: istore #8
/*      */     //   117: iinc #4, 1
/*      */     //   120: iload #8
/*      */     //   122: ldc 16777220
/*      */     //   124: if_icmpeq -> 141
/*      */     //   127: iload #8
/*      */     //   129: ldc 16777219
/*      */     //   131: if_icmpne -> 151
/*      */     //   134: goto -> 141
/*      */     //   137: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   140: athrow
/*      */     //   141: iinc #7, 1
/*      */     //   144: goto -> 151
/*      */     //   147: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   150: athrow
/*      */     //   151: iinc #7, 1
/*      */     //   154: goto -> 102
/*      */     //   157: aload_0
/*      */     //   158: aload_1
/*      */     //   159: getfield owner : Lorg/spongepowered/asm/lib/Label;
/*      */     //   162: getfield position : I
/*      */     //   165: iload_3
/*      */     //   166: iload #4
/*      */     //   168: invokespecial startFrame : (III)I
/*      */     //   171: istore #9
/*      */     //   173: iconst_0
/*      */     //   174: istore #7
/*      */     //   176: iload_3
/*      */     //   177: ifle -> 239
/*      */     //   180: aload #5
/*      */     //   182: iload #7
/*      */     //   184: iaload
/*      */     //   185: istore #8
/*      */     //   187: aload_0
/*      */     //   188: getfield frame : [I
/*      */     //   191: iload #9
/*      */     //   193: iinc #9, 1
/*      */     //   196: iload #8
/*      */     //   198: iastore
/*      */     //   199: iload #8
/*      */     //   201: ldc 16777220
/*      */     //   203: if_icmpeq -> 220
/*      */     //   206: iload #8
/*      */     //   208: ldc 16777219
/*      */     //   210: if_icmpne -> 230
/*      */     //   213: goto -> 220
/*      */     //   216: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   219: athrow
/*      */     //   220: iinc #7, 1
/*      */     //   223: goto -> 230
/*      */     //   226: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   229: athrow
/*      */     //   230: iinc #7, 1
/*      */     //   233: iinc #3, -1
/*      */     //   236: goto -> 176
/*      */     //   239: iconst_0
/*      */     //   240: istore #7
/*      */     //   242: iload #7
/*      */     //   244: aload #6
/*      */     //   246: arraylength
/*      */     //   247: if_icmpge -> 306
/*      */     //   250: aload #6
/*      */     //   252: iload #7
/*      */     //   254: iaload
/*      */     //   255: istore #8
/*      */     //   257: aload_0
/*      */     //   258: getfield frame : [I
/*      */     //   261: iload #9
/*      */     //   263: iinc #9, 1
/*      */     //   266: iload #8
/*      */     //   268: iastore
/*      */     //   269: iload #8
/*      */     //   271: ldc 16777220
/*      */     //   273: if_icmpeq -> 290
/*      */     //   276: iload #8
/*      */     //   278: ldc 16777219
/*      */     //   280: if_icmpne -> 300
/*      */     //   283: goto -> 290
/*      */     //   286: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   289: athrow
/*      */     //   290: iinc #7, 1
/*      */     //   293: goto -> 300
/*      */     //   296: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   299: athrow
/*      */     //   300: iinc #7, 1
/*      */     //   303: goto -> 242
/*      */     //   306: aload_0
/*      */     //   307: invokespecial endFrame : ()V
/*      */     //   310: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #482	-> 0
/*      */     //   #241	-> 2
/*      */     //   #2	-> 4
/*      */     //   #138	-> 7
/*      */     //   #391	-> 13
/*      */     //   #5	-> 19
/*      */     //   #369	-> 30
/*      */     //   #553	-> 37
/*      */     //   #910	-> 44
/*      */     //   #572	-> 54
/*      */     //   #622	-> 60
/*      */     //   #581	-> 62
/*      */     //   #931	-> 83
/*      */     //   #545	-> 93
/*      */     //   #449	-> 99
/*      */     //   #353	-> 110
/*      */     //   #1008	-> 117
/*      */     //   #159	-> 120
/*      */     //   #900	-> 141
/*      */     //   #397	-> 151
/*      */     //   #304	-> 157
/*      */     //   #95	-> 173
/*      */     //   #524	-> 180
/*      */     //   #24	-> 187
/*      */     //   #651	-> 199
/*      */     //   #476	-> 220
/*      */     //   #335	-> 230
/*      */     //   #1081	-> 239
/*      */     //   #790	-> 250
/*      */     //   #137	-> 257
/*      */     //   #1059	-> 269
/*      */     //   #1047	-> 290
/*      */     //   #90	-> 300
/*      */     //   #571	-> 306
/*      */     //   #311	-> 310
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   37	50	50	java/lang/IllegalStateException
/*      */     //   62	76	79	java/lang/IllegalStateException
/*      */     //   69	86	89	java/lang/IllegalStateException
/*      */     //   117	134	137	java/lang/IllegalStateException
/*      */     //   127	144	147	java/lang/IllegalStateException
/*      */     //   187	213	216	java/lang/IllegalStateException
/*      */     //   206	223	226	java/lang/IllegalStateException
/*      */     //   257	283	286	java/lang/IllegalStateException
/*      */     //   276	293	296	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitMultiANewArrayInsn(String paramString, int paramInt) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_1
/*      */     //   16: invokevirtual newClassItem : (Ljava/lang/String;)Lorg/spongepowered/asm/lib/Item;
/*      */     //   19: astore_3
/*      */     //   20: aload_0
/*      */     //   21: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   24: ifnull -> 94
/*      */     //   27: aload_0
/*      */     //   28: getfield compute : I
/*      */     //   31: ifeq -> 56
/*      */     //   34: goto -> 41
/*      */     //   37: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   40: athrow
/*      */     //   41: aload_0
/*      */     //   42: getfield compute : I
/*      */     //   45: iconst_1
/*      */     //   46: if_icmpne -> 82
/*      */     //   49: goto -> 56
/*      */     //   52: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   55: athrow
/*      */     //   56: aload_0
/*      */     //   57: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   60: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   63: sipush #197
/*      */     //   66: iload_2
/*      */     //   67: aload_0
/*      */     //   68: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   71: aload_3
/*      */     //   72: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   75: goto -> 94
/*      */     //   78: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   81: athrow
/*      */     //   82: aload_0
/*      */     //   83: dup
/*      */     //   84: getfield stackSize : I
/*      */     //   87: iconst_1
/*      */     //   88: iload_2
/*      */     //   89: isub
/*      */     //   90: iadd
/*      */     //   91: putfield stackSize : I
/*      */     //   94: aload_0
/*      */     //   95: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   98: sipush #197
/*      */     //   101: aload_3
/*      */     //   102: getfield index : I
/*      */     //   105: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   108: iload_2
/*      */     //   109: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   112: pop
/*      */     //   113: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #513	-> 0
/*      */     //   #644	-> 11
/*      */     //   #139	-> 20
/*      */     //   #573	-> 27
/*      */     //   #222	-> 56
/*      */     //   #185	-> 82
/*      */     //   #455	-> 94
/*      */     //   #717	-> 113
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   20	34	37	java/lang/IllegalStateException
/*      */     //   27	49	52	java/lang/IllegalStateException
/*      */     //   41	78	78	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
/*      */     this.lastCodeOffset = this.code.length;
/*      */     int i = this.code.length;
/*      */     this.code.putByte(171);
/*      */     this.code.putByteArray(null, 0, (4 - this.code.length % 4) % 4);
/*      */     paramLabel.put(this, this.code, i, true);
/*      */     this.code.putInt(paramArrayOfLabel.length);
/*      */     byte b = 0;
/*      */     try {
/*      */       for (; b < paramArrayOfLabel.length; b++) {
/*      */         this.code.putInt(paramArrayOfint[b]);
/*      */         paramArrayOfLabel[b].put(this, this.code, i, true);
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     visitSwitchInsn(paramLabel, paramArrayOfLabel);
/*      */   }
/*      */   
/*      */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_1
/*      */     //   16: aload_2
/*      */     //   17: aload_3
/*      */     //   18: aload #4
/*      */     //   20: invokevirtual newInvokeDynamicItem : (Ljava/lang/String;Ljava/lang/String;Lorg/spongepowered/asm/lib/Handle;[Ljava/lang/Object;)Lorg/spongepowered/asm/lib/Item;
/*      */     //   23: astore #5
/*      */     //   25: aload #5
/*      */     //   27: getfield intVal : I
/*      */     //   30: istore #6
/*      */     //   32: aload_0
/*      */     //   33: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   36: ifnull -> 159
/*      */     //   39: aload_0
/*      */     //   40: getfield compute : I
/*      */     //   43: ifeq -> 68
/*      */     //   46: goto -> 53
/*      */     //   49: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   52: athrow
/*      */     //   53: aload_0
/*      */     //   54: getfield compute : I
/*      */     //   57: iconst_1
/*      */     //   58: if_icmpne -> 95
/*      */     //   61: goto -> 68
/*      */     //   64: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   67: athrow
/*      */     //   68: aload_0
/*      */     //   69: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   72: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   75: sipush #186
/*      */     //   78: iconst_0
/*      */     //   79: aload_0
/*      */     //   80: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   83: aload #5
/*      */     //   85: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   88: goto -> 159
/*      */     //   91: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   94: athrow
/*      */     //   95: iload #6
/*      */     //   97: ifne -> 113
/*      */     //   100: aload_2
/*      */     //   101: invokestatic getArgumentsAndReturnSizes : (Ljava/lang/String;)I
/*      */     //   104: istore #6
/*      */     //   106: aload #5
/*      */     //   108: iload #6
/*      */     //   110: putfield intVal : I
/*      */     //   113: aload_0
/*      */     //   114: getfield stackSize : I
/*      */     //   117: iload #6
/*      */     //   119: iconst_2
/*      */     //   120: ishr
/*      */     //   121: isub
/*      */     //   122: iload #6
/*      */     //   124: iconst_3
/*      */     //   125: iand
/*      */     //   126: iadd
/*      */     //   127: iconst_1
/*      */     //   128: iadd
/*      */     //   129: istore #7
/*      */     //   131: iload #7
/*      */     //   133: aload_0
/*      */     //   134: getfield maxStackSize : I
/*      */     //   137: if_icmple -> 153
/*      */     //   140: aload_0
/*      */     //   141: iload #7
/*      */     //   143: putfield maxStackSize : I
/*      */     //   146: goto -> 153
/*      */     //   149: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   152: athrow
/*      */     //   153: aload_0
/*      */     //   154: iload #7
/*      */     //   156: putfield stackSize : I
/*      */     //   159: aload_0
/*      */     //   160: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   163: sipush #186
/*      */     //   166: aload #5
/*      */     //   168: getfield index : I
/*      */     //   171: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   174: pop
/*      */     //   175: aload_0
/*      */     //   176: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   179: iconst_0
/*      */     //   180: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   183: pop
/*      */     //   184: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #543	-> 0
/*      */     //   #1017	-> 11
/*      */     //   #262	-> 25
/*      */     //   #150	-> 32
/*      */     //   #871	-> 39
/*      */     //   #207	-> 68
/*      */     //   #755	-> 95
/*      */     //   #23	-> 100
/*      */     //   #950	-> 106
/*      */     //   #698	-> 113
/*      */     //   #668	-> 131
/*      */     //   #144	-> 140
/*      */     //   #1037	-> 153
/*      */     //   #54	-> 159
/*      */     //   #287	-> 175
/*      */     //   #504	-> 184
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   32	46	49	java/lang/IllegalStateException
/*      */     //   39	61	64	java/lang/IllegalStateException
/*      */     //   53	91	91	java/lang/IllegalStateException
/*      */     //   131	146	149	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   private void visitSwitchInsn(Label paramLabel, Label[] paramArrayOfLabel) {
/*      */     try {
/*      */       if (this.currentBlock != null) {
/*      */         if (this.compute == 0) {
/*      */           this.currentBlock.frame.execute(171, 0, null, null);
/*      */           addSuccessor(0, paramLabel);
/*      */           (paramLabel.getFirst()).status |= 0x10;
/*      */           boolean bool1 = false;
/*      */         } 
/*      */         this.stackSize--;
/*      */         addSuccessor(this.stackSize, paramLabel);
/*      */         boolean bool = false;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
/*      */     this.lastCodeOffset = this.code.length;
/*      */     int i = this.code.length;
/*      */     this.code.putByte(170);
/*      */     this.code.putByteArray(null, 0, (4 - this.code.length % 4) % 4);
/*      */     paramLabel.put(this, this.code, i, true);
/*      */     this.code.putInt(paramInt1).putInt(paramInt2);
/*      */     byte b = 0;
/*      */     try {
/*      */       while (b < paramVarArgs.length) {
/*      */         paramVarArgs[b].put(this, this.code, i, true);
/*      */         b++;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     visitSwitchInsn(paramLabel, paramVarArgs);
/*      */   }
/*      */   
/*      */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*      */     try {
/*      */       if (this.lineNumber == null)
/*      */         this.lineNumber = new ByteVector(); 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     this.lineNumberCount++;
/*      */     this.lineNumber.putShort(paramLabel.position);
/*      */     this.lineNumber.putShort(paramInt);
/*      */   }
/*      */   
/*      */   private void writeFrameType(Object paramObject) {
/*      */     try {
/*      */       if (paramObject instanceof String) {
/*      */         this.stackMap.putByte(7).putShort(this.cw.newClass((String)paramObject));
/*      */       } else {
/*      */         try {
/*      */           if (paramObject instanceof Integer) {
/*      */             this.stackMap.putByte(((Integer)paramObject).intValue());
/*      */           } else {
/*      */             this.stackMap.putByte(8).putShort(((Label)paramObject).position);
/*      */           } 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void visitLdcInsn(Object paramObject) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_1
/*      */     //   16: invokevirtual newConstItem : (Ljava/lang/Object;)Lorg/spongepowered/asm/lib/Item;
/*      */     //   19: astore_2
/*      */     //   20: aload_0
/*      */     //   21: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   24: ifnull -> 147
/*      */     //   27: aload_0
/*      */     //   28: getfield compute : I
/*      */     //   31: ifeq -> 56
/*      */     //   34: goto -> 41
/*      */     //   37: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   40: athrow
/*      */     //   41: aload_0
/*      */     //   42: getfield compute : I
/*      */     //   45: iconst_1
/*      */     //   46: if_icmpne -> 81
/*      */     //   49: goto -> 56
/*      */     //   52: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   55: athrow
/*      */     //   56: aload_0
/*      */     //   57: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   60: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   63: bipush #18
/*      */     //   65: iconst_0
/*      */     //   66: aload_0
/*      */     //   67: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   70: aload_2
/*      */     //   71: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   74: goto -> 147
/*      */     //   77: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   80: athrow
/*      */     //   81: aload_2
/*      */     //   82: getfield type : I
/*      */     //   85: iconst_5
/*      */     //   86: if_icmpeq -> 105
/*      */     //   89: aload_2
/*      */     //   90: getfield type : I
/*      */     //   93: bipush #6
/*      */     //   95: if_icmpne -> 115
/*      */     //   98: goto -> 105
/*      */     //   101: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   104: athrow
/*      */     //   105: aload_0
/*      */     //   106: getfield stackSize : I
/*      */     //   109: iconst_2
/*      */     //   110: iadd
/*      */     //   111: istore_3
/*      */     //   112: goto -> 122
/*      */     //   115: aload_0
/*      */     //   116: getfield stackSize : I
/*      */     //   119: iconst_1
/*      */     //   120: iadd
/*      */     //   121: istore_3
/*      */     //   122: iload_3
/*      */     //   123: aload_0
/*      */     //   124: getfield maxStackSize : I
/*      */     //   127: if_icmple -> 142
/*      */     //   130: aload_0
/*      */     //   131: iload_3
/*      */     //   132: putfield maxStackSize : I
/*      */     //   135: goto -> 142
/*      */     //   138: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   141: athrow
/*      */     //   142: aload_0
/*      */     //   143: iload_3
/*      */     //   144: putfield stackSize : I
/*      */     //   147: aload_2
/*      */     //   148: getfield index : I
/*      */     //   151: istore_3
/*      */     //   152: aload_2
/*      */     //   153: getfield type : I
/*      */     //   156: iconst_5
/*      */     //   157: if_icmpeq -> 176
/*      */     //   160: aload_2
/*      */     //   161: getfield type : I
/*      */     //   164: bipush #6
/*      */     //   166: if_icmpne -> 194
/*      */     //   169: goto -> 176
/*      */     //   172: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   175: athrow
/*      */     //   176: aload_0
/*      */     //   177: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   180: bipush #20
/*      */     //   182: iload_3
/*      */     //   183: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   186: pop
/*      */     //   187: goto -> 230
/*      */     //   190: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   193: athrow
/*      */     //   194: iload_3
/*      */     //   195: sipush #256
/*      */     //   198: if_icmplt -> 219
/*      */     //   201: aload_0
/*      */     //   202: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   205: bipush #19
/*      */     //   207: iload_3
/*      */     //   208: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   211: pop
/*      */     //   212: goto -> 230
/*      */     //   215: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   218: athrow
/*      */     //   219: aload_0
/*      */     //   220: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   223: bipush #18
/*      */     //   225: iload_3
/*      */     //   226: invokevirtual put11 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   229: pop
/*      */     //   230: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #671	-> 0
/*      */     //   #395	-> 11
/*      */     //   #116	-> 20
/*      */     //   #413	-> 27
/*      */     //   #68	-> 56
/*      */     //   #990	-> 81
/*      */     //   #697	-> 105
/*      */     //   #341	-> 115
/*      */     //   #402	-> 122
/*      */     //   #665	-> 130
/*      */     //   #852	-> 142
/*      */     //   #941	-> 147
/*      */     //   #180	-> 152
/*      */     //   #967	-> 176
/*      */     //   #326	-> 194
/*      */     //   #183	-> 201
/*      */     //   #171	-> 219
/*      */     //   #189	-> 230
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   20	34	37	java/lang/IllegalStateException
/*      */     //   27	49	52	java/lang/IllegalStateException
/*      */     //   41	77	77	java/lang/IllegalStateException
/*      */     //   81	98	101	java/lang/IllegalStateException
/*      */     //   122	135	138	java/lang/IllegalStateException
/*      */     //   152	169	172	java/lang/IllegalStateException
/*      */     //   160	190	190	java/lang/IllegalStateException
/*      */     //   194	215	215	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     AnnotationWriter.putTarget(paramInt, paramTypePath, byteVector);
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, byteVector.length - 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         annotationWriter.next = this.ctanns;
/*      */         this.ctanns = annotationWriter;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     annotationWriter.next = this.ictanns;
/*      */     this.ictanns = annotationWriter;
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   public void visitLabel(Label paramLabel) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   4: dup
/*      */     //   5: getfield hasAsmInsns : Z
/*      */     //   8: aload_1
/*      */     //   9: aload_0
/*      */     //   10: aload_0
/*      */     //   11: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   14: getfield length : I
/*      */     //   17: aload_0
/*      */     //   18: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   21: getfield data : [B
/*      */     //   24: invokevirtual resolve : (Lorg/spongepowered/asm/lib/MethodWriter;I[B)Z
/*      */     //   27: ior
/*      */     //   28: putfield hasAsmInsns : Z
/*      */     //   31: aload_1
/*      */     //   32: getfield status : I
/*      */     //   35: iconst_1
/*      */     //   36: iand
/*      */     //   37: ifeq -> 45
/*      */     //   40: return
/*      */     //   41: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   44: athrow
/*      */     //   45: aload_0
/*      */     //   46: getfield compute : I
/*      */     //   49: ifne -> 253
/*      */     //   52: aload_0
/*      */     //   53: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   56: ifnull -> 128
/*      */     //   59: goto -> 66
/*      */     //   62: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   65: athrow
/*      */     //   66: aload_1
/*      */     //   67: getfield position : I
/*      */     //   70: aload_0
/*      */     //   71: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   74: getfield position : I
/*      */     //   77: if_icmpne -> 122
/*      */     //   80: goto -> 87
/*      */     //   83: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   86: athrow
/*      */     //   87: aload_0
/*      */     //   88: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   91: dup
/*      */     //   92: getfield status : I
/*      */     //   95: aload_1
/*      */     //   96: getfield status : I
/*      */     //   99: bipush #16
/*      */     //   101: iand
/*      */     //   102: ior
/*      */     //   103: putfield status : I
/*      */     //   106: aload_1
/*      */     //   107: aload_0
/*      */     //   108: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   111: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   114: putfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   117: return
/*      */     //   118: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   121: athrow
/*      */     //   122: aload_0
/*      */     //   123: iconst_0
/*      */     //   124: aload_1
/*      */     //   125: invokespecial addSuccessor : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   128: aload_0
/*      */     //   129: aload_1
/*      */     //   130: putfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   133: aload_1
/*      */     //   134: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   137: ifnonnull -> 166
/*      */     //   140: aload_1
/*      */     //   141: new org/spongepowered/asm/lib/Frame
/*      */     //   144: dup
/*      */     //   145: invokespecial <init> : ()V
/*      */     //   148: putfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   151: aload_1
/*      */     //   152: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   155: aload_1
/*      */     //   156: putfield owner : Lorg/spongepowered/asm/lib/Label;
/*      */     //   159: goto -> 166
/*      */     //   162: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   165: athrow
/*      */     //   166: aload_0
/*      */     //   167: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   170: ifnull -> 245
/*      */     //   173: aload_1
/*      */     //   174: getfield position : I
/*      */     //   177: aload_0
/*      */     //   178: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   181: getfield position : I
/*      */     //   184: if_icmpne -> 237
/*      */     //   187: goto -> 194
/*      */     //   190: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   193: athrow
/*      */     //   194: aload_0
/*      */     //   195: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   198: dup
/*      */     //   199: getfield status : I
/*      */     //   202: aload_1
/*      */     //   203: getfield status : I
/*      */     //   206: bipush #16
/*      */     //   208: iand
/*      */     //   209: ior
/*      */     //   210: putfield status : I
/*      */     //   213: aload_1
/*      */     //   214: aload_0
/*      */     //   215: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   218: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   221: putfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   224: aload_0
/*      */     //   225: aload_0
/*      */     //   226: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   229: putfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   232: return
/*      */     //   233: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   236: athrow
/*      */     //   237: aload_0
/*      */     //   238: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   241: aload_1
/*      */     //   242: putfield successor : Lorg/spongepowered/asm/lib/Label;
/*      */     //   245: aload_0
/*      */     //   246: aload_1
/*      */     //   247: putfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   250: goto -> 392
/*      */     //   253: aload_0
/*      */     //   254: getfield compute : I
/*      */     //   257: iconst_1
/*      */     //   258: if_icmpne -> 301
/*      */     //   261: aload_0
/*      */     //   262: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   265: ifnonnull -> 287
/*      */     //   268: goto -> 275
/*      */     //   271: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   274: athrow
/*      */     //   275: aload_0
/*      */     //   276: aload_1
/*      */     //   277: putfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   280: goto -> 392
/*      */     //   283: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   286: athrow
/*      */     //   287: aload_0
/*      */     //   288: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   291: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   294: aload_1
/*      */     //   295: putfield owner : Lorg/spongepowered/asm/lib/Label;
/*      */     //   298: goto -> 392
/*      */     //   301: aload_0
/*      */     //   302: getfield compute : I
/*      */     //   305: iconst_2
/*      */     //   306: if_icmpne -> 392
/*      */     //   309: aload_0
/*      */     //   310: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   313: ifnull -> 350
/*      */     //   316: goto -> 323
/*      */     //   319: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   322: athrow
/*      */     //   323: aload_0
/*      */     //   324: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   327: aload_0
/*      */     //   328: getfield maxStackSize : I
/*      */     //   331: putfield outputStackMax : I
/*      */     //   334: aload_0
/*      */     //   335: aload_0
/*      */     //   336: getfield stackSize : I
/*      */     //   339: aload_1
/*      */     //   340: invokespecial addSuccessor : (ILorg/spongepowered/asm/lib/Label;)V
/*      */     //   343: goto -> 350
/*      */     //   346: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   349: athrow
/*      */     //   350: aload_0
/*      */     //   351: aload_1
/*      */     //   352: putfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   355: aload_0
/*      */     //   356: iconst_0
/*      */     //   357: putfield stackSize : I
/*      */     //   360: aload_0
/*      */     //   361: iconst_0
/*      */     //   362: putfield maxStackSize : I
/*      */     //   365: aload_0
/*      */     //   366: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   369: ifnull -> 387
/*      */     //   372: aload_0
/*      */     //   373: getfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   376: aload_1
/*      */     //   377: putfield successor : Lorg/spongepowered/asm/lib/Label;
/*      */     //   380: goto -> 387
/*      */     //   383: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   386: athrow
/*      */     //   387: aload_0
/*      */     //   388: aload_1
/*      */     //   389: putfield previousBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   392: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #713	-> 0
/*      */     //   #45	-> 31
/*      */     //   #1052	-> 40
/*      */     //   #1025	-> 45
/*      */     //   #602	-> 52
/*      */     //   #855	-> 66
/*      */     //   #236	-> 87
/*      */     //   #39	-> 106
/*      */     //   #347	-> 117
/*      */     //   #740	-> 122
/*      */     //   #921	-> 128
/*      */     //   #162	-> 133
/*      */     //   #227	-> 140
/*      */     //   #464	-> 151
/*      */     //   #34	-> 166
/*      */     //   #333	-> 173
/*      */     //   #447	-> 194
/*      */     //   #664	-> 213
/*      */     //   #286	-> 224
/*      */     //   #691	-> 232
/*      */     //   #264	-> 237
/*      */     //   #1060	-> 245
/*      */     //   #603	-> 253
/*      */     //   #327	-> 261
/*      */     //   #187	-> 275
/*      */     //   #595	-> 287
/*      */     //   #677	-> 301
/*      */     //   #794	-> 309
/*      */     //   #215	-> 323
/*      */     //   #161	-> 334
/*      */     //   #775	-> 350
/*      */     //   #625	-> 355
/*      */     //   #725	-> 360
/*      */     //   #355	-> 365
/*      */     //   #319	-> 372
/*      */     //   #361	-> 387
/*      */     //   #710	-> 392
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	41	41	java/lang/IllegalStateException
/*      */     //   45	59	62	java/lang/IllegalStateException
/*      */     //   52	80	83	java/lang/IllegalStateException
/*      */     //   66	118	118	java/lang/IllegalStateException
/*      */     //   128	159	162	java/lang/IllegalStateException
/*      */     //   166	187	190	java/lang/IllegalStateException
/*      */     //   173	233	233	java/lang/IllegalStateException
/*      */     //   253	268	271	java/lang/IllegalStateException
/*      */     //   261	283	283	java/lang/IllegalStateException
/*      */     //   301	316	319	java/lang/IllegalStateException
/*      */     //   309	343	346	java/lang/IllegalStateException
/*      */     //   350	380	383	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitMaxs(int paramInt1, int paramInt2) {
/*      */     if (this.compute == 0) {
/*      */       Handler handler = this.firstHandler;
/*      */       while (handler != null) {
/*      */         Label label1 = handler.start.getFirst();
/*      */         Label label2 = handler.handler.getFirst();
/*      */         Label label3 = handler.end.getFirst();
/*      */         try {
/*      */         
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         String str = (handler.desc == null) ? "java/lang/Throwable" : handler.desc;
/*      */         int i = 0x1700000 | this.cw.addType(str);
/*      */         label2.status |= 0x10;
/*      */         for (; label1 != label3; edge.info = i, edge.successor = label2)
/*      */           Edge edge = new Edge(); 
/*      */         handler = handler.next;
/*      */       } 
/*      */     } 
/*      */     if (this.compute == 2) {
/*      */       Handler handler = this.firstHandler;
/*      */       for (; handler != null; label2 = handler.handler, label3 = handler.end)
/*      */         Label label2, label3, label1 = handler.start; 
/*      */       if (this.subroutines > 0) {
/*      */         byte b = 0;
/*      */         this.labels.visitSubroutine(null, 1L, this.subroutines);
/*      */         Label label = this.labels;
/*      */         while (true) {
/*      */           try {
/*      */             if (label != null) {
/*      */               if ((label.status & 0x80) != 0) {
/*      */                 Label label1 = label.successors.next.successor;
/*      */                 try {
/*      */                   if ((label1.status & 0x400) == 0) {
/*      */                     b++;
/*      */                     label1.visitSubroutine(null, b / 32L << 32L | 1L << b % 32, this.subroutines);
/*      */                   } 
/*      */                 } catch (IllegalStateException illegalStateException) {
/*      */                   throw b(null);
/*      */                 } 
/*      */               } 
/*      */               continue;
/*      */             } 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           break;
/*      */           label = label.successor;
/*      */         } 
/*      */         label = this.labels;
/*      */         while (true) {
/*      */           try {
/*      */             if (label != null) {
/*      */               if ((label.status & 0x80) != 0) {
/*      */                 Label label1 = this.labels;
/*      */                 while (label1 != null) {
/*      */                   label1.status &= 0xFFFFF7FF;
/*      */                   label1 = label1.successor;
/*      */                 } 
/*      */               } 
/*      */               continue;
/*      */             } 
/*      */           } catch (IllegalStateException illegalStateException) {
/*      */             throw b(null);
/*      */           } 
/*      */           break;
/*      */           label = label.successor;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     this.maxStack = paramInt1;
/*      */     this.maxLocals = paramInt2;
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     try {
/*      */       if ("Ljava/lang/Synthetic;".equals(paramString)) {
/*      */         this.synthetics = Math.max(this.synthetics, paramInt + 1);
/*      */         return new AnnotationWriter(this.cw, false, byteVector, null, 0);
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         try {
/*      */           if (this.panns == null)
/*      */             this.panns = new AnnotationWriter[(Type.getArgumentTypes(this.descriptor)).length]; 
/*      */         } catch (IllegalStateException illegalStateException) {
/*      */           throw b(null);
/*      */         } 
/*      */         annotationWriter.next = this.panns[paramInt];
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       if (this.ipanns == null)
/*      */         this.ipanns = new AnnotationWriter[(Type.getArgumentTypes(this.descriptor)).length]; 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     annotationWriter.next = this.ipanns[paramInt];
/*      */     this.ipanns[paramInt] = annotationWriter;
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   final int getSize() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield classReaderOffset : I
/*      */     //   4: ifeq -> 19
/*      */     //   7: bipush #6
/*      */     //   9: aload_0
/*      */     //   10: getfield classReaderLength : I
/*      */     //   13: iadd
/*      */     //   14: ireturn
/*      */     //   15: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   18: athrow
/*      */     //   19: bipush #8
/*      */     //   21: istore_1
/*      */     //   22: aload_0
/*      */     //   23: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   26: getfield length : I
/*      */     //   29: ifle -> 364
/*      */     //   32: aload_0
/*      */     //   33: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   36: getfield length : I
/*      */     //   39: ldc 65535
/*      */     //   41: if_icmple -> 65
/*      */     //   44: goto -> 51
/*      */     //   47: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   50: athrow
/*      */     //   51: new java/lang/RuntimeException
/*      */     //   54: dup
/*      */     //   55: ldc 'Method code too large!'
/*      */     //   57: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   60: athrow
/*      */     //   61: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   64: athrow
/*      */     //   65: aload_0
/*      */     //   66: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   69: ldc 'Code'
/*      */     //   71: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   74: pop
/*      */     //   75: iload_1
/*      */     //   76: bipush #18
/*      */     //   78: aload_0
/*      */     //   79: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   82: getfield length : I
/*      */     //   85: iadd
/*      */     //   86: bipush #8
/*      */     //   88: aload_0
/*      */     //   89: getfield handlerCount : I
/*      */     //   92: imul
/*      */     //   93: iadd
/*      */     //   94: iadd
/*      */     //   95: istore_1
/*      */     //   96: aload_0
/*      */     //   97: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   100: ifnull -> 126
/*      */     //   103: aload_0
/*      */     //   104: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   107: ldc 'LocalVariableTable'
/*      */     //   109: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   112: pop
/*      */     //   113: iload_1
/*      */     //   114: bipush #8
/*      */     //   116: aload_0
/*      */     //   117: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   120: getfield length : I
/*      */     //   123: iadd
/*      */     //   124: iadd
/*      */     //   125: istore_1
/*      */     //   126: aload_0
/*      */     //   127: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   130: ifnull -> 156
/*      */     //   133: aload_0
/*      */     //   134: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   137: ldc 'LocalVariableTypeTable'
/*      */     //   139: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   142: pop
/*      */     //   143: iload_1
/*      */     //   144: bipush #8
/*      */     //   146: aload_0
/*      */     //   147: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   150: getfield length : I
/*      */     //   153: iadd
/*      */     //   154: iadd
/*      */     //   155: istore_1
/*      */     //   156: aload_0
/*      */     //   157: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   160: ifnull -> 186
/*      */     //   163: aload_0
/*      */     //   164: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   167: ldc 'LineNumberTable'
/*      */     //   169: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   172: pop
/*      */     //   173: iload_1
/*      */     //   174: bipush #8
/*      */     //   176: aload_0
/*      */     //   177: getfield lineNumber : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   180: getfield length : I
/*      */     //   183: iadd
/*      */     //   184: iadd
/*      */     //   185: istore_1
/*      */     //   186: aload_0
/*      */     //   187: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   190: ifnull -> 261
/*      */     //   193: aload_0
/*      */     //   194: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   197: getfield version : I
/*      */     //   200: ldc 65535
/*      */     //   202: iand
/*      */     //   203: bipush #50
/*      */     //   205: if_icmplt -> 223
/*      */     //   208: goto -> 215
/*      */     //   211: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   214: athrow
/*      */     //   215: iconst_1
/*      */     //   216: goto -> 224
/*      */     //   219: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   222: athrow
/*      */     //   223: iconst_0
/*      */     //   224: istore_2
/*      */     //   225: aload_0
/*      */     //   226: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   229: iload_2
/*      */     //   230: ifeq -> 242
/*      */     //   233: ldc 'StackMapTable'
/*      */     //   235: goto -> 244
/*      */     //   238: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   241: athrow
/*      */     //   242: ldc 'StackMap'
/*      */     //   244: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   247: pop
/*      */     //   248: iload_1
/*      */     //   249: bipush #8
/*      */     //   251: aload_0
/*      */     //   252: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   255: getfield length : I
/*      */     //   258: iadd
/*      */     //   259: iadd
/*      */     //   260: istore_1
/*      */     //   261: aload_0
/*      */     //   262: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   265: ifnull -> 291
/*      */     //   268: aload_0
/*      */     //   269: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   272: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   274: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   277: pop
/*      */     //   278: iload_1
/*      */     //   279: bipush #8
/*      */     //   281: aload_0
/*      */     //   282: getfield ctanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   285: invokevirtual getSize : ()I
/*      */     //   288: iadd
/*      */     //   289: iadd
/*      */     //   290: istore_1
/*      */     //   291: aload_0
/*      */     //   292: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   295: ifnull -> 321
/*      */     //   298: aload_0
/*      */     //   299: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   302: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   304: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   307: pop
/*      */     //   308: iload_1
/*      */     //   309: bipush #8
/*      */     //   311: aload_0
/*      */     //   312: getfield ictanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   315: invokevirtual getSize : ()I
/*      */     //   318: iadd
/*      */     //   319: iadd
/*      */     //   320: istore_1
/*      */     //   321: aload_0
/*      */     //   322: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   325: ifnull -> 364
/*      */     //   328: iload_1
/*      */     //   329: aload_0
/*      */     //   330: getfield cattrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   333: aload_0
/*      */     //   334: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   337: aload_0
/*      */     //   338: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   341: getfield data : [B
/*      */     //   344: aload_0
/*      */     //   345: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   348: getfield length : I
/*      */     //   351: aload_0
/*      */     //   352: getfield maxStack : I
/*      */     //   355: aload_0
/*      */     //   356: getfield maxLocals : I
/*      */     //   359: invokevirtual getSize : (Lorg/spongepowered/asm/lib/ClassWriter;[BIII)I
/*      */     //   362: iadd
/*      */     //   363: istore_1
/*      */     //   364: aload_0
/*      */     //   365: getfield exceptionCount : I
/*      */     //   368: ifle -> 393
/*      */     //   371: aload_0
/*      */     //   372: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   375: ldc 'Exceptions'
/*      */     //   377: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   380: pop
/*      */     //   381: iload_1
/*      */     //   382: bipush #8
/*      */     //   384: iconst_2
/*      */     //   385: aload_0
/*      */     //   386: getfield exceptionCount : I
/*      */     //   389: imul
/*      */     //   390: iadd
/*      */     //   391: iadd
/*      */     //   392: istore_1
/*      */     //   393: aload_0
/*      */     //   394: getfield access : I
/*      */     //   397: sipush #4096
/*      */     //   400: iand
/*      */     //   401: ifeq -> 463
/*      */     //   404: aload_0
/*      */     //   405: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   408: getfield version : I
/*      */     //   411: ldc 65535
/*      */     //   413: iand
/*      */     //   414: bipush #49
/*      */     //   416: if_icmplt -> 443
/*      */     //   419: goto -> 426
/*      */     //   422: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   425: athrow
/*      */     //   426: aload_0
/*      */     //   427: getfield access : I
/*      */     //   430: ldc 262144
/*      */     //   432: iand
/*      */     //   433: ifeq -> 463
/*      */     //   436: goto -> 443
/*      */     //   439: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   442: athrow
/*      */     //   443: aload_0
/*      */     //   444: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   447: ldc 'Synthetic'
/*      */     //   449: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   452: pop
/*      */     //   453: iinc #1, 6
/*      */     //   456: goto -> 463
/*      */     //   459: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   462: athrow
/*      */     //   463: aload_0
/*      */     //   464: getfield access : I
/*      */     //   467: ldc 131072
/*      */     //   469: iand
/*      */     //   470: ifeq -> 493
/*      */     //   473: aload_0
/*      */     //   474: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   477: ldc 'Deprecated'
/*      */     //   479: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   482: pop
/*      */     //   483: iinc #1, 6
/*      */     //   486: goto -> 493
/*      */     //   489: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   492: athrow
/*      */     //   493: aload_0
/*      */     //   494: getfield signature : Ljava/lang/String;
/*      */     //   497: ifnull -> 532
/*      */     //   500: aload_0
/*      */     //   501: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   504: ldc 'Signature'
/*      */     //   506: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   509: pop
/*      */     //   510: aload_0
/*      */     //   511: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   514: aload_0
/*      */     //   515: getfield signature : Ljava/lang/String;
/*      */     //   518: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   521: pop
/*      */     //   522: iinc #1, 8
/*      */     //   525: goto -> 532
/*      */     //   528: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   531: athrow
/*      */     //   532: aload_0
/*      */     //   533: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   536: ifnull -> 562
/*      */     //   539: aload_0
/*      */     //   540: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   543: ldc 'MethodParameters'
/*      */     //   545: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   548: pop
/*      */     //   549: iload_1
/*      */     //   550: bipush #7
/*      */     //   552: aload_0
/*      */     //   553: getfield methodParameters : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   556: getfield length : I
/*      */     //   559: iadd
/*      */     //   560: iadd
/*      */     //   561: istore_1
/*      */     //   562: aload_0
/*      */     //   563: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   566: ifnull -> 592
/*      */     //   569: aload_0
/*      */     //   570: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   573: ldc 'AnnotationDefault'
/*      */     //   575: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   578: pop
/*      */     //   579: iload_1
/*      */     //   580: bipush #6
/*      */     //   582: aload_0
/*      */     //   583: getfield annd : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   586: getfield length : I
/*      */     //   589: iadd
/*      */     //   590: iadd
/*      */     //   591: istore_1
/*      */     //   592: aload_0
/*      */     //   593: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   596: ifnull -> 622
/*      */     //   599: aload_0
/*      */     //   600: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   603: ldc 'RuntimeVisibleAnnotations'
/*      */     //   605: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   608: pop
/*      */     //   609: iload_1
/*      */     //   610: bipush #8
/*      */     //   612: aload_0
/*      */     //   613: getfield anns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   616: invokevirtual getSize : ()I
/*      */     //   619: iadd
/*      */     //   620: iadd
/*      */     //   621: istore_1
/*      */     //   622: aload_0
/*      */     //   623: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   626: ifnull -> 652
/*      */     //   629: aload_0
/*      */     //   630: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   633: ldc 'RuntimeInvisibleAnnotations'
/*      */     //   635: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   638: pop
/*      */     //   639: iload_1
/*      */     //   640: bipush #8
/*      */     //   642: aload_0
/*      */     //   643: getfield ianns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   646: invokevirtual getSize : ()I
/*      */     //   649: iadd
/*      */     //   650: iadd
/*      */     //   651: istore_1
/*      */     //   652: aload_0
/*      */     //   653: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   656: ifnull -> 682
/*      */     //   659: aload_0
/*      */     //   660: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   663: ldc 'RuntimeVisibleTypeAnnotations'
/*      */     //   665: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   668: pop
/*      */     //   669: iload_1
/*      */     //   670: bipush #8
/*      */     //   672: aload_0
/*      */     //   673: getfield tanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   676: invokevirtual getSize : ()I
/*      */     //   679: iadd
/*      */     //   680: iadd
/*      */     //   681: istore_1
/*      */     //   682: aload_0
/*      */     //   683: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   686: ifnull -> 712
/*      */     //   689: aload_0
/*      */     //   690: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   693: ldc 'RuntimeInvisibleTypeAnnotations'
/*      */     //   695: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   698: pop
/*      */     //   699: iload_1
/*      */     //   700: bipush #8
/*      */     //   702: aload_0
/*      */     //   703: getfield itanns : Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   706: invokevirtual getSize : ()I
/*      */     //   709: iadd
/*      */     //   710: iadd
/*      */     //   711: istore_1
/*      */     //   712: aload_0
/*      */     //   713: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   716: ifnull -> 805
/*      */     //   719: aload_0
/*      */     //   720: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   723: ldc 'RuntimeVisibleParameterAnnotations'
/*      */     //   725: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   728: pop
/*      */     //   729: iload_1
/*      */     //   730: bipush #7
/*      */     //   732: iconst_2
/*      */     //   733: aload_0
/*      */     //   734: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   737: arraylength
/*      */     //   738: aload_0
/*      */     //   739: getfield synthetics : I
/*      */     //   742: isub
/*      */     //   743: imul
/*      */     //   744: iadd
/*      */     //   745: iadd
/*      */     //   746: istore_1
/*      */     //   747: aload_0
/*      */     //   748: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   751: arraylength
/*      */     //   752: iconst_1
/*      */     //   753: isub
/*      */     //   754: istore_2
/*      */     //   755: iload_2
/*      */     //   756: aload_0
/*      */     //   757: getfield synthetics : I
/*      */     //   760: if_icmplt -> 805
/*      */     //   763: iload_1
/*      */     //   764: aload_0
/*      */     //   765: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   768: iload_2
/*      */     //   769: aaload
/*      */     //   770: ifnonnull -> 788
/*      */     //   773: goto -> 780
/*      */     //   776: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   779: athrow
/*      */     //   780: iconst_0
/*      */     //   781: goto -> 797
/*      */     //   784: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   787: athrow
/*      */     //   788: aload_0
/*      */     //   789: getfield panns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   792: iload_2
/*      */     //   793: aaload
/*      */     //   794: invokevirtual getSize : ()I
/*      */     //   797: iadd
/*      */     //   798: istore_1
/*      */     //   799: iinc #2, -1
/*      */     //   802: goto -> 755
/*      */     //   805: aload_0
/*      */     //   806: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   809: ifnull -> 898
/*      */     //   812: aload_0
/*      */     //   813: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   816: ldc 'RuntimeInvisibleParameterAnnotations'
/*      */     //   818: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   821: pop
/*      */     //   822: iload_1
/*      */     //   823: bipush #7
/*      */     //   825: iconst_2
/*      */     //   826: aload_0
/*      */     //   827: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   830: arraylength
/*      */     //   831: aload_0
/*      */     //   832: getfield synthetics : I
/*      */     //   835: isub
/*      */     //   836: imul
/*      */     //   837: iadd
/*      */     //   838: iadd
/*      */     //   839: istore_1
/*      */     //   840: aload_0
/*      */     //   841: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   844: arraylength
/*      */     //   845: iconst_1
/*      */     //   846: isub
/*      */     //   847: istore_2
/*      */     //   848: iload_2
/*      */     //   849: aload_0
/*      */     //   850: getfield synthetics : I
/*      */     //   853: if_icmplt -> 898
/*      */     //   856: iload_1
/*      */     //   857: aload_0
/*      */     //   858: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   861: iload_2
/*      */     //   862: aaload
/*      */     //   863: ifnonnull -> 881
/*      */     //   866: goto -> 873
/*      */     //   869: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   872: athrow
/*      */     //   873: iconst_0
/*      */     //   874: goto -> 890
/*      */     //   877: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   880: athrow
/*      */     //   881: aload_0
/*      */     //   882: getfield ipanns : [Lorg/spongepowered/asm/lib/AnnotationWriter;
/*      */     //   885: iload_2
/*      */     //   886: aaload
/*      */     //   887: invokevirtual getSize : ()I
/*      */     //   890: iadd
/*      */     //   891: istore_1
/*      */     //   892: iinc #2, -1
/*      */     //   895: goto -> 848
/*      */     //   898: aload_0
/*      */     //   899: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   902: ifnull -> 923
/*      */     //   905: iload_1
/*      */     //   906: aload_0
/*      */     //   907: getfield attrs : Lorg/spongepowered/asm/lib/Attribute;
/*      */     //   910: aload_0
/*      */     //   911: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   914: aconst_null
/*      */     //   915: iconst_0
/*      */     //   916: iconst_m1
/*      */     //   917: iconst_m1
/*      */     //   918: invokevirtual getSize : (Lorg/spongepowered/asm/lib/ClassWriter;[BIII)I
/*      */     //   921: iadd
/*      */     //   922: istore_1
/*      */     //   923: iload_1
/*      */     //   924: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #746	-> 0
/*      */     //   #292	-> 7
/*      */     //   #494	-> 19
/*      */     //   #965	-> 22
/*      */     //   #498	-> 32
/*      */     //   #176	-> 51
/*      */     //   #198	-> 65
/*      */     //   #658	-> 75
/*      */     //   #65	-> 96
/*      */     //   #753	-> 103
/*      */     //   #394	-> 113
/*      */     //   #78	-> 126
/*      */     //   #1040	-> 133
/*      */     //   #325	-> 143
/*      */     //   #773	-> 156
/*      */     //   #25	-> 163
/*      */     //   #117	-> 173
/*      */     //   #769	-> 186
/*      */     //   #174	-> 193
/*      */     //   #856	-> 225
/*      */     //   #359	-> 248
/*      */     //   #1005	-> 261
/*      */     //   #557	-> 268
/*      */     //   #745	-> 278
/*      */     //   #179	-> 291
/*      */     //   #44	-> 298
/*      */     //   #823	-> 308
/*      */     //   #485	-> 321
/*      */     //   #91	-> 328
/*      */     //   #824	-> 364
/*      */     //   #473	-> 371
/*      */     //   #701	-> 381
/*      */     //   #254	-> 393
/*      */     //   #563	-> 404
/*      */     //   #163	-> 443
/*      */     //   #245	-> 453
/*      */     //   #111	-> 463
/*      */     //   #41	-> 473
/*      */     //   #961	-> 483
/*      */     //   #16	-> 493
/*      */     //   #1032	-> 500
/*      */     //   #940	-> 510
/*      */     //   #614	-> 522
/*      */     //   #643	-> 532
/*      */     //   #684	-> 539
/*      */     //   #709	-> 549
/*      */     //   #692	-> 562
/*      */     //   #289	-> 569
/*      */     //   #310	-> 579
/*      */     //   #737	-> 592
/*      */     //   #1066	-> 599
/*      */     //   #168	-> 609
/*      */     //   #881	-> 622
/*      */     //   #632	-> 629
/*      */     //   #58	-> 639
/*      */     //   #257	-> 652
/*      */     //   #329	-> 659
/*      */     //   #690	-> 669
/*      */     //   #462	-> 682
/*      */     //   #683	-> 689
/*      */     //   #266	-> 699
/*      */     //   #623	-> 712
/*      */     //   #115	-> 719
/*      */     //   #74	-> 729
/*      */     //   #112	-> 747
/*      */     //   #209	-> 763
/*      */     //   #467	-> 799
/*      */     //   #752	-> 805
/*      */     //   #143	-> 812
/*      */     //   #486	-> 822
/*      */     //   #979	-> 840
/*      */     //   #340	-> 856
/*      */     //   #295	-> 892
/*      */     //   #381	-> 898
/*      */     //   #211	-> 905
/*      */     //   #490	-> 923
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	15	15	java/lang/IllegalStateException
/*      */     //   22	44	47	java/lang/IllegalStateException
/*      */     //   32	61	61	java/lang/IllegalStateException
/*      */     //   186	208	211	java/lang/IllegalStateException
/*      */     //   193	219	219	java/lang/IllegalStateException
/*      */     //   225	238	238	java/lang/IllegalStateException
/*      */     //   393	419	422	java/lang/IllegalStateException
/*      */     //   404	436	439	java/lang/IllegalStateException
/*      */     //   426	456	459	java/lang/IllegalStateException
/*      */     //   463	486	489	java/lang/IllegalStateException
/*      */     //   493	525	528	java/lang/IllegalStateException
/*      */     //   755	773	776	java/lang/IllegalStateException
/*      */     //   763	784	784	java/lang/IllegalStateException
/*      */     //   848	866	869	java/lang/IllegalStateException
/*      */     //   856	877	877	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         annotationWriter.next = this.anns;
/*      */         this.anns = annotationWriter;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     annotationWriter.next = this.ianns;
/*      */     this.ianns = annotationWriter;
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     paramInt = paramInt & 0xFF0000FF | this.lastCodeOffset << 8;
/*      */     AnnotationWriter.putTarget(paramInt, paramTypePath, byteVector);
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, byteVector.length - 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         annotationWriter.next = this.ctanns;
/*      */         this.ctanns = annotationWriter;
/*      */       } else {
/*      */         annotationWriter.next = this.ictanns;
/*      */         this.ictanns = annotationWriter;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   15: ifnull -> 70
/*      */     //   18: aload_0
/*      */     //   19: getfield compute : I
/*      */     //   22: ifeq -> 47
/*      */     //   25: goto -> 32
/*      */     //   28: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   31: athrow
/*      */     //   32: aload_0
/*      */     //   33: getfield compute : I
/*      */     //   36: iconst_1
/*      */     //   37: if_icmpne -> 70
/*      */     //   40: goto -> 47
/*      */     //   43: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   46: athrow
/*      */     //   47: aload_0
/*      */     //   48: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   51: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   54: sipush #132
/*      */     //   57: iload_1
/*      */     //   58: aconst_null
/*      */     //   59: aconst_null
/*      */     //   60: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   63: goto -> 70
/*      */     //   66: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   69: athrow
/*      */     //   70: aload_0
/*      */     //   71: getfield compute : I
/*      */     //   74: iconst_3
/*      */     //   75: if_icmpeq -> 102
/*      */     //   78: iload_1
/*      */     //   79: iconst_1
/*      */     //   80: iadd
/*      */     //   81: istore_3
/*      */     //   82: iload_3
/*      */     //   83: aload_0
/*      */     //   84: getfield maxLocals : I
/*      */     //   87: if_icmple -> 102
/*      */     //   90: aload_0
/*      */     //   91: iload_3
/*      */     //   92: putfield maxLocals : I
/*      */     //   95: goto -> 102
/*      */     //   98: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   101: athrow
/*      */     //   102: iload_1
/*      */     //   103: sipush #255
/*      */     //   106: if_icmpgt -> 135
/*      */     //   109: iload_2
/*      */     //   110: bipush #127
/*      */     //   112: if_icmpgt -> 135
/*      */     //   115: goto -> 122
/*      */     //   118: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   121: athrow
/*      */     //   122: iload_2
/*      */     //   123: bipush #-128
/*      */     //   125: if_icmpge -> 164
/*      */     //   128: goto -> 135
/*      */     //   131: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   134: athrow
/*      */     //   135: aload_0
/*      */     //   136: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   139: sipush #196
/*      */     //   142: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   145: sipush #132
/*      */     //   148: iload_1
/*      */     //   149: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   152: iload_2
/*      */     //   153: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   156: pop
/*      */     //   157: goto -> 180
/*      */     //   160: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   163: athrow
/*      */     //   164: aload_0
/*      */     //   165: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   168: sipush #132
/*      */     //   171: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   174: iload_1
/*      */     //   175: iload_2
/*      */     //   176: invokevirtual put11 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   179: pop
/*      */     //   180: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #837	-> 0
/*      */     //   #336	-> 11
/*      */     //   #800	-> 18
/*      */     //   #588	-> 47
/*      */     //   #308	-> 70
/*      */     //   #974	-> 78
/*      */     //   #177	-> 82
/*      */     //   #574	-> 90
/*      */     //   #1082	-> 102
/*      */     //   #867	-> 135
/*      */     //   #99	-> 153
/*      */     //   #640	-> 164
/*      */     //   #838	-> 180
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	25	28	java/lang/IllegalStateException
/*      */     //   18	40	43	java/lang/IllegalStateException
/*      */     //   32	63	66	java/lang/IllegalStateException
/*      */     //   82	95	98	java/lang/IllegalStateException
/*      */     //   102	115	118	java/lang/IllegalStateException
/*      */     //   109	128	131	java/lang/IllegalStateException
/*      */     //   122	160	160	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
/*      */     // Byte code:
/*      */     //   0: aload_3
/*      */     //   1: ifnull -> 100
/*      */     //   4: aload_0
/*      */     //   5: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   8: ifnonnull -> 36
/*      */     //   11: goto -> 18
/*      */     //   14: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   17: athrow
/*      */     //   18: aload_0
/*      */     //   19: new org/spongepowered/asm/lib/ByteVector
/*      */     //   22: dup
/*      */     //   23: invokespecial <init> : ()V
/*      */     //   26: putfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   29: goto -> 36
/*      */     //   32: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   35: athrow
/*      */     //   36: aload_0
/*      */     //   37: dup
/*      */     //   38: getfield localVarTypeCount : I
/*      */     //   41: iconst_1
/*      */     //   42: iadd
/*      */     //   43: putfield localVarTypeCount : I
/*      */     //   46: aload_0
/*      */     //   47: getfield localVarType : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   50: aload #4
/*      */     //   52: getfield position : I
/*      */     //   55: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   58: aload #5
/*      */     //   60: getfield position : I
/*      */     //   63: aload #4
/*      */     //   65: getfield position : I
/*      */     //   68: isub
/*      */     //   69: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   72: aload_0
/*      */     //   73: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   76: aload_1
/*      */     //   77: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   80: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   83: aload_0
/*      */     //   84: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   87: aload_3
/*      */     //   88: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   91: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   94: iload #6
/*      */     //   96: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   99: pop
/*      */     //   100: aload_0
/*      */     //   101: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   104: ifnonnull -> 125
/*      */     //   107: aload_0
/*      */     //   108: new org/spongepowered/asm/lib/ByteVector
/*      */     //   111: dup
/*      */     //   112: invokespecial <init> : ()V
/*      */     //   115: putfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   118: goto -> 125
/*      */     //   121: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   124: athrow
/*      */     //   125: aload_0
/*      */     //   126: dup
/*      */     //   127: getfield localVarCount : I
/*      */     //   130: iconst_1
/*      */     //   131: iadd
/*      */     //   132: putfield localVarCount : I
/*      */     //   135: aload_0
/*      */     //   136: getfield localVar : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   139: aload #4
/*      */     //   141: getfield position : I
/*      */     //   144: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   147: aload #5
/*      */     //   149: getfield position : I
/*      */     //   152: aload #4
/*      */     //   154: getfield position : I
/*      */     //   157: isub
/*      */     //   158: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   161: aload_0
/*      */     //   162: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   165: aload_1
/*      */     //   166: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   169: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   172: aload_0
/*      */     //   173: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   176: aload_2
/*      */     //   177: invokevirtual newUTF8 : (Ljava/lang/String;)I
/*      */     //   180: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   183: iload #6
/*      */     //   185: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   188: pop
/*      */     //   189: aload_0
/*      */     //   190: getfield compute : I
/*      */     //   193: iconst_3
/*      */     //   194: if_icmpeq -> 261
/*      */     //   197: aload_2
/*      */     //   198: iconst_0
/*      */     //   199: invokevirtual charAt : (I)C
/*      */     //   202: istore #7
/*      */     //   204: iload #6
/*      */     //   206: iload #7
/*      */     //   208: bipush #74
/*      */     //   210: if_icmpeq -> 227
/*      */     //   213: iload #7
/*      */     //   215: bipush #68
/*      */     //   217: if_icmpne -> 235
/*      */     //   220: goto -> 227
/*      */     //   223: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   226: athrow
/*      */     //   227: iconst_2
/*      */     //   228: goto -> 236
/*      */     //   231: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   234: athrow
/*      */     //   235: iconst_1
/*      */     //   236: iadd
/*      */     //   237: istore #8
/*      */     //   239: iload #8
/*      */     //   241: aload_0
/*      */     //   242: getfield maxLocals : I
/*      */     //   245: if_icmple -> 261
/*      */     //   248: aload_0
/*      */     //   249: iload #8
/*      */     //   251: putfield maxLocals : I
/*      */     //   254: goto -> 261
/*      */     //   257: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   260: athrow
/*      */     //   261: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #840	-> 0
/*      */     //   #869	-> 4
/*      */     //   #414	-> 18
/*      */     //   #459	-> 36
/*      */     //   #15	-> 46
/*      */     //   #628	-> 69
/*      */     //   #125	-> 77
/*      */     //   #654	-> 96
/*      */     //   #294	-> 100
/*      */     //   #552	-> 107
/*      */     //   #85	-> 125
/*      */     //   #604	-> 135
/*      */     //   #351	-> 158
/*      */     //   #862	-> 166
/*      */     //   #839	-> 185
/*      */     //   #721	-> 189
/*      */     //   #1020	-> 197
/*      */     //   #104	-> 204
/*      */     //   #1079	-> 239
/*      */     //   #404	-> 248
/*      */     //   #821	-> 261
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	11	14	java/lang/IllegalStateException
/*      */     //   4	29	32	java/lang/IllegalStateException
/*      */     //   100	118	121	java/lang/IllegalStateException
/*      */     //   204	220	223	java/lang/IllegalStateException
/*      */     //   213	231	231	java/lang/IllegalStateException
/*      */     //   239	254	257	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   private void endFrame() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield previousFrame : [I
/*      */     //   4: ifnull -> 53
/*      */     //   7: aload_0
/*      */     //   8: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   11: ifnonnull -> 39
/*      */     //   14: goto -> 21
/*      */     //   17: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   20: athrow
/*      */     //   21: aload_0
/*      */     //   22: new org/spongepowered/asm/lib/ByteVector
/*      */     //   25: dup
/*      */     //   26: invokespecial <init> : ()V
/*      */     //   29: putfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   32: goto -> 39
/*      */     //   35: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   38: athrow
/*      */     //   39: aload_0
/*      */     //   40: invokespecial writeFrame : ()V
/*      */     //   43: aload_0
/*      */     //   44: dup
/*      */     //   45: getfield frameCount : I
/*      */     //   48: iconst_1
/*      */     //   49: iadd
/*      */     //   50: putfield frameCount : I
/*      */     //   53: aload_0
/*      */     //   54: aload_0
/*      */     //   55: getfield frame : [I
/*      */     //   58: putfield previousFrame : [I
/*      */     //   61: aload_0
/*      */     //   62: aconst_null
/*      */     //   63: putfield frame : [I
/*      */     //   66: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #895	-> 0
/*      */     //   #297	-> 7
/*      */     //   #932	-> 21
/*      */     //   #443	-> 39
/*      */     //   #17	-> 43
/*      */     //   #596	-> 53
/*      */     //   #349	-> 61
/*      */     //   #894	-> 66
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	14	17	java/lang/IllegalStateException
/*      */     //   7	32	35	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   15: ifnull -> 148
/*      */     //   18: aload_0
/*      */     //   19: getfield compute : I
/*      */     //   22: ifeq -> 47
/*      */     //   25: goto -> 32
/*      */     //   28: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   31: athrow
/*      */     //   32: aload_0
/*      */     //   33: getfield compute : I
/*      */     //   36: iconst_1
/*      */     //   37: if_icmpne -> 68
/*      */     //   40: goto -> 47
/*      */     //   43: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   46: athrow
/*      */     //   47: aload_0
/*      */     //   48: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   51: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   54: iload_1
/*      */     //   55: iload_2
/*      */     //   56: aconst_null
/*      */     //   57: aconst_null
/*      */     //   58: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   61: goto -> 148
/*      */     //   64: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   67: athrow
/*      */     //   68: iload_1
/*      */     //   69: sipush #169
/*      */     //   72: if_icmpne -> 112
/*      */     //   75: aload_0
/*      */     //   76: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   79: dup
/*      */     //   80: getfield status : I
/*      */     //   83: sipush #256
/*      */     //   86: ior
/*      */     //   87: putfield status : I
/*      */     //   90: aload_0
/*      */     //   91: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   94: aload_0
/*      */     //   95: getfield stackSize : I
/*      */     //   98: putfield inputStackTop : I
/*      */     //   101: aload_0
/*      */     //   102: invokespecial noSuccessor : ()V
/*      */     //   105: goto -> 148
/*      */     //   108: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   111: athrow
/*      */     //   112: aload_0
/*      */     //   113: getfield stackSize : I
/*      */     //   116: getstatic org/spongepowered/asm/lib/Frame.SIZE : [I
/*      */     //   119: iload_1
/*      */     //   120: iaload
/*      */     //   121: iadd
/*      */     //   122: istore_3
/*      */     //   123: iload_3
/*      */     //   124: aload_0
/*      */     //   125: getfield maxStackSize : I
/*      */     //   128: if_icmple -> 143
/*      */     //   131: aload_0
/*      */     //   132: iload_3
/*      */     //   133: putfield maxStackSize : I
/*      */     //   136: goto -> 143
/*      */     //   139: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   142: athrow
/*      */     //   143: aload_0
/*      */     //   144: iload_3
/*      */     //   145: putfield stackSize : I
/*      */     //   148: aload_0
/*      */     //   149: getfield compute : I
/*      */     //   152: iconst_3
/*      */     //   153: if_icmpeq -> 239
/*      */     //   156: iload_1
/*      */     //   157: bipush #22
/*      */     //   159: if_icmpeq -> 208
/*      */     //   162: goto -> 169
/*      */     //   165: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   168: athrow
/*      */     //   169: iload_1
/*      */     //   170: bipush #24
/*      */     //   172: if_icmpeq -> 208
/*      */     //   175: goto -> 182
/*      */     //   178: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   181: athrow
/*      */     //   182: iload_1
/*      */     //   183: bipush #55
/*      */     //   185: if_icmpeq -> 208
/*      */     //   188: goto -> 195
/*      */     //   191: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   194: athrow
/*      */     //   195: iload_1
/*      */     //   196: bipush #57
/*      */     //   198: if_icmpne -> 215
/*      */     //   201: goto -> 208
/*      */     //   204: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   207: athrow
/*      */     //   208: iload_2
/*      */     //   209: iconst_2
/*      */     //   210: iadd
/*      */     //   211: istore_3
/*      */     //   212: goto -> 219
/*      */     //   215: iload_2
/*      */     //   216: iconst_1
/*      */     //   217: iadd
/*      */     //   218: istore_3
/*      */     //   219: iload_3
/*      */     //   220: aload_0
/*      */     //   221: getfield maxLocals : I
/*      */     //   224: if_icmple -> 239
/*      */     //   227: aload_0
/*      */     //   228: iload_3
/*      */     //   229: putfield maxLocals : I
/*      */     //   232: goto -> 239
/*      */     //   235: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   238: athrow
/*      */     //   239: iload_2
/*      */     //   240: iconst_4
/*      */     //   241: if_icmpge -> 310
/*      */     //   244: iload_1
/*      */     //   245: sipush #169
/*      */     //   248: if_icmpeq -> 310
/*      */     //   251: goto -> 258
/*      */     //   254: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   257: athrow
/*      */     //   258: iload_1
/*      */     //   259: bipush #54
/*      */     //   261: if_icmpge -> 286
/*      */     //   264: goto -> 271
/*      */     //   267: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   270: athrow
/*      */     //   271: bipush #26
/*      */     //   273: iload_1
/*      */     //   274: bipush #21
/*      */     //   276: isub
/*      */     //   277: iconst_2
/*      */     //   278: ishl
/*      */     //   279: iadd
/*      */     //   280: iload_2
/*      */     //   281: iadd
/*      */     //   282: istore_3
/*      */     //   283: goto -> 298
/*      */     //   286: bipush #59
/*      */     //   288: iload_1
/*      */     //   289: bipush #54
/*      */     //   291: isub
/*      */     //   292: iconst_2
/*      */     //   293: ishl
/*      */     //   294: iadd
/*      */     //   295: iload_2
/*      */     //   296: iadd
/*      */     //   297: istore_3
/*      */     //   298: aload_0
/*      */     //   299: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   302: iload_3
/*      */     //   303: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   306: pop
/*      */     //   307: goto -> 350
/*      */     //   310: iload_2
/*      */     //   311: sipush #256
/*      */     //   314: if_icmplt -> 340
/*      */     //   317: aload_0
/*      */     //   318: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   321: sipush #196
/*      */     //   324: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   327: iload_1
/*      */     //   328: iload_2
/*      */     //   329: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   332: pop
/*      */     //   333: goto -> 350
/*      */     //   336: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   339: athrow
/*      */     //   340: aload_0
/*      */     //   341: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   344: iload_1
/*      */     //   345: iload_2
/*      */     //   346: invokevirtual put11 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   349: pop
/*      */     //   350: iload_1
/*      */     //   351: bipush #54
/*      */     //   353: if_icmplt -> 402
/*      */     //   356: aload_0
/*      */     //   357: getfield compute : I
/*      */     //   360: ifne -> 402
/*      */     //   363: goto -> 370
/*      */     //   366: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   369: athrow
/*      */     //   370: aload_0
/*      */     //   371: getfield handlerCount : I
/*      */     //   374: ifle -> 402
/*      */     //   377: goto -> 384
/*      */     //   380: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   383: athrow
/*      */     //   384: aload_0
/*      */     //   385: new org/spongepowered/asm/lib/Label
/*      */     //   388: dup
/*      */     //   389: invokespecial <init> : ()V
/*      */     //   392: invokevirtual visitLabel : (Lorg/spongepowered/asm/lib/Label;)V
/*      */     //   395: goto -> 402
/*      */     //   398: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   401: athrow
/*      */     //   402: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #897	-> 0
/*      */     //   #121	-> 11
/*      */     //   #244	-> 18
/*      */     //   #1002	-> 47
/*      */     //   #107	-> 68
/*      */     //   #672	-> 75
/*      */     //   #982	-> 90
/*      */     //   #148	-> 101
/*      */     //   #120	-> 112
/*      */     //   #538	-> 123
/*      */     //   #517	-> 131
/*      */     //   #324	-> 143
/*      */     //   #478	-> 148
/*      */     //   #888	-> 156
/*      */     //   #489	-> 208
/*      */     //   #832	-> 215
/*      */     //   #834	-> 219
/*      */     //   #787	-> 227
/*      */     //   #860	-> 239
/*      */     //   #260	-> 258
/*      */     //   #590	-> 271
/*      */     //   #647	-> 286
/*      */     //   #332	-> 298
/*      */     //   #345	-> 307
/*      */     //   #367	-> 317
/*      */     //   #1083	-> 340
/*      */     //   #214	-> 350
/*      */     //   #465	-> 384
/*      */     //   #633	-> 402
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   0	25	28	java/lang/IllegalStateException
/*      */     //   18	40	43	java/lang/IllegalStateException
/*      */     //   32	64	64	java/lang/IllegalStateException
/*      */     //   68	108	108	java/lang/IllegalStateException
/*      */     //   123	136	139	java/lang/IllegalStateException
/*      */     //   148	162	165	java/lang/IllegalStateException
/*      */     //   156	175	178	java/lang/IllegalStateException
/*      */     //   169	188	191	java/lang/IllegalStateException
/*      */     //   182	201	204	java/lang/IllegalStateException
/*      */     //   219	232	235	java/lang/IllegalStateException
/*      */     //   239	251	254	java/lang/IllegalStateException
/*      */     //   244	264	267	java/lang/IllegalStateException
/*      */     //   310	336	336	java/lang/IllegalStateException
/*      */     //   350	363	366	java/lang/IllegalStateException
/*      */     //   356	377	380	java/lang/IllegalStateException
/*      */     //   370	395	398	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   private void writeFrameTypes(int paramInt1, int paramInt2) {
/*      */     for (int i = paramInt1; i < paramInt2; k = j & 0xF0000000)
/*      */       int k, j = this.frame[i]; 
/*      */   }
/*      */   
/*      */   public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: aload_0
/*      */     //   2: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   5: getfield length : I
/*      */     //   8: putfield lastCodeOffset : I
/*      */     //   11: aload_0
/*      */     //   12: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   15: aload_2
/*      */     //   16: aload_3
/*      */     //   17: aload #4
/*      */     //   19: iload #5
/*      */     //   21: invokevirtual newMethodItem : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lorg/spongepowered/asm/lib/Item;
/*      */     //   24: astore #6
/*      */     //   26: aload #6
/*      */     //   28: getfield intVal : I
/*      */     //   31: istore #7
/*      */     //   33: aload_0
/*      */     //   34: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   37: ifnull -> 185
/*      */     //   40: aload_0
/*      */     //   41: getfield compute : I
/*      */     //   44: ifeq -> 69
/*      */     //   47: goto -> 54
/*      */     //   50: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   53: athrow
/*      */     //   54: aload_0
/*      */     //   55: getfield compute : I
/*      */     //   58: iconst_1
/*      */     //   59: if_icmpne -> 94
/*      */     //   62: goto -> 69
/*      */     //   65: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   68: athrow
/*      */     //   69: aload_0
/*      */     //   70: getfield currentBlock : Lorg/spongepowered/asm/lib/Label;
/*      */     //   73: getfield frame : Lorg/spongepowered/asm/lib/Frame;
/*      */     //   76: iload_1
/*      */     //   77: iconst_0
/*      */     //   78: aload_0
/*      */     //   79: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   82: aload #6
/*      */     //   84: invokevirtual execute : (IILorg/spongepowered/asm/lib/ClassWriter;Lorg/spongepowered/asm/lib/Item;)V
/*      */     //   87: goto -> 185
/*      */     //   90: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   93: athrow
/*      */     //   94: iload #7
/*      */     //   96: ifne -> 113
/*      */     //   99: aload #4
/*      */     //   101: invokestatic getArgumentsAndReturnSizes : (Ljava/lang/String;)I
/*      */     //   104: istore #7
/*      */     //   106: aload #6
/*      */     //   108: iload #7
/*      */     //   110: putfield intVal : I
/*      */     //   113: iload_1
/*      */     //   114: sipush #184
/*      */     //   117: if_icmpne -> 141
/*      */     //   120: aload_0
/*      */     //   121: getfield stackSize : I
/*      */     //   124: iload #7
/*      */     //   126: iconst_2
/*      */     //   127: ishr
/*      */     //   128: isub
/*      */     //   129: iload #7
/*      */     //   131: iconst_3
/*      */     //   132: iand
/*      */     //   133: iadd
/*      */     //   134: iconst_1
/*      */     //   135: iadd
/*      */     //   136: istore #8
/*      */     //   138: goto -> 157
/*      */     //   141: aload_0
/*      */     //   142: getfield stackSize : I
/*      */     //   145: iload #7
/*      */     //   147: iconst_2
/*      */     //   148: ishr
/*      */     //   149: isub
/*      */     //   150: iload #7
/*      */     //   152: iconst_3
/*      */     //   153: iand
/*      */     //   154: iadd
/*      */     //   155: istore #8
/*      */     //   157: iload #8
/*      */     //   159: aload_0
/*      */     //   160: getfield maxStackSize : I
/*      */     //   163: if_icmple -> 179
/*      */     //   166: aload_0
/*      */     //   167: iload #8
/*      */     //   169: putfield maxStackSize : I
/*      */     //   172: goto -> 179
/*      */     //   175: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   178: athrow
/*      */     //   179: aload_0
/*      */     //   180: iload #8
/*      */     //   182: putfield stackSize : I
/*      */     //   185: iload_1
/*      */     //   186: sipush #185
/*      */     //   189: if_icmpne -> 245
/*      */     //   192: iload #7
/*      */     //   194: ifne -> 218
/*      */     //   197: goto -> 204
/*      */     //   200: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   203: athrow
/*      */     //   204: aload #4
/*      */     //   206: invokestatic getArgumentsAndReturnSizes : (Ljava/lang/String;)I
/*      */     //   209: istore #7
/*      */     //   211: aload #6
/*      */     //   213: iload #7
/*      */     //   215: putfield intVal : I
/*      */     //   218: aload_0
/*      */     //   219: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   222: sipush #185
/*      */     //   225: aload #6
/*      */     //   227: getfield index : I
/*      */     //   230: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   233: iload #7
/*      */     //   235: iconst_2
/*      */     //   236: ishr
/*      */     //   237: iconst_0
/*      */     //   238: invokevirtual put11 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   241: pop
/*      */     //   242: goto -> 259
/*      */     //   245: aload_0
/*      */     //   246: getfield code : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   249: iload_1
/*      */     //   250: aload #6
/*      */     //   252: getfield index : I
/*      */     //   255: invokevirtual put12 : (II)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   258: pop
/*      */     //   259: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1014	-> 0
/*      */     //   #536	-> 11
/*      */     //   #477	-> 26
/*      */     //   #451	-> 33
/*      */     //   #947	-> 40
/*      */     //   #682	-> 69
/*      */     //   #826	-> 94
/*      */     //   #558	-> 99
/*      */     //   #328	-> 106
/*      */     //   #729	-> 113
/*      */     //   #560	-> 120
/*      */     //   #342	-> 141
/*      */     //   #13	-> 157
/*      */     //   #500	-> 166
/*      */     //   #610	-> 179
/*      */     //   #890	-> 185
/*      */     //   #1089	-> 192
/*      */     //   #278	-> 204
/*      */     //   #777	-> 211
/*      */     //   #518	-> 218
/*      */     //   #580	-> 245
/*      */     //   #337	-> 259
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   33	47	50	java/lang/IllegalStateException
/*      */     //   40	62	65	java/lang/IllegalStateException
/*      */     //   54	90	90	java/lang/IllegalStateException
/*      */     //   157	172	175	java/lang/IllegalStateException
/*      */     //   185	197	200	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   public void visitParameter(String paramString, int paramInt) {
/*      */     try {
/*      */       if (this.methodParameters == null)
/*      */         this.methodParameters = new ByteVector(); 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     try {
/*      */       this.methodParametersCount++;
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     this.methodParameters.putShort((paramString == null) ? 0 : this.cw.newUTF8(paramString)).putShort(paramInt);
/*      */   }
/*      */   
/*      */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*      */     ByteVector byteVector = new ByteVector();
/*      */     AnnotationWriter.putTarget(paramInt, paramTypePath, byteVector);
/*      */     byteVector.putShort(this.cw.newUTF8(paramString)).putShort(0);
/*      */     AnnotationWriter annotationWriter = new AnnotationWriter(this.cw, true, byteVector, byteVector, byteVector.length - 2);
/*      */     try {
/*      */       if (paramBoolean) {
/*      */         annotationWriter.next = this.tanns;
/*      */         this.tanns = annotationWriter;
/*      */       } else {
/*      */         annotationWriter.next = this.itanns;
/*      */         this.itanns = annotationWriter;
/*      */       } 
/*      */     } catch (IllegalStateException illegalStateException) {
/*      */       throw b(null);
/*      */     } 
/*      */     return annotationWriter;
/*      */   }
/*      */   
/*      */   public void visitCode() {}
/*      */   
/*      */   private void writeFrame() {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: getfield frame : [I
/*      */     //   4: iconst_1
/*      */     //   5: iaload
/*      */     //   6: istore_1
/*      */     //   7: aload_0
/*      */     //   8: getfield frame : [I
/*      */     //   11: iconst_2
/*      */     //   12: iaload
/*      */     //   13: istore_2
/*      */     //   14: aload_0
/*      */     //   15: getfield cw : Lorg/spongepowered/asm/lib/ClassWriter;
/*      */     //   18: getfield version : I
/*      */     //   21: ldc 65535
/*      */     //   23: iand
/*      */     //   24: bipush #50
/*      */     //   26: if_icmpge -> 81
/*      */     //   29: aload_0
/*      */     //   30: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   33: aload_0
/*      */     //   34: getfield frame : [I
/*      */     //   37: iconst_0
/*      */     //   38: iaload
/*      */     //   39: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   42: iload_1
/*      */     //   43: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   46: pop
/*      */     //   47: aload_0
/*      */     //   48: iconst_3
/*      */     //   49: iconst_3
/*      */     //   50: iload_1
/*      */     //   51: iadd
/*      */     //   52: invokespecial writeFrameTypes : (II)V
/*      */     //   55: aload_0
/*      */     //   56: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   59: iload_2
/*      */     //   60: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   63: pop
/*      */     //   64: aload_0
/*      */     //   65: iconst_3
/*      */     //   66: iload_1
/*      */     //   67: iadd
/*      */     //   68: iconst_3
/*      */     //   69: iload_1
/*      */     //   70: iadd
/*      */     //   71: iload_2
/*      */     //   72: iadd
/*      */     //   73: invokespecial writeFrameTypes : (II)V
/*      */     //   76: return
/*      */     //   77: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   80: athrow
/*      */     //   81: aload_0
/*      */     //   82: getfield previousFrame : [I
/*      */     //   85: iconst_1
/*      */     //   86: iaload
/*      */     //   87: istore_3
/*      */     //   88: sipush #255
/*      */     //   91: istore #4
/*      */     //   93: iconst_0
/*      */     //   94: istore #5
/*      */     //   96: aload_0
/*      */     //   97: getfield frameCount : I
/*      */     //   100: ifne -> 114
/*      */     //   103: aload_0
/*      */     //   104: getfield frame : [I
/*      */     //   107: iconst_0
/*      */     //   108: iaload
/*      */     //   109: istore #6
/*      */     //   111: goto -> 131
/*      */     //   114: aload_0
/*      */     //   115: getfield frame : [I
/*      */     //   118: iconst_0
/*      */     //   119: iaload
/*      */     //   120: aload_0
/*      */     //   121: getfield previousFrame : [I
/*      */     //   124: iconst_0
/*      */     //   125: iaload
/*      */     //   126: isub
/*      */     //   127: iconst_1
/*      */     //   128: isub
/*      */     //   129: istore #6
/*      */     //   131: iload_2
/*      */     //   132: ifne -> 225
/*      */     //   135: iload_1
/*      */     //   136: iload_3
/*      */     //   137: isub
/*      */     //   138: istore #5
/*      */     //   140: iload #5
/*      */     //   142: tableswitch default -> 222, -3 -> 184, -2 -> 184, -1 -> 184, 0 -> 194, 1 -> 217, 2 -> 217, 3 -> 217
/*      */     //   184: sipush #248
/*      */     //   187: istore #4
/*      */     //   189: iload_1
/*      */     //   190: istore_3
/*      */     //   191: goto -> 222
/*      */     //   194: iload #6
/*      */     //   196: bipush #64
/*      */     //   198: if_icmpge -> 209
/*      */     //   201: iconst_0
/*      */     //   202: goto -> 212
/*      */     //   205: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   208: athrow
/*      */     //   209: sipush #251
/*      */     //   212: istore #4
/*      */     //   214: goto -> 222
/*      */     //   217: sipush #252
/*      */     //   220: istore #4
/*      */     //   222: goto -> 270
/*      */     //   225: iload_1
/*      */     //   226: iload_3
/*      */     //   227: if_icmpne -> 270
/*      */     //   230: iload_2
/*      */     //   231: iconst_1
/*      */     //   232: if_icmpne -> 270
/*      */     //   235: goto -> 242
/*      */     //   238: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   241: athrow
/*      */     //   242: iload #6
/*      */     //   244: bipush #63
/*      */     //   246: if_icmpge -> 265
/*      */     //   249: goto -> 256
/*      */     //   252: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   255: athrow
/*      */     //   256: bipush #64
/*      */     //   258: goto -> 268
/*      */     //   261: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   264: athrow
/*      */     //   265: sipush #247
/*      */     //   268: istore #4
/*      */     //   270: iload #4
/*      */     //   272: sipush #255
/*      */     //   275: if_icmpeq -> 331
/*      */     //   278: iconst_3
/*      */     //   279: istore #7
/*      */     //   281: iconst_0
/*      */     //   282: istore #8
/*      */     //   284: iload #8
/*      */     //   286: iload_3
/*      */     //   287: if_icmpge -> 331
/*      */     //   290: aload_0
/*      */     //   291: getfield frame : [I
/*      */     //   294: iload #7
/*      */     //   296: iaload
/*      */     //   297: aload_0
/*      */     //   298: getfield previousFrame : [I
/*      */     //   301: iload #7
/*      */     //   303: iaload
/*      */     //   304: if_icmpeq -> 322
/*      */     //   307: goto -> 314
/*      */     //   310: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   313: athrow
/*      */     //   314: sipush #255
/*      */     //   317: istore #4
/*      */     //   319: goto -> 331
/*      */     //   322: iinc #7, 1
/*      */     //   325: iinc #8, 1
/*      */     //   328: goto -> 284
/*      */     //   331: iload #4
/*      */     //   333: lookupswitch default -> 537, 0 -> 392, 64 -> 409, 247 -> 435, 248 -> 483, 251 -> 464, 252 -> 505
/*      */     //   392: aload_0
/*      */     //   393: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   396: iload #6
/*      */     //   398: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   401: pop
/*      */     //   402: goto -> 586
/*      */     //   405: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*      */     //   408: athrow
/*      */     //   409: aload_0
/*      */     //   410: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   413: bipush #64
/*      */     //   415: iload #6
/*      */     //   417: iadd
/*      */     //   418: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   421: pop
/*      */     //   422: aload_0
/*      */     //   423: iconst_3
/*      */     //   424: iload_1
/*      */     //   425: iadd
/*      */     //   426: iconst_4
/*      */     //   427: iload_1
/*      */     //   428: iadd
/*      */     //   429: invokespecial writeFrameTypes : (II)V
/*      */     //   432: goto -> 586
/*      */     //   435: aload_0
/*      */     //   436: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   439: sipush #247
/*      */     //   442: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   445: iload #6
/*      */     //   447: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   450: pop
/*      */     //   451: aload_0
/*      */     //   452: iconst_3
/*      */     //   453: iload_1
/*      */     //   454: iadd
/*      */     //   455: iconst_4
/*      */     //   456: iload_1
/*      */     //   457: iadd
/*      */     //   458: invokespecial writeFrameTypes : (II)V
/*      */     //   461: goto -> 586
/*      */     //   464: aload_0
/*      */     //   465: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   468: sipush #251
/*      */     //   471: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   474: iload #6
/*      */     //   476: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   479: pop
/*      */     //   480: goto -> 586
/*      */     //   483: aload_0
/*      */     //   484: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   487: sipush #251
/*      */     //   490: iload #5
/*      */     //   492: iadd
/*      */     //   493: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   496: iload #6
/*      */     //   498: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   501: pop
/*      */     //   502: goto -> 586
/*      */     //   505: aload_0
/*      */     //   506: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   509: sipush #251
/*      */     //   512: iload #5
/*      */     //   514: iadd
/*      */     //   515: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   518: iload #6
/*      */     //   520: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   523: pop
/*      */     //   524: aload_0
/*      */     //   525: iconst_3
/*      */     //   526: iload_3
/*      */     //   527: iadd
/*      */     //   528: iconst_3
/*      */     //   529: iload_1
/*      */     //   530: iadd
/*      */     //   531: invokespecial writeFrameTypes : (II)V
/*      */     //   534: goto -> 586
/*      */     //   537: aload_0
/*      */     //   538: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   541: sipush #255
/*      */     //   544: invokevirtual putByte : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   547: iload #6
/*      */     //   549: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   552: iload_1
/*      */     //   553: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   556: pop
/*      */     //   557: aload_0
/*      */     //   558: iconst_3
/*      */     //   559: iconst_3
/*      */     //   560: iload_1
/*      */     //   561: iadd
/*      */     //   562: invokespecial writeFrameTypes : (II)V
/*      */     //   565: aload_0
/*      */     //   566: getfield stackMap : Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   569: iload_2
/*      */     //   570: invokevirtual putShort : (I)Lorg/spongepowered/asm/lib/ByteVector;
/*      */     //   573: pop
/*      */     //   574: aload_0
/*      */     //   575: iconst_3
/*      */     //   576: iload_1
/*      */     //   577: iadd
/*      */     //   578: iconst_3
/*      */     //   579: iload_1
/*      */     //   580: iadd
/*      */     //   581: iload_2
/*      */     //   582: iadd
/*      */     //   583: invokespecial writeFrameTypes : (II)V
/*      */     //   586: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #1071	-> 0
/*      */     //   #475	-> 7
/*      */     //   #1058	-> 14
/*      */     //   #288	-> 29
/*      */     //   #608	-> 47
/*      */     //   #195	-> 55
/*      */     //   #258	-> 64
/*      */     //   #1043	-> 76
/*      */     //   #679	-> 81
/*      */     //   #936	-> 88
/*      */     //   #101	-> 93
/*      */     //   #172	-> 96
/*      */     //   #419	-> 103
/*      */     //   #129	-> 114
/*      */     //   #135	-> 131
/*      */     //   #426	-> 135
/*      */     //   #283	-> 140
/*      */     //   #771	-> 184
/*      */     //   #531	-> 189
/*      */     //   #1062	-> 191
/*      */     //   #884	-> 194
/*      */     //   #934	-> 214
/*      */     //   #1021	-> 217
/*      */     //   #196	-> 222
/*      */     //   #548	-> 225
/*      */     //   #491	-> 242
/*      */     //   #390	-> 270
/*      */     //   #109	-> 278
/*      */     //   #46	-> 281
/*      */     //   #980	-> 290
/*      */     //   #233	-> 314
/*      */     //   #470	-> 319
/*      */     //   #858	-> 322
/*      */     //   #100	-> 325
/*      */     //   #539	-> 331
/*      */     //   #766	-> 392
/*      */     //   #908	-> 402
/*      */     //   #1087	-> 409
/*      */     //   #10	-> 422
/*      */     //   #1084	-> 432
/*      */     //   #69	-> 435
/*      */     //   #507	-> 451
/*      */     //   #259	-> 461
/*      */     //   #436	-> 464
/*      */     //   #930	-> 480
/*      */     //   #431	-> 483
/*      */     //   #386	-> 502
/*      */     //   #551	-> 505
/*      */     //   #226	-> 524
/*      */     //   #806	-> 534
/*      */     //   #893	-> 537
/*      */     //   #445	-> 557
/*      */     //   #72	-> 565
/*      */     //   #1004	-> 574
/*      */     //   #774	-> 586
/*      */     // Exception table:
/*      */     //   from	to	target	type
/*      */     //   14	77	77	java/lang/IllegalStateException
/*      */     //   194	205	205	java/lang/IllegalStateException
/*      */     //   225	235	238	java/lang/IllegalStateException
/*      */     //   230	249	252	java/lang/IllegalStateException
/*      */     //   242	261	261	java/lang/IllegalStateException
/*      */     //   284	307	310	java/lang/IllegalStateException
/*      */     //   331	405	405	java/lang/IllegalStateException
/*      */   }
/*      */   
/*      */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*      */     return paramIllegalStateException;
/*      */   }
/*      */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\MethodWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */