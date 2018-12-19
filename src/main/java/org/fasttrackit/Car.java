package org.fasttrackit;

public class Car extends AutoVehicle{

    //instance variables (declared as properties of a class
    //they receive default values (null for objects, 0 for numbers
    //false for booleans)
    String name;
    String colour;
    int doorCount;
    double mileage;
    boolean running;
    long totalKm;
    Engine engine;


    public Car(Engine engine) {
        super(engine);
    }
}
