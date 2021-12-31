package com.example.sprint2.ETA;

import com.example.sprint2.ETA.APIManager;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

public class GoogleMapsAPI implements APIManager {
    Random rand = new Random();

    double mylat = rand.nextDouble();
    double mylong = rand.nextDouble();
    double destlat = rand.nextDouble();
    double destlong = rand.nextDouble();

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("https://google-maps-geocoding.p.rapidapi.com/geocode/json?latlng=40.714224%2C-73.96145&language=en"))
            .header("x-rapidapi-host", "google-maps-geocoding.p.rapidapi.com")
            .header("x-rapidapi-key", "AIzaSyCQOq5HPOwbYtuBcLB_WKMLSH_3sqOUDg8")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();

    HttpResponse<String> response;

    {
        try {
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //System.out.println(response.body());



    public void CalculateETA() {
        this.mylat = Math.toRadians(mylat);
        this.mylong = Math.toRadians(mylong);

        this.destlat = Math.toRadians(destlat);
        this.destlong = Math.toRadians(destlong);

        double latDistance = (destlat-mylat);
        double longdistance = (destlong-mylong);

        double final_distance= (longdistance-latDistance)/60;
        System.out.println("The distance between your origin and destination is : " + final_distance + " Kilometeres");
    }
}
