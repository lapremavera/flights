package be.vdab.flights.domain;

import javax.persistence.*;

@Entity
public class Ticket {

    @Column(nullable = false)
    private double price;

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;

 //   private Ticket ticket;

//    public Ticket getTicket() {
//        return ticket;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ticket() {

    }

    public Ticket(int price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        passenger.addTicket(this);
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public double getPrice() {
        return price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }
}
