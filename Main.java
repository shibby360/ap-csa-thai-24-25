public class Main {
    public static void main(String[] args) {
        Dog arhtur = new Dog("Arhtur", 5, true);
        Dog george = new Dog("George", 3, false);
        Dog[] kennel = new Dog[3];
        kennel[0] = arhtur;
        kennel[1] = george;
        kennel[2] = new Dog("muhriz", 8, true);
        for(Dog dog : kennel) {
            if(dog.isHungry()) {
                System.out.println(dog.name() + " was hungry, so I gave " + dog.name() + " food.");
                dog.setHunger(false);
            }
        }
    }
}