init:
	MOV D, 232
	JMP main
UPA:			  ; User Program Data
add_data:
	adding_x:   DB	95
	adding_y:   DB	160
	adding_res: DB 	0
main:
	
	MOV C, [adding_x] 
	CALL .parse	; Parsea 1er sumando
	CALL .printPlus ; Imprime '+'
	MOV C, [adding_y]
	CALL .parse	; Parsea 2do sumando
	CALL .printEqual; Imprime '='
	CALL .doAdd	; Realiza la suma
	MOV C, [adding_res]
	CALL .parse	; Parse resultado
	HLT
.doAdd:
	MOV A, [adding_x]
	MOV B, [adding_y]
	ADD B, A
	MOV [adding_res], B
	RET
.printPlus:
	MOV [D], 0x2B ; '+' en ASCII
	INC D
	RET
.printEqual:
	MOV [D], 0x3D ; '=' en ASCII
	INC D
	RET
.parse:
	PUSH 0xFF	; Delimitador de EOS (end of stack)
	JMP .parse_start
.parse_start:
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
	JNE  .parse_start
.printFirst:
	PUSH A
	ADD A, 0x30
	MOV [D], A
	INC D
	POP A
.printStack:
	POP B
	CMP B, 0xFF
	JE .endOfStack
	ADD B, 0x30
	MOV [D], B
	INC D
	JNE	.printStack
.endOfStack:
	RET