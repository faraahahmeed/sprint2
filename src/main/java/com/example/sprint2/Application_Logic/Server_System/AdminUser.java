package com.example.sprint2.Application_Logic.Server_System;

import com.example.sprint2.Application_Logic.Trip_System.Driver;

import java.util.ArrayList;

public class AdminUser {
    private Driver driver;

    boolean output ;
    ArrayList<Driver> pending=new ArrayList<>();
    public boolean VerifyRegistrations(Driver driver) {
        for (int i = 0; i < pending.size(); i++) {
            if (pending.get(i).getDrivinglicense() == null
                    || driver.getNationalid().length() < 14)
            {output=false;
            System.out.println("Your account is Verfied and you can logIn now!...");}
            else
                output=true;

        }
        return output;
    }
    public void addpending(Driver d){
        pending.add(d);
    }
    /*public void ListRegistrations(Driver driver)
        {
            return driver;
        }*/
 }
