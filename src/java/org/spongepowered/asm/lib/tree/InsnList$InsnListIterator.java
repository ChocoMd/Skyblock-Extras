/*  1 */ package org.spongepowered.asm.lib.tree;final class InsnList$InsnListIterator implements ListIterator { AbstractInsnNode next; AbstractInsnNode prev; AbstractInsnNode remove; final InsnList this$0; public Object next() { try { if (this.next == null)
/*    */       {
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
/* 35 */         throw new NoSuchElementException(); }  } catch (NoSuchElementException noSuchElementException) { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     AbstractInsnNode abstractInsnNode = this.next;
/*    */ 
/*    */ 
/*    */     
/* 44 */     this.prev = abstractInsnNode;
/*    */     this.next = abstractInsnNode.next;
/*    */     this.remove = abstractInsnNode;
/*    */     return abstractInsnNode; } public void remove() { 
/*    */     try { if (this.remove != null)
/*    */       { 
/*    */         try { if (this.remove == this.next)
/*    */           { this.next = this.next.next; }
/*    */           else
/* 53 */           { this.prev = this.prev.prev; }  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  InsnList.this.remove(this.remove); this.remove = null; } else { throw new IllegalStateException(); }  } catch (NoSuchElementException noSuchElementException) { throw b(null); }  } public void add(Object paramObject) { try { if (this.next != null) { InsnList.this.insertBefore(this.next, (AbstractInsnNode)paramObject); } else { try { if (this.prev != null) { InsnList.this.insert(this.prev, (AbstractInsnNode)paramObject); }
/* 54 */           else { InsnList.this.add((AbstractInsnNode)paramObject); }
/*    */            }
/*    */         catch (NoSuchElementException noSuchElementException)
/*    */         { throw b(null); }
/*    */          }
/*    */        }
/*    */     catch (NoSuchElementException noSuchElementException)
/*    */     { throw b(null); }
/*    */     
/*    */     this.prev = (AbstractInsnNode)paramObject;
/*    */     this.remove = null; }
/*    */ 
/*    */   
/*    */   public Object previous() {
/*    */     AbstractInsnNode abstractInsnNode = this.prev;
/*    */     this.next = abstractInsnNode;
/*    */     this.prev = abstractInsnNode.prev;
/*    */     this.remove = abstractInsnNode;
/*    */     return abstractInsnNode;
/*    */   }
/*    */   
/*    */   InsnList$InsnListIterator(int paramInt) {
/*    */     if (paramInt == paramInsnList.size()) {
/*    */       this.next = null;
/*    */       this.prev = paramInsnList.getLast();
/*    */     } else {
/*    */       this.next = paramInsnList.get(paramInt);
/*    */       this.prev = this.next.prev;
/*    */     } 
/*    */   }
/*    */   
/*    */   public int nextIndex() {
/*    */     try {
/*    */       if (this.next == null)
/*    */         return InsnList.this.size(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (InsnList.this.cache == null)
/*    */         InsnList.this.cache = InsnList.this.toArray(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.next.index;
/*    */   }
/*    */   
/*    */   public boolean hasPrevious() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.prev != null);
/*    */   }
/*    */   
/*    */   public int previousIndex() {
/*    */     try {
/*    */       if (this.prev == null)
/*    */         return -1; 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (InsnList.this.cache == null)
/*    */         InsnList.this.cache = InsnList.this.toArray(); 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return this.prev.index;
/*    */   }
/*    */   
/*    */   public void set(Object paramObject) {
/*    */     try {
/*    */       if (this.remove != null) {
/*    */         try {
/*    */           InsnList.this.set(this.remove, (AbstractInsnNode)paramObject);
/*    */           if (this.remove == this.prev) {
/*    */             this.prev = (AbstractInsnNode)paramObject;
/*    */           } else {
/*    */             this.next = (AbstractInsnNode)paramObject;
/*    */           } 
/*    */         } catch (NoSuchElementException noSuchElementException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } else {
/*    */         throw new IllegalStateException();
/*    */       } 
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean hasNext() {
/*    */     try {
/*    */     
/*    */     } catch (NoSuchElementException noSuchElementException) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (this.next != null);
/*    */   }
/*    */   
/*    */   private static NoSuchElementException b(NoSuchElementException paramNoSuchElementException) {
/*    */     return paramNoSuchElementException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\InsnList$InsnListIterator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */