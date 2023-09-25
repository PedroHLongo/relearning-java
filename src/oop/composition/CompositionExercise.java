package oop.composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionExercise {
    public static void main(String[] args) {
        Client client1 = new Client("Pedro");

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item(2, new Product("RAM Memory", 400.50)));
        items1.add(new Item(1, new Product("RTX 4060", 3500.00)));
        items1.add(new Item(1, new Product("I9", 2100.00)));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(1, new Product("Mouse", 200.80)));
        items2.add(new Item(1, new Product("Keyboard", 450.60)));

        List<Item> items3 = new ArrayList<>();
        items3.add(new Item(5, new Product("Post-it", 10.00)));
        items3.add(new Item(10, new Product("Pen", 2.00)));


        Order order1 = new Order(items1);
        Order order2 = new Order(items2);
        Order order3 = new Order(items3);

        client1.makeOrder(List.of(order1, order2, order3));

        System.out.println("Total - $" + client1.getTotalValue());

    }
}
