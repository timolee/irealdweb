@echo off
echo [INFO] Use maven tomcat plugin run project.
cd %~dp0
cd ..
call mvn clean tomcat:run
cd bin
pause