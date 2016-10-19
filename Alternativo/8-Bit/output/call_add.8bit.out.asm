
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
	;    DATA AREA    ;
data:
	 DB add : xy
.add: 
.add_0: DB xy
	POP A
	RET 
.main: 
.str"10+56=":
	DB "10+56="
	DB 0
	PUSH .str"10+56=":
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
.printInt:
	MOV C, 	CALL .add;

	PUSH 0xFF; Delimitador Stack
	JMP parse:
.parse:
	MOV A, C
	DIV 10
	PUSH A
	MOV B, C
	MUL 10
	SUB B, A
	POP A
	PUSH B
	CMP A, 10
	JBE .printFirst
	MOV C, A
	CMP A, 0
	JNE .parse
.printFirst: 
	PUSH A
	ADD A, 0x30
	MOV [D], A
	INC D
	POP A
.printStack: 
	POP B
	CMP B, 0xFF; Is EOS?
	JE .EOS
	ADD B, 0x30
	MOV [D], B
	INC D
	JNE .printStack
.EOS
	HLT
