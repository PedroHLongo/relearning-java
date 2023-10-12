package streams.filter;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FilterSecondExercise {
    public static void main(String[] args) {

        Predicate<Product> freeShipping = product -> product.getShippingFee() == 0;
        Predicate<Product> discountBiggerThan30 = product -> product.getDiscount() >= 30;
        Function<Product, String> message = product -> "The product " + product.getName() + " has free shipping and " + product.getDiscount() + "% discount!";

        List<Product> products = List.of(
                new Product("TV", 400.90, 80.0, 0.0, 29),
                new Product("Iphone", 345.51, 74.0, 40.99, 31),
                new Product("Monitor", 340.78, 67.0, 0.0, 33),
                new Product("Mouse", 150.50, 75.1, 0.0, 41),
                new Product("Keyboard", 210.34, 80.2, 10.84, 10)
        );

        products.stream()
                .filter(freeShipping)
                .filter(discountBiggerThan30)
                .map(message)
                .forEach(System.out::println);
    }
}
