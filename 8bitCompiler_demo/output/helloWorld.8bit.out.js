
.init:
MOV D, 232
JMP main
print_string:
POP C ; c= pos de ret print str
POP B ; B= pos de ret salute
PUSH C
.print_string_loop_01:  
 MOV C, [B] 
CMP C, 0 C
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
; Data Area
.main_data: 
.UNDEF: DB 255 
.main_string_01: DB "Hola amigos"
DB 0
main: 
PUSH .main_string_01 
CALL print_string 
POP A
HLT