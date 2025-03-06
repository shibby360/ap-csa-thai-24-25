public class Student {
    private String name;
    private int age;
    public Student(String nm, int ag) {
        name = nm;
        age = ag;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public void clap() {
        System.out.println(name + " claps!");
    }
    public String toString() {
        return "Hi I'm " + name + ". I'm " + age + " years old.";
    }
}
