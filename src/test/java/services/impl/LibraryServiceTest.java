package services.impl;

import domain.Book;
import domain.Movie;
import domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class LibraryServiceTest {

    private LibraryService libraryService;

    @Before
    public void setUp(){
        libraryService = new LibraryService();
    }

    @Test
    public void testGetBookList(){
        List<Book> actualBookList =  libraryService.getBookList();
        List<Book> expectedBookList = Arrays.asList(new Book("Harry Potter"), new Book("More and better"), new Book("The Alice's Life"));
        assertArrayEquals(expectedBookList.toArray(), actualBookList.toArray());
    }

    @Test
    public void testCheckOutBook(){
        Book book = new Book();
        book.setBookName("Harry Potter");
        assertTrue(libraryService.checkOutBook(book));
    }

    @Test
    public void testGetMovieList(){
        List<Movie> expectedMovieList = Arrays.asList(new Movie("Dejavour"), new Movie("Flight"), new Movie("Hitch"));
        List<Movie> actualMovieList = libraryService.getMovieList();
        assertArrayEquals(expectedMovieList.toArray(), actualMovieList.toArray());
    }

    @Test
    public void testCheckouMovie(){
        Movie movie = new Movie();
        movie.setName("Dejavour");
        assertTrue(libraryService.checkOutMovie(movie));
    }

    @Test
    public void testUserIsLogged(){
        User user = new User("xxx-xxxx", 123456);
        assertTrue(libraryService.userIsLogged(user.getLibraryNumber()));
    }

    @Test
    public void testGetUserInformation(){

        User expectedUser = new User("xxx-xxx", 123456);
        expectedUser.setName("Daniel");
        expectedUser.setEmail("dnasciment@tw.com");
        expectedUser.setAddress("Operários Street, n 03");
        expectedUser.setPhoneNumber("99888-7766");

        String libraryNumber = "xxx-xxxx";
        User actualUser = libraryService.getUserInformation(libraryNumber);
        assertSame(expectedUser.getName(), actualUser.getName());
        assertSame(expectedUser.getEmail(), actualUser.getEmail());
        assertSame(expectedUser.getAddress(), actualUser.getAddress());
        assertSame(expectedUser.getPhoneNumber(), actualUser.getPhoneNumber());
    }
}
