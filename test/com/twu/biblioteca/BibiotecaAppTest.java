package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibiotecaAppTest {

    private BibliotecaApp bibliotecaApp;

    @Test
    public void testWelcomeMessage() {
        bibliotecaApp = new BibliotecaApp();
        String welcome =  bibliotecaApp.welcomeMessage();
        assertEquals("Welcome Message", welcome);
    }

    @Test
    public void testGetBookList(){
        bibliotecaApp = new BibliotecaApp();
        List<Book> actualBookList =  bibliotecaApp.getBookList();
        List<Book> expectedBookList = Arrays.asList(new Book("Harry Potter"), new Book("More and better"), new Book("The Alice's Life"));
        assertArrayEquals(expectedBookList.toArray(), actualBookList.toArray());
    }

    @Test
    public void testCheckOutBook(){
        bibliotecaApp = new BibliotecaApp();

        Book book = new Book();
        book.setBookName("Harry Potter"); //it works if is equal or greater than second element

        assertTrue(bibliotecaApp.checkOutBook(book));
    }

    @Test
    public void testReturnBook(){
        bibliotecaApp = new BibliotecaApp();

        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);

        assertEquals(bookExpected, bookActual);
    }

    @Test
    public void testReturnBookSuccessful(){
        bibliotecaApp = new BibliotecaApp();

        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);
        if(bookActual != null) {
            String sucessBookReturnMessage =  bibliotecaApp.successfulBookReturn();
            assertEquals("Thank you for returning the book.", sucessBookReturnMessage);
        }
    }

    @Test
    public void testReturnBookUnsuccessful(){
        bibliotecaApp = new BibliotecaApp();

        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);
        if(bookActual != null) {
            String unsucessBookReturnMessage =  bibliotecaApp.unsuccessfulBookReturn();
            assertEquals("That is not a valid book to return.", unsucessBookReturnMessage);
        }
    }
}
