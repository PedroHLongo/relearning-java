package com.springboot.spring_boot_02.springdata;

import com.springboot.spring_boot_02.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
