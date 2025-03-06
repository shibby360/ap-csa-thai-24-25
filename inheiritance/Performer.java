public class Performer {
    // name age hometown agent
    protected String name; // protected means only class and the children have access
    private int age;
    private String hometown;
    private String agent;
    public Performer(String nm, int a, String h, String ag) {
        name = nm;
        age = a;
        hometown = h;
        agent = ag;
    }
    public Performer() {
        age = -1;
        name = "???";
        hometown = "???";
        agent = "???";
    }
    public void practice() {
        System.out.println(name + " is practicing");
    }
    public void perform() {
        System.out.println(name + " is performing");
    }
    public void setName(String newnm) {
        name = newnm;
    }
    public String getName() {
        return name;
    }
}