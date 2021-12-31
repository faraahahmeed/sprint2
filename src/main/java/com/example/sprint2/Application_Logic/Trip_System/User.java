package com.example.sprint2.Application_Logic.Trip_System;

import com.example.sprint2.Application_Logic.Trip_System.Driver;
import com.example.sprint2.Application_Logic.Trip_System.Passenger;
import com.example.sprint2.Application_Logic.Trip_System.Ride;

import java.util.Scanner;
public class User
{
    private String username;
    private String email;
    private String password;
    private String mobilenum;
    private String ID;
    Scanner input = new Scanner(System.in);

    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getMobilenum() {
        return mobilenum;
    }

    public String getId() {
        return ID;
    }


    public void ViewHistory(){
        Ride ride = new Ride();
       ride.RideHistory(ride);
    }
     public void signup(Driver driver) {
         System.out.println("Enter Username, Email ,Password and Mobile Number");
         String username = input.next();
         String email = input.next();
         String password = input.next();
         String mobilenum = input.next();
         System.out.println("Enter License and National ID ");
         String licence = input.next();
         String nationalId = input.next();
     }

    public void signup(Passenger p) {
        System.out.println("Enter Username, Email ,Password and Mobile Number");
        String username = input.next();
        String email = input.next();
        String password = input.next();
        String mobilenum = input.next();
    }

    public  void logIn(Driver driver){
        System.out.println("Enter Username");
        username=input.nextLine();
        System.out.println("Enter password");
        password =input.next();
        driver.checkloginFordriver();
    }
    public  void logIn(Passenger passenger){
        System.out.println("Enter Username");
        username=input.nextLine();
        System.out.println("Enter password");
        password =input.next();
        passenger.checkloginForpassenger();
    }

}
