package Section8;

import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnArray = readInteger(count);
        int returnMin = findMin(returnArray);

        System.out.println("min = " + returnMin);


    }

    private static int[] readInteger(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;

        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
