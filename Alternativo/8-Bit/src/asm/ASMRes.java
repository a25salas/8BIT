package eightBit.asm;
import java.io.PrintStream;

public class ASMRes extends ASMOperation{

   	public ASMRes(Integer left, Integer right){
   		super(new ASMAtom(left),new ASMId("-"),new ASMAtom(right));
   	}
    
    public void genCode(PrintStream out){
       	out.format("POP B \n");
	   	out.format("POP A \n");
	   	out.format("SUB A,B \n");
	   	out.format("PUSH A \n");
	}
}