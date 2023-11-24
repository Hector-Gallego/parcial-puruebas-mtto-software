package com.mundopelis.mundopelis.services.interfaces;

import java.util.List;


import com.mundopelis.mundopelis.model.Movie;

public interface IMovieService {

    List<Movie> getAll();
    List<Movie> getAllTermSearch(String term);
    Movie getByname(String name);
    Movie getById(Long id);
    Movie create(Movie movie);
    Movie update(Movie movie, Long id);
    void deleteById(Long id);
    
}
