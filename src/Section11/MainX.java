package Section11;

public class MainX {
    public static void main(String[] args) {
//        X x = new X(new Scanner(System.in));
//        x.x();

        Account haiaccount = new Account("Hai");
        haiaccount.deposit(2000);
        haiaccount.withdraw(500);
        haiaccount.withdraw(-200);
        haiaccount.deposit(-20);
        haiaccount.calculateBalance();
        haiaccount.balance=5000;
        System.out.println("balance is " +haiaccount.getBalance());
        haiaccount.transactions.add(4000);
        haiaccount.calculateBalance();
    }
}
