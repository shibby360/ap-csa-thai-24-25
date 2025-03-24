import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Container.getContsMade());
        Container c = new Container("pizza pizza pie", 0);
        c.insert("pepperrrOni", 1);
        c.insert("green peppers", 10);
        c.insert("mushrooms", 15);
        c.insert("olives", 5);
        c.insert("chives", 10);
        Cup c1 = new Cup("scars on broadway", 0, "glass", false);
        ArrayList<Container> myContainers = new ArrayList<Container>();
        myContainers.add(new Container("cute machines", 0));
        myContainers.add(new Cup("babylon", 0, "machinery", false));
        for(Container x : myContainers) {
            x.insert("serious", 50);
            x.dump(); // .dump isn't a method for Container
            // we can fix by adding a method for dump in container
            if(x instanceof Cup) { // check if x was made w/ Cup constructor
                System.out.println( (Cup)(x) ); // cast currContainer to cup
            }
            System.out.println(x);
        }
        System.out.println(Container.getContsMade());
    }
}