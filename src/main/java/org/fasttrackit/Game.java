package org.fasttrackit;

public class Game {

    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;

    public void start() {
        Car car1 = new Car("Dacia");
        car1.setColor("red");
        car1.setDoorCount(3);
        car1.setMileage(7.5);
        car1.setFuelLevel(50);

        Engine engine1 = new Engine();
        engine1.setManufacturer("Renault");

        car1.setEngine(engine1);

        Car car2 = new Car("Ford");
        car2.setColor("black");
        car2.setDoorCount(2);
        car2.setMileage(8.2);
        car2.setFuelLevel(47);

        Engine engine2 = new Engine();
        engine2.setManufacturer("Ford");

        car2.setEngine(engine2);

        Truck truck1 = new Truck("MAN");
        truck1.setColor("red");
        truck1.setMileage(10.3);
        truck1.setFuelLevel(65);

        truck1.setEngine(engine2);

        firstCompetitor = car1;
        secondCompetitor = car2;

        System.out.println(car1);
        car1.accelerate(7.2, 6.9);
        System.out.println(truck1);
        truck1.accelerate(7.2, 6.9);


    }

    public Vehicle getFirstCompetitor() {
        return firstCompetitor;
    }

    public void setFirstCompetitor(Vehicle firstCompetitor) {
        this.firstCompetitor = firstCompetitor;
    }

    public Vehicle getSecondCompetitor() {
        return secondCompetitor;
    }

    public void setSecondCompetitor(Vehicle secondCompetitor) {
        this.secondCompetitor = secondCompetitor;
    }
}
