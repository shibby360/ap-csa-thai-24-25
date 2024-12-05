import java.util.ArrayList; // YOU HAVE TO IMPORT ARRAYLIST TO USE IT

public class ArrayListNotes {
    public static void main(String[] args) {
        warmUpDec4();
    }
    public static void warmUpDec4() {
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>(); // for arraylist primitive types(int, double, etc.) use wrapper class(Integer, Double, etc..)
        for(int i = 1; i <= 10; i++) {
            intList.add(i);
        }
        System.out.println(intList);
        for(int j = 0; j < 10; j++) {
            for(int i = 0; i < intList.size(); i++) {
                if(intList.get(i) < 5 || intList.get(i) == 8) {
                    intList.remove(i);
                }
            }
        }
        System.out.println(intList);
    }
    public static void notes() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("gay"); // add element
        list.remove(0); // removes index from list
        ArrayList<Student> lineup = new ArrayList<Student>();
        lineup.add(new Student("Shivank", 27));
        lineup.add(new Student("Atishay", 16));
        lineup.add(new Student("Kagan", 16));
        lineup.add(1, new Student("Muhriz", 14)); // muhriz goes into index 1 and shove everything else over
        lineup.remove(0); // all the elements shift down one
        lineup.set(2, new Student("Philip", 15));
        lineup.get(2).clap(); // get element at index 3 and make it clap
        for(int i = 0; i < lineup.size(); i++) {
            System.out.println(lineup.get(i).getName());
        }
        System.out.println(lineup); // this also works to print everything out
        for(Student x : lineup) {
            x.setAge(37);
        }
        System.out.println(lineup);
    }
}
