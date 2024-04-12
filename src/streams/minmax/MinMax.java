package streams.minmax;

import streams.reduce.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        final Student student1 = new Student("Pedro", 7.4);
        final Student student2 = new Student("Ana", 9.0);
        final Student student3 = new Student("Julia", 9.9);

        List<Student> students = Arrays.asList(student1, student2, student3);


        final Comparator<Student> gradeComparator = (studentA, studentB) -> {
            if (studentA.getGrade() > studentB.getGrade()) return 1;
            if (studentA.getGrade() < studentB.getGrade()) return -1;
            return 0;
        };

        System.out.println(students.stream().max(gradeComparator).get().getName());
        System.out.println(students.stream().min(gradeComparator).get().getName());

    }
}
