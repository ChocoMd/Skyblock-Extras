/*     */ package org.spongepowered.asm.lib.tree.analysis;
/*     */ import java.util.List;
/*     */ import org.spongepowered.asm.lib.Type;
/*     */ import org.spongepowered.asm.lib.tree.AbstractInsnNode;
/*     */ import org.spongepowered.asm.lib.tree.TypeInsnNode;
/*     */ 
/*     */ public class BasicInterpreter extends Interpreter<BasicValue> implements Opcodes {
/*     */   public BasicValue merge(BasicValue paramBasicValue1, BasicValue paramBasicValue2) {
/*     */     
/*  10 */     try { if (!paramBasicValue1.equals(paramBasicValue2))
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
/*  47 */         return BasicValue.UNINITIALIZED_VALUE; }  } catch (IllegalArgumentException illegalArgumentException) { throw b(null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  82 */     return paramBasicValue1;
/*     */   }
/*     */   public BasicValue copyOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue) throws AnalyzerException {
/*     */     return paramBasicValue;
/*     */   }
/*     */   
/*     */   public void returnOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2) throws AnalyzerException {}
/*     */   
/*     */   protected BasicInterpreter(int paramInt) {
/*     */     super(paramInt);
/*     */   }
/*     */   
/*     */   public BasicValue newOperation(AbstractInsnNode paramAbstractInsnNode) throws AnalyzerException {
/*     */     try {
/*     */       Object object;
/*     */       switch (paramAbstractInsnNode.getOpcode()) {
/*     */         case 1:
/*  99 */           return newValue(Type.getObjectType("null"));
/*     */         case 2: case 3: case 4: case 5: case 6: case 7: case 8:
/* 101 */           return BasicValue.INT_VALUE;case 9: case 10: return BasicValue.LONG_VALUE;case 11: case 12: case 13: return BasicValue.FLOAT_VALUE;case 14: case 15: return BasicValue.DOUBLE_VALUE;case 16: case 17: return BasicValue.INT_VALUE;case 18: object = ((LdcInsnNode)paramAbstractInsnNode).cst; try { if (object instanceof Integer)
/*     */               return BasicValue.INT_VALUE;  } catch (AnalyzerException analyzerException) { throw b(null); }  try { if (object instanceof Float)
/*     */               return BasicValue.FLOAT_VALUE;  } catch (AnalyzerException analyzerException) { throw b(null); }  try { if (object instanceof Long)
/*     */               return BasicValue.LONG_VALUE;  } catch (AnalyzerException analyzerException) { throw b(null); }  try { if (object instanceof Double)
/*     */               return BasicValue.DOUBLE_VALUE;  } catch (AnalyzerException analyzerException) { throw b(null); }  try { if (object instanceof String)
/*     */               return newValue(Type.getObjectType("java/lang/String"));  } catch (AnalyzerException analyzerException) { throw b(null); }  if (object instanceof Type) { int i = ((Type)object).getSort(); try { if (i != 10)
/*     */                 try { if (i != 9) { try { if (i == 11)
/* 108 */                         return newValue(Type.getObjectType("java/lang/invoke/MethodType"));  }
/*     */                     catch (AnalyzerException analyzerException)
/*     */                     { throw b(null); }
/*     */                     
/*     */                     throw new IllegalArgumentException("Illegal LDC constant " + object); }
/*     */                   
/*     */                   return newValue(Type.getObjectType("java/lang/Class")); }
/*     */                 catch (AnalyzerException analyzerException)
/*     */                 { throw b(null); }
/*     */                   }
/*     */             catch (AnalyzerException analyzerException)
/*     */             { throw b(null); }
/*     */             
/*     */             return newValue(Type.getObjectType("java/lang/Class")); }
/*     */           
/*     */           try {
/*     */             if (object instanceof org.spongepowered.asm.lib.Handle)
/*     */               return newValue(Type.getObjectType("java/lang/invoke/MethodHandle")); 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           throw new IllegalArgumentException("Illegal LDC constant " + object);
/*     */         case 168:
/*     */           return BasicValue.RETURNADDRESS_VALUE;
/*     */         case 178:
/*     */           return newValue(Type.getType(((FieldInsnNode)paramAbstractInsnNode).desc));
/*     */         case 187:
/*     */           return newValue(Type.getObjectType(((TypeInsnNode)paramAbstractInsnNode).desc));
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new Error("Internal error.");
/*     */   }
/*     */   
/*     */   public BasicValue ternaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2, BasicValue paramBasicValue3) throws AnalyzerException {
/*     */     return null;
/*     */   }
/*     */   
/*     */   public BasicInterpreter() {
/*     */     super(327680);
/*     */   }
/*     */   
/*     */   public BasicValue newValue(Type paramType) {
/*     */     try {
/*     */       if (paramType == null)
/*     */         return BasicValue.UNINITIALIZED_VALUE; 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       switch (paramType.getSort()) {
/*     */         case 0:
/*     */           return null;
/*     */         case 1:
/*     */         case 2:
/*     */         case 3:
/*     */         case 4:
/*     */         case 5:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 6:
/*     */           return BasicValue.FLOAT_VALUE;
/*     */         case 7:
/*     */           return BasicValue.LONG_VALUE;
/*     */         case 8:
/*     */           return BasicValue.DOUBLE_VALUE;
/*     */         case 9:
/*     */         case 10:
/*     */           return BasicValue.REFERENCE_VALUE;
/*     */       } 
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new Error("Internal error");
/*     */   }
/*     */   
/*     */   public BasicValue binaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue1, BasicValue paramBasicValue2) throws AnalyzerException {
/*     */     try {
/*     */       switch (paramAbstractInsnNode.getOpcode()) {
/*     */         case 46:
/*     */         case 51:
/*     */         case 52:
/*     */         case 53:
/*     */         case 96:
/*     */         case 100:
/*     */         case 104:
/*     */         case 108:
/*     */         case 112:
/*     */         case 120:
/*     */         case 122:
/*     */         case 124:
/*     */         case 126:
/*     */         case 128:
/*     */         case 130:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 48:
/*     */         case 98:
/*     */         case 102:
/*     */         case 106:
/*     */         case 110:
/*     */         case 114:
/*     */           return BasicValue.FLOAT_VALUE;
/*     */         case 47:
/*     */         case 97:
/*     */         case 101:
/*     */         case 105:
/*     */         case 109:
/*     */         case 113:
/*     */         case 121:
/*     */         case 123:
/*     */         case 125:
/*     */         case 127:
/*     */         case 129:
/*     */         case 131:
/*     */           return BasicValue.LONG_VALUE;
/*     */         case 49:
/*     */         case 99:
/*     */         case 103:
/*     */         case 107:
/*     */         case 111:
/*     */         case 115:
/*     */           return BasicValue.DOUBLE_VALUE;
/*     */         case 50:
/*     */           return BasicValue.REFERENCE_VALUE;
/*     */         case 148:
/*     */         case 149:
/*     */         case 150:
/*     */         case 151:
/*     */         case 152:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 159:
/*     */         case 160:
/*     */         case 161:
/*     */         case 162:
/*     */         case 163:
/*     */         case 164:
/*     */         case 165:
/*     */         case 166:
/*     */         case 181:
/*     */           return null;
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new Error("Internal error.");
/*     */   }
/*     */   
/*     */   public BasicValue naryOperation(AbstractInsnNode paramAbstractInsnNode, List<? extends BasicValue> paramList) throws AnalyzerException {
/*     */     int i = paramAbstractInsnNode.getOpcode();
/*     */     try {
/*     */       if (i == 197)
/*     */         return newValue(Type.getType(((MultiANewArrayInsnNode)paramAbstractInsnNode).desc)); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (i == 186)
/*     */         return newValue(Type.getReturnType(((InvokeDynamicInsnNode)paramAbstractInsnNode).desc)); 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return newValue(Type.getReturnType(((MethodInsnNode)paramAbstractInsnNode).desc));
/*     */   }
/*     */   
/*     */   public BasicValue unaryOperation(AbstractInsnNode paramAbstractInsnNode, BasicValue paramBasicValue) throws AnalyzerException {
/*     */     try {
/*     */       String str;
/*     */       switch (paramAbstractInsnNode.getOpcode()) {
/*     */         case 116:
/*     */         case 132:
/*     */         case 136:
/*     */         case 139:
/*     */         case 142:
/*     */         case 145:
/*     */         case 146:
/*     */         case 147:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 118:
/*     */         case 134:
/*     */         case 137:
/*     */         case 144:
/*     */           return BasicValue.FLOAT_VALUE;
/*     */         case 117:
/*     */         case 133:
/*     */         case 140:
/*     */         case 143:
/*     */           return BasicValue.LONG_VALUE;
/*     */         case 119:
/*     */         case 135:
/*     */         case 138:
/*     */         case 141:
/*     */           return BasicValue.DOUBLE_VALUE;
/*     */         case 153:
/*     */         case 154:
/*     */         case 155:
/*     */         case 156:
/*     */         case 157:
/*     */         case 158:
/*     */         case 170:
/*     */         case 171:
/*     */         case 172:
/*     */         case 173:
/*     */         case 174:
/*     */         case 175:
/*     */         case 176:
/*     */         case 179:
/*     */           return null;
/*     */         case 180:
/*     */           return newValue(Type.getType(((FieldInsnNode)paramAbstractInsnNode).desc));
/*     */         case 188:
/*     */           try {
/*     */             switch (((IntInsnNode)paramAbstractInsnNode).operand) {
/*     */               case 4:
/*     */                 return newValue(Type.getType("[Z"));
/*     */               case 5:
/*     */                 return newValue(Type.getType("[C"));
/*     */               case 8:
/*     */                 return newValue(Type.getType("[B"));
/*     */               case 9:
/*     */                 return newValue(Type.getType("[S"));
/*     */               case 10:
/*     */                 return newValue(Type.getType("[I"));
/*     */               case 6:
/*     */                 return newValue(Type.getType("[F"));
/*     */               case 7:
/*     */                 return newValue(Type.getType("[D"));
/*     */               case 11:
/*     */                 return newValue(Type.getType("[J"));
/*     */             } 
/*     */           } catch (AnalyzerException analyzerException) {
/*     */             throw b(null);
/*     */           } 
/*     */           throw new AnalyzerException(paramAbstractInsnNode, "Invalid array type");
/*     */         case 189:
/*     */           str = ((TypeInsnNode)paramAbstractInsnNode).desc;
/*     */           return newValue(Type.getType("[" + Type.getObjectType(str)));
/*     */         case 190:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 191:
/*     */           return null;
/*     */         case 192:
/*     */           str = ((TypeInsnNode)paramAbstractInsnNode).desc;
/*     */           return newValue(Type.getObjectType(str));
/*     */         case 193:
/*     */           return BasicValue.INT_VALUE;
/*     */         case 194:
/*     */         case 195:
/*     */         case 198:
/*     */         case 199:
/*     */           return null;
/*     */       } 
/*     */     } catch (AnalyzerException analyzerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new Error("Internal error.");
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\BasicInterpreter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */