package org.example;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Product products = new Product();

    
    public static void main(String[] args) {

/// Financial client app exercise
        Client[] clients = {
                new Client("Abraham", "Ghani", "Colder Inc.", "aghani@colderincorparated.com", "860-999-9999"),

                new Client("Marq", "Alejandro", "MarK The QT LLC", "MarQT@QTLLC.com", "544-999-9999"),

                new Client("Kevin", "Gagante", "We Getting Colder LLP", "ColdKevin@wegettingcolder.com", "699-999-9999")
        };

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



getUserChoice(clients);

        scanner.close();



    }//Main


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