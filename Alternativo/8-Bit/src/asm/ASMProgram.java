package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMProgram implements ASMAst {

	static private ASMId UNK = new ASMId("");
	private ASMId name;
	private List<ASMAst> functions;
	private ASMAst body;

	public ASMProgram(List<ASMAst> functions){
		this(UNK, functions);
	}

	public ASMProgram(ASMId name, List<ASMAst> functions){
		this.functions = functions;
		this.name = name;
	}

	public void genCode(PrintStream out){
		out.format("\n\t; 8Bit-2-ASM Program ;\n");
		out.format(".init:\n");
		out.format("\tMOV D, 232\n");
		out.format("\tJMP .main\n");
		// Imprime todas las funciones del program (incluyendo ASMMain)
		functions.stream().forEach(f -> f.genCode(out));
	}
}