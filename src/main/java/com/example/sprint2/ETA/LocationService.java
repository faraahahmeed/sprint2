package com.example.sprint2.ETA;

import com.example.sprint2.ETA.APIManager;
import com.example.sprint2.ETA.GoogleMapsAPI;
import com.example.sprint2.ETA.Haversine;

public class LocationService {
        static int counter = 0;
        APIManager api;

        public int trackcalls(){
                counter ++;
                return counter;
        }
        public void Calculate(){
                if (counter<5){
                        api = new GoogleMapsAPI();
                }
                else if(counter>5){
                        api = new Haversine();
                }
                api.CalculateETA();
        }
}
