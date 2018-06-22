package com.twu.biblioteca;

import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.BlockingDeque;

public class BibliotecaApp {

    private ArrayList<Book> bookList;

    BibliotecaApp(){
        this.bookList = new ArrayList<Book>();
    }

    public void logMessage(String message){
        System.out.println(message);
    }

    public String welcomeMessage() {
        String welcomeMessage = "Welcome Message";
        return welcomeMessage;
    }

    public void bookDetails(List<Book> bookList){
        String headList = "Name | Author | Year of Published";
        logMessage(headList);
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).getBookName());
            System.out.print("| " + bookList.get(i).getAuthor());
            System.out.print("| " + bookList.get(i).getYearPublished());
            System.out.println("\n");
        }
    }

    public void mainMenu(){
        logMessage("Command Options: ");
        logMessage("1: List Books");
        logMessage("0: Quit");

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    this.getBookList();
                    break;
                case 0:
                    break;
                default:
                    logMessage("Select a valid option!");
                    break;
            }
        } while (choice != 0);
    }

    public List<Book> getBookList() {

        Book book1 = new Book();
        book1.setBookName("Harry Potter");
        Book book2 = new Book();
        book2.setBookName("More and better");
        Book book3 = new Book();
        book3.setBookName("The Alice's Life");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }

    public boolean checkOutBook(Book book){

        List<Book> bookList = getBookList();

        while (bookList.iterator().hasNext()) {
            Book currentBook = bookList.iterator().next();
            System.out.println(currentBook);
            if(currentBook.equals(book)){
                return bookList.remove(currentBook);
            }
        }
        return false;
    }

    public void startApp(){
        String welcomeMessage = welcomeMessage();
        logMessage(welcomeMessage);
        mainMenu();
        //successfulCheckout();
    }

    public String successfulCheckout() {
        String sussefulBookRemoved = "Thank you! Enjoy the book.";
        return sussefulBookRemoved;
    }

    public String unsucessulCheckout(){
        String unsucessfulBookRemoved = "That book is not available.";
        return unsucessfulBookRemoved;
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.startApp();
    }
}
