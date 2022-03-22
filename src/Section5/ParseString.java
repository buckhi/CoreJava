package Section5;

public class ParseString {
    public static void main(String[] args) {
        String string = "2018.123";
        System.out.println("numberasstring=" +string);

        double numb = Double.parseDouble(string);
        System.out.println(numb);

        string+=1;
        numb+=1;
        System.out.println(string);
        System.out.println(numb);
    }
}
