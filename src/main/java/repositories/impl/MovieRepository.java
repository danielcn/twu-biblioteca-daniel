package repositories.impl;

import domain.Movie;
import repositories.Repository;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements Repository<Movie> {

    List<Movie> movieList = new ArrayList<Movie>();

    @Override
    public void add(Movie movie) {
        movieList.add(movie);
    }
}
