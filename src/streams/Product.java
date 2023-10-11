package streams;

public class Product {
    private String name;
    private Double price;
    private Double score;

    public Product(String name, Double price, Double score) {
        this.name = name;
        this.price = price;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getScore() {
        return score;
    }
}
