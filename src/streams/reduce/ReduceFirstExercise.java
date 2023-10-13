package streams.reduce;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;

public class ReduceFirstExercise {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Pedro", 7.5),
                new Student("Ana", 10.0),
                new Student("Julia", 4.2),
                new Student("John", 5.6),
                new Student("Doe", 3.1)
        );

        Predicate<Student> approved = student -> student.getGrade() >= 7;
        Function<Student, Double> getGrades = Student::getGrade;
        BinaryOperator<Double> sumGradesFromApproved = (grade, sum) -> grade + sum;


        students.stream()
                .filter(approved)
                .map(getGrades)
                .reduce(sumGradesFromApproved);

    }
}
