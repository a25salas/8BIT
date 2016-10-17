package eightBit.asm;
import java.io.PrintStream;

/*
	ESTA CLASE SIRVE Y GENERA LOS TIPOS DE DATO (STRING, NUM, BOOL)
*/

public class ASMAtom<T> implements ASMAst {

	private T value;

	public ASMAtom(T value){
		this.value = value;
	}

	public T getValue(){
		return this.value;
	}

	public void genCode(PrintStream out){
		out.print(value);
	}

}