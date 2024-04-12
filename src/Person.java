public class Person {
    private Integer code;
    private String name;

    public Person(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Code: " + this.code + "\n" + "Name: " + this.name + "\n";
    }
}
