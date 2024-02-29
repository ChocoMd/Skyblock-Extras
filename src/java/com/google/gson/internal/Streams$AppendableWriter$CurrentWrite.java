/*   */ package com.google.gson.internal;
/* 2 */ class Streams$AppendableWriter$CurrentWrite implements CharSequence { public int length() { return this.chars.length; } char[] chars; public char charAt(int paramInt) {
/* 3 */     return this.chars[paramInt]; } public CharSequence subSequence(int paramInt1, int paramInt2) {
/* 4 */     return new String(this.chars, paramInt1, paramInt2 - paramInt1);
/*   */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\com\google\gson\internal\Streams$AppendableWriter$CurrentWrite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */