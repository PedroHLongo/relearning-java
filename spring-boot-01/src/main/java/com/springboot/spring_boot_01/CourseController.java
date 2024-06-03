package com.springboot.spring_boot_01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getCourses() {
        return Arrays.asList(
                new Course(1L, "Learn AWS", "In28Minutes"),
                new Course(2L, "Learn DevOps", "In28Minutes")
        );
    }
}
