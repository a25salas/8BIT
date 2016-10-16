package eightBit.js;
import java.io.PrintStream;

public class ASMOperationM implements  ASMAst{
   private ASMAst left, right,oper;
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