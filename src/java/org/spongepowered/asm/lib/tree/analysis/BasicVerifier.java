/*     */ package org.spongepowered.asm.lib.tree.analysis;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*     */ 
/*     */ public class BasicVerifier extends BasicInterpreter {
/*     */   protected boolean isArrayValue(BasicValue paramBasicValue) {
/*   7 */     return paramBasicValue.isReference();
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
/*     */   public BasicValue naryOperation(AbstractInsnNode paramAbstractInsnNode, List<? extends BasicValue> paramList) throws AnalyzerException {
/*  41 */     int i = paramAbstractInsnNode.getOpcode();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  71 */     if (i == 197)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 150 */       byte b = 0; while (true) { try { if (b < paramList.size()) {
/*     */             try {
/*     */               if (!BasicValue.INT_VALUE.equals(paramList.get(b))) {
/*     */                 throw new AnalyzerException(paramAbstractInsnNode, null, BasicValue.INT_VALUE, (Value)paramList.get(b));
/*     */               }
/*     */             } catch (AnalyzerException analyzerException) {
/*     */               throw b(null);
/*     */             } 
/*     */ 
/*     */ 
/*     */             
/*     */             b++;
/*     */           }  }
/*     */         catch (AnalyzerException analyzerException)
/*     */         { throw b(null); }
/*     */ 
/*     */ 
/*     */         
/*     */         break; }
/*     */        }
/*     */     else
/* 171 */     { byte b = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 176 */       boolean bool = false; try { if (i != 184 && i != 186) { Type type = Type.getObjectType(((MethodInsnNode)paramAbstractInsnNode).owner); try { if (!isSubTypeOf(paramList.get(b++), newValue(type))) throw new AnalyzerException(paramAbstractInsnNode, "Method owner", newValue(type), (Value)paramList.get(0));  } catch (AnalyzerException analyzerException) { throw b(null); }  }  } catch (AnalyzerException analyzerException) { throw b(null); }  }  return super.naryOperation(paramAbstractInsnNode, paramList); } public BasicValue copyOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue) throws AnalyzerException { BasicValue basicValue; switch (paramAbstractInsnNode.getOpcode()) { case 21: case 54: basicValue = BasicValue.INT_VALUE; break;case 23: case 56: basicValue = BasicValue.FLOAT_VALUE; break;case 22: case 55: basicValue = BasicValue.LONG_VALUE; break;case 24: case 57: basicValue = BasicValue.DOUBLE_VALUE; break;case 25: try { if (!paramBasicValue.isReference()) throw new AnalyzerException(paramAbstractInsnNode, null, "an object reference", paramBasicValue);  } catch (AnalyzerException analyzerException) { throw b(null); }  return paramBasicValue;case 58: try { if (!paramBasicValue.isReference()) try { if (!BasicValue.RETURNADDRESS_VALUE.equals(paramBasicValue)) throw new AnalyzerException(paramAbstractInsnNode, null, "an object reference or a return address", paramBasicValue);  } catch (AnalyzerException analyzerException) { throw b(null); }   } catch (AnalyzerException analyzerException) { throw b(null); }  return paramBasicValue;default: return paramBasicValue; }  try { if (!basicValue.equals(paramBasicValue))
/* 177 */         throw new AnalyzerException(paramAbstractInsnNode, null, basicValue, paramBasicValue);  } catch (AnalyzerException analyzerException) { throw b(null); }  return paramBasicValue; }
/*     */ 
/*     */   
/*     */   protected BasicValue getElementValue(BasicValue paramBasicValue) throws AnalyzerException {
/*     */     return BasicValue.REFERENCE_VALUE;
/*     */   }
/*     */   
/*     */   protected boolean isSubTypeOf(BasicValue paramBasicValue1, BasicValue paramBasicValue2) {
/*     */     return paramBasicValue1.equals(paramBasicValue2);
/*     */   }
/*     */   
/*     */   protected BasicVerifier(int paramInt) {
/*     */     super(paramInt);
/*     */   }
/*     */   
/*     */   public BasicVerifier() {
/*     */     super(327680);
/*     */   }
/*     */   
/*     */   public void returnOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2) throws AnalyzerException {
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue1, paramBasicValue2))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "Incompatible return type", paramBasicValue2, paramBasicValue1); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public BasicValue unaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue) throws AnalyzerException {
/*     */     BasicValue basicValue;
/*     */     switch (paramAbstractInsnNode.getOpcode()) {
/*     */       case 116:
/*     */       case 132:
/*     */       case 133:
/*     */       case 134:
/*     */       case 135:
/*     */       case 145:
/*     */       case 146:
/*     */       case 147:
/*     */       case 153:
/*     */       case 154:
/*     */       case 155:
/*     */       case 156:
/*     */       case 157:
/*     */       case 158:
/*     */       case 170:
/*     */       case 171:
/*     */       case 172:
/*     */       case 188:
/*     */       case 189:
/*     */         basicValue = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 118:
/*     */       case 139:
/*     */       case 140:
/*     */       case 141:
/*     */       case 174:
/*     */         basicValue = BasicValue.FLOAT_VALUE;
/*     */         break;
/*     */       case 117:
/*     */       case 136:
/*     */       case 137:
/*     */       case 138:
/*     */       case 173:
/*     */         basicValue = BasicValue.LONG_VALUE;
/*     */         break;
/*     */       case 119:
/*     */       case 142:
/*     */       case 143:
/*     */       case 144:
/*     */       case 175:
/*     */         basicValue = BasicValue.DOUBLE_VALUE;
/*     */         break;
/*     */       case 180:
/*     */         basicValue = newValue(Type.getObjectType(((FieldInsnNode)paramAbstractInsnNode).owner));
/*     */         break;
/*     */       case 192:
/*     */         try {
/*     */           if (!paramBasicValue.isReference())
/*     */             throw new AnalyzerException(paramAbstractInsnNode, null, "an object reference", paramBasicValue); 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw b(null);
/*     */         } 
/*     */         return super.unaryOperation(paramAbstractInsnNode, paramBasicValue);
/*     */       case 190:
/*     */         try {
/*     */           if (!isArrayValue(paramBasicValue))
/*     */             throw new AnalyzerException(paramAbstractInsnNode, null, "an array reference", paramBasicValue); 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw b(null);
/*     */         } 
/*     */         return super.unaryOperation(paramAbstractInsnNode, paramBasicValue);
/*     */       case 176:
/*     */       case 191:
/*     */       case 193:
/*     */       case 194:
/*     */       case 195:
/*     */       case 198:
/*     */       case 199:
/*     */         try {
/*     */           if (!paramBasicValue.isReference())
/*     */             throw new AnalyzerException(paramAbstractInsnNode, null, "an object reference", paramBasicValue); 
/*     */         } catch (AnalyzerException analyzerException) {
/*     */           throw b(null);
/*     */         } 
/*     */         return super.unaryOperation(paramAbstractInsnNode, paramBasicValue);
/*     */       case 179:
/*     */         basicValue = newValue(Type.getType(((FieldInsnNode)paramAbstractInsnNode).desc));
/*     */         break;
/*     */       default:
/*     */         throw new Error("Internal error.");
/*     */     } 
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue, basicValue))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, null, basicValue, paramBasicValue); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return super.unaryOperation(paramAbstractInsnNode, paramBasicValue);
/*     */   }
/*     */   
/*     */   public BasicValue binaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2) throws AnalyzerException {
/*     */     BasicValue basicValue1;
/*     */     BasicValue basicValue2;
/*     */     FieldInsnNode fieldInsnNode;
/*     */     switch (paramAbstractInsnNode.getOpcode()) {
/*     */       case 46:
/*     */         basicValue1 = newValue(Type.getType("[I"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 51:
/*     */         if (isSubTypeOf(paramBasicValue1, newValue(Type.getType("[Z")))) {
/*     */           basicValue1 = newValue(Type.getType("[Z"));
/*     */         } else {
/*     */           basicValue1 = newValue(Type.getType("[B"));
/*     */         } 
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 52:
/*     */         basicValue1 = newValue(Type.getType("[C"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 53:
/*     */         basicValue1 = newValue(Type.getType("[S"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 47:
/*     */         basicValue1 = newValue(Type.getType("[J"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 48:
/*     */         basicValue1 = newValue(Type.getType("[F"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 49:
/*     */         basicValue1 = newValue(Type.getType("[D"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 50:
/*     */         basicValue1 = newValue(Type.getType("[Ljava/lang/Object;"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 96:
/*     */       case 100:
/*     */       case 104:
/*     */       case 108:
/*     */       case 112:
/*     */       case 120:
/*     */       case 122:
/*     */       case 124:
/*     */       case 126:
/*     */       case 128:
/*     */       case 130:
/*     */       case 159:
/*     */       case 160:
/*     */       case 161:
/*     */       case 162:
/*     */       case 163:
/*     */       case 164:
/*     */         basicValue1 = BasicValue.INT_VALUE;
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 98:
/*     */       case 102:
/*     */       case 106:
/*     */       case 110:
/*     */       case 114:
/*     */       case 149:
/*     */       case 150:
/*     */         basicValue1 = BasicValue.FLOAT_VALUE;
/*     */         basicValue2 = BasicValue.FLOAT_VALUE;
/*     */         break;
/*     */       case 97:
/*     */       case 101:
/*     */       case 105:
/*     */       case 109:
/*     */       case 113:
/*     */       case 127:
/*     */       case 129:
/*     */       case 131:
/*     */       case 148:
/*     */         basicValue1 = BasicValue.LONG_VALUE;
/*     */         basicValue2 = BasicValue.LONG_VALUE;
/*     */         break;
/*     */       case 121:
/*     */       case 123:
/*     */       case 125:
/*     */         basicValue1 = BasicValue.LONG_VALUE;
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 99:
/*     */       case 103:
/*     */       case 107:
/*     */       case 111:
/*     */       case 115:
/*     */       case 151:
/*     */       case 152:
/*     */         basicValue1 = BasicValue.DOUBLE_VALUE;
/*     */         basicValue2 = BasicValue.DOUBLE_VALUE;
/*     */         break;
/*     */       case 165:
/*     */       case 166:
/*     */         basicValue1 = BasicValue.REFERENCE_VALUE;
/*     */         basicValue2 = BasicValue.REFERENCE_VALUE;
/*     */         break;
/*     */       case 181:
/*     */         fieldInsnNode = (FieldInsnNode)paramAbstractInsnNode;
/*     */         basicValue1 = newValue(Type.getObjectType(fieldInsnNode.owner));
/*     */         basicValue2 = newValue(Type.getType(fieldInsnNode.desc));
/*     */         break;
/*     */       default:
/*     */         throw new Error("Internal error.");
/*     */     } 
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue1, basicValue1))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "First argument", basicValue1, paramBasicValue1); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue2, basicValue2))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "Second argument", basicValue2, paramBasicValue2); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramAbstractInsnNode.getOpcode() == 50)
/*     */         return getElementValue(paramBasicValue1); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return super.binaryOperation(paramAbstractInsnNode, paramBasicValue1, paramBasicValue2);
/*     */   }
/*     */   
/*     */   public BasicValue ternaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2, BasicValue paramBasicValue3) throws AnalyzerException {
/*     */     BasicValue basicValue1;
/*     */     BasicValue basicValue2;
/*     */     switch (paramAbstractInsnNode.getOpcode()) {
/*     */       case 79:
/*     */         basicValue1 = newValue(Type.getType("[I"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 84:
/*     */         if (isSubTypeOf(paramBasicValue1, newValue(Type.getType("[Z")))) {
/*     */           basicValue1 = newValue(Type.getType("[Z"));
/*     */         } else {
/*     */           basicValue1 = newValue(Type.getType("[B"));
/*     */         } 
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 85:
/*     */         basicValue1 = newValue(Type.getType("[C"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 86:
/*     */         basicValue1 = newValue(Type.getType("[S"));
/*     */         basicValue2 = BasicValue.INT_VALUE;
/*     */         break;
/*     */       case 80:
/*     */         basicValue1 = newValue(Type.getType("[J"));
/*     */         basicValue2 = BasicValue.LONG_VALUE;
/*     */         break;
/*     */       case 81:
/*     */         basicValue1 = newValue(Type.getType("[F"));
/*     */         basicValue2 = BasicValue.FLOAT_VALUE;
/*     */         break;
/*     */       case 82:
/*     */         basicValue1 = newValue(Type.getType("[D"));
/*     */         basicValue2 = BasicValue.DOUBLE_VALUE;
/*     */         break;
/*     */       case 83:
/*     */         basicValue1 = paramBasicValue1;
/*     */         basicValue2 = BasicValue.REFERENCE_VALUE;
/*     */         break;
/*     */       default:
/*     */         throw new Error("Internal error.");
/*     */     } 
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue1, basicValue1))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "First argument", "a " + basicValue1 + " array reference", paramBasicValue1); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (!BasicValue.INT_VALUE.equals(paramBasicValue2))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "Second argument", BasicValue.INT_VALUE, paramBasicValue2); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (!isSubTypeOf(paramBasicValue3, basicValue2))
/*     */         throw new AnalyzerException(paramAbstractInsnNode, "Third argument", basicValue2, paramBasicValue3); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private static AnalyzerException b(AnalyzerException paramAnalyzerException) {
/*     */     return paramAnalyzerException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\BasicVerifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */