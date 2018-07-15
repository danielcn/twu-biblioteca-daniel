package com.twu.biblioteca.main;

import com.twu.biblioteca.domain.Book;
import com.twu.biblioteca.domain.Movie;
import com.twu.biblioteca.main.Library;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void testGetMovieList(){
        List<Movie> actualMovieList = library.getMovieList();

        Movie movie1 = new Movie();
        movie1.setName("Dejavour");
        Movie movie2 = new Movie();
        movie2.setName("Flight");
        Movie movie3 = new Movie();
        movie3.setName("Hitch");

        List<Movie> expectedMovies = Arrays.asList(movie1, movie2, movie3);

        assertArrayEquals(expectedMovies.toArray(), actualMovieList.toArray());
    }

    @Test
    public void testCheckouMovie(){
        Movie movie = new Movie();
        movie.setName("Dejavour");
        assertTrue(library.checkOutMovie(movie));
    }
}
