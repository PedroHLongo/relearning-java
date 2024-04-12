package oop.inheritance;

public class Car {
    private Integer speed;
    private final Integer MAX_SPEED;
    
    public Car(final int maxSpeed) {
        this.speed = 0;
        this.MAX_SPEED = maxSpeed;
    }

    public void setSpeed(final Integer speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void speedUp() {
        if (this.speed + 5 > this.MAX_SPEED) {
            System.out.println("Already at maximum speed.");
        } else {
            this.speed += 5;
        }
    }

    public void speedDown() {
        if (this.speed <= 0) {
            System.out.println("Car is stopped.");
        } else {
            this.speed -= 5;
        }
    }
}
