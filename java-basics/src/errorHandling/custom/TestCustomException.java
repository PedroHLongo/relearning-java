package errorHandling.custom;

import streams.reduce.Student;

public class TestCustomException {
    public static void main(String[] args) {
        try {
            final Student student = new Student("Pedro", 7.0);
            Validate.student(student);
            Validate.student(null);
        } catch (EmptyStringException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberOutOfRangeException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("End");
    }
}
