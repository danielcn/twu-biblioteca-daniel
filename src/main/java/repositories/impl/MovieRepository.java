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

    @Override
    public List<Movie> getItemList() {
        Movie movie1 = new Movie();
        movie1.setName("Dejavour");
        Movie movie2 = new Movie();
        movie2.setName("Flight");
        Movie movie3 = new Movie();
        movie3.setName("Hitch");

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        return movieList;
    }

    @Override
    public boolean remove(Movie movie){
        return movieList.remove(movie);
    }
}
