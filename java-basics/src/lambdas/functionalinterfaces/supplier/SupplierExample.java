package lambdas.functionalinterfaces.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<List<String>> names = () -> Arrays.asList("Ana", "Pedro", "Julia");

        System.out.println(names.get());
    }
}
