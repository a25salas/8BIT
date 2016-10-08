package eightBit.js;
import java.util.*;
import java.io.*;
public class JSPrintString implements JSAst{
  
   private JSAst e;
   public JSPrintString(JSAst e){
      this.e = e;
   }
   public void genCode(PrintStream out){
	  
out.format("print_string:\n");
out.format("POP C ; c= pos de ret print str\n");   
out.format("POP B ; B= pos de ret salute\n");    
out.format("POP A ; Saca .main_salute\n");    
out.format("PUSH B\n");    
out.format("PUSH C\n") ;   
out.format(".print_string_loop_01:\n");
out.format("MOV C, [A] ; Ahora .main_salute està en A\n")   ; 
out.format(" CMP C, 0\n")  ;
out.format("JE .print_string_exit\n")    ;
out.format("JE .print_string_exit\n")    ;
out.format("INC D\n")    ;
out.format(" INC A\n")   ;
out.format(" JMP .print_string_loop_01\n")   ;
out.format(".print_string_exit:\n");
out.format("RET ; Vuelve a salute\n") ;   
	   /*
	   out.format("printString("); 
	   //out.print(this.e);
	this.e.genCode(out); 
	 out.format(")"); 
	  out.format(";"); */
   }
}