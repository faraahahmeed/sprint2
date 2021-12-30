package com.example.demo.application;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.Core.Person;
import com.example.demo.Core.Ride;
import com.example.demo.Persistence.ArrayRidesPersistence;
import com.example.demo.Persistence.RidesPersistence;

public class RidesService implements IRidesService {
    private RidesPersistence persistence = new ArrayRidesPersistence();

    @Override
    public boolean add(Ride ride) {
        ride.setId(persistence.getNextId());
        return persistence.add(ride);
    }

    @Override
    public Ride get(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Ride> getAll() {
        return persistence.getAll();
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        return false;
    }

}
