package Section7;

class Car {
    private boolean engine;
    private int cyliners;
    private String name;
    private int wheel;


    public Car(int cyliners, String name) {
        this.cyliners = cyliners;
        this.name = name;
        this.wheel = 4;
        this.engine = true;
    }

    public int getCyliners() {
        return cyliners;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> star engine";
    }

    public String accelerate() {
        return "car -> accelerate";
    }

    public String brake() {
        return " car -> brake";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "misu -> star engine";
    }

    @Override
    public String accelerate() {
        return "mitsu -> accelerate";
    }

    @Override
    public String brake() {
        return "misu -> brake";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return  getClass().getSimpleName() +"holden -> star engine";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() +" accelerate";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +" brake";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> star engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> brake";
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Car car = new Car(8, "base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "outlander vrw");
        System.out.println(mitsubishi.accelerate());

        Ford ford = new Ford(6, "Ford falcon");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "Holden Golden");
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }



}

