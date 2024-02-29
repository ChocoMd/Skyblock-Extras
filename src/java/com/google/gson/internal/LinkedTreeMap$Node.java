/*    */ package com.google.gson.internal;
/*    */ import java.util.Map;
/*    */ final class LinkedTreeMap$Node<K, V> implements Map.Entry<K, V> { LinkedTreeMap$Node<K, V> parent; LinkedTreeMap$Node<K, V> left; LinkedTreeMap$Node<K, V> right; LinkedTreeMap$Node<K, V> next; LinkedTreeMap$Node<K, V> prev; final K key; V value; int height; public K getKey() { return this.key; } public int hashCode() { try {  }
/*    */     catch (RuntimeException runtimeException) { throw b(null); }
/*    */      try {  }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/*  8 */      return ((this.key == null) ? 0 : this.key.hashCode()) ^ ((this.value == null) ? 0 : this.value.hashCode()); } public V setValue(V paramV) { V v = this.value;
/*    */     
/* 10 */     this.value = paramV;
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
/* 33 */     return v; }
/*    */   public boolean equals(Object paramObject) { // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof java/util/Map$Entry
/*    */     //   4: ifeq -> 121
/*    */     //   7: aload_1
/*    */     //   8: checkcast java/util/Map$Entry
/*    */     //   11: astore_2
/*    */     //   12: aload_0
/*    */     //   13: getfield key : Ljava/lang/Object;
/*    */     //   16: ifnonnull -> 42
/*    */     //   19: aload_2
/*    */     //   20: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   25: ifnonnull -> 119
/*    */     //   28: goto -> 35
/*    */     //   31: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   34: athrow
/*    */     //   35: goto -> 58
/*    */     //   38: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: getfield key : Ljava/lang/Object;
/*    */     //   46: aload_2
/*    */     //   47: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   52: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   55: ifeq -> 119
/*    */     //   58: aload_0
/*    */     //   59: getfield value : Ljava/lang/Object;
/*    */     //   62: ifnonnull -> 95
/*    */     //   65: goto -> 72
/*    */     //   68: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   71: athrow
/*    */     //   72: aload_2
/*    */     //   73: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   78: ifnonnull -> 119
/*    */     //   81: goto -> 88
/*    */     //   84: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   87: athrow
/*    */     //   88: goto -> 111
/*    */     //   91: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   94: athrow
/*    */     //   95: aload_0
/*    */     //   96: getfield value : Ljava/lang/Object;
/*    */     //   99: aload_2
/*    */     //   100: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   105: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   108: ifeq -> 119
/*    */     //   111: iconst_1
/*    */     //   112: goto -> 120
/*    */     //   115: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   118: athrow
/*    */     //   119: iconst_0
/*    */     //   120: ireturn
/*    */     //   121: iconst_0
/*    */     //   122: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #32	-> 7
/*    */     //   #16	-> 12
/*    */     //   #7	-> 121
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   12	28	31	java/lang/RuntimeException
/*    */     //   19	38	38	java/lang/RuntimeException
/*    */     //   42	65	68	java/lang/RuntimeException
/*    */     //   58	81	84	java/lang/RuntimeException
/*    */     //   72	91	91	java/lang/RuntimeException
/* 34 */     //   95	115	115	java/lang/RuntimeException } public String toString() { return (new StringBuilder()).append(this.key).append("=").append(this.value).toString(); } LinkedTreeMap$Node(LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node1, K paramK, LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node2, LinkedTreeMap$Node<K, V> paramLinkedTreeMap$Node3) { this.parent = paramLinkedTreeMap$Node1; this.key = paramK; this.height = 1; this.next = paramLinkedTreeMap$Node2; this.prev = paramLinkedTreeMap$Node3; paramLinkedTreeMap$Node3.next = this; paramLinkedTreeMap$Node2.prev = this; } public V getValue() { return this.value; } LinkedTreeMap$Node() { this.key = null; this.next = this.prev = this; }
/* 35 */   public LinkedTreeMap$Node<K, V> last() { LinkedTreeMap$Node<K, V> linkedTreeMap$Node1 = this; LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = linkedTreeMap$Node1.right; while (linkedTreeMap$Node2 != null) { linkedTreeMap$Node1 = linkedTreeMap$Node2; linkedTreeMap$Node2 = linkedTreeMap$Node1.right; }
/* 36 */      return linkedTreeMap$Node1; } public LinkedTreeMap$Node<K, V> first() { LinkedTreeMap$Node<K, V> linkedTreeMap$Node1 = this;
/*    */     LinkedTreeMap$Node<K, V> linkedTreeMap$Node2 = linkedTreeMap$Node1.left;
/*    */     for (; linkedTreeMap$Node2 != null; linkedTreeMap$Node2 = linkedTreeMap$Node1.left)
/*    */       linkedTreeMap$Node1 = linkedTreeMap$Node2; 
/*    */     return linkedTreeMap$Node1; }
/*    */ 
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LinkedTreeMap$Node.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */