package classAndMethods.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapClass {
    public static void main(String[] args) {
        Map<Long, String> users = new HashMap<>();
        users.put(1L, "Pedro");
        users.put(2L, "Ana");
        users.put(3L, "Junin");
        users.put(4L, "Clebin");

        System.out.println("Map size -> " + users.size());
        System.out.println("Values -> " + users);
        System.out.println("Key set -> " + users.keySet());
        System.out.println("Value set -> " + users.values());
        System.out.println("Contains some key -> " + users.containsKey(1L));
        System.out.println("Contains some value -> " + users.containsValue("Ana"));
        System.out.println("Get value from key -> " + users.get(2L));

        System.out.println("Loop through keys:");
        System.out.println(users.keySet());
        for (Long key: users.keySet()) {
            System.out.println(key);
        }

        System.out.println("Loop through values:");
        System.out.println(users.values());
        for (String value: users.values()) {
            System.out.println(value);
        }

        for (Entry<Long, String> entry: users.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
            System.out.println("-----");
        }
    }
}
