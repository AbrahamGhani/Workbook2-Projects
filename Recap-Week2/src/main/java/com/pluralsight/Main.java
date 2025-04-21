package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Create an arraylist of Books
        List<Book> bookList = new ArrayList<>();


        Book book3 = new Book("Fahrenheit 451", "Ray Bradbury", "978-1451673319");
        Book book4 = new Book("1984", "George Orwell", "978-0451524935");
        Book book5 = new Book("Things Fall Apart", "Chinua Achebe", "978-0385474542");
        Book book6 = new Book("Mushoku Tensei: Jobless Reincarnation Vol. 1", "Rifujin na Magonote", "978-1642751383");
        Book book7 = new Book("Artemis Fowl", "Eoin Colfer", "978-1368036986");
        Book book8 = new Book("Unbroken", "Laura Hillenbrand", "978-0812974492");
        Book book9 = new Book("Prisoner B-3087", "Alan Gratz", "978-0545459013");
        Book book10 = new Book("The Heroin Diaries", "Nikki Sixx", "978-1501187544");
        Book book11 = new Book("90 Rules for Entrepreneurs", "Marnus Broodryk", "978-0620758352");
        Book book12 = new Book("The 48 Laws of Power", "Robert Greene", "978-0140280197");
        Book book13 = new Book("Ender's Game", "Orson Scott Card", "978-0812550702");
        Book book14 = new Book("The Prince", "Niccolò Machiavelli", "978-1668506448");
        Book book15 = new Book("Disruptive Thinking", "T.D. Jakes", "978-1546004004");
        bookList.add(new Book("The Three-Body Problem", "Cixin Liu", "978-0765382030"));
        bookList.add(new Book("Atomic Habits", "James Clear", "978-0735211292"));
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);
        bookList.add(book11);
        bookList.add(book12);
        bookList.add(book13);
        bookList.add(book14);
        bookList.add(book15);
        bookList.add(new Book("The Beginning After the End: Vol 1","TurtleMe","978-1975345631"));
        bookList.add(new Book("Solo Leveling","Chugong","978-197 5319434"));
        bookList.add(new Book("Sakamoto Days","Yuto Suzuki","978-1974728947"));
        bookList.add(new Book("Jujutsu Kaisen","Gege Akutami","978-1974710027"));
        bookList.add(new Book("Chainsaw Man","Tatsuki Fujimoto","978-1974709939"));

//Create an array of Books
//        Book[] books = new Book[15];
//
//        books[0] = new Book("The Three-Body Problem", "Cixin Liu", "9780765382030");


//getAvailableBooks(bookList);


        startLibrary(bookList);


    }


    public static void startLibrary(List<Book> bookList) {
        boolean libraryOpen = true;
        while (libraryOpen) {
            System.out.println("1 - Show Available Books\n2 - Show Checked Out Books\n3 - Exit");
            int userDecision = scanner.nextInt();
            scanner.nextLine();
            if (userDecision == 1) {
                Book.availableBookMenu(bookList);

            } else if (userDecision == 2) {
                Book.unavailableBookMenu(bookList);

            } else if (userDecision == 3) {
                System.out.println("Exiting...");
                libraryOpen = false;
                break;
            } else {
                System.out.println("Invalid Entry");
            }
        }


    }


}