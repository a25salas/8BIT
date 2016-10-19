package eightBit.compile;
import eightBit.asm.*;
import java.util.*;
/*
	SIMULACION DEL PATRON EVENT-EMITTER PARA ASOCIAR "EVENTOS" CON OBJETOS.
	EN ESTE CASO, EVENTOS SON LAS VISITAS A LOS CONTEXTOS, Y SE CREA UN 
	OBJETO CORRESPONDIENTE AL CONTEXTO.
*/

public interface ASMEmiter {

	default ASMAst PROGRAM(List<ASMAst> functions, Map<ASMAst, ASMAst> vars){
		return new ASMProgram(functions, vars);
	}

	default ASMAst BLOCK(List<ASMAst> members){
		return new ASMBlock(members);
	}

	default ASMAst BLOCK(){
		return new ASMBlock(Arrays.asList());
	}

	default ASMAst EMPTY(){
		return new ASMEmpty();
	}

	default ASMNum NUM(int value){ 
		return new ASMNum(value);
	}

	default ASMId ID(String value){
		return new ASMId(value);
	}

	default ASMString STRING(String value){
		return new ASMString(value);
	}

	default ASMFunction FUNCTION(ASMId id, List<ASMAst> formals, ASMAst body){
		return new ASMFunction(id, formals, body);
	}

	default ASMIf IF(ASMAst c, ASMAst t, ASMAst e){
       	return null;//new ASMIf(c, e, t);
   	}
   
   	default ASMWhile WHILE(ASMAst c, ASMAst t){
    	return null;//new ASMWhile(c, t);
   	}
   
   	default ASMFor FOR(ASMAst f1, ASMAst f2,ASMAst f3, ASMAst s1){
    	return null; //new ASMFor(f1,f2,f3,s1);
   	}

   	default ASMPrintNumber PRINTNUMBER(ASMAst c){
       	return new ASMPrintNumber(c);
   	}
   
    default ASMPrintBoolean PRINTBOOLEAN(ASMAst c){
       	return new ASMPrintBoolean(c);
   	}

   	default ASMCall CALL(ASMId f, List<ASMAst> args){
       	return new ASMCall(f, args);
   	}

   	default ASMAst OPERATION(ASMAst oper, ASMAst left, ASMAst right){
   		if (oper == ADD)
   			return new ASMSum(oper, left, right);
   		if(oper == MINUS) 
   			return new ASMRes(oper, left, right);
   		if(oper == MUL)
   			return new ASMMul(oper, left, right);
   		if(oper == DIV)
   			return new ASMDiv(oper, left, right);
   		return new ASMOperation(oper, left, right);
   		
   	}

   	default ASMAst ASSIGN(ASMAst left, ASMAst right){
	   	return new ASMAssign(left, right);
   	} 

	default ASMMain MAIN(List<ASMAst> formals, ASMAst body){
		return new ASMMain(formals, body);
	}

	default ASMPrintString PRINTSTRING(ASMAst c){
		return new ASMPrintString(c);
	}

	default List<ASMAst> ARGS(ASMAst... args){
		return Arrays.asList(args);
	}

	default List<ASMAst> FORMALS(ASMAst... args){
		return Arrays.asList(args);
	}

	default ASMAst RET(ASMAst e){ 
		return new ASMReturn(e);
	}

	/*  Necesarios ? */
	final ASMBool 	TRUE = new ASMBool(true);
   	final ASMBool 	FALSE = new ASMBool(false);
	final ASMAst 	ADD = new ASMId("+");
	final ASMAst 	MINUS = new ASMId("-");
	final ASMAst	MUL = new ASMId("*");
	final ASMAst 	DIV = new ASMId("/");	
}
