package Section7;

public class HealthyBurger extends Hamburger {
    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtraName1;
    private double healthyExtraPrice1;

    public HealthyBurger(String meat, double price) {
        super("healthy", meat, price, "brown");
    }

    public void addHealthAddition(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtraName1 = name;
        this.healthyExtraPrice1 = price;
    }

    @Override
    public double itemHam() {
        double hamPrice = super.itemHam();
        if (this.healthyExtraName != null) {
            hamPrice += this.healthyExtraPrice;
            System.out.println("added " + this.healthyExtraName + " for an extra " + this.healthyExtraPrice);
        }
        if (this.healthyExtraName1 != null) {
            hamPrice += this.healthyExtraPrice1;
            System.out.println("added " + this.healthyExtraName1 + " for an extra " + this.healthyExtraPrice1);
        }
        return hamPrice;
    }
}
