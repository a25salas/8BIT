package eightBit.js;
import java.util.*;
import java.io.*;
public class JSPrintString implements JSAst{
  
   private JSAst e;
   public JSPrintString(JSAst e){
      this.e = e;
   }
   public void genCode(PrintStream out){
	   out.format("String.console.log("); 
	   //out.print(this.e);
	//this.e.genCode(out); 
	 out.format(")"); 
	  out.format(";"); 
   }
}