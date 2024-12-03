
public class ArraysNotes {
    public static void main(String[] args) {
        // once an array is made, it's size is fixed
        // you can't change the length
        // data type is also fixed once created

        int[] highScores = new int[7];
        // new integer array with 7 slots

        // when array is made, all slots are filled with
        // // int: 0
        // // double: 0.0
        // // boolean: false
        highScores[3] = 10;
        // change element at index 3 to 10
        
        // sysout(highscores) prints memory address
        /* for(int i = 0; i < highScores.length; i++) {
            System.out.println(highScores[i]);
        } */

        String[] weeks = new String[7];
        // makes array of string called weeks filled with null
        weeks[0] = "Sunday";
        weeks[1] = "Monday";
        /* for(int i = 0; i < weeks.length; i++) {
            if(weeks[i] != null) {
                System.out.println(weeks[i].substring(0,1));
            }
        } */

        String[] foods = {"krabby patty", "kelp fries", "jellyfish jelly"};
        // enhanced for loop
        for(String x : foods) {
            System.out.println(x);
        }
        // cant change elements of array, cant keep track of index
    }
}