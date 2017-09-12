package be.vdab.flights;


import be.vdab.flights.domain.Passenger;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PassengerRepository {

    public PassengerRepository() {
        System.out.println("Passenger repository wordt aangemaakt");

    }

    List<String> findAll() {
        List<String> passenger = new ArrayList<>();

        passenger.add("David");
        passenger.add("Daan");
        passenger.add("Dora");
        passenger.add("Dina");
        return passenger;


    }

    public Passenger readById(int Id) {
        System.out.println("Passenger wordt gelezen bij Id");
        return new Passenger();
    }
}
