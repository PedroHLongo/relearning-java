package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(1);
        Ferrari ferrari = new Ferrari(310);
        Vectra vectra = new Vectra(200);

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + vectra.getSpeed());

        ferrari.speedUp();
        vectra.speedUp();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + vectra.getSpeed());

        ferrari.speedDown();
        vectra.speedUp();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + vectra.getSpeed());

        ferrari.speedDown();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + vectra.getSpeed());

        ferrari.speedDown();
        vectra.speedDown();

        System.out.println("Ferrari current speed -> " + ferrari.getSpeed());
        System.out.println("Vectra current speed -> " + vectra.getSpeed());

        for(int i = 0; i <= 39; i++) {
            vectra.speedUp();
        }

        System.out.println("------------");
        System.out.println("Vectra current speed -> " + vectra.getSpeed());
        vectra.speedUp();
        System.out.println("Vectra current speed -> " + vectra.getSpeed());
    }
}
