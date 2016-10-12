package eightBit.js;

public class ASMNum extends ASMAtom<Double>{
   public ASMNum(Double value){
      super(value);
   }
    public void genCode(PrintStream out){
       out.format("PUSH %s(", this.name.getValue());
	}
}