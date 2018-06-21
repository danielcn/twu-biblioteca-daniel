package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public String welcomeMessage(){
        return "Welcome Message";
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
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
}
