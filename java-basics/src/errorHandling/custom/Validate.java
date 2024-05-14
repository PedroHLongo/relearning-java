package errorHandling.custom;

import streams.reduce.Student;

import java.util.Objects;

public class Validate {

    private Validate() {};

    public static void student(Student student) {
        if (Objects.isNull(student)) {
            throw new IllegalArgumentException("Student can't be null.");
        }

        if (Objects.isNull(student.getName()) || student.getName().trim().isEmpty()) {
            throw new EmptyStringException("name");
        }

        if (student.getGrade() < 0 || student.getGrade() > 10) {
            throw new NumberOutOfRangeException("grade");
        }
    }
}
