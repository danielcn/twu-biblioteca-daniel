package biblioteca.main;

import java.util.List;

public class Library {

//    private List<Book> bookList;
//    private List<Movie> movieList;
//    private User user;
//
//    Library(){
//        this.bookList = new ArrayList<Book>();
//        this.movieList = new ArrayList<Movie>();
//        this.user = new User("Daniel",
//                "dnasciment@tw.com",
//                "Operários Street, n 03",
//                "99888-7766",
//                "xxx-xxxx",
//                123456
//        );
//    }
//
//    public List<Book> getBookList() {
//        Book book1 = new Book();
//        book1.setBookName("Harry Potter");
//        Book book2 = new Book();
//        book2.setBookName("More and better");
//        Book book3 = new Book();
//        book3.setBookName("The Alice's Life");
//
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
//
//        return bookList;
//    }
//
//    public void bookDetails(List<Book> bookList){
//        String headList = "Name | Author | Year of Published";
//        //logMessage(headList);
//        for (int i = 0; i < bookList.size(); i++) {
//            System.out.print(bookList.get(i).getBookName());
//            System.out.print("| " + bookList.get(i).getAuthor());
//            System.out.print("| " + bookList.get(i).getYearPublished());
//            System.out.println("\n");
//        }
//    }
//
//    private Book getBook(Book book, List<Book> bookList) {
//        return bookList.stream()
//                .filter(b -> b.equals(book))
//                .findFirst()
//                .get();
//    }
//
//    public boolean checkOutBook(Book book){
//        List<Book> bookList = this.getBookList();
//        Book currentBook = getBook(book, bookList);
//        return bookList.remove(currentBook);
//    }
//
//    public Book findBook(Book book) {
//        List<Book> bookList = this.getBookList();
//        Book currentBook = getBook(book,bookList);
//        return currentBook;
//    }
//
//    public List<Movie> getMovieList() {
//        Movie movie1 = new Movie();
//        movie1.setName("Dejavour");
//        Movie movie2 = new Movie();
//        movie2.setName("Flight");
//        Movie movie3 = new Movie();
//        movie3.setName("Hitch");
//
//        movieList.add(movie1);
//        movieList.add(movie2);
//        movieList.add(movie3);
//
//        return movieList;
//    }
//
//    public boolean checkOutMovie(Movie movie) {
//        List<Movie> movieList = this.getMovieList();
//        Movie movieCurrent = getMovie(movie, movieList);
//        return movieList.remove(movieCurrent);
//    }
//
//    private Movie getMovie(Movie movie, List<Movie> movieList) {
//        return movieList.stream()
//                .filter(m -> m.equals(movie))
//                .findFirst()
//                .get();
//    }
//
//    public boolean userIsLogged(User user) {
//        boolean userIsLogged = false;
//        if(user.equals(this.user)){
//            userIsLogged = true;
//            return userIsLogged;
//        }
//        return userIsLogged;
//    }
//
//    public User getUserInformation() {
//        return this.user;
//    }
}
