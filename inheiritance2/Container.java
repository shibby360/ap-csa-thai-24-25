import java.util.ArrayList;
public class Container {
    private String name;
    private int capacityLevel;
    protected ArrayList<String> things = new ArrayList<String>();
    public Container() {
        name = "unknown";
        capacityLevel = 0;
    }
    public Container(String name, int capacityLevel) {
        this.name = name;
        this.capacityLevel =  capacityLevel;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacityLevel() {
        return this.capacityLevel;
    }
    public void setCapacityLevel(int capacityLevel) {
        this.capacityLevel = capacityLevel;
    }
    public void insert(String thing, int capLvl) {
        this.things.add(thing);
        this.capacityLevel += capLvl;
        System.out.println("Yuo've added " + thing + " to the container, the capacity is now " + this.capacityLevel + "% full");
    }
    public String itemsInside() {
        return this.things.toString();
    }
    public String toString() {
        return "This is a " + this.name + " and it is " + this.capacityLevel + "% full, and it has these things in it: " + itemsInside();
    }
    // dump method to fix polymorphism issue
    public void dump() {
        this.things.clear();
        this.setCapacityLevel(0);
        System.out.println("you dumped everything from your container, that wasn't very nice");
    }
}