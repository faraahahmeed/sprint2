package com.example.demo.application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Person;

public class PeopleService implements IPeopleService {
    private static List<Person> peopleRepo = new ArrayList<Person>();

    @Override
    public boolean add(Person person) {
        return peopleRepo.add(person);
    }

    @Override
    public Person get(String name) {
        for (Person person : peopleRepo) {
            if (person.getName().equals(name)) {
                return person;
            }
        }

        return null;
    }

    @Override
    public List<Person> getAll() {
        return peopleRepo;
    }

    @Override
    public boolean delete(String name) {
        for (Person person : peopleRepo) {
            if (person.getName().equals(name)) {
                return peopleRepo.remove(person);
            }
        }

        return false;
    }

    @Override
    public boolean update(Person p) {
        for (Person person : peopleRepo) {
            if (person.getName().equals(p.getName())) {
                person.setAge(p.getAge());
                return true;
            }
        }

        return false;
    }

}
