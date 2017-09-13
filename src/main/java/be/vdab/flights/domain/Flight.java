package be.vdab.flights.domain;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

    @Entity
    public class Flight {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
       // hoeft niet, want default @Column(nullable = false)
        private Integer id;         //mag niet null zijn
        @Column(unique = true, nullable = false)
        private String number;     //unique
        @Column(nullable = false)
        private String destination;  //mag niet null zijn
        @Column(nullable = false)
        private String departure;    //mag niet null zijn

        public Flight(String number, String departure, String destination) {
            this.number = number;
            this.departure = departure;
            this.destination = destination;
        }

        public Flight() {
        }
        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDeparture() {
            return departure;
        }

        public void setDeparture(String departure) {
            this.departure = departure;
        }

        public Flight(String destination, String departure) {

            this.destination = destination;
            this.departure = departure;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }


