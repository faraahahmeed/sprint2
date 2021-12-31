package com.example.sprint2.Storage;

import com.example.sprint2.Application_Logic.Trip_System.Driver;

import java.util.ArrayList;

public class DriverData {

    private static DriverData database ;
    public ArrayList <Driver> driverdb=new ArrayList<>();
    public DriverData(){}

    public static DriverData getinstance(){
        if(database==null){
            database=new DriverData();
        }
        return database;
    }

    public boolean adddriver(Driver d){
        driverdb.add(d);
        return true;
    }

    public ArrayList <Driver> getdrivers(){
        return driverdb;
    }

    public void delete(Driver d) {
        driverdb.remove(d);
    }

}
