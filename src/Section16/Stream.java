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

//        bingoNumber.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s) -> System.out.println(s));

        bingoNumber.stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G")).sorted()
                .forEach(System.out::println);

        java.util.stream.Stream<String> ioNumberStream = java.util.stream.Stream.of("I23", "I45", "I676", "I89");
        java.util.stream.Stream<String> inNumberStream = java.util.stream.Stream.of("N23", "N41", "I66", "I39");
        java.util.stream.Stream<String> concatStream = java.util.stream.Stream.concat(ioNumberStream, inNumberStream);
        System.out.println("===============================");
        System.out.println(concatStream.distinct().peek(System.out::println).count());


    }
}
