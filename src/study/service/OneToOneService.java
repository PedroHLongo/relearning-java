package study.service;

import study.entities.Client;
import study.entities.Seat;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneService {
    public static void main(String[] args) {
        final Seat seat = new Seat("16C");
        final Client client = new Client("Ana", seat);

        final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-class");
        final EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(seat);
        entityManager.persist(client);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
