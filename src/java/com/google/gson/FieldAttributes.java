/*    */ package com.google.gson;
/*    */ public final class FieldAttributes {
/*    */   private final Field field;
/*    */   
/*  5 */   public FieldAttributes(Field paramField) { .Gson.Preconditions.checkNotNull(paramField); this.field = paramField; }
/*  6 */   public <T extends Annotation> T getAnnotation(Class<T> paramClass) { return this.field.getAnnotation(paramClass); } public Class<?> getDeclaredClass() { return this.field.getType(); }
/*  7 */   public String getName() { return this.field.getName(); } Object get(Object paramObject) throws IllegalAccessException { return this.field.get(paramObject); }
/*  8 */   public Type getDeclaredType() { return this.field.getGenericType(); }
/*  9 */   public Class<?> getDeclaringClass() { return this.field.getDeclaringClass(); }
/* 10 */   boolean isSynthetic() { return this.field.isSynthetic(); } public boolean hasModifier(int paramInt) { try {  }
/* 11 */     catch (RuntimeException runtimeException) { throw b(null); }  return ((this.field.getModifiers() & paramInt) != 0); }
/*    */    public Collection<Annotation> getAnnotations() {
/* 13 */     return Arrays.asList(this.field.getAnnotations());
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\FieldAttributes.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */