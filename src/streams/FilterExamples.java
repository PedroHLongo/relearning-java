package streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExamples {
    public static void main(String[] args) {
        Function<Integer, Boolean> isEven = value -> value % 2 == 0;

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //List<Integer> list = numbers.filter(isEven::apply).collect(Collectors.toList());
        numbers.filter(isEven::apply).forEach(System.out::println);
    }
}
