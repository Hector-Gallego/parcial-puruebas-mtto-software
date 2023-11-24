package com.mundopelis.mundopelis.services.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mundopelis.mundopelis.model.Actor;
import com.mundopelis.mundopelis.model.Director;
import com.mundopelis.mundopelis.model.Genre;
import com.mundopelis.mundopelis.model.Movie;
import com.mundopelis.mundopelis.repository.MovieRepository;
import com.mundopelis.mundopelis.services.interfaces.IActorService;
import com.mundopelis.mundopelis.services.interfaces.IDirectorService;
import com.mundopelis.mundopelis.services.interfaces.IGenreService;
import com.mundopelis.mundopelis.services.interfaces.IMovieService;

@Service
public class MovieServiceImpl implements IMovieService {

    private final MovieRepository movieRepository;
    private final IActorService actorService;
    private final IGenreService genreService;
    private final IDirectorService directorService;

    

    public MovieServiceImpl(MovieRepository movieRepository, IActorService actorService, IGenreService genreService,
            IDirectorService directorService) {
        this.movieRepository = movieRepository;
        this.actorService = actorService;
        this.genreService = genreService;
        this.directorService = directorService;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Movie getByname(String name) {
        return movieRepository.findByName(name).orElseThrow(() -> new NoSuchElementException("No se encontro la pelicula: "+ name));
    }

    @Override
    @Transactional(readOnly = true)
    public Movie getById(Long id) {
        return movieRepository.findById(id).orElseThrow(() -> new NoSuchElementException("No se encontro la pelicula: " +id));
    }

    @Override
    @Transactional
    public Movie create(Movie movie) {

        List<Long> actorIds = movie.getActors().stream()
                .map(Actor::getId)
                .collect(Collectors.toList());

        List<Actor> actors = actorService.getAllByIds(actorIds);
        movie.setActors(actors);

        List<Long> genresId = movie.getGenres().stream()
                .map(Genre::getId)
                .collect(Collectors.toList());

        List<Genre> genres = genreService.getAllByIds(genresId);
        movie.setGenres(genres);

        Director director = directorService.getById(movie.getDirector().getId());
        movie.setDirector(director);

        return movieRepository.save(movie);
    }

    @Override
    @Transactional
    public Movie update(Movie movie, Long id) {
        Movie moviePersist = getById(id);
        BeanUtils.copyProperties(movie, moviePersist, "id");
        return create(movie);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        getById(id);
        movieRepository.deleteById(id);
    }

    @Override
    @Transactional
    public List<Movie> getAllTermSearch(String term) {
        return movieRepository.findByNameContainingIgnoreCase(term);
    }
    

}
