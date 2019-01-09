package org.fasttrackit;

/**
 * Hello world!
 *
 */

public class App {
    public static void main( String[] args ) {

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        AutoVehicle autoVehicle = new AutoVehicle(engine);

        new Car(engine);

        Vehicle vehicle = new Vehicle();
        double distance = vehicle.accelerate(99.9, 0.5);


//        //declaring a variable and instantiating a Car object
//        //this is also called initializing a variable
//        Car firstCompetitor = new Car(new Engine());
//        firstCompetitor.setName("Dacia");
//        firstCompetitor.setColour("black");
//        firstCompetitor.doorCount = 5;
//        firstCompetitor.setMileage(9.5);
//
//        //local variables are variable declared inside a method
//        //they don't receive default values
//
//        Engine firstEngine = new Engine();
//        firstEngine.manufacturer = "Renault";
//
//        //sout prints a message yo the console
//        System.out.println(firstEngine.manufacturer);
//
//        firstCompetitor.engine = firstEngine;
//
//        firstCompetitor.engine.manufacturer = "BMW";
//
//        System.out.println(firstEngine.manufacturer);
//        System.out.println(firstCompetitor.engine.manufacturer);
//
//
//        double traveledDistance = firstCompetitor.accelerate(100, 30);
//        System.out.println("Traveled distance"+ traveledDistance);
//
//
        Vehicle vehicle = new Vehicle();

        Vehicle.applicationTotalNumaberOfVehicles = 1;

        System.out.println("Total from vehicle 1: "+ vehicle.applicationTotalNumaberOfVehicles);

        Vehicle vehicle2 = new Vehicle();

        Vehicle2.applicationTotalNumaberOfVehicles = 2;

        System.out.println("Total from vehicle 2: "+ vehicle2.applicationTotalNumaberOfVehicles);

        System.out.println("Total from vehicle 1: "+ vehicle.applicationTotalNumaberOfVehicles);


    }
}
