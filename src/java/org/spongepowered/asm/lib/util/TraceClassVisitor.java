/*    */ package org.spongepowered.asm.lib.util;
/*    */ public final class TraceClassVisitor extends ClassVisitor {
/*    */   private final PrintWriter pw;
/*    */   public final Printer p;
/*    */   
/*  6 */   public TraceClassVisitor(ClassVisitor paramClassVisitor, PrintWriter paramPrintWriter) { this(paramClassVisitor, new Textifier(), paramPrintWriter); }
/*  7 */   public MethodVisitor visitMethod(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) { Printer printer = this.p.visitMethod(paramInt, paramString1, paramString2, paramString3, paramArrayOfString); try {  }
/*    */     catch (RuntimeException runtimeException)
/*    */     { throw b(null); }
/* 10 */      MethodVisitor methodVisitor = (this.cv == null) ? null : this.cv.visitMethod(paramInt, paramString1, paramString2, paramString3, paramArrayOfString); return new TraceMethodVisitor(methodVisitor, printer); } public void visitAttribute(Attribute paramAttribute) { this.p.visitClassAttribute(paramAttribute);
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
/*    */ 
/*    */     
/* 33 */     super.visitAttribute(paramAttribute); } public void visitEnd() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield p : Lorg/spongepowered/asm/lib/util/Printer;
/*    */     //   4: invokevirtual visitClassEnd : ()V
/*    */     //   7: aload_0
/*    */     //   8: getfield pw : Ljava/io/PrintWriter;
/*    */     //   11: ifnull -> 39
/*    */     //   14: aload_0
/*    */     //   15: getfield p : Lorg/spongepowered/asm/lib/util/Printer;
/*    */     //   18: aload_0
/*    */     //   19: getfield pw : Ljava/io/PrintWriter;
/*    */     //   22: invokevirtual print : (Ljava/io/PrintWriter;)V
/*    */     //   25: aload_0
/*    */     //   26: getfield pw : Ljava/io/PrintWriter;
/*    */     //   29: invokevirtual flush : ()V
/*    */     //   32: goto -> 39
/*    */     //   35: invokestatic b : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
/*    */     //   38: athrow
/*    */     //   39: aload_0
/*    */     //   40: invokespecial visitEnd : ()V
/*    */     //   43: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 0
/*    */     //   #26	-> 7
/*    */     //   #27	-> 14
/*    */     //   #23	-> 25
/*    */     //   #2	-> 39
/*    */     //   #29	-> 43
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	32	35	java/lang/RuntimeException
/*    */   } public void visit(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
/*    */     this.p.visit(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString);
/* 37 */     super.visit(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramArrayOfString); } public void visitSource(String paramString1, String paramString2) { this.p.visitSource(paramString1, paramString2); super.visitSource(paramString1, paramString2); }
/* 38 */   public AnnotationVisitor visitAnnotation(String paramString, boolean paramBoolean) { Printer printer = this.p.visitClassAnnotation(paramString, paramBoolean); try {  } catch (RuntimeException runtimeException) { throw b(null); }  AnnotationVisitor annotationVisitor = (this.cv == null) ? null : this.cv.visitAnnotation(paramString, paramBoolean); return new TraceAnnotationVisitor(annotationVisitor, printer); } public TraceClassVisitor(PrintWriter paramPrintWriter) { this(null, paramPrintWriter); }
/* 39 */   public AnnotationVisitor visitTypeAnnotation(int paramInt, TypePath paramTypePath, String paramString, boolean paramBoolean) { Printer printer = this.p.visitClassTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     AnnotationVisitor annotationVisitor = (this.cv == null) ? null : this.cv.visitTypeAnnotation(paramInt, paramTypePath, paramString, paramBoolean);
/*    */     return new TraceAnnotationVisitor(annotationVisitor, printer); }
/*    */ 
/*    */   
/*    */   public void visitInnerClass(String paramString1, String paramString2, String paramString3, int paramInt) {
/*    */     this.p.visitInnerClass(paramString1, paramString2, paramString3, paramInt);
/*    */     super.visitInnerClass(paramString1, paramString2, paramString3, paramInt);
/*    */   }
/*    */   
/*    */   public FieldVisitor visitField(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
/*    */     Printer printer = this.p.visitField(paramInt, paramString1, paramString2, paramString3, paramObject);
/*    */     try {
/*    */     
/*    */     } catch (RuntimeException runtimeException) {
/*    */       throw b(null);
/*    */     } 
/*    */     FieldVisitor fieldVisitor = (this.cv == null) ? null : this.cv.visitField(paramInt, paramString1, paramString2, paramString3, paramObject);
/*    */     return new TraceFieldVisitor(fieldVisitor, printer);
/*    */   }
/*    */   
/*    */   public TraceClassVisitor(ClassVisitor paramClassVisitor, Printer paramPrinter, PrintWriter paramPrintWriter) {
/*    */     super(327680, paramClassVisitor);
/*    */     this.pw = paramPrintWriter;
/*    */     this.p = paramPrinter;
/*    */   }
/*    */   
/*    */   public void visitOuterClass(String paramString1, String paramString2, String paramString3) {
/*    */     this.p.visitOuterClass(paramString1, paramString2, paramString3);
/*    */     super.visitOuterClass(paramString1, paramString2, paramString3);
/*    */   }
/*    */   
/*    */   private static RuntimeException b(RuntimeException paramRuntimeException) {
/*    */     return paramRuntimeException;
/*    */   }
/*    */ }


/* Location:              C:\Users\nebul\Downloads\SkyblockExtras-2.1.10.1 (1).jar!\org\spongepowered\asm\li\\util\TraceClassVisitor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */