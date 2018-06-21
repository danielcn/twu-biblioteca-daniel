package com.twu.biblioteca;

import sun.tools.tree.ShiftRightExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
