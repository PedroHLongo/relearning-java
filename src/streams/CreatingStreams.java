package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) {
        // First way of creating Streams - using Stream interface 'of'
        Stream<String> programingLanguages = Stream.of("Java", "JavaScript", "Python\n");
        programingLanguages.forEach(System.out::println);

        // Second way of creating Streams - from array
        String[] moreLanguages = { "Lua", "Shell", "Go\n"};
        Stream.of(moreLanguages).forEach(System.out::println);

        // Third way of creating Streams - from Arrays class
        Arrays.stream(moreLanguages).forEach(System.out::println);
        Arrays.stream(moreLanguages, 1, 2).forEach(System.out::println);

        // Fourth way of creating Streams - from Collections
        List<String> anotherLanguages = Arrays.asList("C", "PHP", "Kotlin\n");
        anotherLanguages.stream().forEach(System.out::println);
        anotherLanguages.parallelStream().forEach(System.out::println);

        // Infinity Stream
        //Stream.generate(() -> "a").forEach(System.out::println);
        // Infinity Stream with initial value
        //Stream.iterate(0, n -> n+1).forEach(System.out::println);
    }
}
