package streams.match;

import streams.reduce.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchExample {
    public static void main(String[] args) {
        final Student student1 = new Student("Pedro", 7.4);
        final Student student2 = new Student("Ana", 9.0);
        final Student student3 = new Student("Julia", 9.9);

        List<Student> students = Arrays.asList(student1, student2, student3);

        Predicate<Student> approved = student -> student.getGrade() >= 7.5;
        Predicate<Student> approvedWithPerfectGrade = student -> student.getGrade() == 10;

        System.out.println(students.stream().allMatch(approved));
        System.out.println(students.stream().anyMatch(approved));
        System.out.println(students.stream().noneMatch(approvedWithPerfectGrade));

    }
}
