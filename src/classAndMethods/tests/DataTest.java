package classAndMethods.tests;

import classAndMethods.Data;

public class DataTest {
    public static void main(String[] args) {
        Data date = new Data();
        date.day = 17;
        date.month = 7;
        date.year = 2023;
        System.out.println("b");

        System.out.printf("Day: %d, Month: %d, Year: %d", date.day, date.month, date.year);
    }
}
