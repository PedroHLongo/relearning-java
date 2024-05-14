package fundamentals.exercices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Type the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Type the operator: ");
        String operator = sc.next();

        double result = "+".equals(operator) ? num1 + num2 : 0;
        result = "-".equals(operator) ? num1 - num2 : result;
        result = "*".equals(operator) ? num1 * num2 : result;
        result = "/".equals(operator) ? (double) num1 / num2 : result;
        result = "%".equals(operator) ? num1 % num2 : result;

        System.out.println("Result is: " + result);

    }
}
