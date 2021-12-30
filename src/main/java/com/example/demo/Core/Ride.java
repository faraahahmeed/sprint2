package com.example.demo.Core;

public class Ride {
    private int id;
    private String source;
    private String distination;

    public Ride() {
    }

    public Ride(String source, String distination) {
        this.source = source;
        this.distination = distination;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getSource() {
        return this.source;
    }

    public String getDistination() {
        return this.distination;
    }
}
