package oop.polimorfism;

public class Dinner {
    public static void main(String[] args) {
        Person person = new Person(99.65);

        Rice rice = new Rice(0.2);
        Bean bean = new Bean(0.1);
        System.out.println(person.getWeight());
        person.eat(rice);
        person.eat(bean);

        System.out.println(person.getWeight());

        IceCream iceCream = new IceCream(0.4);
        person.eat(iceCream);

        System.out.println(person.getWeight());
    }
}
