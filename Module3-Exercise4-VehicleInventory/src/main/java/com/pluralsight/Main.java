package com.pluralsight;
import java.util.Scanner;


public class Main {
static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        /*

       --- HAD TO USE CHATGPT TO HELP FOR THIS ONE ---
       --- NOTE TO SELF PRACTICE USING ARRAY OBJECTS ---

         */



        Vehicle[] cars = new Vehicle[20];

        cars[0] = new Vehicle(101121, "Ford Explorer", "Red", 45_000, 13_500);
        cars[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60_000, 11_000);
        cars[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50_000, 9_700);
        cars[3] = new Vehicle(101124, "Honda Civic", "White", 70_000, 7_500);
        cars[4] = new Vehicle(101125, "Subaru Outback", "Green", 55_000, 14_500);
        cars[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30_000, 16_000);
        int numCars = 6;

int userInput = 0;
    while (userInput != 6) {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1 - List all vehicles");
        System.out.println("2 - Search by make/model");
        System.out.println("3 - Search by price range");
        System.out.println("4 - Search by color");
        System.out.println("5 - Add a vehicle");
        System.out.println("6 - Quit");
        System.out.print("Enter your command: ");

        userInput = scanner.nextInt();
        scanner.nextLine();

        switch (userInput) {
            case 1:
                Vehicle.listVehicles(cars,numCars);
                break;
            case 2:
                Vehicle.searchMakeModel(cars,numCars);
                break;
            case 3:
                Vehicle.searchPriceRange(cars,numCars);
                break;
            case 4:
                Vehicle.searchByColor(cars,numCars);
                break;
            case 5:
                numCars = Vehicle.addVehicle(cars,numCars);
                break;
            case 6:
                System.out.println("Exiting...");
                Thread.sleep(500);
                System.out.println("Bye!");
                return;
            default:
                System.out.println("invalid input");
        }
    }




    }










}