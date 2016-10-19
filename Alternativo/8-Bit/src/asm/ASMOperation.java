package eightBit.asm;
import java.io.PrintStream;

public class ASMOperation implements  ASMAst{
    protected ASMAst oper;
    protected ASMAst left, right;
    
    public ASMOperation(ASMAst oper, ASMAst left, ASMAst right){
        this.oper = oper;
	    this.left = left;
	    this.right = right;
    }

    public void genCode(PrintStream out){
       left.genCode(out);
	   oper.genCode(out);
	   right.genCode(out);
    }
}