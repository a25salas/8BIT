package eightBit.js;
import java.io.PrintStream;

public class ASMMul extends ASMAtom<String>{
	
	public ASMMul(String op)
	{super(op);}
	
    public void genCode(PrintStream out){
       out.format("POP B \n");
	   out.format("POP A \n");
	   out.format("MUL B \n");
	   out.format("PUSH A \n");
	}
} //ESE VALUE ESTA SOBRANDO..no se si en ASMOPERATION revisar segun el operador que sea e inyectar el codigo ahi o manejarlo como operadores aparte 
//que seria como en este caso