package Section5;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight,int eyes,int legs, int tail,int teeth, String coat ) {
        super(name, 1, 1, size, weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    @Override
    public void eat() {
        System.out.println("dog eat called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("dog chew");
    }

    public void walk() {
        System.out.println("dog walk called");
        super.move(4);
    }
private void moveLegs(int speed) {
    System.out.println("dog move leg called");
}
    @Override
    public void move(int speed) {
        System.out.println("dog move called");
        moveLegs(speed);
        super.move(speed);
    }

    public void run() {
        System.out.println("dog run called");
        move(10);
    }



}
