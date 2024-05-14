package lambdas.functionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Product> isExpensive =
                prd -> (prd.getPrice() * (1 - prd.getDiscount())) >= 750;

        Product product = new Product("Notebook", 3989.50, 0.15);

        System.out.println(isExpensive.test(product));
    }
}
