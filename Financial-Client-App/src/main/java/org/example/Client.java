package org.example;
import java.lang.reflect.Array;
import java.util.*;
public class Client {
    static Scanner scanner = new Scanner(System.in);
    // storing information - first name, last name
    // business name
    //email address
    //phone number

    private String firstName;
    private String lastName;
    private String businessName;
    private String email;
    private String phoneNumber;

    // Constructor
    public Client(String firstName, String lastName, String businessName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void printClientInfo() {
        System.out.println("Client: " + this.firstName + " " + this.lastName);
        System.out.println("Business: " + this.businessName);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("-----------------------------");
    }


    public String getFormattedName() {
        return String.format("%s, %s %s.\n", lastName, firstName, firstName.charAt(0));
    }


    public void getEmail(){
        System.out.println(this.firstName + "'s email is: " +  this.email);
    }

    public void getBusiness(){
        System.out.println("Business is: " +  this.businessName);
    }





}
