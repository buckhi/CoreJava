package Section8;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myI = getI(5);
        int[] sorted = sortI(myI);
        printArray(sorted);
    }

    public static int[] getI(int capacity) {
        int[] array = new int[capacity];
        System.out.println("enter " + capacity + " value:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " content " + array[i]);
        }
    }

    public static int[] sortI(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;

                }
            }
        }
        return sortedArray;
    }
}
