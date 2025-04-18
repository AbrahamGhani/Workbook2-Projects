package com.pluralsight;

import java.util.Scanner;

public class Vehicle {

    static Scanner scanner = new Scanner(System.in);



    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometer;
    private float price;

    public Vehicle(long vehicleId, String makeModel, String color, int odometer, float price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

public void printInfo(){
    System.out.println("-----------------------------");
        System.out.println("Make: " + getMakeModel());
        System.out.println("ID: "+getVehicleId());
        System.out.println("Color: "+getColor());
        System.out.println("Odometer: "+getOdometer());
        System.out.println("Price: "+getPrice());
    System.out.println("-----------------------------");
    }



    public static void listVehicles (Vehicle[] _cars, int _numCars){
        for (int i = 0; i < _numCars; i++) {
            _cars[i].printInfo();
        }
    }






    public static void searchMakeModel(Vehicle[] _cars, int _numCars){
        boolean found = false;
        System.out.println("enter make/model to search.");
        String userMakeModel = scanner.nextLine();
        for (int i = 0; i < _numCars; i++) {
            if (_cars[i].getMakeModel().equalsIgnoreCase(userMakeModel)) {
                _cars[i].printInfo();
                found = true;
            }

        }
        if (!found){
            System.out.println("\nCar not found");
        }
    }








    public static void searchPriceRange(Vehicle[] _cars, int _numCars) {
        boolean found = false;
        System.out.println("enter the price range.\nStarting amount:");
        long range1 = scanner.nextLong();
        scanner.nextLine();
        System.out.println("ending amount: ");
        long range2 = scanner.nextLong();
        scanner.nextLine();
        for (int i = 0; i < _numCars; i++) {
            if (_cars[i].getPrice() >= range1 && _cars[i].getPrice() <= range2) {
                _cars[i].printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("\nNo cars in range of " + range1 + "-" + range2);
        }
    }














    public static void searchByColor(Vehicle[] _cars, int _numCars){
        boolean found = false;
        System.out.println("Enter color of car: ");
        String userSearchColor = scanner.nextLine();
        for (int i = 0; i < _numCars; i++) {
            if (_cars[i].getColor().equalsIgnoreCase(userSearchColor)){
                _cars[i].printInfo();
                found = true;
            }

        }
        if (!found){
            System.out.println("\nNo cars found with the color " + userSearchColor);
        }
    }

    public static int addVehicle(Vehicle[] _cars, int _numCars) {
        if (_numCars >= _cars.length) {
            System.out.println("The max of 20 cars has already been reached!");
            return _numCars;
        }

        System.out.println("enter vehicle id: ");
        long userCarId = scanner.nextLong();
        scanner.nextLine();

        System.out.println("enter vehicle make/model: ");
        String userCarMakeModel = scanner.nextLine();

        System.out.println("enter vehicle color: ");
        String userColorCar = scanner.nextLine();

        System.out.println("enter vehicle odometer: ");
        int userOdo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter vehicle price: ");
        float userPrice = scanner.nextFloat();
        scanner.nextLine();
        _cars[_numCars] = new Vehicle(userCarId, userCarMakeModel, userColorCar, userOdo, userPrice);
        _numCars++;

        System.out.println("the vehicle has been added.");
        return _numCars;
    }
}
