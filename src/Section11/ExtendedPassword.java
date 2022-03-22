package Section11;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = decryptedPassword;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("saving password as " + this.decryptedPassword);
//    }

}
