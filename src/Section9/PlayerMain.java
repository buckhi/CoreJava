package Section9;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        Player hai = new Player("Hai", 10,15);
        System.out.println(hai.toString());
        saveObject(hai);
        hai.setHitPoints(8);
        System.out.println(hai);
        hai.setWeapon("storm bringer");
        saveObject(hai);
        loadObject(hai);
        System.out.println(hai);

        ISavable werewolf =  new Monster("werewolf" ,20,40);
        System.out.println("Strength = " +((Monster) werewolf).getStrength());
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    public static void saveObject(ISavable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
