package org.fasttrackit;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static final int FUEL_LEVEL = 80;
    public static final int LOWER_MILEAGE_BOUND = 3;
    public static final int UPPER_MILEAGE_BOUNF = 20;
    public static final int UPPER_MILEAGE_BOUND = UPPER_MILEAGE_BOUNF;
    public static final double TRACK_LENGHT = 12000;
    private List<Vehicle> competitorsList = new ArrayList<>();
    private Vehicle firstCompetitor;
    private Vehicle secondCompetitor;
    private Vehicle[] competitors = new Vehicle[10];

    public void start() {

        initCompetitors();
        determineWinner();


//        Car car1 = new Car("Dacia");
//        car1.setColor("red");
//        car1.setDoorCount(3);
//        car1.setMileage(7.5);
//        car1.setFuelLevel(50);
//
//        Engine engine1 = new Engine();
//        engine1.setManufacturer("Renault");
//
//        car1.setEngine(engine1);
//
//        Car car2 = new Car("Ford");
//        car2.setColor("black");
//        car2.setDoorCount(2);
//        car2.setMileage(8.2);
//        car2.setFuelLevel(47);
//
//        Engine engine2 = new Engine();
//        engine2.setManufacturer("Ford");
//
//        car2.setEngine(engine2);
//        competitors[0] = car1;
//        competitors[1] = car2;
//
//
//        for (int i = 0; i < competitors.length; i++) {
//            System.out.println("Iteration number" + i);
//            System.out.println(competitors[i]);
//        }
//        for  (Vehicle vehicle : competitors) {
//            System.out.println(vehicle);
//        }
//
//        Truck truck1 = new Truck("MAN");
//        truck1.setColor("red");
//        truck1.setMileage(10.3);
//        truck1.setFuelLevel(65);
//
//        truck1.setEngine(engine2);
//
//        firstCompetitor = car1;
//        secondCompetitor = car2;
//
//        System.out.println(car1);
//        car1.accelerate(7.2, 6.9);
//        System.out.println(truck1);
//        truck1.accelerate(7.2, 6.9);
//

    }

    private void determineWinner() {
        boolean winnerUnknown = true;


        while (winnerUnknown) {

            for (int i = 0; i < competitorsList.size(); i++) {
                System.out.println("Enter acceleration speed for player" + (i + 1));
                int accelerationSpeed = readAndCheckInt();
                double traveledDistance = competitorsList.get(i).accelerate(accelerationSpeed);
                competitorsList.get(i).setTraveledDistance(competitorsList.get(i).getTraveledDistance()+traveledDistance);

                if (competitorsList.get(i).getTraveledDistance() >= TRACK_LENGHT) {
                    System.out.println("Congrats! Player " + (i + 1) + " won the game.");
                    winnerUnknown = false;
                    break;
                }
            }
        }
    }

    private void initCompetitors() {
        System.out.println("Enter number of players.");

        int playerNumber = readAndCheckInt();

        System.out.println("Starting game with " + playerNumber + " players");

        for (int i = 1; i <= playerNumber; i++) {
            String name = readCarStringProperty(i, "Enter car name for player ");
            String color = readCarStringProperty(i, "Enter car color for player");

            Vehicle vehicle = new Car(name);
            vehicle.setColor(color);
            vehicle.setMileage(ThreadLocalRandom.current().nextDouble(LOWER_MILEAGE_BOUND, UPPER_MILEAGE_BOUND));
            vehicle.setFuelLevel(FUEL_LEVEL);

            System.out.println("Vehicle for player " + i + ":" + vehicle);
            competitorsList.add(vehicle);
        }
    }

    private int readAndCheckInt() {
        Scanner scanner1 = new Scanner(System.in);
        int number;
        try {
            number = scanner1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
            number = readAndCheckInt();
        }
        return number;
    }

    private String readCarStringProperty(int i, String s) {
        System.out.println(s + i);
        Scanner scanner2 = new Scanner(System.in);
        return scanner2.nextLine();
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
