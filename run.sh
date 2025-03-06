compile="no"
direct=$CURRDIR
backup="no"
currentfile=Main
OPTIND=1
while getopts ":cd" opt; do
    case ${opt} in
    c)
        compile="yes"
        ;;
    d)
        cd $direct
        backup="yes"
        ;;
    esac
done
if [ $compile == "yes" ]; then
    javac $currentfile.java
    java $currentfile
else 
    java $currentfile.java
fi
if [ $backup == "yes" ]; then
    cd ..
fi
# -c will compile the .class
# absence of -c doesn't compile .class and runs file directly
# -d runs w/ CURRDIR