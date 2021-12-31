package com.example.sprint2.Controller;

import java.util.List;

import com.example.sprint2.Application_Logic.Trip_System.Ride;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideController {
    //private IRidesService service = new RidesService();
    Ride data = new Ride();

    @PostMapping("/rides/add")
    public Boolean add(@RequestBody Ride ride) {
        return data.save(ride);
    }

    @GetMapping("/rides")
    public List<Ride> getAll() {
        return data.getRides();
    }

    @GetMapping("/rides/{id}")
    public Ride get(@PathVariable int id) {
        return data.get(id);
    }

    /*@DeleteMapping("/rides/{id}/delete")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }*/
}
