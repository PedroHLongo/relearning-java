package com.springboot.spring_boot_02.jpa;

import com.springboot.spring_boot_02.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(final Course course) {
        entityManager.merge(course);
    }

    public Course findById(final Long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(final Long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }
}
