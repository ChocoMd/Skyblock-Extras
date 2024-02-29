/*   */ package com.google.gson.internal.bind;
/*   */ class ReflectiveTypeAdapterFactory$1 extends ReflectiveTypeAdapterFactory$BoundField { final TypeAdapter<?> typeAdapter; final Gson val$context; final TypeToken val$fieldType;
/* 3 */   void read(JsonReader paramJsonReader, Object paramObject) throws IOException, IllegalAccessException { Object object = this.typeAdapter.read(paramJsonReader); 
/* 4 */     try { if (object == null) { try { if (!isPrimitive) { field.set(paramObject, object); return; }  } catch (IOException iOException) { throw b(null); }  return; }  } catch (IOException iOException) { throw b(null); }
/*   */     
/*   */     field.set(paramObject, object); } final Field val$field; final boolean val$isPrimitive; final ReflectiveTypeAdapterFactory this$0; ReflectiveTypeAdapterFactory$1(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
/* 7 */     super(paramString, paramBoolean1, paramBoolean2);
/*   */     
/* 9 */     this.typeAdapter = context.getAdapter(fieldType);
/*   */   }
/*   */   
/*   */   void write(JsonWriter paramJsonWriter, Object paramObject) throws IOException, IllegalAccessException {
/*   */     Object object = field.get(paramObject);
/*   */     TypeAdapterRuntimeTypeWrapper typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(context, this.typeAdapter, fieldType.getType());
/*   */     typeAdapterRuntimeTypeWrapper.write(paramJsonWriter, object);
/*   */   }
/*   */   
/*   */   private static IOException b(IOException paramIOException) {
/*   */     return paramIOException;
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\ReflectiveTypeAdapterFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */