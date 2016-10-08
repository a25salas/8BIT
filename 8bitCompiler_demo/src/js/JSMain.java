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
       out.format("function MAIN(");
	   if (this.formals != null)
	      this.formals
	          .stream()
	          .filter(f -> f != null)
	          .forEach(f -> f.genCode(out));
	  
	   out.print("){");
	   if (this.body != null)
	      this.body.genCode(out);
	   out.print("};");
   }
}