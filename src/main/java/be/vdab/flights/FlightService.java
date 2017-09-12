package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight findbyId (int Id) {
        System.out.println("Flight wordt gevonden via Id");
        return new Flight();
    }
}
