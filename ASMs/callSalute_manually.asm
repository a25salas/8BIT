;
;fun main(){
;	print_string('Hello World!");
;	
;}
.init:
     MOV D, 232
     JMP main
; Data Area
.main_data:
.UNDEF: DB 255
.main_salute_01: DB "Hello 666!"
	 DB 0
; Code Area
salute:
CALL print_string
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
     PUSH .main_salute_01
	 CALL salute
	 POP A
	 HLT