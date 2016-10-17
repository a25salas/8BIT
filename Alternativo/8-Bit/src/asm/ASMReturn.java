package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMReturn implements ASMAst{
  
   	private ASMAst e;

   	public ASMReturn(ASMAst e){
      	this.e = e;
   	}
   	public void genCode(PrintStream out){
   		// Coloca valor de 'e' en la pila y hace un RET
      	out.format("\tPUSH ");
      	e.genCode();
      	out.format(" ;\n");
      	out.format("RET ");
   	}
}