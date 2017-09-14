package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {

   Flight readByNumber(String flightNumber);

   Flight getByDepartureAndDestination (String dep, String des);

    int countFlightByDeparture(String departure);
}


/*
Deze repository kan je vervangen door bovenstaande.

import be.vdab.flights.domain.Flight;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

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
    public Flight querieByFlightNumber (String flightNumber) {
        TypedQuery<Flight> typedQuery = em.createQuery("SELECT f FROM Flight f WHERE f.number = :fn", Flight.class);
        typedQuery.setParameter("fn", flightNumber);
        return typedQuery.getSingleResult();

    }
    public void deleteById (int id) {

    }
    public void readById (Flight f) {

    }
    public void updateById (Flight f) {

    }
    public void createById (Flight f) {

    }
}
*/
