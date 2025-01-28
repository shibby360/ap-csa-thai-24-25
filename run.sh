currentfile=_2dArrays
if [ "$1" == "-c" ]; then
    javac $currentfile.java
    java $currentfile
else 
    java $currentfile.java
fi
# -c will compile the .class
# absence of -c doesn't compile .class and runs file directly