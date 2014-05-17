@echo off
echo [INFO] Use maven jetty plugin run project.
cd %~dp0
cd ..
call mvn clean jetty:run
cd bin
pause