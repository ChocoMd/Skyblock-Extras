/*     */ package org.spongepowered.asm.lib.tree;public class InsnList { private int size; private AbstractInsnNode first; private AbstractInsnNode last;
/*     */   AbstractInsnNode[] cache;
/*     */   
/*     */   public void insertBefore(AbstractInsnNode paramAbstractInsnNode, InsnList paramInsnList) { try {
/*   5 */       if (paramInsnList.size == 0)
/*     */         return; 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*   8 */       throw b(null);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 140 */     this.size += paramInsnList.size;
/*     */ 
/*     */     
/*     */     AbstractInsnNode abstractInsnNode1 = paramInsnList.first;
/*     */ 
/*     */     
/*     */     AbstractInsnNode abstractInsnNode2 = paramInsnList.last;
/*     */ 
/*     */     
/*     */     AbstractInsnNode abstractInsnNode3 = paramAbstractInsnNode.prev;
/*     */ 
/*     */     
/*     */     try {
/* 153 */       if (abstractInsnNode3 == null) {
/*     */         this.first = abstractInsnNode1;
/*     */       } else {
/*     */         abstractInsnNode3.next = abstractInsnNode1;
/*     */       } 
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     }  paramAbstractInsnNode.prev = abstractInsnNode2; abstractInsnNode2.next = paramAbstractInsnNode; abstractInsnNode1.prev = abstractInsnNode3;
/*     */     this.cache = null;
/*     */     paramInsnList.removeAll(false); } public int indexOf(AbstractInsnNode paramAbstractInsnNode) { 
/*     */     try { if (this.cache == null)
/* 164 */         this.cache = toArray();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }
/*     */      return paramAbstractInsnNode.index; } public boolean contains(AbstractInsnNode paramAbstractInsnNode) { AbstractInsnNode abstractInsnNode = this.first; while (true) {
/*     */       try {
/*     */         if (abstractInsnNode != null && abstractInsnNode != paramAbstractInsnNode) {
/*     */           abstractInsnNode = abstractInsnNode.next; continue;
/*     */         } 
/*     */       } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */         throw b(null);
/*     */       }  break;
/*     */     }  try {
/*     */     
/*     */     } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       throw b(null);
/*     */     }  return (abstractInsnNode != null); }
/*     */   public AbstractInsnNode[] toArray() { byte b = 0; AbstractInsnNode abstractInsnNode = this.first; AbstractInsnNode[] arrayOfAbstractInsnNode = new AbstractInsnNode[this.size];
/*     */     while (abstractInsnNode != null)
/*     */     { arrayOfAbstractInsnNode[b] = abstractInsnNode;
/* 181 */       abstractInsnNode.index = b++; abstractInsnNode = abstractInsnNode.next; }  return arrayOfAbstractInsnNode; }
/*     */   public void set(AbstractInsnNode paramAbstractInsnNode1, AbstractInsnNode paramAbstractInsnNode2) { AbstractInsnNode abstractInsnNode1 = paramAbstractInsnNode1.next; try { paramAbstractInsnNode2.next = abstractInsnNode1; if (abstractInsnNode1 != null) { abstractInsnNode1.prev = paramAbstractInsnNode2; } else { this.last = paramAbstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  AbstractInsnNode abstractInsnNode2 = paramAbstractInsnNode1.prev; try { paramAbstractInsnNode2.prev = abstractInsnNode2; if (abstractInsnNode2 != null) { abstractInsnNode2.next = paramAbstractInsnNode2; } else { this.first = paramAbstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  if (this.cache != null) { int i = paramAbstractInsnNode1.index; this.cache[i] = paramAbstractInsnNode2; paramAbstractInsnNode2.index = i; } else { paramAbstractInsnNode2.index = 0; }  paramAbstractInsnNode1.index = -1; paramAbstractInsnNode1.prev = null; paramAbstractInsnNode1.next = null; }
/*     */   public void accept(MethodVisitor paramMethodVisitor) { AbstractInsnNode abstractInsnNode = this.first; while (abstractInsnNode != null) { abstractInsnNode.accept(paramMethodVisitor); abstractInsnNode = abstractInsnNode.next; }  }
/*     */   public void resetLabels() { AbstractInsnNode abstractInsnNode = this.first; while (true) { try { if (abstractInsnNode != null) { try { if (abstractInsnNode instanceof LabelNode) ((LabelNode)abstractInsnNode).resetLabel();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  abstractInsnNode = abstractInsnNode.next; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  break; }  }
/*     */   public void insert(AbstractInsnNode paramAbstractInsnNode1, AbstractInsnNode paramAbstractInsnNode2) { this.size++; AbstractInsnNode abstractInsnNode = paramAbstractInsnNode1.next; try { if (abstractInsnNode == null) { this.last = paramAbstractInsnNode2; } else { abstractInsnNode.prev = paramAbstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  paramAbstractInsnNode1.next = paramAbstractInsnNode2; paramAbstractInsnNode2.next = abstractInsnNode; paramAbstractInsnNode2.prev = paramAbstractInsnNode1; this.cache = null; paramAbstractInsnNode2.index = 0; }
/*     */   public void remove(AbstractInsnNode paramAbstractInsnNode) { this.size--; AbstractInsnNode abstractInsnNode1 = paramAbstractInsnNode.next; AbstractInsnNode abstractInsnNode2 = paramAbstractInsnNode.prev; try { if (abstractInsnNode1 == null) { try { if (abstractInsnNode2 == null) { this.first = null; this.last = null; } else { abstractInsnNode2.next = null; this.last = abstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  } else { try { if (abstractInsnNode2 == null) { this.first = abstractInsnNode1; abstractInsnNode1.prev = null; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  abstractInsnNode2.next = abstractInsnNode1; abstractInsnNode1.prev = abstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  this.cache = null; paramAbstractInsnNode.index = -1; paramAbstractInsnNode.prev = null; paramAbstractInsnNode.next = null; }
/* 187 */   public ListIterator<AbstractInsnNode> iterator() { return iterator(0); } public void clear() { removeAll(false); } public AbstractInsnNode get(int paramInt) { try { if (paramInt >= 0) try { if (paramInt < this.size) { try { if (this.cache == null) this.cache = toArray();  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  return this.cache[paramInt]; }  throw new IndexOutOfBoundsException(); } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }   } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  throw new IndexOutOfBoundsException(); } public void add(AbstractInsnNode paramAbstractInsnNode) { try { this.size++; if (this.last == null) { this.first = paramAbstractInsnNode; this.last = paramAbstractInsnNode; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  this.last.next = paramAbstractInsnNode; paramAbstractInsnNode.prev = this.last; this.last = paramAbstractInsnNode; this.cache = null; paramAbstractInsnNode.index = 0; }
/*     */   public AbstractInsnNode getFirst() { return this.first; }
/*     */   public ListIterator<AbstractInsnNode> iterator(int paramInt) { return new InsnList$InsnListIterator(this, paramInt); } public int size() { return this.size; } void removeAll(boolean paramBoolean) { // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: ifeq -> 38
/*     */     //   4: aload_0
/*     */     //   5: getfield first : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   8: astore_2
/*     */     //   9: aload_2
/*     */     //   10: ifnull -> 38
/*     */     //   13: aload_2
/*     */     //   14: getfield next : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   17: astore_3
/*     */     //   18: aload_2
/*     */     //   19: iconst_m1
/*     */     //   20: putfield index : I
/*     */     //   23: aload_2
/*     */     //   24: aconst_null
/*     */     //   25: putfield prev : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   28: aload_2
/*     */     //   29: aconst_null
/*     */     //   30: putfield next : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   33: aload_3
/*     */     //   34: astore_2
/*     */     //   35: goto -> 9
/*     */     //   38: aload_0
/*     */     //   39: iconst_0
/*     */     //   40: putfield size : I
/*     */     //   43: aload_0
/*     */     //   44: aconst_null
/*     */     //   45: putfield first : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   48: aload_0
/*     */     //   49: aconst_null
/*     */     //   50: putfield last : Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   53: aload_0
/*     */     //   54: aconst_null
/*     */     //   55: putfield cache : [Lorg/spongepowered/asm/lib/tree/AbstractInsnNode;
/*     */     //   58: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 0
/*     */     //   #7	-> 4
/*     */     //   #82	-> 9
/*     */     //   #188	-> 13
/*     */     //   #88	-> 18
/*     */     //   #143	-> 23
/*     */     //   #125	-> 28
/*     */     //   #45	-> 33
/*     */     //   #14	-> 35
/*     */     //   #75	-> 38
/*     */     //   #89	-> 43
/*     */     //   #182	-> 48
/*     */     //   #72	-> 53
/* 189 */     //   #68	-> 58 } public void insertBefore(AbstractInsnNode paramAbstractInsnNode1, AbstractInsnNode paramAbstractInsnNode2) { this.size++; AbstractInsnNode abstractInsnNode = paramAbstractInsnNode1.prev; try { if (abstractInsnNode == null) { this.first = paramAbstractInsnNode2; } else { abstractInsnNode.next = paramAbstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  paramAbstractInsnNode1.prev = paramAbstractInsnNode2; paramAbstractInsnNode2.next = paramAbstractInsnNode1; paramAbstractInsnNode2.prev = abstractInsnNode; this.cache = null; paramAbstractInsnNode2.index = 0; } public void insert(InsnList paramInsnList) { try { if (paramInsnList.size == 0) return;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  try { this.size += paramInsnList.size; if (this.first == null) { this.first = paramInsnList.first; this.last = paramInsnList.last; } else { AbstractInsnNode abstractInsnNode = paramInsnList.last; this.first.prev = abstractInsnNode; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  this.cache = null; paramInsnList.removeAll(false); } public void insert(AbstractInsnNode paramAbstractInsnNode, InsnList paramInsnList) { try { if (paramInsnList.size == 0) return;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  this.size += paramInsnList.size; AbstractInsnNode abstractInsnNode1 = paramInsnList.first; AbstractInsnNode abstractInsnNode2 = paramInsnList.last; AbstractInsnNode abstractInsnNode3 = paramAbstractInsnNode.next; try { if (abstractInsnNode3 == null) { this.last = abstractInsnNode2; } else { abstractInsnNode3.prev = abstractInsnNode2; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  paramAbstractInsnNode.next = abstractInsnNode1; abstractInsnNode2.next = abstractInsnNode3; abstractInsnNode1.prev = paramAbstractInsnNode; this.cache = null; paramInsnList.removeAll(false); } public void insert(AbstractInsnNode paramAbstractInsnNode) { try { this.size++; if (this.first == null) { this.first = paramAbstractInsnNode; this.last = paramAbstractInsnNode; } else { this.first.prev = paramAbstractInsnNode; paramAbstractInsnNode.next = this.first; }  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  this.first = paramAbstractInsnNode; this.cache = null; paramAbstractInsnNode.index = 0; }
/* 190 */   public void add(InsnList paramInsnList) { try { if (paramInsnList.size == 0) return;  } catch (IndexOutOfBoundsException indexOutOfBoundsException) { throw b(null); }  try { this.size += paramInsnList.size; if (this.last == null) { this.first = paramInsnList.first; this.last = paramInsnList.last; } else { AbstractInsnNode abstractInsnNode = paramInsnList.first; this.last.next = abstractInsnNode;
/*     */         abstractInsnNode.prev = this.last;
/*     */         this.last = paramInsnList.last; }
/*     */        }
/*     */     catch (IndexOutOfBoundsException indexOutOfBoundsException)
/*     */     { throw b(null); }
/*     */     
/*     */     this.cache = null;
/*     */     paramInsnList.removeAll(false); }
/*     */ 
/*     */   
/*     */   public AbstractInsnNode getLast() {
/*     */     return this.last;
/*     */   }
/*     */   
/*     */   private static IndexOutOfBoundsException b(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
/*     */     return paramIndexOutOfBoundsException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\InsnList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */