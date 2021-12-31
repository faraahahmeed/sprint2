package com.example.sprint2.Controller;

import java.util.List;


import com.example.sprint2.Storage.DriverData;
import com.example.sprint2.Application_Logic.Server_System.AdminUser;
import com.example.sprint2.Application_Logic.Trip_System.Driver;
import com.example.sprint2.Application_Logic.Trip_System.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    //List<Person> list = new ArrayList<Person>();
    DriverData data = new DriverData();
    User user = new Driver();
    AdminUser adminUser = new AdminUser();
    Driver driver = new Driver();
    @PostMapping("/driver/signup")
    public Boolean add(@RequestBody Driver d) {
        driver.signup(d);
        /*System.out.println("Enter License and National ID ");
        String licence = input.next();
        String nationalId = input.next();
        driver.setNationalid(nationalId);
        driver.setDrivinglicense(licence);*/
        System.out.println("wait till an admin verify Your Registeration");
        adminUser.addpending(driver);
        adminUser.VerifyRegistrations(driver);
        System.out.println("successfully verified " +
                "you can log in now");
        return data.adddriver(d);
    }

    @PostMapping("/driver/login")
    public void log(@RequestBody Driver d) {
        driver.logIn(d);
        /*System.out.println("Enter License and National ID ");
        String licence = input.next();
        String nationalId = input.next();
        driver.setNationalid(nationalId);
        driver.setDrivinglicense(licence);
        System.out.println("wait till an admin verify Your Registeration");
        adminUser.pending.add(driver);
        adminUser.VerifyRegistrations(driver);
        System.out.println("successfully verified " +
                "you can log in now");
        return data.adddriver(d);*/
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
