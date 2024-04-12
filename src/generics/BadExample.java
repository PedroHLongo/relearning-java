package generics;

public class BadExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.put(2.3);

        // sometimes casting is bad, could lead to exceptions
        Double thing = (Double) box.open();
        System.out.println(thing);
    }
}
