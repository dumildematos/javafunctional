package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println("With Functional: " + increment2);
        Function<Integer, Integer> addByOneAndMultipyBy10 = incrementByOneFunction.andThen(multiplyBy10);
        System.out.println(addByOneAndMultipyBy10.apply(1));
        System.out.println("----------------");
        System.out.println("BiFunction");
        System.out.println(incrementByOneMultiplyBiFunction.apply(1, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment (int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static  int incrementByOneAndMultiply (int numbIncrement, int numbMultiplyBy) {
        return (numbIncrement + 1) * numbMultiplyBy;
    }
}
