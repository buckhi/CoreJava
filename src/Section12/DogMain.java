package Section12;

public class DogMain {
    public static void main(String[] args) {
        Labrador rover = new Labrador("rover");
        Dogg rover2 = new Dogg("rover");

        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));


    }
}
