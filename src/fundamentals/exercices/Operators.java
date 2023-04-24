package fundamentals.exercices;

public class Operators {
    public static void main(String[] args) {
        boolean job1 = Boolean.FALSE;
        boolean job2 = Boolean.TRUE;
        boolean bought50InchesTV = job1 && job2;
        boolean bought32InchesTV = job1 ^ job2;
        boolean boughtIceCream = bought50InchesTV ^ bought32InchesTV;

        System.out.println("Bought 50 inches TV? " + bought50InchesTV);
        System.out.println("Bought 32 inches TV? " + bought32InchesTV);
        System.out.println("Bought ice cream? " + boughtIceCream);
    }
}
