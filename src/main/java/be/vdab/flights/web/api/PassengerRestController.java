package be.vdab.flights.web.api;

import be.vdab.flights.PassengerRepository;
import be.vdab.flights.domain.Passenger;
import be.vdab.flights.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/passenger")
public class PassengerRestController {

    @Autowired
    PassengerRepository pr;

    @RequestMapping(method = RequestMethod.GET, path = "all", produces = "application/json")
    public List<Passenger> allPassengers() {
        return pr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{pid}", produces = "application/json")
    public Passenger getById(@PathVariable("pid")int id) {
        return pr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/api/passenger/{pid}")
    public void deleteById(@PathVariable("pid")int id) {
        pr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/xml")
    public ResponseEntity<Passenger> create(@RequestBody Passenger input) {
        if (input.getId() !=null) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);

    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/xml")
    public ResponseEntity<Passenger> update(@RequestBody Passenger input) {
        if (input.getId() ==null) {
            return new ResponseEntity<Passenger>(HttpStatus.BAD_REQUEST);
        }
        pr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }


}