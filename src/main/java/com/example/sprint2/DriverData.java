package com.example.sprint2;

import java.util.ArrayList;
import java.util.List;

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
