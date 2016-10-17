package eightBit.asm;
import java.util.*;
import java.io.*;
public class ASMPrintNumber implements ASMAst{
  
    private ASMAst e;
    
    public ASMPrintNumber(ASMAst e){
        this.e = e;
    }

    public void genCode(PrintStream out){
        // Imprime un numero almacenado en el registro C.
	     out.format(".printInt:\n");
       out.format("\tMOV C, "); e.genCode(out); out.format("\n");
       out.format("\tPUSH 0xFF; Delimitador Stack\n");
       out.format("\tJMP parse:\n");
       out.format(".parse:\n");
       out.format("\tMOV A, C\n");
       out.format("\tDIV 10\n");
       out.format("\tPUSH A\n");
       out.format("\tMOV B, C\n");
       out.format("\tMUL 10\n");
       out.format("\tSUB B, A\n");
       out.format("\tPOP A\n");
       out.format("\tPUSH B\n");
       out.format("\tCMP A, 10\n");
       out.format("\tJBE .printFirst\n");
       out.format("\tMOV C, A\n");
       out.format("\tCMP A, 0\n");
       out.format("\tJNE .parse\n");
       out.format(".printFirst: \n");
       out.format("\tPUSH A\n");
       out.format("\tADD A, 0x30\n");
       out.format("\tMOV [D], A\n");
       out.format("\tINC D\n");
       out.format("\tPOP A\n");
       out.format(".printStack: \n");
       out.format("\tPOP B\n");
       out.format("\tCMP B, 0xFF; Is EOS?\n");
       out.format("\tJE .EOS\n");
       out.format("\tADD B, 0x30\n");
       out.format("\tMOV [D], B\n");
       out.format("\tINC D\n");
       out.format("\tJNE .printStack\n");
       out.format(".EOS\n");
       //Agregar algo....

    }
}