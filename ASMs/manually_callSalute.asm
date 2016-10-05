
.init:
    MOV D, 232
    JMP main
; Data Area
.main_data:
    .UNDEF: DB 255;
    .main_salute_01: DB "Hello 666!"
    DB 0
; Code Area
salute:
    CALL print_string ; PUSH pos de RET
    RET ; Vuelve a main
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
    MOV [D], C
    INC D
    INC A
    JMP .print_string_loop_01
.print_string_exit:
    RET ; Vuelve a salute
main: 
    PUSH .main_salute_01
    CALL salute ; PUSH pos de RET
    HLT