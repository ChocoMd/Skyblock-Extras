/*  1 */ package com.google.gson.internal;final class Streams$AppendableWriter extends Writer { public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException { this.currentWrite.chars = paramArrayOfchar;
/*  2 */     this.appendable.append(this.currentWrite, paramInt1, paramInt1 + paramInt2); }
/*    */   
/*    */   private final Appendable appendable;
/*  5 */   private final Streams$AppendableWriter$CurrentWrite currentWrite = new Streams$AppendableWriter$CurrentWrite(); Streams$AppendableWriter(Appendable paramAppendable, Streams$1 paramStreams$1) {
/*  6 */     this(paramAppendable);
/*    */   } public void flush() {}
/*    */   private Streams$AppendableWriter(Appendable paramAppendable) {
/*  9 */     this.appendable = paramAppendable;
/*    */   } public void close() {} public void write(int paramInt) throws IOException {
/* 11 */     this.appendable.append((char)paramInt);
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Streams$AppendableWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */