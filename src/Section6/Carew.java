package Section6;

public class Carew extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public void changeCurrentGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car set current gear chang to" + this.currentGear);
    }

    public Carew(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeVelocity(int speed,int diretion) {
        move(speed, diretion);
        System.out.println("car change velocity " + speed + "direction" +diretion);
    }

    @Override
    public void stop() {
        super.stop();
    }
}
