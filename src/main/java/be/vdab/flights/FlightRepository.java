package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class FlightRepository {
    @PersistenceContext
    private EntityManager em;

    public Flight ReadById(int id) {
        System.out.println("Flight wordt gelezen via id");
        return new Flight();
    }
    public void save (Flight f) {
        em.persist(f);

    }
}
