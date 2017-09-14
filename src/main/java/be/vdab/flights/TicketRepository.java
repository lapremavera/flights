package be.vdab.flights;


import be.vdab.flights.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {



}


//import be.vdab.flights.domain.Flight;
//import be.vdab.flights.domain.Passenger;
//import be.vdab.flights.domain.Ticket;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//@Transactional
//public class TicketRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    public Ticket persist (Passenger passenger, double price, Flight flight) {
//
//
//        System.out.println("Ticket wordt gepersisteerd");
//        return null;
//
//    }
//
//    public void save (Ticket t){
//        em.persist(t);
//
//    }