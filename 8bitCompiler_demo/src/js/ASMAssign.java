package eightBit.js;
import java.io.*;
public class ASMAssign implements  ASMAst{
private ASMAst left, right;
   public ASMAssign(ASMAst left, ASMAst right){
     this.right=right;
	 this.left=left;
	 
   }
   public void genCode(PrintStream out){
      left.genCode(out);
	  right.genCode(out);
	  out.print("MOV A,B");
	  out.print("PUSH A");
	  
   }
}