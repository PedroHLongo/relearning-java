package streams.map;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MapExamples {
    public static void main(String[] args) {
        UnaryOperator<Double> multiplyValue = value -> value * 2.43;
        Function<Double, String> formatValuePrecision = value -> String.format("%.2f", value);
        UnaryOperator<String> formatValueToDollar = value -> "$: " + value;

        Stream<Double> values = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);

        Stream<String> valuesMultiplied = values
                .map(multiplyValue)
                .map(formatValuePrecision)
                .map(formatValueToDollar)
                .map(value -> "Total in dollar -> " + value);

        valuesMultiplied.forEach(System.out::println);
    }
}
