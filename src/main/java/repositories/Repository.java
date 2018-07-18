package repositories;

import domain.Book;
import domain.Movie;
import domain.User;

import java.util.List;

public interface Repository<T> {

    void add(T item);

    List<T> getItemList();

    boolean remove(T item);

    User findById(String libraryNumber);
}
