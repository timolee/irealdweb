@echo off
echo [INFO] installing....

cd %~dp0
cd ..
call mvn clean compile install
cd bin
pause