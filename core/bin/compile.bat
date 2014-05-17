@echo off
echo [INFO] compiling....

cd %~dp0
cd ..
call mvn clean compile 
cd bin
pause