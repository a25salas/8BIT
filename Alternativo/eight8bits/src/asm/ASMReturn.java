package eightBit.asm;
import java.util.*;
import java.io.*;

public class ASMReturn implements ASMAst{
  
   	private ASMAst e;

   	public ASMReturn(ASMAst e){
      	this.e = e;
   	}
   	public void genCode(PrintStream out){
      	//e.genCode();
         out.format("\tPOP A\n");
      	out.format("\tRET \n");
   	}
}