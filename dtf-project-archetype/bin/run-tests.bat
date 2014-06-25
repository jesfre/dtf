@echo off
call env.bat
@echo Running tests...
cd ..
call mvn clean
call mvn dtf:clean
call mvn integration-test
call mvn post-site
cd bin
