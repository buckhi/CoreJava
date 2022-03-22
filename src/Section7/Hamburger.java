package Section7;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String additionName;
    private double additionPrice;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addHamAddition(String name, double price) {
        this.additionName = name;
        this.additionPrice = price;
    }

    public void addHamAddition1(String name, double price) {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addHamAddition2(String name, double price) {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addHamAddition3(String name, double price) {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public double itemHam() {
        double hamPrice = this.price;
        System.out.println(this.name + " ham " + " on a " + this.breadType + " roll " + " with " + this.meat + " price is " + this.price);
        if (this.additionName != null) {
            hamPrice += this.additionPrice;
            System.out.println("added " + this.additionName + " for an extra " + this.additionPrice);
        }
        if (this.additionName1 != null) {
            hamPrice += this.additionPrice1;
            System.out.println("added " + this.additionName1 + " for an extra " + this.additionPrice1);
        }
        if (this.additionName2 != null) {
            hamPrice += this.additionPrice2;
            System.out.println("added " + this.additionName2 + " for an extra " + this.additionPrice2);
        }
        if (this.additionName3 != null) {
            hamPrice += this.additionPrice3;
            System.out.println("added " + this.additionName3 + " for an extra " + this.additionPrice3);
        }

        return hamPrice;

    }


}
