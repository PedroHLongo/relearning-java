package lambdas.functionalinterfaces;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FinanceChallenge {
    public static void main(String[] args) {
        PersonalAccount myAccount = new PersonalAccount("123312", "123123", 0.0);
        final Double waterBill = 100.00;
        final Double rentPrice = 1300.00;
        Function<PersonalAccount, Double> addSalary = currentBalance -> myAccount.getBalance() + 3000.00;
        UnaryOperator<Double> payingWaterBill = currentBalance -> currentBalance - waterBill;
        UnaryOperator<Double> payingRent = currentBalance -> currentBalance - rentPrice;
        Function<Double, String> roundSalary = salary -> String.format("%.2f", salary);
        UnaryOperator<String> formatSalary = salary -> "R$" + salary;

        System.out.println(addSalary.apply(myAccount));
        System.out.println(addSalary.andThen(payingRent).apply(myAccount));
        System.out.println(addSalary.andThen(payingRent).andThen(payingWaterBill).apply(myAccount));
        System.out.println(addSalary.andThen(payingRent).andThen(payingWaterBill.andThen(roundSalary)).apply(myAccount));
        System.out.println(addSalary.andThen(payingRent).andThen(payingWaterBill.andThen(roundSalary).andThen(formatSalary)).apply(myAccount));
    }
}
