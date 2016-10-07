package eightBit.js;
import java.util.*;
import java.io.*;
public class JSPrintNumber implements JSAst{
  
   private JSAst e;
   public JSPrintNumber(JSAst e){
      this.e = e;
   }
   public void genCode(PrintStream out){
	   out.format("printNumber("); 
	 this.e.genCode(out); 
	 out.format(")"); 
	  out.format(";"); 
   }
}