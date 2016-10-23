package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMPrintString implements ASMAst {

	private ASMAst e; // String (expression) a imprimir

	public ASMPrintString(ASMAst e) {
		this.e = e;
	}

	public void genCode(PrintStream out){
		/*
		out.format(".str"); e.genCode(out); out.format(":\n");
		out.format("\tPUSH .str"); e.genCode(out); out.format(":\n");
		out.format("\tJMP .printStr\n"); 
		*/
		// Este metodo imprime lo que este en A
		out.format(".printStr:\n");
		out.format("\tPOP B \n"); //Direccion del CALL
		out.format("\tPOP A\n");
		out.format(".printLoop:\n");
		out.format("\tMOV C, [A]\n");
		out.format("\tCMP C, 0\n");
		out.format("\tJE .printDone\n");
		out.format("\tMOV [D], C\n");
		out.format("\tINC D\n");
		out.format("\tINC A\n");
		out.format("\tJMP .printLoop\n");
		out.format(".printDone:\n");
		out.format("\tPUSH B\n"); //Reecoloca direccion del CALL
		out.format("\tRET\n"); // Se devuelve
		//out.format("\tRET\n"); habria que calcular un PUSH/POP extra
	}
}