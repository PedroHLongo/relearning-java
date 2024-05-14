package streams.reduce;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().reduce((number, accumulator) -> accumulator += number).ifPresent(System.out::println);
    }
}
