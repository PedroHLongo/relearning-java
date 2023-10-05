package lambdas.functionalinterfaces;

public class PersonalAccount {
    private String accountNumber;
    private String creditCardNumber;
    private Double balance;

    public PersonalAccount(String accountNumber, String creditCardNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
