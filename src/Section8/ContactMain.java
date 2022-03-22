package Section8;//package Section8;
//
//import java.util.Scanner;
//
//public class ContactMain {
//    private static Scanner scanner = new Scanner(System.in);
//    private static MobilePhone mobilePhone = new MobilePhone("0987654321");
//
//    public static void main(String[] args) {
//        boolean quit = false;
//        startPhone();
//        printActions();
//        while (!quit) {
//            System.out.println("\n enter action: ");
//            int action = scanner.nextInt();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\n shut down");
//                    quit = true;
//                    break;
//                case 1:
//                    mobilePhone.printContacts();
//                    break;
//                case 2:
//                    addNewContact();
//                    break;
//                case 3:
//                    updateContact();
//                    break;
//                case 4:
//                    removeContact();
//                    break;
//                case 5:
//                    queryContact();
//                    break;
//                case 6:
//                    printActions();
//                    break;
//
//            }
//
//        }
//
//    }
//
//    private static void addNewContact() {
//        System.out.println("enter new name: ");
//        String name = scanner.nextLine();
//        System.out.println("enter number: ");
//        String phone = scanner.nextLine();
//        Contact newContact = Contact.createContact(name, phone);
//        if (mobilePhone.addNewContact(newContact)) {
//            System.out.println("new contact added " + name + "phone " + phone);
//
//        } else {
//            System.out.println("cannot add " + name + " because already exist");
//        }
//    }
//
//    private static void updateContact() {
//        System.out.println(" enter contact name: ");
//        String name = scanner.nextLine();
//        Contact existingRec = mobilePhone.queryContact(name);
//        if (existingRec == null) {
//            System.out.println("contact not found");
//            return;
//
//        }
//        System.out.println("enter new contact name");
//        String newName = scanner.nextLine();
//        System.out.println("enter new phone number: ");
//        String newNumber = scanner.nextLine();
//        Contact newContact = Contact.createContact(newName, newNumber);
//        if (mobilePhone.updateContact(existingRec, newContact)) {
//            System.out.println("succesfully updated");
//
//        } else {
//            System.out.println("error in updating");
//        }
//    }
//
//    private static void removeContact() {
//        System.out.println(" enter contact name: ");
//        String name = scanner.nextLine();
//        Contact existingRec = mobilePhone.queryContact(name);
//        if (existingRec == null) {
//            System.out.println("contact not found");
//            return;
//
//        }
//
//        if (mobilePhone.removeContact(existingRec)) {
//            System.out.println("successfully deleted");
//        } else {
//            System.out.println("cannot delete");
//        }
//
//    }
//
//    private static void queryContact() {
//        System.out.println(" enter contact name: ");
//        String name = scanner.nextLine();
//        Contact existingRec = mobilePhone.queryContact(name);
//        if (existingRec == null) {
//            System.out.println("contact not found");
//            return;
//
//        }
//        System.out.println("name " + existingRec.getName() + " phone number is " + existingRec.getPhone());
//    }
//
//    private static void startPhone() {
//        System.out.println("starting phone...");
//    }
//
//    private static void printActions() {
//        System.out.println("\n available actions: \n press");
//        System.out.println("0 to shut down\n" +
//                "1 to print contacts\n" +
//                "2 to add new contact\n" +
//                "3 to update existing contact\n" +
//                "4 to remove contact\n" +
//                "5 query if contact exist\n" +
//                "6 to print list of actions");
//        System.out.println("choose ur action: ");
//
//
//    }
//}
