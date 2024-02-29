/*    */ package com.google.gson.internal;
/*    */ 
/*    */ abstract class LinkedTreeMap$LinkedTreeMapIterator<T> implements Iterator<T> {
/*  4 */   int expectedModCount = LinkedTreeMap.this.modCount;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 11 */   LinkedTreeMap$Node<K, V> next = LinkedTreeMap.this.header.next;
/* 12 */   LinkedTreeMap$Node<K, V> lastReturned = null; final LinkedTreeMap this$0; public final boolean hasNext() { try {  }
/*    */     catch (NoSuchElementException noSuchElementException)
/* 14 */     { throw b(null); }  return (this.next != LinkedTreeMap.this.header); }
/*    */   public final void remove() { 
/* 16 */     try { if (this.lastReturned == null)
/* 17 */         throw new IllegalStateException();  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  LinkedTreeMap.this.removeInternal(this.lastReturned, true); this.lastReturned = null; this.expectedModCount = LinkedTreeMap.this.modCount; } final LinkedTreeMap$Node<K, V> nextNode() { LinkedTreeMap$Node<K, V> linkedTreeMap$Node = this.next; try { if (linkedTreeMap$Node == LinkedTreeMap.this.header) throw new NoSuchElementException();  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  try { if (LinkedTreeMap.this.modCount != this.expectedModCount)
/* 18 */         throw new ConcurrentModificationException();  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  this.next = linkedTreeMap$Node.next; return this.lastReturned = linkedTreeMap$Node; } LinkedTreeMap$LinkedTreeMapIterator(LinkedTreeMap$1 paramLinkedTreeMap$1) { this(); }
/*    */ 
/*    */   
/*    */   private LinkedTreeMap$LinkedTreeMapIterator() {}
/*    */   
/*    */   private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LinkedTreeMap$LinkedTreeMapIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */