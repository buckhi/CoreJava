package Section7;

public class DeluxeBurger extends Hamburger{
    @Override
    public void addHamAddition(String name, double price) {
        System.out.println("cant add addition to deluxe");
    }

    @Override
    public void addHamAddition1(String name, double price) {
        System.out.println("cant add addition to deluxe");
    }

    @Override
    public void addHamAddition2(String name, double price) {
        System.out.println("cant add addition to deluxe");
    }

    @Override
    public void addHamAddition3(String name, double price) {
        System.out.println("cant add addition to deluxe");
    }

    public DeluxeBurger() {
        super("deluxe", "chicken", 12.2, "yellow");
        super.addHamAddition("chips",1.23);
        super.addHamAddition1("drink",3.53);


    }
}
