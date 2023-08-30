package oop.inheritance;

public class Ferrari extends Car{
    @Override
    public void speedUp() {
        this.setSpeed(this.getSpeed() + 15);
    }

    @Override
    public void speedDown() {
        if (this.getSpeed() <= 0) {
            System.out.println("Car is stopped.");
            this.setSpeed(0);
        } else {
            this.setSpeed(this.getSpeed() -10);

            if (this.getSpeed() < 0) {
                this.setSpeed(0);
            }
        }
    }
}
