package eightBit.js;

import java.util.*;
import java.io.*;

public class JSMain implements JSAst{
   static private JSId UNK = new JSId("");
   private JSId name;
   private List<JSAst> formals;
   private JSAst body;
  
   public JSMain( List<JSAst> formals, JSAst body){
      this.formals = formals;
	  this.body = body;
	
   }
   public void genCode(PrintStream out){
	// header
	out.format("\n");
	   out.format(".init:\n");
	out.format("MOV D, 232\n");
	out.format("JMP main\n");
	
	// datos
	
	
	   
	
	// print string funcion fija sino debería crearse en function..
	
	out.format("print_string:\n");
	out.format("POP C ; c= pos de ret print str\n");   
	out.format("POP B ; B= pos de ret salute\n");     
	out.format("PUSH C\n") ;   
	out.format(".print_string_loop_01:  \n") ;  
     out.format(" MOV C, [B] \n") ;  
	  out.format("CMP C, 0 C\n") ;  
	  out.format("JE .print_string_exit \n") ;  
	  out.format("MOV [D], C \n") ;  
	   out.format("INC D \n") ;  
	   out.format("INC B \n") ;  
	   out.format("JMP .print_string_loop_01 \n") ;  
 out.format(".print_string_exit:  \n") ;  
        out.format("POP C \n") ;  
      out.format("PUSH .UNDEF \n") ;  
      out.format("PUSH C \n") ;  
        out.format("RET \n") ;  
	
	// main
	
	if (this.body != null)
	      this.body.genCode(out);
	 out.format("HLT");

/*	
       out.format("function MAIN( ");
	   if (this.formals != null)
	      this.formals
	          .stream()
	          .filter(f -> f != null)
	          .forEach(f -> f.genCode(out));
	  
	   out.print("){ \n");
	   if (this.body != null)
	      this.body.genCode(out);
	   out.print("};");
	   */
   }
}