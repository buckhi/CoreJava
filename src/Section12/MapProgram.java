package Section12;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        if (languages.containsKey("java")) {
            System.out.println("java already exists");
        } else {
            languages.put("java", "a complied high level, object-oriented, platform independent language");
            System.out.println("java added successfully");

        }

        languages.put("java", "a complied high level, object-oriented, platform independent language");
        languages.put("python", "an interpreted, object oriented, high level programming language");
        languages.put("algol", "an algorithmic language");
        languages.put("lisp", "therein lines madness");
        System.out.println(languages.put("basic", "beginners all purposes symbolic instruction code"));

        if (languages.containsKey("java")) {
            System.out.println("java is already in the map");
        } else {
            languages.put("java", "this course is about java");
        }

        System.out.println("============================================");

//        languages.remove("lisp");
        if (languages.remove("algol", "an algorithmic language")) {
            System.out.println("algol removed");
        } else {
            System.out.println("algol not remove, key value pair not found");
        }

        if (languages.replace("lisp", "therein lines madness", "a functional programming language with imperative features")) {
            System.out.println("lisp replaced");
        } else {
            System.out.println(" lisp is not replaced");
        }
            System.out.println(languages.replace("scala", "this will not be added"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
