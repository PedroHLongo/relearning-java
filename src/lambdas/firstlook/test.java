package lambdas.firstlook;

public class test {
    public static void main(String[] args) {
        Calculus sum = new Sum();
        System.out.println(sum.execute(2, 3));

        Calculus multiply = new Multiply();
        System.out.println(multiply.execute(2, 3));
    }
}
