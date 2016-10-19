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
		out.format("\t;    DATA AREA    ;");
        out.format("\ndata:\n");
        for (Map.Entry<ASMAst, ASMAst> entry : dArea.entrySet()){
            out.format("\t DB "); 
        	entry.getKey().genCode(out);
        	out.format(" : ");
        	entry.getValue().genCode(out); 
        	out.format("\n");
        }
	}

	public void genCode(PrintStream out){
		out.format("\n\t; 8Bit-2-ASM Program ;\n");
		out.format(".init:\n");
		out.format("\tMOV D, 232\n");
		out.format("\tJMP .main\n");
		this.genDArea(out);
		// Imprime todas las funciones del program (incluyendo ASMMain)
		functions.stream().forEach(f -> f.genCode(out));
	}
}