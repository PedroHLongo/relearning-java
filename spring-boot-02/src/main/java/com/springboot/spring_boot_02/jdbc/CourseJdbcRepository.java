package com.springboot.spring_boot_02.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate template;

    final private static String INSERT_QUERY = """ 
        insert into course (id, name, author)
        values(1, 'Learn Spring boot', 'in28minutes')
    """;

    public void insert() {
        template.update(INSERT_QUERY);
    }
}
