/*     */ package org.spongepowered.asm.lib.tree.analysis;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.IincInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.InvokeDynamicInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.MethodInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.MultiANewArrayInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.VarInsnNode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Frame<V extends Value>
/*     */ {
/*     */   private V returnValue;
/*     */   private V[] values;
/*     */   private int locals;
/*     */   private int top;
/*     */   
/*     */   public Frame(int paramInt1, int paramInt2) {
/* 269 */     this.values = (V[])new Value[paramInt1 + paramInt2];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 276 */     this.locals = paramInt1; } public boolean merge(Frame<? extends V> paramFrame, boolean[] paramArrayOfboolean) { boolean bool = false; byte b = 0; while (true) { try { if (b < this.locals) { try { if (!paramArrayOfboolean[b] && !this.values[b].equals(paramFrame.values[b]))
/*     */               continue;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }
/*     */            }
/*     */         else { break; }
/*     */          }
/*     */       catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }
/* 282 */        b++; continue; this.values[b] = paramFrame.values[b]; bool = true; b++; }
/*     */     
/*     */     return bool; }
/*     */ 
/*     */   
/*     */   public String toString() {
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < getLocals()) {
/*     */         stringBuilder.append(getLocal(b));
/*     */         b++;
/*     */       } 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     stringBuilder.append(' ');
/*     */     b = 0;
/*     */     try {
/*     */       for (; b < getStackSize(); b++)
/*     */         stringBuilder.append(getStack(b).toString()); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public V pop() throws IndexOutOfBoundsException {
/*     */     try {
/*     */       if (this.top == 0)
/*     */         throw new IndexOutOfBoundsException("Cannot pop operand off an empty stack."); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return this.values[--this.top + this.locals];
/*     */   }
/*     */   
/*     */   public boolean merge(Frame<? extends V> paramFrame, Interpreter<V> paramInterpreter) throws AnalyzerException {
/*     */     try {
/*     */       if (this.top != paramFrame.top)
/*     */         throw new AnalyzerException(null, "Incompatible stack heights"); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     boolean bool = false;
/*     */     for (byte b = 0; b < this.locals + this.top; ) {
/*     */       V v = paramInterpreter.merge(this.values[b], paramFrame.values[b]);
/*     */       if (!v.equals(this.values[b])) {
/*     */         this.values[b] = v;
/*     */         bool = true;
/*     */       } 
/*     */     } 
/*     */     return bool;
/*     */   }
/*     */   
/*     */   public V getStack(int paramInt) throws IndexOutOfBoundsException {
/*     */     return this.values[paramInt + this.locals];
/*     */   }
/*     */   
/*     */   public int getStackSize() {
/*     */     return this.top;
/*     */   }
/*     */   
/*     */   public void setLocal(int paramInt, V paramV) throws IndexOutOfBoundsException {
/*     */     try {
/*     */       if (paramInt >= this.locals)
/*     */         throw new IndexOutOfBoundsException("Trying to access an inexistant local variable " + paramInt); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.values[paramInt] = paramV;
/*     */   }
/*     */   
/*     */   public int getLocals() {
/*     */     return this.locals;
/*     */   }
/*     */   
/*     */   public V getLocal(int paramInt) throws IndexOutOfBoundsException {
/*     */     try {
/*     */       if (paramInt >= this.locals)
/*     */         throw new IndexOutOfBoundsException("Trying to access an inexistant local variable"); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return this.values[paramInt];
/*     */   }
/*     */   
/*     */   public Frame<V> init(Frame<? extends V> paramFrame) {
/*     */     this.returnValue = paramFrame.returnValue;
/*     */     System.arraycopy(paramFrame.values, 0, this.values, 0, this.values.length);
/*     */     this.top = paramFrame.top;
/*     */     return this;
/*     */   }
/*     */   
/*     */   public int getMaxStackSize() {
/*     */     return this.values.length - this.locals;
/*     */   }
/*     */   
/*     */   public void execute(AbstractInsnNode paramAbstractInsnNode, Interpreter<V> paramInterpreter) throws AnalyzerException {
/*     */     try {
/*     */       V v1;
/*     */       V v2;
/*     */       int i;
/*     */       String str;
/*     */       int j;
/*     */       V v3;
/*     */       ArrayList<V> arrayList;
/*     */       int k;
/*     */       switch (paramAbstractInsnNode.getOpcode()) {
/*     */         case 0:
/*     */           return;
/*     */         case 1:
/*     */         case 2:
/*     */         case 3:
/*     */         case 4:
/*     */         case 5:
/*     */         case 6:
/*     */         case 7:
/*     */         case 8:
/*     */         case 9:
/*     */         case 10:
/*     */         case 11:
/*     */         case 12:
/*     */         case 13:
/*     */         case 14:
/*     */         case 15:
/*     */         case 16:
/*     */         case 17:
/*     */         case 18:
/*     */           push(paramInterpreter.newOperation(paramAbstractInsnNode));
/*     */         case 21:
/*     */         case 22:
/*     */         case 23:
/*     */         case 24:
/*     */         case 25:
/*     */           push(paramInterpreter.copyOperation(paramAbstractInsnNode, getLocal(((VarInsnNode)paramAbstractInsnNode).var)));
/*     */         case 46:
/*     */         case 47:
/*     */         case 48:
/*     */         case 49:
/*     */         case 50:
/*     */         case 51:
/*     */         case 52:
/*     */         case 53:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           push(paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1));
/*     */         case 54:
/*     */         case 55:
/*     */         case 56:
/*     */         case 57:
/*     */         case 58:
/*     */           v2 = paramInterpreter.copyOperation(paramAbstractInsnNode, pop());
/*     */           i = ((VarInsnNode)paramAbstractInsnNode).var;
/*     */           try {
/*     */             setLocal(i, v2);
/*     */             if (v2.getSize() == 2)
/*     */               setLocal(i + 1, paramInterpreter.newValue(null)); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           if (i > 0) {
/*     */             V v = getLocal(i - 1);
/*     */             try {
/*     */               if (v != null)
/*     */                 try {
/*     */                   if (v.getSize() == 2)
/*     */                     setLocal(i - 1, paramInterpreter.newValue(null)); 
/*     */                 } catch (AnalyzerException analyzerException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (AnalyzerException analyzerException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         case 79:
/*     */         case 80:
/*     */         case 81:
/*     */         case 82:
/*     */         case 83:
/*     */         case 84:
/*     */         case 85:
/*     */         case 86:
/*     */           v3 = pop();
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           paramInterpreter.ternaryOperation(paramAbstractInsnNode, v2, v1, v3);
/*     */         case 87:
/*     */           try {
/*     */             if (pop().getSize() == 2)
/*     */               throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of POP"); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 88:
/*     */           try {
/*     */             if (pop().getSize() == 1)
/*     */               try {
/*     */                 if (pop().getSize() != 1)
/*     */                   throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of POP2"); 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               }  
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 89:
/*     */           v2 = pop();
/*     */           try {
/*     */             if (v2.getSize() != 1)
/*     */               throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP"); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(v2);
/*     */           push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */         case 90:
/*     */           v2 = pop();
/*     */           v1 = pop();
/*     */           try {
/*     */             if (v2.getSize() == 1) {
/*     */               try {
/*     */                 if (v1.getSize() != 1)
/*     */                   throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP_X1"); 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } else {
/*     */               throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP_X1");
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */           push(v1);
/*     */           push(v2);
/*     */         case 91:
/*     */           v2 = pop();
/*     */           if (v2.getSize() == 1) {
/*     */             v1 = pop();
/*     */             if (v1.getSize() == 1) {
/*     */               v3 = pop();
/*     */               try {
/*     */                 if (v3.getSize() == 1) {
/*     */                   push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */                   push(v3);
/*     */                   push(v1);
/*     */                   push(v2);
/*     */                 } else {
/*     */                   throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP_X2");
/*     */                 } 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } else {
/*     */               push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */               push(v1);
/*     */               push(v2);
/*     */             } 
/*     */           } 
/*     */           throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP_X2");
/*     */         case 92:
/*     */           v2 = pop();
/*     */           if (v2.getSize() == 1) {
/*     */             v1 = pop();
/*     */             try {
/*     */               if (v1.getSize() == 1) {
/*     */                 push(v1);
/*     */                 push(v2);
/*     */               } 
/*     */             } catch (AnalyzerException analyzerException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } else {
/*     */             push(v2);
/*     */             push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */           } 
/*     */           throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP2");
/*     */         case 93:
/*     */           v2 = pop();
/*     */           if (v2.getSize() == 1) {
/*     */             v1 = pop();
/*     */             if (v1.getSize() == 1) {
/*     */               v3 = pop();
/*     */               try {
/*     */                 if (v3.getSize() == 1) {
/*     */                   push(paramInterpreter.copyOperation(paramAbstractInsnNode, v1));
/*     */                   push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */                 } 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } 
/*     */           } 
/*     */           v1 = pop();
/*     */           try {
/*     */             if (v1.getSize() == 1) {
/*     */               push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */               push(v1);
/*     */               push(v2);
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP2_X1");
/*     */         case 94:
/*     */           v2 = pop();
/*     */           if (v2.getSize() == 1) {
/*     */             v1 = pop();
/*     */             if (v1.getSize() == 1) {
/*     */               v3 = pop();
/*     */               if (v3.getSize() == 1) {
/*     */                 V v = pop();
/*     */                 try {
/*     */                   if (v.getSize() == 1) {
/*     */                     push(paramInterpreter.copyOperation(paramAbstractInsnNode, v1));
/*     */                     push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */                     push(v);
/*     */                   } 
/*     */                 } catch (AnalyzerException analyzerException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */               push(paramInterpreter.copyOperation(paramAbstractInsnNode, v1));
/*     */             } 
/*     */           } else {
/*     */             v1 = pop();
/*     */             if (v1.getSize() == 1) {
/*     */               v3 = pop();
/*     */               try {
/*     */                 if (v3.getSize() == 1) {
/*     */                   push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */                   push(v3);
/*     */                   push(v1);
/*     */                 } 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } else {
/*     */               push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */               push(v1);
/*     */               push(v2);
/*     */             } 
/*     */           } 
/*     */           throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of DUP2_X2");
/*     */         case 95:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           try {
/*     */             if (v2.getSize() == 1) {
/*     */               try {
/*     */                 if (v1.getSize() != 1)
/*     */                   throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of SWAP"); 
/*     */               } catch (AnalyzerException analyzerException) {
/*     */                 throw b(null);
/*     */               } 
/*     */             } else {
/*     */               throw new AnalyzerException(paramAbstractInsnNode, "Illegal use of SWAP");
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(paramInterpreter.copyOperation(paramAbstractInsnNode, v1));
/*     */           push(paramInterpreter.copyOperation(paramAbstractInsnNode, v2));
/*     */         case 96:
/*     */         case 97:
/*     */         case 98:
/*     */         case 99:
/*     */         case 100:
/*     */         case 101:
/*     */         case 102:
/*     */         case 103:
/*     */         case 104:
/*     */         case 105:
/*     */         case 106:
/*     */         case 107:
/*     */         case 108:
/*     */         case 109:
/*     */         case 110:
/*     */         case 111:
/*     */         case 112:
/*     */         case 113:
/*     */         case 114:
/*     */         case 115:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           push(paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1));
/*     */         case 116:
/*     */         case 117:
/*     */         case 118:
/*     */         case 119:
/*     */           push(paramInterpreter.unaryOperation(paramAbstractInsnNode, pop()));
/*     */         case 120:
/*     */         case 121:
/*     */         case 122:
/*     */         case 123:
/*     */         case 124:
/*     */         case 125:
/*     */         case 126:
/*     */         case 127:
/*     */         case 128:
/*     */         case 129:
/*     */         case 130:
/*     */         case 131:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           push(paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1));
/*     */         case 132:
/*     */           i = ((IincInsnNode)paramAbstractInsnNode).var;
/*     */           setLocal(i, paramInterpreter.unaryOperation(paramAbstractInsnNode, getLocal(i)));
/*     */         case 133:
/*     */         case 134:
/*     */         case 135:
/*     */         case 136:
/*     */         case 137:
/*     */         case 138:
/*     */         case 139:
/*     */         case 140:
/*     */         case 141:
/*     */         case 142:
/*     */         case 143:
/*     */         case 144:
/*     */         case 145:
/*     */         case 146:
/*     */         case 147:
/*     */           push(paramInterpreter.unaryOperation(paramAbstractInsnNode, pop()));
/*     */         case 148:
/*     */         case 149:
/*     */         case 150:
/*     */         case 151:
/*     */         case 152:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           push(paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1));
/*     */         case 153:
/*     */         case 154:
/*     */         case 155:
/*     */         case 156:
/*     */         case 157:
/*     */         case 158:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */         case 159:
/*     */         case 160:
/*     */         case 161:
/*     */         case 162:
/*     */         case 163:
/*     */         case 164:
/*     */         case 165:
/*     */         case 166:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1);
/*     */         case 167:
/*     */           return;
/*     */         case 168:
/*     */           push(paramInterpreter.newOperation(paramAbstractInsnNode));
/*     */         case 169:
/*     */           return;
/*     */         case 170:
/*     */         case 171:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */         case 172:
/*     */         case 173:
/*     */         case 174:
/*     */         case 175:
/*     */         case 176:
/*     */           v2 = pop();
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, v2);
/*     */           paramInterpreter.returnOperation(paramAbstractInsnNode, v2, this.returnValue);
/*     */         case 177:
/*     */           try {
/*     */             if (this.returnValue != null)
/*     */               throw new AnalyzerException(paramAbstractInsnNode, "Incompatible return type"); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 178:
/*     */           push(paramInterpreter.newOperation(paramAbstractInsnNode));
/*     */         case 179:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */         case 180:
/*     */           push(paramInterpreter.unaryOperation(paramAbstractInsnNode, pop()));
/*     */         case 181:
/*     */           v1 = pop();
/*     */           v2 = pop();
/*     */           paramInterpreter.binaryOperation(paramAbstractInsnNode, v2, v1);
/*     */         case 182:
/*     */         case 183:
/*     */         case 184:
/*     */         case 185:
/*     */           arrayList = new ArrayList();
/*     */           str = ((MethodInsnNode)paramAbstractInsnNode).desc;
/*     */           k = (Type.getArgumentTypes(str)).length;
/*     */           try {
/*     */             while (k > 0) {
/*     */               arrayList.add(0, pop());
/*     */               k--;
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           try {
/*     */             if (paramAbstractInsnNode.getOpcode() != 184)
/*     */               arrayList.add(0, pop()); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           try {
/*     */             if (Type.getReturnType(str) == Type.VOID_TYPE) {
/*     */               paramInterpreter.naryOperation(paramAbstractInsnNode, arrayList);
/*     */             } else {
/*     */               push(paramInterpreter.naryOperation(paramAbstractInsnNode, arrayList));
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 186:
/*     */           arrayList = new ArrayList<V>();
/*     */           str = ((InvokeDynamicInsnNode)paramAbstractInsnNode).desc;
/*     */           k = (Type.getArgumentTypes(str)).length;
/*     */           try {
/*     */             while (k > 0) {
/*     */               arrayList.add(0, pop());
/*     */               k--;
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           try {
/*     */             if (Type.getReturnType(str) == Type.VOID_TYPE) {
/*     */               paramInterpreter.naryOperation(paramAbstractInsnNode, arrayList);
/*     */             } else {
/*     */               push(paramInterpreter.naryOperation(paramAbstractInsnNode, arrayList));
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */         case 187:
/*     */           push(paramInterpreter.newOperation(paramAbstractInsnNode));
/*     */         case 188:
/*     */         case 189:
/*     */         case 190:
/*     */           push(paramInterpreter.unaryOperation(paramAbstractInsnNode, pop()));
/*     */         case 191:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */         case 192:
/*     */         case 193:
/*     */           push(paramInterpreter.unaryOperation(paramAbstractInsnNode, pop()));
/*     */         case 194:
/*     */         case 195:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */         case 197:
/*     */           arrayList = new ArrayList<V>();
/*     */           j = ((MultiANewArrayInsnNode)paramAbstractInsnNode).dims;
/*     */           try {
/*     */             while (j > 0) {
/*     */               arrayList.add(0, pop());
/*     */               j--;
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           push(paramInterpreter.naryOperation(paramAbstractInsnNode, arrayList));
/*     */         case 198:
/*     */         case 199:
/*     */           paramInterpreter.unaryOperation(paramAbstractInsnNode, pop());
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new RuntimeException("Illegal opcode " + paramAbstractInsnNode.getOpcode());
/*     */   }
/*     */   
/*     */   public void push(V paramV) throws IndexOutOfBoundsException {
/*     */     try {
/*     */       if (this.top + this.locals >= this.values.length)
/*     */         throw new IndexOutOfBoundsException("Insufficient maximum stack size."); 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.values[this.top++ + this.locals] = paramV;
/*     */   }
/*     */   
/*     */   public Frame(Frame<? extends V> paramFrame) {
/*     */     this(paramFrame.locals, paramFrame.values.length - paramFrame.locals);
/*     */     init(paramFrame);
/*     */   }
/*     */   
/*     */   public void clearStack() {
/*     */     this.top = 0;
/*     */   }
/*     */   
/*     */   public void setReturn(V paramV) {
/*     */     this.returnValue = paramV;
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\Frame.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */