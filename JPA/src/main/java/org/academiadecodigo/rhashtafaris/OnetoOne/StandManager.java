package org.academiadecodigo.rhashtafaris.OnetoOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.RollbackException;
import java.sql.Statement;

public class StandManager {

    private EntityManagerFactory emf;
    private EntityManager em;

    public StandManager() {
        this.emf = Persistence.createEntityManagerFactory("test");
    }

    public void create(Owner owner) {

        EntityManager em = emf.createEntityManager();

            em.getTransaction().begin();
            em.persist(owner);
            em.getTransaction().commit();
            em.close();
    }

    public Owner findById(int id) {

        EntityManager em = emf.createEntityManager();

        try {

            return em.find(Owner.class, id);

        } finally {

            if (em != null) {
                em.close();
            }
        }
    }

    public Owner saveOrUpdate(Owner owner, Car car) {

        EntityManager em = emf.createEntityManager();

        try {

          em.getTransaction().begin();

          owner.setName("Miguel");
          owner.setId(1);
          owner.setCar(car);

          Owner savedOwner = em.merge(owner);

          em.getTransaction().commit();

          return  savedOwner;

        } catch (RollbackException ex) {

            em.getTransaction().rollback();
            return null;

        } finally {

            if (em != null) {
                em.close();
            }
        }
    }
}
