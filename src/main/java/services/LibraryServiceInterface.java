package services;

import domain.Book;
import domain.Movie;

import java.util.List;

public interface LibraryServiceInterface<T> {

    void addBook(Book book);

    List<Book> getBookList();

    void bookDetails(List<Book> bookList);

    Book getBook(Book book, List<Book> bookList);

    boolean checkOutBook(Book book);

    Book findBook(Book book);

    void addMovie(Movie movie);

    List<Movie> getMovieList();

    boolean checkOutMovie(Movie movie);

    Movie getMovie(Movie movie, List<Movie> movieList);
}
