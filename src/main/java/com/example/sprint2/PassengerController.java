package com.example.sprint2;

import java.util.List;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {


    /*public PeopleController() {
        peopleService = new PeopleService();
    }*/
    PassengerData data = new PassengerData();
    @GetMapping("/passenger")
    public List<Passenger> getAll() {
        return data.getPassengers();
    }

    /*@GetMapping("/people/{name}")
    public Person get(@PathVariable String name) {
        return peopleService.get(name);
    }*/

    @PostMapping("/passenger/add")
    public boolean add(@RequestBody Passenger p) {
        return data.addPassenger(p);
    }

    /*@PutMapping("/people")
    public boolean update(@RequestBody Person p) {
        return peopleService.update(p);
    }*/

    /*@DeleteMapping("/people/{name}/delete")
    public boolean update(@PathVariable String name) {
        return peopleService.delete(name);
    }*/
}
