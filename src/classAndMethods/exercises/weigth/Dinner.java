package classAndMethods.exercises.weigth;

public class Dinner {
    public static void main(String[] args) {
        Person johnDoe = new Person("John Doe", 72.3);
        System.out.println(johnDoe);

        Food rice = new Food("Rice", 0.8);
        Food bean = new Food("Bean", 0.4);

        johnDoe.eat(rice);
        System.out.println(johnDoe);

        johnDoe.eat(bean);
        System.out.println(johnDoe);
    }
}
