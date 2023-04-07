package fundamentals.exercices;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        final int DIFF = 32;
        final double DIVISION = 5.0/9.0;
        int fahrenheit = 15;

        double celsius = (fahrenheit - DIFF) * DIVISION;

        System.out.println("The result is " + celsius);
    }
}
