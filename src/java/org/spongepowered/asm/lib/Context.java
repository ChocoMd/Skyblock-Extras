package org.spongepowered.asm.lib;

class Context {
  Attribute[] attrs;
  
  int flags;
  
  char[] buffer;
  
  int[] bootstrapMethods;
  
  int access;
  
  String name;
  
  String desc;
  
  Label[] labels;
  
  int typeRef;
  
  TypePath typePath;
  
  int offset;
  
  Label[] start;
  
  Label[] end;
  
  int[] index;
  
  int mode;
  
  int localCount;
  
  int localDiff;
  
  Object[] local;
  
  int stackCount;
  
  Object[] stack;
}


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\Context.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */