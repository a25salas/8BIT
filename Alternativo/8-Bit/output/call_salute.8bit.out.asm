
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
.salute: 
.salute_[params]: DB "s"
.strs:
	DB s
	DB 0
	PUSH .strs:
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
.main: 
CALL .salute;
	HLT
