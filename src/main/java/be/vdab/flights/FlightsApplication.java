package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

		PassengerRepository pr = ac.getBean(PassengerRepository.class);

		Passenger p = new Passenger("jimi", "Hen");
		pr.save(p);

		Passenger q = new Passenger("Jane", "Doe");
		pr.save(q);

		TicketRepository tr = ac.getBean(TicketRepository.class);

		Ticket t = new Ticket(200);
		t.setPassenger(p);
		tr.save(t);

		FlightRepository fr = ac.getBean(FlightRepository.class);

		Flight f = new Flight("BE500", "Brussel","Bali" );
		fr.save(f);


	}


}
