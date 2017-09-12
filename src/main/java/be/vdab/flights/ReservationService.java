package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    @Autowired
    private FlightService flightService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private PassengerService passengerService;

    public Ticket bookTicketForFlight (Passenger passenger, Flight flight) {
        System.out.println("Ticket wordt geboekt");
        return ticketService.create(flight, 120d, passenger);


    }

}
