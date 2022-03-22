package Section11;

public class Password {
    private static final int key =612312;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);

    }

    private int encryptDecrypt(int password) {
        return password ^ key;

    }
    public void storePassword() {
        System.out.println("saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("welcome");
            return true;
        } else {
            System.out.println("cant log in ");
            return false;
        }
    }
}
