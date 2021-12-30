package com.example.demo.Persistence;

import java.util.List;

import com.example.demo.Core.Ride;

public interface RidesPersistence {

    public int getNextId();

    boolean add(Ride ride);

    Ride get(int id);

    List<Ride> getAll();

    boolean delete(int id);
}