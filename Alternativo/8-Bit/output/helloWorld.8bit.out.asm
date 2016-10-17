
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
.main: 
.str"Hola amigos":
	DB "Hola amigos"\n	DB 0
	PUSH.str"Hola amigos":
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
.printDone
	HLT
