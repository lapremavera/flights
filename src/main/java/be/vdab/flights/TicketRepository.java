package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.stereotype.Repository;

@Repository
public class TicketRepository {

    public Ticket persist (Passenger passenger, double price, Flight flight) {

        System.out.println("Ticket wordt gepersisteerd");
        return null;

    }


 /* public Ticket readById(int id) {
      return new Ticket();




    }
    */

}