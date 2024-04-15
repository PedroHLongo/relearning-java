package study.service;

import study.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class GetUsersService {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-class");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        final String jpql = "SELECT u FROM User u";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        query.setMaxResults(5);

        final List<User> users = query.getResultList();

        users.forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
    }
}
