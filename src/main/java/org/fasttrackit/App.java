package org.fasttrackit;


public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();


        // Array utility exemple
/*
        String text = "100,00 RON";
        String[] result = text.split(" ");

        for (String resultElement : result) {
            System.out.println(resultElement);
        }

        String priceAsString = result[0];
        System.out.println("Price as string before replece:" + priceAsString);

        double price = Double.parseDouble(priceAsString);

        System.out.println("Parsed price:" + price);
        */
    }

}
