package lambdas.functionalinterfaces.binary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryExample {
    public static void main(String[] args) {
        BinaryOperator<Double> mean = (number1, number2) -> (number1 + number2) / 2;

        System.out.println(mean.apply(9.8, 5.7));

        BiFunction<Double, Integer, String> greaterThan7WithPlus = (meanValue, plus) ->
                meanValue + plus >= 7 ? "Greater than 7" : "Less than 7";

        System.out.println(greaterThan7WithPlus.apply(mean.apply(9.8, 5.7), 1));
        System.out.println(greaterThan7WithPlus.apply(mean.apply(7.0, 4.0), 1));
    }
}
