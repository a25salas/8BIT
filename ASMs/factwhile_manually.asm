.init:
	MOV D, 232;
	JMP .main
fact_data:
	facting:   DB 5
	fact_res:  DB 1
	factDe:    DB "fact(5)"
		   DB 0

.main:
	MOV C, factDe    ; Point to var 
	CALL print
	MOV C, [facting]
	CALL .factorialR
	MOV C, A ; Deberia poderse con [fact_res] en vez de A
	CALL .parse
    	HLT             ; Stop execution
.factorialR:
	PUSH 0xFF: ;
	MOV A, [fact_res]
.factorial:
	CMP C, 0
	JE .emptyStack
    MOV B,C
	MUL B
	DEC C
	JMP .factorial
.emptyStack:
	POP B
	CMP B, 0xFF
	JE .endOfStack
	MUL B
	JMP .emptyStack
.endOfStack:
	MOV [fact_res], A
	RET
print:			; print(C:*from, D:*to)
	PUSH A
	PUSH B
	MOV B, 0
.loop:
	MOV A, [C]	; Get char from var
	MOV [D], A	; Write to output
	INC C
	INC D  
	CMP B, [C]	; Check if end
	JNZ .loop	; jump if not
	MOV [D], 0x3D
	INC D
	POP B
	POP A
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
