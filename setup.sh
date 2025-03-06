# ./setup.sh -d <directory name>
while getopts ":d:" opt; do
    case ${opt} in
    d)
        export CURRDIR=${OPTARG}
        ;;
    esac
done
function run() {
    source ./run.sh $@
}