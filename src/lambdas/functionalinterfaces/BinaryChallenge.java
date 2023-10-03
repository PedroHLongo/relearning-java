package lambdas.functionalinterfaces;

import lambdas.functionalinterfaces.predicate.Product;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryChallenge {
    public static void main(String[] args) {
        Product product = new Product("iPad", 3235.89, 0.13);

        Function<Product, Double> applyDiscount = price -> product.getPrice() * (1 - product.getDiscount());
        UnaryOperator<Double> applyCityFee = price -> price < 2500 ? price : price * 1.085;
        UnaryOperator<Double> applyShippingFee = price -> price < 3000 ? price + 50 : price + 100;
        Function<Double, String> roundPrice = price -> String.format("%.2f", price);
        UnaryOperator<String> formatPrice = price -> "R$" + price;

        System.out.println(applyDiscount.apply(product));
        System.out.println(applyDiscount.andThen(applyCityFee).apply(product));
        System.out.println(applyDiscount.andThen(applyCityFee).andThen(applyShippingFee).apply(product));
        System.out.println(applyDiscount.andThen(applyCityFee).andThen(applyShippingFee).andThen(roundPrice).apply(product));
        System.out.println(applyDiscount.andThen(applyCityFee).andThen(applyShippingFee).andThen(roundPrice).andThen(formatPrice).apply(product));

    }
}
