package generics;

import java.util.Arrays;
import java.util.List;

public class ListUtilsTest {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("JS", "PHP", "Java", "C#");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // without generic method
        String lastLanguage = (String) ListUtils.getLast1(languages);
        System.out.println(lastLanguage);

        Integer lastNumber = (Integer) ListUtils.getLast1(numbers);
        System.out.println(lastNumber);

        // with generic method
        String lastLanguage2 = ListUtils.getLast2(languages);
        System.out.println(lastLanguage2);

        Integer lastNumber2 = ListUtils.getLast2(numbers);
        System.out.println(lastNumber2);

    }
}
