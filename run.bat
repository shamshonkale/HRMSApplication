set projectLocation=E:\NARESH IT\SOFTWARE TESTING\Selenium Workspace 1\Framework_HRMS
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\* 
java org.testng.TestNG %projectLocation%\testng.xml