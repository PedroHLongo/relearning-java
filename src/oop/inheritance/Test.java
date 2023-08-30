package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Ferrari ferrari = new Ferrari();
        Vectra vectra = new Vectra();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + ferrari.getSpeed());

        ferrari.speedUp();
        vectra.speedUp();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + ferrari.getSpeed());

        ferrari.speedDown();
        vectra.speedUp();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + ferrari.getSpeed());

        ferrari.speedDown();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + ferrari.getSpeed());

        ferrari.speedDown();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + ferrari.getSpeed());
    }
}
