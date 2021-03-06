package org.fasttrackit;

public class Vehicle {

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double traveledDistance;
    //demonstrating constants
    public final static String RADIO_CONTROL = "Radio Control";

    public Vehicle(String name) {
        this.name = name;
    }

    public double accelerate(double speed) {
        return accelerate(speed, 60);
    }

    public double accelerate(double speed, double time) {
        if (fuelLevel > 0) {
            System.out.println("Vehicle" + name + "accelerates with " + speed + " for " + time + " seconds.");
            double traveledDistance = speed * time;
            System.out.println("Traveled distance: " + traveledDistance);

            double consumedFuel = mileage * traveledDistance / 100;
            fuelLevel = fuelLevel - consumedFuel;

            return traveledDistance;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
