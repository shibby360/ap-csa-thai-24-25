public class Musician extends Performer {
    private String instrument;
    public Musician(String nm, int a, String h, String ag, String i) {
        super(nm,a,h,ag); // calls Performer constructot
        instrument = i;
    }
    public String getInstr() {
        return instrument;
    }
    public void setInstr(String i) {
        instrument = i;
    }
    @Override //this is debugging tool that will override
    // not needed, will essentially check for misspelling(if misspelled, no method to override)
    public void perform() {
        System.out.println(name + " whips out their " + instrument);
    }
}