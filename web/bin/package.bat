@echo off
echo [INFO] Use maven packaging project....
cd %~dp0
cd ..
call mvn clean package
cd bin
pause