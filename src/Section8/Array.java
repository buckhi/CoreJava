package Section8;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myI = getI(5);
        for (int i = 0; i < myI.length; i++) {
            System.out.println("element " + i + " typed value was " + myI[i]);
        }
        System.out.println("the average is " + getA(myI));

    }

    public static int[] getI(int number) {
        System.out.println("Enter " + number + " value.\r");
        int[] value = new int[number];

        for (int i = 0; i < value.length; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static double getA(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
