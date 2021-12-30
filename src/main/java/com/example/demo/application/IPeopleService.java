package com.example.demo.application;

import java.util.List;
import com.example.demo.Core.Person;

public interface IPeopleService {
    boolean add(Person person);

    Person get(String name);

    List<Person> getAll();

    boolean delete(String name);

    boolean update(Person person);
}
