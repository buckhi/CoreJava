package Section8;

import java.util.Arrays;

public class ReferenceValue {
    public static void main(String[] args) {
        int myV = 10;
        int anotherV = myV;

        int[] array = new int[5];
        int[] anotherA = array;

        anotherA[0] = 1;
        System.out.println(Arrays.toString(anotherA));
        System.out.println(Arrays.toString(array));

        anotherA = new int[] {4,5,6,7,8};
        modifyA(array);
        System.out.println(Arrays.toString(anotherA));
        System.out.println(Arrays.toString(array));

    }

    private static void modifyA(int[] array1) {
        array1[0] = 2;
        array1 = new int[]{1, 2, 3, 4, 5};
    }
}
