package domain;

import java.util.Objects;

public class Book {

    private String bookName;
    private String author;
    private String yearPublished;

    public Book(){
    }

    public Book(String bookName){
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) { this.bookName = bookName; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getYearPublished() { return yearPublished; }

    public void setYearPublished(String yearPublished) { this.yearPublished = yearPublished; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
