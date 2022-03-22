package Section7;

public class OOP {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "sausage", 3.36, "white");
        double price = hamburger.itemHam();
        hamburger.addHamAddition("tomato", 0.27);
        hamburger.addHamAddition1("lettuce", 0.23);
        hamburger.addHamAddition2("sauce", 0.99);
        price = hamburger.itemHam();
        System.out.println("total price is " + price);

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 23.4);
        healthyBurger.addHealthAddition("egg", 5.23);
        healthyBurger.addHealthAddition1("chilly", 1.23);

        System.out.println(healthyBurger.itemHam());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamAddition("henlo",12.3);
        db.itemHam();

    }
}
