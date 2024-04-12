package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class MapExercise {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        UnaryOperator<String> invertString = value -> {
            StringBuilder builder = new StringBuilder();
            builder.append(value);
            builder.reverse();

            return new StringBuilder(value).reverse().toString();
        };

        Function<String, Integer> stringBinaryToInteger = value -> Integer.parseInt(value, 2);

        List<Integer> convertedNumbers = numbers.stream()
                .map(Integer::toBinaryString)
                .map(invertString)
                .map(stringBinaryToInteger)
                .collect(Collectors.toList());

        convertedNumbers.forEach(System.out::println);
    }
}
