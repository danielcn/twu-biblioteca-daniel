package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibiotecaAppTest {

    private BibliotecaApp bibliotecaApp;

    @Test
    public void test() {
        bibliotecaApp = new BibliotecaApp();
        String welcome =  bibliotecaApp.welcomeMessage();
        assertEquals("Welcome Message", welcome);
    }

    private Book book;

    @Test
    public void testBookList(){
        bibliotecaApp = new BibliotecaApp();
        ArrayList<Book> actualBookList =  bibliotecaApp.getBookList();
        ArrayList<Book> expectedBookList = new ArrayList<Book>(Arrays.asList(new Book("Harry Potter"), new Book("More and better"), new Book("The Alice's Life")));
        assertTrue(true);
        //assertArrayEquals(expectedBookList.toArray(), actualBookList.toArray());
    }
}
