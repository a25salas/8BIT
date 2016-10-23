package eightBit.asm;
import java.io.PrintStream;

public class ASMMul extends ASMOperation{
	
	public ASMMul(ASMAst op, ASMAst le, ASMAst ri){
		super(op, le, ri);
	}
	
    public void genCode(PrintStream out){
       out.format("POP B \n");
	   out.format("POP A \n");
	   out.format("MUL B \n");
	   out.format("PUSH A \n");
	}
} 