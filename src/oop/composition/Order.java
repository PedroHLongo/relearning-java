package oop.composition;

import java.util.List;

public class Order {
    final private List<Item> items;

    Order(List<Item> items) {
        this.items = items;
    }

    public void addNewItem(Item item) {
        this.items.add(item);
    }

    public Double getOrderTotalAmount() {
        double sum = 0.0;
        for(Item item: items) {
            sum += item.getAmount() * item.getProduct().getPrice();;
        }

        return sum;
    }
}
