package com.twu.biblioteca.domain;

import java.util.Objects;

public class User {

    private String libraryNumber; // xxx-xxxx
    private int password;

    public User(String libraryNumber, int password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return password == user.password &&
                Objects.equals(libraryNumber, user.libraryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libraryNumber, password);
    }
}
