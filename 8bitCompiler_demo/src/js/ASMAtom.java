package eightBit.js;
import java.io.*;
public class ASMAtom<T> implements ASMAst{
   protected  T value;
   public T getValue(){return this.value;}
   
   public ASMAtom(T value){
      this.value = value;
   }
   public void genCode(PrintStream out){
       out.format("PUSH %s(", this.value);
   }
}