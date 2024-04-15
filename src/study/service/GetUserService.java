package study.service;

import study.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetUserService {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-class");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        User user = entityManager.find(User.class, 1L);
        System.out.println(user);

        entityManager.close();
        entityManagerFactory.close();
    }
}
