/* 1 */ package com.google.gson.internal;class LinkedTreeMap$KeySet extends AbstractSet<K> { public boolean remove(Object paramObject) { try {  } catch (RuntimeException runtimeException) { throw b(null); }  return (LinkedTreeMap.this.removeInternalByKey(paramObject) != null); } final LinkedTreeMap this$0; public void clear() {
/* 2 */     LinkedTreeMap.this.clear();
/*   */   }
/* 4 */   public boolean contains(Object paramObject) { return LinkedTreeMap.this.containsKey(paramObject); } public int size() {
/* 5 */     return LinkedTreeMap.this.size;
/*   */   } public Iterator<K> iterator() {
/* 7 */     return new LinkedTreeMap$KeySet$1(this);
/*   */   }
/*   */   
/*   */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*   */     return paramRuntimeException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LinkedTreeMap$KeySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */