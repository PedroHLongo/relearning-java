package classAndMethods.exercises.weigth;

public class Person {
    private String name;
    private double weight;

    public Person(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat(Food food) {
        this.weight += food.getWeight();
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
               "Weight: " + this.weight;
    }
}
