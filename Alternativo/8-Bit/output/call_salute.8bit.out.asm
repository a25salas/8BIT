	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
	;    Data Area    ;
data:
.salute_0: DB "Hello 666!"
	DB 0
.printStr:
	POP B 
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
	PUSH B
	RET
.salute: 
	PUSH .salute_0
	CALL .printStr
	RET
.main: 
	CALL .salute;
	HLT
