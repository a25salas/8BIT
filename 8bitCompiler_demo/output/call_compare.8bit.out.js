function compare(xy){if(xy)return false;else return true;;};function MAIN( ){ 
print_string:
POP C ; c= pos de ret print str
POP B ; B= pos de ret salute
POP A ; Saca .main_salute
PUSH B
PUSH C
.print_string_loop_01:
MOV C, [A] ; Ahora .main_salute està en A
 CMP C, 0
JE .print_string_exit
JE .print_string_exit
INC D
 INC A
 JMP .print_string_loop_01
.print_string_exit:
RET ; Vuelve a salute
printBool(compare(10.05.0));print_string:
POP C ; c= pos de ret print str
POP B ; B= pos de ret salute
POP A ; Saca .main_salute
PUSH B
PUSH C
.print_string_loop_01:
MOV C, [A] ; Ahora .main_salute està en A
 CMP C, 0
JE .print_string_exit
JE .print_string_exit
INC D
 INC A
 JMP .print_string_loop_01
.print_string_exit:
RET ; Vuelve a salute
printBool(compare(5.010.0));};