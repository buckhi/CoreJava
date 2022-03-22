package Section4;

public class Exercise {
    public static void main(String[] args) {
        checkNum(5);
        checkNum(-10);
    }

    public static void checkNum(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        } else if (number==0) {
            System.out.println("zero");
        }
    }


}
