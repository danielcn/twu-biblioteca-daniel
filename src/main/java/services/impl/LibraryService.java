package services.impl;

import domain.Book;
import domain.Library;
import domain.Movie;
import domain.User;
import repositories.impl.BookRepository;
import repositories.impl.MovieRepository;
import services.LibraryServiceInterface;

import java.util.ArrayList;
import java.util.List;

public class LibraryService implements LibraryServiceInterface<Library> {

    private BookRepository bookRepository;
    private MovieRepository movieRepository;
    private User user;

    public LibraryService(){
        this.bookRepository = new BookRepository();
        this.movieRepository = new MovieRepository();
        this.user = new User("Daniel",
                "dnasciment@tw.com",
                "Operários Street, n 03",
                "99888-7766",
                "xxx-xxxx",
                123456
        );
    }

    @Override
    public void addBook(Book book) {
        bookRepository.add(book);
    }

    @Override
    public List<Book> getBookList() {
        return bookRepository.getItemList();
    }

    @Override
    public void bookDetails(List<Book> bookList){
        String headList = "Name | Author | Year of Published";
        //logMessage(headList);
        for (int i = 0; i < bookList.size(); i++) {
            System.out.print(bookList.get(i).getBookName());
            System.out.print("| " + bookList.get(i).getAuthor());
            System.out.print("| " + bookList.get(i).getYearPublished());
            System.out.println("\n");
        }
    }

    @Override
    public Book getBook(Book book, List<Book> bookList) {
        return bookList.stream()
                .filter(b -> b.equals(book))
                .findFirst()
                .get();
    }

    @Override
    public boolean checkOutBook(Book book){
        List<Book> bookList = this.getBookList();
        Book currentBook = getBook(book, bookList);
        return bookRepository.remove(currentBook);
    }

    @Override
    public Book findBook(Book book) {
        List<Book> bookList = this.getBookList();
        Book currentBook = getBook(book,bookList);
        return currentBook;
    }

    @Override
    public void addMovie(Movie movie){
        movieRepository.add(movie);
    }

    @Override
    public List<Movie> getMovieList() {
        return movieRepository.getItemList();
    }

    @Override
    public boolean checkOutMovie(Movie movie) {
        List<Movie> movieList = this.getMovieList();
        Movie movieCurrent = getMovie(movie, movieList);
        return movieRepository.remove(movieCurrent);
    }

    @Override
    public Movie getMovie(Movie movie, List<Movie> movieList) {
        return movieList.stream()
                .filter(m -> m.equals(movie))
                .findFirst()
                .get();
    }

    public boolean userIsLogged(User user) {
        boolean userIsLogged = false;
        if(user.equals(this.user)){
            userIsLogged = true;
            return userIsLogged;
        }
        return userIsLogged;
    }

    public User getUserInformation() {
        return this.user;
    }
}
