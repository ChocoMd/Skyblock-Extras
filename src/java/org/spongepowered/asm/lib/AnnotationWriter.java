/*     */ package org.spongepowered.asm.lib;
/*     */ final class AnnotationWriter extends AnnotationVisitor { private final ClassWriter cw; private int size;
/*     */   private final boolean named;
/*     */   private final ByteVector bv;
/*     */   private final ByteVector parent;
/*     */   private final int offset;
/*     */   AnnotationWriter next;
/*     */   AnnotationWriter prev;
/*     */   
/*  10 */   void put(ByteVector paramByteVector) { byte b = 0;
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
/*     */     int i = 2;
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
/* 144 */     AnnotationWriter annotationWriter1 = this;
/* 145 */     AnnotationWriter annotationWriter2 = null; while (annotationWriter1 != null) {
/*     */       b++; i += annotationWriter1.bv.length; annotationWriter1.visitEnd(); annotationWriter1.prev = annotationWriter2; annotationWriter2 = annotationWriter1; annotationWriter1 = annotationWriter1.next;
/*     */     }  paramByteVector.putInt(i);
/*     */     paramByteVector.putShort(b);
/*     */     annotationWriter1 = annotationWriter2;
/* 150 */     for (; annotationWriter1 != null; annotationWriter1 = annotationWriter1.prev)
/* 151 */       paramByteVector.putByteArray(annotationWriter1.bv.data, 0, annotationWriter1.bv.length);  } int getSize() { int i = 0; AnnotationWriter annotationWriter = this; while (annotationWriter != null) {
/*     */       i += annotationWriter.bv.length; annotationWriter = annotationWriter.next;
/*     */     } 
/* 154 */     return i; }
/*     */ 
/*     */   
/*     */   static void put(AnnotationWriter[] paramArrayOfAnnotationWriter, int paramInt, ByteVector paramByteVector) {
/*     */     int i = 1 + 2 * (paramArrayOfAnnotationWriter.length - paramInt);
/*     */     int j = paramInt;
/*     */     while (true) {
/*     */       try {
/*     */         if (j < paramArrayOfAnnotationWriter.length) {
/*     */           try {
/*     */           
/*     */           } catch (RuntimeException runtimeException) {
/*     */             throw b(null);
/*     */           } 
/*     */           i += (paramArrayOfAnnotationWriter[j] == null) ? 0 : paramArrayOfAnnotationWriter[j].getSize();
/*     */           j++;
/*     */         } 
/*     */       } catch (RuntimeException runtimeException) {
/*     */         throw b(null);
/*     */       } 
/*     */       break;
/*     */     } 
/*     */     paramByteVector.putInt(i).putByte(paramArrayOfAnnotationWriter.length - paramInt);
/*     */     for (j = paramInt; j < paramArrayOfAnnotationWriter.length; ) {
/*     */       AnnotationWriter annotationWriter1 = paramArrayOfAnnotationWriter[j];
/*     */       AnnotationWriter annotationWriter2 = null;
/*     */       byte b = 0;
/*     */       for (; annotationWriter1 != null; annotationWriter1.visitEnd(), annotationWriter1.prev = annotationWriter2, annotationWriter2 = annotationWriter1)
/*     */         b++; 
/*     */     } 
/*     */   }
/*     */   
/*     */   static void putTarget(int paramInt, TypePath paramTypePath, ByteVector paramByteVector) {
/*     */     try {
/*     */       switch (paramInt >>> 24) {
/*     */         case 0:
/*     */         case 1:
/*     */         case 22:
/*     */           paramByteVector.putShort(paramInt >>> 16);
/*     */           break;
/*     */         case 19:
/*     */         case 20:
/*     */         case 21:
/*     */           paramByteVector.putByte(paramInt >>> 24);
/*     */           break;
/*     */         case 71:
/*     */         case 72:
/*     */         case 73:
/*     */         case 74:
/*     */         case 75:
/*     */           paramByteVector.putInt(paramInt);
/*     */           break;
/*     */         default:
/*     */           paramByteVector.put12(paramInt >>> 24, (paramInt & 0xFFFF00) >> 8);
/*     */           break;
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramTypePath == null) {
/*     */         paramByteVector.putByte(0);
/*     */       } else {
/*     */         int i = paramTypePath.b[paramTypePath.offset] * 2 + 1;
/*     */         paramByteVector.putByteArray(paramTypePath.b, paramTypePath.offset, i);
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitArray(String paramString) {
/*     */     try {
/*     */       this.size++;
/*     */       if (this.named)
/*     */         this.bv.putShort(this.cw.newUTF8(paramString)); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.bv.put12(91, 0);
/*     */     return new AnnotationWriter(this.cw, false, this.bv, this.bv, this.bv.length - 2);
/*     */   }
/*     */   
/*     */   public void visit(String paramString, Object paramObject) {
/*     */     try {
/*     */       this.size++;
/*     */       if (this.named)
/*     */         this.bv.putShort(this.cw.newUTF8(paramString)); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     try {
/*     */       if (paramObject instanceof String) {
/*     */         this.bv.put12(115, this.cw.newUTF8((String)paramObject));
/*     */       } else {
/*     */         try {
/*     */           if (paramObject instanceof Byte) {
/*     */             this.bv.put12(66, (this.cw.newInteger(((Byte)paramObject).byteValue())).index);
/*     */           } else {
/*     */             try {
/*     */               if (paramObject instanceof Boolean) {
/*     */                 try {
/*     */                 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */                 boolean bool = ((Boolean)paramObject).booleanValue() ? true : false;
/*     */                 this.bv.put12(90, (this.cw.newInteger(bool)).index);
/*     */               } 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */             try {
/*     */               if (paramObject instanceof Character) {
/*     */                 this.bv.put12(67, (this.cw.newInteger(((Character)paramObject).charValue())).index);
/*     */               } else {
/*     */                 try {
/*     */                   if (paramObject instanceof Short) {
/*     */                     this.bv.put12(83, (this.cw.newInteger(((Short)paramObject).shortValue())).index);
/*     */                   } else {
/*     */                     try {
/*     */                       if (paramObject instanceof Type) {
/*     */                         this.bv.put12(99, this.cw.newUTF8(((Type)paramObject).getDescriptor()));
/*     */                       } else {
/*     */                         if (paramObject instanceof byte[]) {
/*     */                           byte[] arrayOfByte = (byte[])paramObject;
/*     */                           this.bv.put12(91, arrayOfByte.length);
/*     */                           boolean bool = false;
/*     */                         } 
/*     */                         if (paramObject instanceof boolean[]) {
/*     */                           boolean[] arrayOfBoolean = (boolean[])paramObject;
/*     */                           this.bv.put12(91, arrayOfBoolean.length);
/*     */                           boolean bool = false;
/*     */                         } 
/*     */                         if (paramObject instanceof short[]) {
/*     */                           short[] arrayOfShort = (short[])paramObject;
/*     */                           this.bv.put12(91, arrayOfShort.length);
/*     */                           boolean bool = false;
/*     */                         } 
/*     */                         if (paramObject instanceof char[]) {
/*     */                           char[] arrayOfChar = (char[])paramObject;
/*     */                           this.bv.put12(91, arrayOfChar.length);
/*     */                           boolean bool = false;
/*     */                         } 
/*     */                       } 
/*     */                     } catch (RuntimeException runtimeException) {
/*     */                       throw b(null);
/*     */                     } 
/*     */                   } 
/*     */                 } catch (RuntimeException runtimeException) {
/*     */                   throw b(null);
/*     */                 } 
/*     */               } 
/*     */             } catch (RuntimeException runtimeException) {
/*     */               throw b(null);
/*     */             } 
/*     */           } 
/*     */         } catch (RuntimeException runtimeException) {
/*     */           throw b(null);
/*     */         } 
/*     */       } 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public AnnotationVisitor visitAnnotation(String paramString1, String paramString2) {
/*     */     try {
/*     */       this.size++;
/*     */       if (this.named)
/*     */         this.bv.putShort(this.cw.newUTF8(paramString1)); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.bv.put12(64, this.cw.newUTF8(paramString2)).putShort(0);
/*     */     return new AnnotationWriter(this.cw, true, this.bv, this.bv, this.bv.length - 2);
/*     */   }
/*     */   
/*     */   AnnotationWriter(ClassWriter paramClassWriter, boolean paramBoolean, ByteVector paramByteVector1, ByteVector paramByteVector2, int paramInt) {
/*     */     super(327680);
/*     */     this.cw = paramClassWriter;
/*     */     this.named = paramBoolean;
/*     */     this.bv = paramByteVector1;
/*     */     this.parent = paramByteVector2;
/*     */     this.offset = paramInt;
/*     */   }
/*     */   
/*     */   public void visitEnum(String paramString1, String paramString2, String paramString3) {
/*     */     try {
/*     */       this.size++;
/*     */       if (this.named)
/*     */         this.bv.putShort(this.cw.newUTF8(paramString1)); 
/*     */     } catch (RuntimeException runtimeException) {
/*     */       throw b(null);
/*     */     } 
/*     */     this.bv.put12(101, this.cw.newUTF8(paramString2)).putShort(this.cw.newUTF8(paramString3));
/*     */   }
/*     */   
/*     */   public void visitEnd() {
/*     */     if (this.parent != null) {
/*     */       byte[] arrayOfByte = this.parent.data;
/*     */       arrayOfByte[this.offset] = (byte)(this.size >>> 8);
/*     */       arrayOfByte[this.offset + 1] = (byte)this.size;
/*     */     } 
/*     */   }
/*     */   
/*     */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*     */     return paramRuntimeException;
/*     */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\AnnotationWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */