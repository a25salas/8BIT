package eightBit.asm;
import java.io.PrintStream;

public class ASMMul extends ASMOperation{
	
	public ASMMul(Integer left, Integer right){
		super(new ASMAtom(left),new ASMId("*"),new ASMAtom(right));
	}
	
    public void genCode(PrintStream out){
       out.format("POP B \n");
	   out.format("POP A \n");
	   out.format("MUL B \n");
	   out.format("PUSH A \n");
	}
} //ESE VALUE ESTA SOBRANDO..no se si en ASMOPERATION revisar segun el operador que sea e inyectar el codigo ahi o manejarlo como operadores aparte 
//que seria como en este caso