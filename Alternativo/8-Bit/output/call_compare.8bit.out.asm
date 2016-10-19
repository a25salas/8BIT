
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
	;    DATA AREA    ;
data:
	 DB compare : xy
.compare: 
.compare_0: DB xy
.main: 
.str"10>5=":
	DB "10>5="
	DB 0
	PUSH .str"10>5=":
	JMP .printStr
.printStr:
	POP A
.printLoop:
	MOV C, [A]
	CMP C, 0
	JE .printDone
	MOV [D], C
	INC D
	INC A
	JMP .printLoop
.printDone:
printBool(	CALL .compare;
);.str" 5>10=":
	DB " 5>10="
	DB 0
	PUSH .str" 5>10=":
	JMP .printStr
.printStr:
	POP A
.printLoop:
	MOV C, [A]
	CMP C, 0
	JE .printDone
	MOV [D], C
	INC D
	INC A
	JMP .printLoop
.printDone:
printBool(	CALL .compare;
);	HLT
