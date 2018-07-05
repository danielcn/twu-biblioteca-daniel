package com.twu.biblioteca.main;

import com.twu.biblioteca.domain.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> bookList;

    Library(){
        this.bookList = new ArrayList<Book>();
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

    public boolean checkOutBook(Book book){
        List<Book> bookList = this.getBookList();

        while (bookList.iterator().hasNext()) {
            Book currentBook = bookList.iterator().next();
            if(currentBook.equals(book)){
                return bookList.remove(currentBook);
            }
        }
        return false;
    }

    public Book returnBook(Book book) {
        List<Book> bookList = this.getBookList();

        while (bookList.iterator().hasNext()) {
            Book currentBook = bookList.iterator().next();
            if(currentBook.equals(book)){
                return currentBook;
            }
        }
        return null;
    }
}
