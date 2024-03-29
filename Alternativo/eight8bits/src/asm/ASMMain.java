package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMMain implements ASMAst {

	static private ASMId UNK = new ASMId("");
	private ASMId name;
	private List<ASMAst> formals;
	private ASMAst body;

	public ASMMain(List<ASMAst> formals, ASMAst body){
		this.formals = formals;
		this.body = body;
	}

	public void genCode(PrintStream out){
		out.format(".main: \n");
		if (this.body != null)
			this.body.genCode(out);	
		
		out.format("\tHLT\n");
	}
}