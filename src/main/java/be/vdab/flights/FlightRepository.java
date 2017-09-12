package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import org.springframework.stereotype.Repository;

@Repository
public class FlightRepository {
    public Flight ReadById(int id) {
        System.out.println("Flight wordt gelezen via id");
        return new Flight();
    }
}
