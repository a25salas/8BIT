package eightBit.compile;
import eightBit.asm.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;
import java.util.stream.*;

public class Compiler extends EightBitBaseVisitor<ASMAst> implements ASMEmiter {

	protected ASMAst program;
	protected Map<ASMAst, ASMAst> variables = new HashMap<>();
	protected List<ASMAst> statements = new ArrayList<>();

	public ASMAst getProgram(){
		return this.program;
	}

	public void genCode(){
		this.program.genCode();
		//this.statements.stream().forEach(t -> t.genCode());
	}

	public ASMAst compile(ParseTree tree){
        return visit(tree);
    }

    @Override
    public ASMAst visitEightProgram(EightBitParser.EightProgramContext ctx){
	   ctx.eightFunction().stream().forEach(fun -> visit(fun));
	   visit(ctx.eightMain());
	   return this.program = PROGRAM(this.statements, this.variables);
    }

    @Override
    public ASMAst visitEightFunction(EightBitParser.EightFunctionContext ctx){
      
       ASMId id = (ASMId)visit(ctx.id());
	   ASMAst f = visit(ctx.formals());
       List<ASMAst> params = FORMALS(f);
	   ASMAst body = visit(ctx.funBody());
	   ASMAst function = FUNCTION(id, params, body);
       params.stream().filter(otherf -> otherf != null).forEach(p -> variables.put(id, p));
	   this.statements.add(function);
	   return function;
    }
   
    @Override//**
    public ASMAst visitEightMain(EightBitParser.EightMainContext ctx){
        System.err.print(" entre\n");
	    ASMAst f = visit(ctx.formals());
	    ASMAst body = visit(ctx.funBody());
	    ASMAst function = MAIN(FORMALS(f), body);
	    this.statements.add(function);
	    return function;
    }
   
    @Override
    public ASMAst visitEmptyStatement(EightBitParser.EmptyStatementContext ctx){
        return EMPTY();            
    }
   
    @Override
    public ASMAst visitReturnStatement(EightBitParser.ReturnStatementContext ctx){
        return RET(visit(ctx.expr()));                
    }
   
    @Override
    public ASMAst visitPrint_string(EightBitParser.Print_stringContext ctx){
        return PRINTSTRING(visit(ctx.expr()));                
    }
   
    @Override
    public ASMAst visitPrint_number(EightBitParser.Print_numberContext ctx){
        return PRINTNUMBER(visit(ctx.callStatement()));                
    }
   
    @Override
    public ASMAst visitPrint_boolean(EightBitParser.Print_booleanContext ctx){
        return PRINTBOOLEAN(visit(ctx.callStatement()));                
    }
   
    @Override
    public ASMAst visitIfStatement (EightBitParser.IfStatementContext ctx){
      ASMAst i = visit(ctx.expr());
      /*if(ctx.closedStatement().size()==2){
	      
      }*/
	  ASMAst t = visit(ctx.closedStatement().get(0));
	 ASMAst e = visit(ctx.closedStatement().get(1));
	  ASMAst ifs = IF(i,t,e);
		return ifs;
	                
    }
   
    @Override
    public ASMAst visitWhileStatement (EightBitParser.WhileStatementContext ctx){
      ASMAst i = visit(ctx.expr());
      /*if(ctx.closedStatement().size()==2){
	      
      }*/
	  ASMAst t = visit(ctx.closedStatement());
	  ASMAst ifs = WHILE(i,t);
		return ifs;
	                
    }

    @Override
    public ASMAst visitForStatement (EightBitParser.ForStatementContext ctx){
      ASMAst f1 = visit(ctx.expr().get(0));
	  ASMAst f2 = visit(ctx.expr().get(1));
	  ASMAst f3 = visit(ctx.expr().get(2));
      
	  ASMAst s1 = visit(ctx.closedStatement());
	  ASMAst faux = FOR(f1,f2,f3,s1);
		return faux;
	                
    }
      public ASMAst   visitRelOperation (EightBitParser.RelOperationContext ctx){
	     //return visit(ctx.relOperator().get(0));
	   return BLOCK(ctx.arithOperation().stream()
						     .map( c -> visit(c))
						     .collect(Collectors.toList()));  
	/*  ASMAst l = visit(ctx.arithOperation().get(0));
	  System.err.print("valor arith:"+l.getText()+"\n");
	  ASMAst r = visit(ctx.arithOperation().get(1));
	  ASMAst o = visit(ctx.relOperator().get(0));
	  
	        return OPERATION(o,l,r); */       
    }
   
