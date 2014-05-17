@echo off
echo [INFO] clean and compile project.
cd %~dp0
cd ..
call mvn clean compile
cd bin
pause