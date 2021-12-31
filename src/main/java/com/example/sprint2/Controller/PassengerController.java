package com.example.sprint2.Controller;

import java.util.List;


import com.example.sprint2.Storage.PassengerData;
import com.example.sprint2.Application_Logic.Trip_System.Passenger;
import com.example.sprint2.Application_Logic.Trip_System.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {

User user = new Passenger();
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
        user.signup(p);
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
