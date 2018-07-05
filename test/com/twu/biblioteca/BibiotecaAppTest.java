package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BibiotecaAppTest {

    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp(){
        bibliotecaApp = new BibliotecaApp();
    }

    @Test
    public void testWelcomeMessage() {
        String welcome =  bibliotecaApp.welcomeMessage();
        assertEquals("Welcome Message", welcome);
    }

    @Test
    public void testGetBookList(){
        List<Book> actualBookList =  bibliotecaApp.getBookList();
        List<Book> expectedBookList = Arrays.asList(new Book("Harry Potter"), new Book("More and better"), new Book("The Alice's Life"));
        assertArrayEquals(expectedBookList.toArray(), actualBookList.toArray());
    }

    @Test
    public void testCheckOutBook(){
        Book book = new Book();
        book.setBookName("Harry Potter"); //it works if is equal or greater than second element
        assertTrue(bibliotecaApp.checkOutBook(book));
    }

    @Test
    public void testReturnBook(){
        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);
        assertEquals(bookExpected, bookActual);
    }

    @Test
    public void testReturnBookSuccessful(){
        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);
        if(bookActual != null) {
            String sucessBookReturnMessage =  bibliotecaApp.successfulBookReturn();
            assertEquals("Thank you for returning the book.", sucessBookReturnMessage);
        }
    }

    @Test
    public void testReturnBookUnsuccessful(){
        Book bookExpected = new Book("Harry Potter");
        Book bookActual = bibliotecaApp.returnBook(bookExpected);
        if(bookActual != null) {
            String unsucessBookReturnMessage =  bibliotecaApp.unsuccessfulBookReturn();
            assertEquals("That is not a valid book to return.", unsucessBookReturnMessage);
        }
    }
}
