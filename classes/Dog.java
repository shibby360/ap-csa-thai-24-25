public class Dog {
    private int happinessLevel;
    private String name;
    private boolean isHungry;
    public Dog(String n, int h, boolean isHunger) {
        happinessLevel = h;
        name = n;
        isHungry = isHunger;
    }
    public int happy() {
        return happinessLevel;
    }
    public String name() {
        return name;
    }
    public boolean isHungry() {
        return isHungry;
    }
    public void setHappy(int happiness) {
        happinessLevel = happiness;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setHunger(boolean hunger) {
        isHungry = hunger;
    }
    public int getHappy() {
        happinessLevel += 5;
        System.out.println(name+" is so happy. "+name+" now has a happiness level of "+happinessLevel);
        return happinessLevel;
    }
}