package Section9;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("shiba");
        dog.breathe();
        dog.eat();

        Parrot parrot= new Parrot("ring neck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("emperor");
        penguin.fly();
    }
}
