/*    */ package org.spongepowered.asm.lib;
/*    */ 
/*    */ public class Label {
/*    */   static final int DEBUG = 1;
/*    */   static final int RESOLVED = 2;
/*    */   static final int RESIZED = 4;
/*    */   static final int PUSHED = 8;
/*    */   static final int TARGET = 16;
/*    */   static final int STORE = 32;
/*    */   static final int REACHABLE = 64;
/*    */   static final int JSR = 128;
/*    */   static final int RET = 256;
/*    */   static final int SUBROUTINE = 512;
/*    */   static final int VISITED = 1024;
/*    */   static final int VISITED2 = 2048;
/*    */   public Object info;
/*    */   int status;
/*    */   int line;
/*    */   int position;
/*    */   private int referenceCount;
/*    */   private int[] srcAndRefPositions;
/*    */   int inputStackTop;
/*    */   int outputStackMax;
/*    */   Frame frame;
/*    */   Label successor;
/*    */   Edge successors;
/*    */   Label next;
/*    */   
/*    */   boolean inSubroutine(long paramLong) { 
/* 30 */     try { if ((this.status & 0x400) != 0)
/*    */       
/*    */       { 
/*    */         
/*    */         try { 
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
/*    */            }
/*    */         catch (IllegalStateException illegalStateException)
/*    */         
/* 70 */         { throw b(null); }  return ((this.srcAndRefPositions[(int)(paramLong >>> 32L)] & (int)paramLong) != 0); }  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */     
/*    */     return false; }
/*    */   Label getFirst() { try {
/*    */     
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.frame == null) ? this : this.frame.owner; }
/*    */   private void addReference(int paramInt1, int paramInt2) { 
/*    */     try { if (this.srcAndRefPositions == null)
/* 81 */         this.srcAndRefPositions = new int[6];  } catch (IllegalStateException illegalStateException) { throw b(null); }
/*    */      if (this.referenceCount >= this.srcAndRefPositions.length) {
/*    */       int[] arrayOfInt = new int[this.srcAndRefPositions.length + 6]; System.arraycopy(this.srcAndRefPositions, 0, arrayOfInt, 0, this.srcAndRefPositions.length); this.srcAndRefPositions = arrayOfInt;
/*    */     }  this.srcAndRefPositions[this.referenceCount++] = paramInt1; this.srcAndRefPositions[this.referenceCount++] = paramInt2; }
/*    */   public String toString() { return "L" + System.identityHashCode(this); } public int getOffset() { try {
/*    */       if ((this.status & 0x2) == 0)
/*    */         throw new IllegalStateException("Label offset position has not been resolved yet"); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/* 90 */     }  return this.position; }
/*    */   void visitSubroutine(Label paramLabel, long paramLong, int paramInt) { Label label = this; while (label != null) { continue; label1 = label; label = label1.next; }
/* 92 */      } boolean resolve(MethodWriter paramMethodWriter, int paramInt, byte[] paramArrayOfbyte) { boolean bool = false; this.status |= 0x2; this.position = paramInt; byte b = 0;
/* 93 */     while (b < this.referenceCount) {
/*    */       continue;
/*    */       i = this.srcAndRefPositions[b++];
/*    */       j = this.srcAndRefPositions[b++];
/*    */     } 
/*    */     return bool; }
/*    */ 
/*    */   
/*    */   void put(MethodWriter paramMethodWriter, ByteVector paramByteVector, int paramInt, boolean paramBoolean) {
/*    */     try {
/*    */       if ((this.status & 0x2) == 0) {
/*    */         try {
/*    */           if (paramBoolean) {
/*    */             addReference(-1 - paramInt, paramByteVector.length);
/*    */             paramByteVector.putInt(-1);
/*    */           } 
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw b(null);
/*    */         } 
/*    */         addReference(paramInt, paramByteVector.length);
/*    */         paramByteVector.putShort(-1);
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (paramBoolean) {
/*    */         paramByteVector.putInt(this.position - paramInt);
/*    */       } else {
/*    */         paramByteVector.putShort(this.position - paramInt);
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   boolean inSameSubroutine(Label paramLabel) {
/*    */     try {
/*    */       if ((this.status & 0x400) != 0)
/*    */         try {
/*    */           if ((paramLabel.status & 0x400) != 0) {
/*    */             byte b = 0;
/*    */             while (true) {
/*    */               try {
/*    */                 if (b < this.srcAndRefPositions.length) {
/*    */                   try {
/*    */                     if ((this.srcAndRefPositions[b] & paramLabel.srcAndRefPositions[b]) != 0)
/*    */                       return true; 
/*    */                   } catch (IllegalStateException illegalStateException) {
/*    */                     throw b(null);
/*    */                   } 
/*    */                   b++;
/*    */                 } 
/*    */               } catch (IllegalStateException illegalStateException) {
/*    */                 throw b(null);
/*    */               } 
/*    */               return false;
/*    */             } 
/*    */           } 
/*    */           return false;
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   void addToSubroutine(long paramLong, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield status : I
/*    */     //   4: sipush #1024
/*    */     //   7: iand
/*    */     //   8: ifne -> 42
/*    */     //   11: aload_0
/*    */     //   12: dup
/*    */     //   13: getfield status : I
/*    */     //   16: sipush #1024
/*    */     //   19: ior
/*    */     //   20: putfield status : I
/*    */     //   23: aload_0
/*    */     //   24: iload_3
/*    */     //   25: bipush #32
/*    */     //   27: idiv
/*    */     //   28: iconst_1
/*    */     //   29: iadd
/*    */     //   30: newarray int
/*    */     //   32: putfield srcAndRefPositions : [I
/*    */     //   35: goto -> 42
/*    */     //   38: invokestatic b : (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: getfield srcAndRefPositions : [I
/*    */     //   46: lload_1
/*    */     //   47: bipush #32
/*    */     //   49: lushr
/*    */     //   50: l2i
/*    */     //   51: dup2
/*    */     //   52: iaload
/*    */     //   53: lload_1
/*    */     //   54: l2i
/*    */     //   55: ior
/*    */     //   56: iastore
/*    */     //   57: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #85	-> 0
/*    */     //   #74	-> 11
/*    */     //   #17	-> 23
/*    */     //   #15	-> 42
/*    */     //   #28	-> 57
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	35	38	java/lang/IllegalStateException
/*    */   }
/*    */   
/*    */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Label.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */