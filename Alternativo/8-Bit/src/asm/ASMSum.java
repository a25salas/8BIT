package eightBit.asm;
import java.io.PrintStream;

public class ASMSum extends ASMOperation{

   	public ASMSum(Integer left, Integer right){
   		super(new ASMAtom(left),new ASMId("+"),new ASMAtom(right));
   	}
    
    public void genCode(PrintStream out){
       	out.format("POP B \n");
	   	out.format("POP A \n");
	   	out.format("ADD A,B \n");
	   	out.format("PUSH A \n");
	}
}