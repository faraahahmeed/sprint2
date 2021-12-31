package com.example.sprint2;

import java.util.ArrayList;
import java.util.List;

public class PassengerData  {

    private static PassengerData database ;
    public ArrayList <Passenger> passengerdb = new ArrayList<>();
    public PassengerData(){}

    public static PassengerData getinstance(){
        if(database==null){
            database=new PassengerData();
        }
        return database;
    }

    public boolean addPassenger(Passenger p){
        passengerdb.add(p);
        return true;
    }

    public ArrayList <Passenger> getPassengers(){
        return passengerdb;
    }

    public void delete(Passenger p) {
        passengerdb.remove(p);
    }
}




