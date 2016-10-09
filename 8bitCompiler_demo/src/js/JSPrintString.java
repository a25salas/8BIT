package eightBit.js;
import java.util.*;
import java.io.*;
public class JSPrintString implements JSAst{
  
   private JSAst e;
   public JSPrintString(JSAst e){
      this.e = e;
   }
   public void genCode(PrintStream out){
	 out.format("; Data Area\n");  
 out.format(".main_data: \n");
 out.format(".UNDEF: DB 255 \n");
 out.format(".main_string_01: DB ");
	this.e.genCode(out);
	out.format("\n");
	out.format("DB 0\n");
	   
	   out.format("main: \n");
	   out.format("PUSH .main_string_01 \n");
	 out.format("CALL print_string \n");
	 out.format("POP A\n");

	   /*
	   out.format("printString("); 
	   //out.print(this.e);
	this.e.genCode(out); 
	 out.format(")"); 
	  out.format(";"); */
   }
}