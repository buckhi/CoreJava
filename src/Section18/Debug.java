package Section18;

public class Debug {
    public static void main(String[] args) {
        StringUtilities utilities = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utilities.addChar(sb,'a');
        }
        System.out.println(sb);

        String str  = "abcdefg";
        String result = utilities.upperAndPrefix(utilities.upperAndPrefix(str));
    }
}
