package org.example;
import com.pluralsight.CellPhone;
import java.util.*;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


///////////////////////////////////---- Exercise 1 ----///////////////////////////////////

CellPhone phone = new CellPhone();
CellPhone phone2 = new CellPhone();
phone2.setOwner("jeff");
phone2.setPhoneNumber("860-012-1234");

        System.out.println("Serial #: ");
        phone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Model: ");
        phone.setModel(scanner.nextLine());

        System.out.println("Carrier: ");
        phone.setCarrier(scanner.nextLine());

        System.out.println("Phone #: ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("Owner: ");
        phone.setOwner(scanner.nextLine());

printInfo(phone);

///////////////////////////////////---- Exercise 2 ----///////////////////////////////////

phone.dial(phone2.getPhoneNumber());

printInfo(phone2);


    }

    public static void printInfo(CellPhone _phone){
        System.out.println(String.format("%s\n%s\n%s\n%s\n%s", _phone.getSerialNumber(), _phone.getModel(), _phone.getCarrier(),
                _phone.getPhoneNumber(), _phone.getOwner()));
    }



}