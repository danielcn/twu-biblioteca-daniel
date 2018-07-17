package repositories.impl;

import domain.Book;
import repositories.Repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository implements Repository<Book> {

    List<Book> bookList = new ArrayList<Book>();

    public void add(Book book){
        bookList.add(book);
    }

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
}
