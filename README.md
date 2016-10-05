# 8BIT

agregar al path los bats de antlr

set classpath=.;C:\antlr\lib\*;lib

primero generar parser= bats\build_parser.bat

generar arbol(opcional)= grun eightBit.compile.EightBit eightProgram cases\helloWorld.8bit -gui

bats\build_compiler

bats\test_project.bat helloWorld.8bit
