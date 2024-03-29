package eightBit.js;
import java.util.*;
import java.io.*;
public class JSProgram implements JSAst{
   static private JSId UNK = new JSId("");
   private JSId name;
   private List<JSAst> functions;
   private JSAst body;
   public JSProgram(List<JSAst> functions){
      this(UNK, functions);
   }
   public JSProgram(JSId name, List<JSAst> functions){
      this.functions = functions;
	  this.name = name;
   }
   public void genCode(PrintStream out){
	/*out.format("\n");
	   out.format(".init:\n");
	out.format("MOV D, 232\n");
	out.format("JMP main\n");*/
       functions.stream().forEach( t -> t.genCode(out));
   }
}