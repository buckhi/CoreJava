package Section16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<String> bingoNumber = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G21", "G56", "G26",
                "I42", "I12", "I90",
                "031"
        );

        List<String> gNumbers = new ArrayList<>();

        bingoNumber.forEach(number -> {
            if (number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
                System.out.println(number);
            }
        });

        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        gNumbers.forEach((String s) -> System.out.println(s));

    }
}
