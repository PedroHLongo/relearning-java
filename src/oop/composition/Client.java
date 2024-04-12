package oop.composition;

import java.util.ArrayList;
import java.util.List;

public class Client {
    final private String name;
    final private List<Order> orders = new ArrayList<>();

    Client(String name) {
        this.name = name;
    }

    public void makeOrder(List<Order> orders) {
        this.orders.addAll(orders);

    }

    public Double getTotalValue() {
        double sum = 0.0;

        for(Order order: orders) {
            sum += order.getOrderTotalAmount();;
        }

        return sum;
    }
}
