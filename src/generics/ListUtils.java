package generics;

import java.util.List;

public class ListUtils {
    public static Object getLast1(List<?> list) {
        return list.get(list.size() -1);
    }


    // set the function's return type to be the same as the parameter type.
    public static <T> T getLast2(List<T> list) {
        return list.get(list.size() -1);
    }
}
