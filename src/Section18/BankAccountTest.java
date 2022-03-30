package Section18;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.BeforeClass
    public static void beforeClass() {
        System.out.println("execute this " + count++);
    }

    @org.junit.Before
    public void setup() {
        account = new BankAccount("hai", "nguyen", 1000.00, BankAccount.CHECKING);
        System.out.println("running test...");
    }


    @org.junit.Test
    public void deposit() throws Exception {
        double balance = account.deposit(2000.00, true);
        assertEquals(3000.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw_branch (){
        double balance = account.withdraw(600.00, true);
        assertEquals(400,balance,0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch() {
            account.withdraw(600.00, false);
            fail("should have throw illegal exception");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(2000.00, true);
        assertEquals(3000.00, account.getBalance(), 0);

    }

    @org.junit.Test
    public void getBalance_withdraw() {
        account.withdraw(1000.00, true);
        assertEquals(0, account.getBalance(), 0);

    }

    @org.junit.Test
    public void isChecking_true() {
        assertTrue(account.isChecking(), "the account is not a checking account");
    }


    @org.junit.AfterClass
    public static void afterClass() {
        System.out.println("oh noooo " + count++);
    }

    @org.junit.After
    public void teardown() {
        System.out.println("count = " + count++);
    }

}