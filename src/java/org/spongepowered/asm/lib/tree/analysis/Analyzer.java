/*     */ package org.spongepowered.asm.lib.tree.analysis;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import org.spongepowered.asm.lib.Opcodes;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.InsnList;
/*     */ import org.spongepowered.asm.lib.tree.JumpInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.MethodNode;
/*     */ import org.spongepowered.asm.lib.tree.TryCatchBlockNode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Analyzer<V extends Value>
/*     */   implements Opcodes
/*     */ {
/*     */   private final Interpreter<V> interpreter;
/*     */   private int n;
/*     */   private InsnList insns;
/*     */   private List<TryCatchBlockNode>[] handlers;
/*     */   private Frame<V>[] frames;
/*     */   private Subroutine[] subroutines;
/*     */   private boolean[] queued;
/*     */   private int[] queue;
/*     */   private int top;
/*     */   
/*     */   private void findSubroutine(int paramInt, Subroutine paramSubroutine, List<AbstractInsnNode> paramList) throws AnalyzerException {
/*     */     while (true) {
/*     */       try {
/*  48 */         if (paramInt >= 0) try { if (paramInt < this.n) {
/*     */ 
/*     */               
/*     */               try {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 108 */                 if (this.subroutines[paramInt] != null)
/*     */                 {
/*     */                   return;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*     */               }
/*     */               catch (AnalyzerException analyzerException) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 183 */                 throw b(null);
/*     */               } 
/*     */               continue;
/*     */             } 
/*     */             throw new AnalyzerException(null, "Execution can fall off end of the code"); }
/*     */           catch (AnalyzerException analyzerException)
/*     */           { throw b(null); }
/*     */            
/*     */       } catch (AnalyzerException analyzerException) {
/*     */         throw b(null);
/*     */       } 
/*     */       throw new AnalyzerException(null, "Execution can fall off end of the code");
/*     */       this.subroutines[paramInt] = paramSubroutine.copy();
/*     */       abstractInsnNode = this.insns.get(paramInt);
/*     */     } 
/*     */   } public List<TryCatchBlockNode> getHandlers(int paramInt) { return this.handlers[paramInt]; } private void merge(int paramInt, Frame<V> paramFrame, Subroutine paramSubroutine) throws AnalyzerException {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield frames : [Lorg/spongepowered/asm/lib/tree/analysis/Frame;
/*     */     //   4: iload_1
/*     */     //   5: aaload
/*     */     //   6: astore #4
/*     */     //   8: aload_0
/*     */     //   9: getfield subroutines : [Lorg/spongepowered/asm/lib/tree/analysis/Subroutine;
/*     */     //   12: iload_1
/*     */     //   13: aaload
/*     */     //   14: astore #5
/*     */     //   16: aload #4
/*     */     //   18: ifnonnull -> 38
/*     */     //   21: aload_0
/*     */     //   22: getfield frames : [Lorg/spongepowered/asm/lib/tree/analysis/Frame;
/*     */     //   25: iload_1
/*     */     //   26: aload_0
/*     */     //   27: aload_2
/*     */     //   28: invokevirtual newFrame : (Lorg/spongepowered/asm/lib/tree/analysis/Frame;)Lorg/spongepowered/asm/lib/tree/analysis/Frame;
/*     */     //   31: aastore
/*     */     //   32: iconst_1
/*     */     //   33: istore #6
/*     */     //   35: goto -> 50
/*     */     //   38: aload #4
/*     */     //   40: aload_2
/*     */     //   41: aload_0
/*     */     //   42: getfield interpreter : Lorg/spongepowered/asm/lib/tree/analysis/Interpreter;
/*     */     //   45: invokevirtual merge : (Lorg/spongepowered/asm/lib/tree/analysis/Frame;Lorg/spongepowered/asm/lib/tree/analysis/Interpreter;)Z
/*     */     //   48: istore #6
/*     */     //   50: aload #5
/*     */     //   52: ifnonnull -> 82
/*     */     //   55: aload_3
/*     */     //   56: ifnull -> 97
/*     */     //   59: goto -> 66
/*     */     //   62: invokestatic b : (Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;)Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;
/*     */     //   65: athrow
/*     */     //   66: aload_0
/*     */     //   67: getfield subroutines : [Lorg/spongepowered/asm/lib/tree/analysis/Subroutine;
/*     */     //   70: iload_1
/*     */     //   71: aload_3
/*     */     //   72: invokevirtual copy : ()Lorg/spongepowered/asm/lib/tree/analysis/Subroutine;
/*     */     //   75: aastore
/*     */     //   76: iconst_1
/*     */     //   77: istore #6
/*     */     //   79: goto -> 97
/*     */     //   82: aload_3
/*     */     //   83: ifnull -> 97
/*     */     //   86: iload #6
/*     */     //   88: aload #5
/*     */     //   90: aload_3
/*     */     //   91: invokevirtual merge : (Lorg/spongepowered/asm/lib/tree/analysis/Subroutine;)Z
/*     */     //   94: ior
/*     */     //   95: istore #6
/*     */     //   97: iload #6
/*     */     //   99: ifeq -> 149
/*     */     //   102: aload_0
/*     */     //   103: getfield queued : [Z
/*     */     //   106: iload_1
/*     */     //   107: baload
/*     */     //   108: ifne -> 149
/*     */     //   111: goto -> 118
/*     */     //   114: invokestatic b : (Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;)Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;
/*     */     //   117: athrow
/*     */     //   118: aload_0
/*     */     //   119: getfield queued : [Z
/*     */     //   122: iload_1
/*     */     //   123: iconst_1
/*     */     //   124: bastore
/*     */     //   125: aload_0
/*     */     //   126: getfield queue : [I
/*     */     //   129: aload_0
/*     */     //   130: dup
/*     */     //   131: getfield top : I
/*     */     //   134: dup_x1
/*     */     //   135: iconst_1
/*     */     //   136: iadd
/*     */     //   137: putfield top : I
/*     */     //   140: iload_1
/*     */     //   141: iastore
/*     */     //   142: goto -> 149
/*     */     //   145: invokestatic b : (Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;)Lorg/spongepowered/asm/lib/tree/analysis/AnalyzerException;
/*     */     //   148: athrow
/*     */     //   149: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #93	-> 0
/*     */     //   #33	-> 8
/*     */     //   #157	-> 16
/*     */     //   #131	-> 21
/*     */     //   #7	-> 32
/*     */     //   #187	-> 38
/*     */     //   #222	-> 50
/*     */     //   #191	-> 55
/*     */     //   #72	-> 66
/*     */     //   #61	-> 76
/*     */     //   #59	-> 82
/*     */     //   #98	-> 86
/*     */     //   #81	-> 97
/*     */     //   #62	-> 118
/*     */     //   #174	-> 125
/*     */     //   #130	-> 149
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   50	59	62	org/spongepowered/asm/lib/tree/analysis/AnalyzerException
/*     */     //   97	111	114	org/spongepowered/asm/lib/tree/analysis/AnalyzerException
/*     */     //   102	142	145	org/spongepowered/asm/lib/tree/analysis/AnalyzerException
/*     */   } protected Frame<V> newFrame(Frame<? extends V> paramFrame) {
/*     */     return new Frame<V>(paramFrame);
/*     */   } protected Frame<V> newFrame(int paramInt1, int paramInt2) {
/*     */     return new Frame<V>(paramInt1, paramInt2);
/*     */   } protected void newControlFlowEdge(int paramInt1, int paramInt2) {} public Frame<V>[] analyze(String paramString, MethodNode paramMethodNode) throws AnalyzerException {
/*     */     try {
/*     */       if ((paramMethodNode.access & 0x500) != 0) {
/*     */         this.frames = (Frame<V>[])new Frame[0];
/*     */         return this.frames;
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.n = paramMethodNode.instructions.size();
/* 214 */     this.insns = paramMethodNode.instructions; this.handlers = (List<TryCatchBlockNode>[])new List[this.n]; this.frames = (Frame<V>[])new Frame[this.n]; this.subroutines = new Subroutine[this.n]; this.queued = new boolean[this.n]; this.queue = new int[this.n]; this.top = 0; for (byte b1 = 0; b1 < paramMethodNode.tryCatchBlocks.size(); ) { TryCatchBlockNode tryCatchBlockNode = paramMethodNode.tryCatchBlocks.get(b1); int j = this.insns.indexOf((AbstractInsnNode)tryCatchBlockNode.start); int k = this.insns.indexOf((AbstractInsnNode)tryCatchBlockNode.end); }  Subroutine subroutine = new Subroutine(null, paramMethodNode.maxLocals, null); ArrayList<AbstractInsnNode> arrayList = new ArrayList(); HashMap<Object, Object> hashMap = new HashMap<Object, Object>(); findSubroutine(0, subroutine, arrayList); for (; !arrayList.isEmpty(); subroutine1 = (Subroutine)hashMap.get(jumpInsnNode.label)) { Subroutine subroutine1; JumpInsnNode jumpInsnNode = (JumpInsnNode)arrayList.remove(0); }  byte b2 = 0; while (true) { try { if (b2 < this.n) { try { if (this.subroutines[b2] != null)
/*     */               try { if ((this.subroutines[b2]).start == null)
/*     */                   this.subroutines[b2] = null;  } catch (AnalyzerException analyzerException) { throw b(null); }   } catch (AnalyzerException analyzerException) { throw b(null); }  b2++; }
/*     */          }
/*     */       catch (AnalyzerException analyzerException) { throw b(null); }
/*     */        break; }
/* 220 */      Frame<V> frame1 = newFrame(paramMethodNode.maxLocals, paramMethodNode.maxStack);
/*     */     Frame<V> frame2 = newFrame(paramMethodNode.maxLocals, paramMethodNode.maxStack);
/*     */     frame1.setReturn(this.interpreter.newValue(Type.getReturnType(paramMethodNode.desc)));
/*     */     Type[] arrayOfType = Type.getArgumentTypes(paramMethodNode.desc);
/*     */     byte b3 = 0;
/*     */     if ((paramMethodNode.access & 0x8) == 0) {
/*     */       Type type = Type.getObjectType(paramString);
/*     */       frame1.setLocal(b3++, this.interpreter.newValue(type));
/*     */     } 
/*     */     int i = 0;
/*     */     while (true) {
/*     */       try {
/*     */         if (i < arrayOfType.length) {
/*     */           try {
/*     */             frame1.setLocal(b3++, this.interpreter.newValue(arrayOfType[i]));
/*     */             if (arrayOfType[i].getSize() == 2)
/*     */               frame1.setLocal(b3++, this.interpreter.newValue(null)); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           i++;
/*     */           continue;
/*     */         } 
/*     */       } catch (AnalyzerException analyzerException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     try {
/*     */       while (b3 < paramMethodNode.maxLocals)
/*     */         frame1.setLocal(b3++, this.interpreter.newValue(null)); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     merge(0, frame1, null);
/*     */     init(paramString, paramMethodNode);
/*     */     while (this.top > 0) {
/*     */       continue;
/*     */       i = this.queue[--this.top];
/*     */       frame = this.frames[i];
/*     */       subroutine1 = this.subroutines[i];
/*     */       this.queued[i] = false;
/*     */       object = null;
/*     */     } 
/*     */     return this.frames;
/*     */   }
/*     */   
/*     */   public Frame<V>[] getFrames() {
/*     */     return this.frames;
/*     */   }
/*     */   
/*     */   protected boolean newControlFlowExceptionEdge(int paramInt1, int paramInt2) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private void merge(int paramInt, Frame<V> paramFrame1, Frame<V> paramFrame2, Subroutine paramSubroutine, boolean[] paramArrayOfboolean) throws AnalyzerException {
/*     */     boolean bool;
/*     */     Frame<V> frame = this.frames[paramInt];
/*     */     Subroutine subroutine = this.subroutines[paramInt];
/*     */     paramFrame2.merge(paramFrame1, paramArrayOfboolean);
/*     */     if (frame == null) {
/*     */       this.frames[paramInt] = newFrame(paramFrame2);
/*     */       bool = true;
/*     */     } else {
/*     */       bool = frame.merge(paramFrame2, this.interpreter);
/*     */     } 
/*     */     try {
/*     */       if (subroutine != null && paramSubroutine != null)
/*     */         bool |= subroutine.merge(paramSubroutine); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (bool)
/*     */         try {
/*     */           if (!this.queued[paramInt]) {
/*     */             this.queued[paramInt] = true;
/*     */             this.queue[this.top++] = paramInt;
/*     */           } 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Analyzer(Interpreter<V> paramInterpreter) {
/*     */     this.interpreter = paramInterpreter;
/*     */   }
/*     */   
/*     */   protected boolean newControlFlowExceptionEdge(int paramInt, TryCatchBlockNode paramTryCatchBlockNode) {
/*     */     return newControlFlowExceptionEdge(paramInt, this.insns.indexOf((AbstractInsnNode)paramTryCatchBlockNode.handler));
/*     */   }
/*     */   
/*     */   protected void init(String paramString, MethodNode paramMethodNode) throws AnalyzerException {}
/*     */   
/*     */   private static AnalyzerException b(AnalyzerException paramAnalyzerException) {
/*     */     return paramAnalyzerException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\Analyzer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */