package generics;

public class GenericsExample {
    public static void main(String[] args) {
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.put(2.0);

        Double thing = doubleBox.open();
        System.out.println(thing);

        GenericBox<String> doubleBox2 = new GenericBox<>();
        doubleBox2.put("Hello");

        String thing2 = doubleBox2.open();
        System.out.println(thing2);

        // inheritance with generics
        IntegerBox integerBox = new IntegerBox();
        integerBox.put(1);

        System.out.println(integerBox.open());
    }
}
