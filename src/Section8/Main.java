package Section8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Grocery list = new Grocery();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\n press");
        System.out.println("\t 0 - print choice option");
        System.out.println("\t 1 - print list item");
        System.out.println("\t 2 - add item");
        System.out.println("\t 3 - modify item");
        System.out.println("\t 4 - remove item");
        System.out.println("\t 5 - search item");
        System.out.println("\t 6 - quit application");


    }

    public static void addItem() {
        System.out.print("pls enter item: ");
        list.addItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("current item number: ");
        String itemNo = scanner.nextLine();
        System.out.println("enter replacement item: ");
        String newItem = scanner.nextLine();
        list.modifyItem(itemNo, newItem);


    }

    public static void removeItem() {
        System.out.print("enter item number: ");
        String itemNo = scanner.nextLine();
        list.removeItem(itemNo);
    }

    public static void searchItem() {
        System.out.println("search item: ");
        String searchItem = scanner.nextLine();
        if (list.onFile(searchItem)) {
            System.out.println("found " + searchItem + " in list");
        } else {
            System.out.println(searchItem + " not in list");
        }

    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.addAll(list.getList());
        ArrayList<String> nextArray = new ArrayList<>(list.getList());
        String[] myArray = new String[list.getList().size()];
        myArray = list.getList().toArray(myArray);

    }
}
