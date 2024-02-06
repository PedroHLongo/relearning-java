package generics;

import java.util.*;

public class KeysValues<K extends Number, V> {
    private final Set<KeyValue<K, V>> items = new HashSet<>();

    public void add(K key, V value) {
        if (key == null) return;

        final KeyValue<K, V> keyValue = new KeyValue<>(key, value);

        if (items.contains(keyValue)) {
            items.remove(keyValue);
        }

        items.add(keyValue);
    }

    public V getValue(K key) {
        if (key == null) return null;

        Optional<KeyValue<K, V>> optional = items.stream()
                .filter(k -> k.getKey().equals(key))
                .findFirst();

        return optional.isPresent() ? optional.get().getValue() : null;
    }
}
