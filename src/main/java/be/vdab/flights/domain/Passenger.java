package be.vdab.flights.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket>tickets = new ArrayList<>();

    private String firstname;

    private String lastname;

    private int frequentFlyer;

    public String fullname;

    public String getId() {
        return getId();
    }

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.frequentFlyer = 0;
    }

    public Passenger() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public String getFullname() {
        return getFirstname() + " " + getLastname();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
//        if(!ticket.getPassenger().equals(this)) {
//            ticket.setPassenger(this);
//        }
    }
}
