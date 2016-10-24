package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMProgram implements ASMAst {

	static private ASMId UNK = new ASMId("");
	private ASMId name;
	private List<ASMAst> functions;
	private ASMAst body;
	private Map<ASMAst, ASMAst> dArea = new HashMap<>();

	public ASMProgram(List<ASMAst> functions){
		this(UNK, functions);
	}

	public ASMProgram(List<ASMAst> functions, Map<ASMAst, ASMAst> vars){
		this(UNK, functions, vars);
	}

	public ASMProgram(ASMId name, List<ASMAst> functions, Map<ASMAst, ASMAst> vars){
		this.functions = functions;
		this.name = name;
		this.dArea = vars;
	}

	public ASMProgram(ASMId name, List<ASMAst> functions){
		this.functions = functions;
		this.name = name;
	}

	public void genDArea(PrintStream out){
		out.format("\t;    Data Area    ;");
        out.format("\ndata:\n");
        dArea.entrySet().stream().forEach(entry ->{
        	out.format(".");
        	entry.getKey(). genCode(out);
        	out.format(": DB ");
        	entry.getValue().genCode(out);
        	out.format("\n\tDB 0\n");
        });
	}

	public void genCode(PrintStream out){
		out.format("\t; 8Bit-2-ASM Program ;\n");
        out.format(".init:\n");
        out.format("\tMOV D, 232\n");
        out.format("\tJMP .main\n");
		this.genDArea(out);
		// Print 8bit-nativo, reutilizable
		new ASMPrintString(new ASMId("non-existent")).genCode(out);;
		// Imprime todas las funciones del program (incluyendo ASMMain)
		functions.stream().forEach(f -> f.genCode(out));
	}
}