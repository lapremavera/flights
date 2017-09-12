package be.vdab.flights;


import be.vdab.flights.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PassengerService {
    @Autowired
    PassengerRepository pr;

    public List <String> getAll() {
        System.out.println("Get all inside passenger service");
        return pr.findAll();
    }

    public Passenger findById(int Id) {
        System.out.println("Passenger wordt gevonden via de Id");
        return new Passenger();
    }

}
