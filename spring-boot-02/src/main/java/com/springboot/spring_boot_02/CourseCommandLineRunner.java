package com.springboot.spring_boot_02;

import com.springboot.spring_boot_02.jdbc.CourseJdbcRepository;
import com.springboot.spring_boot_02.jpa.CourseJpaRepository;
import com.springboot.spring_boot_02.springdata.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository jdbcRepository;

    @Autowired
    private CourseJpaRepository jpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository springDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        final Course springBootCourse = new Course(1L, "Learn spring boot", "In28Minutes");
        final Course springBootFramework = new Course(2L, "Learn spring framework", "In28Minutes");

        jpaRepository.insert(springBootCourse);
        jpaRepository.insert(springBootFramework);

        System.out.println("Insert ok");

        jpaRepository.deleteById(springBootCourse.getId());

        System.out.println(jpaRepository.findById(2L));

        final Course springDataCourse1 = new Course(3L, "Learn spring data jpa", "In28Minutes");
        final Course springDataCourse2 = new Course(4L, "Learn spring data jpa2", "In28Minutes");

        springDataJpaRepository.save(springDataCourse1);
        springDataJpaRepository.save(springDataCourse2);

        springDataJpaRepository.delete(springDataCourse1);
    }
}
