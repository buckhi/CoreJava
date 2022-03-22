package Section6;

public class Constructor {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public Constructor() {
        this("12312",2.42,"kitty","address","phone");
        System.out.println("Empty account");
    }

    public Constructor(String number, double balance, String name, String email, String phone) {
        System.out.println("para set");
        this.number=number;
        this.balance=balance;
        this.name=name;
        this.phone=phone;
        this.email=email;

    }

    public Constructor(String name, String email, String phone) {
        this("213123",232.0,name,email,phone);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("deposit is made with" + amount);
    }

    public void withdraw(double amount2) {
        if (this.balance - amount2 < 0) {
            System.out.println("only available with " + this.balance);
        } else {
            this.balance -= amount2;
            System.out.println("processing " + amount2 + " from " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
