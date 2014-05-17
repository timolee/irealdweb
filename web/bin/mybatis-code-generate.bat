@echo off
echo [INFO] Use maven mybatis-generator-plugin download jars and generate mybatis files.
cd %~dp0
cd ..
call mvn clean mybatis-generator:generate
cd bin
pause