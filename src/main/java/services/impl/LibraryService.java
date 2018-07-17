package services.impl;

import domain.Book;
import domain.Library;
import domain.Movie;
import domain.User;
import services.LibraryServiceInterface;

import java.util.ArrayList;
import java.util.List;

public class LibraryService implements LibraryServiceInterface<Library> {

    private List<Movie> movieList;
    private List<Book> bookList;
    private User user;

    public LibraryService(){
        this.bookList = new ArrayList<Book>();
        this.movieList = new ArrayList<Movie>();
        this.user = new User("Daniel",
                "dnasciment@tw.com",
                "Operários Street, n 03",
                "99888-7766",
                "xxx-xxxx",
                123456
        );
    }

    @Override
    public List<Book> getBookList() {
        Book book1 = new Book();
        book1.setBookName("Harry Potter");
        Book book2 = new Book();
        book2.setBookName("More and better");
        Book book3 = new Book();
        book3.setBookName("The Alice's Life");

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
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
        return bookList.remove(currentBook);
    }

    @Override
    public Book findBook(Book book) {
        List<Book> bookList = this.getBookList();
        Book currentBook = getBook(book,bookList);
        return currentBook;
    }

    @Override
    public List<Movie> getMovieList() {
        Movie movie1 = new Movie();
        movie1.setName("Dejavour");
        Movie movie2 = new Movie();
        movie2.setName("Flight");
        Movie movie3 = new Movie();
        movie3.setName("Hitch");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        return movieList;
    }

    @Override
    public boolean checkOutMovie(Movie movie) {
        List<Movie> movieList = this.getMovieList();
        Movie movieCurrent = getMovie(movie, movieList);
        return movieList.remove(movieCurrent);
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
