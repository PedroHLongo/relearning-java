package study.service;

import study.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateUserService1 {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-class");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        final User user = entityManager.find(User.class, 3L);
        System.out.println(user);
        user.setName("Ana Julia");
        user.setEmail("anajulia@gmail.com");

        entityManager.merge(user);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
