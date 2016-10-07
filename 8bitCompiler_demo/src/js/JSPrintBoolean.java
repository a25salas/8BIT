package eightBit.js;
import java.util.*;
import java.io.*;
public class JSPrintBoolean implements JSAst{
  
   private JSAst e;
   public JSPrintBoolean(JSAst e){
      this.e = e;
   }
   public void genCode(PrintStream out){
	   out.format("printBool("); 
	 this.e.genCode(out); 
	 out.format(")"); 
	  out.format(";"); 
   }
}