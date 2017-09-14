package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket create (Flight flight, double price, Passenger passenger) {
        System.out.println("Ticket wordt gecreëerd");

        Ticket t = new Ticket((int)price);
        t.setPassenger(passenger);
        t.setFlight(flight);

        return ticketRepository.save(t);

    }
}
