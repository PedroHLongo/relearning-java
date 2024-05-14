package oop.composition;

public class Item {
    final private Integer amount;
    final private Product product;

    Item(Integer amount, Product product) {
        this.amount = amount;
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public Product getProduct() {
        return product;
    }
}
