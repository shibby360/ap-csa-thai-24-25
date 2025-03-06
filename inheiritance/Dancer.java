public class Dancer extends Performer {
    private int shoeSize;
    public Dancer(String nm, int a, String h, String ag, int ss) {
        super(nm,a,h,ag); // calls Performer constructot
        shoeSize = ss;
    }
    public void dance() {
        System.out.println(name + " is dancing");
    }
    public void selectMusic() {
        System.out.println(name + " is selecting music"); 
    }
}