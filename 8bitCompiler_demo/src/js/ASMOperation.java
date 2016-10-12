public class ASMOperationM implements  ASMAst{
   private ASMAst oper;
   private ASMAst left, right;
   public ASMOperationM(ASMAst oper, ASMAst left, ASMAst right){
      this.oper = oper;
	  this.left = left;
	  this.right = right;
   }
    public void genCode(PrintStream out){
      left.genCode(out);
	  right.genCode(out);
	  oper.genCode(out);
	}
}