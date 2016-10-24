package eightBit.asm;
import java.io.PrintStream;

public class ASMRes extends ASMOperation{

   	public ASMRes(ASMAst op, ASMAst le, ASMAst ri){
		super(op, le, ri);
	}
    
    public void genCode(PrintStream out){
       	out.format("POP B \n");
	   	out.format("POP A \n");
	   	out.format("SUB A,B \n");
	   	out.format("PUSH A \n");
	}
}