package eightBit.asm;
import java.io.PrintStream;

public interface ASMAst {

	default void genCode(){
		genCode(System.out);
	}

	default void genCode(PrintStream out){
		// Implementable.
	}
}