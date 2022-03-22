package Section5;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);
        Dog dog = new Dog("White",8,20,2,4,1,20,"Silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
