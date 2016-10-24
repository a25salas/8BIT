package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMBlock implements ASMAst {

	protected List<ASMAst> members;

	public ASMBlock(List<ASMAst> members){
		this.members = members;
	}

	public List<ASMAst> getMembers(){
		return members;
	}

	public void genCode(PrintStream out){
		this.members.stream().filter(t -> t != null) 
							 .forEach(t -> { 
							 	if (t.getClass().getName() == "eightBit.asm.ASMPrintString")
							 		// Para reutilizar .printStr 
							 		out.format("\tCALL .printStr\n");
							 	else t.genCode(out);
							 });
	}
}