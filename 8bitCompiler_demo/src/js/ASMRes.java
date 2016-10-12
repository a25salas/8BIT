public class ASMRes extends ASMAtom<Double>{
   public ASMRes(Double value){
      super(value);
   }
    public void genCode(PrintStream out){
       out.format("POP B \n");
	   out.format("POP A \n");
	   out.format("SUB A,B \n");
	   out.format("PUSH A \n");
	}
}