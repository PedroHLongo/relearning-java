package generics;

public class KeysValuesTest {
    public static void main(String[] args) {
        KeysValues<Integer, String> classResult = new KeysValues<>();

        classResult.add(1, "Ana");
        classResult.add(2, "Pedro");
        classResult.add(3, "Julia");
        classResult.add(2, "Test");

        System.out.println(classResult.getValue(1));
    }
}
