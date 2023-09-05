package oop.polimorfism;

public class Food {
    private Double weight;

    Food(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if(weight >= 0) {
            this.weight = weight;
        }
    }
}