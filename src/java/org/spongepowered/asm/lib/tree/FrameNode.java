/*    */ package org.spongepowered.asm.lib.tree;
/*    */ import java.util.List;
/*    */ import org.spongepowered.asm.lib.MethodVisitor;
/*    */ 
/*    */ public class FrameNode extends AbstractInsnNode {
/*    */   private static Object[] asArray(List<Object> paramList) {
/*  7 */     Object[] arrayOfObject = new Object[paramList.size()];
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     for (byte b = 0; b < arrayOfObject.length; ) {
/*    */       Object object = paramList.get(b);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       if (object instanceof LabelNode)
/* 53 */         object = ((LabelNode)object).getLabel(); 
/*    */     } 
/*    */     return arrayOfObject;
/*    */   }
/*    */   
/*    */   public int type;
/*    */   public List<Object> local;
/*    */   public List<Object> stack;
/*    */   
/*    */   public void accept(MethodVisitor paramMethodVisitor) {
/*    */     try {
/*    */       switch (this.type) {
/*    */         case -1:
/*    */         case 0:
/*    */           paramMethodVisitor.visitFrame(this.type, this.local.size(), asArray(this.local), this.stack.size(), asArray(this.stack));
/*    */           break;
/*    */         case 1:
/*    */           paramMethodVisitor.visitFrame(this.type, this.local.size(), asArray(this.local), 0, null);
/*    */           break;
/*    */         case 2:
/*    */           paramMethodVisitor.visitFrame(this.type, this.local.size(), null, 0, null);
/*    */           break;
/*    */         case 3:
/*    */           paramMethodVisitor.visitFrame(this.type, 0, null, 0, null);
/*    */           break;
/*    */         case 4:
/*    */           paramMethodVisitor.visitFrame(this.type, 0, null, 1, asArray(this.stack));
/*    */           break;
/*    */       } 
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw c(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static List<Object> asList(int paramInt, Object[] paramArrayOfObject) {
/*    */     return Arrays.<Object>asList(paramArrayOfObject).subList(0, paramInt);
/*    */   }
/*    */   
/*    */   public int getType() {
/*    */     return 14;
/*    */   }
/*    */   
/*    */   public FrameNode(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
/*    */     super(-1);
/*    */     this.type = paramInt1;
/*    */     switch (paramInt1) {
/*    */       case -1:
/*    */       case 0:
/*    */         this.local = asList(paramInt2, paramArrayOfObject1);
/*    */         this.stack = asList(paramInt3, paramArrayOfObject2);
/*    */         break;
/*    */       case 1:
/*    */         this.local = asList(paramInt2, paramArrayOfObject1);
/*    */         break;
/*    */       case 2:
/*    */         this.local = Arrays.asList(new Object[paramInt2]);
/*    */         break;
/*    */       case 4:
/*    */         this.stack = asList(1, paramArrayOfObject2);
/*    */         break;
/*    */     } 
/*    */   }
/*    */   
/*    */   private FrameNode() {
/*    */     super(-1);
/*    */   }
/*    */   
/*    */   public AbstractInsnNode clone(Map<LabelNode, LabelNode> paramMap) {
/*    */     // Byte code:
/*    */     //   0: new org/spongepowered/asm/lib/tree/FrameNode
/*    */     //   3: dup
/*    */     //   4: invokespecial <init> : ()V
/*    */     //   7: astore_2
/*    */     //   8: aload_2
/*    */     //   9: aload_0
/*    */     //   10: getfield type : I
/*    */     //   13: putfield type : I
/*    */     //   16: aload_0
/*    */     //   17: getfield local : Ljava/util/List;
/*    */     //   20: ifnull -> 97
/*    */     //   23: aload_2
/*    */     //   24: new java/util/ArrayList
/*    */     //   27: dup
/*    */     //   28: invokespecial <init> : ()V
/*    */     //   31: putfield local : Ljava/util/List;
/*    */     //   34: iconst_0
/*    */     //   35: istore_3
/*    */     //   36: iload_3
/*    */     //   37: aload_0
/*    */     //   38: getfield local : Ljava/util/List;
/*    */     //   41: invokeinterface size : ()I
/*    */     //   46: if_icmpge -> 97
/*    */     //   49: aload_0
/*    */     //   50: getfield local : Ljava/util/List;
/*    */     //   53: iload_3
/*    */     //   54: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   59: astore #4
/*    */     //   61: aload #4
/*    */     //   63: instanceof org/spongepowered/asm/lib/tree/LabelNode
/*    */     //   66: ifeq -> 79
/*    */     //   69: aload_1
/*    */     //   70: aload #4
/*    */     //   72: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   77: astore #4
/*    */     //   79: aload_2
/*    */     //   80: getfield local : Ljava/util/List;
/*    */     //   83: aload #4
/*    */     //   85: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   90: pop
/*    */     //   91: iinc #3, 1
/*    */     //   94: goto -> 36
/*    */     //   97: aload_0
/*    */     //   98: getfield stack : Ljava/util/List;
/*    */     //   101: ifnull -> 178
/*    */     //   104: aload_2
/*    */     //   105: new java/util/ArrayList
/*    */     //   108: dup
/*    */     //   109: invokespecial <init> : ()V
/*    */     //   112: putfield stack : Ljava/util/List;
/*    */     //   115: iconst_0
/*    */     //   116: istore_3
/*    */     //   117: iload_3
/*    */     //   118: aload_0
/*    */     //   119: getfield stack : Ljava/util/List;
/*    */     //   122: invokeinterface size : ()I
/*    */     //   127: if_icmpge -> 178
/*    */     //   130: aload_0
/*    */     //   131: getfield stack : Ljava/util/List;
/*    */     //   134: iload_3
/*    */     //   135: invokeinterface get : (I)Ljava/lang/Object;
/*    */     //   140: astore #4
/*    */     //   142: aload #4
/*    */     //   144: instanceof org/spongepowered/asm/lib/tree/LabelNode
/*    */     //   147: ifeq -> 160
/*    */     //   150: aload_1
/*    */     //   151: aload #4
/*    */     //   153: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   158: astore #4
/*    */     //   160: aload_2
/*    */     //   161: getfield stack : Ljava/util/List;
/*    */     //   164: aload #4
/*    */     //   166: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   171: pop
/*    */     //   172: iinc #3, 1
/*    */     //   175: goto -> 117
/*    */     //   178: aload_2
/*    */     //   179: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 0
/*    */     //   #10	-> 8
/*    */     //   #50	-> 16
/*    */     //   #20	-> 23
/*    */     //   #18	-> 34
/*    */     //   #9	-> 49
/*    */     //   #34	-> 61
/*    */     //   #14	-> 69
/*    */     //   #31	-> 79
/*    */     //   #11	-> 91
/*    */     //   #35	-> 97
/*    */     //   #57	-> 104
/*    */     //   #52	-> 115
/*    */     //   #30	-> 130
/*    */     //   #42	-> 142
/*    */     //   #8	-> 150
/*    */     //   #33	-> 160
/*    */     //   #55	-> 172
/*    */     //   #47	-> 178
/*    */   }
/*    */   
/*    */   private static RuntimeException c(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\FrameNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */