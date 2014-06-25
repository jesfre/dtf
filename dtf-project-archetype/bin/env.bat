@echo off
@echo Setting environment [MAVEN_HOME]
for /f %%i in ("%0") do set curpath=%%~dpi
set MAVEN_HOME=%curpath%apache-maven-3.1.1
set PATH=%PATH%;%MAVEN_HOME%\bin;
