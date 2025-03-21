public class Cup extends Container {
    private String material;
    private boolean broke;
    public Cup() {
        material = "unknown";
        broke = false;
    }
    public Cup(String name, int capacityLevel, String material, boolean broke) {
        super(name, capacityLevel);
        this.material = material;
        this.broke = broke;
    }
    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public boolean getBroke() {
        return this.broke;
    }
    public void setBroke(boolean broke) {
        this.broke = broke;
    }
    public void dump() {
        this.things.clear();
        this.setCapacityLevel(0);
        System.out.println("you dumped everything from your cup, that wasn't very nice");
    }
    public void insert(String thing, int capLvl) {
        this.things.add(thing);
        this.setCapacityLevel(getCapacityLevel() + capLvl);
        if(this.getCapacityLevel() <= 100) {
            System.out.println("Yuo've filled your cup with " + thing + ", the capacity is now " + this.getCapacityLevel() + "% full");
        } else {
            System.out.println("the cup broke :(");
            this.broke = true;
        }
    }
    public String toString() {
        if(this.broke) {
            return "the cup is broke :(";
        } else {
            return super.toString();
        }
    }
}