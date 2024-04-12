package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstLook {
    public static void main(String[] args) {
        List<String> approveds = Arrays.asList("Name1", "Name2", "Name3");

        System.out.println("Using forEach");
        for (String name : approveds) {
            System.out.println(name);
        }

        System.out.println("\nUsing iterator");
        Iterator<String> iterator = approveds.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing Stream");
        Stream<String> stream = approveds.stream();
        stream.forEach(System.out::println);
    }
}
