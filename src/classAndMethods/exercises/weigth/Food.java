package classAndMethods.exercises.weigth;

public class Food {
    private String name;
    private Double weight;

    public Food(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Double getWeight() {
        return this.weight;
    }
}
