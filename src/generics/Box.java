package generics;

public class Box {
    private Object thing;

    public Object open() {
        return this.thing;
    }

    public void put(Object thing) {
        this.thing = thing;
    }
}