    @Override
    public ASMAst visitAssignStatement(EightBitParser.AssignStatementContext ctx){
	   return ASSIGN(visit(ctx.id()), visit(ctx.expr()));                
    }

    @Override
    public ASMAst visitBlockStatement(EightBitParser.BlockStatementContext ctx){
	   EightBitParser.ClosedListContext closedList = ctx.closedList();
        return (closedList == null ) ? BLOCK() : visit(closedList);
    }
   
    @Override
    public ASMAst visitClosedList(EightBitParser.ClosedListContext ctx){					  
	    return  BLOCK(ctx.closedStatement().stream().map( c -> visit(c))
										                .collect(Collectors.toList()));
	                
   }
   
    @Override
    public ASMAst  visitCallStatement (EightBitParser.CallStatementContext ctx){					  
		ASMId id = (ASMId)visit(ctx.id());
	    ASMAst f = visit(ctx.arguments());
	    ASMAst call = CALL(id, ARGS(f));
		return call;	                 
    }
   
    @Override
    public ASMAst  visitArguments (EightBitParser.ArgumentsContext ctx){					  
		return visit(ctx.args());
    }
   
    @Override
    public ASMAst  visitArgs (EightBitParser.ArgsContext ctx){	
		//ctx.expr().stream().forEach(c-> System.err.print("valor arg:"+c.getText()+"\n"));                                                      
		 return BLOCK(ctx.expr().stream().map( c -> visit(c))
						                  .collect(Collectors.toList()));
    }
      
    @Override
    public ASMAst visitFormals(EightBitParser.FormalsContext ctx){
	    EightBitParser.IdListContext idList = ctx.idList();
	    return (idList == null ) ? BLOCK() : visit(idList);
    }

    @Override
    public ASMAst visitIdList(EightBitParser.IdListContext ctx){
	    return  BLOCK(ctx.id().stream().map( c -> visit(c))
						              .collect(Collectors.toList()));
    }

    @Override
    public ASMAst visitId(EightBitParser.IdContext ctx){
	   // System.err.print("valor id:"+ctx.ID().getText()+"\n");
	   return  ID(ctx.ID().getText());
    }

   	@Override
    public ASMAst visitArithOperation(EightBitParser.ArithOperationContext ctx) {
	   	if (ctx.oper == null)	return visit(ctx.arithMonom().get(0));
	   	ASMAst oper = ( ctx.oper.getType() == EightBitParser.ADD ) ? ADD : MINUS;
       	List<ASMAst> exprs = ctx.arithMonom().stream().map(c -> visit(c))
										   	          .collect(Collectors.toList());
	   	return exprs.stream().skip(1).reduce(exprs.get(0), (opers, expr) -> OPERATION(oper, opers , expr)); 
    }

   	@Override
    public ASMAst visitArithMonom(EightBitParser.ArithMonomContext ctx){
		if (ctx.oper == null)
		   return visit(ctx.arithSingle().get(0));
		ASMAst oper = ( ctx.oper.getType() == EightBitParser.MUL ) ? MUL : DIV;
        List<ASMAst> exprs = ctx.arithSingle().stream().map(c -> visit(c))
										   		         .collect(Collectors.toList());
		return exprs.stream().skip(1).reduce(exprs.get(0), (opers, expr) -> OPERATION(oper, opers , expr));
	}

    @Override
    public ASMAst visitArithIdSingle(EightBitParser.ArithIdSingleContext ctx){
        return visit(ctx.id()); // ignoring by now arguments!!
    }

    @Override
    public ASMAst visitExprNum(EightBitParser.ExprNumContext ctx){
	    System.err.print("valor num:"+ctx.NUMBER().getText()+"\n");
        return NUM(Integer.valueOf(ctx.NUMBER().getText()));
    }
   
    @Override
    public ASMAst visitExprString(EightBitParser.ExprStringContext ctx){
	    System.err.print("valor string:"+ctx.STRING().getText()+"\n");
        return STRING(String.valueOf(ctx.STRING().getText()));
    }
   
    @Override
    public ASMAst visitExprTrue(EightBitParser.ExprTrueContext ctx){
        return TRUE;
    }
    @Override
    public ASMAst visitExprFalse(EightBitParser.ExprFalseContext ctx){
        return FALSE;
    } 

}