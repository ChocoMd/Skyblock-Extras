/*    */ package com.google.gson.internal;
/*    */ class LinkedTreeMap$EntrySet extends AbstractSet<Map.Entry<K, V>> {
/*  3 */   public void clear() { LinkedTreeMap.this.clear(); } final LinkedTreeMap this$0; public boolean contains(Object paramObject) { 
/*  4 */     try { if (paramObject instanceof Map.Entry) try { if (LinkedTreeMap.this.findByEntry((Map.Entry<?, ?>)paramObject) != null); } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  return false; }
/*    */   
/*  6 */   public int size() { return LinkedTreeMap.this.size; }
/*  7 */   public Iterator<Map.Entry<K, V>> iterator() { return new LinkedTreeMap$EntrySet$1(this); } public boolean remove(Object paramObject) {
/*    */     
/*  9 */     try { if (!(paramObject instanceof Map.Entry))
/* 10 */         return false;  } catch (RuntimeException runtimeException) { throw b(null); }  LinkedTreeMap$Node linkedTreeMap$Node = LinkedTreeMap.this.findByEntry((Map.Entry<?, ?>)paramObject);
/*    */     
/*    */     try { if (linkedTreeMap$Node == null)
/* 13 */         return false;  } catch (RuntimeException runtimeException) { throw b(null); }
/*    */     
/*    */     LinkedTreeMap.this.removeInternal(linkedTreeMap$Node, true);
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\LinkedTreeMap$EntrySet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */