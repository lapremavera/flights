package be.vdab.flights;

import be.vdab.flights.domain.Flight;
import be.vdab.flights.domain.Passenger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

//		String s = ac.getBean("myCoolBean", String.class);
//		System.out.println(s);

		PassengerService ps = ac.getBean(PassengerService.class);
		//ps.getAll();   deze doet hetzelfde als volgende regel
		System.out.println(ps.getAll());

//		PassengerRepository pr = ac.getBean(PassengerRepository.class);
//		pr.findAll();
//		System.out.println(pr.findAll());

		ReservationService rs = ac.getBean(ReservationService.class);
		rs.bookTicketForFlight(new Passenger("Jane","Doe"),new Flight("200"));


	}


}
