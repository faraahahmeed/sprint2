package com.example.sprint2;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class DriverController {
    //List<Person> list = new ArrayList<Person>();
    DriverData data = new DriverData();
    @PostMapping("/driver/add")
    public Boolean add(@RequestBody Driver d) {
        return data.adddriver(d);
    }

    /*@GetMapping("/driver/{name}")
    public Driver get(String name) {
        for (Driver driver : list) {
            if (driver.getName().equals(name)) {
                return person;
            }
        }

        return null;
    }*/

    @GetMapping("/driver")
    public List<Driver> getAll() {
        return data.getdrivers();
    }

    /*@DeleteMapping("/driver/{name}/delete")
    public boolean delete(@PathVariable String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return list.remove(person);
            }
        }

        return false;
    }*/
}
