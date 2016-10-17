package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMWhile implements ASMAst{
  
    private ASMAst c, t, e;
    
    public ASMWhile(ASMAst c, ASMAst t){
       this.c = c;
	   this.t = t;
    }


    @Override
    public void genCode(PrintStream out){
        out.format("while("); 
	   this.c.genCode(out); 
	   out.format("){"); 
	   this.t.genCode(out); 
	   out.format("} "); 
	   out.format(";"); 
    }
}