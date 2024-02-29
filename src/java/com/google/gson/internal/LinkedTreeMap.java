/*     */ package com.google.gson.internal;
/*     */ 
/*     */ import java.io.ObjectStreamException;
/*     */ import java.io.Serializable;
/*     */ import java.util.AbstractMap;
/*     */ import java.util.Comparator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public final class LinkedTreeMap<K, V>
/*     */   extends AbstractMap<K, V>
/*     */   implements Serializable
/*     */ {
/*     */   static {
/*     */     try {
/*     */     
/*     */     } catch (NullPointerException nullPointerException) {
/*  20 */       throw b(null);
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void rotateLeft(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node) {
/*     */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node1 = paramLinkedTreeMap$Node.left;
/* 149 */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = paramLinkedTreeMap$Node.right;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node3 = linkedTreeMap$Node2.left;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node4 = linkedTreeMap$Node2.right;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try { paramLinkedTreeMap$Node.right = linkedTreeMap$Node3;
/*     */ 
/*     */ 
/*     */       
/*     */       if (linkedTreeMap$Node3 != null)
/* 170 */         linkedTreeMap$Node3.parent = paramLinkedTreeMap$Node;  } catch (NullPointerException nullPointerException) { throw b(null); }  try { replaceInParent(paramLinkedTreeMap$Node, linkedTreeMap$Node2); linkedTreeMap$Node2.left = paramLinkedTreeMap$Node; paramLinkedTreeMap$Node.parent = linkedTreeMap$Node2; } catch (NullPointerException nullPointerException) { throw b(null); }  try {  } catch (NullPointerException nullPointerException) { throw b(null); }  try { paramLinkedTreeMap$Node.height = Math.max((linkedTreeMap$Node1 != null) ? linkedTreeMap$Node1.height : 0, (linkedTreeMap$Node3 != null) ? linkedTreeMap$Node3.height : 0) + 1; } catch (NullPointerException nullPointerException) { throw b(null); }  linkedTreeMap$Node2.height = Math.max(paramLinkedTreeMap$Node.height, (linkedTreeMap$Node4 != null) ? linkedTreeMap$Node4.height : 0) + 1;
/*     */   } int size = 0; static final boolean $assertionsDisabled = !LinkedTreeMap.class.desiredAssertionStatus(); public void clear() { this.root = null; this.size = 0; this.modCount++; LinkedTreeMap$Node<K, V> linkedTreeMap$Node = this.header; linkedTreeMap$Node.next = linkedTreeMap$Node.prev = linkedTreeMap$Node; } public LinkedTreeMap(Comparator<? super K> paramComparator) { this.comparator = (paramComparator != null) ? paramComparator : (Comparator)NATURAL_ORDER; } public V put(K paramK, V paramV) { try { if (paramK == null)
/*     */         throw new NullPointerException("key == null");  } catch (NullPointerException nullPointerException) { throw b(null); }  LinkedTreeMap$Node<K, V> linkedTreeMap$Node = find(paramK, true); V v = linkedTreeMap$Node.value; linkedTreeMap$Node.value = paramV; return v; }
/*     */   public boolean containsKey(Object paramObject) { try {  } catch (NullPointerException nullPointerException) { throw b(null); }  return (findByObject(paramObject) != null); }
/*     */   final LinkedTreeMap$Node<K, V> header = new LinkedTreeMap$Node<K, V>();
/*     */   LinkedTreeMap$Node<K, V> removeInternalByKey(Object paramObject) { LinkedTreeMap$Node<K, V> linkedTreeMap$Node = findByObject(paramObject); try { if (linkedTreeMap$Node != null)
/* 176 */         removeInternal(linkedTreeMap$Node, true);  } catch (NullPointerException nullPointerException) { throw b(null); }  return linkedTreeMap$Node; }
/*     */   public Set<K> keySet() { LinkedTreeMap$KeySet linkedTreeMap$KeySet = this.keySet; try {  } catch (NullPointerException nullPointerException) { throw b(null); }  return (linkedTreeMap$KeySet != null) ? linkedTreeMap$KeySet : (this.keySet = new LinkedTreeMap$KeySet(this)); } LinkedTreeMap$Node<K, V> findByEntry(Map.Entry<?, ?> paramEntry) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   7: invokevirtual findByObject : (Ljava/lang/Object;)Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   10: astore_2
/*     */     //   11: aload_2
/*     */     //   12: ifnull -> 47
/*     */     //   15: aload_0
/*     */     //   16: aload_2
/*     */     //   17: getfield value : Ljava/lang/Object;
/*     */     //   20: aload_1
/*     */     //   21: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   26: invokespecial equal : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   29: ifeq -> 47
/*     */     //   32: goto -> 39
/*     */     //   35: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   38: athrow
/*     */     //   39: iconst_1
/*     */     //   40: goto -> 48
/*     */     //   43: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   46: athrow
/*     */     //   47: iconst_0
/*     */     //   48: istore_3
/*     */     //   49: iload_3
/*     */     //   50: ifeq -> 61
/*     */     //   53: aload_2
/*     */     //   54: goto -> 62
/*     */     //   57: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   60: athrow
/*     */     //   61: aconst_null
/*     */     //   62: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #80	-> 0
/*     */     //   #63	-> 11
/*     */     //   #75	-> 49
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   11	32	35	java/lang/NullPointerException
/*     */     //   15	43	43	java/lang/NullPointerException
/* 177 */     //   49	57	57	java/lang/NullPointerException } public int size() { return this.size; } int modCount = 0; private static final Comparator<Comparable> NATURAL_ORDER; Comparator<? super K> comparator; private void replaceInParent(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node1, LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node2) { LinkedTreeMap$Node<K, V> linkedTreeMap$Node = paramLinkedTreeMap$Node1.parent; try { paramLinkedTreeMap$Node1.parent = null; if (paramLinkedTreeMap$Node2 != null) paramLinkedTreeMap$Node2.parent = linkedTreeMap$Node;  } catch (NullPointerException nullPointerException) { throw b(null); }  try { if (linkedTreeMap$Node != null) { try { if (linkedTreeMap$Node.left == paramLinkedTreeMap$Node1) { linkedTreeMap$Node.left = paramLinkedTreeMap$Node2; } else { try { assert false; } catch (NullPointerException nullPointerException) { throw b(null); }  linkedTreeMap$Node.right = paramLinkedTreeMap$Node2; }  } catch (NullPointerException nullPointerException) { throw b(null); }  } else { this.root = paramLinkedTreeMap$Node2; }  } catch (NullPointerException nullPointerException) { throw b(null); }  }
/*     */   LinkedTreeMap$Node<K, V> root;
/*     */   private LinkedTreeMap$EntrySet entrySet;
/*     */   private LinkedTreeMap$KeySet keySet;
/*     */   private void rotateRight(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node) { LinkedTreeMap$Node<K, V> linkedTreeMap$Node1 = paramLinkedTreeMap$Node.left; LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = paramLinkedTreeMap$Node.right; LinkedTreeMap$Node<K, V> linkedTreeMap$Node3 = linkedTreeMap$Node1.left; LinkedTreeMap$Node<K, V> linkedTreeMap$Node4 = linkedTreeMap$Node1.right; try { paramLinkedTreeMap$Node.left = linkedTreeMap$Node4; if (linkedTreeMap$Node4 != null)
/*     */         linkedTreeMap$Node4.parent = paramLinkedTreeMap$Node;  } catch (NullPointerException nullPointerException) { throw b(null); }  try { replaceInParent(paramLinkedTreeMap$Node, linkedTreeMap$Node1); linkedTreeMap$Node1.right = paramLinkedTreeMap$Node; paramLinkedTreeMap$Node.parent = linkedTreeMap$Node1; } catch (NullPointerException nullPointerException) { throw b(null); }  try {  } catch (NullPointerException nullPointerException) { throw b(null); }  try { paramLinkedTreeMap$Node.height = Math.max((linkedTreeMap$Node2 != null) ? linkedTreeMap$Node2.height : 0, (linkedTreeMap$Node4 != null) ? linkedTreeMap$Node4.height : 0) + 1; } catch (NullPointerException nullPointerException) { throw b(null); }  linkedTreeMap$Node1.height = Math.max(paramLinkedTreeMap$Node.height, (linkedTreeMap$Node3 != null) ? linkedTreeMap$Node3.height : 0) + 1; } private boolean equal(Object paramObject1, Object paramObject2) { try { if (paramObject1 != paramObject2) { try { if (paramObject1 != null)
/*     */             try { if (paramObject1.equals(paramObject2)); } catch (NullPointerException nullPointerException) { throw b(null); }   } catch (NullPointerException nullPointerException) { throw b(null); }  return false; }  } catch (NullPointerException nullPointerException) { throw b(null); }  } private Object writeReplace() throws ObjectStreamException { return new LinkedHashMap<Object, Object>(this); } public V remove(Object paramObject) { LinkedTreeMap$Node<K, V> linkedTreeMap$Node = removeInternalByKey(paramObject); try {  } catch (NullPointerException nullPointerException) { throw b(null); }
/*     */      return (linkedTreeMap$Node != null) ? linkedTreeMap$Node.value : null; } LinkedTreeMap$Node<K, V> findByObject(Object paramObject) { try { try {  }
/*     */       catch (ClassCastException classCastException) { throw b(null); }
/*     */        return (paramObject != null) ? find((K)paramObject, false) : null; }
/* 187 */     catch (ClassCastException classCastException)
/*     */     { return null; }
/*     */      }
/*     */ 
/*     */   
/*     */   LinkedTreeMap$Node<K, V> find(K paramK, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield comparator : Ljava/util/Comparator;
/*     */     //   4: astore_3
/*     */     //   5: aload_0
/*     */     //   6: getfield root : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   9: astore #4
/*     */     //   11: iconst_0
/*     */     //   12: istore #5
/*     */     //   14: aload #4
/*     */     //   16: ifnull -> 140
/*     */     //   19: aload_3
/*     */     //   20: getstatic com/google/gson/internal/LinkedTreeMap.NATURAL_ORDER : Ljava/util/Comparator;
/*     */     //   23: if_acmpne -> 44
/*     */     //   26: goto -> 33
/*     */     //   29: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   32: athrow
/*     */     //   33: aload_1
/*     */     //   34: checkcast java/lang/Comparable
/*     */     //   37: goto -> 45
/*     */     //   40: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   43: athrow
/*     */     //   44: aconst_null
/*     */     //   45: astore #6
/*     */     //   47: aload #6
/*     */     //   49: ifnull -> 71
/*     */     //   52: aload #6
/*     */     //   54: aload #4
/*     */     //   56: getfield key : Ljava/lang/Object;
/*     */     //   59: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   64: goto -> 83
/*     */     //   67: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   70: athrow
/*     */     //   71: aload_3
/*     */     //   72: aload_1
/*     */     //   73: aload #4
/*     */     //   75: getfield key : Ljava/lang/Object;
/*     */     //   78: invokeinterface compare : (Ljava/lang/Object;Ljava/lang/Object;)I
/*     */     //   83: istore #5
/*     */     //   85: iload #5
/*     */     //   87: ifne -> 97
/*     */     //   90: aload #4
/*     */     //   92: areturn
/*     */     //   93: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   96: athrow
/*     */     //   97: iload #5
/*     */     //   99: ifge -> 114
/*     */     //   102: aload #4
/*     */     //   104: getfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   107: goto -> 119
/*     */     //   110: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   113: athrow
/*     */     //   114: aload #4
/*     */     //   116: getfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   119: astore #7
/*     */     //   121: aload #7
/*     */     //   123: ifnonnull -> 133
/*     */     //   126: goto -> 140
/*     */     //   129: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   132: athrow
/*     */     //   133: aload #7
/*     */     //   135: astore #4
/*     */     //   137: goto -> 47
/*     */     //   140: iload_2
/*     */     //   141: ifne -> 150
/*     */     //   144: aconst_null
/*     */     //   145: areturn
/*     */     //   146: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   149: athrow
/*     */     //   150: aload_0
/*     */     //   151: getfield header : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   154: astore #6
/*     */     //   156: aload #4
/*     */     //   158: ifnonnull -> 254
/*     */     //   161: aload_3
/*     */     //   162: getstatic com/google/gson/internal/LinkedTreeMap.NATURAL_ORDER : Ljava/util/Comparator;
/*     */     //   165: if_acmpne -> 226
/*     */     //   168: goto -> 175
/*     */     //   171: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   174: athrow
/*     */     //   175: aload_1
/*     */     //   176: instanceof java/lang/Comparable
/*     */     //   179: ifne -> 226
/*     */     //   182: goto -> 189
/*     */     //   185: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   188: athrow
/*     */     //   189: new java/lang/ClassCastException
/*     */     //   192: dup
/*     */     //   193: new java/lang/StringBuilder
/*     */     //   196: dup
/*     */     //   197: invokespecial <init> : ()V
/*     */     //   200: aload_1
/*     */     //   201: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   204: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   207: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   210: ldc ' is not Comparable'
/*     */     //   212: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   215: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   218: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   221: athrow
/*     */     //   222: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   225: athrow
/*     */     //   226: new com/google/gson/internal/LinkedTreeMap$Node
/*     */     //   229: dup
/*     */     //   230: aload #4
/*     */     //   232: aload_1
/*     */     //   233: aload #6
/*     */     //   235: aload #6
/*     */     //   237: getfield prev : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   240: invokespecial <init> : (Lcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   243: astore #7
/*     */     //   245: aload_0
/*     */     //   246: aload #7
/*     */     //   248: putfield root : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   251: goto -> 306
/*     */     //   254: new com/google/gson/internal/LinkedTreeMap$Node
/*     */     //   257: dup
/*     */     //   258: aload #4
/*     */     //   260: aload_1
/*     */     //   261: aload #6
/*     */     //   263: aload #6
/*     */     //   265: getfield prev : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   268: invokespecial <init> : (Lcom/google/gson/internal/LinkedTreeMap$Node;Ljava/lang/Object;Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   271: astore #7
/*     */     //   273: iload #5
/*     */     //   275: ifge -> 292
/*     */     //   278: aload #4
/*     */     //   280: aload #7
/*     */     //   282: putfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   285: goto -> 299
/*     */     //   288: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   291: athrow
/*     */     //   292: aload #4
/*     */     //   294: aload #7
/*     */     //   296: putfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   299: aload_0
/*     */     //   300: aload #4
/*     */     //   302: iconst_1
/*     */     //   303: invokespecial rebalance : (Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
/*     */     //   306: aload_0
/*     */     //   307: dup
/*     */     //   308: getfield size : I
/*     */     //   311: iconst_1
/*     */     //   312: iadd
/*     */     //   313: putfield size : I
/*     */     //   316: aload_0
/*     */     //   317: dup
/*     */     //   318: getfield modCount : I
/*     */     //   321: iconst_1
/*     */     //   322: iadd
/*     */     //   323: putfield modCount : I
/*     */     //   326: aload #7
/*     */     //   328: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 0
/*     */     //   #116	-> 5
/*     */     //   #122	-> 11
/*     */     //   #172	-> 14
/*     */     //   #186	-> 19
/*     */     //   #76	-> 47
/*     */     //   #139	-> 85
/*     */     //   #98	-> 90
/*     */     //   #36	-> 97
/*     */     //   #171	-> 121
/*     */     //   #155	-> 126
/*     */     //   #3	-> 133
/*     */     //   #95	-> 137
/*     */     //   #41	-> 140
/*     */     //   #184	-> 144
/*     */     //   #160	-> 150
/*     */     //   #79	-> 156
/*     */     //   #51	-> 161
/*     */     //   #119	-> 189
/*     */     //   #137	-> 226
/*     */     //   #31	-> 245
/*     */     //   #81	-> 254
/*     */     //   #189	-> 273
/*     */     //   #53	-> 278
/*     */     //   #102	-> 292
/*     */     //   #88	-> 299
/*     */     //   #87	-> 306
/*     */     //   #78	-> 316
/*     */     //   #34	-> 326
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   14	26	29	java/lang/NullPointerException
/*     */     //   19	40	40	java/lang/NullPointerException
/*     */     //   47	67	67	java/lang/NullPointerException
/*     */     //   85	93	93	java/lang/NullPointerException
/*     */     //   97	110	110	java/lang/NullPointerException
/*     */     //   121	129	129	java/lang/NullPointerException
/*     */     //   140	146	146	java/lang/NullPointerException
/*     */     //   156	168	171	java/lang/NullPointerException
/*     */     //   161	182	185	java/lang/NullPointerException
/*     */     //   175	222	222	java/lang/NullPointerException
/*     */     //   273	288	288	java/lang/NullPointerException
/*     */   }
/*     */   
/*     */   private void rebalance(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node, boolean paramBoolean) {
/*     */     for (LinkedTreeMap$Node<K, V> linkedTreeMap$Node = paramLinkedTreeMap$Node; linkedTreeMap$Node != null; ) {
/*     */       continue;
/*     */       linkedTreeMap$Node1 = linkedTreeMap$Node.left;
/*     */       linkedTreeMap$Node2 = linkedTreeMap$Node.right;
/*     */     } 
/*     */   }
/*     */   
/*     */   public V get(Object paramObject) {
/*     */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node = findByObject(paramObject);
/*     */     try {
/*     */     
/*     */     } catch (NullPointerException nullPointerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (linkedTreeMap$Node != null) ? linkedTreeMap$Node.value : null;
/*     */   }
/*     */   
/*     */   static {
/*     */     NATURAL_ORDER = new LinkedTreeMap$1();
/*     */   }
/*     */   
/*     */   void removeInternal(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node, boolean paramBoolean) {
/*     */     // Byte code:
/*     */     //   0: iload_2
/*     */     //   1: ifeq -> 33
/*     */     //   4: aload_1
/*     */     //   5: getfield prev : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   8: aload_1
/*     */     //   9: getfield next : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   12: putfield next : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   15: aload_1
/*     */     //   16: getfield next : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   19: aload_1
/*     */     //   20: getfield prev : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   23: putfield prev : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   26: goto -> 33
/*     */     //   29: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   32: athrow
/*     */     //   33: aload_1
/*     */     //   34: getfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   37: astore_3
/*     */     //   38: aload_1
/*     */     //   39: getfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   42: astore #4
/*     */     //   44: aload_1
/*     */     //   45: getfield parent : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   48: astore #5
/*     */     //   50: aload_3
/*     */     //   51: ifnull -> 207
/*     */     //   54: aload #4
/*     */     //   56: ifnull -> 207
/*     */     //   59: goto -> 66
/*     */     //   62: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   65: athrow
/*     */     //   66: aload_3
/*     */     //   67: getfield height : I
/*     */     //   70: aload #4
/*     */     //   72: getfield height : I
/*     */     //   75: if_icmple -> 96
/*     */     //   78: goto -> 85
/*     */     //   81: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   84: athrow
/*     */     //   85: aload_3
/*     */     //   86: invokevirtual last : ()Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   89: goto -> 101
/*     */     //   92: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   95: athrow
/*     */     //   96: aload #4
/*     */     //   98: invokevirtual first : ()Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   101: astore #6
/*     */     //   103: aload_0
/*     */     //   104: aload #6
/*     */     //   106: iconst_0
/*     */     //   107: invokevirtual removeInternal : (Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
/*     */     //   110: iconst_0
/*     */     //   111: istore #7
/*     */     //   113: aload_1
/*     */     //   114: getfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   117: astore_3
/*     */     //   118: aload_3
/*     */     //   119: ifnull -> 145
/*     */     //   122: aload_3
/*     */     //   123: getfield height : I
/*     */     //   126: istore #7
/*     */     //   128: aload #6
/*     */     //   130: aload_3
/*     */     //   131: putfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   134: aload_3
/*     */     //   135: aload #6
/*     */     //   137: putfield parent : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   140: aload_1
/*     */     //   141: aconst_null
/*     */     //   142: putfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   145: iconst_0
/*     */     //   146: istore #8
/*     */     //   148: aload_1
/*     */     //   149: getfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   152: astore #4
/*     */     //   154: aload #4
/*     */     //   156: ifnull -> 185
/*     */     //   159: aload #4
/*     */     //   161: getfield height : I
/*     */     //   164: istore #8
/*     */     //   166: aload #6
/*     */     //   168: aload #4
/*     */     //   170: putfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   173: aload #4
/*     */     //   175: aload #6
/*     */     //   177: putfield parent : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   180: aload_1
/*     */     //   181: aconst_null
/*     */     //   182: putfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   185: aload #6
/*     */     //   187: iload #7
/*     */     //   189: iload #8
/*     */     //   191: invokestatic max : (II)I
/*     */     //   194: iconst_1
/*     */     //   195: iadd
/*     */     //   196: putfield height : I
/*     */     //   199: aload_0
/*     */     //   200: aload_1
/*     */     //   201: aload #6
/*     */     //   203: invokespecial replaceInParent : (Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   206: return
/*     */     //   207: aload_3
/*     */     //   208: ifnull -> 229
/*     */     //   211: aload_0
/*     */     //   212: aload_1
/*     */     //   213: aload_3
/*     */     //   214: invokespecial replaceInParent : (Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   217: aload_1
/*     */     //   218: aconst_null
/*     */     //   219: putfield left : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   222: goto -> 259
/*     */     //   225: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   228: athrow
/*     */     //   229: aload #4
/*     */     //   231: ifnull -> 253
/*     */     //   234: aload_0
/*     */     //   235: aload_1
/*     */     //   236: aload #4
/*     */     //   238: invokespecial replaceInParent : (Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   241: aload_1
/*     */     //   242: aconst_null
/*     */     //   243: putfield right : Lcom/google/gson/internal/LinkedTreeMap$Node;
/*     */     //   246: goto -> 259
/*     */     //   249: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*     */     //   252: athrow
/*     */     //   253: aload_0
/*     */     //   254: aload_1
/*     */     //   255: aconst_null
/*     */     //   256: invokespecial replaceInParent : (Lcom/google/gson/internal/LinkedTreeMap$Node;Lcom/google/gson/internal/LinkedTreeMap$Node;)V
/*     */     //   259: aload_0
/*     */     //   260: aload #5
/*     */     //   262: iconst_0
/*     */     //   263: invokespecial rebalance : (Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V
/*     */     //   266: aload_0
/*     */     //   267: dup
/*     */     //   268: getfield size : I
/*     */     //   271: iconst_1
/*     */     //   272: isub
/*     */     //   273: putfield size : I
/*     */     //   276: aload_0
/*     */     //   277: dup
/*     */     //   278: getfield modCount : I
/*     */     //   281: iconst_1
/*     */     //   282: iadd
/*     */     //   283: putfield modCount : I
/*     */     //   286: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #164	-> 0
/*     */     //   #56	-> 4
/*     */     //   #112	-> 15
/*     */     //   #183	-> 33
/*     */     //   #55	-> 38
/*     */     //   #150	-> 44
/*     */     //   #40	-> 50
/*     */     //   #135	-> 66
/*     */     //   #132	-> 103
/*     */     //   #39	-> 110
/*     */     //   #111	-> 113
/*     */     //   #173	-> 118
/*     */     //   #11	-> 122
/*     */     //   #144	-> 128
/*     */     //   #70	-> 134
/*     */     //   #121	-> 140
/*     */     //   #180	-> 145
/*     */     //   #46	-> 148
/*     */     //   #161	-> 154
/*     */     //   #2	-> 159
/*     */     //   #105	-> 166
/*     */     //   #159	-> 173
/*     */     //   #108	-> 180
/*     */     //   #127	-> 185
/*     */     //   #163	-> 199
/*     */     //   #18	-> 206
/*     */     //   #179	-> 207
/*     */     //   #44	-> 211
/*     */     //   #165	-> 217
/*     */     //   #74	-> 229
/*     */     //   #188	-> 234
/*     */     //   #133	-> 241
/*     */     //   #65	-> 253
/*     */     //   #140	-> 259
/*     */     //   #101	-> 266
/*     */     //   #5	-> 276
/*     */     //   #45	-> 286
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   0	26	29	java/lang/NullPointerException
/*     */     //   50	59	62	java/lang/NullPointerException
/*     */     //   54	78	81	java/lang/NullPointerException
/*     */     //   66	92	92	java/lang/NullPointerException
/*     */     //   207	225	225	java/lang/NullPointerException
/*     */     //   229	249	249	java/lang/NullPointerException
/*     */   }
/*     */   
/*     */   public LinkedTreeMap() {
/*     */     this((Comparator)NATURAL_ORDER);
/*     */   }
/*     */   
/*     */   public Set<Map.Entry<K, V>> entrySet() {
/*     */     LinkedTreeMap$EntrySet linkedTreeMap$EntrySet = this.entrySet;
/*     */     try {
/*     */     
/*     */     } catch (NullPointerException nullPointerException) {
/*     */       throw b(null);
/*     */     } 
/*     */     return (linkedTreeMap$EntrySet != null) ? linkedTreeMap$EntrySet : (this.entrySet = new LinkedTreeMap$EntrySet(this));
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   }
/*     */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LinkedTreeMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */