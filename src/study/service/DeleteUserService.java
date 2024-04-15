package study.service;

import study.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;

public class DeleteUserService {
    public static void main(String[] args) {
        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-class");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        final User user = entityManager.find(User.class, 1L);

        if (Objects.nonNull(user)) {
            entityManager.getTransaction().begin();
            entityManager.remove(user);
            entityManager.getTransaction().commit();
        }



        entityManager.close();
        entityManagerFactory.close();
    }
}
