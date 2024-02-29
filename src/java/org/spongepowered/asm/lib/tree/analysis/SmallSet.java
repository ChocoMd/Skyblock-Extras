/*    */ package org.spongepowered.asm.lib.tree.analysis;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.NoSuchElementException;
/*    */ import java.util.Set;
/*    */ 
/*    */ class SmallSet<E> extends AbstractSet<E> implements Iterator<E> {
/*    */   E e1;
/*    */   E e2;
/*    */   
/*    */   Set<E> union(SmallSet<E> paramSmallSet) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getfield e1 : Ljava/lang/Object;
/*    */     //   4: aload_0
/*    */     //   5: getfield e1 : Ljava/lang/Object;
/*    */     //   8: if_acmpne -> 29
/*    */     //   11: aload_1
/*    */     //   12: getfield e2 : Ljava/lang/Object;
/*    */     //   15: aload_0
/*    */     //   16: getfield e2 : Ljava/lang/Object;
/*    */     //   19: if_acmpeq -> 65
/*    */     //   22: goto -> 29
/*    */     //   25: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   28: athrow
/*    */     //   29: aload_1
/*    */     //   30: getfield e1 : Ljava/lang/Object;
/*    */     //   33: aload_0
/*    */     //   34: getfield e2 : Ljava/lang/Object;
/*    */     //   37: if_acmpne -> 71
/*    */     //   40: goto -> 47
/*    */     //   43: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   46: athrow
/*    */     //   47: aload_1
/*    */     //   48: getfield e2 : Ljava/lang/Object;
/*    */     //   51: aload_0
/*    */     //   52: getfield e1 : Ljava/lang/Object;
/*    */     //   55: if_acmpne -> 71
/*    */     //   58: goto -> 65
/*    */     //   61: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   64: athrow
/*    */     //   65: aload_0
/*    */     //   66: areturn
/*    */     //   67: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   70: athrow
/*    */     //   71: aload_1
/*    */     //   72: getfield e1 : Ljava/lang/Object;
/*    */     //   75: ifnonnull -> 84
/*    */     //   78: aload_0
/*    */     //   79: areturn
/*    */     //   80: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   83: athrow
/*    */     //   84: aload_0
/*    */     //   85: getfield e1 : Ljava/lang/Object;
/*    */     //   88: ifnonnull -> 97
/*    */     //   91: aload_1
/*    */     //   92: areturn
/*    */     //   93: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   96: athrow
/*    */     //   97: aload_1
/*    */     //   98: getfield e2 : Ljava/lang/Object;
/*    */     //   101: ifnonnull -> 173
/*    */     //   104: aload_0
/*    */     //   105: getfield e2 : Ljava/lang/Object;
/*    */     //   108: ifnonnull -> 138
/*    */     //   111: goto -> 118
/*    */     //   114: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   117: athrow
/*    */     //   118: new org/spongepowered/asm/lib/tree/analysis/SmallSet
/*    */     //   121: dup
/*    */     //   122: aload_0
/*    */     //   123: getfield e1 : Ljava/lang/Object;
/*    */     //   126: aload_1
/*    */     //   127: getfield e1 : Ljava/lang/Object;
/*    */     //   130: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   133: areturn
/*    */     //   134: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   137: athrow
/*    */     //   138: aload_1
/*    */     //   139: getfield e1 : Ljava/lang/Object;
/*    */     //   142: aload_0
/*    */     //   143: getfield e1 : Ljava/lang/Object;
/*    */     //   146: if_acmpeq -> 167
/*    */     //   149: aload_1
/*    */     //   150: getfield e1 : Ljava/lang/Object;
/*    */     //   153: aload_0
/*    */     //   154: getfield e2 : Ljava/lang/Object;
/*    */     //   157: if_acmpne -> 173
/*    */     //   160: goto -> 167
/*    */     //   163: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   166: athrow
/*    */     //   167: aload_0
/*    */     //   168: areturn
/*    */     //   169: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   172: athrow
/*    */     //   173: aload_0
/*    */     //   174: getfield e2 : Ljava/lang/Object;
/*    */     //   177: ifnonnull -> 222
/*    */     //   180: aload_0
/*    */     //   181: getfield e1 : Ljava/lang/Object;
/*    */     //   184: aload_1
/*    */     //   185: getfield e1 : Ljava/lang/Object;
/*    */     //   188: if_acmpeq -> 216
/*    */     //   191: goto -> 198
/*    */     //   194: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   197: athrow
/*    */     //   198: aload_0
/*    */     //   199: getfield e1 : Ljava/lang/Object;
/*    */     //   202: aload_1
/*    */     //   203: getfield e2 : Ljava/lang/Object;
/*    */     //   206: if_acmpne -> 222
/*    */     //   209: goto -> 216
/*    */     //   212: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   215: athrow
/*    */     //   216: aload_1
/*    */     //   217: areturn
/*    */     //   218: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   221: athrow
/*    */     //   222: new java/util/HashSet
/*    */     //   225: dup
/*    */     //   226: iconst_4
/*    */     //   227: invokespecial <init> : (I)V
/*    */     //   230: astore_2
/*    */     //   231: aload_2
/*    */     //   232: aload_0
/*    */     //   233: getfield e1 : Ljava/lang/Object;
/*    */     //   236: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   239: pop
/*    */     //   240: aload_0
/*    */     //   241: getfield e2 : Ljava/lang/Object;
/*    */     //   244: ifnull -> 263
/*    */     //   247: aload_2
/*    */     //   248: aload_0
/*    */     //   249: getfield e2 : Ljava/lang/Object;
/*    */     //   252: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   255: pop
/*    */     //   256: goto -> 263
/*    */     //   259: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   262: athrow
/*    */     //   263: aload_2
/*    */     //   264: aload_1
/*    */     //   265: getfield e1 : Ljava/lang/Object;
/*    */     //   268: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   271: pop
/*    */     //   272: aload_1
/*    */     //   273: getfield e2 : Ljava/lang/Object;
/*    */     //   276: ifnull -> 295
/*    */     //   279: aload_2
/*    */     //   280: aload_1
/*    */     //   281: getfield e2 : Ljava/lang/Object;
/*    */     //   284: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   287: pop
/*    */     //   288: goto -> 295
/*    */     //   291: invokestatic b : (Ljava/util/NoSuchElementException;)Ljava/util/NoSuchElementException;
/*    */     //   294: athrow
/*    */     //   295: aload_2
/*    */     //   296: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 0
/*    */     //   #12	-> 65
/*    */     //   #37	-> 71
/*    */     //   #9	-> 78
/*    */     //   #11	-> 84
/*    */     //   #30	-> 91
/*    */     //   #34	-> 97
/*    */     //   #32	-> 104
/*    */     //   #6	-> 118
/*    */     //   #22	-> 138
/*    */     //   #4	-> 167
/*    */     //   #17	-> 173
/*    */     //   #13	-> 180
/*    */     //   #27	-> 216
/*    */     //   #20	-> 222
/*    */     //   #1	-> 231
/*    */     //   #5	-> 240
/*    */     //   #18	-> 247
/*    */     //   #10	-> 263
/*    */     //   #8	-> 272
/*    */     //   #21	-> 279
/*    */     //   #29	-> 295
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	22	25	java/util/NoSuchElementException
/*    */     //   11	40	43	java/util/NoSuchElementException
/*    */     //   29	58	61	java/util/NoSuchElementException
/*    */     //   47	67	67	java/util/NoSuchElementException
/*    */     //   71	80	80	java/util/NoSuchElementException
/*    */     //   84	93	93	java/util/NoSuchElementException
/*    */     //   97	111	114	java/util/NoSuchElementException
/*    */     //   104	134	134	java/util/NoSuchElementException
/*    */     //   138	160	163	java/util/NoSuchElementException
/*    */     //   149	169	169	java/util/NoSuchElementException
/*    */     //   173	191	194	java/util/NoSuchElementException
/*    */     //   180	209	212	java/util/NoSuchElementException
/*    */     //   198	218	218	java/util/NoSuchElementException
/*    */     //   231	256	259	java/util/NoSuchElementException
/*    */     //   263	288	291	java/util/NoSuchElementException
/*    */   }
/*    */   
/* 15 */   static final <T> Set<T> emptySet() { return new SmallSet<T>(null, null); } public int size() { try { try {  }
/* 16 */       catch (NoSuchElementException noSuchElementException) { throw b(null); }  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  return (this.e1 == null) ? 0 : ((this.e2 == null) ? 1 : 2); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Iterator<E> iterator() {
/* 24 */     return new SmallSet(this.e1, this.e2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   SmallSet(E paramE1, E paramE2) {
/*    */     this.e1 = paramE1;
/* 36 */     this.e2 = paramE2;
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.e1 != null);
/*    */   }
/*    */   
/*    */   public void remove() {}
/*    */   
/*    */   public E next() {
/*    */     try {
/*    */       if (this.e1 == null)
/*    */         throw new NoSuchElementException(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     E e = this.e1;
/*    */     this.e1 = this.e2;
/*    */     this.e2 = null;
/*    */     return e;
/*    */   }
/*    */   
/*    */   private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\analysis\SmallSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */