public class StringCompareTo {
    public static void main(String[] args) {
        System.out.println("Hi".compareTo("Yo")); // "Hi" - "Yo"
        // the first two different letters are checked("H" in "Hi", "Y" in "Yo")
        // as for "Hill".ct("Hint"): ("l" for "Hill", "n" for "Hint")

        // if .compareTo is negative, then the second value comes after the first 
        // in ascii table

        // if .compareTo is positive, then the first value comes before the first
        // in ascii table

        System.out.println("Hi".compareTo("Hihello"));
        // if one is longer, but same-ish string, then it gives difference in length
        // "Hi".length() - "Hihello".length()
    }
}
