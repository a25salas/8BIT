package eightBit.asm;
import java.util.*;
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
		int params = 0; //Mutable
		out.format("." + this.name.getValue() + ": \n");
		if (this.formals != null)
			this.formals.stream().filter(f -> f != null)
								 .forEach(f ->{
								 	out.format("." + this.name.getValue() +"_[params]: ");
								 	out.format("DB \""); f.genCode(out); out.format("\"\n");
								 });
		if (this.body != null)
			this.body.genCode(out);
	}
}