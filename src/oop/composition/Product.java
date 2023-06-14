package oop.composition;

public class Product {
    private String name;
    private Double price;

    Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
}
