package be.vdab.flights.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@Entity
@XmlRootElement
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
/*
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
*/
//    @OneToMany(mappedBy = "passenger", fetch = FetchType.EAGER)
//    private List<Ticket>tickets = new ArrayList<>();

    private String firstname;

    private String lastname;

    private int frequentFlyer;

    public String fullname;
 //   private List<Ticket> tickets;

    @XmlAttribute (name = "id")
    public Integer getId() {
        return this.id;
    }

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.frequentFlyer = 0;
    }

    public Passenger() {
    }

    @XmlAttribute (name = "First")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("abc")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @JsonIgnore
    public int getFrequentFlyer() {
        return frequentFlyer;
    }


    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public String getFullname() {
        return getFirstname() + " " + getLastname();
    }
 //   @JsonIgnore
 //     public List<Ticket>getTickets() {
 //       return tickets;
 //   }



    public void addTicket(Ticket ticket) {
//        tickets.add(ticket);
//        if(!ticket.getPassenger().equals(this)) {
//            ticket.setPassenger(this);
//        }
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", frequentFlyer=" + frequentFlyer +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
