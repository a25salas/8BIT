init:
	MOV D, 232
	JMP main
UPA:			  ; User Program Data
add_data:
	compare_x:   DB	95
	compare_y:   DB	160
	compare_res: DB 	0
main:
	
	MOV C, [compare_x] 
	CALL .parse	; Parsea 1er numero
	CALL .printGreaterThan ; Imprime '>'
	MOV C, [compare_y]
	CALL .parse	; Parsea 2do numero
	CALL .printEqual; Imprime '='
	CALL .doCompare	; Realiza la comparaciòn
	HLT
.doCompare:
	MOV A, [compare_x]
	MOV B, [compare_y]
	CMP A, B
	JA .printTrue
	JNA .printFalse
.printTrue:
	MOV [D], 0x54 ; 'T' en ASCII
	INC D
	MOV [D], 0x52 ; 'R' en ASCII
	INC D
	MOV [D], 0x55 ; 'U' en ASCII
	INC D
	MOV [D], 0x45 ; 'E' en ASCII
	INC D
	RET
.printFalse:
	MOV [D], 0x46 ; 'F' en ASCII
	INC D
	MOV [D], 0x41 ; 'A' en ASCII
	INC D
	MOV [D], 0x4C ; 'L' en ASCII
	INC D
	MOV [D], 0x53 ; 'S' en ASCII
	INC D
	MOV [D], 0x45 ; 'E' en ASCII
	INC D
	RET
.printGreaterThan:
	MOV [D], 0x3E ; '>' en ASCII
	INC D
	RET
.printEqual:
	MOV [D], 0x3D ; '=' en ASCII
	INC D
	RET
.parse:;PARSEA E IMPRIME UN ENTERO ---------------------
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
; FIN DE .parse -------------------------------------