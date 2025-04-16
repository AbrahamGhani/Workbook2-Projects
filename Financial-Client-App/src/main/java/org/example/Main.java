package org.example;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
/// Financial client app exercise
        Client[] clients = {
                new Client("Abraham", "Ghani", "Colder Inc.", "aghani@colderincorparated.com", "860-999-9999"),

                new Client("Marq", "Alejandro", "MarK The QT LLC", "MarQT@QTLLC.com", "544-999-9999"),

                new Client("Kevin", "Gagante", "We Getting Colder LLP", "ColdKevin@wegettingcolder.com", "699-999-9999")
        };
        Product[] products ={
                new Product(11341,"Cold\uD83E\uDD76 Choco",221,3.99)
        };
   //     getUserChoice(clients);

 //       scanner.close();

        String input = "111|Hot Chocolate (12-count)|21|4.99";

        Product p2 = splitLineOfProduct(input);

        p2.printTotalValue();

        products[0].printTotalValue();

//        clients[0].printClientInfo();
//        clients[1].printClientInfo();
//        clients[2].printClientInfo();

        // Loops are great for lists
//int amountOfClients = clients.length;
//// ============ doing this is faster for the code. so assigning length to a var first improves performance and readability ============
//String formattedName; // so declaring this first makes the for loop faster
//        for (int i = 0; i < amountOfClients; i++) {
//            formattedName = clients[i].getFormattedName();
//            System.out.println("Client " + (i+1) + ": " + formattedName);
//            clients[i].printClientInfo();
//
//        }
//
//
//        for (int i = 0; i < amountOfClients; i++) {
//            clients[i].getEmail();
//        }






    }//Main\

    //=================Get product details from string and return it as a new product=======================
    public static Product splitLineOfProduct(String _input){
        String[] tokens = _input.split(Pattern.quote("|"));
        int id = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);
        return new Product(id,name,quantity,price);
    }

//==================================================================================//
    public static void getUserChoice(Client[] clients) {
        int userChoice = 0;
        int numClients = clients.length;
        while (userChoice != 3) {
            System.out.println("What would you like to do?\n1. Display all business names\n2." +
                    " Display all client emails\n3. Exit");
            userChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (userChoice) {
                case 1:
                    showBusinessNames(clients);
                    break;

                case 2:
                    showEmailAddresses(clients);
                    break;

                case 3:
                    System.out.println("Exiting... \nGoodbye!");
                    break;

                default:
                    System.out.println("Invalid Entry");


//            if (userChoice == 1){
//                for (int i = 0; i < numClients; i++) {
//                    clients[i].getBusiness();
//                }
//            }
//            else if (userChoice == 2) {
//                for (int i = 0; i < numClients; i++) {
//                    clients[i].getEmail();
//                }
//            }
//            else if (userChoice == 3){
//                System.out.println("Exiting... \nGoodbye!");
//            }
//            else {
//                System.out.println("Invalid Entry");
//            }

            }
            System.out.println();
        }
    }
//==================================================================================//

//==================================================================================//
        public static void showBusinessNames (Client[] clients){
            System.out.println("📋 Registered Businesses:");
            for (int i = 0; i < clients.length; i++) {
                // Print the formatted name (defined in the Client class)
                System.out.println(i + ". " + clients[i].getFormattedName());
            }
        }
//==================================================================================//

//==================================================================================//
        public static void showEmailAddresses (Client[] clients){
            System.out.println("📧 Client Email Addresses:");
            for (Client Client : clients) {
                // This method is defined inside the Client class
                Client.getEmail();
            }

        }
//==================================================================================//









    }//full file