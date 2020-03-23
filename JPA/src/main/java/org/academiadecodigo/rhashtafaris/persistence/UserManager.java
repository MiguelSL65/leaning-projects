package org.academiadecodigo.rhashtafaris.persistence;

import org.academiadecodigo.rhashtafaris.persistence.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;

public class UserManager {

    private EntityManagerFactory emf;

    public UserManager() {
        this.emf = Persistence.createEntityManagerFactory("test");
    }

    public void insertUser(User user) {

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    public User findById(Integer id) {

        EntityManager em = emf.createEntityManager();

        try {

            return em.find(User.class, id);

        } finally {

            if (em != null) {
                em.close();
            }
        }
    }

    public User saveOrUpdate (User user) {

        EntityManager em = emf.createEntityManager();

        try {

            em.getTransaction().begin();

            user.setName("Miguel");
            user.setId(1);
            user.setEmail("mail@miguel.com");
            user.setPassword("hello");

            User savedUser = em.merge(user);

            em.getTransaction().commit();

            return savedUser;

        } catch (RollbackException ex) {

            em.getTransaction().rollback();
            return null;

        } finally {

            if (em != null) {
                em.close();
            }
        }
    }

    public void remove(int id) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.remove(em.find(User.class, id));

            em.getTransaction().commit();

        } catch (RollbackException e) {

            em.getTransaction().rollback();
        } finally {

            if (em != null) {
                em.close();
            }
        }
    }

    public void closeEmf() {

        emf.close();
    }
}
