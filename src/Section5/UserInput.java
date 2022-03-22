package Section5;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("enter year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int year = scanner.nextInt();
//            scanner.nextLine();
//
//            System.out.println("enter name: ");
//            String name = scanner.nextLine();
//            int age = 2022 - year;
//
//            if (age >= 0 && age <= 100) {
//                System.out.println(" name is " + name + " and " + age + "yo");
//            } else {
//                System.out.println("Invalid year of birth");
//            }
//
//        } else {
//
//            System.out.println("invalid info");
//
//
//            scanner.close();
//        }

        int counter = 0;
        int sum = 0;
        while (true) {
            // or while(counter<10) {
            int order = counter + 1;
            System.out.println("enter number " + order + " : ");

            boolean anInt = scanner.hasNextInt();
            if (anInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter==10) {
                    break;
                }
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
