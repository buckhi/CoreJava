package Section7;

public class Car1 extends Vehicle{
    private int doors;
    private int engineCapacity;

    public Car1(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}
