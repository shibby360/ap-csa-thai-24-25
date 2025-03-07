import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Performer perf = new Performer("perf", 10, "seattle", "idk");
        Performer bing = new Performer();
        // perf.perform();
        // bing.perform();

        Musician shivank = new Musician("shivank", 20, "san francisco", "idk", "trombone");
        // System.out.println(shivank.getName());

        Comedian vir = new Comedian("vir", 63, "sacramento", "idk");
        vir.addJoke("How do computers eat pizza? \n One bit at a time");
        vir.perform();
        vir.fartNoise();

        // Polymorphism
        Performer jimbo = new Comedian("JIMBOO", 41, "jamtown", "jimbjumbo"); // ts works
        jimbo.perform(); // overriden child methods will be used
        jimbo.fartNoise(); // can't use child's methods, can only use parents mehthods
        ArrayList<Performer> triple = new ArrayList<Performer>(); // acutal situation of polymorphism
        triple.add(vir);
        triple.add(shivank);
        triple.add(perf);
    }
}