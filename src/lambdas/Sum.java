package lambdas;

public class Sum implements Calculus{
    @Override
    public Double execute(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
