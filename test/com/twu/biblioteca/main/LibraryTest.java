package com.twu.biblioteca.main;

import com.twu.biblioteca.domain.Book;
import com.twu.biblioteca.main.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library library;

    @Before
    public void setUp(){
        library = new Library();
    }

    @Test
    public void testGetBookList(){
        List<Book> actualBookList =  library.getBookList();
        List<Book> expectedBookList = Arrays.asList(new Book("Harry Potter"), new Book("More and better"), new Book("The Alice's Life"));
        assertArrayEquals(expectedBookList.toArray(), actualBookList.toArray());
    }


    @Test
    public void testCheckOutBook(){
        Book book = new Book();
        book.setBookName("Harry Potter"); //it works if is equal or greater than second element
        assertTrue(library.checkOutBook(book));
    }
}
