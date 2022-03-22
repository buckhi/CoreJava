package Section11;

public class Main   {
    public static void main(String[] args) {
//        javafx.scene.Node node = null;
//        Node anotherNode =null;
//
//        MyWindow myWindow = new MyWindow("complete java");
//        myWindow.setVisible(true);
//
//        for (int i = 0; i<=10; i++) {
//            System.out.println(Series.nSum(i));
//        }
//
//        for (int i = 0; i<=10; i++) {
//            System.out.println(Series.factorial(i));
//        }
//
//        for (int i = 0; i<=10; i++) {
//            System.out.println(Series.fibonacci(i));
//        }

        String var4 = "this is private to main";
        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("var3 is not accessible here " + innerClass.var3);

//        System.out.println("scope instance private is " + scopeInstance.getPrivateVar());
//        System.out.println(var4);
//        scopeInstance.timesTwo();
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();

    }
}
