package Section8;

public class Challenge3 {
    public static void main(String[] args) {


        Bank bank = new Bank("national australia bank");

        if (bank.addBranch("adelaide")){
            System.out.println("adelaide created");
        }

        bank.addBranch("adelaide");
        bank.addCustomer("adelaide", "hai", 12.34);
        bank.addCustomer("adelaide", "duc", 123.54);
        bank.addCustomer("adelaide", "kitty", 65.31);

        bank.addBranch("sydney");
        bank.addCustomer("sydney", "bob", 324.42);

        bank.addCustomerTransaction("adelaide","hai",21.45);
        bank.addCustomerTransaction("adelaide","hai",53.23);
        bank.addCustomerTransaction("adelaide","hai",346.34);

        bank.listCustomers("adelaide",true);
        bank.listCustomers("sydney",true);

        if (!bank.addCustomer("melbourne","hai",5.123)) {
            System.out.println("error melbourne brand");
        }

        if (!bank.addBranch("adelaide")) {
            System.out.println("adelaide already exist");
        }

        if (!bank.addCustomerTransaction("adleiad","furgus",34.21)) {
            System.out.println("customer does not exist");
        }



    }
}