package lambdas.functionalinterfaces.unary;

import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> plusTwo = number -> number + 2;
        UnaryOperator<Integer> multiplyByTwo = number -> number * 2;
        UnaryOperator<Integer> power = number -> number * number;

        System.out.println(plusTwo.andThen(multiplyByTwo).andThen(power).apply(2));
        System.out.println(plusTwo.compose(multiplyByTwo.compose(power)).apply(2));
    }
}
