package oop.inheritance;

public class Car {
    private Integer speed;

    public Car() {
        this.speed = 0;
    }

    public void setSpeed(final Integer speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        this.speed += 5;
    }

    public void speedDown() {
        if (this.speed <= 0) {
            System.out.println("Car is stopped.");
        } else {
            this.speed -= 5;
        }
    }
}
