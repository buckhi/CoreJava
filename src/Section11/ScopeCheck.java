package Section11;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("scope check created, public var = " + publicVar + " and private var = " + privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }

    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var 3 from outer class " + innerClass.var3);
    }

    public class InnerClass {
        public int var3 = 3;

        public InnerClass() {
            System.out.println("inner class created, private is " +privateVar + " and var 3 is " + var3);

        }

        public void timesTwo() {
            System.out.println("private var is " + privateVar);
            ScopeCheck.this.timesTwo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }

    }

}
