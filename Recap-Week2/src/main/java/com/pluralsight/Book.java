package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
static Scanner scanner = new Scanner(System.in);
    // Author, title, tableOfContent, Genre, ISBN
    private String title;
    private String author;
    private String tableOfContent;
    private int pageNumber;
    private String Genre;
    private String ISBN;
    private int publishingYear;
    private boolean isCheckedOut;
    private String checkedOutTo;


//Create a constructor with title, author and isbn.

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTableOfContent() {
        return tableOfContent;
    }

    public void setTableOfContent(String tableOfContent) {
        this.tableOfContent = tableOfContent;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {

        if (pageNumber <= 0) {
            throw new IllegalArgumentException("page number should be greater then 0.");
        }
        this.pageNumber = pageNumber;

    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void displayBookDetails(){
        System.out.println("-------------------------------------------");
        System.out.println("Title: " + getTitle());
        System.out.println("Genre: " + getGenre());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publishing Year: " + getPublishingYear());
        System.out.println("Number of Pages: " + getPageNumber());
        System.out.println("Table of Contents: " + getTableOfContent());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Currently Checked Out: " + isCheckedOut());
        System.out.println("-------------------------------------------\n");
    }

public void checkOut(String _name){
        if (!isCheckedOut){
            setCheckedOutTo(_name);
            System.out.println("Checking out the book \"" + getTitle() + "\" under the name " + getCheckedOutTo());
            setCheckedOut(true);

        }
        else {
            System.out.println("The book \"" + getTitle() + "\" is currently checked out");
        }

}

public void checkIn(){
        if (isCheckedOut){
            setCheckedOut(false);
            setCheckedOutTo("");
            System.out.println("Book \"" + getTitle() + "\" has been returned");
        }
        else {
            System.out.println("Cannot return a book that was not checked out.");
        }

}





    public static void getAvailableBooks(List<Book> bookList){
        System.out.println("Available Books: ");
        for (Book book : bookList){
            if (!book.isCheckedOut()){
                book.displayBookDetails();
            }

        }

    }

    public static void availableBookMenu(List<Book> bookList){
        boolean availableMenu = true;
        do {
            Book.getAvailableBooks(bookList);
            System.out.println("C - Check out a book\nX - Exit back to main menu");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("C")) {
                Book.checkOutBook(bookList);
            } else if (userChoice.equalsIgnoreCase("X")) {
                System.out.println("Going back to main menu...");
                availableMenu = false;
            } else {
                System.out.println("Invalid entry");
            }
        }while (availableMenu);
    }


    public static void getUnavailableBooks(List<Book> bookList){
        System.out.println("Unavailable Books: ");
        for (Book book : bookList){
            if (book.isCheckedOut()){
                book.displayBookDetails();
            }

        }
    }

    public static void unavailableBookMenu(List<Book> bookList){
        boolean unavailableMenu = true;
        do {
            Book.getUnavailableBooks(bookList);
            System.out.println("C - Check in a book\nX - Exit back to main menu");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("C")) {
                Book.checkInBook(bookList);
            }
            else if (userChoice.equalsIgnoreCase("X")){
                System.out.println("Going back to main menu...");
                unavailableMenu = false;
            }
            else {
                System.out.println("Invalid entry");
            }
        }while (unavailableMenu);
    }



    public static void checkInBook(List<Book> bookList){
        System.out.println("What book do you want to check in?");
        String userBook = scanner.nextLine();
        boolean bookFound = false;
        userBook = userBook.toLowerCase();
        for (Book book : bookList){
            if (book.getTitle().toLowerCase().contains(userBook)) {
                book.checkIn();
                bookFound = true;
                return;
            }
        }
        if (!bookFound){
            System.out.println("Book not found.");
        }
    }
    public static void checkOutBook(List<Book> bookList){
        System.out.println("What book do you want to check out?");
        String userBook = scanner.nextLine();
        System.out.println("What is your name?");
        String userName = scanner.nextLine();
        boolean bookFound = false;
        userBook = userBook.toLowerCase();
        for (Book book : bookList){
            if (book.getTitle().toLowerCase().contains(userBook)) {
                book.checkOut(userName);
                bookFound = true;
                break;
            }
        }
        if (!bookFound){
            System.out.println("Book not found.");
        }
    }






}
