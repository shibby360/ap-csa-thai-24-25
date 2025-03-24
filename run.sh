compile="no"
direct=$CURRDIR
goup="no"
currentfile=Main
OPTIND=1
while getopts ":cde" opt; do
    case ${opt} in
    c)
        compile="yes"
        ;;
    d)
        cd $direct
        goup="yes"
        ;;
    e)
        compile="yes"
        cd $direct
        goup="yes"
        ;;
    esac
done
if [ $compile == "yes" ]; then
    javac $currentfile.java
    java $currentfile
else 
    java $currentfile.java
fi
if [ $goup == "yes" ]; then
    cd ..
fi
# -c will compile the .class
# absence of -c doesn't compile .class and runs file directly
# -d runs in CURRDIR