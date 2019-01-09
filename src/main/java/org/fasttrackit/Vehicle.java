package org.fasttrackit;

public class Vehicle {

    public static int applicationTotalNumaberOfVehicles = 1;

    private String name;
    private String colour;
    private double mileage;
    private long totalKm;

    public Vehicle(){
        aplicationTotalNumberVehicles++

    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " accelerated with " + speed + " km/h for " + durationInHours + " hours. ");

        double distance = speed * durationInHours;
        System.out.println("Traveled distance" + distance);
        return distance;
    }

    //method overloading
    public double accelerate(double speed) {

        return accelerate(speed,1);


    public String getName() { return name; }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public long getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(long totalKm) {
        this.totalKm = totalKm;
    }
}