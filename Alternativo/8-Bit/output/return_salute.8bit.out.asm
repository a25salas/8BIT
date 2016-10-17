
	; 8Bit-2-ASM Program ;
.init:
	MOV D, 232
	JMP .main
.salute: 
.salute_[params]: DB ""
	PUSH "Hello 666!" ;
RET .main: 
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
