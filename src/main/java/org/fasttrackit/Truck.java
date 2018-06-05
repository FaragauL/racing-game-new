package org.fasttrackit;

public class Truck extends AutoVehicle {

    private int doorCount;
    private double weight;

    public Truck(String name) {
        super(name);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public double accelerate(double speed, double time) {
        System.out.println("Vehicle" + getName() + "accelerates with " + speed + " for " + time + " seconds.");
        double traveledDistance = speed * time;
        traveledDistance = traveledDistance*2;
        System.out.println("Traveled distance: " + traveledDistance);
        return traveledDistance;
    }

}
