package lambdas.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateComposition {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isThreeDigits = num -> num >= 100 && num <= 999;

        System.out.println(isEven.test(32));

        System.out.println(isEven.and(isThreeDigits).test(320));
        System.out.println(isEven.and(isThreeDigits).test(1000));
        System.out.println(isEven.and(isThreeDigits).test(999));

        System.out.println(isEven.or(isThreeDigits).test(100));
        System.out.println(isEven.or(isThreeDigits).test(101));
    }
}
