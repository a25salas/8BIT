@echo off
REM compila modelo y compilador
javac -cp .;lib;%CLASSPATH%  -d lib src/asm/*.java src/compiler/*.java 
