package Section5;

public class Fish extends Animal {
    private int grills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int grills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.grills = grills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }
    private void muscle() {

    }
    private void backfin() {

    }
    private void swim(int speed) {
        muscle();
        backfin();
        super.move(speed);

    }
}
