package services.impl;

import domain.Book;
import domain.Library;
import domain.Movie;
import domain.User;
import repositories.impl.BookRepository;
import repositories.impl.MovieRepository;
import repositories.impl.UserRepository;
import services.LibraryServiceInterface;

import java.util.List;

public class LibraryService implements LibraryServiceInterface<Library> {

    private BookRepository bookRepository;
    private MovieRepository movieRepository;
    private UserRepository userRepository;
    private User user;

    public LibraryService(){
        this.bookRepository = new BookRepository();
        this.movieRepository = new MovieRepository();
        this.userRepository = new UserRepository();
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

    public boolean userIsLogged(String libraryNumber) {
        User userCurrent = userRepository.findById(libraryNumber);

        boolean userIsLogged = false;
        if(userCurrent != null){
            userIsLogged = true;
            return userIsLogged;
        }
        return userIsLogged;
    }

    public User getUserInformation(String libraryNumber) {
        //remove attributes password and library to user or call specific informations from user
        User user =  userRepository.findById(libraryNumber);
        return user;
    }
}
