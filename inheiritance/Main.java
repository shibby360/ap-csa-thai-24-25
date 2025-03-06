public class Main {
    public static void main(String[] args) {
        Performer perf = new Performer("perf", 10, "seattle", "idk");
        Performer bing = new Performer();
        perf.perform();
        bing.perform();

        Musician shivank = new Musician("shivank", 15, "san francisco", "idk", "trombone");
        System.out.println(shivank.getName());
    }
}