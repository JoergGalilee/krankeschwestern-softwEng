@Echo off

rem
rem ggf. belegte Systemvariablen l�schen:
rem

set classpath=.
set sourcepath=.
set bootclasspath=.
set extdirds=.

java -cp .;de_eikelberg_iotools.jar klaufg03.rmiclient.Client

echo.
pause
