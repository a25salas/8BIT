package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMCall implements ASMAst{

    private ASMId f;
    private List<ASMAst> args;
   
    public ASMCall(ASMId f, ASMAst e){
        this(f, Arrays.asList(e));
    }
    public ASMCall(ASMId f, List<ASMAst> args){
        this.f = f;
        this.args = args; 
    }
    public void genCode(PrintStream out){
      
        out.format("\tCALL .");
        out.format(this.f.getValue());
        out.format(";\n");
   }
}