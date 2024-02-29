/*    */ package com.google.gson.internal;
/*    */ import com.google.gson.InstanceCreator;
/*    */ import com.google.gson.reflect.TypeToken;
/*    */ import java.lang.reflect.Constructor;
/*    */ import java.lang.reflect.Type;
/*    */ import java.util.Collection;
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class ConstructorConstructor {
/*    */   private final Map<Type, InstanceCreator<?>> instanceCreators;
/*    */   
/*    */   private <T> ObjectConstructor<T> newUnsafeAllocator(Type paramType, Class<? super T> paramClass) {
/* 13 */     return new ConstructorConstructor$12(this, paramClass, paramType);
/*    */   }
/*    */   public ConstructorConstructor(Map<Type, InstanceCreator<?>> paramMap) {
/*    */     this.instanceCreators = paramMap;
/*    */   }
/* 18 */   public <T> ObjectConstructor<T> get(TypeToken<T> paramTypeToken) { Type type = paramTypeToken.getType();
/*    */ 
/*    */ 
/*    */     
/* 22 */     Class<?> clazz = paramTypeToken.getRawType();
/*    */ 
/*    */     
/* 25 */     InstanceCreator instanceCreator1 = this.instanceCreators.get(type);
/*    */     try {
/*    */       if (instanceCreator1 != null) {
/*    */         return new ConstructorConstructor$1(this, instanceCreator1, type);
/*    */       }
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     InstanceCreator instanceCreator2 = this.instanceCreators.get(clazz);
/*    */     
/*    */     try { if (instanceCreator2 != null)
/* 36 */         return new ConstructorConstructor$2(this, instanceCreator2, type);  } catch (RuntimeException runtimeException) { throw b(null); }  ObjectConstructor<?> objectConstructor1 = newDefaultConstructor(clazz); try { if (objectConstructor1 != null) return (ObjectConstructor)objectConstructor1;  } catch (RuntimeException runtimeException) { throw b(null); }  ObjectConstructor<?> objectConstructor2 = newDefaultImplementationConstructor(type, clazz); try { if (objectConstructor2 != null)
/*    */         return (ObjectConstructor)objectConstructor2;  } catch (RuntimeException runtimeException) { throw b(null); }  return newUnsafeAllocator(type, (Class)clazz); } private <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> paramClass) { try { Constructor<? super T> constructor = paramClass.getDeclaredConstructor(new Class[0]); try { if (!constructor.isAccessible())
/* 38 */           constructor.setAccessible(true);  } catch (NoSuchMethodException noSuchMethodException) { throw b(null); }  return new ConstructorConstructor$3(this, constructor); } catch (NoSuchMethodException noSuchMethodException) { return null; }
/*    */      }
/* 40 */   public String toString() { return this.instanceCreators.toString(); } private <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type paramType, Class<? super T> paramClass) { 
/* 41 */     try { if (Collection.class.isAssignableFrom(paramClass)) { try { if (SortedSet.class.isAssignableFrom(paramClass)) return new ConstructorConstructor$4(this);  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (EnumSet.class.isAssignableFrom(paramClass)) return new ConstructorConstructor$5(this, paramType);  } catch (RuntimeException runtimeException) { throw b(null); }  }  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (Map.class.isAssignableFrom(paramClass)) { try { if (SortedMap.class.isAssignableFrom(paramClass)) return new ConstructorConstructor$9(this);  } catch (RuntimeException runtimeException) { throw b(null); }  try { if (paramType instanceof ParameterizedType) try { if (!String.class.isAssignableFrom(TypeToken.get(((ParameterizedType)paramType).getActualTypeArguments()[0]).getRawType()))
/* 42 */                 return new ConstructorConstructor$10(this);  } catch (RuntimeException runtimeException) { throw b(null); }   } catch (RuntimeException runtimeException) { throw b(null); }  }  } catch (RuntimeException runtimeException) { throw b(null); }
/* 43 */      return null; }
/*    */ 
/*    */   
/*    */   private static Exception b(Exception paramException) {
/*    */     return paramException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\ConstructorConstructor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */