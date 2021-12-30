package com.example.demo.Persistence;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Ride;

public class ArrayRidesPersistence implements RidesPersistence {

    private static List<Ride> allRides = new ArrayList<Ride>();

    @Override
    public int getNextId() {
        return allRides.size();
    }

    @Override
    public boolean add(Ride ride) {
        return allRides.add(ride);
    }

    @Override
    public Ride get(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return ride;
            }
        }

        return null;
    }

    @Override
    public List<Ride> getAll() {
        return allRides;
    }

    @Override
    public boolean delete(int id) {
        for (Ride ride : allRides) {
            if (ride.getId() == id) {
                return allRides.remove(ride);
            }
        }

        return false;
    }

}