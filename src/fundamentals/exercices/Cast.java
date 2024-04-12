package fundamentals.exercices;

import java.util.Scanner;

public class Cast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type the first value: ");
        String value1 = sc.nextLine().replace(',', '.');
        System.out.print("Type the second value: ");
        String value2 = sc.nextLine().replace(',', '.');
        System.out.print("Type the third value: ");
        String value3 = sc.nextLine().replace(',', '.');

        Double salary1 = Double.parseDouble(value1);
        Double salary2 = Double.parseDouble(value2);
        Double salary3 = Double.parseDouble(value3);

        double average = (salary1 + salary2 + salary3) / 3;

        System.out.printf("Average of salary is $ %.2f", average);

        sc.close();
    }
}
