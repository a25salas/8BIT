package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMEmpty implements ASMAst {

	@Override
	public void genCode(PrintStream out){
		out.println(";\tempty statement\t;\n");
	}
}
