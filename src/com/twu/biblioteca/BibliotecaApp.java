package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public String welcomeMessage(){
        return "Welcome Message";
    }

    public void mainMenu(){
        System.out.println("Command Options: ");
        System.out.println("1: List Books");
        System.out.println("0: Quit");

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
                    System.out.println("Select a valid option!");
                    break;
            }
        } while (choice != 0);
    }

    public ArrayList<Book> getBookList() {

        ArrayList<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setBookName("Harry Potter");
        Book book2 = new Book();
        book1.setBookName("More and better");
        Book book3 = new Book();
        book3.setBookName("The Alice's Life");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }

    public void startApp(){
        System.out.println(welcomeMessage());
        mainMenu();
    }

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();
        bibliotecaApp.startApp();
    }
}
