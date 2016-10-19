
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
	;    DATA AREA    ;
data:
	 DB salute : 
.salute: 
.salute_0: DB 
	POP A
	RET 
.main: 
.strsalute:
	DB salute
	DB 0
	PUSH .strsalute:
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
	HLT
