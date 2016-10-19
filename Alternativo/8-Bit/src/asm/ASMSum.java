package eightBit.asm;
import java.io.PrintStream;

public class ASMSum extends ASMOperation{
    
	public ASMSum(ASMAst op, ASMAst le, ASMAst ri){
		super(op, le, ri);
	}

    @Override
    public void genCode(PrintStream out){
       	out.format("\tPOP B \n");
	   	out.format("\tPOP A \n");
	   	out.format("\tADD A,B \n");
	   	out.format("\tPUSH A \n");
	}
}