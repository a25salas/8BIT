package eightBit.asm;
import java.util.*;
import java.util.stream.*;
import java.io.PrintStream;

public class ASMFunction implements ASMAst {

	static private ASMId UNK = new ASMId("");
	private ASMId name;
	private List<ASMAst> formals;
	private ASMAst body;

	public ASMFunction(List<ASMAst> formals, ASMAst body){
		this(UNK, formals, body);
	}

	public ASMFunction(ASMId name, List<ASMAst> formals, ASMAst body){
		this.name = name;
		this.formals = formals;
		this.body = body;
	}

	public void genCode(PrintStream out){
		out.format("." + this.name.getValue() + ": \n");
		if (this.formals != null)
			IntStream.range(0, formals.size()).forEach(idx ->{
				out.format("\tPUSH .%s_%s\n", this.name.getValue(), idx);
			});
		
		if (this.body != null)
			this.body.genCode(out);
		out.format("\tRET\n");
	}
}