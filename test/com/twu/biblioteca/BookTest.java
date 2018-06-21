package com.twu.biblioteca;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Test
    public void testBookList(){
        book =  new Book();
        List<String> expepected = Arrays.asList("book 1","book 2", "book 3");
        assertEquals(expepected, book.getBookList());
    }
}
