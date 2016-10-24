package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMPrintBoolean implements ASMAst{
  
    private ASMAst e;
    
    public ASMPrintBoolean(ASMAst e){
        this.e = e;
    }

    public void genCode(PrintStream out){
	   out.format("printBool("); 
	   this.e.genCode(out); 
	   out.format(")"); 
	   out.format(";"); 
    }
}