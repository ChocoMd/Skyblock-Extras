/*    */ package org.spongepowered.asm.lib.tree;public class FieldNode extends FieldVisitor { public int access; public String name; public String desc; public String signature;
/*    */   public Object value;
/*    */   public List<AnnotationNode> visibleAnnotations;
/*    */   public List<AnnotationNode> invisibleAnnotations;
/*    */   public List<TypeAnnotationNode> visibleTypeAnnotations;
/*    */   public List<TypeAnnotationNode> invisibleTypeAnnotations;
/*    */   public List<Attribute> attrs;
/*    */   
/*  9 */   public void accept(ClassVisitor paramClassVisitor) { FieldVisitor fieldVisitor = paramClassVisitor.visitField(this.access, this.name, this.desc, this.signature, this.value);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     try {
/* 31 */       if (fieldVisitor == null)
/*    */       {
/*    */         return;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/*    */     catch (IllegalStateException illegalStateException) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 62 */       throw b(null);
/*    */     }  try {
/*    */     
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     }  byte b1 = (this.visibleAnnotations == null) ? 0 : this.visibleAnnotations.size(); byte b2; for (b2 = 0; b2 < b1; annotationNode.accept(fieldVisitor.visitAnnotation(annotationNode.desc, true)), b2++)
/*    */       AnnotationNode annotationNode = this.visibleAnnotations.get(b2);  
/*    */     try {  }
/*    */     catch (IllegalStateException illegalStateException)
/* 71 */     { throw b(null); }  b1 = (this.invisibleAnnotations == null) ? 0 : this.invisibleAnnotations.size(); for (b2 = 0; b2 < b1; ) { AnnotationNode annotationNode = this.invisibleAnnotations.get(b2); annotationNode.accept(fieldVisitor.visitAnnotation(annotationNode.desc, false)); b2++; }  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  b1 = (this.visibleTypeAnnotations == null) ? 0 : this.visibleTypeAnnotations.size(); for (b2 = 0; b2 < b1; typeAnnotationNode.accept(fieldVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, true)), b2++) TypeAnnotationNode typeAnnotationNode = this.visibleTypeAnnotations.get(b2);  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  b1 = (this.invisibleTypeAnnotations == null) ? 0 : this.invisibleTypeAnnotations.size(); for (b2 = 0; b2 < b1; ) { TypeAnnotationNode typeAnnotationNode = this.invisibleTypeAnnotations.get(b2); typeAnnotationNode.accept(fieldVisitor.visitTypeAnnotation(typeAnnotationNode.typeRef, typeAnnotationNode.typePath, typeAnnotationNode.desc, false)); b2++; }  try {  } catch (IllegalStateException illegalStateException) { throw b(null); }  b1 = (this.attrs == null) ? 0 : this.attrs.size(); b2 = 0; try { for (; b2 < b1; b2++) fieldVisitor.visitAttribute(this.attrs.get(b2));  } catch (IllegalStateException illegalStateException) { throw b(null); }  fieldVisitor.visitEnd(); } public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { AnnotationNode annotationNode = new AnnotationNode(paramString); try { if (paramBoolean) { try { if (this.visibleAnnotations == null)
/* 72 */             this.visibleAnnotations = new ArrayList<AnnotationNode>(1);  } catch (IllegalStateException illegalStateException) { throw b(null); }  this.visibleAnnotations.add(annotationNode); }  } catch (IllegalStateException illegalStateException) { throw b(null); }  try { if (this.invisibleAnnotations == null)
/*    */         this.invisibleAnnotations = new ArrayList<AnnotationNode>(1);  }
/*    */     catch (IllegalStateException illegalStateException)
/*    */     { throw b(null); }
/*    */     
/*    */     this.invisibleAnnotations.add(annotationNode);
/*    */     return annotationNode; }
/*    */ 
/*    */   
/*    */   public void visitAttribute(Attribute paramAttribute) {
/*    */     try {
/*    */       if (this.attrs == null)
/*    */         this.attrs = new ArrayList<Attribute>(1); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     this.attrs.add(paramAttribute);
/*    */   }
/*    */   
/*    */   public FieldNode(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*    */     this(327680, paramInt, paramString1, paramString2, paramString3, paramObject);
/*    */     if (getClass() != FieldNode.class)
/*    */       throw new IllegalStateException(); 
/*    */   }
/*    */   
/*    */   public void check(int paramInt) {
/*    */     try {
/*    */       if (paramInt == 262144) {
/*    */         try {
/*    */           if (this.visibleTypeAnnotations != null)
/*    */             try {
/*    */               if (this.visibleTypeAnnotations.size() > 0)
/*    */                 throw new RuntimeException(); 
/*    */             } catch (IllegalStateException illegalStateException) {
/*    */               throw b(null);
/*    */             }  
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw b(null);
/*    */         } 
/*    */         try {
/*    */           if (this.invisibleTypeAnnotations != null)
/*    */             try {
/*    */               if (this.invisibleTypeAnnotations.size() > 0)
/*    */                 throw new RuntimeException(); 
/*    */             } catch (IllegalStateException illegalStateException) {
/*    */               throw b(null);
/*    */             }  
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw b(null);
/*    */         } 
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public void visitEnd() {}
/*    */   
/*    */   public FieldNode(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*    */     super(paramInt1);
/*    */     this.access = paramInt2;
/*    */     this.name = paramString1;
/*    */     this.desc = paramString2;
/*    */     this.signature = paramString3;
/*    */     this.value = paramObject;
/*    */   }
/*    */   
/*    */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) {
/*    */     TypeAnnotationNode typeAnnotationNode = new TypeAnnotationNode(paramInt, paramTypePath, paramString);
/*    */     try {
/*    */       if (paramBoolean) {
/*    */         try {
/*    */           if (this.visibleTypeAnnotations == null)
/*    */             this.visibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*    */         } catch (IllegalStateException illegalStateException) {
/*    */           throw b(null);
/*    */         } 
/*    */         this.visibleTypeAnnotations.add(typeAnnotationNode);
/*    */       } 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     try {
/*    */       if (this.invisibleTypeAnnotations == null)
/*    */         this.invisibleTypeAnnotations = new ArrayList<TypeAnnotationNode>(1); 
/*    */     } catch (IllegalStateException illegalStateException) {
/*    */       throw b(null);
/*    */     } 
/*    */     this.invisibleTypeAnnotations.add(typeAnnotationNode);
/*    */     return typeAnnotationNode;
/*    */   }
/*    */   
/*    */   private static IllegalStateException b(IllegalStateException paramIllegalStateException) {
/*    */     return paramIllegalStateException;
/*    */   } }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\lib\tree\FieldNode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */