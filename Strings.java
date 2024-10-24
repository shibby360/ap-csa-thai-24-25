public class Strings {
    public static void main(String[] args) {
        // computer has spot for all possible strings
        String strLit = "A string"; // made by string literal
        // go to "A string" reference in memory
        String strCons = new String("A string"); // Made by string constructor
        // make new object, in the object is string "A new string"

        String strCons2 = new String("Third string");
        // makes new object(box) - not equal to strCons b/c it is not the same object

        // all strings are objects, they can all use methods

        // IF YOU'RE WORKING WITH STRINGS AND OBJECTS DON'T USE "==" TO COMPARE 2 STRINGS
        // use .equals instead
        // System.out.println(strLit.equals(strCons));


        //  String methods
        String test = "HELLO THERE";
        // index is position of each character in a string

        // length is .length() method
        System.out.println(test.length());

        // .indexOf(String str) tells index of first occurence of str
        // .indexOf(String str, int fromIndex) tells index of first occurence of str starting from fromIndex
        System.out.println(test.indexOf("LO"));

        // .substring(int from, int to) returns a portion of the string(from to last index - 1)
        // without int to paramater it just goes to the end
        System.out.println(test.substring(1, 7));

        // concatenation
        // all strings are immutable, so you need to change what test points to
        test = test.concat("ooga booga");
        System.out.println(test + strLit);

        System.out.println(firstLetter(test));
        System.out.println(lastLetter(test));
    }
    public static String firstLetter(String str) {
        return str.substring(0, 1);
    }
    public static String lastLetter(String str) {
        return str.substring(str.length()-1);
    }
}