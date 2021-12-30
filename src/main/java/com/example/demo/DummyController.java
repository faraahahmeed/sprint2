package com.example.demo;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Person;
import com.example.demo.application.IPeopleService;
import com.example.demo.application.PeopleService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException.NotFound;

@RestController
public class DummyController {
    List<Person> list = new ArrayList<Person>();

    @PostMapping("/dummy/add")
    public Boolean add(@RequestBody Person p) {
        return list.add(p);
    }

    @GetMapping("/dummy/{name}")
    public Person get(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person;
            }
        }

        return null;
    }

    @GetMapping("/dummy")
    public List<Person> getAll() {
        return list;
    }

    @DeleteMapping("/dummy/{name}/delete")
    public boolean delete(@PathVariable String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return list.remove(person);
            }
        }

        return false;
    }
}