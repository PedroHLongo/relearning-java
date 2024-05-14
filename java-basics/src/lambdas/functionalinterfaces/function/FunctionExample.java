package lambdas.functionalinterfaces.function;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> oddOrEven =
                number -> number % 2 == 0 ? "Even" : "odd";

        System.out.println(oddOrEven.apply(33));
        System.out.println(oddOrEven.apply(32));

        Function<String, String> resultIs =
                value -> "The result is: " + value;

        Function<String, String> exclamationPoints =
                value -> value + "!!!";

        String finalResult = oddOrEven
                .andThen(resultIs)
                .andThen(exclamationPoints)
                .apply(32);

        System.out.println(finalResult);
    }
}
