package streams.filter;

public class Product {
    private String name;
    private Double price;
    private Double score;
    private Double shippingFee;
    private Integer discount;

    public Product(String name, Double price, Double score) {
        this.name = name;
        this.price = price;
        this.score = score;
    }

    public Product(String name, Double price, Double score, Double shippingFee, Integer discount) {
        this.name = name;
        this.price = price;
        this.score = score;
        this.shippingFee = shippingFee;
        this.discount = discount;
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

    public Double getShippingFee() {
        return shippingFee;
    }

    public Integer getDiscount() {
        return discount;
    }
}
