package lambdas;

public class test2 {
    public static void main(String[] args) {
        Calculus sum = (firstValue, secondValue) -> {
            return firstValue + secondValue;
        };

        System.out.println(sum.execute(2, 3));

        Calculus multiply = (firstValue, secondValue) -> firstValue * secondValue;

        System.out.println(multiply.execute(2, 3));
    }
}
