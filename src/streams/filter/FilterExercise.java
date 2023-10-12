package streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterExercise {
    public static void main(String[] args) {
        Predicate<Product> cheapProduct = product -> product.getPrice() <= 345.50;
        Predicate<Product> hasGoodScore = product -> product.getScore() >= 75;
        Function<Product, String> message = product -> "Product " + product.getName() + " has a good score and its cheap. Score: "
                + product.getScore()
                + ". Price: $" + product.getPrice();

        List<Product> products = Arrays.asList(
                new Product("TV", 400.90, 80.0),
                new Product("Iphone", 345.51, 74.0),
                new Product("Monitor", 340.78, 67.0),
                new Product("Mouse", 150.50, 75.1),
                new Product("Keyboard", 210.34, 80.2)
                );

        products.stream().filter(cheapProduct).filter(hasGoodScore).map(message).forEach(System.out::println);
    }
}
