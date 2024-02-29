/*  1 */ package com.google.gson.internal.bind;public final class TypeAdapters { public static final TypeAdapterFactory BOOLEAN_FACTORY = newFactory(boolean.class, (Class)Boolean.class, (TypeAdapter)BOOLEAN);
/*  2 */   public static final TypeAdapterFactory TIMESTAMP_FACTORY = new TypeAdapters$22();
/*  3 */   public static final TypeAdapterFactory CALENDAR_FACTORY = newFactoryForMultipleTypes(Calendar.class, (Class)GregorianCalendar.class, CALENDAR);
/*  4 */   public static final TypeAdapterFactory STRING_BUFFER_FACTORY = newFactory(StringBuffer.class, STRING_BUFFER);
/*  5 */   public static final TypeAdapterFactory BYTE_FACTORY = newFactory(byte.class, (Class)Byte.class, (TypeAdapter)BYTE);
/*  6 */   public static final TypeAdapterFactory JSON_ELEMENT_FACTORY = newTypeHierarchyFactory(JsonElement.class, JSON_ELEMENT);
/*  7 */   public static final TypeAdapterFactory SHORT_FACTORY = newFactory(short.class, (Class)Short.class, (TypeAdapter)SHORT);
/*  8 */   public static final TypeAdapterFactory LOCALE_FACTORY = newFactory(Locale.class, LOCALE);
/*  9 */   public static final TypeAdapterFactory INET_ADDRESS_FACTORY = newTypeHierarchyFactory(InetAddress.class, INET_ADDRESS);
/* 10 */   public static final TypeAdapterFactory STRING_BUILDER_FACTORY = newFactory(StringBuilder.class, STRING_BUILDER);
/* 11 */   public static final TypeAdapter<Number> INTEGER = new TypeAdapters$7();
/* 12 */   public static final TypeAdapter<Number> SHORT = new TypeAdapters$6();
/* 13 */   public static final TypeAdapterFactory UUID_FACTORY = newFactory(UUID.class, UUID);
/* 14 */   public static final TypeAdapter<StringBuffer> STRING_BUFFER = new TypeAdapters$17();
/* 15 */   public static final TypeAdapter<BigDecimal> BIG_DECIMAL = new TypeAdapters$14();
/* 16 */   public static final TypeAdapter<Character> CHARACTER = new TypeAdapters$12();
/* 17 */   public static final TypeAdapter<Class> CLASS = new TypeAdapters$1();
/* 18 */   public static final TypeAdapter<Boolean> BOOLEAN = new TypeAdapters$3(); public static <TT> TypeAdapterFactory newTypeHierarchyFactory(Class<TT> paramClass, TypeAdapter<TT> paramTypeAdapter) {
/* 19 */     return new TypeAdapters$31(paramClass, paramTypeAdapter);
/* 20 */   } public static final TypeAdapterFactory CLASS_FACTORY = newFactory(Class.class, CLASS);
/* 21 */   public static final TypeAdapter<BigInteger> BIG_INTEGER = new TypeAdapters$15();
/* 22 */   public static final TypeAdapter<Number> BYTE = new TypeAdapters$5();
/* 23 */   public static final TypeAdapterFactory BIT_SET_FACTORY = newFactory(BitSet.class, BIT_SET);
/* 24 */   public static final TypeAdapter<String> STRING = new TypeAdapters$13(); public static <TT> TypeAdapterFactory newFactory(Class<TT> paramClass1, Class<TT> paramClass2, TypeAdapter<? super TT> paramTypeAdapter) {
/* 25 */     return new TypeAdapters$29(paramClass1, paramClass2, paramTypeAdapter);
/* 26 */   } public static final TypeAdapter<JsonElement> JSON_ELEMENT = new TypeAdapters$25();
/* 27 */   public static final TypeAdapterFactory URL_FACTORY = newFactory(URL.class, URL); public static <TT> TypeAdapterFactory newFactory(Class<TT> paramClass, TypeAdapter<TT> paramTypeAdapter) {
/* 28 */     return new TypeAdapters$28(paramClass, paramTypeAdapter);
/* 29 */   } public static final TypeAdapter<UUID> UUID = new TypeAdapters$21(); public static TypeAdapterFactory newEnumTypeHierarchyFactory() {
/* 30 */     return new TypeAdapters$26();
/* 31 */   } public static final TypeAdapter<URL> URL = new TypeAdapters$18();
/* 32 */   public static final TypeAdapterFactory CHARACTER_FACTORY = newFactory(char.class, (Class)Character.class, (TypeAdapter)CHARACTER);
/*    */   
/* 34 */   public static final TypeAdapterFactory NUMBER_FACTORY = newFactory(Number.class, NUMBER);
/* 35 */   public static final TypeAdapter<Calendar> CALENDAR = new TypeAdapters$23();
/* 36 */   public static final TypeAdapter<Boolean> BOOLEAN_AS_STRING = new TypeAdapters$4();
/* 37 */   public static final TypeAdapter<Number> NUMBER = new TypeAdapters$11();
/* 38 */   public static final TypeAdapterFactory STRING_FACTORY = newFactory(String.class, STRING); public static <TT> TypeAdapterFactory newFactoryForMultipleTypes(Class<TT> paramClass, Class<? extends TT> paramClass1, TypeAdapter<? super TT> paramTypeAdapter) {
/* 39 */     return new TypeAdapters$30(paramClass, paramClass1, paramTypeAdapter);
/* 40 */   } public static final TypeAdapter<Number> DOUBLE = new TypeAdapters$10();
/* 41 */   public static final TypeAdapter<StringBuilder> STRING_BUILDER = new TypeAdapters$16();
/* 42 */   public static final TypeAdapter<Number> FLOAT = new TypeAdapters$9();
/* 43 */   public static final TypeAdapter<Number> LONG = new TypeAdapters$8();
/* 44 */   public static final TypeAdapter<InetAddress> INET_ADDRESS = new TypeAdapters$20();
/* 45 */   public static final TypeAdapterFactory INTEGER_FACTORY = newFactory(int.class, (Class)Integer.class, (TypeAdapter)INTEGER);
/* 46 */   public static final TypeAdapter<URI> URI = new TypeAdapters$19();
/* 47 */   public static final TypeAdapter<Locale> LOCALE = new TypeAdapters$24();
/* 48 */   public static final TypeAdapterFactory URI_FACTORY = newFactory(URI.class, URI);
/* 49 */   public static final TypeAdapter<BitSet> BIT_SET = new TypeAdapters$2();
/* 50 */   public static final TypeAdapterFactory ENUM_FACTORY = newEnumTypeHierarchyFactory(); public static <TT> TypeAdapterFactory newFactory(TypeToken<TT> paramTypeToken, TypeAdapter<TT> paramTypeAdapter) {
/* 51 */     return new TypeAdapters$27(paramTypeToken, paramTypeAdapter);
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\bind\TypeAdapters.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */