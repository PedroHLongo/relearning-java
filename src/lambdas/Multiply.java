package lambdas;

public class Multiply implements Calculus{
    @Override
    public Double execute(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }
}
