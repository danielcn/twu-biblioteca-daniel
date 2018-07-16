package com.twu.biblioteca.domain;

import java.util.Objects;

public class User {

    public String name;
    public String email;
    public String address;
    public String phoneNumber;
    private String libraryNumber; // xxx-xxxx
    private int password;

    public User(String libraryNumber, int password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public User(String name, String email, String addres, String phoneNumber, String libraryNumber, int password) {
        this.name = name;
        this.email = email;
        this.address = addres;
        this.phoneNumber = phoneNumber;
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
