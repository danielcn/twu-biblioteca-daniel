package com.twu.biblioteca;

import sun.tools.tree.ShiftRightExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Book {

    private String bookName;

    public Book(){

    }

    public Book(String bookName){
        this.bookName = bookName;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

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
