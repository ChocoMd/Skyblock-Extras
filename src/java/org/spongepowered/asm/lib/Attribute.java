/*    */ package org.spongepowered.asm.lib;
/*    */ public class Attribute {
/*    */   public final String type;
/*    */   byte[] value;
/*    */   Attribute next;
/*    */   
/*    */   public boolean isUnknown() {
/*  8 */     return true;
/*    */   }
/* 10 */   final void put(ClassWriter paramClassWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, ByteVector paramByteVector) { Attribute attribute = this;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     while (attribute != null) {
/*    */       ByteVector byteVector = attribute.write(paramClassWriter, paramArrayOfbyte, paramInt1, paramInt2, paramInt3);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       paramByteVector.putShort(paramClassWriter.newUTF8(attribute.type)).putInt(byteVector.length);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 32 */       paramByteVector.putByteArray(byteVector.data, 0, byteVector.length); attribute = attribute.next;
/*    */     }  } final int getSize(ClassWriter paramClassWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) { Attribute attribute = this;
/* 34 */     int i = 0;
/*    */     while (attribute != null) {
/*    */       paramClassWriter.newUTF8(attribute.type);
/*    */       i += (attribute.write(paramClassWriter, paramArrayOfbyte, paramInt1, paramInt2, paramInt3)).length + 6;
/*    */       attribute = attribute.next;
/*    */     } 
/*    */     return i; }
/*    */ 
/*    */   
/*    */   protected Label[] getLabels() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public boolean isCodeAttribute() {
/*    */     return false;
/*    */   }
/*    */   
/*    */   final int getCount() {
/*    */     byte b = 0;
/*    */     Attribute attribute = this;
/*    */     for (; attribute != null; attribute = attribute.next)
/*    */       b++; 
/*    */     return b;
/*    */   }
/*    */   
/*    */   protected Attribute read(ClassReader paramClassReader, int paramInt1, int paramInt2, char[] paramArrayOfchar, int paramInt3, Label[] paramArrayOfLabel) {
/*    */     Attribute attribute = new Attribute(this.type);
/*    */     attribute.value = new byte[paramInt2];
/*    */     System.arraycopy(paramClassReader.b, paramInt1, attribute.value, 0, paramInt2);
/*    */     return attribute;
/*    */   }
/*    */   
/*    */   protected ByteVector write(ClassWriter paramClassWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
/*    */     ByteVector byteVector = new ByteVector();
/*    */     byteVector.data = this.value;
/*    */     byteVector.length = this.value.length;
/*    */     return byteVector;
/*    */   }
/*    */   
/*    */   protected Attribute(String paramString) {
/*    */     this.type = paramString;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Attribute.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */