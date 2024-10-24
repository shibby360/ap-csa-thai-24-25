import java.util.Scanner;
public class StringAlgo {
    public static void main(String[] args) {
        int l = countLet("Hello There", "T");
        System.out.println(l);
        String newStr = revString("Hello!");
        System.out.println(newStr);
    }
    public static int countLet(String word, String let) {
        int count = 0;
        for(int i = 0; i < word.length(); i++) {
            if(word.substring(i, i+1).equals(let)) {
                count ++;
            }
        }
        return count;
    }
    public static String revString(String word) {
        String reverse = "";
        for(int i = word.length()-1; i >= 0; i--) {
            reverse += word.substring(i, i+1);
        }
        return reverse;
    }
}
