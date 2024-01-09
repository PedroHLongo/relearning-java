package streams.others;

import streams.reduce.Student;

import java.util.Arrays;
import java.util.List;

public class OthersMethods {
    public static void main(String[] args) {
        final Student student1 = new Student("Pedro", 7.4);
        final Student student2 = new Student("Ana", 9.0);
        final Student student3 = new Student("Julia", 9.9);
        final Student student4 = new Student("Pedro1", 7.4);
        final Student student5 = new Student("Ana2", 9.0);
        final Student student6 = new Student("Julia3", 9.9);
        final Student student7 = new Student("Pedro", 7.4);
        final Student student8 = new Student("Ana", 9.0);
        final Student student9 = new Student("Julia", 9.9);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8, student9);

        students.stream().distinct().forEach(System.out::println);

        // 'pagination'
        System.out.println("\n");
        students.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\n");
        students.stream()
                .distinct()
                .takeWhile(student -> student.getGrade() >= 7.0)
                .forEach(System.out::println);
    }
}
