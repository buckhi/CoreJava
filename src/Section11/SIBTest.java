package Section11;

public class SIBTest {
    public static final String owner;

    static {
        owner ="hai";
        System.out.println("sib test static initial block called");
    }

    public SIBTest() {
        System.out.println("sib constructor called");

    }
    static {
        System.out.println("2nd initial block called");
    }

    public void someMethod() {
        System.out.println("some method called");
    }
}
