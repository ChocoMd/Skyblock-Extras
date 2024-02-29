/*     */ package org.spongepowered.asm.lib.util;public class CheckMethodAdapter extends MethodVisitor {
/*     */   public int version;
/*     */   private int access;
/*     */   private boolean startCode;
/*     */   private boolean endCode;
/*     */   private boolean endMethod;
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) {
/*   9 */     checkEndMethod();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 437 */     checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitAnnotation(paramString, paramBoolean));
/*     */   }
/*     */   private int insnCount; private final Map<Label, Integer> labels; private Set<Label> usedLabels; private int expandedFrames;
/*     */   private int compressedFrames;
/*     */   
/*     */   static void checkInternalName(String paramString1, int paramInt1, int paramInt2, String paramString2) {
/*     */     try {
/*     */     
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     int i = (paramInt2 == -1) ? paramString1.length() : paramInt2;
/*     */     try {
/*     */       int k, j = paramInt1;
/*     */       do {
/*     */         k = paramString1.indexOf('/', j + 1);
/*     */         if (k == -1 || k > i)
/*     */           k = i; 
/*     */         checkIdentifier(paramString1, j, k, null);
/*     */         j = k + 1;
/*     */       } while (k != i);
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a fully qualified class name in internal form): " + paramString1);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitFieldInsn(int paramInt, String paramString1, String paramString2, String paramString3) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkOpcode(paramInt, 4);
/*     */     checkInternalName(paramString1, "owner");
/*     */     checkUnqualifiedName(this.version, paramString2, "name");
/*     */     checkDesc(paramString3, false);
/*     */     super.visitFieldInsn(paramInt, paramString1, paramString2, paramString3);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   static void checkMethodDesc(String paramString) {
/*     */     try {
/*     */       if (paramString != null) {
/*     */         try {
/*     */           if (paramString.length() == 0)
/*     */             throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)"); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } else {
/*     */         throw new IllegalArgumentException("Invalid method descriptor (must not be null or empty)");
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     
/*     */     try { if (paramString.charAt(0) == '(')
/*     */         
/*     */         try { if (paramString.length() >= 3)
/*     */           { int i = 1;
/*     */             try {
/*     */               if (paramString.charAt(i) != ')')
/*     */                 while (true) {
/*     */                   if (paramString.charAt(i) == 'V')
/*     */                     throw new IllegalArgumentException("Invalid descriptor: " + paramString); 
/*     */                   i = checkDesc(paramString, i, false);
/*     */                   try {
/*     */                     if (i >= paramString.length() || paramString.charAt(i) == ')')
/*     */                       break; 
/*     */                   } catch (IllegalStateException illegalStateException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             i = checkDesc(paramString, i + 1, true);
/*     */             
/* 513 */             try { if (i != paramString.length())
/*     */                 throw new IllegalArgumentException("Invalid descriptor: " + paramString);  } catch (IllegalStateException illegalStateException) { throw b(null); }  return; }  throw new IllegalArgumentException("Invalid descriptor: " + paramString); } catch (IllegalStateException illegalStateException) { throw b(null); }   } catch (IllegalStateException illegalStateException) { throw b(null); }  throw new IllegalArgumentException("Invalid descriptor: " + paramString); } public void visitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) { try { if (this.api < 327680) { super.visitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); return; }  }
/*     */     catch (IllegalStateException illegalStateException) { throw b(null); }
/* 516 */      doVisitMethodInsn(paramInt, paramString1, paramString2, paramString3, paramBoolean); }
/*     */ 
/*     */   
/*     */   public void visitLocalVariable(String paramString1, String paramString2, String paramString3, Label paramLabel1, Label paramLabel2, int paramInt) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkUnqualifiedName(this.version, paramString1, "name");
/*     */     checkDesc(paramString2, false);
/*     */     checkLabel(paramLabel1, true, "start label");
/*     */     checkLabel(paramLabel2, true, "end label");
/*     */     checkUnsignedShort(paramInt, "Invalid variable index");
/*     */     int i = ((Integer)this.labels.get(paramLabel1)).intValue();
/*     */     int j = ((Integer)this.labels.get(paramLabel2)).intValue();
/*     */     try {
/*     */       if (j < i)
/*     */         throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitLocalVariable(paramString1, paramString2, paramString3, paramLabel1, paramLabel2, paramInt);
/*     */   }
/*     */   
/*     */   void checkFrameValue(Object paramObject) {
/*     */     try {
/*     */       if (paramObject != Opcodes.TOP)
/*     */         try {
/*     */           if (paramObject != Opcodes.INTEGER)
/*     */             try {
/*     */               if (paramObject != Opcodes.FLOAT)
/*     */                 try {
/*     */                   if (paramObject != Opcodes.LONG)
/*     */                     try {
/*     */                       if (paramObject != Opcodes.DOUBLE)
/*     */                         try {
/*     */                           if (paramObject != Opcodes.NULL)
/*     */                             try {
/*     */                               if (paramObject != Opcodes.UNINITIALIZED_THIS) {
/*     */                                 try {
/*     */                                   if (paramObject instanceof String) {
/*     */                                     checkInternalName((String)paramObject, "Invalid stack frame value");
/*     */                                     return;
/*     */                                   } 
/*     */                                 } catch (IllegalStateException illegalStateException) {
/*     */                                   throw b(null);
/*     */                                 } 
/*     */                                 try {
/*     */                                   if (!(paramObject instanceof Label))
/*     */                                     throw new IllegalArgumentException("Invalid stack frame value: " + paramObject); 
/*     */                                 } catch (IllegalStateException illegalStateException) {
/*     */                                   throw b(null);
/*     */                                 } 
/*     */                                 this.usedLabels.add((Label)paramObject);
/*     */                                 return;
/*     */                               } 
/*     */                               return;
/*     */                             } catch (IllegalStateException illegalStateException) {
/*     */                               throw b(null);
/*     */                             }  
/*     */                         } catch (IllegalStateException illegalStateException) {
/*     */                           throw b(null);
/*     */                         }  
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     }  
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   protected CheckMethodAdapter(int paramInt, MethodVisitor paramMethodVisitor, Map<Label, Integer> paramMap) {
/*     */     super(paramInt, paramMethodVisitor);
/*     */     this.labels = paramMap;
/*     */     this.usedLabels = new HashSet<Label>();
/*     */     this.handlers = new ArrayList<Label>();
/*     */   }
/*     */   
/*     */   void checkEndCode() {
/*     */     try {
/*     */       if (this.endCode)
/*     */         throw new IllegalStateException("Cannot visit instructions after visitMaxs has been called."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitParameter(String paramString, int paramInt) {
/*     */     try {
/*     */       if (paramString != null)
/*     */         checkUnqualifiedName(this.version, paramString, "name"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     CheckClassAdapter.checkAccess(paramInt, 36880);
/*     */     super.visitParameter(paramString, paramInt);
/*     */   }
/*     */   
/*     */   public void visitTableSwitchInsn(int paramInt1, int paramInt2, Label paramLabel, Label... paramVarArgs) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       if (paramInt2 < paramInt1)
/*     */         throw new IllegalArgumentException("Max = " + paramInt2 + " must be greater than or equal to min = " + paramInt1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       checkLabel(paramLabel, false, "default label");
/*     */       checkNonDebugLabel(paramLabel);
/*     */       if (paramVarArgs != null)
/*     */         try {
/*     */           if (paramVarArgs.length == paramInt2 - paramInt1 + 1) {
/*     */             byte b = 0;
/*     */             try {
/*     */               while (b < paramVarArgs.length) {
/*     */                 checkLabel(paramVarArgs[b], false, "label at index " + b);
/*     */                 checkNonDebugLabel(paramVarArgs[b]);
/*     */                 b++;
/*     */               } 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             super.visitTableSwitchInsn(paramInt1, paramInt2, paramLabel, paramVarArgs);
/*     */             b = 0;
/*     */             try {
/*     */               for (; b < paramVarArgs.length; b++)
/*     */                 this.usedLabels.add(paramVarArgs[b]); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             this.insnCount++;
/*     */             return;
/*     */           } 
/*     */           throw new IllegalArgumentException("There must be max - min + 1 labels");
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("There must be max - min + 1 labels");
/*     */   }
/*     */   
/*     */   public void visitEnd() {
/*     */     checkEndMethod();
/*     */     this.endMethod = true;
/*     */     super.visitEnd();
/*     */   }
/*     */   
/*     */   public void visitTypeInsn(int paramInt, String paramString) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkOpcode(paramInt, 3);
/*     */       checkInternalName(paramString, "type");
/*     */       if (paramInt == 187)
/*     */         try {
/*     */           if (paramString.charAt(0) == '[')
/*     */             throw new IllegalArgumentException("NEW cannot be used to create arrays: " + paramString); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitTypeInsn(paramInt, paramString);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   static void checkOpcode(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       if (paramInt1 >= 0)
/*     */         try {
/*     */           if (paramInt1 <= 199)
/*     */             try {
/*     */               if (TYPE[paramInt1] == paramInt2)
/*     */                 return; 
/*     */               throw new IllegalArgumentException("Invalid opcode: " + paramInt1);
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Invalid opcode: " + paramInt1);
/*     */   }
/*     */   
/*     */   public CheckMethodAdapter(int paramInt, String paramString1, String paramString2, MethodVisitor paramMethodVisitor, Map<Label, Integer> paramMap) {
/*     */     this((MethodVisitor)new CheckMethodAdapter$1(327680, paramInt, paramString1, paramString2, null, null, paramMethodVisitor), paramMap);
/*     */     this.access = paramInt;
/*     */   }
/*     */   
/*     */   void checkEndMethod() {
/*     */     try {
/*     */       if (this.endMethod)
/*     */         throw new IllegalStateException("Cannot visit elements after visitEnd has been called."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitAttribute(Attribute paramAttribute) {
/*     */     try {
/*     */       checkEndMethod();
/*     */       if (paramAttribute == null)
/*     */         throw new IllegalArgumentException("Invalid attribute (must not be null)"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitAttribute(paramAttribute);
/*     */   }
/*     */   
/*     */   static void checkIdentifier(String paramString1, String paramString2) {
/*     */     checkIdentifier(paramString1, 0, -1, paramString2);
/*     */   }
/*     */   
/*     */   static void checkSignedByte(int paramInt, String paramString) {
/*     */     try {
/*     */       if (paramInt >= -128)
/*     */         try {
/*     */           if (paramInt <= 127)
/*     */             return; 
/*     */           throw new IllegalArgumentException(paramString + " (must be a signed byte): " + paramInt);
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException(paramString + " (must be a signed byte): " + paramInt);
/*     */   }
/*     */   
/*     */   static void checkConstant(Object paramObject) {
/*     */     try {
/*     */       if (!(paramObject instanceof Integer))
/*     */         try {
/*     */           if (!(paramObject instanceof Float))
/*     */             try {
/*     */               if (!(paramObject instanceof Long))
/*     */                 try {
/*     */                   if (!(paramObject instanceof Double))
/*     */                     try {
/*     */                       if (!(paramObject instanceof String))
/*     */                         throw new IllegalArgumentException("Invalid constant: " + paramObject); 
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     }  
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLdcInsn(Object paramObject) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkLDCConstant(paramObject);
/*     */     super.visitLdcInsn(paramObject);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   public void visitVarInsn(int paramInt1, int paramInt2) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkOpcode(paramInt1, 2);
/*     */     checkUnsignedShort(paramInt2, "Invalid variable index");
/*     */     super.visitVarInsn(paramInt1, paramInt2);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   public void visitTryCatchBlock(Label paramLabel1, Label paramLabel2, Label paramLabel3, String paramString) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkLabel(paramLabel1, false, "start label");
/*     */       checkLabel(paramLabel2, false, "end label");
/*     */       checkLabel(paramLabel3, false, "handler label");
/*     */       checkNonDebugLabel(paramLabel1);
/*     */       checkNonDebugLabel(paramLabel2);
/*     */       checkNonDebugLabel(paramLabel3);
/*     */       if (this.labels.get(paramLabel1) == null)
/*     */         try {
/*     */           if (this.labels.get(paramLabel2) == null)
/*     */             try {
/*     */               if (this.labels.get(paramLabel3) == null) {
/*     */                 try {
/*     */                   if (paramString != null)
/*     */                     checkInternalName(paramString, "type"); 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 super.visitTryCatchBlock(paramLabel1, paramLabel2, paramLabel3, paramString);
/*     */                 this.handlers.add(paramLabel1);
/*     */                 this.handlers.add(paramLabel2);
/*     */                 return;
/*     */               } 
/*     */               throw new IllegalStateException("Try catch blocks must be visited before their labels");
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalStateException("Try catch blocks must be visited before their labels");
/*     */   }
/*     */   
/*     */   public void visitInvokeDynamicInsn(String paramString1, String paramString2, Handle paramHandle, Object... paramVarArgs) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkMethodIdentifier(this.version, paramString1, "name");
/*     */       checkMethodDesc(paramString2);
/*     */       if (paramHandle.getTag() != 6)
/*     */         try {
/*     */           if (paramHandle.getTag() != 8)
/*     */             throw new IllegalArgumentException("invalid handle tag " + paramHandle.getTag()); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     byte b = 0;
/*     */     try {
/*     */       while (b < paramVarArgs.length) {
/*     */         checkLDCConstant(paramVarArgs[b]);
/*     */         b++;
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitInvokeDynamicInsn(paramString1, paramString2, paramHandle, paramVarArgs);
/*     */     this.insnCount++;
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
/*     */   public CheckMethodAdapter(MethodVisitor paramMethodVisitor) {
/*     */     this(paramMethodVisitor, new HashMap<Label, Integer>());
/*     */   }
/*     */   
/*     */   static void checkSignedShort(int paramInt, String paramString) {
/*     */     try {
/*     */       if (paramInt >= -32768)
/*     */         try {
/*     */           if (paramInt <= 32767)
/*     */             return; 
/*     */           throw new IllegalArgumentException(paramString + " (must be a signed short): " + paramInt);
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException(paramString + " (must be a signed short): " + paramInt);
/*     */   }
/*     */   
/*     */   public CheckMethodAdapter(MethodVisitor paramMethodVisitor, Map<Label, Integer> paramMap) {
/*     */     this(327680, paramMethodVisitor, paramMap);
/*     */     if (getClass() != CheckMethodAdapter.class)
/*     */       throw new IllegalStateException(); 
/*     */   }
/*     */   
/*     */   public void visitJumpInsn(int paramInt, Label paramLabel) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkOpcode(paramInt, 6);
/*     */     checkLabel(paramLabel, false, "label");
/*     */     checkNonDebugLabel(paramLabel);
/*     */     super.visitJumpInsn(paramInt, paramLabel);
/*     */     this.usedLabels.add(paramLabel);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitLocalVariableAnnotation(int paramInt, TypePath paramTypePath, Label[] paramArrayOfLabel1, Label[] paramArrayOfLabel2, int[] paramArrayOfint, String paramString, boolean paramBoolean) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     int i = paramInt >>> 24;
/*     */     try {
/*     */       if (i != 64)
/*     */         try {
/*     */           if (i != 65)
/*     */             throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       CheckClassAdapter.checkTypeRefAndPath(paramInt, paramTypePath);
/*     */       checkDesc(paramString, false);
/*     */       if (paramArrayOfLabel1 != null)
/*     */         try {
/*     */           if (paramArrayOfLabel2 != null)
/*     */             try {
/*     */               if (paramArrayOfint != null)
/*     */                 try {
/*     */                   if (paramArrayOfLabel2.length == paramArrayOfLabel1.length)
/*     */                     try {
/*     */                       if (paramArrayOfint.length == paramArrayOfLabel1.length) {
/*     */                         for (byte b = 0; b < paramArrayOfLabel1.length; b++) {
/*     */                           checkLabel(paramArrayOfLabel1[b], true, "start label");
/*     */                           checkLabel(paramArrayOfLabel2[b], true, "end label");
/*     */                           checkUnsignedShort(paramArrayOfint[b], "Invalid variable index");
/*     */                           int j = ((Integer)this.labels.get(paramArrayOfLabel1[b])).intValue();
/*     */                           int k = ((Integer)this.labels.get(paramArrayOfLabel2[b])).intValue();
/*     */                           try {
/*     */                             if (k < j)
/*     */                               throw new IllegalArgumentException("Invalid start and end labels (end must be greater than start)"); 
/*     */                           } catch (IllegalStateException illegalStateException) {
/*     */                             throw b(null);
/*     */                           } 
/*     */                         } 
/*     */                         return super.visitLocalVariableAnnotation(paramInt, paramTypePath, paramArrayOfLabel1, paramArrayOfLabel2, paramArrayOfint, paramString, paramBoolean);
/*     */                       } 
/*     */                       throw new IllegalArgumentException("Invalid start, end and index arrays (must be non null and of identical length");
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     }  
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Invalid start, end and index arrays (must be non null and of identical length");
/*     */   }
/*     */   
/*     */   public void visitMaxs(int paramInt1, int paramInt2) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     this.endCode = true;
/*     */     for (Label label : this.usedLabels) {
/*     */       try {
/*     */         if (this.labels.get(label) == null)
/*     */           throw new IllegalStateException("Undefined label used"); 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } 
/*     */     for (byte b = 0; b < this.handlers.size(); ) {
/*     */       Integer integer1 = this.labels.get(this.handlers.get(b++));
/*     */       Integer integer2 = this.labels.get(this.handlers.get(b++));
/*     */       try {
/*     */         if (integer1 != null)
/*     */           try {
/*     */             if (integer2 != null) {
/*     */               try {
/*     */                 if (integer2.intValue() <= integer1.intValue())
/*     */                   throw new IllegalStateException("Emty try catch block handler range"); 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               continue;
/*     */             } 
/*     */             throw new IllegalStateException("Undefined try catch block labels");
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           }  
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       throw new IllegalStateException("Undefined try catch block labels");
/*     */     } 
/*     */     checkUnsignedShort(paramInt1, "Invalid max stack");
/*     */     checkUnsignedShort(paramInt2, "Invalid max locals");
/*     */     super.visitMaxs(paramInt1, paramInt2);
/*     */   }
/*     */   
/*     */   public void visitLabel(Label paramLabel) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkLabel(paramLabel, false, "label");
/*     */       if (this.labels.get(paramLabel) != null)
/*     */         throw new IllegalArgumentException("Already visited label"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.labels.put(paramLabel, Integer.valueOf(this.insnCount));
/*     */     super.visitLabel(paramLabel);
/*     */   }
/*     */   
/*     */   static void checkDesc(String paramString, boolean paramBoolean) {
/*     */     int i = checkDesc(paramString, 0, paramBoolean);
/*     */     try {
/*     */       if (i != paramString.length())
/*     */         throw new IllegalArgumentException("Invalid descriptor: " + paramString); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static void checkNonDebugLabel(Label paramLabel) {
/*     */     Field field = getLabelStatusField();
/*     */     boolean bool = false;
/*     */     try {
/*     */       try {
/*     */       
/*     */       } catch (IllegalAccessException illegalAccessException) {
/*     */         throw b(null);
/*     */       } 
/*     */       bool = (field == null) ? false : ((Integer)field.get(paramLabel)).intValue();
/*     */     } catch (IllegalAccessException illegalAccessException) {
/*     */       throw new Error("Internal error");
/*     */     } 
/*     */     try {
/*     */       if ((bool & true) != 0)
/*     */         throw new IllegalArgumentException("Labels used for debug info cannot be reused for control flow"); 
/*     */     } catch (IllegalAccessException illegalAccessException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     checkEndMethod();
/*     */     int i = paramInt >>> 24;
/*     */     try {
/*     */       if (i != 1)
/*     */         try {
/*     */           if (i != 18)
/*     */             try {
/*     */               if (i != 20)
/*     */                 try {
/*     */                   if (i != 21)
/*     */                     try {
/*     */                       if (i != 22)
/*     */                         try {
/*     */                           if (i != 23)
/*     */                             throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*     */                         } catch (IllegalStateException illegalStateException) {
/*     */                           throw b(null);
/*     */                         }  
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     }  
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     CheckClassAdapter.checkTypeRefAndPath(paramInt, paramTypePath);
/*     */     checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   void checkStartCode() {
/*     */     try {
/*     */       if (!this.startCode)
/*     */         throw new IllegalStateException("Cannot visit instructions before visitCode has been called."); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static Field getLabelField(String paramString) {
/*     */     try {
/*     */       Field field = Label.class.getDeclaredField(paramString);
/*     */       field.setAccessible(true);
/*     */       return field;
/*     */     } catch (NoSuchFieldException noSuchFieldException) {
/*     */       return null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitLookupSwitchInsn(Label paramLabel, int[] paramArrayOfint, Label[] paramArrayOfLabel) {
/*     */     try {
/*     */       checkEndCode();
/*     */       checkStartCode();
/*     */       checkLabel(paramLabel, false, "default label");
/*     */       checkNonDebugLabel(paramLabel);
/*     */       if (paramArrayOfint != null)
/*     */         try {
/*     */           if (paramArrayOfLabel != null)
/*     */             try {
/*     */               if (paramArrayOfint.length == paramArrayOfLabel.length) {
/*     */                 byte b = 0;
/*     */                 try {
/*     */                   while (b < paramArrayOfLabel.length) {
/*     */                     checkLabel(paramArrayOfLabel[b], false, "label at index " + b);
/*     */                     checkNonDebugLabel(paramArrayOfLabel[b]);
/*     */                     b++;
/*     */                   } 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 super.visitLookupSwitchInsn(paramLabel, paramArrayOfint, paramArrayOfLabel);
/*     */                 this.usedLabels.add(paramLabel);
/*     */                 b = 0;
/*     */                 try {
/*     */                   while (b < paramArrayOfLabel.length) {
/*     */                     this.usedLabels.add(paramArrayOfLabel[b]);
/*     */                     b++;
/*     */                   } 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 this.insnCount++;
/*     */                 return;
/*     */               } 
/*     */               throw new IllegalArgumentException("There must be the same number of keys and labels");
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("There must be the same number of keys and labels");
/*     */   }
/*     */   
/*     */   static void checkUnsignedShort(int paramInt, String paramString) {
/*     */     try {
/*     */       if (paramInt >= 0)
/*     */         try {
/*     */           if (paramInt <= 65535)
/*     */             return; 
/*     */           throw new IllegalArgumentException(paramString + " (must be an unsigned short): " + paramInt);
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException(paramString + " (must be an unsigned short): " + paramInt);
/*     */   }
/*     */   
/*     */   void checkLDCConstant(Object paramObject) {
/*     */     if (paramObject instanceof Type) {
/*     */       int i = ((Type)paramObject).getSort();
/*     */       try {
/*     */         if (i != 10)
/*     */           try {
/*     */             if (i != 9)
/*     */               try {
/*     */                 if (i != 11)
/*     */                   throw new IllegalArgumentException("Illegal LDC constant value"); 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               }  
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           }  
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */     } 
/*     */     try {
/*     */       if (paramObject instanceof Handle) {
/*     */         try {
/*     */           if ((this.version & 0xFFFF) < 51)
/*     */             throw new IllegalArgumentException("ldc of a handle requires at least version 1.7"); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */         int i = ((Handle)paramObject).getTag();
/*     */         try {
/*     */           if (i >= 1) {
/*     */             try {
/*     */               if (i > 9)
/*     */                 throw new IllegalArgumentException("invalid handle tag " + i); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } else {
/*     */             throw new IllegalArgumentException("invalid handle tag " + i);
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } else {
/*     */         checkConstant(paramObject);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   static void checkUnqualifiedName(int paramInt, String paramString1, String paramString2) {
/*     */     try {
/*     */       if ((paramInt & 0xFFFF) < 49) {
/*     */         checkIdentifier(paramString1, paramString2);
/*     */       } else {
/*     */         byte b = 0;
/*     */         while (true) {
/*     */           try {
/*     */             if (b < paramString1.length()) {
/*     */               try {
/*     */                 if (".;[/".indexOf(paramString1.charAt(b)) != -1)
/*     */                   throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a valid unqualified name): " + paramString1); 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               b++;
/*     */               continue;
/*     */             } 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   void checkLabel(Label paramLabel, boolean paramBoolean, String paramString) {
/*     */     try {
/*     */       if (paramLabel == null)
/*     */         throw new IllegalArgumentException("Invalid " + paramString + " (must not be null)"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramBoolean)
/*     */         try {
/*     */           if (this.labels.get(paramLabel) == null)
/*     */             throw new IllegalArgumentException("Invalid " + paramString + " (must be visited first)"); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitIntInsn(int paramInt1, int paramInt2) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkOpcode(paramInt1, 1);
/*     */       switch (paramInt1) {
/*     */         case 16:
/*     */           checkSignedByte(paramInt2, "Invalid operand");
/*     */           break;
/*     */         case 17:
/*     */           checkSignedShort(paramInt2, "Invalid operand");
/*     */           break;
/*     */         default:
/*     */           try {
/*     */             if (paramInt2 >= 4) {
/*     */               try {
/*     */                 if (paramInt2 > 11)
/*     */                   throw new IllegalArgumentException("Invalid operand (must be an array type code T_...): " + paramInt2); 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               break;
/*     */             } 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           throw new IllegalArgumentException("Invalid operand (must be an array type code T_...): " + paramInt2);
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitIntInsn(paramInt1, paramInt2);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   public void visitLineNumber(int paramInt, Label paramLabel) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkUnsignedShort(paramInt, "Invalid line number");
/*     */     checkLabel(paramLabel, true, "start label");
/*     */     super.visitLineNumber(paramInt, paramLabel);
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitInsnAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     int i = paramInt >>> 24;
/*     */     try {
/*     */       if (i != 67)
/*     */         try {
/*     */           if (i != 68)
/*     */             try {
/*     */               if (i != 69)
/*     */                 try {
/*     */                   if (i != 70)
/*     */                     try {
/*     */                       if (i != 71)
/*     */                         try {
/*     */                           if (i != 72)
/*     */                             try {
/*     */                               if (i != 73)
/*     */                                 try {
/*     */                                   if (i != 74)
/*     */                                     try {
/*     */                                       if (i != 75)
/*     */                                         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*     */                                     } catch (IllegalStateException illegalStateException) {
/*     */                                       throw b(null);
/*     */                                     }  
/*     */                                 } catch (IllegalStateException illegalStateException) {
/*     */                                   throw b(null);
/*     */                                 }  
/*     */                             } catch (IllegalStateException illegalStateException) {
/*     */                               throw b(null);
/*     */                             }  
/*     */                         } catch (IllegalStateException illegalStateException) {
/*     */                           throw b(null);
/*     */                         }  
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     }  
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 }  
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             }  
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     CheckClassAdapter.checkTypeRefAndPath(paramInt, paramTypePath);
/*     */     checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitInsnAnnotation(paramInt, paramTypePath, paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   public void visitMultiANewArrayInsn(String paramString, int paramInt) {
/*     */     try {
/*     */       checkStartCode();
/*     */       checkEndCode();
/*     */       checkDesc(paramString, false);
/*     */       if (paramString.charAt(0) != '[')
/*     */         throw new IllegalArgumentException("Invalid descriptor (must be an array type descriptor): " + paramString); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt < 1)
/*     */         throw new IllegalArgumentException("Invalid dimensions (must be greater than 0): " + paramInt); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramInt > paramString.lastIndexOf('[') + 1)
/*     */         throw new IllegalArgumentException("Invalid dimensions (must not be greater than dims(desc)): " + paramInt); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     super.visitMultiANewArrayInsn(paramString, paramInt);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   static void checkIdentifier(String paramString1, int paramInt1, int paramInt2, String paramString2) {
/*     */     try {
/*     */       if (paramString1 != null) {
/*     */         try {
/*     */           if (paramInt2 == -1) {
/*     */             try {
/*     */               if (paramString1.length() <= paramInt1)
/*     */                 throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)"); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } else {
/*     */             try {
/*     */               if (paramInt2 <= paramInt1)
/*     */                 throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)"); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } else {
/*     */         throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)");
/*     */       } 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (!Character.isJavaIdentifierStart(paramString1.charAt(paramInt1)))
/*     */         throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a valid Java identifier): " + paramString1); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */     
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     int i = (paramInt2 == -1) ? paramString1.length() : paramInt2;
/*     */     int j = paramInt1 + 1;
/*     */     while (true) {
/*     */       try {
/*     */         if (j < i) {
/*     */           try {
/*     */             if (!Character.isJavaIdentifierPart(paramString1.charAt(j)))
/*     */               throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a valid Java identifier): " + paramString1); 
/*     */           } catch (IllegalStateException illegalStateException) {
/*     */             throw b(null);
/*     */           } 
/*     */           j++;
/*     */           continue;
/*     */         } 
/*     */       } catch (IllegalStateException illegalStateException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitInsn(int paramInt) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkOpcode(paramInt, 0);
/*     */     super.visitInsn(paramInt);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   static void checkMethodIdentifier(int paramInt, String paramString1, String paramString2) {
/*     */     try {
/*     */       if (paramString1 != null)
/*     */         try {
/*     */           if (paramString1.length() != 0) {
/*     */             if ((paramInt & 0xFFFF) >= 49) {
/*     */               byte b1 = 0;
/*     */               while (true) {
/*     */                 try {
/*     */                   if (b1 < paramString1.length()) {
/*     */                     try {
/*     */                       if (".;[/<>".indexOf(paramString1.charAt(b1)) != -1)
/*     */                         throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a valid unqualified name): " + paramString1); 
/*     */                     } catch (IllegalStateException illegalStateException) {
/*     */                       throw b(null);
/*     */                     } 
/*     */                     b1++;
/*     */                     continue;
/*     */                   } 
/*     */                 } catch (IllegalStateException illegalStateException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 break;
/*     */               } 
/*     */               return;
/*     */             } 
/*     */             try {
/*     */               if (!Character.isJavaIdentifierStart(paramString1.charAt(0)))
/*     */                 throw new IllegalArgumentException("Invalid " + paramString2 + " (must be a '<init>', '<clinit>' or a valid Java identifier): " + paramString1); 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             byte b = 1;
/*     */             while (true) {
/*     */               try {
/*     */                 if (b < paramString1.length()) {
/*     */                   try {
/*     */                     if (!Character.isJavaIdentifierPart(paramString1.charAt(b)))
/*     */                       throw new IllegalArgumentException("Invalid " + paramString2 + " (must be '<init>' or '<clinit>' or a valid Java identifier): " + paramString1); 
/*     */                   } catch (IllegalStateException illegalStateException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                   b++;
/*     */                   continue;
/*     */                 } 
/*     */               } catch (IllegalStateException illegalStateException) {
/*     */                 throw b(null);
/*     */               } 
/*     */               break;
/*     */             } 
/*     */             return;
/*     */           } 
/*     */           throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)");
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)");
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotationDefault() {
/*     */     checkEndMethod();
/*     */     return new CheckAnnotationAdapter(super.visitAnnotationDefault(), false);
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitTryCatchAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     int i = paramInt >>> 24;
/*     */     try {
/*     */       if (i != 66)
/*     */         throw new IllegalArgumentException("Invalid type reference sort 0x" + Integer.toHexString(i)); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     CheckClassAdapter.checkTypeRefAndPath(paramInt, paramTypePath);
/*     */     checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitTryCatchAnnotation(paramInt, paramTypePath, paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   private static Field getLabelStatusField() {
/*     */     try {
/*     */       if (labelStatusField == null)
/*     */         try {
/*     */           labelStatusField = getLabelField("a");
/*     */           if (labelStatusField == null)
/*     */             labelStatusField = getLabelField("status"); 
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return labelStatusField;
/*     */   }
/*     */   
/*     */   static int checkDesc(String paramString, int paramInt, boolean paramBoolean) {
/*     */     try {
/*     */       if (paramString != null)
/*     */         try {
/*     */           if (paramInt < paramString.length()) {
/*     */             try {
/*     */               int i;
/*     */               switch (paramString.charAt(paramInt)) {
/*     */                 case 'V':
/*     */                   try {
/*     */                     if (paramBoolean)
/*     */                       return paramInt + 1; 
/*     */                   } catch (IllegalArgumentException illegalArgumentException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                   throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */                 case 'B':
/*     */                 case 'C':
/*     */                 case 'D':
/*     */                 case 'F':
/*     */                 case 'I':
/*     */                 case 'J':
/*     */                 case 'S':
/*     */                 case 'Z':
/*     */                   return paramInt + 1;
/*     */                 case '[':
/*     */                   i = paramInt + 1;
/*     */                   while (true) {
/*     */                     try {
/*     */                       if (i < paramString.length())
/*     */                         try {
/*     */                           if (paramString.charAt(i) == '[') {
/*     */                             i++;
/*     */                             continue;
/*     */                           } 
/*     */                         } catch (IllegalArgumentException illegalArgumentException) {
/*     */                           throw b(null);
/*     */                         }  
/*     */                     } catch (IllegalArgumentException illegalArgumentException) {
/*     */                       throw b(null);
/*     */                     } 
/*     */                     break;
/*     */                   } 
/*     */                   try {
/*     */                     if (i < paramString.length())
/*     */                       return checkDesc(paramString, i, false); 
/*     */                   } catch (IllegalArgumentException illegalArgumentException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                   throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */                 case 'L':
/*     */                   i = paramString.indexOf(';', paramInt);
/*     */                   try {
/*     */                     if (i != -1)
/*     */                       try {
/*     */                         if (i - paramInt >= 2) {
/*     */                           try {
/*     */                             checkInternalName(paramString, paramInt + 1, i, null);
/*     */                           } catch (IllegalArgumentException illegalArgumentException) {
/*     */                             throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */                           } 
/*     */                           return i + 1;
/*     */                         } 
/*     */                         throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */                       } catch (IllegalArgumentException illegalArgumentException) {
/*     */                         throw b(null);
/*     */                       }  
/*     */                   } catch (IllegalArgumentException illegalArgumentException) {
/*     */                     throw b(null);
/*     */                   } 
/*     */                   throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */               } 
/*     */             } catch (IllegalArgumentException illegalArgumentException) {
/*     */               throw b(null);
/*     */             } 
/*     */             throw new IllegalArgumentException("Invalid descriptor: " + paramString);
/*     */           } 
/*     */           throw new IllegalArgumentException("Invalid type descriptor (must not be null or empty)");
/*     */         } catch (IllegalArgumentException illegalArgumentException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalArgumentException illegalArgumentException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Invalid type descriptor (must not be null or empty)");
/*     */   }
/*     */   
/*     */   private int lastFrame = -1;
/*     */   private List<Label> handlers;
/*     */   private static final int[] TYPE;
/*     */   private static Field labelStatusField;
/*     */   
/*     */   private void doVisitMethodInsn(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual checkStartCode : ()V
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual checkEndCode : ()V
/*     */     //   8: iload_1
/*     */     //   9: iconst_5
/*     */     //   10: invokestatic checkOpcode : (II)V
/*     */     //   13: iload_1
/*     */     //   14: sipush #183
/*     */     //   17: if_icmpne -> 36
/*     */     //   20: ldc '<init>'
/*     */     //   22: aload_3
/*     */     //   23: invokevirtual equals : (Ljava/lang/Object;)Z
/*     */     //   26: ifne -> 53
/*     */     //   29: goto -> 36
/*     */     //   32: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   35: athrow
/*     */     //   36: aload_0
/*     */     //   37: getfield version : I
/*     */     //   40: aload_3
/*     */     //   41: ldc 'name'
/*     */     //   43: invokestatic checkMethodIdentifier : (ILjava/lang/String;Ljava/lang/String;)V
/*     */     //   46: goto -> 53
/*     */     //   49: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   52: athrow
/*     */     //   53: aload_2
/*     */     //   54: ldc 'owner'
/*     */     //   56: invokestatic checkInternalName : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   59: aload #4
/*     */     //   61: invokestatic checkMethodDesc : (Ljava/lang/String;)V
/*     */     //   64: iload_1
/*     */     //   65: sipush #182
/*     */     //   68: if_icmpne -> 97
/*     */     //   71: iload #5
/*     */     //   73: ifeq -> 97
/*     */     //   76: goto -> 83
/*     */     //   79: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   82: athrow
/*     */     //   83: new java/lang/IllegalArgumentException
/*     */     //   86: dup
/*     */     //   87: ldc 'INVOKEVIRTUAL can't be used with interfaces'
/*     */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   92: athrow
/*     */     //   93: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   96: athrow
/*     */     //   97: iload_1
/*     */     //   98: sipush #185
/*     */     //   101: if_icmpne -> 130
/*     */     //   104: iload #5
/*     */     //   106: ifne -> 130
/*     */     //   109: goto -> 116
/*     */     //   112: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   115: athrow
/*     */     //   116: new java/lang/IllegalArgumentException
/*     */     //   119: dup
/*     */     //   120: ldc 'INVOKEINTERFACE can't be used with classes'
/*     */     //   122: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   125: athrow
/*     */     //   126: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   129: athrow
/*     */     //   130: iload_1
/*     */     //   131: sipush #183
/*     */     //   134: if_icmpne -> 182
/*     */     //   137: iload #5
/*     */     //   139: ifeq -> 182
/*     */     //   142: goto -> 149
/*     */     //   145: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   148: athrow
/*     */     //   149: aload_0
/*     */     //   150: getfield version : I
/*     */     //   153: ldc 65535
/*     */     //   155: iand
/*     */     //   156: bipush #52
/*     */     //   158: if_icmpge -> 182
/*     */     //   161: goto -> 168
/*     */     //   164: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   167: athrow
/*     */     //   168: new java/lang/IllegalArgumentException
/*     */     //   171: dup
/*     */     //   172: ldc 'INVOKESPECIAL can't be used with interfaces prior to Java 8'
/*     */     //   174: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   177: athrow
/*     */     //   178: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   181: athrow
/*     */     //   182: aload_0
/*     */     //   183: getfield mv : Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   186: ifnull -> 210
/*     */     //   189: aload_0
/*     */     //   190: getfield mv : Lorg/spongepowered/asm/lib/MethodVisitor;
/*     */     //   193: iload_1
/*     */     //   194: aload_2
/*     */     //   195: aload_3
/*     */     //   196: aload #4
/*     */     //   198: iload #5
/*     */     //   200: invokevirtual visitMethodInsn : (ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
/*     */     //   203: goto -> 210
/*     */     //   206: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   209: athrow
/*     */     //   210: aload_0
/*     */     //   211: dup
/*     */     //   212: getfield insnCount : I
/*     */     //   215: iconst_1
/*     */     //   216: iadd
/*     */     //   217: putfield insnCount : I
/*     */     //   220: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #473	-> 0
/*     */     //   #394	-> 4
/*     */     //   #6	-> 8
/*     */     //   #299	-> 13
/*     */     //   #331	-> 36
/*     */     //   #115	-> 53
/*     */     //   #478	-> 59
/*     */     //   #165	-> 64
/*     */     //   #99	-> 83
/*     */     //   #120	-> 97
/*     */     //   #104	-> 116
/*     */     //   #157	-> 130
/*     */     //   #324	-> 168
/*     */     //   #188	-> 182
/*     */     //   #401	-> 189
/*     */     //   #323	-> 210
/*     */     //   #191	-> 220
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	29	32	java/lang/IllegalStateException
/*     */     //   20	46	49	java/lang/IllegalStateException
/*     */     //   53	76	79	java/lang/IllegalStateException
/*     */     //   71	93	93	java/lang/IllegalStateException
/*     */     //   97	109	112	java/lang/IllegalStateException
/*     */     //   104	126	126	java/lang/IllegalStateException
/*     */     //   130	142	145	java/lang/IllegalStateException
/*     */     //   137	161	164	java/lang/IllegalStateException
/*     */     //   149	178	178	java/lang/IllegalStateException
/*     */     //   182	203	206	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   static void checkInternalName(String paramString1, String paramString2) {
/*     */     try {
/*     */       if (paramString1 != null)
/*     */         try {
/*     */           if (paramString1.length() != 0) {
/*     */             try {
/*     */               if (paramString1.charAt(0) == '[') {
/*     */                 checkDesc(paramString1, false);
/*     */               } else {
/*     */                 checkInternalName(paramString1, 0, -1, paramString2);
/*     */               } 
/*     */             } catch (IllegalStateException illegalStateException) {
/*     */               throw b(null);
/*     */             } 
/*     */             return;
/*     */           } 
/*     */           throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)");
/*     */         } catch (IllegalStateException illegalStateException) {
/*     */           throw b(null);
/*     */         }  
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     throw new IllegalArgumentException("Invalid " + paramString2 + " (must not be null or empty)");
/*     */   }
/*     */   
/*     */   static {
/*     */     String str = "BBBBBBBBBBBBBBBBCCIAADDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBDDDDDAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBJBBBBBBBBBBBBBBBBBBBBHHHHHHHHHHHHHHHHDKLBBBBBBFFFFGGGGAECEBBEEBBAMHHAA";
/*     */     TYPE = new int[str.length()];
/*     */     byte b = 0;
/*     */     try {
/*     */       for (; b < TYPE.length; b++)
/*     */         TYPE[b] = str.charAt(b) - 65 - 1; 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void visitIincInsn(int paramInt1, int paramInt2) {
/*     */     checkStartCode();
/*     */     checkEndCode();
/*     */     checkUnsignedShort(paramInt1, "Invalid variable index");
/*     */     checkSignedShort(paramInt2, "Invalid increment");
/*     */     super.visitIincInsn(paramInt1, paramInt2);
/*     */     this.insnCount++;
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitParameterAnnotation(int paramInt, String paramString, boolean paramBoolean) {
/*     */     checkEndMethod();
/*     */     checkDesc(paramString, false);
/*     */     return new CheckAnnotationAdapter(super.visitParameterAnnotation(paramInt, paramString, paramBoolean));
/*     */   }
/*     */   
/*     */   public void visitFrame(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield insnCount : I
/*     */     //   4: aload_0
/*     */     //   5: getfield lastFrame : I
/*     */     //   8: if_icmpne -> 25
/*     */     //   11: new java/lang/IllegalStateException
/*     */     //   14: dup
/*     */     //   15: ldc 'At most one frame can be visited at a given code location.'
/*     */     //   17: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   20: athrow
/*     */     //   21: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   24: athrow
/*     */     //   25: aload_0
/*     */     //   26: aload_0
/*     */     //   27: getfield insnCount : I
/*     */     //   30: putfield lastFrame : I
/*     */     //   33: iload_1
/*     */     //   34: tableswitch default -> 110, -1 -> 72, 0 -> 72, 1 -> 101, 2 -> 101, 3 -> 83, 4 -> 92
/*     */     //   72: ldc 2147483647
/*     */     //   74: istore #6
/*     */     //   76: ldc 2147483647
/*     */     //   78: istore #7
/*     */     //   80: goto -> 137
/*     */     //   83: iconst_0
/*     */     //   84: istore #6
/*     */     //   86: iconst_0
/*     */     //   87: istore #7
/*     */     //   89: goto -> 137
/*     */     //   92: iconst_0
/*     */     //   93: istore #6
/*     */     //   95: iconst_1
/*     */     //   96: istore #7
/*     */     //   98: goto -> 137
/*     */     //   101: iconst_3
/*     */     //   102: istore #6
/*     */     //   104: iconst_0
/*     */     //   105: istore #7
/*     */     //   107: goto -> 137
/*     */     //   110: new java/lang/IllegalArgumentException
/*     */     //   113: dup
/*     */     //   114: new java/lang/StringBuilder
/*     */     //   117: dup
/*     */     //   118: invokespecial <init> : ()V
/*     */     //   121: ldc 'Invalid frame type '
/*     */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   126: iload_1
/*     */     //   127: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   130: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   133: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   136: athrow
/*     */     //   137: iload_2
/*     */     //   138: iload #6
/*     */     //   140: if_icmple -> 183
/*     */     //   143: new java/lang/IllegalArgumentException
/*     */     //   146: dup
/*     */     //   147: new java/lang/StringBuilder
/*     */     //   150: dup
/*     */     //   151: invokespecial <init> : ()V
/*     */     //   154: ldc 'Invalid nLocal='
/*     */     //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   159: iload_2
/*     */     //   160: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   163: ldc ' for frame type '
/*     */     //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   168: iload_1
/*     */     //   169: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   172: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   175: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   178: athrow
/*     */     //   179: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   182: athrow
/*     */     //   183: iload #4
/*     */     //   185: iload #7
/*     */     //   187: if_icmple -> 231
/*     */     //   190: new java/lang/IllegalArgumentException
/*     */     //   193: dup
/*     */     //   194: new java/lang/StringBuilder
/*     */     //   197: dup
/*     */     //   198: invokespecial <init> : ()V
/*     */     //   201: ldc 'Invalid nStack='
/*     */     //   203: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   206: iload #4
/*     */     //   208: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   211: ldc ' for frame type '
/*     */     //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   216: iload_1
/*     */     //   217: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   220: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   223: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   226: athrow
/*     */     //   227: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   230: athrow
/*     */     //   231: iload_1
/*     */     //   232: iconst_2
/*     */     //   233: if_icmpeq -> 312
/*     */     //   236: iload_2
/*     */     //   237: ifle -> 285
/*     */     //   240: goto -> 247
/*     */     //   243: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   246: athrow
/*     */     //   247: aload_3
/*     */     //   248: ifnull -> 271
/*     */     //   251: goto -> 258
/*     */     //   254: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   257: athrow
/*     */     //   258: aload_3
/*     */     //   259: arraylength
/*     */     //   260: iload_2
/*     */     //   261: if_icmpge -> 285
/*     */     //   264: goto -> 271
/*     */     //   267: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   270: athrow
/*     */     //   271: new java/lang/IllegalArgumentException
/*     */     //   274: dup
/*     */     //   275: ldc 'Array local[] is shorter than nLocal'
/*     */     //   277: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   280: athrow
/*     */     //   281: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   284: athrow
/*     */     //   285: iconst_0
/*     */     //   286: istore #8
/*     */     //   288: iload #8
/*     */     //   290: iload_2
/*     */     //   291: if_icmpge -> 312
/*     */     //   294: aload_0
/*     */     //   295: aload_3
/*     */     //   296: iload #8
/*     */     //   298: aaload
/*     */     //   299: invokevirtual checkFrameValue : (Ljava/lang/Object;)V
/*     */     //   302: iinc #8, 1
/*     */     //   305: goto -> 288
/*     */     //   308: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   311: athrow
/*     */     //   312: iload #4
/*     */     //   314: ifle -> 358
/*     */     //   317: aload #5
/*     */     //   319: ifnull -> 344
/*     */     //   322: goto -> 329
/*     */     //   325: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   328: athrow
/*     */     //   329: aload #5
/*     */     //   331: arraylength
/*     */     //   332: iload #4
/*     */     //   334: if_icmpge -> 358
/*     */     //   337: goto -> 344
/*     */     //   340: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   343: athrow
/*     */     //   344: new java/lang/IllegalArgumentException
/*     */     //   347: dup
/*     */     //   348: ldc 'Array stack[] is shorter than nStack'
/*     */     //   350: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   353: athrow
/*     */     //   354: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   357: athrow
/*     */     //   358: iconst_0
/*     */     //   359: istore #8
/*     */     //   361: iload #8
/*     */     //   363: iload #4
/*     */     //   365: if_icmpge -> 387
/*     */     //   368: aload_0
/*     */     //   369: aload #5
/*     */     //   371: iload #8
/*     */     //   373: aaload
/*     */     //   374: invokevirtual checkFrameValue : (Ljava/lang/Object;)V
/*     */     //   377: iinc #8, 1
/*     */     //   380: goto -> 361
/*     */     //   383: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   386: athrow
/*     */     //   387: iload_1
/*     */     //   388: iconst_m1
/*     */     //   389: if_icmpne -> 409
/*     */     //   392: aload_0
/*     */     //   393: dup
/*     */     //   394: getfield expandedFrames : I
/*     */     //   397: iconst_1
/*     */     //   398: iadd
/*     */     //   399: putfield expandedFrames : I
/*     */     //   402: goto -> 419
/*     */     //   405: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   408: athrow
/*     */     //   409: aload_0
/*     */     //   410: dup
/*     */     //   411: getfield compressedFrames : I
/*     */     //   414: iconst_1
/*     */     //   415: iadd
/*     */     //   416: putfield compressedFrames : I
/*     */     //   419: aload_0
/*     */     //   420: getfield expandedFrames : I
/*     */     //   423: ifle -> 454
/*     */     //   426: aload_0
/*     */     //   427: getfield compressedFrames : I
/*     */     //   430: ifle -> 454
/*     */     //   433: goto -> 440
/*     */     //   436: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   439: athrow
/*     */     //   440: new java/lang/RuntimeException
/*     */     //   443: dup
/*     */     //   444: ldc 'Expanded and compressed frames must not be mixed.'
/*     */     //   446: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   449: athrow
/*     */     //   450: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   453: athrow
/*     */     //   454: aload_0
/*     */     //   455: iload_1
/*     */     //   456: iload_2
/*     */     //   457: aload_3
/*     */     //   458: iload #4
/*     */     //   460: aload #5
/*     */     //   462: invokespecial visitFrame : (II[Ljava/lang/Object;I[Ljava/lang/Object;)V
/*     */     //   465: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #494	-> 0
/*     */     //   #283	-> 11
/*     */     //   #486	-> 25
/*     */     //   #405	-> 33
/*     */     //   #327	-> 72
/*     */     //   #35	-> 76
/*     */     //   #58	-> 80
/*     */     //   #127	-> 83
/*     */     //   #25	-> 86
/*     */     //   #319	-> 89
/*     */     //   #294	-> 92
/*     */     //   #37	-> 95
/*     */     //   #454	-> 98
/*     */     //   #409	-> 101
/*     */     //   #122	-> 104
/*     */     //   #448	-> 107
/*     */     //   #505	-> 110
/*     */     //   #500	-> 137
/*     */     //   #386	-> 143
/*     */     //   #270	-> 183
/*     */     //   #91	-> 190
/*     */     //   #447	-> 231
/*     */     //   #511	-> 236
/*     */     //   #206	-> 271
/*     */     //   #417	-> 285
/*     */     //   #451	-> 294
/*     */     //   #495	-> 302
/*     */     //   #184	-> 312
/*     */     //   #146	-> 344
/*     */     //   #32	-> 358
/*     */     //   #269	-> 368
/*     */     //   #340	-> 377
/*     */     //   #167	-> 387
/*     */     //   #411	-> 392
/*     */     //   #440	-> 409
/*     */     //   #181	-> 419
/*     */     //   #276	-> 440
/*     */     //   #144	-> 454
/*     */     //   #131	-> 465
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	21	21	java/lang/IllegalStateException
/*     */     //   137	179	179	java/lang/IllegalStateException
/*     */     //   183	227	227	java/lang/IllegalStateException
/*     */     //   231	240	243	java/lang/IllegalStateException
/*     */     //   236	251	254	java/lang/IllegalStateException
/*     */     //   247	264	267	java/lang/IllegalStateException
/*     */     //   258	281	281	java/lang/IllegalStateException
/*     */     //   288	308	308	java/lang/IllegalStateException
/*     */     //   312	322	325	java/lang/IllegalStateException
/*     */     //   317	337	340	java/lang/IllegalStateException
/*     */     //   329	354	354	java/lang/IllegalStateException
/*     */     //   361	383	383	java/lang/IllegalStateException
/*     */     //   387	405	405	java/lang/IllegalStateException
/*     */     //   419	433	436	java/lang/IllegalStateException
/*     */     //   426	450	450	java/lang/IllegalStateException
/*     */   }
/*     */   
/*     */   public void visitCode() {
/*     */     try {
/*     */       if ((this.access & 0x400) != 0)
/*     */         throw new RuntimeException("Abstract methods cannot have code"); 
/*     */     } catch (IllegalStateException illegalStateException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.startCode = true;
/*     */     super.visitCode();
/*     */   }
/*     */   
/*     */   private static Exception b(Exception paramException) {
/*     */     return paramException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\CheckMethodAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */