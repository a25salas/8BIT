package eightBit.asm;
import java.util.*;
import java.io.PrintStream;

public class ASMFor implements ASMAst{
  
    private ASMAst f1, f2, f3,s1;

    public ASMFor(ASMAst f1, ASMAst f2,ASMAst f3, ASMAst s1){
        this.f1 = f1;
	    this.f2 = f2;
        this.f3 = f3;
	    this.s1 = s1;	
    }
    @Override
    public void genCode(PrintStream out){
        out.format("for("); 
	    this.f1.genCode(out);	 
	    out.format(";");
        this.f2.genCode(out);	 
	    out.format(";");
        this.f3.genCode(out);	 
	    out.format("){");	 
	    this.s1.genCode(out); 
	    out.format("} ");  
    }
}