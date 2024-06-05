package com.springboot.spring_boot_02.jdbc;

import com.springboot.spring_boot_02.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate template;

    final private static String INSERT_QUERY = """ 
        insert into course (id, name, author)
        values(?, ?, ?);
    """;

    final private static String DELETE_QUERY = """
            delete from course where id = ?;
            """;

    final private static String SELECT_QUERY = """
            select * from course where id = ?
            """;

    public void insert(final Course course) {
        template.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(final Course course) {
        template.update(DELETE_QUERY, course.getId());
    }

    public Course findById(final Long id) {
        return template.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
