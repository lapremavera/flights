package be.vdab.flights;


import be.vdab.flights.domain.Passenger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class PassengerRepository {

    @PersistenceContext
    private EntityManager em;

    public PassengerRepository() {
        System.out.println("Passenger repository wordt aangemaakt");

    }


    public Passenger readById(int Id) {
        System.out.println("Passenger wordt gelezen bij Id");
        return em.find(Passenger.class, Id);
    }

    public void update (Passenger p) {
        em.merge(p);
    }

    public void deleteById (int Id) {
        Passenger p = em.getReference(Passenger.class, Id);
        em.remove(p);
    }

    public void save (Passenger p) {
//        em.getTransaction().begin();      dit doe je als je geen @Transactional hebt
//        em.getTransaction().commit();
        em.persist(p);      // zo ga je zorgen dat het gesaved wordt in de db


    }
}
