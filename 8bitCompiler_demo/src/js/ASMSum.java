public class ASMSum extends ASMAtom<Double>{
   public ASMSum(Double value){
      super(value);
   }
    public void genCode(PrintStream out){
       out.format("POP B \n");
	   out.format("POP A \n");
	   out.format("ADD A,B \n");
	   out.format("PUSH A \n");
	}
}