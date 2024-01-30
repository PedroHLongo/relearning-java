package generics;

public class GenericBox<T> {

    private T thing;

    public T open() {
        return this.thing;
    }

    public void put(T thing) {
        this.thing = thing;
    }
}
