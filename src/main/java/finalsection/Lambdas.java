package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        Function<String, String> uppercaseName = String::toUpperCase;
        Function<String, String> uppcaseName2 = name -> {
            if(name.isBlank()) throw new IllegalStateException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> uppercaseName3 = (name, age) -> {
            if(name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        // System.out.println(uppercaseName.apply("dumilde matos"));

        System.out.println(uppercaseName3.apply("Dumilde", 23));

    }
}
