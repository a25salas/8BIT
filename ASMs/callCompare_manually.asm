.main_data:
.UNDEF: DB 255
.main_add_01: DB "2"
.main_add_02: DB "4"
	 DB 0
; Code Area
add:
POP C ;C=DIR MEMO ,
POP A ;A=4
POP B ;B=2
PUSH C
MOV A,C ;C=4
SUB A,B ;A=2
JNC .mayor1	; SI A ES MAYOR
JC .mayor2  ;SI B ES MAYOR
.mayor1:
POP B
PUSH C
PUSH B
.mayor2:
POP A
PUSH B
PUSH A
print_string:
     POP C
     POP B
     PUSH C 
.print_string_loop_01:
     MOV C, [B]
	 CMP C, 0
	 JE .print_string_exit
	 MOV [D], C
	 INC D
	 INC B
	 JMP .print_string_loop_01
.print_string_exit:
     POP C 
     PUSH .UNDEF
     PUSH C
     RET
main: 
     PUSH .main_add_01
	 PUSH .main_add_02
	 CALL add
	 CALL print_string
	 POP A
	 HLT