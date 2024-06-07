package com.springboot.spring_boot_02.jdbc;

import com.springboot.spring_boot_02.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        final Course springBootCourse = new Course(1L, "Learn spring boot", "In28Minutes");
        final Course springBootFramework = new Course(2L, "Learn spring framework", "In28Minutes");

        repository.insert(springBootCourse);
        repository.insert(springBootFramework);

        System.out.println("Insert ok");

        repository.delete(springBootCourse);

        System.out.println(repository.findById(2L));
    }
}
